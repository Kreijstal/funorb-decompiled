/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ada implements dja {
    static int[] field_a;
    static pia field_b;

    public static void a(int param0) {
        if (param0 != -1) {
          field_a = (int[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(String param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8_int = 0;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = VoidHunters.field_G;
        try {
          if (!nwa.field_c.field_k) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (jma.field_q.containsKey(param0)) {
            stackIn_7_0 = 100;
            return stackIn_7_0;
          }
          var10 = mib.a((byte) -33, param0);
          if (var10 == null) {
            stackIn_10_0 = -1;
            return stackIn_10_0;
          }
          var3 = oea.field_p + var10;
          if (!tba.field_q.a((byte) -107, "", var3)) {
            stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          if (!tba.field_q.a(32171, var3)) {
            stackIn_17_0 = tba.field_q.a(var3, -2118);
            return stackIn_17_0;
          }
          var14 = tba.field_q.a("", param1, var3);
          var12 = var14;
          var4 = var12;
          var5 = null;
          try {
            var11 = lfb.a(var10, (byte) 34);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          if (var4 != null &&
            var11 != null) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var6 = 1;
            var15 = ana.a(var11, (byte) 48);
            var13 = var15;
            var7 = var13;
            if (var7 != null &&
              var14.length == var15.length) {
              var8_int = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var8_int >= var15.length))) {
                if (var14[var8_int] == var15[var8_int]) {
                  var8_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted0 = false;
              }
              if (decompiledFrameCompleted0) {
                var6 = 0;
                decompiledFrameRemainder0 = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var6 = 0;
            }
            try {
              if (var6 == 0) {
                nwa.field_c.a(var14, (byte) 110, var11);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8 = decompiledCaughtException;
              stackIn_39_0 = -1;
              return stackIn_39_0;
            }
            td.a((byte) 123, param0, var11);
            stackIn_41_0 = 100;
            return stackIn_41_0;
          }
          stackIn_43_0 = -1;
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_46_0 = var2;
          stackIn_46_1 = new StringBuilder().append("ada.C(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 61 % ((param0 + 64) / 50);
        return (tv) ((Object) new cda());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new cda[param1]);
    }

    final static int a(rsb param0, lbb param1, boolean param2, rna[] param3) {
        int var5 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        rna var6 = null;
        int var8 = 0;
        et var9 = null;
        int var10 = 0;
        int var11 = 0;
        ika var12 = null;
        uoa var13 = null;
        lrb var14 = null;
        var11 = VoidHunters.field_G;
        try {
          var4_int = -1;
          if (param2) {
            ada.a(-17);
          }
          for (var5 = 0; var5 < param3.length; var5++) {
            var6 = param3[var5];
            if (var6 instanceof lrb) {
              var14 = (lrb) (var6);
              var8 = var14.a(1, -116);
              if (param0.a(var8, 0, -1)) {
                var4_int = var8;
              }
            } else {
              if (!(var6 instanceof ika)) {
                if (!(var6 instanceof uoa)) {
                  continue;
                }
                var13 = (uoa) (var6);
                var8 = var13.a(0, -103);
                var9 = param1.a(-31634, var8);
                if (var9 != null) {
                  var10 = var9.field_b;
                  var4_int = fq.field_o[var10];
                  if (var13.a(1, -126) < 0) {
                    var4_int = mjb.b(21957, var4_int);
                  }
                }
              } else {
                var12 = (ika) (var6);
                var4_int = var12.a(0, -117);
              }
            }
            break;
          }
          stackIn_18_0 = var4_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ada.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_a = new int[100];
    }
}
