/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ui extends g implements qh {
    static String field_K;
    private int[] field_G;
    private af field_E;
    private hl[] field_I;
    private ee field_J;
    static byte[][][] field_H;
    private String field_L;
    static String field_F;
    private int field_D;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_J.a(this.field_L, this.field_o + param0 + 14, 10 + param1 + this.field_i, this.field_h - 28, this.field_q, 16777215, -1, 0, 0, this.field_J.field_s);
    }

    final hl a(pl param0, boolean param1, String param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new hl(param2, param0);
              var4.field_v = (ci) ((Object) new ki());
              var5 = -2 + this.field_q;
              this.a(this.field_q - -34, 0, this.field_h, 0, param1);
              var4.a(30, var5, this.field_h + -14, 7, param1);
              this.b(var4, (byte) 118);
              if (param1) {
                break L1;
              } else {
                this.a(-77, -111, 74, 6);
                break L1;
              }
            }
            stackIn_3_0 = (hl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ui.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void l(int param0) {
        field_H = (byte[][][]) null;
        if (param0 != -22742) {
            ui.l(108);
        }
        field_K = null;
        field_F = null;
    }

    final static void d(byte param0) {
        try {
            int var1_int = 0;
            int var3 = Main.field_T;
            try {
                if (!(dg.field_H == null)) {
                    dg.field_H.a(82);
                }
                if (param0 >= -49) {
                    ui.l(-66);
                }
                if (!(null == sc.field_b)) {
                    sc.field_b.b(124);
                }
                if (!(ni.field_c == null)) {
                    try {
                        ni.field_c.a((byte) -120);
                    } catch (IOException iOException) {
                    }
                }
                if (null != rk.field_Z) {
                    for (var1_int = 0; var1_int < rk.field_Z.length; var1_int++) {
                        if (!(rk.field_Z[var1_int] == null)) {
                            try {
                                rk.field_Z[var1_int].a((byte) -86);
                            } catch (IOException var2_ref) {
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeException) {
                throw ma.a((Throwable) ((Object) runtimeException), "ui.D(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ui(af param0, ee param1, String param2) {
        super(0, 0, 288, 0, (ci) null);
        int var4_int = 0;
        this.field_D = 0;
        try {
            this.field_L = param2;
            this.field_E = param0;
            this.field_J = param1;
            var4_int = this.field_L != null ? this.field_J.b(this.field_L, 260, this.field_J.field_s) : 0;
            this.a(22 + var4_int, 0, 288, 0, true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (this.field_D >= param0) {
            return;
        }
        hl[] var7 = new hl[param0];
        hl[] var3 = var7;
        if (param1 >= -26) {
            return;
        }
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < this.field_D; var5++) {
            var7[var5] = this.field_I[var5];
            var4[var5] = this.field_G[var5];
        }
        this.field_I = var3;
        this.field_D = param0;
        this.field_G = var4;
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param2 != -14) {
                String var5 = (String) null;
                this.a((pl) null, true, (String) null);
            }
            var4_int = this.field_D;
            this.a(1 + var4_int, -44);
            this.field_I[var4_int] = this.a((pl) (this), true, param0);
            this.field_G[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ui.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = Main.field_T;
        try {
          L0: {
            var7 = -86 % ((param1 - -62) / 32);
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_D <= var6_int) {
                  break L2;
                } else {
                  if (this.field_I[var6_int] != param3) {
                    var6_int++;
                    continue L1;
                  } else {
                    var8 = this.field_G[var6_int];
                    if (0 == (var8 ^ -1)) {
                      this.field_E.s(81);
                      break L2;
                    } else {
                      gh.a(this.field_G[var6_int], 31888);
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("ui.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
    }

    static {
        field_K = "That name is not available";
        field_F = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
