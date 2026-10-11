/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_b;
    static int field_a;

    final static oi a(int param0, String param1) {
        oi stackIn_4_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        oi stackIn_26_0 = null;
        oi stackIn_40_0 = null;
        oi stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 == var2_int) {
            stackIn_4_0 = oc.field_j;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = bl.field_c;
            return stackIn_7_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_12_0 = fh.field_e;
              return stackIn_12_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = fh.field_e;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = fh.field_e;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (qk.field_O.indexOf(var5Lifetime1) == -1) {
                stackIn_44_0 = fh.field_e;
                return stackIn_44_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("tf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    final static rc a(int param0, boolean param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          rc var5 = null;
          ub var5_ref = null;
          rc stackIn_3_0 = null;
          ub stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("qb");
              if (!param1) {
                field_b = (String) null;
              }
              var5 = (rc) (var4.newInstance());
              var5.a(param0, -48, param3, param2);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ub();
              ((rc) ((Object) var5_ref)).a(param0, -123, param3, param2);
              stackIn_5_0 = var5_ref;
              return (rc) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("tf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
          tf.a(26);
        }
    }

    static {
        field_b = "It's the opening morning of your model railway exhibition, and you find that the delivery men have scattered your blocks of track seemingly at random.  Panic!  You must act quickly to push them into the right layout before the public arrive.  The task is complicated by the curious design of the exhibition hall, which has some highly polished floors and conveyor belts.";
    }
}
