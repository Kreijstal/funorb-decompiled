/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class l {
    static Calendar field_a;
    static String field_f;
    tg[] field_e;
    static String field_c;
    static int field_b;
    static String field_d;

    final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        tg var6 = null;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        if (null == this.field_e ||
          this.field_e.length == 0 ||
          param1 < this.field_e[0].field_m) {
          return -1;
        }
        if (this.field_e[-1 + this.field_e.length].field_c < param1) {
          return -1;
        }
        if (this.field_e.length == 1) {
          return this.field_e[0].a((byte) -117, param0);
        }
        int var4 = 0;
        if (param2 > -111) {
          field_a = (Calendar) null;
        }
        for (var5 = 0; var5 < this.field_e.length; var5++) {
          var6 = this.field_e[var5];
          if (var6.field_m <= param1 &&
            param1 <= var6.field_c) {
            var7 = var6.a((byte) -92, param0);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (-1 + var6.field_k.length);
        }
        return -1;
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        tg[] var3_ref_tg__;
        tg var5;
        int var7;
        int var3;
        int var6;
        var7 = DungeonAssault.field_K;
        var2 = -1;
        if (this.field_e != null) {
          var3_ref_tg__ = this.field_e;
          for (var4 = 0; var3_ref_tg__.length > var4; var4++) {
            var5 = var3_ref_tg__[var4];
            if (var5 != null) {
              var6 = var5.a((byte) -90);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        var3 = 119 / ((param0 - 43) / 53);
        return var2;
    }

    final static fa a(ni param0, int param1) {
        fa var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        fa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new fa(param0, param0);
          ud.field_v.a(var2, false);
          wa.field_j.b(param0);
          if (param1 != 0) {
            var3 = (String) null;
            l.a((String) null, false, -33L, false, (String) null);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("l.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static vk a(byte param0, boolean param1) {
        vk var2 = new vk(true);
        var2.field_f = param1 ? true : false;
        if (param0 != -49) {
          field_f = (String) null;
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = DungeonAssault.field_K;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          for (var8 = param1; var8 < var7; var8++) {
            var9 = param0.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (62 != var9) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int <= 0) {
            stackIn_21_0 = 0;
            return stackIn_21_0;
          }
          stackIn_19_0 = (-param2 + param3 << 8) / var5_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("l.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        tg var6 = null;
        int var7 = DungeonAssault.field_K;
        tg[] var8 = this.field_e;
        tg[] var3 = var8;
        int var5 = 34 % ((-73 - param0) / 53);
        for (var4 = 0; var4 < var8.length; var4++) {
          var6 = var8[var4];
          if (!(var6.field_k.length <= param1)) {
            return var6.field_k[param1];
          }
          param1 = param1 - (var6.field_k.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        tg var4 = null;
        int var5 = DungeonAssault.field_K;
        for (var3 = param0; var3 < this.field_e.length; var3++) {
          var4 = this.field_e[var3];
          if (!(param1 >= var4.field_k.length)) {
            return var3;
          }
          param1 = param1 - (var4.field_k.length - 1);
        }
        return this.field_e.length;
    }

    final static void b(boolean param0) {
        try {
          if (bk.field_b != null) {
            try {
              bk.field_b.a(0L, -26296);
              bk.field_b.a(ra.field_c.field_o, -79, 24, ra.field_c.field_m);
            } catch (Exception exception) {
            }
          }
          if (param0) {
            return;
          }
          ra.field_c.field_o = ra.field_c.field_o + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != -24) {
          l.d(85);
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
          l.a(116);
        }
        if (kh.field_n == 10 ||
          !dh.a(false)) {
          tk.a((byte) -86);
          kh.field_n = 11;
        }
        u.field_O = true;
    }

    final static hl a(String param0, boolean param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        sc stackIn_5_0 = null;
        vl stackIn_7_0 = null;
        ch stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0L &&
            param4 != null) {
            stackIn_7_0 = new vl(param4, param0);
            return (hl) ((Object) stackIn_7_0);
          }
          if (param3) {
            stackIn_5_0 = new sc(param2, param0);
            return (hl) ((Object) stackIn_5_0);
          }
          if (param1) {
            field_a = (Calendar) null;
          }
          stackIn_11_0 = new ch(param2, param0);
          return (hl) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("l.M(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int d(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = DungeonAssault.field_K;
        try {
          if (param0 != 4570) {
            stackIn_3_0 = -92;
            return stackIn_3_0;
          }
          var1_int = 0;
          while (ha.b((byte) 47)) {
            h.field_h.d(param0 - 4570);
            if (!h.field_h.c(param0 - 4670)) {
              continue;
            }
            var1_int = 1;
          }
          h.field_h.a(-7734, wi.c(hm.field_k, param0 ^ 2118074, lc.field_c), wi.c(eh.field_h, 2113632, hj.field_S));
          if (h.field_h.c(param0 - 4689)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            0 <= h.field_h.field_b) {
            var2 = op.field_c[h.field_h.field_b];
            if (var2 == 2) {
              vk.a((byte) -31);
            }
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "l.I(" + param0 + ')');
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != 263) {
          return -25;
        }
        if (null != this.field_e &&
          this.field_e.length > 0) {
          stackIn_7_0 = this.field_e[-1 + this.field_e.length].field_c - this.field_e[0].field_m;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[][] param9, int param10, boolean param11, int param12) {
        if (param8 != 0) {
          return;
        }
        try {
          gh.field_i[param3] = new ac(param3, param5, param7, param10, param6, param1, param2, param12, param4, param0, param11, param9);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "l.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return nl.field_d > 250 ? true : false;
    }

    static {
        field_f = "All of your raiders escaped.";
        field_c = "You must gain the <%0> Achievement to earn the title of <%1>.";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = "MENU";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static vk $cfr$intArgs$a$fb458fdecc21(int param0, boolean param1) {
        vk var2 = new vk(true);
        var2.field_f = param1 ? true : false;
        if (param0 != -49) {
          field_f = (String) null;
        }
        return var2;
    }
}
