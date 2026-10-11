/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hj extends mf {
    static Random field_h;
    static int[] field_l;
    static int field_k;
    static int field_j;
    static String field_i;

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -92, param0) == fb.field_e) {
            stackIn_2_0 = ih.field_c;
            return stackIn_2_0;
          }
          if (param1) {
            return null;
          }
          hj.e(-48);
          stackIn_6_0 = null;
          return (String) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    hj(ul param0) {
        super(param0);
    }

    final fi a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        fi stackIn_3_0 = null;
        fi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!vl.a(var4, -182)) {
            stackIn_3_0 = fb.field_e;
            return stackIn_3_0;
          }
          if (param0 > -44) {
            field_h = (Random) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = cc.a(true, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return nn.field_q;
          }
          stackIn_10_0 = fb.field_e;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_l = null;
        int var1 = 73 / ((param0 + 21) / 59);
        field_h = null;
        field_i = null;
    }

    static {
        field_h = new Random();
        field_l = new int[4];
        field_i = "You already have rapid fire";
    }
}
