/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends IOException {
    static UiSelectionState field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, Battlefield param1, boolean param2) {
        int var3_int = param1.localPlayer;
        int var4 = param1.a(true, var3_int);
        System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(RadialSummonMenu.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.a(true, var3_int), 16) + " ---");
        System.out.println(param1.describeBattlefield(var3_int, -248));
        if (param0 != 0) {
          return;
        }
        try {
          System.out.println("--- STATE DUMP ENDS: " + Integer.toString(RadialSummonMenu.field_d, 16) + " ---");
          vl.outgoingPacket.writeCipheredOpcode(32161, 72);
          vl.outgoingPacket.writeInt((byte) -117, RadialSummonMenu.field_d);
          vl.outgoingPacket.writeInt((byte) -98, var4);
          if (param2) {
            hb.$cfr$intArgs$a$e9dea5688aa5(116, 0);
            dj.a((byte) -125);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ug.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, hd param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        ls[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        CharSequence var10 = null;
        ls[] var11 = null;
        wo var12 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != -1) {
            var10 = (CharSequence) null;
            ug.a(99, (CharSequence) null);
          }
          if (!param3.b(false)) {
            return null;
          }
          if (param0 == 0) {
            var11 = ma.a(param2 ^ 109, param3);
            var6 = var11;
            if (var6 == null) {
              stackIn_10_0 = null;
              return (java.awt.Frame) (stackIn_10_0);
            }
            var7_int = 0;
            for (var8 = 0; var11.length > var8; var8++) {
              if (param4 == var11[var8].field_b &&
                param5 == var11[var8].field_a && ((param1 == 0 ||
                var11[var8].field_e == param1) &&
                (var7_int == 0 ||
                !(var11[var8].field_f <= param0)))) {
                param0 = var11[var8].field_f;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_27_0 = null;
              return (java.awt.Frame) (stackIn_27_0);
            }
          }
          var12 = param3.a(true, param5, param4, param1, param0);
          while (var12.field_g == 0) {
            nu.a(10L, 0);
          }
          var7 = (java.awt.Frame) (var12.field_f);
          if (var7 == null) {
            return null;
          }
          if (2 != var12.field_g) {
            stackIn_38_0 = var7;
            return stackIn_38_0;
          }
          fj.a(var7, param3, -2);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("ug.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = lt.a(0, wc.a(param1, 0));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("ug.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 16) {
          field_c = (UiSelectionState) null;
        }
    }

    ug(String param0) {
        super(param0);
    }

    static {
        field_c = new UiSelectionState(1);
    }
}
