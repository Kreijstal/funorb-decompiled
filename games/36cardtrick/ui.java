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
        int discarded$0 = ((ui) this).field_J.a(((ui) this).field_L, ((ui) this).field_o + param0 + 14, 10 + param1 + ((ui) this).field_i, ((ui) this).field_h - 28, ((ui) this).field_q, 16777215, -1, 0, 0, ((ui) this).field_J.field_s);
    }

    final hl a(pl param0, boolean param1, String param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new hl(param2, param0);
              var4.field_v = (ci) (Object) new ki();
              var5 = -2 + ((ui) this).field_q;
              ((ui) this).a(((ui) this).field_q - -34, 0, ((ui) this).field_h, 0, param1);
              var4.a(30, var5, ((ui) this).field_h + -14, 7, param1);
              ((ui) this).b((lk) (Object) var4, (byte) 118);
              if (param1) {
                break L1;
              } else {
                ((ui) this).a(-77, -111, 74, 6);
                break L1;
              }
            }
            stackOut_2_0 = (hl) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ui.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void l(int param0) {
        field_H = null;
        if (param0 != -22742) {
            ui.l(108);
        }
        field_K = null;
        field_F = null;
    }

    final static void d() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Main.field_T;
            try {
              L0: {
                L1: {
                  if (dg.field_H != null) {
                    dg.field_H.a(82);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != sc.field_b) {
                    sc.field_b.b(124);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ni.field_c != null) {
                    {
                      L4: {
                        ni.field_c.a((byte) -120);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null == rk.field_Z) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= rk.field_Z.length) {
                        break L6;
                      } else {
                        L8: {
                          if (rk.field_Z[var1_int] != null) {
                            {
                              L9: {
                                rk.field_Z[var1_int].a((byte) -86);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ma.a((Throwable) (Object) var1, "ui.D(" + -122 + ')');
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
        ((ui) this).field_D = 0;
        try {
            ((ui) this).field_L = param2;
            ((ui) this).field_E = param0;
            ((ui) this).field_J = param1;
            var4_int = ((ui) this).field_L != null ? ((ui) this).field_J.b(((ui) this).field_L, 260, ((ui) this).field_J.field_s) : 0;
            ((ui) this).a(22 + var4_int, 0, 288, 0, true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (((ui) this).field_D >= param0) {
            return;
        }
        hl[] var7 = new hl[param0];
        hl[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < ((ui) this).field_D; var5++) {
            var7[var5] = ((ui) this).field_I[var5];
            var4[var5] = ((ui) this).field_G[var5];
        }
        ((ui) this).field_I = var3;
        ((ui) this).field_D = param0;
        ((ui) this).field_G = var4;
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param2 != -14) {
                Object var5 = null;
                hl discarded$0 = ((ui) this).a((pl) null, true, (String) null);
            }
            var4_int = ((ui) this).field_D;
            this.a(1 + var4_int, -44);
            ((ui) this).field_I[var4_int] = ((ui) this).a((pl) this, true, param0);
            ((ui) this).field_G[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ui.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            var7 = -86 % ((param1 - -62) / 32);
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (((ui) this).field_D <= var6_int) {
                  break L2;
                } else {
                  if (((ui) this).field_I[var6_int] != param3) {
                    var6_int++;
                    continue L1;
                  } else {
                    var8 = ((ui) this).field_G[var6_int];
                    if (var8 == -1) {
                      ((ui) this).field_E.s(81);
                      break L2;
                    } else {
                      gh.a(((ui) this).field_G[var6_int], 31888);
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
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("ui.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "That name is not available";
        field_F = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
