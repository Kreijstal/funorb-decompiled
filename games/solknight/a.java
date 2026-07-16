/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends wf implements pi {
    private vg field_f;
    static wg field_h;
    static o field_e;
    static String field_g;
    static int[] field_d;
    static int field_i;

    public final void a(vg param0, byte param1) {
        if (param1 != -79) {
            return;
        }
        ((a) this).a((byte) -127);
    }

    final static void a(byte param0, String param1, float param2) {
        if (param0 != 102) {
            return;
        }
        pe.field_m = param1;
        jl.field_e = param2;
    }

    abstract qf a(String param0, byte param1);

    final String e(int param0) {
        if (param0 != 8192) {
            return null;
        }
        return ((a) this).a(((a) this).field_f.field_i, false);
    }

    abstract String a(String param0, boolean param1);

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 82) {
          if (((a) this).field_f.field_i != null) {
            if (((a) this).field_f.field_i.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_e = null;
          if (((a) this).field_f.field_i == null) {
            return true;
          } else {
            L0: {
              if (((a) this).field_f.field_i.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final qf b(byte param0) {
        int var2 = -63 / ((39 - param0) / 61);
        return ((a) this).a(((a) this).field_f.field_i, (byte) -112);
    }

    public static void g(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 30514) {
          field_h = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    a(vg param0) {
        ((a) this).field_f = param0;
    }

    final static String a(gb param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.c(param2);
              if (var3_int <= param1) {
                break L1;
              } else {
                var3_int = param1;
                break L1;
              }
            }
            var4 = new byte[var3_int];
            param0.field_m = param0.field_m + v.field_g.a(0, param0.field_m, 4, var4, var3_int, param0.field_l);
            var5 = vd.a(var4, 0, var3_int, 160);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_3_0;
    }

    public final void a(vg param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            String discarded$0 = ((a) this).a((String) null, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_g = "Play the game without logging in just yet";
    }
}
