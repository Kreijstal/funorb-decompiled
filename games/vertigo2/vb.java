/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb extends dh {
    private java.nio.ByteBuffer field_i;
    static cr field_j;
    static boolean field_g;
    static int field_h;

    public static void b() {
        field_j = null;
    }

    final static String c() {
        if (qe.field_V == null) {
            return "";
        }
        return qe.field_V;
    }

    final static void d() {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (kb.field_e == null) {
                    break L1;
                  } else {
                    kb.field_e.b((byte) 9);
                    break L1;
                  }
                }
                L2: {
                  if (null == ap.field_a) {
                    break L2;
                  } else {
                    ap.field_a.a(-82);
                    break L2;
                  }
                }
                L3: {
                  if (null != ad.field_g) {
                    {
                      L4: {
                        ad.field_g.b(-22473);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null == rg.field_g) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (rg.field_g.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (rg.field_g[var1_int] == null) {
                            var1_int++;
                            break L8;
                          } else {
                            {
                              L9: {
                                rg.field_g[var1_int].b(-22473);
                                var1_int++;
                                break L9;
                              }
                            }
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
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw wn.a((Throwable) (Object) var1_ref, "vb.E(" + 65 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] b(int param0) {
        byte[] var4 = new byte[((vb) this).field_i.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((vb) this).field_i.position(0);
        java.nio.ByteBuffer discarded$1 = ((vb) this).field_i.get(var4);
        int var3 = 8 / ((param0 - 13) / 58);
        return var4;
    }

    final void a(byte[] param0, boolean param1) {
        try {
            ((vb) this).field_i = java.nio.ByteBuffer.allocateDirect(param0.length);
            if (!param1) {
                field_j = null;
            }
            java.nio.Buffer discarded$0 = ((vb) this).field_i.position(0);
            java.nio.ByteBuffer discarded$1 = ((vb) this).field_i.put(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "vb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    vb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
        field_h = 5;
    }
}
