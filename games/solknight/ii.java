/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterable {
    static String field_a;
    static String field_c;
    static o[] field_g;
    private gg field_d;
    gg[] field_b;
    static o[] field_f;
    static int field_h;
    int field_e;
    static String field_i;

    public static void a(int param0) {
        if (param0 != 7903) {
          return;
        }
        field_f = null;
        field_g = null;
        field_i = null;
        field_c = null;
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new n(this));
    }

    final gg a(long param0, int param1) {
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = this.field_b[(int)((long)(this.field_e - 1) & param0)];
        this.field_d = var4.field_d;
        if (param1 >= -83) {
          ii.a(-1);
        }
        while (var4 != this.field_d) {
          if (~this.field_d.field_g == ~param0) {
            var5 = this.field_d;
            this.field_d = this.field_d.field_d;
            return var5;
          }
          this.field_d = this.field_d.field_d;
        }
        this.field_d = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 <= 125) {
          field_f = (o[]) null;
        }
        param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 1);
        param0 = (858993459 & param0) + ((-858993458 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1 < mi.field_b) {
            param4 = param4 - (mi.field_b - param1);
            param1 = mi.field_b;
          }
          if (mi.field_k < param4 + param1) {
            param4 = mi.field_k - param1;
          }
          if (mi.field_l > param2) {
            param0 = param0 - (-param2 + mi.field_l);
            param2 = mi.field_l;
          }
          if (mi.field_e < param2 + param0) {
            param0 = -param2 + mi.field_e;
          }
          if (param4 > 0 &&
            param0 > 0) {
            if (!param5) {
              return;
            }
            var6_int = param1 + param2 * mi.field_a;
            var7 = -param4 + mi.field_a;
            for (param2 = -param0; param2 < 0; param2++) {
              for (param1 = -param4; param1 < 0; param1++) {
                var8 = mi.field_f[var6_int];
                if (param3 < (255 & var8 >> 8) &&
                  (16711680 & var8) >> 16 <= (255 & var8 >> 8)) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (255 < var9) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = var8 >> 3 & 31;
                  mi.field_f[var6_int] = qk.a(var11, qk.a(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var6), "ii.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, gg param2) {
        gg var5 = null;
        try {
          if (null != param2.field_a) {
            param2.c(10);
          }
          var5 = this.field_b[(int)(param1 & (long)(-1 + this.field_e))];
          param2.field_d = var5;
          param2.field_a = var5.field_a;
          param2.field_a.field_d = param2;
          param2.field_g = param1;
          if (param0 != -858993458) {
            field_g = (o[]) null;
          }
          param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(boolean param0, int param1, dl param2, int param3, int param4, int param5) {
        int var8 = 0;
        java.awt.Frame stackIn_3_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        uj[] var10 = null;
        nj var11 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          if (!param0) {
            stackIn_3_0 = (java.awt.Frame) null;
            return stackIn_3_0;
          }
          if (!param2.b((byte) 98)) {
            return null;
          }
          if (param4 == 0) {
            var10 = dc.a((byte) 124, param2);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param5 == var10[var8].field_c &&
                param3 == var10[var8].field_d && ((param1 == 0 ||
                param1 == var10[var8].field_a) &&
                (var7_int == 0 ||
                !(var10[var8].field_e <= param4)))) {
                param4 = var10[var8].field_e;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param2.a(param5, param3, param4, (byte) -106, param1);
          while (0 == var11.field_c) {
            i.a((byte) 89, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            stackIn_36_0 = null;
            return (java.awt.Frame) (stackIn_36_0);
          }
          if (var11.field_c != 2) {
            return var7;
          }
          de.a(param2, var7, (byte) 119);
          stackIn_40_0 = null;
          return (java.awt.Frame) (stackIn_40_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = "Mega Power";
        field_c = "This entry doesn't match";
        field_i = "Aiming: Mouse";
    }
}
