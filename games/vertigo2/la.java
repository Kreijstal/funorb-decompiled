/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private gp field_b;
    static int[] field_d;
    static ej field_i;
    static cr field_f;
    static cc field_a;
    static r field_e;
    static String field_c;
    private ak field_h;
    private jl field_g;
    private int field_j;

    final gp a(long param0, boolean param1) {
        gp var4;
        var4 = (gp) ((Object) this.field_g.a(param0, (byte) 64));
        if (!param1) {
          if (var4 != null) {
            this.field_h.a(false, var4);
            return var4;
          } else {
            return var4;
          }
        } else {
          field_i = (ej) null;
          if (var4 == null) {
            return var4;
          } else {
            this.field_h.a(false, var4);
            return var4;
          }
        }
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              km.a(param1, false, true, param0);
              if (param2 == 26806) {
                break L1;
              } else {
                la.a(true);
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

            stackIn_5_1 = new StringBuilder().append("la.E(");

            if (param0 == null) {
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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3) {
        oi.a(param0, param3, param2 ^ -10, param1);
        if (param2 != -120) {
            la.a(-64, false, (byte) -93, -119);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          field_a = (cc) null;
          field_i = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final void a(int param0, gp param1, long param2) {
        RuntimeException runtimeException = null;
        gp var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((this.field_j ^ -1) != param0) {
                this.field_j = this.field_j - 1;
                break L1;
              } else {
                var5 = this.field_h.a(-124);
                var5.c(param0 ^ -3);
                var5.a(-99);
                if (var5 != this.field_b) {
                  break L1;
                } else {
                  var5 = this.field_h.a(-98);
                  var5.c(param0 + 3);
                  var5.a(-109);
                  break L1;
                }
              }
            }
            this.field_g.a(param1, param2, false);
            this.field_h.a(false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("la.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        in.field_c = null;
        if (param0 <= 14) {
          la.a((byte) 27);
          vi.field_w = null;
          se.field_y = (byte[][]) null;
          pc.field_a = null;
          ca.field_a = null;
          mh.field_c = null;
          return;
        } else {
          vi.field_w = null;
          se.field_y = (byte[][]) null;
          pc.field_a = null;
          ca.field_a = null;
          mh.field_c = null;
          return;
        }
    }

    la(int param0) {
        int var2 = 0;
        this.field_b = new gp();
        this.field_h = new ak();
        this.field_j = param0;
        for (var2 = 1; var2 + var2 < param0; var2 = var2 + var2) {
        }
        this.field_g = new jl(var2);
    }

    static {
        field_i = new ej("usename");
        field_c = "Email: ";
    }
}
