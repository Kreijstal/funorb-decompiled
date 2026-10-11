/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ei implements lj {
    static hj field_K;
    ko field_F;
    static String field_L;
    static int field_G;
    static int[] field_J;
    static int field_H;
    static int field_I;
    static int[] field_M;

    final boolean d(int param0) {
        int var2 = 22 / ((7 - param0) / 48);
        return null != this.f((byte) 117) ? true : false;
    }

    ei f(byte param0) {
        aa var2;
        int var3;
        ei var4;
        var3 = 90 / ((param0 - 51) / 61);
        var2 = new aa(this.field_F);
        var4 = (ei) (var2.b((byte) -92));
        while (var4 != null) {
          if (var4.d(83)) {
            return var4;
          }
          var4 = (ei) (var2.b(-87));
        }
        return null;
    }

    final boolean a(ei param0, byte param1) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ei var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new aa(this.field_F);
          var4 = -98 / ((param1 + 43) / 47);
          var5 = (ei) (var3.b((byte) -92));
          while (true) {
            if (var5 == null) {
              return false;
            }
            if (!var5.a(param0, (byte) 72)) {
              var5 = (ei) (var3.b(-125));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ch.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$4 = null;
        aa var5 = null;
        int var6 = 0;
        ei var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = new aa(this.field_F);
          var6 = 16 / ((22 - param0) / 49);
          var7 = (ei) (var5.b((byte) -92));
          while (var7 != null) {
            discarded$3 = param1.append('\n');
            for (var8 = 0; param2 >= var8; var8++) {
              discarded$4 = param1.append(' ');
            }
            var7.a(param1, 1 + param2, param3, 104);
            var7 = (ei) (var5.b(-88));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("ch.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        aa var8 = null;
        RuntimeException var8_ref = null;
        ei var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          var8 = new aa(this.field_F);
          if (!param2) {
            field_H = 45;
          }
          var9 = (ei) (var8.b((byte) -92));
          while (var9 != null) {
            if (var9.b(-109)) {
              if (var9.a(param0, param1 + this.field_C, true, param3, param4, this.field_D + param5, param6)) {
                return true;
              }
              var9 = (ei) (var8.b(-119));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ch.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new aa(this.field_F);
          var6 = (ei) (var5.b((byte) -92));
          while (var6 != null) {
            if (var6.b(-107)) {
              var6.a(param0, param1 ^ 0, param2 + this.field_C, this.field_D + param3);
              var6 = (ei) (var5.b(-89));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ch.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        RuntimeException runtimeException = null;
        aa var7 = null;
        ei var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          var7 = new aa(this.field_F);
          var8 = (ei) (var7.b((byte) -92));
          if (param4 <= 62) {
            field_I = 75;
          }
          while (var8 != null) {
            if (var8.b(-128)) {
              var8.a(param0 + this.field_C, param1, this.field_D + param2, param3, (byte) 94, param5);
              var8 = (ei) (var7.b(-82));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ch.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var4 = Pool.field_O;
        aa var2 = new aa(this.field_F);
        ei var3 = (ei) (var2.b((byte) -92));
        if (param0 != 99) {
          field_J = (int[]) null;
        }
        while (var3 != null) {
          var3.d((byte) 99);
          var3 = (ei) (var2.b(-90));
        }
    }

    final static void a(boolean param0, oj param1, int param2) {
        int var5 = 0;
        oq stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        oq stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        oq var6 = null;
        oq var7 = null;
        try {
          var6 = ej.field_j;
          var7 = var6;
          var7.b(false, param2);
          var7.field_v = var7.field_v + 1;
          var4 = var7.field_v;
          var7.a(1, false);
          var7.a((byte) -81, param1.field_B);
          var7.a((byte) -81, param1.field_l);
          var7.a((byte) -81, param1.field_p);
          var7.a(true, param1.field_n);
          stackIn_2_0 = var7;
          stackIn_3_1 = !(param0);
          ((oq) (Object) stackIn_2_0).a(stackIn_3_1, param1.field_x);
          stackIn_5_0 = var7;
          stackIn_6_1 = !(param0);
          ((oq) (Object) stackIn_5_0).a(stackIn_6_1, param1.field_A);
          var7.a(true, param1.field_v);
          var7.a(param1.field_z.length, param0);
          for (var5 = 0; param1.field_z.length > var5; var5++) {
            var6.a(true, param1.field_z[var5]);
          }
          var7.d(-1, var4);
          var7.b(-var4 + var7.field_v, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ch.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param0 == 0 &&
          this.field_z != null) {
          this.field_z.a(true, param2, (byte) 105, param3, (ei) (this));
        }
        aa var5 = new aa(this.field_F);
        ei var6 = (ei) (var5.a(0));
        while (var6 != null) {
          var6.a(param0, (byte) 92, param2 + this.field_C, this.field_D + param3);
          var6 = (ei) (var5.c((byte) -71));
        }
        int var7 = 69 / ((-42 - param1) / 53);
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        aa var8 = null;
        RuntimeException var8_ref = null;
        ei var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          var8 = new aa(this.field_F);
          if (param4 >= -126) {
            this.g(-115);
          }
          var9 = (ei) (var8.b((byte) -92));
          while (var9 != null) {
            if (var9.b(-116)) {
              if (var9.d(-122) &&
                var9.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
                return true;
              }
              var9 = (ei) (var8.b(-103));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ch.WA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(boolean param0, ei param1) {
        try {
          this.field_F.b((byte) -123, param1);
          if (!param0) {
            field_I = -128;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ch.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0) {
        aa var2 = new aa(this.field_F);
        if (param0 != 22555) {
          Hashtable var4 = (Hashtable) null;
          this.a((StringBuilder) null, -32, (Hashtable) null, 81);
        }
        ei var3 = (ei) (var2.b((byte) -92));
        while (var3 != null) {
          var3.e((byte) -119);
          var3 = (ei) (var2.b(-94));
        }
    }

    String e(int param0) {
        String var4 = null;
        int var5 = Pool.field_O;
        aa var2 = new aa(this.field_F);
        ei var3 = (ei) (var2.b((byte) -92));
        while (var3 != null) {
          var4 = var3.e(-76);
          if (var4 != null) {
            return var4;
          }
          var3 = (ei) (var2.b(-115));
        }
        if (param0 <= -10) {
          return null;
        }
        field_K = (hj) null;
        return null;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(22555);
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Pool.field_O;
        int var2 = 0;
        aa var3 = new aa(this.field_F);
        if (param0 <= 33) {
          CharSequence var7 = (CharSequence) null;
          ch.a(false, (CharSequence) null);
        }
        ei var4 = (ei) (var3.b((byte) -92));
        while (var4 != null) {
          var5 = var4.c(38);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ei) (var3.b(-122));
        }
        return var2;
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        aa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        ei var8 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var5 = new aa(this.field_F);
          var8 = (ei) (var5.b((byte) -92));
          while (var8 != null) {
            if (var8.b(-115)) {
              if (var8.d(109) &&
                var8.a(param0, param1, false, param3)) {
                return true;
              }
              var8 = (ei) (var5.b(-80));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 != 80) {
            if (!param2) {
              return false;
            }
            return true;
          }
          if (!vj.field_c[81]) {
            stackIn_14_0 = this.b(param3, 0);
          } else {
            stackIn_14_0 = this.a(param3, 3);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("ch.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
            this.a((byte) -54, param0, param1, param2);
          }
          if (param3 < 13) {
            this.d(-124);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ch.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    ch(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
        this.field_F = new ko();
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = sl.a(param0, td.a((byte) 52, param1));
          if (param0) {
            field_J = (int[]) null;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ch.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(ei param0, int param1) {
        RuntimeException var3 = null;
        ei var4 = null;
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        Hashtable var8 = null;
        aa var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.field_F.c(0)) {
            return false;
          }
          if (param1 != 3) {
            var8 = (Hashtable) null;
            this.a((byte) 29, (StringBuilder) null, -124, (Hashtable) null);
          }
          var9 = new aa(this.field_F);
          var4 = (ei) (var9.a(0));
          while (var4 != null) {
            if (var4.d(-108)) {
              var5 = new aa(this.field_F);
              var5.a(var4, param1 ^ -123);
              var6 = (ei) (var5.c((byte) -71));
              while (var6 != null) {
                if (var6.a(param0, (byte) 73)) {
                  return true;
                }
                var6 = (ei) (var5.c((byte) -71));
              }
            }
            var4 = (ei) (var9.c((byte) -71));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ch.JA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_H = 62;
          }
          if (!param1) {
            stackIn_6_0 = dq.field_f.b(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = gj.field_R.b(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ch.IA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_M = null;
        field_L = null;
        field_K = null;
        field_J = null;
        if (param0 != 2) {
          field_K = (hj) null;
        }
    }

    final boolean b(ei param0, int param1) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        ei var4 = null;
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          if (this.field_F.c(param1)) {
            return false;
          }
          var3 = new aa(this.field_F);
          var4 = (ei) (var3.b((byte) -92));
          while (var4 != null) {
            if (var4.d(-112)) {
              var5 = new aa(this.field_F);
              var5.a(var4, false);
              var6 = (ei) (var5.b(-90));
              while (var6 != null) {
                if (var6.a(param0, (byte) -108)) {
                  return true;
                }
                var6 = (ei) (var5.b(-90));
              }
            }
            var4 = (ei) (var3.b(param1 ^ -123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ch.NA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_L = "New Game";
        field_K = new hj(13, 0, 1, 0);
        field_J = new int[]{1, 1, 2, 2, 5, 3, 1, 2, 3, 2, 5, 5, 3, 2, 10, 5, 5, 3, 5, 10, 3, 2, 3, 5, 3, 5, 2};
        field_M = new int[8192];
    }
}
