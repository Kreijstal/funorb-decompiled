/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ee extends el implements ql {
    static String field_y;
    static dm field_A;
    tf field_z;
    static String[] field_x;
    static int[] field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        gb var8 = null;
        RuntimeException var8_ref = null;
        el var9_ref_el = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          var8 = new gb(this.field_z);
          var9_ref_el = (el) ((Object) var8.c((byte) 88));
          L0: while (var9_ref_el != null) {
            if (var9_ref_el.a(118)) {
              if (var9_ref_el.a(param0 + this.field_m, 60, this.field_v + param2, param3, param4, param5, param6)) {
                return true;
              }
              var9_ref_el = (el) ((Object) var8.a((byte) 109));
              continue L0;
            }
            break;
          }
          var9 = -13 / ((-3 - param1) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var8_ref);
          stackIn_13_1 = new StringBuilder().append("ee.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
          if (param0 != 0) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            this.a(param2, param1, -3188, param3);
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var5);
          stackIn_10_1 = new StringBuilder().append("ee.PA(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        int var2 = 0;
        gb var3 = new gb(this.field_z);
        el var4 = (el) ((Object) var3.c((byte) 88));
        if (param0 < 82) {
            field_y = (String) null;
        }
        while (var4 != null) {
            var5 = var4.d((byte) 91);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (el) ((Object) var3.a((byte) 110));
        }
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            StringBuilder var3 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, -120, -15);
        }
        return null != this.f((byte) -99) ? true : false;
    }

    final boolean a(int param0, el param1) {
        RuntimeException var3 = null;
        el var4 = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        gb var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          if (this.field_z.c(13519)) {
            return false;
          }
          var8 = new gb(this.field_z);
          var4 = (el) ((Object) var8.d(1));
          if (param0 != 7305) {
            field_B = (int[]) null;
          }
          L1: while (var4 != null) {
            L2: {
              if (var4.e((byte) 54)) {
                var5 = new gb(this.field_z);
                var5.a(var4, (byte) 123);
                var6 = (el) ((Object) var5.c(26));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  }
                  if (!var6.a((byte) -39, param1)) {
                    var6 = (el) ((Object) var5.c(26));
                    continue L3;
                  }
                  return true;
                }
              }
            }
            var4 = (el) ((Object) var8.c(26));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var3);
          stackIn_20_1 = new StringBuilder().append("ee.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void a(boolean param0, int param1, el param2, int param3) {
        RuntimeException runtimeException = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new gb(this.field_z);
          var6 = (el) ((Object) var5.c((byte) 88));
          L0: while (var6 != null) {
            if (var6.a(122)) {
              var6.a(false, this.field_m + param1, param2, this.field_v + param3);
              var6 = (el) ((Object) var5.a((byte) 123));
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (runtimeException);
          stackIn_8_1 = new StringBuilder().append("ee.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var8 = Geoblox.field_C;
        if (param3 == 0) {
            if (!(this.field_q == null)) {
                this.field_q.a(param0, -9, param1, true, (el) (this));
            }
        }
        int var6 = -58 % ((param2 - 1) / 43);
        gb var5 = new gb(this.field_z);
        el var7 = (el) ((Object) var5.d(1));
        while (var7 != null) {
            var7.a(this.field_v + param0, param1 + this.field_m, (byte) 93, param3);
            var7 = (el) ((Object) var5.c(26));
        }
    }

    public static void e(int param0) {
        if (param0 != 14078) {
            return;
        }
        field_x = null;
        field_y = null;
        field_B = null;
        field_A = null;
    }

    final String c(byte param0) {
        gb var2;
        el var3;
        String var4;
        var2 = new gb(this.field_z);
        if (param0 != 69) {
          field_A = (dm) null;
        }
        var3 = (el) ((Object) var2.c((byte) 88));
        L1: while (var3 != null) {
          var4 = var3.c((byte) 69);
          if (var4 != null) {
            return var4;
          }
          var3 = (el) ((Object) var2.a((byte) 111));
        }
        return null;
    }

    private final void g(byte param0) {
        gb var2 = new gb(this.field_z);
        el var3 = (el) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.c(116);
            var3 = (el) ((Object) var2.a((byte) 108));
        }
        int var4 = 71 / ((param0 - 57) / 51);
    }

    final boolean a(el param0, int param1) {
        gb var3 = null;
        RuntimeException var3_ref = null;
        el var4 = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          if (this.field_z.c(13519)) {
            return false;
          }
          var3 = new gb(this.field_z);
          if (param1 > -75) {
            return true;
          }
          var4 = (el) ((Object) var3.c((byte) 88));
          L0: while (var4 != null) {
            L1: {
              if (var4.e((byte) 54)) {
                var5 = new gb(this.field_z);
                var5.a((byte) 56, var4);
                var6 = (el) ((Object) var5.a((byte) 114));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  }
                  if (!var6.a((byte) -56, param0)) {
                    var6 = (el) ((Object) var5.a((byte) 114));
                    continue L2;
                  }
                  return true;
                }
              }
            }
            var4 = (el) ((Object) var3.a((byte) 109));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = (RuntimeException) (var3_ref);
          stackIn_22_1 = new StringBuilder().append("ee.RA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_z);
        if (param0 > -122) {
            field_B = (int[]) null;
        }
        el var3 = (el) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.d(-126);
            var3 = (el) ((Object) var2.a((byte) 121));
        }
    }

    ee(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (bb) null);
        this.field_z = new tf();
    }

    final boolean a(byte param0, el param1) {
        gb var3 = null;
        RuntimeException var3_ref = null;
        el var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          var3 = new gb(this.field_z);
          if (param0 >= -30) {
            return false;
          }
          var4 = (el) ((Object) var3.c((byte) 88));
          L0: while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a((byte) -123, param1)) {
              var4 = (el) ((Object) var3.a((byte) 125));
              continue L0;
            }
            return true;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var3_ref);
          stackIn_14_1 = new StringBuilder().append("ee.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) -21, param3, param4);
        if (param2 >= -6) {
            this.c((byte) 85);
        }
        this.g((byte) 123);
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        gb var7 = null;
        el var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Geoblox.field_C;
        try {
          var7 = new gb(this.field_z);
          var8 = (el) ((Object) var7.c((byte) 88));
          L0: while (var8 != null) {
            if (var8.a(122)) {
              var8.a(param0 + this.field_v, param1, true, param3, this.field_m + param4, param5);
              var8 = (el) ((Object) var7.a((byte) 109));
              continue L0;
            }
            break;
          }
          if (!param2) {
            this.c((byte) -6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var7_ref);
          stackIn_10_1 = new StringBuilder().append("ee.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        el var8 = null;
        gb var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          var9 = new gb(this.field_z);
          if (param1 != 13) {
            this.d(-77);
          }
          var8 = (el) ((Object) var9.c((byte) 88));
          L1: while (var8 != null) {
            if (var8.a(120)) {
              if (var8.e((byte) 54)) {
                if (var8.a(param0, 13, param2, param3)) {
                  return true;
                }
              }
              var8 = (el) ((Object) var9.a((byte) 110));
              continue L1;
            }
            break;
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (!kj.field_o[81]) {
            stackIn_17_0 = this.a(param3, -96);
          } else {
            stackIn_17_0 = this.a(7305, param3);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var5);
          stackIn_20_1 = new StringBuilder().append("ee.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        el var6 = null;
        int var8 = 0;
        el var9 = null;
        gb var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Geoblox.field_C;
        try {
          var10 = new gb(this.field_z);
          var6 = (el) ((Object) var10.c((byte) 88));
          if (param2 != -3188) {
            var9 = (el) null;
            this.a(true, 26, (el) null, 23);
          }
          L1: while (var6 != null) {
            discarded$3 = param1.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param1.append(' ');
            }
            var6.a(0, param1, param0, param3 + 1);
            var6 = (el) ((Object) var10.a((byte) 125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var5);
          stackIn_11_1 = new StringBuilder().append("ee.FB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    el f(byte param0) {
        gb var2;
        el var3;
        int var4;
        var4 = Geoblox.field_C;
        if (param0 >= -60) {
          field_y = (String) null;
        }
        var2 = new gb(this.field_z);
        var3 = (el) ((Object) var2.c((byte) 88));
        L1: while (var3 != null) {
          if (var3.e((byte) 54)) {
            return var3;
          }
          var3 = (el) ((Object) var2.a((byte) 121));
        }
        return null;
    }

    final void b(byte param0, el param1) {
        try {
            this.field_z.a(-113, param1);
            if (param0 >= -60) {
                field_A = (dm) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ee.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        RuntimeException var8 = null;
        el var9 = null;
        int var10 = 0;
        gb var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          var11 = new gb(this.field_z);
          if (param3 != -1) {
            this.a(-119, -117, (byte) 87, 105, 63);
          }
          var9 = (el) ((Object) var11.c((byte) 88));
          L1: while (var9 != null) {
            if (var9.a(127)) {
              if (var9.e((byte) 54)) {
                if (var9.a(param0, param1, param2, param3 + 0, param4, param5, param6)) {
                  return true;
                }
              }
              var9 = (el) ((Object) var11.a((byte) 124));
              continue L1;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var8);
          stackIn_15_1 = new StringBuilder().append("ee.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_y = "To server list";
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_B = new int[]{1, 2, 0, 3, 6, 5, 4};
    }
}
