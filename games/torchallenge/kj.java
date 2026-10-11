/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kj extends ee implements gk {
    static ka[] field_C;
    sl field_F;
    static int field_D;
    static sl field_B;
    static String field_E;
    static String field_H;
    static int field_A;
    static int field_G;
    static boolean[] field_I;

    final boolean a(ee param0, int param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        ee var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var3 = new nj(this.field_F);
          var4 = (ee) (var3.c(param1));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, 0)) {
              var4 = (ee) (var3.a(false));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("kj.RA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (0 == param3 &&
          this.field_q != null) {
          this.field_q.a((ee) (this), param0, param1, (byte) 97, true);
        }
        nj var5 = new nj(this.field_F);
        ee var6 = (ee) (var5.a(-48));
        while (var6 != null) {
          var6.a(this.field_i + param0, param1 + this.field_m, false, param3);
          var6 = (ee) (var5.c((byte) -13));
        }
        if (param2) {
          field_E = (String) null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = hl.field_d;
        synchronized (var1) {
          if (kc.field_n == ja.field_f) {
            return false;
          }
          b.field_J = fj.field_C[ja.field_f];
          di.field_m = ql.field_k[ja.field_f];
          ja.field_f = ja.field_f + 1 & 127;
          var2 = 93 % ((param0 - 48) / 46);
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, -125, param2)) {
            this.a(param2, 127, param0, param1);
            this.a(param0, param2, param1, 127);
          }
          if (!param3) {
            kj.g(7);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kj.W(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 != -15000) {
          return 36;
        }
        nj var3 = new nj(this.field_F);
        ee var4 = (ee) (var3.c(0));
        while (var4 != null) {
          var5 = var4.e(-15000);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ee) (var3.a(false));
        }
        return var2;
    }

    kj(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (gg) null);
        this.field_F = new sl();
    }

    final boolean b(int param0, ee param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        StringBuilder var8 = null;
        nj var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 < 70) {
            var8 = (StringBuilder) null;
            this.a((Hashtable) null, -30, (StringBuilder) null, true);
          }
          if (this.field_F.d(-127)) {
            return false;
          }
          var9 = new nj(this.field_F);
          var4 = (ee) (var9.c(0));
          while (var4 != null) {
            if (var4.c(94)) {
              var5 = new nj(this.field_F);
              var5.b(var4, -117);
              var6 = (ee) (var5.a(false));
              while (var6 != null) {
                if (!var6.a(param1, 0)) {
                  var6 = (ee) (var5.a(false));
                  continue;
                }
                return true;
              }
            }
            var4 = (ee) (var9.a(false));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("kj.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String b(boolean param0) {
        nj var2;
        ee var3;
        String var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(this.field_F);
        if (param0) {
          field_D = -74;
        }
        var3 = (ee) (var2.c(0));
        while (var3 != null) {
          var4 = var3.b(param0);
          if (var4 != null) {
            return var4;
          }
          var3 = (ee) (var2.a(false));
        }
        return null;
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        nj var7 = null;
        ee var8_ref_ee = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = new nj(this.field_F);
          var8_ref_ee = (ee) (var7.c(0));
          while (var8_ref_ee != null) {
            if (var8_ref_ee.b(11163)) {
              var8_ref_ee.a(this.field_i + param0, (byte) 31, param2, param3 + this.field_m, param4, param5);
              var8_ref_ee = (ee) (var7.a(false));
              continue;
            }
            break;
          }
          var8 = -88 % ((-29 - param1) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("kj.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 <= 76) {
          return true;
        }
        return null != this.d((byte) 107) ? true : false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(te.field_b);
          param1.addMouseMotionListener(te.field_b);
          param1.addFocusListener(te.field_b);
          int var2_int = -85 % ((param0 + 48) / 57);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kj.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        nj var5 = null;
        ee var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var5 = new nj(this.field_F);
          var6 = (ee) (var5.c(0));
          while (var6 != null) {
            discarded$2 = param1.append('\n');
            for (var7 = 0; var7 <= param2; var7++) {
              discarded$3 = param1.append(' ');
            }
            var6.a(param0, param2 + 1, param1, true);
            var6 = (ee) (var5.a(false));
          }
          if (param3 != 127) {
            field_A = 9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("kj.VB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ee d(byte param0) {
        nj var2;
        ee var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(this.field_F);
        if (param0 != 107) {
          return (ee) null;
        }
        var3 = (ee) (var2.c(0));
        while (var3 != null) {
          if (var3.c(109)) {
            return var3;
          }
          var3 = (ee) (var2.a(false));
        }
        return null;
    }

    final void a(int param0, ee param1) {
        try {
          this.field_F.a(param1, param0 - 128);
          if (param0 != 0) {
            StringBuilder var4 = (StringBuilder) null;
            this.a((Hashtable) null, 58, (StringBuilder) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kj.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 < 100) {
          field_H = (String) null;
        }
        super.a((byte) 126, param1, param2, param3, param4);
        this.c((byte) 112);
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ee var8 = null;
        nj var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var9 = new nj(this.field_F);
          var8 = (ee) (var9.c(0));
          while (var8 != null) {
            if (var8.b(11163)) {
              if (var8.c(80) &&
                var8.a(param0, param1, (byte) 73, param3)) {
                return true;
              }
              var8 = (ee) (var9.a(false));
              continue;
            }
            break;
          }
          var6 = param0;
          if (var6 == 80) {
            if (nj.field_c[81]) {
              stackIn_15_0 = this.a(param3, (byte) -16);
            } else {
              stackIn_15_0 = this.b(89, param3);
            }
            return stackIn_15_0;
          }
          if (param2 >= 9) {
            return false;
          }
          field_E = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("kj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
        nj var8 = null;
        RuntimeException var8_ref = null;
        ee var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var8 = new nj(this.field_F);
          var9 = (ee) (var8.c(param0));
          while (var9 != null) {
            if (var9.b(11163)) {
              if (var9.c(103) &&
                var9.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (ee) (var8.a(false));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = var8_ref;
          stackIn_13_1 = new StringBuilder().append("kj.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(ee param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 > -97) {
            this.a(58, 106, true, -8);
          }
          super.a(param0, param1, (byte) -100, param3);
          var5 = new nj(this.field_F);
          var6 = (ee) (var5.c(0));
          while (var6 != null) {
            if (var6.b(11163)) {
              var6.a(param0, this.field_m + param1, (byte) -111, param3 + this.field_i);
              var6 = (ee) (var5.a(false));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("kj.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(this.field_F);
        if (param0 != 6064) {
          return;
        }
        ee var3 = (ee) (var2.c(0));
        while (var3 != null) {
          var3.d(6064);
          var3 = (ee) (var2.a(false));
        }
    }

    private final void c(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 112) {
          ee var5 = (ee) null;
          this.b(20, (ee) null);
        }
        nj var2 = new nj(this.field_F);
        ee var3 = (ee) (var2.c(param0 - 112));
        while (var3 != null) {
          var3.b((byte) 113);
          var3 = (ee) (var2.a(false));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        nj var8 = null;
        RuntimeException var8_ref = null;
        ee var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var8 = new nj(this.field_F);
          if (param2 != -81) {
            return false;
          }
          var9 = (ee) (var8.c(0));
          while (var9 != null) {
            if (var9.b(11163)) {
              if (var9.a(param0, param1, -81, param3 + this.field_i, this.field_m + param4, param5, param6)) {
                return true;
              }
              var9 = (ee) (var8.a(false));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("kj.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(ee param0, byte param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        ee var8 = null;
        nj var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_F.d(param1 ^ 116)) {
            return false;
          }
          var9 = new nj(this.field_F);
          if (param1 != -16) {
            var8 = (ee) null;
            this.a(-35, (byte) -17, (ee) null, 41, 16, 15);
          }
          var4 = (ee) (var9.a(-108));
          while (var4 != null) {
            if (var4.c(110)) {
              var5 = new nj(this.field_F);
              var5.a(var4, -61);
              var6 = (ee) (var5.c((byte) -13));
              while (var6 != null) {
                if (var6.a(param0, 0)) {
                  return true;
                }
                var6 = (ee) (var5.c((byte) -13));
              }
            }
            var4 = (ee) (var9.c((byte) -13));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kj.BC(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 74) {
            var4 = (CharSequence) null;
            kj.a((byte) 70, (CharSequence) null, 37);
          }
          stackIn_3_0 = vh.a((byte) 86, true, param2, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kj.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_H = null;
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 != -10365) {
          field_D = 8;
        }
        field_B = null;
    }

    static {
        field_D = 0;
        field_B = new sl();
        field_G = -1;
        field_I = new boolean[6];
        field_H = "Sound: ";
        field_A = -1;
        field_E = "Return to game";
    }
}
