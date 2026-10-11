/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sp extends pk implements ug {
    static qr field_z;
    static int[] field_x;
    jn field_y;

    private final void a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        cb var5 = null;
        pk var6 = null;
        int var8 = 0;
        pk var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = new cb(this.field_y);
          var6 = (pk) (var5.b((byte) -80));
          if (param1 >= -30) {
            var9 = (pk) null;
            this.a((pk) null, (byte) -17);
          }
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.a(param3 + 1, param2, param0, 0);
            var6 = (pk) (var5.b(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("sp.SA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    sp(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
        this.field_y = new jn();
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        cb var8 = null;
        RuntimeException var8_ref = null;
        pk var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new cb(this.field_y);
          if (param2 != -1) {
            return true;
          }
          var9 = (pk) (var8.b((byte) -80));
          while (var9 != null) {
            if (var9.a(false)) {
              if (var9.d(-1) &&
                var9.a(param0, param1, -1, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (pk) (var8.b(~param2));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("sp.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, pk param1) {
        RuntimeException var3 = null;
        pk var4_ref_pk = null;
        int var4 = 0;
        cb var5 = null;
        pk var6 = null;
        int var7 = 0;
        cb var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_y.a((byte) -86)) {
            return false;
          }
          var8 = new cb(this.field_y);
          var4_ref_pk = (pk) (var8.a((byte) -58));
          while (var4_ref_pk != null) {
            if (var4_ref_pk.d(-1)) {
              var5 = new cb(this.field_y);
              var5.a((byte) -70, (ms) (var4_ref_pk));
              var6 = (pk) (var5.c((byte) 87));
              while (var6 != null) {
                if (var6.a(param1, (byte) 61)) {
                  return true;
                }
                var6 = (pk) (var5.c((byte) 87));
              }
            }
            var4_ref_pk = (pk) (var8.c((byte) 87));
          }
          var4 = 39 % ((param0 - 84) / 34);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sp.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(pk param0, boolean param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        pk var4 = null;
        cb var5 = null;
        pk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_y.a((byte) -87)) {
            return false;
          }
          var3 = new cb(this.field_y);
          var4 = (pk) (var3.b((byte) -80));
          while (var4 != null) {
            if (var4.d(-1)) {
              var5 = new cb(this.field_y);
              var5.a(14, var4);
              var6 = (pk) (var5.b(0));
              while (var6 != null) {
                if (var6.a(param0, (byte) 61)) {
                  return true;
                }
                var6 = (pk) (var5.b(0));
              }
            }
            var4 = (pk) (var3.b(0));
          }
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("sp.TA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, -22, param2)) {
            this.a(param0, (byte) -128, param2, param1);
            this.a(param2, (byte) -57, param1, param0);
          }
          if (param3 != 0) {
            this.field_y = (jn) null;
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sp.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    String c(int param0) {
        cb var2;
        pk var3;
        String var4;
        int var5;
        pk var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -6696) {
          var6 = (pk) null;
          this.a((pk) null, (byte) 2);
        }
        var2 = new cb(this.field_y);
        var3 = (pk) (var2.b((byte) -80));
        while (var3 != null) {
          var4 = var3.c(-6696);
          if (var4 != null) {
            return var4;
          }
          var3 = (pk) (var2.b(0));
        }
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 0 &&
          null != this.field_w) {
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
        }
        cb var5 = new cb(this.field_y);
        if (param2 >= -35) {
          field_x = (int[]) null;
        }
        pk var6 = (pk) (var5.a((byte) -83));
        while (var6 != null) {
          var6.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
          var6 = (pk) (var5.c((byte) 87));
        }
    }

    final int e(int param0) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        cb var3 = new cb(this.field_y);
        int var4 = 51 % ((param0 + 10) / 46);
        pk var5 = (pk) (var3.b((byte) -80));
        while (var5 != null) {
          var6 = var5.e(-99);
          if (var6 > var2) {
            var2 = var6;
          }
          var5 = (pk) (var3.b(0));
        }
        return var2;
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        cb var8 = null;
        RuntimeException var8_ref = null;
        pk var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new cb(this.field_y);
          var9 = (pk) (var8.b((byte) -80));
          while (var9 != null) {
            if (var9.a(false)) {
              if (!var9.a(param0, -79, param2, param3, param4 + this.field_r, param5, param6 + this.field_v)) {
                var9 = (pk) (var8.b(0));
                continue;
              }
              return true;
            }
            break;
          }
          if (param1 < -42) {
            return false;
          }
          field_z = (qr) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("sp.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_x = (int[]) null;
        }
        field_z = null;
        field_x = null;
    }

    private final void a(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -29587) {
          field_x = (int[]) null;
        }
        cb var2 = new cb(this.field_y);
        pk var3 = (pk) (var2.b((byte) -80));
        while (var3 != null) {
          var3.c(false);
          var3 = (pk) (var2.b(param0 + 29587));
        }
    }

    pk f(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(this.field_y);
        pk var3_ref_pk = (pk) (var2.b((byte) -80));
        while (var3_ref_pk != null) {
          if (var3_ref_pk.d(-1)) {
            return var3_ref_pk;
          }
          var3_ref_pk = (pk) (var2.b(0));
        }
        int var3 = -6 / ((param0 + 25) / 58);
        return null;
    }

    final void a(pk param0, int param1) {
        try {
          this.field_y.a((ms) (param0), (byte) 39);
          if (param1 <= 59) {
            field_x = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "sp.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void c(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(this.field_y);
        pk var5 = (pk) (var2.b((byte) -80));
        while (var5 != null) {
          var5.c((byte) 127);
          var5 = (pk) (var2.b(0));
        }
        int var3 = -115 % ((param0 - 64) / 51);
    }

    boolean a(pk param0, byte param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        pk var4 = null;
        int var5 = 0;
        pk var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3 = new cb(this.field_y);
          var4 = (pk) (var3.b((byte) -80));
          if (param1 != 61) {
            var6 = (pk) null;
            this.a(27, -11, (pk) null, -73);
          }
          while (var4 != null) {
            if (var4.a(param0, (byte) 61)) {
              return true;
            }
            var4 = (pk) (var3.b(0));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("sp.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        cb var6 = null;
        pk var7 = null;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = -16 % ((-25 - param1) / 45);
          super.a(param0, 105, param2, param3);
          var6 = new cb(this.field_y);
          var7 = (pk) (var6.b((byte) -80));
          while (var7 != null) {
            if (var7.a(false)) {
              var7.a(this.field_r + param0, -88, param2, param3 + this.field_v);
              var7 = (pk) (var6.b(0));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("sp.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean d(int param0) {
        if (param0 != -1) {
          field_z = (qr) null;
        }
        return null != this.f(55) ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -30 / ((28 - param0) / 63);
        super.a(94, param1, param2, param3, param4);
        this.a(-29587);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        cb var7 = null;
        pk var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1) {
            return;
          }
          var7 = new cb(this.field_y);
          var8 = (pk) (var7.b((byte) -80));
          while (var8 != null) {
            if (var8.a(param1)) {
              var8.a(param0, false, param2 + this.field_r, param3, param4, this.field_v + param5);
              var8 = (pk) (var7.b(0));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("sp.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cb var8 = null;
        pk var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new cb(this.field_y);
          var9 = (pk) (var8.b((byte) -80));
          if (param2 <= 9) {
            field_x = (int[]) null;
          }
          while (var9 != null) {
            if (var9.a(false)) {
              if (var9.d(-1) &&
                var9.a(param0, param1, (byte) 67, param3)) {
                return true;
              }
              var9 = (pk) (var8.b(0));
              continue;
            }
            break;
          }
          var6 = param3;
          if (var6 != 80) {
            return false;
          }
          if (!hw.field_b[81]) {
            stackIn_15_0 = this.a(param0, false);
          } else {
            stackIn_15_0 = this.a((byte) -5, param0);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("sp.KA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_x = new int[]{0, 4, 6, 8, 12, 16, 18, 20, 24};
        field_z = new qr();
    }
}
