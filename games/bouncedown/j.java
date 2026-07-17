/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j extends ai {
    long field_h;
    static gk field_j;
    int field_g;
    byte[] field_i;

    final static gk a(boolean param0, byte param1, boolean param2, int param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ce var8 = null;
            gk stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            gk stackOut_15_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (param1 < -94) {
                    break L1;
                  } else {
                    field_j = null;
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (null != vc.field_G.field_j) {
                    jg.field_C = new jf(vc.field_G.field_j, 5200, 0);
                    vc.field_G.field_j = null;
                    var6 = (Object) (Object) new vh(255, jg.field_C, new jf(vc.field_G.field_m, 12000, 0), 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == jg.field_C) {
                    break L3;
                  } else {
                    L4: {
                      if (pd.field_a == null) {
                        pd.field_a = new jf[vc.field_G.field_u.length];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (pd.field_a[param3] != null) {
                        break L5;
                      } else {
                        pd.field_a[param3] = new jf(vc.field_G.field_u[param3], 12000, 0);
                        vc.field_G.field_u[param3] = null;
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new vh(param3, jg.field_C, pd.field_a[param3], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = ih.field_Q.a(param2, (vh) var7, (vh) var6, param3, -18023);
                  if (param0) {
                    var8.b((byte) -124);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_15_0 = new gk((td) (Object) var8, param4, param5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_j = null;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 < 65) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param0 > 90) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static void c(byte param0) {
        ig.a(-102);
        fe.field_g = true;
        int var1 = -119 % ((param0 - -35) / 46);
        ee.field_c = true;
        q.field_N.k(-20281);
        fj.a(false, vb.field_o, -1);
    }

    j(long param0, int param1, byte[] param2) {
        try {
            ((j) this).field_h = param0;
            ((j) this).field_g = param1;
            ((j) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "j.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
