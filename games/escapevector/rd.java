/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static IntrusiveDeque field_b;
    static ng field_c;
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 19807) {
          String var6 = (String) null;
          rd.a((byte) -74, (String) null);
        }
        hf.a(108);
        SoftwareRasterizer.h(param1, param4, param0, param2);
    }

    final static String a(byte param0, String param1) {
        String stackIn_18_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param0 != 72) {
            rd.a(111, -86, -93, -27, 95);
          }
          char[] var10 = param1.toCharArray();
          char[] var8 = var10;
          char[] var2 = var8;
          int var3 = 0;
          for (int var4_int = 0; var4_int < var10.length; var4_int++) {
            if (var4_int < (-var3 - 1 + var10.length)) {
              int var5 = var10[var4_int];
              if (Character.isSpaceChar((char) var5)) {
                var3++;
                for (int var6 = 1 + var4_int; var10.length > var6; var6++) {
                  var2[-1 + var6] = var10[var6];
                }
              }
              continue;
            }
            break;
          }
          char[] var11 = new char[var10.length - var3];
          char[] var9 = var11;
          char[] var4 = var9;
          qg.a(var2, 0, var4, 0, var11.length);
          String stackIn_14_0 = new String(var11);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("rd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        int var1 = -2 % ((guard - 10) / 48);
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
