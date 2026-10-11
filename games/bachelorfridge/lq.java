/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class lq extends wj implements e {
    static String field_z;
    static int[] field_A;
    static int field_y;
    wj[] field_B;

    public static void a(int param0) {
        if (param0 < 43) {
          return;
        }
        field_A = null;
        field_z = null;
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
          if (param2 < 20) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param0, param1, param3, (byte) 39)) {
            this.a(9, param0, param3, param1);
            this.a(param1, (byte) -28, param0, param3);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lq.V(");
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final wj b(boolean param0) {
        int var3 = 0;
        wj[] var2;
        wj var4;
        int var5;
        wj[] var6;
        var5 = BachelorFridge.field_y;
        if (null == this.field_B) {
          return null;
        }
        var6 = this.field_B;
        var2 = var6;
        if (param0) {
          this.field_B = (wj[]) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.e(1023)) {
            return var4;
          }
        }
        return null;
    }

    abstract void h(int param0);

    void a(int param0, int param1, wj param2, int param3) {
        int var6 = 0;
        wj[] var5 = null;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_B == null) {
            return;
          }
          var9 = this.field_B;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0 + this.field_s, this.field_v + param1, param2, 20);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("lq.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param2 ^ -11436);
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        int var8 = 0;
        wj[] var7 = null;
        wj var9 = null;
        int var10 = 0;
        wj[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = BachelorFridge.field_y;
        try {
          if (this.field_B == null) {
            return;
          }
          if (param2 != -101) {
            this.a((byte) -33, 24, -35, -40);
          }
          var11 = this.field_B;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0 + this.field_s, param1, (byte) -101, param3, param4, param5 + this.field_v);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("lq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0) {
        wj[] var2;
        int var3;
        wj var4;
        int var5;
        wj[] var6;
        var5 = BachelorFridge.field_y;
        var6 = this.field_B;
        var2 = var6;
        var3 = 0;
        if (param0 != 31) {
          return;
        }
        while (var3 < var6.length) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.f(31);
          }
          var3++;
        }
    }

    final static void g(int param0) {
        cq var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        cq var1Lifetime1;
        var2 = BachelorFridge.field_y;
        try {
          lc.field_l.f();
          nia.field_m.f();
          rq.field_f = rq.field_f - 1;
          if (0 == rq.field_f) {
            rq.field_f = 200;
            var1 = (cq) (rma.field_d.b((byte) 90));
            while (var1 != null) {
              if (!var1.field_h.a((byte) -106)) {
                var1.a(false);
              }
              var1 = (cq) (rma.field_d.c(0));
            }
            if (jha.field_i != null) {
              var1Lifetime1 = (cq) (jha.field_i.b((byte) 90));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_h.a((byte) -106)) {
                  var1Lifetime1.a(false);
                }
                var1Lifetime1 = (cq) (jha.field_i.c(0));
              }
            }
          }
          if (param0 != 1) {
            lq.a(61);
          }
          if (null != uf.field_c) {
            if (uf.field_c.c(28607)) {
              return;
            }
            uw.field_o = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "lq.F(" + param0 + ')');
        }
    }

    private final boolean a(int param0, wj param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (null == this.field_B) {
            return false;
          }
          var4_int = param2;
          while (var4_int < this.field_B.length) {
            var5 = this.field_B[var4_int];
            if (var5 != null &&
              var5.e(1023)) {
              for (var4_int = var4_int + param0; this.field_B.length > var4_int; var4_int = var4_int + param0) {
                var6 = this.field_B[var4_int];
                if (var6 != null &&
                  var6.a(param1, param2 ^ -86)) {
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
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("lq.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5;
        wj var7;
        int var8;
        var8 = BachelorFridge.field_y;
        if (param2 == 0 &&
          null != this.field_f) {
          this.field_f.a(param3, (wj) (this), 32679, param1, true);
        }
        var5 = -19 % ((param0 + 20) / 54);
        if (this.field_B != null) {
          for (var6 = this.field_B.length - 1; var6 >= 0; var6--) {
            var7 = this.field_B[var6];
            if (var7 != null) {
              var7.a((byte) 125, param1 + this.field_v, param2, param3 + this.field_s);
            }
          }
        }
    }

    lq(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var9 = 0;
        wj[] var8 = null;
        RuntimeException var8_ref = null;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          if (null == this.field_B) {
            return false;
          }
          if (param1 != 13) {
            field_z = (String) null;
          }
          var12 = this.field_B;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.e(1023) &&
              var10.a(param0, 13, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("lq.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(')').toString());
        }
    }

    final int b(int param0) {
        int var4 = 0;
        int var2;
        wj[] var3;
        wj var5;
        int var7;
        int var6;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 > -3) {
          return -10;
        }
        var3 = this.field_B;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.b(-116);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    final String c(byte param0) {
        int var3 = 0;
        wj[] var2;
        wj var4;
        int var6;
        wj[] var8;
        String var5;
        wj var7;
        var6 = BachelorFridge.field_y;
        if (this.field_B == null) {
          return null;
        }
        var8 = this.field_B;
        var2 = var8;
        for (var3 = 0; var3 < var8.length; var3++) {
          var4 = var8[var3];
          if (var4 != null) {
            var5 = var4.c((byte) 16);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (param0 == 16) {
          return null;
        }
        var7 = (wj) null;
        this.a(22, -72, ']', (wj) null);
        return null;
    }

    private final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var7 = 0;
        StringBuilder discarded$4 = null;
        int var9 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        wj var8 = null;
        int var10 = 0;
        wj[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BachelorFridge.field_y;
        try {
          if (this.field_B == null) {
            return;
          }
          var6 = -86 % ((param1 - 43) / 40);
          var11 = this.field_B;
          for (var7 = 0; var7 < var11.length; var7++) {
            var8 = var11[var7];
            discarded$4 = param3.append('\n');
            for (var9 = 0; var9 <= param0; var9++) {
              discarded$6 = param3.append(' ');
            }
            if (var8 == null) {
              discarded$5 = param3.append("null");
            } else {
              var8.a(param2, param0 + 1, (byte) 56, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("lq.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        int var6 = 0;
        wj[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          if (null == this.field_B) {
            return false;
          }
          var9 = this.field_B;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.e(1023) &&
              var7.a(10, param1, param2, param3)) {
              return true;
            }
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (wga.field_q[81]) {
              stackIn_18_0 = this.b(param3, -99);
            } else {
              stackIn_18_0 = this.a(90, param3);
            }
            return stackIn_18_0;
          }
          if (param0 == 10) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("lq.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final boolean a(int param0, wj param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = this.a(1, param1, 0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lq.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean b(wj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -58 % ((param1 - 15) / 53);
          stackIn_1_0 = this.a(param0, false, 1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("lq.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kv a(ee param0, int param1, kv param2, int param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        kv stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        int var9 = 0;
        kv var10 = null;
        kv var11 = null;
        var9 = BachelorFridge.field_y;
        try {
          var10 = new kv(param2.field_q, param2.field_p);
          var11 = var10;
          if (param1 != 8533) {
            field_z = (String) null;
          }
          var11.b();
          param0.a(param4, param3, param2.field_q, param2.field_p);
          dg.d(0, param3, param4, param3, 16777215);
          dg.d(param2.field_q + param4, param3, param2.field_q, param3, 16777215);
          hga.field_U.a((byte) 117);
          for (var6 = 0; var6 < param2.field_q; var6++) {
            var7 = 0;
            for (var8 = var6; var8 < param2.field_v.length; var8 = var8 + param2.field_q) {
              if (0 != var10.field_v[var8]) {
                var7 = 1;
              }
              if (var7 != 0) {
                param2.field_v[var8] = 0;
              }
            }
          }
          stackIn_16_0 = (kv) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("lq.R(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
          return false;
        }
        return null != this.b(false) ? true : false;
    }

    private final boolean a(wj param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        Object stackIn_7_0 = null;
        wj stackIn_7_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_B == null) {
            return false;
          }
          var4_int = this.field_B.length - 1;
          while (var4_int >= 0) {
            var5 = this.field_B[var4_int];
            stackIn_7_0 = null;
            stackIn_7_1 = var5;
            if (stackIn_7_0 != stackIn_7_1 &&
              var5.e(1023)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_B[var4_int];
                if (null != var6 &&
                  var6.a(param0, -79)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param1) {
            this.f(-93);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("lq.T(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var9 = 0;
        wj[] var8 = null;
        RuntimeException var8_ref = null;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          if (null == this.field_B) {
            return false;
          }
          var12 = this.field_B;
          var8 = var12;
          if (param1 != -7375) {
            return false;
          }
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.b(param0, -7375, this.field_s + param2, param3, this.field_v + param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("lq.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(wj param0, int param1) {
        int var4 = 0;
        wj[] var3 = null;
        RuntimeException var3_ref = null;
        wj var5 = null;
        int var6 = 0;
        wj[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          var7 = this.field_B;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, -88)) {
              return true;
            }
          }
          if (param1 <= -78) {
            return false;
          }
          field_z = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("lq.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_z = "Suggest muting this player";
        field_y = 0;
    }
}
