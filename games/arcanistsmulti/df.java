/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class df extends qm implements a {
    static String field_A;
    vn field_B;
    static int field_y;
    static String field_x;
    static ab field_z;

    final boolean b(int param0, qm param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        oc var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_B.b(true)) {
            return false;
          }
          var8 = new oc(this.field_B);
          var4 = (qm) (var8.b(-73));
          if (param0 != 2) {
            this.field_B = (vn) null;
          }
          while (var4 != null) {
            if (var4.d(-2116)) {
              var5 = new oc(this.field_B);
              var5.a(false, var4);
              var6 = (qm) (var5.d(-18502));
              while (var6 != null) {
                if (var6.a(0, param1)) {
                  return true;
                }
                var6 = (qm) (var5.d(param0 ^ -18504));
              }
            }
            var4 = (qm) (var8.d(-18502));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("df.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        qm var8 = null;
        oc var9 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var9 = new oc(this.field_B);
          var8 = (qm) (var9.b(-127));
          while (var8 != null) {
            if (var8.b((byte) -66)) {
              if (var8.d(-2116) &&
                var8.a(param0, (byte) -122, param2, param3)) {
                return true;
              }
              var8 = (qm) (var9.d(-18502));
              continue;
            }
            break;
          }
          var6 = param3;
          if (var6 == 80) {
            if (ri.field_b[81]) {
              stackIn_14_0 = this.a(param0, 9555);
            } else {
              stackIn_14_0 = this.b(2, param0);
            }
            return stackIn_14_0;
          }
          if (param1 < -120) {
            return false;
          }
          field_x = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("df.N(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void d(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(this.field_B);
        if (param0 != 29) {
          return;
        }
        qm var3 = (qm) (var2.b(-34));
        while (var3 != null) {
          var3.d((byte) 29);
          var3 = (qm) (var2.d(-18502));
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          cb.field_a = true;
          if (param0 != 1) {
            df.c(true);
          }
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          sm.a(var4, var2, param1, param0 - 15368, var3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "df.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        qm var6 = null;
        int var8 = 0;
        qm var9 = null;
        oc var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var10 = new oc(this.field_B);
          if (!param3) {
            var9 = (qm) null;
            this.a((qm) null, 121, -97, 14);
          }
          var6 = (qm) (var10.b(-51));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param1 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(param2, param1 + 1, param0, (byte) 113);
            var6 = (qm) (var10.d(-18502));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("df.LB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    qm e(int param0) {
        oc var2;
        qm var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 852710177) {
          field_x = (String) null;
        }
        var2 = new oc(this.field_B);
        var3 = (qm) (var2.b(-70));
        while (var3 != null) {
          if (var3.d(param0 - 852712293)) {
            return var3;
          }
          var3 = (qm) (var2.d(-18502));
        }
        return null;
    }

    boolean a(int param0, qm param1) {
        oc var3 = null;
        RuntimeException var3_ref = null;
        qm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = new oc(this.field_B);
          var4 = (qm) (var3.b(-74));
          while (var4 != null) {
            if (var4.a(0, param1)) {
              return true;
            }
            var4 = (qm) (var3.d(param0 ^ -18502));
          }
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("df.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    df(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
        this.field_B = new vn();
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > -52) {
          field_A = (String) null;
        }
        if (param2 == 0 &&
          null != this.field_r) {
          this.field_r.a((qm) (this), 5592405, param1, param3, true);
        }
        oc var5 = new oc(this.field_B);
        qm var6 = (qm) (var5.c(-116));
        while (var6 != null) {
          var6.a((byte) -64, this.field_n + param1, param2, param3 + this.field_j);
          var6 = (qm) (var5.c(true));
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 2 / ((-54 - param0) / 54);
        mj.field_p = param1;
        pn.field_c = null;
        co.c(112);
    }

    final void c(int param0, qm param1) {
        if (param0 >= -63) {
          return;
        }
        try {
          this.field_B.b(param1, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "df.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        qm var10 = null;
        int var11 = 0;
        oc var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var9 = 67 / ((-42 - param4) / 35);
          var12 = new oc(this.field_B);
          var10 = (qm) (var12.b(-46));
          while (var10 != null) {
            if (var10.b((byte) -105)) {
              if (var10.a(param0, param1, param2, param3 + this.field_j, 89, param5, this.field_n + param6)) {
                return true;
              }
              var10 = (qm) (var12.d(-18502));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("df.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, -125);
        this.f(-28475);
        if (param4 >= -49) {
          Hashtable var7 = (Hashtable) null;
          this.a((StringBuilder) null, 92, (Hashtable) null, (byte) 58);
        }
    }

    final static void d(boolean param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        fj stackIn_54_0 = null;
        boolean stackIn_55_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fj var4 = null;
        rf var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ab var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var27 = field_z;
          var2 = var27.e((byte) -127);
          if (param0) {
            return;
          }
          if (var2 == 0) {
            var3 = var27.n(-98);
            var4_ref = (rf) (ef.field_u.b(12623));
            while (var4_ref != null) {
              if (var3 != var4_ref.field_i) {
                var4_ref = (rf) (ef.field_u.a(0));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              ka.b(false);
              return;
            }
            var5 = var27.e((byte) 112);
            if (var5 == 0) {
              var4_ref.a(true);
              return;
            }
            var6 = var4_ref.field_m;
            lc.field_q[0].field_e = ah.field_b;
            var7 = var4_ref.field_h;
            lc.field_q[0].field_j = false;
            lc.field_q[0].field_f = null;
            for (var8_int = 1; var5 > var8_int; var8_int++) {
              lc.field_q[var8_int].field_e = var27.l(-1);
              lc.field_q[var8_int].field_j = false;
              if (var27.e((byte) 35) == 1) {
                lc.field_q[var8_int].field_f = var27.l(-1);
              } else {
                lc.field_q[var8_int].field_f = null;
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var34 = new long[3][var6];
            var35 = new int[3][var6 * var7];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var27.e((byte) 97);
            if (var18 <= 0) {
              var4_ref.a(true);
              return;
            }
            for (var19 = 0; var19 < var18; var19++) {
              var20 = var27.e((byte) 107);
              var21 = lc.field_q[var20].field_e;
              var22 = var27.c(-943038560);
              var24 = var27.field_g;
              if (var6 > var19) {
                var8[0][var12] = var21;
                var9[0][var12] = lc.field_q[var20].field_f;
                var34[0][var12] = var22;
                for (var25 = 0; var7 > var25; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var35[0][incrementValue$0] = var27.d(-10674);
                }
                var12++;
              }
              if (var21 != null &&
                je.a(16, var21)) {
                var8[1][var13] = ah.field_b;
                var9[1][var13] = null;
                var34[1][var13] = var22;
                var27.field_g = var24;
                var13++;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var35[1][incrementValue$1] = var27.d(-10674);
                }
              }
              if (var6 > var14 &&
                !lc.field_q[var20].field_j) {
                lc.field_q[var20].field_j = true;
                var8[2][var14] = var21;
                var9[2][var14] = lc.field_q[var20].field_f;
                var34[2][var14] = var22;
                var27.field_g = var24;
                var14++;
                for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var35[2][incrementValue$2] = var27.d(-10674);
                }
              }
            }
            var4_ref.a(true);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.n(-98);
            var27.c(-943038560);
            var4 = (fj) (me.field_O.b(12623));
            while (var4 != null) {
              if (var3Lifetime1 != var4.field_k) {
                var4 = (fj) (me.field_O.a(0));
                continue;
              }
              break;
            }
            if (var4 == null) {
              ka.b(false);
              return;
            }
            stackIn_54_0 = var4;
            stackIn_55_1 = !(param0);
            ((fj) (Object) stackIn_54_0).a(stackIn_55_1);
            return;
          }
          jh.a((Throwable) null, "HS1: " + nn.g((byte) -25), (byte) 20);
          ka.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "df.NB(" + param0 + ')');
        }
    }

    String b(boolean param0) {
        oc var2;
        qm var3;
        String var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0) {
          field_y = 66;
        }
        var2 = new oc(this.field_B);
        var3 = (qm) (var2.b(-53));
        while (var3 != null) {
          var4 = var3.b(param0);
          if (var4 != null) {
            return var4;
          }
          var3 = (qm) (var2.d(-18502));
        }
        return null;
    }

    private final void f(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(this.field_B);
        qm var3 = (qm) (var2.b(-97));
        while (var3 != null) {
          var3.e((byte) 112);
          var3 = (qm) (var2.d(-18502));
        }
        if (param0 != -28475) {
          field_x = (String) null;
        }
    }

    boolean d(int param0) {
        if (param0 != -2116) {
          this.field_B = (vn) null;
        }
        return this.e(852710177) != null ? true : false;
    }

    void a(qm param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new oc(this.field_B);
          var6 = (qm) (var5.b(-83));
          while (var6 != null) {
            if (var6.b((byte) -121)) {
              var6.a(param0, param1 + this.field_n, 170, param3 + this.field_j);
              var6 = (qm) (var5.d(-18502));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("df.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param0;
        oc var3 = new oc(this.field_B);
        qm var4 = (qm) (var3.b(param0 - 46));
        while (var4 != null) {
          var5 = var4.c(0);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (qm) (var3.d(-18502));
        }
        return var2;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -70 / ((param3 - 50) / 60);
          if (this.a(param0, (byte) -90, param2, param1)) {
            this.a(param0, param1, param2, 1);
            this.a(param2, param1, param0, true);
          }
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("df.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        oc var7 = null;
        qm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7 = new oc(this.field_B);
          var8 = (qm) (var7.b(-78));
          while (var8 != null) {
            if (var8.b((byte) -99)) {
              var8.a(param0, -20592, param2, this.field_j + param3, this.field_n + param4, param5);
              var8 = (qm) (var7.d(-18502));
              continue;
            }
            break;
          }
          if (param1 != -20592) {
            this.a(102, 115, 115, -112, 24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("df.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          df.a((byte) -32, -73);
        }
        field_x = null;
        field_A = null;
        field_z = null;
    }

    final boolean a(qm param0, int param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        oc var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_B.b(true)) {
            return false;
          }
          if (param1 != 9555) {
            field_A = (String) null;
          }
          var8 = new oc(this.field_B);
          var4 = (qm) (var8.c(114));
          while (var4 != null) {
            if (var4.d(param1 - 11671)) {
              var5 = new oc(this.field_B);
              var5.a(402, var4);
              var6 = (qm) (var5.c(true));
              while (var6 != null) {
                if (var6.a(param1 - 9555, param0)) {
                  return true;
                }
                var6 = (qm) (var5.c(true));
              }
            }
            var4 = (qm) (var8.c(true));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("df.PB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        oc var8 = null;
        RuntimeException var8_ref = null;
        qm var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param5 != 0) {
            this.e(117);
          }
          var8 = new oc(this.field_B);
          var9 = (qm) (var8.b(-113));
          while (var9 != null) {
            if (var9.b((byte) -80)) {
              if (var9.d(-2116) &&
                var9.a(param0, param1, param2, param3, param4, 0, param6)) {
                return true;
              }
              var9 = (qm) (var8.d(-18502));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("df.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_A = "You must play <%1> more rated games before playing with the current options.";
        field_x = "Book of Storm";
    }
}
