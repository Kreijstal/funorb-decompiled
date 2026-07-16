/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends hn implements ng {
    static int field_E;
    static la field_D;
    static int field_I;
    static String[] field_C;
    private ba field_B;
    static int[] field_F;
    private String[] field_J;
    static String field_G;
    private lg[] field_H;

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        je var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          ((vp) this).field_y.a(0);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length != 0) {
              var3 = param0.length;
              ((vp) this).field_J = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  L2: {
                    var4 = new je(dg.field_e, 0, 1);
                    ((vp) this).field_H = new lg[1 + var3];
                    if (param1 < -41) {
                      break L2;
                    } else {
                      field_D = null;
                      break L2;
                    }
                  }
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((vp) this).field_H[var3] = new lg(jf.field_b, (ca) this);
                      ((vp) this).field_H[var3].field_q = (el) (Object) var4;
                      ((vp) this).field_H[var3].a((byte) -36, 0, (var3 + 1) * 16 + 20, 15, 100);
                      ((vp) this).a((gm) (Object) ((vp) this).field_H[var3], -6938);
                      return;
                    } else {
                      ((vp) this).field_H[var5] = new lg(((vp) this).field_J[var5], (ca) this);
                      ((vp) this).field_H[var5].field_q = (el) (Object) var4;
                      ((vp) this).field_H[var5].field_n = ai.field_l;
                      ((vp) this).field_H[var5].a((byte) 123, 0, 20 + var5 * 16, 15, 80);
                      ((vp) this).a((gm) (Object) ((vp) this).field_H[var5], -6938);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((vp) this).field_J[var4_int] = ab.a((byte) -114, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((vp) this).field_J = null;
    }

    vp(ba param0) {
        super(0, 0, 0, 0, (el) null);
        ((vp) this).field_B = param0;
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((vp) this).field_J.length) {
            L1: {
              if (param0 <= -85) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              if (param1 == ((vp) this).field_H[((vp) this).field_J.length]) {
                ((vp) this).field_B.a((byte) 97);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (param1 == ((vp) this).field_H[var6]) {
              ((vp) this).field_B.a((byte) 21, ((vp) this).field_J[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -114, param2, param3);
        if (-1 != (param0 ^ -1)) {
            return;
        }
        if (param1 >= -7) {
            return;
        }
        uc var5 = dg.field_e;
        if (null != ((vp) this).field_J) {
            int discarded$0 = var5.a(bi.field_I, param3 - -((vp) this).field_w, param2 - -((vp) this).field_k, ((vp) this).field_p, 20, 16777215, -1, 0, 0, var5.field_t + var5.field_x);
        }
    }

    public static void h(int param0) {
        field_C = null;
        field_D = null;
        field_F = null;
        field_G = null;
        if (param0 != -1) {
            field_C = null;
        }
    }

    final static void b(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  Object discarded$1 = hp.a(ip.a(9), new Object[1], 28989, "resizing");
                  if (param1 < -57) {
                    break L1;
                  } else {
                    field_G = null;
                    break L1;
                  }
                }
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

    final boolean a(int param0, gm param1, char param2, int param3) {
        if (super.a(param0, param1, param2, -96)) {
            return true;
        }
        if (!((param0 ^ -1) != -99)) {
            return ((vp) this).a((byte) 66, param1);
        }
        int var5 = -103 % ((-33 - param3) / 57);
        if ((param0 ^ -1) == -100) {
            return ((vp) this).b(param1, -9928);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"All scores", "My scores", "Best each"};
        field_E = 0;
        field_G = "<col=2>Surfaces:</col>";
    }
}
