/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    int field_b;
    ue field_d;
    int field_a;
    int field_c;

    final int a(boolean param0) {
        int var4 = Terraphoenix.field_V;
        Object var2 = this;
        int var3 = ((ue) (var2)).field_c;
        while (null != ((ue) (var2)).field_d) {
          var2 = ((ue) (var2)).field_d;
          var3 = var3 + ((ue) (var2)).field_c;
        }
        if (!param0) {
          this.field_d = (ue) null;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        ue var6;
        int var7;
        int var8;
        var8 = Terraphoenix.field_V;
        var5 = 5 % ((param3 + 11) / 33);
        if (this.field_d != null) {
          var6 = this.field_d;
          var7 = 0;
          while (var6.field_d != null) {
            var6 = var6.field_d;
            var7++;
            if (var7 <= 1024) {
              continue;
            }
            System.out.println(var7);
          }
          var6.field_d = new ue(param2, param1, param0);
        } else {
          this.field_d = new ue(param2, param1, param0);
        }
    }

    final void a(int param0, ue param1) {
        ue var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          if (this.field_d != null) {
            var3 = this.field_d;
            while (null != var3.field_d) {
              var3 = var3.field_d;
            }
            var3.field_d = param1;
          } else {
            this.field_d = param1;
          }
          if (param0 != -19020) {
            this.field_a = -12;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ue.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          try {
            if (!he.field_o.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = param1;
            while (true) {
              if (var3 >= param0.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("ue.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    ue(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = null;
        this.field_b = param0;
        this.field_a = param1;
    }

    static {
    }
}
