/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mi extends ub implements bg {
    ub field_F;
    static ga field_z;
    static kl field_y;
    static kl field_E;
    static fl field_D;
    static String field_C;
    static wc[] field_B;
    static bh field_A;

    void a(int param0, int param1, int param2, ub param3) {
        boolean discarded$1 = false;
        ub var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0 + 0, param1, param2, param3);
          if (this.field_F != null) {
            this.field_F.a(10000536, param1 + this.field_l, param2 + this.field_o, param3);
          }
          if (param0 != 10000536) {
            var6 = (ub) null;
            discarded$1 = this.b((ub) null, -77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("mi.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, param2, true)) {
            this.a(124, param2, param0, param3);
            this.a(param3, param2, param0, (byte) -84);
          }
          if (param1 != 102) {
            this.a(81, -127, 4, 117);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mi.U(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean a(ub param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 80) {
            this.c(false);
          }
          stackIn_7_0 = (this.field_F != null) && (!this.field_F.d((byte) 53)) && (this.field_F.a(param0, param1 ^ 88));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mi.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23023) {
            field_E = (kl) null;
          }
          stackIn_7_0 = (this.field_F != null) && (this.field_F.d((byte) 53)) && (this.field_F.a(param0, param1 + 0, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("mi.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8) {
            return true;
          }
          stackIn_7_0 = (null != this.field_F) && (this.field_F.a(param0, 8));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mi.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_A = null;
        field_z = null;
        field_E = null;
        field_C = null;
        field_B = null;
        field_D = null;
        field_y = null;
        if (param0 != -4) {
          field_E = (kl) null;
        }
    }

    final static void a(int param0, va param1, vh param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          pk var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = wizardrun.field_H;
          try {
            var18 = new pk();
            if (param0 != -21284) {
              field_z = (ga) null;
            }
            var18.field_r = param1.f(255);
            var18.field_i = param1.i(255);
            var18.field_l = new jh[var18.field_r];
            var18.field_k = new byte[var18.field_r][][];
            var18.field_m = new jh[var18.field_r];
            var18.field_p = new int[var18.field_r];
            var18.field_t = new int[var18.field_r];
            var18.field_j = new int[var18.field_r];
            for (var5 = 0; var18.field_r > var5; var5++) {
              try {
                var6_int = param1.f(255);
                if (var6_int != 0 &&
                  1 != var6_int &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    4 == var6_int) {
                    var20 = param1.d(param0 ^ -21284);
                    var8 = param1.d(0);
                    var9 = param1.f(255);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param1.d(0);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param1.i(255);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(true, var13, var21[var12_int], 0);
                      }
                    }
                    var18.field_t[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = qc.a(var10[var17], (byte) -39);
                      var17++;
                    }
                    var18.field_m[var5] = param2.a(var8, var12, qc.a(var20, (byte) -39), 3617);
                    var18.field_k[var5] = var21;
                  }
                } else {
                  var15 = param1.d(0);
                  dupTemp$1 = param1.d(0);
                  var16 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param1.i(255);
                  }
                  var18.field_t[var5] = var6_int;
                  var18.field_p[var5] = var9;
                  var18.field_l[var5] = param2.a(-8024, qc.a(var15, (byte) -39), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_j[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_j[var5] = -5;
              }
            }
            kj.field_d.a(var18, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("mi.DA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
            if (param2 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 23) {
          ub var3 = (ub) null;
          discarded$0 = this.a((ub) null, (byte) 92);
        }
        return null == this.field_F ? 0 : this.field_F.e((byte) 112);
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
          ub var3 = (ub) null;
          this.a('i', 63, (byte) -120, (ub) null);
        }
        return this.a((byte) -112) != null ? true : false;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          if (!wd.a((byte) 43, param0, param1)) {
            return false;
          }
          for (var3_int = param2; param0.length() > var3_int; var3_int++) {
            if (!df.a(param0.charAt(var3_int), true)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mi.KA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_F) {
            this.field_F.a(this.field_o + param0, param1, param2 + this.field_l, param3, param4, 0);
          }
          if (param5 != 0) {
            this.e(14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0 &&
          null != this.field_w) {
          this.field_w.a(param0, param3, (ub) (this), true, true);
        }
        if (this.field_F != null) {
          this.field_F.a(param0 + this.field_o, 0, param2, param3 + this.field_l);
        }
        if (param1 != 0) {
          this.e((byte) 12);
        }
    }

    String c(boolean param0) {
        String var3 = null;
        String var2 = super.c(param0);
        if (null != this.field_F) {
          var3 = this.field_F.c(false);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final static void d(int param0) {
        if (param0 != 3) {
          field_y = (kl) null;
        }
    }

    void e(int param0) {
        if (this.field_F != null) {
          this.field_F.c(117);
        }
        if (param0 != 81) {
          field_A = (bh) null;
        }
    }

    private final boolean b(ub param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 53) {
            field_z = (ga) null;
          }
          stackIn_7_0 = (null != this.field_F) && (!this.field_F.d((byte) 53)) && (this.field_F.a(param0, 8));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mi.GA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -3 % ((12 - param1) / 36);
          stackIn_4_0 = (null != this.field_F) && (this.field_F.a(param0 + this.field_o, (byte) -64, param2, this.field_l + param3, param4, param5, param6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("mi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -96) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) -43, -30, (StringBuilder) null);
          }
          if (this.field_F != null &&
            this.field_F.d((byte) 53) &&
            this.field_F.a(param0, param1, (byte) -101, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (!hi.field_p[81]) {
            stackIn_11_0 = this.a(param3, (byte) 80);
          } else {
            stackIn_11_0 = this.b(param3, 125);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("mi.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(123, param1, param2, param3, param4);
        if (param0 < 108) {
          field_B = (wc[]) null;
        }
        this.e(81);
    }

    final void b(boolean param0) {
        if (this.field_F != null) {
          this.field_F.b(false);
        }
        if (param0) {
          field_B = (wc[]) null;
        }
    }

    ub a(byte param0) {
        ub var2 = this.field_F;
        if (param0 > -29) {
          ub var3 = (ub) null;
          this.a(-35, (byte) -44, -59, -12, 44, -70, (ub) null);
        }
        if (var2 == null) {
          return null;
        }
        if (!var2.d((byte) 53)) {
          return null;
        }
        return var2;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        StringBuilder discarded$10 = null;
        int var6 = 0;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$11 = null;
        int var5_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = wizardrun.field_H;
        try {
          discarded$10 = param0.append('\n');
          var5_int = 66 / ((13 - param3) / 44);
          for (var6 = 0; param1 >= var6; var6++) {
            discarded$12 = param0.append(' ');
          }
          if (this.field_F != null) {
            this.field_F.a(param2, (byte) 102, 1 + param1, param0);
          } else {
            discarded$11 = param0.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mi.JA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    mi(int param0, int param1, int param2, int param3, bf param4, ce param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        field_z = new ga();
        field_C = "Unable to connect to the data server. Please check any firewall you are using.";
        field_A = new bh(10, 2, 2, 0);
    }
}
