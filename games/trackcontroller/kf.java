/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_c;
    static int field_b;
    static qj[] field_d;
    static int field_a;

    public static void b(int param0) {
        field_d = null;
        if (param0 != -1688814815) {
          field_c = -121;
        }
    }

    final static mh a(int param0, kk param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        mh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param1.b(param2, 20095);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (mh) (stackIn_2_0);
          }
          if (param0 > -45) {
            kf.a(false);
          }
          stackIn_6_0 = new mh(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("kf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static oi a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        oi stackIn_4_0 = null;
        oi stackIn_8_0 = null;
        oi stackIn_11_0 = null;
        oi stackIn_20_0 = null;
        oi stackIn_24_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = oc.field_j;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = bl.field_c;
            return stackIn_8_0;
          }
          if (!param1) {
            stackIn_11_0 = (oi) null;
            return stackIn_11_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_20_0 = fh.field_e;
                return stackIn_20_0;
              }
            } else {
              if (-1 == ac.field_a.indexOf(var4)) {
                stackIn_24_0 = fh.field_e;
                return stackIn_24_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("kf.E(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        r.f(-635);
        qc.b(param0, (byte) -42);
    }

    final static void a(boolean param0) {
        pb.field_c[520] = 59;
        pb.field_c[222] = 58;
        pb.field_c[192] = 28;
        pb.field_c[47] = 73;
        if (!param0) {
          pb.field_c[61] = 27;
          pb.field_c[93] = 43;
          pb.field_c[44] = 71;
          pb.field_c[59] = 57;
          pb.field_c[45] = 26;
          pb.field_c[91] = 42;
          pb.field_c[92] = 74;
          pb.field_c[46] = 72;
          return;
        }
        kf.a(93);
        pb.field_c[61] = 27;
        pb.field_c[93] = 43;
        pb.field_c[44] = 71;
        pb.field_c[59] = 57;
        pb.field_c[45] = 26;
        pb.field_c[91] = 42;
        pb.field_c[92] = 74;
        pb.field_c[46] = 72;
    }

    static {
        field_b = 0;
    }
}
