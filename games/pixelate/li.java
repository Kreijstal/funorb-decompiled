/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_b;
    static tf[] field_a;
    private ba[] field_c;
    static String field_i;
    static boolean field_e;
    private int[] field_f;
    static tf field_d;
    static tf[] field_h;
    static String field_j;
    static rg field_g;

    public static void a(byte param0) {
        String var2;
        field_a = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        if (param0 <= 12) {
          var2 = (String) null;
          li.a(0.3477739989757538f, -63, (String) null);
          field_j = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          return;
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = -1 + this.field_c.length;
        if (param0 != -123) {
          field_d = (tf) null;
          L0: while (true) {
            if (0 <= var2) {
              if (this.field_c[var2] != null) {
                this.field_c[var2].b(-904);
                var2--;
                continue L0;
              } else {
                var2--;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (0 <= var2) {
              if (this.field_c[var2] != null) {
                this.field_c[var2].b(-904);
                var2--;
                continue L1;
              } else {
                var2--;
                continue L1;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(float param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ad.field_r = param2;
              bf.field_o = param0;
              if (param1 == -1) {
                break L1;
              } else {
                li.a((byte) -73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("li.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    li(int param0, int param1, int[] param2) {
        try {
            this.field_f = param2;
            this.field_c = new ba[param0];
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "li.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param2 == 116) {
          var6 = -1 + this.field_c.length;
          L0: while (true) {
            if ((var6 ^ -1) <= -1) {
              if (this.field_c[var6] == null) {
                this.field_c[var6] = new ba(param1, param4, param0, param3, this.field_f);
                var6--;
                continue L0;
              } else {
                if (this.field_c[var6].a(true)) {
                  this.field_c[var6] = new ba(param1, param4, param0, param3, this.field_f);
                  var6--;
                  continue L0;
                } else {
                  var6--;
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        } else {
          field_e = true;
          var6 = -1 + this.field_c.length;
          L1: while (true) {
            if ((var6 ^ -1) <= -1) {
              if (this.field_c[var6] == null) {
                this.field_c[var6] = new ba(param1, param4, param0, param3, this.field_f);
                var6--;
                continue L1;
              } else {
                if (this.field_c[var6].a(true)) {
                  this.field_c[var6] = new ba(param1, param4, param0, param3, this.field_f);
                  var6--;
                  continue L1;
                } else {
                  var6--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_e = false;
        field_g = null;
        field_j = "<%0> has been removed.";
    }
}
