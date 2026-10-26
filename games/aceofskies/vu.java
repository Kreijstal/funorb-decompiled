/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu {
    GraphicsRenderer field_c;
    static int heldMouseButton;
    sn field_d;
    private mj field_e;
    long field_a;
    java.awt.Canvas field_b;
    static of field_g;

    final static String normalizePlayerName(int obfuscationGuard, CharSequence displayName) {
        String stackIn_33_2 = null;
        try {
          if (displayName == null) {
            Object stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          int var2_int = 0;
          int var3 = displayName.length();
          while (var3 > var2_int) {
            if (za.a((byte) 117, displayName.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (za.a((byte) 117, displayName.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          int var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          if (obfuscationGuard < 122) {
            String stackIn_18_0 = (String) null;
            return stackIn_18_0;
          }
          StringBuilder var5 = new StringBuilder(var4);
          for (int var6 = var2_int; var3 > var6; var6++) {
            int var7 = displayName.charAt(var6);
            if (jk.a((char) var7, -26024)) {
              int var8 = rr.a((char) var7, (byte) -70);
              if (var8 != 0) {
                StringBuilder discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var2;
          StringBuilder stackIn_32_1 = new StringBuilder().append("vu.B(").append(obfuscationGuard).append(',');
          if (displayName == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final mj a(byte param0) {
        if (param0 == 38) {
          if (this.field_e == null) {
            this.field_e = new mj();
          }
          this.field_e.a(this, false);
          return this.field_e;
        }
        return (mj) null;
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        String stackIn_12_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4 = -83 / ((-59 - param1) / 54);
          int var3_int = 0;
          int var5 = param0.length();
          for (int var6 = 0; var5 > var6; var6++) {
            if (param0.charAt(var6) == param2) {
              var3_int++;
            }
          }
          int stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("vu.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          return;
        }
        field_g = (of) null;
    }

    vu(GraphicsRenderer param0, sn param1, java.awt.Canvas param2) {
        try {
          this.field_b = param2;
          this.field_d = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        heldMouseButton = 0;
        field_g = new of();
    }
}
