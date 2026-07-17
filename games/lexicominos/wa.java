/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wa extends kd {
    int field_h;
    int field_o;
    int field_n;
    int field_l;
    static boolean[] field_j;
    int field_i;
    static String field_k;
    int field_m;

    final static void a(byte param0, long param1) {
        try {
            {
                Thread.sleep(param1);
            }
            if (param0 != 5) {
                field_k = null;
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (kb.field_b != null) {
                    kb.field_b.b(0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null == u.field_pb) {
                    break L2;
                  } else {
                    u.field_pb.a((byte) -114);
                    break L2;
                  }
                }
                L3: {
                  if (wj.field_s == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        wj.field_s.c(0);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null == bd.field_i) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (bd.field_i.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (null == bd.field_i[var1_int]) {
                            var1_int++;
                            break L8;
                          } else {
                            {
                              L9: {
                                bd.field_i[var1_int].c(0);
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
              throw ld.a((Throwable) (Object) var1_ref, "wa.C(" + -45 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = 1;
        field_j = null;
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ng discarded$0 = new ng();
        field_j = new boolean[112];
    }
}
