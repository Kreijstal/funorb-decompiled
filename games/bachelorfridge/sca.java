/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class sca {
    static byte[] field_c;
    static int field_d;
    static String field_b;
    static kv field_a;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            lu var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_31_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_28_0 = 0;
            if (aka.field_G.field_e >= 4) {
              if (aka.field_G.field_k != -1) {
                if (aka.field_G.field_k == -2) {
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
                    if (param0 != ds.field_m) {
                      break L1;
                    } else {
                      ch.field_p = mh.field_l.a((byte) 120, pw.field_A, nj.field_f);
                      ds.field_m = ds.field_m + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (ds.field_m != 1) {
                      break L2;
                    } else {
                      if (ch.field_p.field_f != 2) {
                        if (ch.field_p.field_f == 1) {
                          ds.field_m = ds.field_m + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_11_0 = cj.a(-1, 1);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      }
                    }
                  }
                  L3: {
                    if (ds.field_m != 2) {
                      break L3;
                    } else {
                      hla.field_s = new pj((java.net.Socket) ch.field_p.field_e, mh.field_l);
                      var2 = new lu(13);
                      cca.a(var2, uea.field_i, (byte) -103, ma.field_E, ro.field_j);
                      var2.d(15, 0);
                      var2.e(bd.field_m, -1615464796);
                      hla.field_s.a(0, var2.field_h, false, 13);
                      ds.field_m = ds.field_m + 1;
                      wh.field_q = f.b((byte) 73) + 30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (ds.field_m != 3) {
                      break L4;
                    } else {
                      if (0 < hla.field_s.b(125)) {
                        var1_int = hla.field_s.b((byte) -47);
                        if (var1_int == 0) {
                          ds.field_m = ds.field_m + 1;
                          break L4;
                        } else {
                          stackOut_24_0 = cj.a(var1_int, 1);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      } else {
                        if (~wh.field_q <= ~f.b((byte) 73)) {
                          break L4;
                        } else {
                          stackOut_21_0 = cj.a(-2, 1);
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    }
                  }
                  if (ds.field_m != 4) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L0;
                  } else {
                    aka.field_G.a(nf.field_M, (Object) (Object) hla.field_s, 16008);
                    ch.field_p = null;
                    hla.field_s = null;
                    ds.field_m = 0;
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return cj.a(-3, 1);
              }
              return stackIn_31_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(byte param0);

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, byte param1);

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = "Create a free Account";
    }
}
