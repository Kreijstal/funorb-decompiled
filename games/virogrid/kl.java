/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kl extends fd implements ta {
    private String[] field_H;
    private tg[] field_F;
    private fc field_G;
    static int field_E;

    final static void a(byte param0, int param1) {
        int var3 = Virogrid.field_F ? 1 : 0;
        dh var2 = (dh) (Object) bl.field_D.a((byte) -99);
        if (param0 > -18) {
            field_E = 67;
        }
        while (var2 != null) {
            gl.a(var2, (byte) 111, param1);
            var2 = (dh) (Object) bl.field_D.a(16213);
        }
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        ti var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (param1 >= 13) {
          L0: {
            ((kl) this).field_z.a(false);
            if (param0 == null) {
              break L0;
            } else {
              if (-1 != (param0.length ^ -1)) {
                var3 = param0.length;
                ((kl) this).field_H = new String[var3];
                var4_int = 0;
                L1: while (true) {
                  if (var3 <= var4_int) {
                    var4 = new ti(dj.field_h, 0, 1);
                    ((kl) this).field_F = new tg[1 + var3];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((kl) this).field_F[var3] = new tg(rj.field_i, (cd) this);
                        ((kl) this).field_F[var3].field_w = (ol) (Object) var4;
                        ((kl) this).field_F[var3].a(15, true, 20 - (-(var3 * 16) + -16), 0, 100);
                        ((kl) this).a((fi) (Object) ((kl) this).field_F[var3], (byte) -78);
                        return;
                      } else {
                        ((kl) this).field_F[var5] = new tg(((kl) this).field_H[var5], (cd) this);
                        ((kl) this).field_F[var5].field_w = (ol) (Object) var4;
                        ((kl) this).field_F[var5].field_h = jj.field_i;
                        ((kl) this).field_F[var5].a(15, true, 20 + 16 * var5, 0, 80);
                        ((kl) this).a((fi) (Object) ((kl) this).field_F[var5], (byte) -78);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    ((kl) this).field_H[var4_int] = ji.a(11, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((kl) this).field_H = null;
          return;
        } else {
          return;
        }
    }

    final static void a(jc param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var6 = Virogrid.field_F ? 1 : 0;
              var10 = new byte[24];
              var8 = var10;
              var7 = var8;
              var11 = var7;
              var9 = var11;
              var2 = var9;
              var3 = -4 / ((param1 - -44) / 58);
              if (null == gh.field_Ib) {
                break L0;
              } else {
                try {
                  L1: {
                    gh.field_Ib.a(0L, 0);
                    gh.field_Ib.a((byte) -102, var10);
                    var4_int = 0;
                    L2: while (true) {
                      L3: {
                        if (-25 >= (var4_int ^ -1)) {
                          break L3;
                        } else {
                          if (0 == var11[var4_int]) {
                            var4_int++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var4_int < 24) {
                        break L1;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4 = (Exception) (Object) decompiledCaughtException;
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= 24) {
                        break L4;
                      } else {
                        var2[var5] = (byte)-1;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              }
            }
            param0.a(var11, 24, 0, (byte) 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 == 12085) {
            break L0;
          } else {
            kl.a((byte) 103, 7);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((kl) this).field_H.length <= var6) {
            L2: {
              if (param1 == ((kl) this).field_F[((kl) this).field_H.length]) {
                ((kl) this).field_G.a((byte) -72);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (((kl) this).field_F[var6] == param1) {
              ((kl) this).field_G.a(((kl) this).field_H[var6], false);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    kl(fc param0) {
        super(0, 0, 0, 0, (ol) null);
        ((kl) this).field_G = param0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        e var5 = dj.field_h;
        if (((kl) this).field_H != null) {
            int discarded$0 = var5.a(bg.field_Pb, ((kl) this).field_l + param1, param2 - -((kl) this).field_u, ((kl) this).field_g, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_H);
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2, -118))) {
            return true;
        }
        if (!((param2 ^ -1) != -99)) {
            return ((kl) this).b(2, param0);
        }
        int var5 = 4 / ((param3 - -75) / 36);
        if (-100 != (param2 ^ -1)) {
            return false;
        }
        return ((kl) this).a(-16234, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 10;
    }
}
