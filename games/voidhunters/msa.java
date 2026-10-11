/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class msa extends rqa {
    static llb field_o;
    static float[] field_q;
    static rbb field_s;
    static String field_p;
    static String field_r;

    msa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_q = null;
        field_p = null;
        field_s = null;
        field_r = null;
        if (param0 != -61) {
          return;
        }
        field_o = null;
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        int var7Lifetime1;
        var8 = VoidHunters.field_G;
        try {
          if (param1 != 32) {
            var9 = (CharSequence) null;
            msa.a((CharSequence) null, -104);
          }
          var2_int = param0.length();
          var3 = new StringBuilder(var2_int);
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (97 <= var5 &&
              var5 <= 122) {
              discarded$0 = var3.append((char) var5);
            } else if (65 <= var5 &&
              var5 <= 90) {
              discarded$1 = var3.append((char) var5);
            } else if (var5 >= 48 &&
              57 >= var5) {
              discarded$2 = var3.append((char) var5);
            } else {
              if (var5 == 46) {
                discarded$3 = var3.append((char) var5);
              } else {
                if (var5 == 45) {
                  discarded$4 = var3.append((char) var5);
                } else {
                  if (var5 == 42) {
                    discarded$5 = var3.append((char) var5);
                  } else {
                    if (var5 != 95) {
                      if (var5 != 32) {
                        var6 = aea.a(param1 ^ -90, (char) var5);
                        discarded$6 = var3.append('%');
                        var7 = (var6 & 244) >> 4;
                        if (var7 < 10) {
                          discarded$7 = var3.append((char)(48 + var7));
                        } else {
                          discarded$8 = var3.append((char)(55 + var7));
                        }
                        var7Lifetime1 = var6 & 15;
                        if (var7Lifetime1 < 10) {
                          discarded$9 = var3.append((char)(48 + var7Lifetime1));
                        } else {
                          discarded$10 = var3.append((char)(55 + var7Lifetime1));
                        }
                      } else {
                        discarded$11 = var3.append('+');
                      }
                    } else {
                      discarded$12 = var3.append((char) var5);
                    }
                  }
                }
              }
            }
          }
          stackIn_36_0 = var3.toString();
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("msa.B(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = (llb) null;
          }
          stackIn_3_0 = new nc(frb.a(56, 108));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("msa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "DirectX";
        field_r = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_q = new float[16];
    }
}
