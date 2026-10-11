/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hob extends ksa {
    int field_j;
    static String field_l;
    static String field_e;
    hob field_f;
    int field_i;
    static int field_d;
    int field_h;
    int field_k;
    int field_g;

    final static tv[] a(ij param0, int param1) {
        int var4 = 0;
        ksa[] var2 = null;
        RuntimeException var2_ref = null;
        tv[] var3 = null;
        int var5 = 0;
        ksa[] var6 = null;
        tv[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = param0.f(-4872);
          var2 = var6;
          var3 = new tv[var6.length];
          if (param1 != 210377952) {
            hob.a(-49, (byte) -17);
          }
          for (var4 = 0; var6.length > var4; var4++) {
            var3[var4] = (tv) ((Object) var6[var4]);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("hob.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, asb param1) {
        int var3 = 0;
        int var4 = 0;
        phb var2 = new phb(param1.a("", true, "final_frame.jpg"), (java.awt.Component) ((Object) igb.field_a));
        if (param0 <= 23) {
          return;
        }
        try {
          var3 = var2.field_q;
          var4 = var2.field_p;
          vbb.e(3);
          cg.field_o = new phb(var3, 3 * var4 / 4);
          cg.field_o.b();
          var2.c(0, 0);
          reb.field_a = new phb(var3, var4 - cg.field_o.field_p);
          reb.field_a.b();
          var2.c(0, -cg.field_o.field_p);
          reb.field_a.field_l = cg.field_o.field_p;
          bia.a((byte) 124);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hob.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_l = null;
        int var1 = 101 % ((param0 - 66) / 34);
    }

    final static int a(int param0, byte param1) {
        if (param1 > -121) {
          field_e = (String) null;
          if (param0 >= 0) {
            if (param0 > 65536) {
              return 2048 - tfb.field_o[134217728 / param0];
            }
            return tfb.field_o[param0 >> 5];
          }
          if (param0 >= -65536) {
            return -tfb.field_o[-param0 >> 5];
          }
          return -2048 + tfb.field_o[134217728 / -param0];
        }
        if (param0 >= 0) {
          if (param0 > 65536) {
            return 2048 - tfb.field_o[134217728 / param0];
          }
          return tfb.field_o[param0 >> 5];
        }
        if (param0 >= -65536) {
          return -tfb.field_o[-param0 >> 5];
        }
        return -2048 + tfb.field_o[134217728 / -param0];
    }

    final static int a(Random param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 >= param1) {
            throw new IllegalArgumentException();
          }
          if (bd.a(param1, (byte) -95)) {
            stackIn_5_0 = (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 32);
            return stackIn_5_0;
          }
          if (param2 < 115) {
            field_d = -117;
          }
          var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
          do {
            var4 = param0.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = lva.b(var4, param1, -103);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hob.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    hob(int param0, int param1, int param2, int param3, int param4) {
        this.field_h = param1;
        this.field_k = param2;
        this.field_g = param3;
        this.field_i = param0;
        this.field_j = param4;
    }

    static {
        field_e = "Scale up map width";
    }
}
