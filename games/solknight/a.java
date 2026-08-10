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
        try {
            this.a((byte) -127);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "a.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1, float param2) {
        if (param0 != 102) {
            return;
        }
        try {
            pe.field_m = param1;
            jl.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "a.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    abstract qf a(String param0, byte param1);

    final String e(int param0) {
        if (param0 != 8192) {
            return (String) null;
        }
        return this.a(this.field_f.field_i, false);
    }

    abstract String a(String param0, boolean param1);

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 >= 82) {
          if (this.field_f.field_i != null) {
            if (this.field_f.field_i.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_e = (o) null;
          if (this.field_f.field_i == null) {
            return true;
          } else {
            L0: {
              if (this.field_f.field_i.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final qf b(byte param0) {
        int var2 = -63 / ((39 - param0) / 61);
        return this.a(this.field_f.field_i, (byte) -112);
    }

    public static void g(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 30514) {
          field_h = (wg) null;
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
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(gb param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.c(param2);
                  if (var3_int <= param1) {
                    break L2;
                  } else {
                    var3_int = param1;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_m = param0.field_m + v.field_g.a(0, param0.field_m, 4, var4, var3_int, param0.field_l);
                var5 = vd.a(var4, 0, var3_int, 160);
                stackIn_3_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_5_0 = "Cabbage";
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("a.P(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(vg param0, boolean param1) {
        try {
            if (!param1) {
                String var4 = (String) null;
                this.a((String) null, true);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "a.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_g = "Play the game without logging in just yet";
    }
}
