/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int[] field_d;
    static boolean field_a;
    static int field_c;
    static String field_b;

    final static void a(byte param0) {
        if (param0 >= 54) {
          sf.field_f.b(new se(), 23143);
          return;
        }
        bd var2 = (bd) null;
        cg.a(-26, (qc) null, -94, -80, -18, 102, -121, (qc) null, (bd) null, (byte) 5, 41, -60, 79, (qc) null, -121, 122, 103, 36, 121, (bd) null, 37);
        sf.field_f.b(new se(), 23143);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != -26814) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, qc param1, int param2, int param3, int param4, int param5, int param6, qc param7, bd param8, byte param9, int param10, int param11, int param12, qc param13, int param14, int param15, int param16, int param17, int param18, bd param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          th.a(param8, param19, param17, -128);
          if (param9 != 45) {
            return;
          }
          qe.a(param4, -29770, param10, param12, param5);
          ki.a(param0, param3, -126);
          ph.a(14835, param13, param20, param11, param2, param7);
          jb.a(param16, param6, param1, -100);
          uh.a(11130, param18, param14, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("cg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final static vi a(java.awt.Component param0, boolean param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          vi var5 = null;
          mh var5_ref = null;
          vi stackIn_2_0 = null;
          vi stackIn_4_0 = null;
          mh stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("jk");
              if (param1) {
                stackIn_2_0 = (vi) null;
                return stackIn_2_0;
              }
              var5 = (vi) (var4.newInstance());
              var5.a(param0, param3, param2, (byte) -122);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new mh();
              ((vi) ((Object) var5_ref)).a(param0, param3, param2, (byte) -117);
              stackIn_6_0 = var5_ref;
              return (vi) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("cg.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = true;
        field_b = "Names should contain a maximum of 12 characters";
    }
}
