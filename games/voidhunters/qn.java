/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends ksa {
    static String field_d;
    static int field_f;
    int field_e;
    int field_i;
    static ida field_h;
    int field_g;

    final static void c(byte param0) {
        ms.field_y = new ij();
        gtb.field_d = new ij();
        if (param0 >= 52) {
          jp.field_Jc = new Random();
          return;
        }
        qn.a(11, (byte) 95);
        jp.field_Jc = new Random();
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != -25) {
          return true;
        }
        if (!tla.b(111, param0)) {
          if (fwa.field_g.b(param0, param1 ^ -29)) {
            return fwa.field_g.a(param0, false) ? true : false;
          }
          return false;
        }
        if (fwa.field_g.a(param0, false)) {
          return true;
        }
        return false;
    }

    final static int a(char param0, byte param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = VoidHunters.field_G;
        try {
          var3_int = 0;
          if (param1 != 58) {
            stackIn_3_0 = -52;
            return stackIn_3_0;
          }
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param0 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          qn.c((byte) -115);
          field_h = null;
          field_d = null;
          return;
        }
        field_h = null;
        field_d = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 20;
        field_d = "Decreased map width";
    }
}
