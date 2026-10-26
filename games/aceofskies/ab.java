/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ab extends ea implements vm {
    IntrusiveDeque field_s;
    static String field_r;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        an var8 = null;
        RuntimeException var8_ref = null;
        ea var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var8 = new an(this.field_s);
          if (param0 != 34) {
            field_r = (String) null;
          }
          var9 = (ea) (var8.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 106)) {
              if (!var9.a(34, param1 + this.field_p, param2, param3, this.field_h + param4, param5, param6)) {
                var9 = (ea) (var8.a(126));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("ab.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    final String c(byte param0) {
        String var4 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        ea var3 = (ea) (var2.c(-1372));
        while (var3 != null) {
          var4 = var3.c((byte) -112);
          if (var4 != null) {
            return var4;
          }
          var3 = (ea) (var2.a(-12));
        }
        if (param0 < -41) {
          return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.a((byte) -28, 3, (Hashtable) null, (StringBuilder) null);
        return null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          this.field_e != null) {
          this.field_e.a(true, -7592, param3, (ea) (this), param2);
        }
        an var5 = new an(this.field_s);
        if (param0 < 64) {
          return;
        }
        ea var6 = (ea) (var5.b(true));
        while (var6 != null) {
          var6.a((byte) 100, param1, param2 + this.field_h, param3 + this.field_p);
          var6 = (ea) (var5.a((byte) 120));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        RuntimeException var8 = null;
        ea var9 = null;
        int var10 = 0;
        Hashtable var11 = null;
        an var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var12 = new an(this.field_s);
          var9 = (ea) (var12.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 85)) {
              if (var9.e(28660) &&
                var9.a(param0, param1, param2, param3, param4, param5, false)) {
                return true;
              }
              var9 = (ea) (var12.a(-121));
              continue;
            }
            break;
          }
          if (!param6) {
            return false;
          }
          var11 = (Hashtable) null;
          this.a((StringBuilder) null, -90, 100, (Hashtable) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ab.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(ea param0, int param1) {
        try {
          if (param1 != 1) {
            field_r = (String) null;
          }
          this.field_s.addLast(87, param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ab.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, ea param1) {
        RuntimeException var3 = null;
        ea var4 = null;
        an var5 = null;
        ea var6 = null;
        int var7 = 0;
        an var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 80) {
            field_r = (String) null;
          }
          if (this.field_s.isEmpty(true)) {
            return false;
          }
          var8 = new an(this.field_s);
          var4 = (ea) (var8.c(-1372));
          while (var4 != null) {
            if (var4.e(28660)) {
              var5 = new an(this.field_s);
              var5.a(46, var4);
              var6 = (ea) (var5.a(23));
              while (var6 != null) {
                if (var6.a(param1, (byte) -42)) {
                  return true;
                }
                var6 = (ea) (var5.a(-126));
              }
            }
            var4 = (ea) (var8.a(-123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ab.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = param0;
        an var3 = new an(this.field_s);
        ea var4 = (ea) (var3.c(param0 ^ -1372));
        while (var4 != null) {
          var5 = var4.f(param0 + 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ea) (var3.a(-119));
        }
        return var2;
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        an var5 = null;
        ea var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = new an(this.field_s);
          var6 = (ea) (var5.c(-1372));
          while (var6 != null) {
            discarded$2 = param3.append('\n');
            for (var7 = 0; var7 <= param1; var7++) {
              discarded$3 = param3.append(' ');
            }
            var6.a(param3, 32462, 1 + param1, param2);
            var6 = (ea) (var5.a(param0 - 232));
          }
          if (param0 != 115) {
            this.field_s = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ab.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    ab(int param0, int param1, int param2, int param3, ir param4) {
        super(param0, param1, param2, param3, param4, (no) null);
        this.field_s = new IntrusiveDeque();
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param2, false, param3)) {
            this.a(param0, param1 ^ 32462, param3, param2);
            this.a((byte) 115, param2, param3, param0);
          }
          if (param1 != 32462) {
            this.a((byte) 77, -41, -88, 96);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ab.A(");
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
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        if (param0 != 7398) {
          return;
        }
        ea var3 = (ea) (var2.c(-1372));
        while (var3 != null) {
          var3.d(7398);
          var3 = (ea) (var2.a(param0 - 7523));
        }
    }

    public static void c(boolean param0) {
        field_r = null;
        if (!param0) {
          int[] var2 = (int[]) null;
          ab.a((wl) null, -29, true, (int[]) null, 99, -122, -8, -126);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, (byte) 126);
        if (param4 <= 122) {
          ea var7 = (ea) null;
          this.a((byte) -120, (ea) null, 59, 121);
        }
        this.b(false);
    }

    void a(byte param0, ea param1, int param2, int param3) {
        an var5 = null;
        ea var6 = null;
        Hashtable var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a((byte) 94, param1, param2, param3);
          var5 = new an(this.field_s);
          var6 = (ea) (var5.c(-1372));
          while (var6 != null) {
            if (var6.isLinked((byte) 119)) {
              var6.a((byte) 108, param1, param2 + this.field_h, this.field_p + param3);
              var6 = (ea) (var5.a(-125));
              continue;
            }
            break;
          }
          if (param0 <= 13) {
            var7 = (Hashtable) null;
            this.a((StringBuilder) null, -85, 34, (Hashtable) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("ab.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea var9 = null;
        an var10 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var10 = new an(this.field_s);
          var6 = -95 / ((param0 + 53) / 33);
          var9 = (ea) (var10.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 95)) {
              if (var9.e(28660) &&
                var9.a(-94, param1, param2, param3)) {
                return true;
              }
              var9 = (ea) (var10.a(69));
              continue;
            }
            break;
          }
          var7 = param1;
          if (80 != var7) {
            return false;
          }
          if (lp.field_a[81]) {
            stackIn_15_0 = this.b(param3, -107);
          } else {
            stackIn_15_0 = this.a(80, param3);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ab.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        RuntimeException runtimeException = null;
        an var7 = null;
        ea var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var7 = new an(this.field_s);
          if (param5 != 91) {
            return;
          }
          var8 = (ea) (var7.c(-1372));
          while (var8 != null) {
            if (var8.isLinked((byte) 115)) {
              var8.a(param0 + this.field_p, param1 + this.field_h, param2, param3, param4, (byte) 91);
              var8 = (ea) (var7.a(3));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ab.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
          field_r = (String) null;
        }
        return this.a(0) != null ? true : false;
    }

    ea a(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        ea var3 = (ea) (var2.c(-1372));
        while (var3 != null) {
          if (var3.e(28660)) {
            return var3;
          }
          var3 = (ea) (var2.a(-119));
        }
        if (param0 == 0) {
          return null;
        }
        this.field_s = (IntrusiveDeque) null;
        return null;
    }

    final boolean b(ea param0, int param1) {
        RuntimeException var3 = null;
        ea var4 = null;
        an var5 = null;
        ea var6 = null;
        int var7 = 0;
        ea var8 = null;
        an var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_s.isEmpty(true)) {
            return false;
          }
          var9 = new an(this.field_s);
          if (param1 >= -20) {
            var8 = (ea) null;
            this.a((ea) null, -61);
          }
          var4 = (ea) (var9.b(true));
          while (var4 != null) {
            if (var4.e(28660)) {
              var5 = new an(this.field_s);
              var5.a(var4, 0);
              var6 = (ea) (var5.a((byte) 120));
              while (var6 != null) {
                if (var6.a(param0, (byte) -42)) {
                  return true;
                }
                var6 = (ea) (var5.a((byte) 120));
              }
            }
            var4 = (ea) (var9.a((byte) 120));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ab.EB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ea param0, byte param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        ea var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new an(this.field_s);
          if (param1 != -42) {
            this.a((byte) 13, -25, 110, -87);
          }
          var4 = (ea) (var3.c(-1372));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, (byte) -42)) {
              var4 = (ea) (var3.a(param1 ^ -31));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ab.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        an var2 = new an(this.field_s);
        ea var3 = (ea) (var2.c(-1372));
        if (param0) {
          return;
        }
        while (var3 != null) {
          var3.a(false);
          var3 = (ea) (var2.a(-124));
        }
    }

    final static el a(wl param0, int param1, boolean param2, int[] param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        el stackIn_2_0 = null;
        el stackIn_8_0 = null;
        el stackIn_11_0 = null;
        el stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (el) null;
            return stackIn_2_0;
          }
          if (!param0.field_Cc && (!mg.a(param6, (byte) -72) ||
            !mg.a(param7, (byte) -39))) {
            if (param0.field_u) {
              stackIn_13_0 = new el(param0, 34037, param6, param7, param2, param3, param5, param4);
              return stackIn_13_0;
            }
            stackIn_11_0 = new el(param0, param6, param7, fk.a(param6, 61), fk.a(param7, 115), param3);
            return stackIn_11_0;
          }
          stackIn_8_0 = new el(param0, 3553, param6, param7, param2, param3, param5, param4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ab.JB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_r = "Arcade Mode Unlocked!";
    }
}
