/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge {
    static volatile int field_a;
    static String[] field_b;
    static boolean[] field_c;
    private java.util.zip.Inflater field_d;

    final void a(pb param0, int param1, byte[] param2) {
        try {
          try {
            if (param0.field_g[param0.field_i] != 31 ||
              -117 != param0.field_g[1 + param0.field_i]) {
              throw new RuntimeException("");
            }
            if (param1 != 2) {
              field_c = (boolean[]) null;
            }
            if (null == this.field_d) {
              this.field_d = new java.util.zip.Inflater(true);
            }
            try {
              this.field_d.setInput(param0.field_g, param0.field_i + 10, -18 - param0.field_i + param0.field_g.length);
              this.field_d.inflate(param2);
            } catch (Exception exception) {
              this.field_d.reset();
              throw new RuntimeException("");
            }
            this.field_d.reset();
          } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ge.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc[] param1, int param2, int param3, int param4, byte param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          if (param1 != null &&
            param0 > 0) {
            var6_int = param1[0].field_l;
            var7 = param1[2].field_l;
            if (param5 != -10) {
              ge.b((byte) 56);
            }
            var8 = param1[1].field_l;
            param1[0].a(param3, param4, param2);
            param1[2].a(param0 + param3 - var7, param4, param2);
            vj.a(sg.field_c);
            vj.f(var6_int + param3, param4, -var7 + param0 + param3, param1[1].field_k + param4);
            var9 = var6_int + param3;
            var10 = -var7 + param3 + param0;
            for (param3 = var9; var10 > param3; param3 = param3 + var8) {
              param1[1].a(param3, param4, param2);
            }
            vj.b(sg.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ge.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static jk a(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 != -23339) {
          field_b = (String[]) null;
          var1 = ij.a((byte) 114);
          if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
              var1 = "";
            }
            return new jk(ij.a((byte) 122), dg.a(0));
          }
          return new jk(ij.a((byte) 122), dg.a(0));
        }
        var1Lifetime1 = ij.a((byte) 114);
        if (var1Lifetime1 == null) {
          return new jk(ij.a((byte) 122), dg.a(0));
        }
        if (var1Lifetime1.indexOf('@') >= 0) {
          var1Lifetime1 = "";
          return new jk(ij.a((byte) 122), dg.a(0));
        }
        return new jk(ij.a((byte) 122), dg.a(0));
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = sj.field_d;
        synchronized (var1_ref) {
          if (ce.field_b == ab.field_t) {
            return false;
          }
          tb.field_d = db.field_c[ab.field_t];
          fd.field_n = e.field_b[ab.field_t];
          if (param0 != -114) {
            return false;
          }
          ab.field_t = ab.field_t + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -117) {
          kc[] var2 = (kc[]) null;
          ge.a(120, (kc[]) null, -103, -3, 58, (byte) 16);
        }
    }

    public ge() {
        this(-1, 1000000, 1000000);
    }

    private ge(int param0, int param1, int param2) {
    }

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 77) {
            stackIn_4_0 = bd.a(255, 0, param0, param0.length);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ge.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new String[]{"Cowboy", "Deputy", "Sheriff", "Mayor", "Governor", "Memory Expert", "Memory Master", "Memory Maniac", "Quickshot", "Master Quickshot", "Expert Quickshot", "Fastest Gun in the West", "Sharpshooter", "Expert Sharpshooter", "Master Sharpshooter"};
        field_c = new boolean[112];
        field_a = 0;
    }
}
