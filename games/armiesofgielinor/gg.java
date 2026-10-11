/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg extends dr {
    static int field_G;
    static NodeDeque field_F;
    static int field_I;
    static Random field_J;
    static String field_H;
    static kl field_K;
    static je field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd[] var4 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -24872) {
            var4 = (nd[]) null;
            this.a(-98, (nd[]) null);
          }
          stackIn_3_0 = new nd(rk.c(-29288));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    gg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        field_K = null;
        field_E = null;
        field_H = null;
        field_F = null;
        field_J = null;
        if (param0 != -2260) {
          gg.g(12);
        }
    }

    static {
        field_G = 6;
        field_F = new NodeDeque();
        field_H = "Options";
        field_I = 2;
        field_J = new Random();
    }
}
