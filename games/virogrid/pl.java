/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static int field_b;
    static int field_c;
    static String field_f;
    static km field_a;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        lk var1 = null;
        he var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        lk var1Lifetime1;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = (lk) (ci.field_o.a((byte) -26));
          while (var1 != null) {
            if (0 < var1.field_Gb) {
              var1.field_Gb = var1.field_Gb - 1;
              if (var1.field_Gb == 0) {
                var1.field_Wb = 0;
                if (var1.g(0)) {
                  var1.a(false);
                }
              }
            }
            var1 = (lk) (ci.field_o.a(16213));
          }
          var1_ref = (he) (te.field_f.a((byte) -94));
          if (param0) {
            pl.a(true);
          }
          while (var1_ref != null) {
            if (var1_ref.field_Mb > 0) {
              var1_ref.field_Mb = var1_ref.field_Mb - 1;
              if (0 != var1_ref.field_Mb) {
                var1_ref = (he) (te.field_f.a(16213));
                continue;
              }
              var1_ref.field_Eb = 0;
              if (var1_ref.f((byte) -89)) {
                var1_ref.a(false);
              }
            }
            var1_ref = (he) (te.field_f.a(16213));
          }
          var1Lifetime1 = (lk) (qm.field_Mb.a((byte) -51));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Gb > 0) {
              var1Lifetime1.field_Gb = var1Lifetime1.field_Gb - 1;
              if (0 == var1Lifetime1.field_Gb) {
                var1Lifetime1.field_Wb = 0;
                if (var1Lifetime1.g(0)) {
                  var1Lifetime1.a(false);
                }
              }
            }
            var1Lifetime1 = (lk) (qm.field_Mb.a(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref2), "pl.B(" + param0 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -44) {
            field_f = (String) null;
          }
          stackIn_3_0 = p.a(param2, 4330, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static bk a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        vi stackIn_3_0 = null;
        re stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0L &&
            param1 != null) {
            stackIn_3_0 = new vi(param1, param3);
            return (bk) ((Object) stackIn_3_0);
          }
          if (param4) {
            stackIn_6_0 = new re(param0, param3);
            return (bk) ((Object) stackIn_6_0);
          }
          if (param2 <= 126) {
            field_d = (String) null;
          }
          stackIn_10_0 = new mh(param0, param3);
          return (bk) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 < -88) {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    static {
        field_f = "You are offering to draw.";
        field_c = -1;
        field_d = "Loading models";
        field_e = "You are invited to <%0>'s game.";
    }
}
