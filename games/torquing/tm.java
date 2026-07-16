/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tm {
    static int field_c;
    static int[] field_e;
    static int field_b;
    private java.util.zip.Inflater field_d;
    static boolean field_a;

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        var3 = db.a(param2, 31108);
        if (param0) {
          if (0 == (param1.indexOf(param2) ^ -1)) {
            if (param1.indexOf(var3) == -1) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var4 = null;
          tm.a((byte) 108, (t) null);
          if (0 == (param1.indexOf(param2) ^ -1)) {
            if (param1.indexOf(var3) == -1) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (!param1.endsWith(var3)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Torquing.field_u;
        L0: while (true) {
          param0--;
          if (param0 < 0) {
            if (param2 >= -91) {
              field_b = -71;
              return;
            } else {
              return;
            }
          } else {
            var9 = param3;
            var5 = var9;
            var6 = param1;
            var7 = param4;
            var9[var6] = var7 + ie.a(8355711, var9[var6] >> -1476739551);
            param1++;
            continue L0;
          }
        }
    }

    final static void a(byte param0, t param1) {
        bp.a((byte) -78);
        ph.a(param1.field_y, param1.field_w, param1.field_u);
        int var2 = 10 % ((param0 - -52) / 47);
    }

    final void a(byte param0, fj param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1.field_j[param1.field_n] != 31) {
                break L0;
              } else {
                if (116 != (param1.field_j[1 + param1.field_n] ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    if (null == ((tm) this).field_d) {
                      ((tm) this).field_d = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      ((tm) this).field_d.setInput(param1.field_j, 10 + param1.field_n, -param1.field_n + -18 + param1.field_j.length);
                      int discarded$2 = ((tm) this).field_d.inflate(param2);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((tm) this).field_d.reset();
                    throw new RuntimeException("");
                  }
                  ((tm) this).field_d.reset();
                  if (param0 != -67) {
                    field_e = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tm() {
        this(-1, 1000000, 1000000);
    }

    public static void a(byte param0) {
        if (param0 != -12) {
            field_c = -16;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private tm(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_a = true;
    }
}
