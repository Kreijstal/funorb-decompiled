/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends g implements qh {
    static String field_H;
    private hl field_E;
    static String field_D;
    static sc field_F;
    private hl field_G;
    private hl field_I;
    static String field_J;
    static boolean field_K;

    public static void l(int param0) {
        field_D = null;
        field_F = null;
        if (param0 != 0) {
          field_D = null;
          field_H = null;
          field_J = null;
          return;
        } else {
          field_H = null;
          field_J = null;
          return;
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (!super.a(param0, (byte) -117, param2, param3)) {
          if (98 != param2) {
            if ((param2 ^ -1) != -100) {
              if (param1 >= -99) {
                ((tj) this).a(-88, -56, 19, 33);
                return false;
              } else {
                return false;
              }
            } else {
              return ((tj) this).a(param3, (byte) -28);
            }
          } else {
            return ((tj) this).b(127, param3);
          }
        } else {
          return true;
        }
    }

    public tj() {
        super(0, 0, 476, 225, (ci) null);
        ((tj) this).field_E = new hl(mg.field_K, (pl) null);
        ((tj) this).field_I = new hl(dl.field_j, (pl) null);
        ((tj) this).field_G = new hl(oa.field_b, (pl) null);
        ki var1 = new ki();
        ((tj) this).field_E.field_v = (ci) (Object) var1;
        ((tj) this).field_I.field_v = (ci) (Object) var1;
        ((tj) this).field_G.field_v = (ci) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -593397471;
        ((tj) this).field_I.a(30, -48 + (((tj) this).field_q - var2), var4, -var3 + ((tj) this).field_h >> 672505345, true);
        ((tj) this).field_G.a(30, -48 + ((tj) this).field_q - var2, var4, (((tj) this).field_h - var3 >> -1508065919) - (-var4 - var2), true);
        ((tj) this).field_E.a(30, ((tj) this).field_q - 78 + -(var2 * 2), var3, -var3 + ((tj) this).field_h >> 1196799297, true);
        ((tj) this).field_I.field_k = (pl) this;
        ((tj) this).field_E.field_k = (pl) this;
        ((tj) this).field_G.field_k = (pl) this;
        ((tj) this).field_E.field_n = bl.field_b;
        ((tj) this).field_G.field_n = w.field_m;
        ((tj) this).b((lk) (Object) ((tj) this).field_I, (byte) 118);
        ((tj) this).b((lk) (Object) ((tj) this).field_E, (byte) 118);
        ((tj) this).b((lk) (Object) ((tj) this).field_G, (byte) 118);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((tj) this).field_o - -param0;
        int var6 = ((tj) this).field_i + param1;
        int discarded$0 = j.field_C.a(gk.field_e, var5 + 20, 20 + var6, ((tj) this).field_h - 40, -50 + ((tj) this).field_q, 16777215, param2, 1, 0, j.field_C.field_s);
        super.a(param0, param1, -1, param3);
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var5 = param1.getCodeBase();
                  var3 = fh.a(param1, var5, -1).getFile();
                  if (param0) {
                    break L1;
                  } else {
                    var4 = null;
                    tj.a(false, (java.applet.Applet) null);
                    break L1;
                  }
                }
                Object discarded$6 = vh.a(new Object[2], "updatelinks", (byte) -30, param1);
                Object discarded$7 = vh.a(new Object[2], "updatelinks", (byte) 121, param1);
                Object discarded$8 = vh.a(new Object[2], "updatelinks", (byte) 117, param1);
                Object discarded$9 = vh.a(new Object[2], "updatelinks", (byte) 118, param1);
                Object discarded$10 = vh.a(new Object[2], "updatelinks", (byte) -43, param1);
                Object discarded$11 = vh.a(new Object[2], "updatelinks", (byte) 119, param1);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Main.field_T;
        if (((tj) this).field_I != param3) {
          if (((tj) this).field_E != param3) {
            if (param3 == ((tj) this).field_G) {
              lc.a(4);
              var6 = 59 % ((param1 - -62) / 32);
              return;
            } else {
              var6 = 59 % ((param1 - -62) / 32);
              return;
            }
          } else {
            jk.a(false);
            var6 = 59 % ((param1 - -62) / 32);
            return;
          }
        } else {
          ub.c(0);
          var6 = 59 % ((param1 - -62) / 32);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Please wait...";
        field_D = "MISSES";
        field_J = "Start Game";
        field_F = new sc();
    }
}
