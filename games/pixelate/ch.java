/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ng implements j {
    static String field_H;
    static String field_G;
    bb field_F;

    private final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        ng var6 = null;
        int var8 = 0;
        StringBuilder var9 = null;
        nm var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var10 = new nm(this.field_F);
          if (param2 != 32) {
            var9 = (StringBuilder) null;
            this.a(-23, (Hashtable) null, -77, (StringBuilder) null);
          }
          var6 = (ng) (var10.d(param2 - 32));
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; var7 <= param0; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.a(param3, false, param0 + 1, param1);
            var6 = (ng) (var10.a((byte) -104));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ch.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ng var8 = null;
        nm var9 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          var9 = new nm(this.field_F);
          var8 = (ng) (var9.d(0));
          while (var8 != null) {
            if (var8.b(0)) {
              if (var8.b(true) &&
                var8.a(param0, param1 + 0, param2, param3)) {
                return true;
              }
              var8 = (ng) (var9.a((byte) -104));
              continue;
            }
            break;
          }
          var6 = param0;
          if (80 == var6) {
            if (!bc.field_m[81]) {
              stackIn_14_0 = this.b(10, param2);
            } else {
              stackIn_14_0 = this.a(0, param2);
            }
            return stackIn_14_0;
          }
          if (param1 == 3) {
            return false;
          }
          field_H = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ch.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        RuntimeException var8 = null;
        ng var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        nm var12 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 <= 61) {
            var11 = (StringBuilder) null;
            this.a(95, (Hashtable) null, -28, (StringBuilder) null);
          }
          var12 = new nm(this.field_F);
          var9 = (ng) (var12.d(0));
          while (var9 != null) {
            if (var9.b(0)) {
              if (var9.b(true) &&
                var9.a(param0, (byte) 112, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (ng) (var12.a((byte) -104));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ch.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(int param0, ng param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        ng var4 = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_F.a(param0)) {
            return false;
          }
          var3 = new nm(this.field_F);
          var4 = (ng) (var3.b(~param0));
          while (var4 != null) {
            if (var4.b(true)) {
              var5 = new nm(this.field_F);
              var5.a((byte) -99, var4);
              var6 = (ng) (var5.e(-59));
              while (var6 != null) {
                if (!var6.a(param1, 27)) {
                  var6 = (ng) (var5.e(-94));
                  continue;
                }
                return true;
              }
            }
            var4 = (ng) (var3.e(-79));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ch.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException runtimeException = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new nm(this.field_F);
          var6 = (ng) (var5.d(0));
          while (var6 != null) {
            if (var6.b(param0 - 40)) {
              var6.a(40, param1 + this.field_p, param2 + this.field_z, param3);
              var6 = (ng) (var5.a((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ch.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean b(int param0, ng param1) {
        RuntimeException var3 = null;
        ng var4 = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        nm var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_F.a(param0 ^ 10)) {
            return false;
          }
          var8 = new nm(this.field_F);
          var4 = (ng) (var8.d(0));
          while (var4 != null) {
            if (var4.b(true)) {
              var5 = new nm(this.field_F);
              var5.b((byte) -87, var4);
              var6 = (ng) (var5.a((byte) -104));
              while (var6 != null) {
                if (!var6.a(param1, 27)) {
                  var6 = (ng) (var5.a((byte) -104));
                  continue;
                }
                return true;
              }
            }
            var4 = (ng) (var8.a((byte) -104));
          }
          if (param0 == 10) {
            return false;
          }
          this.k(-117);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ch.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void h(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 2) {
          ng var5 = (ng) null;
          this.a(-101, 97, (ng) null, '\006');
        }
        nm var2 = new nm(this.field_F);
        ng var3 = (ng) (var2.d(0));
        while (var3 != null) {
          var3.h(2);
          var3 = (ng) (var2.a((byte) -104));
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 19) {
          this.field_F = (bb) null;
        }
        super.a(param0, (byte) 126, param2, param3, param4);
        this.j(-8133);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        ng var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        nm var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var12 = new nm(this.field_F);
          if (param0 != -58) {
            var11 = (StringBuilder) null;
            this.a(-76, (Hashtable) null, 78, (StringBuilder) null);
          }
          var9 = (ng) (var12.d(0));
          while (var9 != null) {
            if (var9.b(0)) {
              if (var9.a((byte) -58, param1, param2, this.field_p + param3, param4, this.field_z + param5, param6)) {
                return true;
              }
              var9 = (ng) (var12.a((byte) -104));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ch.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          StringBuilder var3 = (StringBuilder) null;
          this.a(82, (Hashtable) null, -45, (StringBuilder) null);
        }
        return null != this.k(-105) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
        this.field_F = new bb();
    }

    final void b(ng param0, int param1) {
        try {
          this.field_F.a(22125, param0);
          if (param1 != 80) {
            field_H = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ch.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_H = null;
        field_G = null;
        int var1 = -42 / ((3 - param0) / 46);
    }

    final boolean a(ng param0, int param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        ng var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var3 = new nm(this.field_F);
          var4 = (ng) (var3.d(0));
          if (param1 != 27) {
            this.b(false);
          }
          while (var4 != null) {
            if (var4.a(param0, 27)) {
              return true;
            }
            var4 = (ng) (var3.a((byte) -104));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ch.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        nm var7 = null;
        ng var8 = null;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var7 = new nm(this.field_F);
          var8 = (ng) (var7.d(param3));
          while (var8 != null) {
            if (var8.b(0)) {
              var8.a(param0, param1 + this.field_z, param2, 0, param4 + this.field_p, param5);
              var8 = (ng) (var7.a((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ch.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_G = (String) null;
          }
          if (this.a(-60, param2, param0, param3)) {
            this.a(param2, (byte) -2, param3, param0);
            this.a(param2, param3, 32, param0);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ch.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0 &&
          null != this.field_y) {
          this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
        }
        nm var5 = new nm(this.field_F);
        int var7 = 101 % ((param3 - 70) / 49);
        ng var6 = (ng) (var5.b(-1));
        while (var6 != null) {
          var6.a(this.field_p + param0, param1, this.field_z + param2, (byte) -68);
          var6 = (ng) (var5.e(-91));
        }
    }

    String b(byte param0) {
        nm var2;
        ng var3;
        String var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = new nm(this.field_F);
        if (param0 <= 16) {
          return (String) null;
        }
        var3 = (ng) (var2.d(0));
        while (var3 != null) {
          var4 = var3.b((byte) 36);
          if (var4 != null) {
            return var4;
          }
          var3 = (ng) (var2.a((byte) -104));
        }
        return null;
    }

    ng k(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(this.field_F);
        ng var3_ref_ng = (ng) (var2.d(0));
        while (var3_ref_ng != null) {
          if (var3_ref_ng.b(true)) {
            return var3_ref_ng;
          }
          var3_ref_ng = (ng) (var2.a((byte) -104));
        }
        int var3 = 125 % ((-51 - param0) / 39);
        return null;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        if (param0 < 31) {
          field_H = (String) null;
        }
        nm var3 = new nm(this.field_F);
        ng var4 = (ng) (var3.d(0));
        while (var4 != null) {
          var5 = var4.e(58);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ng) (var3.a((byte) -104));
        }
        return var2;
    }

    private final void j(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(this.field_F);
        ng var3 = (ng) (var2.d(param0 ^ param0));
        while (var3 != null) {
          var3.c((byte) 51);
          var3 = (ng) (var2.a((byte) -104));
        }
    }

    final static void a(boolean param0, String param1, int param2, int param3, tf[] param4, int param5, int param6, int param7, tf[] param8, boolean param9, jl param10, int param11, byte param12, int param13, int param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        try {
          qm.a(param13, nl.field_c, param2, param11, new sb(param4), ao.field_d, v.field_d, mh.field_a, new sb(param8), param6, param11, param10, param7, param6, param10, param14, mj.field_k, 108, hd.field_n, param5);
          var15_int = 75 % ((param12 + 21) / 34);
          uh.a(param0, param9, param1, 0, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_4_0 = var15;
          stackIn_4_1 = new StringBuilder().append("ch.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    static {
        field_H = "Tips";
        field_G = "Exploiting a bug";
    }
}
