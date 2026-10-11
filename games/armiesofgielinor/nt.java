/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends IntrusiveNode {
    int field_q;
    int field_r;
    static String field_p;
    int[][] field_n;
    boolean field_l;
    int field_k;
    String[][] field_t;
    int field_o;
    int field_s;
    int field_m;

    public static void a(byte param0) {
        field_p = null;
        if (param0 != 97) {
          field_p = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_10_0 = 0;
        RgbSprite stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_3 = 0;
        RgbSprite stackIn_19_0;
        int stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_20_4;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 894) {
            nt.a((byte) 82);
          }
          if (cu.field_a) {
            var5_int = param1 & 3;
            param1 = param1 | param1 << 8;
            var6 = 0;
            while (true) {
              stackIn_10_0 = var6;
              if (!cu.field_a) {
                if (stackIn_10_0 >= 1) {
                  return;
                }
              } else {
                if (stackIn_10_0 >= 4) {
                  return;
                }
              }
              var7 = (((15 & param1) + 15) * param2 / 16 + var6 * 20 + (param1 & 15)) % 320;
              var8 = 0;
              if (64 > var7) {
                var8Lifetime1 = -var7 + 64 << 1;
              } else {
                var8Lifetime1 = var7 - 64 >> 1;
              }
              stackIn_16_0 = vf.field_j[var5_int];
              stackIn_16_1 = param3;
              stackIn_16_2 = param4 - var7 / 4;
              if (cu.field_a) {
                stackIn_17_3 = 1;
              } else {
                stackIn_17_3 = 2;
              }
              fe.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_17_3 * (-var8Lifetime1 + 128));
              param1 = param1 >> 2;
              stackIn_19_0 = vf.field_j[4 + var5_int];
              stackIn_19_1 = var5_int + param3;
              stackIn_19_2 = -(var7 / 4) + param4;
              stackIn_19_3 = 64 - var8Lifetime1 / 2;
              if (cu.field_a) {
                stackIn_20_4 = 1;
              } else {
                stackIn_20_4 = 2;
              }
              ((RgbSprite) (Object) stackIn_19_0).f(stackIn_19_1, stackIn_19_2, stackIn_19_3 * stackIn_20_4);
              var5_int = 3 & (var5_int ^ param1);
              var6++;
            }
          }
          fe.a(vf.field_j[3 & param1], param3, param4);
          param1 = param1 >> 2;
          vf.field_j[(3 & param1) + 4].f(param3, -4 + param4, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "nt.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = kl.c(tf.field_l, -76, hi.field_j);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          var3 = 103 % ((param0 + 62) / 38);
          stackIn_6_0 = (String) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("nt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    nt() {
    }

    static {
        field_p = "Yes";
    }
}
