/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param1 != 0) {
          bf.a((byte) -65, -113);
        }
        stackIn_8_0 = (param6 >= param0) && (param6 < param0 + param4) && (param2 >= param3) && (param3 + param5 > param2);
        return stackIn_8_0;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawn.field_J;
        try {
          wk.a(0, qn.field_e, param1, param0 + 35, true, fe.field_O, ub.field_d);
          for (var2_int = 0; var2_int < qn.field_e; var2_int++) {
            qd.field_c[param1 + var2_int] = var2_int;
          }
          wk.a(param1, qn.field_e + param1, param1 + param1, param0 + 35, false, sg.field_pb, me.field_Db);
          if (param0 != -35) {
            bf.a(112, 74, 60, -121, 40, -69, -113);
          }
          if (qn.field_e > param1) {
            qn.field_e = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "bf.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
