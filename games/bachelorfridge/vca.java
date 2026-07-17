/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vca extends bw {
    static sna field_h;
    private int field_k;
    private int field_o;
    private int field_j;
    private kv field_g;
    static String field_i;
    static String field_m;
    static String[] field_f;
    private int field_l;
    private int field_n;

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = null;
    }

    final boolean c(byte param0) {
        int var2 = 11 % ((param0 - 76) / 48);
        return ((vca) this).field_l < ((vca) this).field_g.field_p + 20 ? true : false;
    }

    final static void c(boolean param0) {
        pla.field_g = f.b((byte) 73);
        qla.field_f = 0;
    }

    private final void a(int param0, int param1, int param2, String param3, po param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kv var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var6_int = 2 + (param4.a(param3) - -(param3.length() * 4));
              var7 = 8 + (param4.field_B + param4.field_u - -2);
              ((vca) this).field_g = new kv(var6_int, var7);
              bu.a(0, ((vca) this).field_g);
              ce.a(true, param0, 1 + param4.field_u, param3, 1, true);
              db.b(119);
              ((vca) this).field_g.f((param0 & 16579836) >> 2);
              if (~param1 == param2) {
                break L1;
              } else {
                var8 = var6_int;
                var9 = var7;
                var10 = new kv(var8, var9);
                bu.a(0, var10);
                ((vca) this).field_g.c(0, 0, var8, var9);
                db.b(111);
                ((vca) this).field_g = var10;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vca.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    vca(po param0, String param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, 4096, param3, param4, param5);
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((vca) this).field_l >= ((vca) this).field_n) {
          if (((vca) this).field_n - -((vca) this).field_o > ((vca) this).field_l) {
            ((vca) this).field_g.e(param1 - (((vca) this).field_g.field_q >> 1), -(((vca) this).field_g.field_p >> 1) + -20 + (param0 + ((vca) this).field_j));
            return;
          } else {
            var4 = -((vca) this).field_n + (((vca) this).field_l + -((vca) this).field_o);
            var5 = (-var4 + ((vca) this).field_k << 8) / ((vca) this).field_k;
            if (!param2) {
              var6 = 40 * var4 / ((vca) this).field_k;
              if (var5 <= 0) {
                return;
              } else {
                ((vca) this).field_g.a(-(((vca) this).field_g.field_q >> 1) + param1, -(((vca) this).field_g.field_p >> 1) + (((vca) this).field_j - -param0 - (20 - -var6)), var5);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L0: {
            var4 = (((vca) this).field_l << 8) / ((vca) this).field_n;
            var5 = (-((vca) this).field_l + ((vca) this).field_n) * 160 / ((vca) this).field_n;
            if (((vca) this).field_n - 5 > ((vca) this).field_l) {
              var6 = 4608 * ((vca) this).field_l / (((vca) this).field_n + -5);
              break L0;
            } else {
              var6 = (-((vca) this).field_l + (-5 + ((vca) this).field_n)) * 512 / (-5 + ((vca) this).field_n) + 4608;
              break L0;
            }
          }
          L1: {
            if (((vca) this).field_n + -5 > ((vca) this).field_l) {
              break L1;
            } else {
              var6 = (-10 + (-((vca) this).field_l + ((vca) this).field_n * 2) << 12) / (((vca) this).field_n - 10);
              break L1;
            }
          }
          var7 = ((vca) this).field_g.field_q * var6 >> 12;
          var8 = ((vca) this).field_g.field_p * var6 >> 12;
          ((vca) this).field_g.c(-(var7 >> 1) + param1, (var5 >> 4) + ((vca) this).field_j + (param0 - (20 - -(var8 >> 1))), var7, var8, var4);
          return;
        }
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            ((vca) this).field_j = 42;
            int fieldTemp$4 = ((vca) this).field_l + 1;
            ((vca) this).field_l = ((vca) this).field_l + 1;
            if (((vca) this).field_k + (((vca) this).field_n + ((vca) this).field_o) >= fieldTemp$4) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            int fieldTemp$5 = ((vca) this).field_l + 1;
            ((vca) this).field_l = ((vca) this).field_l + 1;
            if (((vca) this).field_k + (((vca) this).field_n + ((vca) this).field_o) >= fieldTemp$5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private vca(po param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((vca) this).field_o = param5;
            ((vca) this).field_k = param6;
            ((vca) this).field_l = 0;
            ((vca) this).field_n = param4;
            this.a(param2, param3, -4097, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    vca(po param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((vca) this).field_o = param5;
            ((vca) this).field_j = param7;
            ((vca) this).field_k = param6;
            ((vca) this).field_n = param4;
            ((vca) this).field_l = 0;
            this.a(param2, param3, -4097, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    vca(kv param0, int param1, int param2, int param3) {
        try {
            ((vca) this).field_n = param1;
            ((vca) this).field_g = param0;
            ((vca) this).field_o = param2;
            ((vca) this).field_l = 0;
            ((vca) this).field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Bakery", "Meat", "Fish", "Dairy", "Fruit n Veg", "Drinks", "Ready Meal", "Misc"};
        field_i = "achievements to collect";
        field_m = "Invite <%0> to this game";
    }
}
