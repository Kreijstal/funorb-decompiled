/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends gj implements da {
    static int[] field_H;
    private String[] field_K;
    static String[] field_J;
    static int field_I;
    static int field_L;
    private bb[] field_M;
    static si[] field_F;
    private pe field_G;

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (!(!super.a(param0 ^ 0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != (param1 ^ -1))) {
            return ((ij) this).b(param2, -28533);
        }
        if (param0 != -2) {
            return true;
        }
        if (param1 == 99) {
            return ((ij) this).a(32, param2);
        }
        return false;
    }

    ij(pe param0) {
        super(0, 0, 0, 0, (ch) null);
        ((ij) this).field_G = param0;
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ni var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_31_0 = 0;
            if ((td.field_k.field_c ^ -1) <= -5) {
              if ((td.field_k.field_b ^ -1) != 0) {
                if ((td.field_k.field_b ^ -1) == 1) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if ((lc.field_r ^ -1) == -1) {
                      nj.field_a = mh.field_x.a(il.field_g, (byte) 32, fh.field_g);
                      lc.field_r = lc.field_r + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (lc.field_r ^ -1)) {
                      break L2;
                    } else {
                      if (2 == nj.field_a.field_b) {
                        stackOut_13_0 = wb.a(-1, 5);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if ((nj.field_a.field_b ^ -1) != -2) {
                          break L2;
                        } else {
                          lc.field_r = lc.field_r + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if ((lc.field_r ^ -1) != -3) {
                      break L3;
                    } else {
                      jj.field_M = new td((java.net.Socket) nj.field_a.field_e, mh.field_x);
                      var2 = new ni(13);
                      ob.a(wj.field_d, of.field_b, (byte) -19, b.field_a, var2);
                      var2.a(-11, 15);
                      var2.a(tj.field_c, (byte) -28);
                      jj.field_M.a((byte) -92, 13, 0, var2.field_k);
                      lc.field_r = lc.field_r + 1;
                      mk.field_e = 30000L + lj.a((byte) -80);
                      break L3;
                    }
                  }
                  L4: {
                    if (3 == lc.field_r) {
                      if (0 >= jj.field_M.e(-110)) {
                        if ((lj.a((byte) -25) ^ -1L) < (mk.field_e ^ -1L)) {
                          stackOut_28_0 = wb.a(-2, 5);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = jj.field_M.f(1605772320);
                        if (-1 == (var1_int ^ -1)) {
                          lc.field_r = lc.field_r + 1;
                          break L4;
                        } else {
                          stackOut_23_0 = wb.a(var1_int, 5);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (param0 > 94) {
                    if (-5 == (lc.field_r ^ -1)) {
                      td.field_k.a((Object) (Object) jj.field_M, md.field_S, (byte) 105);
                      lc.field_r = 0;
                      jj.field_M = null;
                      nj.field_a = null;
                      stackOut_35_0 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      break L0;
                    } else {
                      return -1;
                    }
                  } else {
                    stackOut_31_0 = -52;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return wb.a(-3, 5);
              }
              return stackIn_36_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 != -1) {
            ij.e((byte) 47);
        }
        if (ok.field_x != null) {
            ok.field_x.n(-22645);
        }
        lg.field_b = new ul(param1, param2, false, true, true);
        ak.field_a.d((qa) (Object) lg.field_b, 26034);
    }

    public static void e(byte param0) {
        field_H = null;
        field_F = null;
        if (param0 != -20) {
            ij.e((byte) -66);
        }
        field_J = null;
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ij) this).field_K.length) {
            L1: {
              if (param4 != ((ij) this).field_M[((ij) this).field_K.length]) {
                break L1;
              } else {
                ((ij) this).field_G.a(-92);
                break L1;
              }
            }
            L2: {
              if (param3 == 248) {
                break L2;
              } else {
                ij.e((byte) -83);
                break L2;
              }
            }
            return;
          } else {
            if (((ij) this).field_M[var6] == param4) {
              ((ij) this).field_G.a(((ij) this).field_K[var6], (byte) -96);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        fa var5 = ug.field_e;
        if (((ij) this).field_K != null) {
            int discarded$0 = var5.a(lc.field_s, param1 + ((ij) this).field_y, ((ij) this).field_z + param0, ((ij) this).field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
        }
    }

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          ((ij) this).field_C.f(1);
          if (param0 == null) {
            break L0;
          } else {
            if (-1 != (param0.length ^ -1)) {
              var3 = param0.length;
              ((ij) this).field_K = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new me(ug.field_e, 0, 1);
                  ((ij) this).field_M = new bb[var3 - -1];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      ((ij) this).field_M[var3] = new bb(ue.field_b, (kd) this);
                      var5 = -104 / ((param1 - 15) / 54);
                      ((ij) this).field_M[var3].field_p = (ch) (Object) var4;
                      ((ij) this).field_M[var3].a(0, 100, (var3 - -1) * 16 + 20, 15, 80);
                      ((ij) this).a((qa) (Object) ((ij) this).field_M[var3], (byte) -112);
                      return;
                    } else {
                      ((ij) this).field_M[var5] = new bb(((ij) this).field_K[var5], (kd) this);
                      ((ij) this).field_M[var5].field_p = (ch) (Object) var4;
                      ((ij) this).field_M[var5].field_m = lh.field_d;
                      ((ij) this).field_M[var5].a(0, 80, 20 + var5 * 16, 15, 80);
                      ((ij) this).a((qa) (Object) ((ij) this).field_M[var5], (byte) -89);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((ij) this).field_K[var4_int] = al.a((CharSequence) (Object) param0[var4_int], (byte) 111).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((ij) this).field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = 10;
        field_J = new String[]{"Complete first five levels of either set", "Complete first ten levels of either set", "Complete first twenty levels of either set", "Complete all levels of both sets", "Destroy the golden walls on level 'Golden Fleas'", "Save all fleas on level 1 of the Classic set", "Save all fleas on level 2 of the Classic set", "Save all fleas on level 3 of the Classic set", "Save all fleas on level 4 of the Classic set", "Save all fleas on level 5 of the Classic set", "Complete level 12 of the New set without any fleas drowning", "Get all fleas in the air at the same time on any level", "Complete the first five levels (of either set) without restarting", "Complete the first ten levels (of either set) without restarting", "Complete the first twenty levels (of either set) without restarting", "Complete all levels (of either set) without restarting"};
    }
}
