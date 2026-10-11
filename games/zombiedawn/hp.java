/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hp extends ga implements jf {
    vo field_x;
    static af field_z;
    static dk field_A;
    static mf field_B;
    static String field_y;
    static li field_E;
    static int field_D;
    static boolean field_C;

    private final void a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        cj var5 = null;
        ga var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawn.field_J;
        try {
          if (!param1) {
            return;
          }
          var5 = new cj(this.field_x);
          var6 = (ga) (var5.c((byte) -128));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; param2 >= var7; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.a(param3, param0, param1, 1 + param2);
            var6 = (ga) (var5.a((byte) 61));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("hp.KB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void c(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != 57) {
          return;
        }
        cj var2 = new cj(this.field_x);
        ga var3 = (ga) (var2.c((byte) -115));
        while (var3 != null) {
          var3.c((byte) 57);
          var3 = (ga) (var2.a((byte) 61));
        }
    }

    final boolean b(byte param0, ga param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        cj var6 = null;
        ga var7 = null;
        int var8 = 0;
        cj var9 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (this.field_x.a((byte) -123)) {
            return false;
          }
          var4 = 2 / ((66 - param0) / 53);
          var9 = new cj(this.field_x);
          var5 = (ga) (var9.b((byte) -21));
          while (var5 != null) {
            if (var5.e(-17741)) {
              var6 = new cj(this.field_x);
              var6.a(var5, (byte) -128);
              var7 = (ga) (var6.a(17));
              while (var7 != null) {
                if (!var7.a((byte) 90, param1)) {
                  var7 = (ga) (var6.a(17));
                  continue;
                }
                return true;
              }
            }
            var5 = (ga) (var9.a(17));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("hp.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        cj var8 = null;
        RuntimeException var8_ref = null;
        ga var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawn.field_J;
        try {
          var8 = new cj(this.field_x);
          var9 = (ga) (var8.c((byte) -127));
          if (param1 != 1) {
            return true;
          }
          while (var9 != null) {
            if (var9.a((byte) 73)) {
              if (var9.a(param0, 1, this.field_j + param2, param3, this.field_k + param4, param5, param6)) {
                return true;
              }
              var9 = (ga) (var8.a((byte) 61));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("hp.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
        cj var9 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var9 = new cj(this.field_x);
          var6 = 65 % ((param0 + 83) / 32);
          var7 = (ga) (var9.c((byte) -118));
          while (var7 != null) {
            if (var7.a((byte) 73)) {
              if (var7.e(-17741) &&
                var7.a(43, param1, param2, param3)) {
                return true;
              }
              var7 = (ga) (var9.a((byte) 61));
              continue;
            }
            break;
          }
          var6Lifetime1 = param1;
          if (var6Lifetime1 != 80) {
            return false;
          }
          if (!bo.field_p[81]) {
            stackIn_14_0 = this.a(1, param2);
          } else {
            stackIn_14_0 = this.b((byte) 119, param2);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("hp.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (param1 == 0 &&
          this.field_h != null) {
          this.field_h.a(param3 + 16777215, true, param0, (ga) (this), param2);
        }
        cj var9 = new cj(this.field_x);
        if (param3 != 0) {
          ga var8 = (ga) null;
          this.a(108, 83, -6, 30, 111, -93, (ga) null);
        }
        ga var6 = (ga) (var9.b((byte) -21));
        while (var6 != null) {
          var6.a(param0 + this.field_j, param1, param2 + this.field_k, param3 + 0);
          var6 = (ga) (var9.a(17));
        }
    }

    String d(int param0) {
        String var4_ref_String = null;
        int var5 = ZombieDawn.field_J;
        cj var2 = new cj(this.field_x);
        ga var3 = (ga) (var2.c((byte) -123));
        while (var3 != null) {
          var4_ref_String = var3.d(100);
          if (var4_ref_String != null) {
            return var4_ref_String;
          }
          var3 = (ga) (var2.a((byte) 61));
        }
        int var4 = -5 / ((10 - param0) / 58);
        return null;
    }

    final boolean a(int param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        cj var5 = null;
        ga var6 = null;
        int var7 = 0;
        cj var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          if (this.field_x.a((byte) -121)) {
            return false;
          }
          var8 = new cj(this.field_x);
          var4 = (ga) (var8.c((byte) -118));
          if (param0 != 1) {
            field_y = (String) null;
          }
          while (var4 != null) {
            if (var4.e(-17741)) {
              var5 = new cj(this.field_x);
              var5.a(-3549, var4);
              var6 = (ga) (var5.a((byte) 61));
              while (var6 != null) {
                if (!var6.a((byte) 96, param1)) {
                  var6 = (ga) (var5.a((byte) 61));
                  continue;
                }
                return true;
              }
            }
            var4 = (ga) (var8.a((byte) 61));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("hp.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        cj var8 = null;
        RuntimeException var8_ref = null;
        ga var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawn.field_J;
        try {
          var8 = new cj(this.field_x);
          var9 = (ga) (var8.c((byte) -122));
          while (var9 != null) {
            if (var9.a((byte) 73)) {
              if (var9.e(-17741) &&
                var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (ga) (var8.a((byte) 61));
              continue;
            }
            break;
          }
          if (param5) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("hp.OA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, 11098, param3)) {
            this.a(param0, param3, 69, param1);
            this.a(param1, param2, param3, param0);
          }
          if (param2) {
            stackIn_6_0 = (StringBuilder) (param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hp.NA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        cj var5 = null;
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          super.a(param0, (byte) -116, param2, param3);
          var5 = new cj(this.field_x);
          var6 = -6 % ((param1 - 46) / 42);
          var7 = (ga) (var5.c((byte) -128));
          while (var7 != null) {
            if (var7.a((byte) 73)) {
              var7.a(param0, (byte) -75, param2 + this.field_j, param3 + this.field_k);
              var7 = (ga) (var5.a((byte) 61));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("hp.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ga d(byte param0) {
        cj var2;
        ga var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var2 = new cj(this.field_x);
        if (param0 != 35) {
          this.field_x = (vo) null;
        }
        var3 = (ga) (var2.c((byte) -126));
        while (var3 != null) {
          if (var3.e(-17741)) {
            return var3;
          }
          var3 = (ga) (var2.a((byte) 61));
        }
        return null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 38 / ((param0 + 23) / 48);
        super.a(85, param1, param2, param3, param4);
        this.g(-115);
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 < 82) {
          hp.f(-94);
        }
        field_y = null;
        field_A = null;
        field_z = null;
        field_E = null;
    }

    boolean a(byte param0, ga param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        ga var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          var3 = new cj(this.field_x);
          if (param0 < 67) {
            return false;
          }
          var4 = (ga) (var3.c((byte) -126));
          while (var4 != null) {
            if (var4.a((byte) 100, param1)) {
              return true;
            }
            var4 = (ga) (var3.a((byte) 61));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        cj var7 = null;
        ga var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = ZombieDawn.field_J;
        try {
          var7 = new cj(this.field_x);
          var8 = (ga) (var7.c((byte) -121));
          while (var8 != null) {
            if (var8.a((byte) 73)) {
              var8.a(this.field_k + param0, 21, param2, param3, this.field_j + param4, param5);
              var8 = (ga) (var7.a((byte) 61));
              continue;
            }
            break;
          }
          if (param1 < 1) {
            this.field_x = (vo) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("hp.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = param0;
        cj var3 = new cj(this.field_x);
        ga var4 = (ga) (var3.c((byte) -119));
        while (var4 != null) {
          var5 = var4.c(param0 ^ 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ga) (var3.a((byte) 61));
        }
        return var2;
    }

    boolean e(int param0) {
        if (param0 != -17741) {
          return false;
        }
        return null != this.d((byte) 35) ? true : false;
    }

    final void a(ga param0, int param1) {
        try {
          this.field_x.a(0, param0);
          if (param1 != 10) {
            this.c(30);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hp.JB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        int var4 = ZombieDawn.field_J;
        cj var2 = new cj(this.field_x);
        ga var3 = (ga) (var2.c((byte) -122));
        while (var3 != null) {
          var3.a(true);
          var3 = (ga) (var2.a((byte) 61));
        }
        if (param0 > -78) {
          field_C = false;
        }
    }

    hp(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
        this.field_x = new vo();
    }

    static {
        field_z = new af();
        field_y = "Time remaining: ";
        field_C = false;
        field_D = 0;
    }
}
