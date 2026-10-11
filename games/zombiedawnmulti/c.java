/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c {
    private ff field_a;
    static Random field_c;
    private ff field_f;
    static int field_e;
    static boolean field_b;
    static String field_d;

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = f.field_a;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
          var4 = 1;
          var5 = 0;
          if (1 == param0) {
            var5 = 1;
          }
          if (param0 == 3) {
            var4 = -1;
          }
          if (param0 == 4) {
            var4 = 1;
            var5 = 1;
          }
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (6 == param0) {
            var4 = 1;
            var5 = -1;
          }
          if (param0 == 7) {
            var5 = -1;
            var4 = -1;
          } else {
            if (8 == param0) {
              var5 = -1;
              var4 = -1;
            }
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (param1 < 72) {
            return;
          }
          if (13 == param0) {
            var5 = -1;
            var4 = 1;
          }
          if (14 == param0) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 15) {
            var4 = 1;
            var5 = 1;
          }
          hl.field_c = me.a(var5 * var2, -2106461552, var2 * var4);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + var3 * 16384) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (1 == param0) {
            var5Lifetime1 = 1;
          }
          if (param0 == 3) {
            var4Lifetime1 = -1;
          }
          if (param0 == 4) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          if (param0 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (6 == param0) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param0 == 7) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          } else {
            if (8 == param0) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param1 < 72) {
            return;
          }
          if (13 == param0) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (14 == param0) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param0 == 15) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          hl.field_c = me.a(var5Lifetime1 * var2, -2106461552, var2 * var4Lifetime1);
          return;
        }
        if (120 <= var3) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (1 == param0) {
            var5Lifetime2 = 1;
          }
          if (param0 == 3) {
            var4Lifetime2 = -1;
          }
          if (param0 == 4) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          if (param0 == 5) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (6 == param0) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param0 == 7) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          } else {
            if (8 == param0) {
              var5Lifetime2 = -1;
              var4Lifetime2 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param1 < 72) {
            return;
          }
          if (13 == param0) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (14 == param0) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param0 == 15) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          hl.field_c = me.a(var5Lifetime2 * var2, -2106461552, var2 * var4Lifetime2);
          return;
        }
        var3 = 120 - var3;
        var2Lifetime1 = -(var3 * (var3 * 8192) / 3300) + 8192;
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (1 == param0) {
          var5Lifetime3 = 1;
        }
        if (param0 == 3) {
          var4Lifetime3 = -1;
        }
        if (param0 == 4) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        if (param0 == 5) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (6 == param0) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (param0 == 7) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        } else {
          if (8 == param0) {
            var5Lifetime3 = -1;
            var4Lifetime3 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        if (param1 < 72) {
          return;
        }
        if (13 == param0) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (14 == param0) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param0 == 15) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        hl.field_c = me.a(var5Lifetime3 * var2Lifetime1, -2106461552, var2Lifetime1 * var4Lifetime3);
        return;
    }

    final static boolean a(byte param0) {
        if (param0 != 98) {
          return true;
        }
        return tj.field_a.c(param0 - 224);
    }

    public static void a(int param0) {
        if (param0 != -6) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static int a(byte[] param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param3; param1 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ ed.field_a[255 & (param0[var5] ^ var4_int)];
          }
          if (!param2) {
            c.a(104);
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("c.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final ff c(int param0) {
        ff var2 = this.field_f;
        if (param0 != -1) {
          this.c(-65);
          if (var2 == this.field_a) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_v;
          return var2;
        }
        if (var2 == this.field_a) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_v;
        return var2;
    }

    final static void a(boolean param0, byte param1, float param2, String param3) {
        try {
          if (null == pj.field_I) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
            nb.field_a.b(3016, pj.field_I);
          }
          pj.field_I.a(param3, param2, 66, param0);
          oo.b();
          int var4_int = 30 % ((param1 + 45) / 37);
          wj.b(true, -114);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "c.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ff param0, boolean param1) {
        if (null != param0.field_w) {
          param0.c((byte) -70);
        }
        param0.field_v = this.field_a.field_v;
        param0.field_w = this.field_a;
        if (!param1) {
          return;
        }
        try {
          param0.field_w.field_v = param0;
          param0.field_v.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "c.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0;
        ff var3 = this.field_a.field_v;
        while (var3 != this.field_a) {
          var2++;
          var3 = var3.field_v;
        }
        return var2;
    }

    public c() {
        this.field_a = new ff();
        this.field_a.field_v = this.field_a;
        this.field_a.field_w = this.field_a;
    }

    final ff a(boolean param0) {
        ff var2 = this.field_a.field_v;
        if (this.field_a == var2) {
          this.field_f = null;
          return null;
        }
        if (!param0) {
          this.field_f = var2.field_v;
          return var2;
        }
        this.field_a = (ff) null;
        this.field_f = var2.field_v;
        return var2;
    }

    static {
        field_c = new Random();
        field_b = true;
        field_d = "Stun a human or an enemy zombie.";
    }
}
