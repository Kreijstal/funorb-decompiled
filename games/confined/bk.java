/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends mf {
    static String field_i;
    static int[] field_h;
    static bi[] field_j;

    final static jb a(int param0, boolean param1, boolean param2, int param3) {
        bd var8 = null;
        bd var9 = null;
        jb var7 = new jb(3);
        var7.field_m = param1 ? true : false;
        var7.field_b = 215;
        var7.field_k = 520;
        var7.field_s = 62;
        var7.field_c = 81;
        var7.field_l = param3;
        int var5 = 20 + (var7.field_c + var7.field_b);
        if (tj.a(true)) {
          var8 = new bd(16, ba.field_Q, pn.field_a);
          var8.field_j = 320 - var8.field_f / 2;
          var8.field_b = var5;
          var7.a((byte) -61, var8);
          var5 += 40;
        }
        if (bj.field_m) {
          var9 = new bd(11, rn.field_d, pn.field_a);
          var9.field_b = var5;
          var9.field_j = 320 - var9.field_f / 2;
          var5 += 40;
          var7.a((byte) -120, var9);
        }
        bd var10 = new bd(14, fl.field_b, pn.field_a);
        var10.field_j = -(var10.field_f / 2) + param0;
        var10.field_b = var5;
        var7.a((byte) -111, var10);
        var7.a(param2, 26206, 0);
        return var7;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -126, param0) == fb.field_e) {
            stackIn_2_0 = ml.field_c;
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_7_0 = si.field_d;
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bk.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final fi a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        fi stackIn_5_0 = null;
        fi stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != nl.a(0, param1)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 > -44) {
            stackIn_5_0 = (fi) null;
            return stackIn_5_0;
          }
          if (var3_int != 0) {
            return nn.field_q;
          }
          stackIn_9_0 = fb.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_i = null;
        field_h = null;
        if (param0 != 62) {
          return;
        }
        field_j = null;
    }

    bk(ul param0) {
        super(param0);
    }

    static {
        field_i = "<col=FFFFFF>Other missiles:</col> awarded at random whenever nothing else is due.";
        field_j = new bi[4];
        field_h = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    }
}
