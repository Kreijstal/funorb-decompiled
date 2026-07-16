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
        hl var4 = new hl(param2, param0);
        var4.field_v = (ci) (Object) new ki();
        int var5 = -2 + ((ui) this).field_q;
        ((ui) this).a(((ui) this).field_q - -34, 0, ((ui) this).field_h, 0, param1);
        var4.a(30, var5, ((ui) this).field_h + -14, 7, param1);
        ((ui) this).b((lk) (Object) var4, (byte) 118);
        if (!param1) {
            ((ui) this).a(-77, -111, 74, 6);
        }
        return var4;
    }

    public static void l(int param0) {
        field_H = null;
        if (param0 != -22742) {
            ui.l(108);
        }
        field_K = null;
        field_F = null;
    }

    final static void d(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = Main.field_T;
              if (dg.field_H != null) {
                dg.field_H.a(82);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param0 < -49) {
                break L1;
              } else {
                ui.l(-66);
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
                try {
                  L4: {
                    ni.field_c.a((byte) -120);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
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
                var1 = 0;
                L7: while (true) {
                  if (var1 >= rk.field_Z.length) {
                    break L6;
                  } else {
                    if (rk.field_Z[var1] != null) {
                      try {
                        L8: {
                          rk.field_Z[var1].a((byte) -86);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ui(af param0, ee param1, String param2) {
        super(0, 0, 288, 0, (ci) null);
        ((ui) this).field_D = 0;
        ((ui) this).field_L = param2;
        ((ui) this).field_E = param0;
        ((ui) this).field_J = param1;
        int var4 = ((ui) this).field_L != null ? ((ui) this).field_J.b(((ui) this).field_L, 260, ((ui) this).field_J.field_s) : 0;
        ((ui) this).a(22 + var4, 0, 288, 0, true);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (((ui) this).field_D >= param0) {
            return;
        }
        hl[] var7 = new hl[param0];
        hl[] var3 = var7;
        if (param1 >= -26) {
            return;
        }
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
        if (param2 != -14) {
            Object var5 = null;
            hl discarded$0 = ((ui) this).a((pl) null, true, (String) null);
        }
        int var4 = ((ui) this).field_D;
        this.a(1 + var4, -44);
        ((ui) this).field_I[var4] = ((ui) this).a((pl) this, true, param0);
        ((ui) this).field_G[var4] = param1;
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        int var9 = Main.field_T;
        int var7 = -86 % ((param1 - -62) / 32);
        for (var6 = 0; ((ui) this).field_D > var6; var6++) {
            if (((ui) this).field_I[var6] == param3) {
                var8 = ((ui) this).field_G[var6];
                if (0 != (var8 ^ -1)) {
                    gh.a(((ui) this).field_G[var6], 31888);
                    break;
                }
                ((ui) this).field_E.s(81);
                break;
            }
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
