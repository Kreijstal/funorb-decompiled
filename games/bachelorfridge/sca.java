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
            int stackIn_13_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_32_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_29_0 = 0;
            if (-5 >= (aka.field_G.field_e ^ -1)) {
              if (0 != (aka.field_G.field_k ^ -1)) {
                if (aka.field_G.field_k != -2) {
                  return 1;
                } else {
                  return 4;
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
                      if (-3 != (ch.field_p.field_f ^ -1)) {
                        if ((ch.field_p.field_f ^ -1) == -2) {
                          ds.field_m = ds.field_m + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = cj.a(-1, 1);
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (-3 != (ds.field_m ^ -1)) {
                      break L3;
                    } else {
                      hla.field_s = new pj((java.net.Socket) (ch.field_p.field_e), mh.field_l);
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
                    if ((ds.field_m ^ -1) != -4) {
                      break L4;
                    } else {
                      if (0 < hla.field_s.b(125)) {
                        var1_int = hla.field_s.b((byte) -47);
                        if (var1_int == 0) {
                          ds.field_m = ds.field_m + 1;
                          break L4;
                        } else {
                          stackOut_25_0 = cj.a(var1_int, 1);
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if ((wh.field_q ^ -1L) <= (f.b((byte) 73) ^ -1L)) {
                          break L4;
                        } else {
                          stackOut_22_0 = cj.a(-2, 1);
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  if (ds.field_m != 4) {
                    stackOut_31_0 = -1;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    aka.field_G.a(nf.field_M, hla.field_s, 16008);
                    ch.field_p = null;
                    hla.field_s = null;
                    ds.field_m = 0;
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return cj.a(-3, 1);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_30_0;
                    } else {
                      return stackIn_32_0;
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

    abstract int a(byte param0);

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, byte param1);

    public static void b(byte param0) {
        field_a = null;
        if (param0 != -33) {
            field_a = (kv) null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_d = 0;
        field_b = "Create a free Account";
    }
}
