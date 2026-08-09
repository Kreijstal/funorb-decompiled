/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ee {
    private boolean field_a;
    static java.util.zip.CRC32 field_f;
    static String[] field_d;
    private String field_e;
    static fj[] field_b;
    static int[] field_g;
    static String field_c;

    ee(String param0) {
        this(param0, false);
    }

    final boolean b(int param0) {
        if (param0 > -97) {
            field_g = (int[]) null;
            return this.field_a;
        }
        return this.field_a;
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        vc var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 > (param2 ^ -1)) {
                  break L2;
                } else {
                  var4 = param3;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = new byte[param1];
              var4 = var8;
              var5_int = 0;
              L3: while (true) {
                if (param1 <= var5_int) {
                  break L1;
                } else {
                  var8[var5_int] = param3[param2 + var5_int];
                  var5_int++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5 = new vc();
            var5.a(100);
            var5.a((byte) 48, var4, (long)(param1 * 8));
            var6 = new byte[64];
            var5.a(var6, (byte) 87, 0);
            stackIn_7_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("ee.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        if (!rl.a((byte) 109)) {
            return;
        }
        gb.a(true, param0, false);
    }

    final String a(boolean param0) {
        if (!param0) {
            this.a(true);
            return this.field_e;
        }
        return this.field_e;
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        if (param0 < 96) {
            return;
        }
        field_d = null;
        field_f = null;
        field_c = null;
    }

    ee(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_e = param0;
              if (this.field_e != null) {
                break L1;
              } else {
                this.field_e = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((ee) (this)).field_a = stackIn_6_1 != 0;
            if (-1 != (this.field_e.length() ^ -1)) {
              break L0;
            } else {
              this.field_a = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ee.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = "Connection timed out. Please try using a different server.";
        field_g = new int[8192];
        field_f = new java.util.zip.CRC32();
    }
}
