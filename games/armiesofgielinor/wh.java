/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_a;
    static String field_b;
    static String field_h;
    static String field_e;
    static ClientUiComponent field_g;
    static boolean field_f;
    static String field_d;
    static NodeDeque field_c;

    final static boolean a(ResourceArchive param0, byte param1, ResourceArchive param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        ResourceArchive var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 127) {
            var5 = (ResourceArchive) null;
            wh.a((ResourceArchive) null, (byte) 105, (ResourceArchive) null, (ResourceArchive) null);
          }
          if (!param0.ensureIndex((byte) 82)) {
            return false;
          }
          if (!param0.ensureGroupAvailableByName(28979, "commonui")) {
            return false;
          }
          if (param3.ensureIndex((byte) 82) &&
            param3.ensureGroupAvailableByName(28979, "commonui")) {
            if (param2.ensureIndex((byte) 82) &&
              param2.ensureGroupAvailableByName(param1 ^ 29004, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("wh.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean a(ResourceArchive param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -27701) {
            stackIn_4_0 = param0.ensureAllGroupsAvailable(-27927);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wh.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 == 0) {
          field_c = null;
          field_e = null;
          field_h = null;
          return;
        }
        field_a = 83;
        field_c = null;
        field_e = null;
        field_h = null;
    }

    final static String[][][] a(int param0) {
        int var5 = 0;
        int var1;
        int var2;
        int var3;
        String[][][] var4;
        int var6;
        String var7;
        int var8;
        int var9;
        String var10;
        String var11;
        int var6Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 77 / ((param0 + 24) / 63);
        var1 = fd.field_n.length;
        var3 = fd.field_n[0].length;
        var4 = new String[var1][var3][];
        for (var5 = 0; var1 > var5; var5++) {
          for (var6 = 0; var3 > var6; var6++) {
            var7 = fd.field_n[var5][var6];
            var4[var5][var6] = new String[1];
            var4[var5][var6][0] = var7;
          }
          var9 = 0;
          var6Lifetime1 = var9;
          while (var3 > var9) {
            var10 = var4[var5][var9][0];
            var4[var5][var9][0] = NetworkResourceRequest.a(var4[var5], var9, var10, var5, (byte) 15);
            var11 = var4[var5][var9][0];
            var4[var5][var9] = od.a(-16399, var11);
            if (null == var4[var5][var9]) {
              var4[var5][var9] = new String[1];
              var4[var5][var9][0] = var11;
            }
            var9++;
          }
        }
        return var4;
    }

    static {
        field_h = "Your request to join has been declined.";
        field_a = -1;
        field_b = "Message lobby";
        field_e = "Plate armour helps to protect against melee damage.";
        field_f = false;
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
