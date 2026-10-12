/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static lg field_c;
    static long field_d;
    static int[][][] field_e;
    static String[] field_b;
    static String field_a;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var7 = null;
        char[] var10 = null;
        char[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        String var6 = null;
        char[] var8 = null;
        int var9 = 0;
        char[] var11 = null;
        char[] var13 = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (bi.a(param1, -31000)) {
            return true;
          }
          var12 = ll.field_Nb;
          var10 = var12;
          var7 = var10;
          var2 = var7;
          for (var3 = 0; var3 < var12.length; var3++) {
            var4 = var12[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          if (param0 >= -8) {
            var6 = (String) null;
            ph.a((String) null, (byte) -108);
          }
          var13 = MovementPresentation.field_i;
          var11 = var13;
          var8 = var11;
          var2Lifetime1 = var8;
          var9 = 0;
          var3Lifetime1 = var9;
          while (var13.length > var9) {
            var4Lifetime1 = var13[var9];
            if (param1 == var4Lifetime1) {
              return true;
            }
            var9++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ph.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = (int[][][]) null;
        if (param0 > -24) {
          return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (var2_int != param0.charAt(var3)) {
              return false;
            }
          }
          if (param1 < 41) {
            field_d = 88L;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ph.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            TurnTimerDial.field_b = param0;
            try {
              var6 = param1.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              if (param2) {
                ph.a(103, '\013');
              }
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param0.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + fq.a((byte) -82, vi.monotonicMillis(-118) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              lj.a((byte) -52, param1, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            MoveAttackAction.a(16058, param1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("ph.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new lg();
        field_a = "Unpacking sound effects";
        field_b = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        field_e = new int[][][]{new int[][]{new int[]{-60, 0}, new int[]{60, 0}}, new int[][]{new int[]{-80, 20}, new int[]{80, 20}, new int[]{0, 20}}, new int[][]{new int[]{120, 20}, new int[]{-120, 20}, new int[]{40, 20}, new int[]{-40, 20}}};
    }
}
