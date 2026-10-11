/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class um extends iq implements dq {
    static String field_H;
    static qg field_E;
    static ee field_F;
    static String field_C;
    iq[] field_G;
    static String field_D;

    void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        iq var6;
        int var7;
        ur stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        int stackIn_7_2 = 0;
        boolean stackIn_8_3;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          return;
        }
        if (param1 == 0 &&
          this.field_B != null) {
          stackIn_7_0 = this.field_B;
          stackIn_7_1 = true;
          stackIn_7_2 = param2;
          stackIn_8_3 = (param0) ? false : true;
          ((ur) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_8_3, (iq) (this), param3);
        }
        if (null != this.field_G) {
          for (var5 = -1 + this.field_G.length; var5 >= 0; var5--) {
            var6 = this.field_G[var5];
            if (var6 != null) {
              var6.a(false, param1, param2 + this.field_o, this.field_t + param3);
            }
          }
        }
    }

    private final boolean a(int param0, iq param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_G == null) {
            return false;
          }
          var4_int = this.field_G.length - 1;
          while (0 <= var4_int) {
            var5 = this.field_G[var4_int];
            if (var5 != null &&
              var5.f(67)) {
              for (var4_int = var4_int - param2; 0 <= var4_int; var4_int = var4_int - param2) {
                var6 = this.field_G[var4_int];
                if (var6 != null &&
                  var6.a((byte) 116, param1)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param0 >= 90) {
            return false;
          }
          this.f(-89);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("um.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        iq var10 = null;
        int var11 = 0;
        iq var12 = null;
        iq[] var13 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == this.field_G) {
            return false;
          }
          var13 = this.field_G;
          var9 = 0;
          if (param5 > -107) {
            var12 = (iq) null;
            this.a(-62, 27, -12, -87, -46, (byte) -68, (iq) null);
          }
          while (var13.length > var9) {
            var10 = var13[var9];
            if (var10 != null &&
              var10.a(param0, param1 + this.field_o, this.field_t + param2, param3, param4, (byte) -128, param6)) {
              return true;
            }
            var9++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("um.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int c(byte param0) {
        int var4 = 0;
        int var2;
        iq[] var3;
        iq var5;
        int var7;
        int var6;
        var7 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_G;
        if (param0 > -97) {
          field_H = (String) null;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.c((byte) -121);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        int var9 = 0;
        iq[] var8 = null;
        RuntimeException var8_ref = null;
        iq var10_ref_iq = null;
        int var10 = 0;
        int var11 = 0;
        iq[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == this.field_G) {
            return false;
          }
          var12 = this.field_G;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10_ref_iq = var12[var9];
            if (var10_ref_iq != null &&
              var10_ref_iq.f(111) &&
              var10_ref_iq.a(param0, param1, param2, param3, param4, (byte) 120, param6)) {
              return true;
            }
          }
          var10 = 29 / ((param5 + 87) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("um.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final String a(boolean param0) {
        int var3 = 0;
        iq[] var2;
        iq var4;
        int var6;
        iq[] var7;
        String var5;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_G == null) {
          return null;
        }
        var7 = this.field_G;
        var2 = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var5 = var4.a(false);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (!param0) {
          return null;
        }
        field_F = (ee) null;
        return null;
    }

    final static void h(int param0) {
        gg var1 = null;
        int var2 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        gg var1Lifetime1;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          ri.field_r.b();
          mh.field_d.b();
          eh.field_c = eh.field_c - 1;
          if (eh.field_c == param0) {
            eh.field_c = 200;
            var1 = (gg) (fm.field_b.a((byte) 100));
            while (var1 != null) {
              if (!var1.field_q.b(param0 + 91)) {
                var1.c(2);
              }
              var1 = (gg) (fm.field_b.b(104));
            }
            if (ro.field_b != null) {
              var1Lifetime1 = (gg) (ro.field_b.a((byte) 100));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_q.b(86)) {
                  var1Lifetime1.c(2);
                }
                var1Lifetime1 = (gg) (ro.field_b.b(96));
              }
            }
          }
          if (qc.field_v != null) {
            stackIn_19_0 = qc.field_v.g(-26083);
            if (stackIn_19_0) {
              return;
            }
            fo.field_e = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "um.Q(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(!param0 ? true : false);
    }

    public static void a(int param0) {
        field_D = null;
        field_C = null;
        if (param0 <= 6) {
          return;
        }
        field_F = null;
        field_E = null;
        field_H = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -79) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, -1, param1, param0)) {
            this.a(param0, param3, true, param1);
            this.a(param0, true, param3, param1);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("um.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        iq var7 = null;
        int var9 = 0;
        iq[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_G == null) {
            return;
          }
          if (!param1) {
            field_H = (String) null;
          }
          var10 = this.field_G;
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$4 = param2.append('\n');
            for (var8 = 0; var8 <= param3; var8++) {
              discarded$6 = param2.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param2.append("null");
            } else {
              var7.a(param0, param3 + 1, (byte) -79, param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("um.K(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final iq a(byte param0) {
        int var4 = 0;
        iq[] var2;
        int var3;
        iq var5;
        int var6;
        iq[] var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_G == null) {
          return null;
        }
        var7 = this.field_G;
        var2 = var7;
        var3 = 29 / ((param0 - 26) / 32);
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5 != null &&
            var5.f(28)) {
            return var5;
          }
        }
        return null;
    }

    final boolean f(int param0) {
        if (param0 <= 3) {
          this.f(-7);
        }
        return null != this.a((byte) -78) ? true : false;
    }

    final void d(byte param0) {
        int var3 = 0;
        iq[] var2;
        iq var4;
        int var5;
        iq[] var7;
        iq var6;
        var5 = Vertigo2.field_L ? 1 : 0;
        var7 = this.field_G;
        var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var4.d((byte) 2);
          }
        }
        if (param0 != 2) {
          var6 = (iq) null;
          this.a(101, -56, -30, -66, -25, (byte) -87, (iq) null);
        }
    }

    private final boolean a(iq param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 94) {
            field_F = (ee) null;
          }
          stackIn_3_0 = this.a(1, param0, (byte) -127);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("um.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        int var6 = 0;
        iq[] var5 = null;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          super.a((byte) 49, param1, param2, param3);
          if (param0 <= 6) {
            return;
          }
          if (null == this.field_G) {
            return;
          }
          var9 = this.field_G;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a((byte) 46, this.field_o + param1, this.field_t + param2, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("um.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (!param0) {
          field_C = (String) null;
        }
        if (param1 % 10L != 0L) {
          an.a(param1, false);
        } else {
          an.a(-1L + param1, false);
          an.a(1L, false);
        }
    }

    private final boolean b(byte param0, iq param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 1) {
            field_D = (String) null;
          }
          stackIn_3_0 = this.a(110, param1, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("um.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(byte param0, iq param1) {
        int var4 = 0;
        iq[] var3 = null;
        RuntimeException var3_ref = null;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 116) {
            field_D = (String) null;
          }
          var7 = this.field_G;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a((byte) 116, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("um.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    um(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
    }

    private final boolean a(int param0, iq param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == this.field_G) {
            return false;
          }
          var4_int = 0;
          if (param2 > -1) {
            field_F = (ee) null;
          }
          while (this.field_G.length > var4_int) {
            var5 = this.field_G[var4_int];
            if (null != var5 &&
              var5.f(65)) {
              for (var4_int = var4_int + param0; var4_int < this.field_G.length; var4_int = var4_int + param0) {
                var6 = this.field_G[var4_int];
                if (null != var6 &&
                  var6.a((byte) 116, param1)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("um.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        int var6 = 0;
        iq[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_G == null) {
            return false;
          }
          if (param1 != 13) {
            field_C = (String) null;
          }
          var9 = this.field_G;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.f(param1 ^ 87) &&
              var7.a(param0, 13, param2, param3)) {
              return true;
            }
          }
          var5_int = param2;
          if (var5_int != 80) {
            return false;
          }
          if (!cr.field_eb[81]) {
            stackIn_19_0 = this.a(param3, (byte) 121);
          } else {
            stackIn_19_0 = this.b((byte) 104, param3);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("um.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    abstract void b(boolean param0);

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        iq[] var7 = null;
        iq var9 = null;
        int var10 = 0;
        iq[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_G == null) {
            return;
          }
          var11 = this.field_G;
          var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, (byte) 46, param2 + this.field_o, this.field_t + param3, param4, param5);
            }
          }
          if (param1 != 46) {
            this.a(true, -8, 46, -97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("um.HA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_H = "Match by...";
        field_C = "Year";
        field_D = "Show game chat from my friends";
    }
}
