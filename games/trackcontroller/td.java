/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class td extends al implements je {
    ja field_B;

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 122, param3, param2, param1)) {
            this.a(34, param2, param3, param1);
            this.a((byte) -62, param3, param1, param2);
          }
          if (!param0) {
            stackIn_7_0 = (StringBuilder) (param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("td.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    td(int param0, int param1, int param2, int param3, t param4) {
        super(param0, param1, param2, param3, param4, (tg) null);
        this.field_B = new ja();
    }

    final boolean a(al param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        al var5 = null;
        ue var6 = null;
        al var7 = null;
        int var8 = 0;
        ue var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_B.b(false)) {
            return false;
          }
          var9 = new ue(this.field_B);
          var4 = 61 % ((53 - param1) / 47);
          var5 = (al) (var9.a(53));
          while (var5 != null) {
            if (var5.h(-118)) {
              var6 = new ue(this.field_B);
              var6.a(true, var5);
              var7 = (al) (var6.c(-114));
              while (var7 != null) {
                if (var7.a((byte) -127, param0)) {
                  return true;
                }
                var7 = (al) (var6.c(-128));
              }
            }
            var5 = (al) (var9.c(-106));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("td.CC(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(al param0, boolean param1) {
        RuntimeException var3 = null;
        al var4 = null;
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        ue var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_B.b(false)) {
            return false;
          }
          var8 = new ue(this.field_B);
          var4 = (al) (var8.d(-47));
          while (var4 != null) {
            if (var4.h(-92)) {
              var5 = new ue(this.field_B);
              var5.a((byte) -37, var4);
              var6 = (al) (var5.e(37));
              while (var6 != null) {
                if (!var6.a((byte) -123, param0)) {
                  var6 = (al) (var5.e(37));
                  continue;
                }
                return true;
              }
            }
            var4 = (al) (var8.e(37));
          }
          if (param1) {
            return false;
          }
          this.field_B = (ja) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("td.DC(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 0) {
          this.a(67, 29, 21, 61, -112);
        }
        ue var2 = new ue(this.field_B);
        al var3 = (al) (var2.d(120));
        while (var3 != null) {
          var3.g(119);
          var3 = (al) (var2.e(param0 ^ 37));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        ue var8 = null;
        RuntimeException var8_ref = null;
        al var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var8 = new ue(this.field_B);
          var9 = (al) (var8.d(81));
          if (param6 != 127) {
            return false;
          }
          while (var9 != null) {
            if (var9.b(param6 + 10000409)) {
              if (var9.h(-85) &&
                var9.a(param0, param1, param2, param3, param4, param5, (byte) 127)) {
                return true;
              }
              var9 = (al) (var8.e(37));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("td.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ue var8 = null;
        RuntimeException var8_ref = null;
        al var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var8 = new ue(this.field_B);
          if (param4 != 0) {
            this.field_B = (ja) null;
          }
          var9 = (al) (var8.d(-126));
          while (var9 != null) {
            if (var9.b(10000536)) {
              if (!var9.a(param0, param1, param2, param3, param4 ^ 0, param5 + this.field_p, this.field_m + param6)) {
                var9 = (al) (var8.e(37));
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
          stackIn_14_1 = new StringBuilder().append("td.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int c(byte param0) {
        int var2;
        ue var3;
        al var4;
        int var5;
        int var6;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        var3 = new ue(this.field_B);
        var4 = (al) (var3.d(0));
        while (var4 != null) {
          var5 = var4.c((byte) -14);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (al) (var3.e(37));
        }
        if (param0 != -14) {
          this.a(123, 7, -116, -2);
        }
        return var2;
    }

    al d(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(this.field_B);
        al var3 = (al) (var2.d(124));
        while (var3 != null) {
          if (var3.h(-94)) {
            return var3;
          }
          var3 = (al) (var2.e(37));
        }
        if (param0 < -124) {
          return null;
        }
        this.field_B = (ja) null;
        return null;
    }

    final void a(boolean param0, al param1) {
        try {
          if (param0) {
            this.field_B = (ja) null;
          }
          this.field_B.a((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "td.EC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        ue var2;
        al var3;
        String var4;
        int var5;
        al var6;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 != 0) {
          var6 = (al) null;
          this.a((al) null, -92, 62, 7, -56, 58, -36);
        }
        var2 = new ue(this.field_B);
        var3 = (al) (var2.d(86));
        while (var3 != null) {
          var4 = var3.e(0);
          if (var4 != null) {
            return var4;
          }
          var3 = (al) (var2.e(param0 + 37));
        }
        return null;
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        ue var7 = null;
        al var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var7 = new ue(this.field_B);
          var8 = (al) (var7.d(127));
          while (var8 != null) {
            if (var8.b(10000536)) {
              var8.a(param0, param1, param2, param3 + this.field_m, param4, param5 + this.field_p);
              var8 = (al) (var7.e(37));
              continue;
            }
            break;
          }
          if (param1) {
            this.f(77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("td.GB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(this.field_B);
        al var3 = (al) (var2.d(-58));
        while (var3 != null) {
          var3.f(-24174);
          var3 = (al) (var2.e(param0 ^ -24137));
        }
        if (param0 != -24174) {
          this.a(73, -81, 6, -13, -113);
        }
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        al var9 = null;
        ue var10 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          var6 = -126 % ((17 - param0) / 51);
          var10 = new ue(this.field_B);
          var9 = (al) (var10.d(125));
          while (var9 != null) {
            if (var9.b(10000536)) {
              if (var9.h(-119) &&
                var9.a((byte) 103, param1, param2, param3)) {
                return true;
              }
              var9 = (al) (var10.e(37));
              continue;
            }
            break;
          }
          var7 = param3;
          if (var7 != 80) {
            return false;
          }
          if (!ni.field_m[81]) {
            stackIn_14_0 = this.a(param2, true);
          } else {
            stackIn_14_0 = this.a(param2, -27);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("td.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        ue var5 = null;
        al var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != -62) {
            this.field_B = (ja) null;
          }
          var5 = new ue(this.field_B);
          var6 = (al) (var5.d(-99));
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; var7 <= param1; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.a(false, param2, param3, param1 + 1);
            var6 = (al) (var5.e(37));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("td.FC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TrackController.field_F ? 1 : 0;
        if (0 == param0 &&
          null != this.field_y) {
          this.field_y.a(-24969, (al) (this), param2, true, param1);
        }
        ue var5 = new ue(this.field_B);
        al var6 = (al) (var5.a(79));
        while (var6 != null) {
          var6.a(param0, this.field_p + param1, this.field_m + param2, 29221);
          var6 = (al) (var5.c(param3 ^ -29291));
        }
        if (param3 != 29221) {
          this.field_B = (ja) null;
        }
    }

    final boolean a(byte param0, al param1) {
        ue var3 = null;
        RuntimeException var3_ref = null;
        al var4 = null;
        int var5 = 0;
        al var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          var3 = new ue(this.field_B);
          var4 = (al) (var3.d(-122));
          if (param0 >= -104) {
            var6 = (al) null;
            this.a(false, (al) null);
          }
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a((byte) -114, param1)) {
              var4 = (al) (var3.e(37));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("td.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 > -83) {
          return true;
        }
        return this.d((byte) -127) != null ? true : false;
    }

    void a(int param0, int param1, byte param2, al param3) {
        RuntimeException runtimeException = null;
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new ue(this.field_B);
          var6 = (al) (var5.d(-66));
          while (var6 != null) {
            if (var6.b(10000536)) {
              var6.a(param0 + this.field_m, this.field_p + param1, (byte) -124, param3);
              var6 = (al) (var5.e(param2 ^ -95));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("td.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
