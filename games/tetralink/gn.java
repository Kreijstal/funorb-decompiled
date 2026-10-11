/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gn extends na implements nf {
    static hl field_I;
    je field_J;

    final void c(na param0, int param1) {
        try {
          if (param1 != 10) {
            na var4 = (na) null;
            this.a(-79, 'Y', -110, (na) null);
          }
          this.field_J.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gn.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        tg var8 = null;
        RuntimeException var8_ref = null;
        na var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TetraLink.field_J;
        try {
          var8 = new tg(this.field_J);
          var9 = (na) (var8.a(true));
          if (param0 != -19137) {
            return false;
          }
          while (var9 != null) {
            if (var9.a((byte) 95)) {
              if (var9.c(param0 ^ -19140) &&
                var9.a(-19137, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (na) (var8.b((byte) -58));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("gn.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        tg var5 = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          super.a(param0, param1, param2, true);
          var5 = new tg(this.field_J);
          var6 = (na) (var5.a(param3));
          while (var6 != null) {
            if (var6.a((byte) 95)) {
              var6.a(param0, this.field_t + param1, param2 + this.field_w, true);
              var6 = (na) (var5.b((byte) -58));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("gn.MA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        tg var5 = null;
        na var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          if (param0 != 14) {
            gn.d(true);
          }
          var5 = new tg(this.field_J);
          var6 = (na) (var5.a(true));
          while (var6 != null) {
            discarded$3 = param1.append('\n');
            for (var7 = 0; param2 >= var7; var7++) {
              discarded$4 = param1.append(' ');
            }
            var6.a(param3, param1, 1 + param2, -372494750);
            var6 = (na) (var5.b((byte) -58));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("gn.CC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
          field_I = (hl) null;
        }
        return null != this.d((byte) 5) ? true : false;
    }

    final boolean a(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var3 = new tg(this.field_J);
          if (param1 != -384169950) {
            return true;
          }
          var4 = (na) (var3.a(true));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, -384169950)) {
              var4 = (na) (var3.b((byte) -58));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("gn.EB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        tg var5 = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          if (param1 <= 107) {
            return true;
          }
          if (this.field_J.b(true)) {
            return false;
          }
          var3 = new tg(this.field_J);
          var4 = (na) (var3.a(true));
          while (var4 != null) {
            if (var4.c(3)) {
              var5 = new tg(this.field_J);
              var5.a(-106, var4);
              var6 = (na) (var5.b((byte) -58));
              while (var6 != null) {
                if (var6.a(param0, -384169950)) {
                  return true;
                }
                var6 = (na) (var5.b((byte) -58));
              }
            }
            var4 = (na) (var3.b((byte) -58));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("gn.WB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(this.field_J);
        na var3 = (na) (var2.a(true));
        while (var3 != null) {
          var3.b((byte) 123);
          var3 = (na) (var2.b((byte) -58));
        }
        if (param0 <= 39) {
          this.field_J = (je) null;
        }
    }

    String e(int param0) {
        tg var2;
        na var3;
        String var4;
        int var5;
        var5 = TetraLink.field_J;
        var2 = new tg(this.field_J);
        var3 = (na) (var2.a(true));
        if (param0 != 0) {
          this.field_J = (je) null;
        }
        while (var3 != null) {
          var4 = var3.e(0);
          if (var4 != null) {
            return var4;
          }
          var3 = (na) (var2.b((byte) -58));
        }
        return null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 67 % ((-61 - param2) / 51);
        super.a(param0, param1, 15, param3, param4);
        this.g(55);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TetraLink.field_J;
        if (param0 != 0) {
          return;
        }
        if (param3 == 0 &&
          this.field_H != null) {
          this.field_H.a((na) (this), param1, param2, true, true);
        }
        tg var5 = new tg(this.field_J);
        na var6 = (na) (var5.b(param0 + 90));
        while (var6 != null) {
          var6.a(0, this.field_t + param1, param2 + this.field_w, param3);
          var6 = (na) (var5.a((byte) -66));
        }
    }

    final int d(int param0) {
        int var2;
        tg var3;
        na var4;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = new tg(this.field_J);
        var4 = (na) (var3.a(true));
        while (var4 != null) {
          var5 = var4.d(-128);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (na) (var3.b((byte) -58));
        }
        if (param0 > -114) {
          field_I = (hl) null;
        }
        return var2;
    }

    na d(byte param0) {
        tg var2;
        na var3;
        int var4;
        var4 = TetraLink.field_J;
        if (param0 != 5) {
          this.field_J = (je) null;
        }
        var2 = new tg(this.field_J);
        var3 = (na) (var2.a(true));
        while (var3 != null) {
          if (var3.c(3)) {
            return var3;
          }
          var3 = (na) (var2.b((byte) -58));
        }
        return null;
    }

    gn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
        this.field_J = new je();
    }

    final static void a(int param0, int param1, int param2, byte[] param3, int[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          var5_int = param0;
          while (true) {
            if (var5_int >= ug.field_bb.length) {
              return;
            }
            param1 = ug.field_bb[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param2 = lg.field_ab[incrementValue$1];
              dupTemp$2 = param3[param2];
              dupTemp$3 = param4[dupTemp$2];
              param4[dupTemp$2] = dupTemp$3 + 1;
              lg.field_ab[dupTemp$3] = param2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gn.EC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean d(na param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        na var5 = null;
        tg var6 = null;
        na var7 = null;
        int var8 = 0;
        tg var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          if (this.field_J.b(true)) {
            return false;
          }
          var9 = new tg(this.field_J);
          var4 = 71 % ((-40 - param1) / 53);
          var5 = (na) (var9.b(-55));
          while (var5 != null) {
            if (var5.c(3)) {
              var6 = new tg(this.field_J);
              var6.a(true, var5);
              var7 = (na) (var6.a((byte) -66));
              while (var7 != null) {
                if (var7.a(param0, -384169950)) {
                  return true;
                }
                var7 = (na) (var6.a((byte) -66));
              }
            }
            var5 = (na) (var9.a((byte) -66));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("gn.AC(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        na var9 = null;
        int var10 = 0;
        na var11 = null;
        tg var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TetraLink.field_J;
        try {
          var12 = new tg(this.field_J);
          if (param4 != -32738) {
            var11 = (na) null;
            this.b((na) null, 58);
          }
          var9 = (na) (var12.a(true));
          while (var9 != null) {
            if (var9.a((byte) 95)) {
              if (var9.a(param0, param1 + this.field_t, param2, param3 + this.field_w, -32738, param5, param6)) {
                return true;
              }
              var9 = (na) (var12.b((byte) -58));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("gn.PA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
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
          if (this.a(param0, param2, param3 ^ -372494754, param1)) {
            this.a(param3 + 372494636, param1, param0, param2);
            this.a((byte) 14, param1, param2, param0);
          }
          if (param3 == -372494750) {
            stackIn_7_0 = (StringBuilder) (param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gn.WA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(this.field_J);
        na var3 = (na) (var2.a(true));
        while (var3 != null) {
          var3.f(-126);
          var3 = (na) (var2.b((byte) -58));
        }
        if (param0 >= -63) {
          this.field_J = (je) null;
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_I = (hl) null;
        }
        field_I = null;
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        tg var7 = null;
        na var8 = null;
        int var9 = 0;
        na var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          var7 = new tg(this.field_J);
          if (param1) {
            var10 = (na) null;
            this.a((na) null, 63, -119, false);
          }
          var8 = (na) (var7.a(true));
          while (var8 != null) {
            if (var8.a((byte) 95)) {
              var8.a(param0, false, param2, param3 + this.field_w, param4, param5 + this.field_t);
              var8 = (na) (var7.b((byte) -58));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("gn.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        na var8 = null;
        tg var9 = null;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          if (param2 != 1) {
            return false;
          }
          var9 = new tg(this.field_J);
          var8 = (na) (var9.a(true));
          while (var8 != null) {
            if (var8.a((byte) 95)) {
              if (var8.c(3) &&
                var8.a(param0, param1, 1, param3)) {
                return true;
              }
              var8 = (na) (var9.b((byte) -58));
              continue;
            }
            break;
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (!sn.field_a[81]) {
            stackIn_18_0 = this.b(param3, param2 ^ 114);
          } else {
            stackIn_18_0 = this.d(param3, -99);
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("gn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
    }
}
