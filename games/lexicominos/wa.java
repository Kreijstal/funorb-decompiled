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
            try {
                Thread.sleep(param1);
            } catch (InterruptedException interruptedException) {
            }
            if (param0 != 5) {
                field_k = (String) null;
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
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            int var1_int = 0;
            RuntimeException var1_ref = null;
            IOException var2 = null;
            int var3 = 0;
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
                  if (param0 <= 0) {
                    break L2;
                  } else {
                    field_k = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (null == u.field_pb) {
                    break L3;
                  } else {
                    u.field_pb.a((byte) -114);
                    break L3;
                  }
                }
                L4: {
                  if (wj.field_s == null) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        wj.field_s.c(0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (null == bd.field_i) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (bd.field_i.length <= var1_int) {
                        break L7;
                      } else {
                        L9: {
                          if (null == bd.field_i[var1_int]) {
                            break L9;
                          } else {
                            try {
                              L10: {
                                bd.field_i[var1_int].c(0);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw ld.a((Throwable) ((Object) var1_ref), "wa.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = 115 % ((param0 - -66) / 60);
        field_j = null;
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        ng discarded$0 = new ng();
        field_j = new boolean[112];
    }
}
