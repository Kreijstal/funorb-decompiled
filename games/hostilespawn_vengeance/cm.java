/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static int[] field_c;
    static volatile int field_b;
    static int[] field_a;

    final static de a(int param0, int param1, int param2, int param3) {
        de var4 = new de();
        if (param0 != 128) {
          return (de) null;
        }
        var4.field_l = param2;
        var4.field_h = new int[param3];
        ke.field_B.a(var4, 103);
        km.a(var4, param0 - 19874, param1);
        return var4;
    }

    final static boolean b(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -97) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (pb.field_Kb >= 20 &&
          bc.d(-74) && (!(ca.field_a > 0) ||
          wa.b(0))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2) {
        ne var3 = new ne(param0, param2, param1, 0, 0, 0);
        if (!ta.p(3)) {
          if (gn.field_k[param0] <= param2) {
            gn.field_k[param0] = 1 + param2;
          }
          om.a(var3, 5, -119);
        } else {
          ei.field_q.a(var3, 87);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -68) {
          oc var2 = (oc) null;
          cm.a((oc) null, false);
        }
    }

    final static void a(oc param0, boolean param1) {
        int var2_int = 0;
        qm var3 = null;
        int var4 = 0;
        oc var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1) {
            var5 = (oc) null;
            cm.a((oc) null, true);
          }
          for (var2_int = 0; var2_int < dk.field_o; var2_int++) {
            var3 = vj.field_w[var2_int];
            if (var3 != null &&
              var3.field_i >= 145 &&
              var3.field_i <= 150 &&
              ih.a(var3.field_j, (byte) -103, param0) < 3) {
              vj.field_w[var2_int] = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("cm.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_a = new int[128];
    }
}
