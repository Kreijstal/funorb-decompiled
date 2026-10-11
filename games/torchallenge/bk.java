/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends da {
    int field_u;
    static boolean field_w;
    static int field_i;
    static sl field_t;
    static String field_n;
    static String field_l;
    static int field_p;
    static String field_r;
    int field_v;
    int field_m;
    int field_j;
    int field_o;
    int field_k;
    static int[] field_q;
    static int[] field_s;

    final static boolean a(int param0, char param1) {
        if (param0 != 32191) {
          field_q = (int[]) null;
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (param1 <= 122) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (param1 <= 90) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (param1 <= 122) {
            return true;
          }
          return false;
        }
        if (97 > param1) {
          return false;
        }
        if (param1 <= 122) {
          return true;
        }
        return false;
    }

    bk(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_u = param4;
        this.field_k = param3;
        this.field_v = param0;
        this.field_o = param1;
        this.field_j = param5;
        this.field_m = param2;
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 >= -66) {
            field_l = (String) null;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 > var3_int) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = il.a(param0, (byte) 21);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ak.a(95, var4.charAt(0)) &&
              !ak.a(95, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (!ak.a(95, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("bk.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_s = null;
        field_n = null;
        field_r = null;
        field_l = null;
        field_q = null;
        int var1 = 34 / ((-79 - param0) / 43);
        field_t = null;
    }

    static {
        field_w = false;
        field_p = 0;
        field_r = "Unable to connect to the data server. Please check any firewall you are using.";
        field_n = "Connection restored.";
        field_l = "Loading extra data";
        field_t = new sl();
        field_q = new int[8192];
        field_s = new int[4];
    }
}
