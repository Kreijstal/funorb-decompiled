/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    int field_a;
    boolean field_b;
    int field_d;
    static long field_c;

    final static void a(BitmapFont param0, int param1, int param2, BitmapFont param3) {
        nh.field_c = param0;
        qk.field_g = param1;
        FlightSession.field_e = param3;
        mb.a(SoftwareRasterizer.framebufferHeight / 2, SoftwareRasterizer.stride / 2, (byte) 74);
        if (param2 != 24097) {
          return;
        }
        try {
          hh.a(param3.capitalXAscent + param3.maxDescent, param0.maxDescent + param0.capitalXAscent, -79, param3.capitalXAscent, param0.capitalXAscent);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(vu param0, int param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 == 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("sn.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        String stackIn_34_2 = null;
        String stackIn_37_2 = null;
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var3_int = param0.length();
          int var4 = var3_int;
          int var5 = 0;
          while (true) {
            int var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var5 < var3_int; var5++) {
                if (oj.a(param0.charAt(var5), (byte) -45)) {
                  continue;
                }
                break;
              }
              String var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!vl.a(10, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (62 != param0.charAt(var5)) {
                continue;
              }
              var5++;
              int var8 = td.a((CharSequence) ((Object) var7_ref_String), (byte) 38);
              var4 = var4 + (param2[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          StringBuilder var6 = new StringBuilder(var4);
          int var5Lifetime1 = 0;
          int var7 = 0;
          if (param1 <= 104) {
            field_c = 115L;
          }
          while (true) {
            int var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              StringBuilder discarded$2 = var6.append(param0.substring(var7));
              String stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            int stackIn_20_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_20_0; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (oj.a(param0.charAt(var5Lifetime1), (byte) -116)) {
                continue;
              }
              break;
            }
            String var9 = param0.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!vl.a(10, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            int var10 = td.a((CharSequence) ((Object) var9), (byte) 38);
            StringBuilder discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            StringBuilder discarded$1 = var6.append(param2[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var3;
          StringBuilder stackIn_33_1 = new StringBuilder().append("sn.C(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          StringBuilder stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    public final String toString() {
        return super.toString();
    }

    final boolean a(byte param0, sn param1) {
        String stackIn_9_2 = null;
        try {
          if (param0 != -73) {
            vu var4 = (vu) null;
            this.a((vu) null, 115);
          }
          boolean stackIn_5_0 = (this.field_d == param1.field_d);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("sn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    sn(int param0, int param1) {
        this.field_b = true;
        this.field_d = param0;
        this.field_a = param1;
    }

    static {
    }
}
