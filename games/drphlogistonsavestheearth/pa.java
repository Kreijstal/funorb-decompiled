/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_a;
    static int field_f;
    static wi field_e;
    static int field_d;
    static int field_b;
    static int field_c;

    final static hg a(String param0, byte param1) {
        String var2 = null;
        hg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        hg stackIn_10_0 = null;
        hg stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (gf.field_r == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (hg) (stackIn_7_0);
          }
          if (param1 != 67) {
            stackIn_10_0 = (hg) null;
            return stackIn_10_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = rh.a(-8, var6);
          if (var2 == null) {
            return null;
          }
          var3 = (hg) (gf.field_r.a((long)var2.hashCode(), param1 ^ 24));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_V);
            var4 = rh.a(6, var7);
            if (var4.equals(var2)) {
              stackIn_20_0 = var3;
              return stackIn_20_0;
            }
            var3 = (hg) (gf.field_r.b(-1));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("pa.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_d = -78;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static boolean a(byte param0, vj param1) {
        RuntimeException var2 = null;
        vj var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 64) {
            var3 = (vj) null;
            pa.a((byte) -21, (vj) null);
          }
          stackIn_3_0 = param1.c((byte) 18);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        vj var3;
        if (param0 > 35) {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (de.a(param1, -17321)) {
            return true;
          }
          if (param1 != 45 &&
            param1 != 160 &&
            32 != param1 &&
            param1 != 95) {
            return false;
          }
          return true;
        }
        var3 = (vj) null;
        pa.a((byte) -44, (vj) null);
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (de.a(param1, -17321)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (32 != param1 &&
          param1 != 95) {
          return false;
        }
        return true;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!pf.a(1, param1, param0)) {
            return false;
          }
          for (var3_int = param2; param0.length() > var3_int; var3_int++) {
            if (!pa.a((byte) 83, param0.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("pa.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = 2;
        field_c = -100;
    }
}
