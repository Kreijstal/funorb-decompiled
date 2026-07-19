/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf {
    static String field_d;
    static byte[][] field_c;
    static int[] field_a;
    static boolean field_b;

    final static int[] a(int param0, int param1, boolean param2) {
        int[] discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = ph.a(-86, param0);
        var4 = kh.a(-101, param0);
        var5 = ph.a(-107, param1);
        var6 = kh.a(-110, param1);
        if (!param2) {
          discarded$1 = lf.a(35, -76, false);
          var7 = (int)((long)var3 * (long)var5 >> 738112592);
          var8 = (int)((long)var3 * (long)var6 >> 488210960);
          var9 = (int)((long)var4 * (long)var5 >> -1902491952);
          var10 = (int)((long)var4 * (long)var6 >> 1184452752);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var3 * (long)var5 >> 738112592);
          var8 = (int)((long)var3 * (long)var6 >> 488210960);
          var9 = (int)((long)var4 * (long)var5 >> -1902491952);
          var10 = (int)((long)var4 * (long)var6 >> 1184452752);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(int param0) {
        if (param0 != -10584) {
            return;
        }
        field_a = null;
        field_c = (byte[][]) null;
        field_d = null;
    }

    final static qk a(boolean param0, boolean param1, int param2, int param3, byte param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            uc var8 = null;
            pb var9 = null;
            qk stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            qk stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  if (param4 == -70) {
                    break L1;
                  } else {
                    var9 = (pb) null;
                    lf.a((java.math.BigInteger) null, (pb) null, (java.math.BigInteger) null, (byte) -124, (pb) null);
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  if (null != bi.field_b.field_t) {
                    ni.field_c = new tk(bi.field_b.field_t, 5200, 0);
                    bi.field_b.field_t = null;
                    var6 = new hc(255, ni.field_c, new tk(bi.field_b.field_d, 12000, 0), 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = null;
                  if (ni.field_c == null) {
                    break L3;
                  } else {
                    L4: {
                      if (rk.field_Z != null) {
                        break L4;
                      } else {
                        rk.field_Z = new tk[bi.field_b.field_o.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (rk.field_Z[param3] == null) {
                        rk.field_Z[param3] = new tk(bi.field_b.field_o[param3], 12000, 0);
                        bi.field_b.field_o[param3] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = new hc(param3, ni.field_c, rk.field_Z[param3], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = ja.field_b.a(param3, 72, param5, (hc) (var6), (hc) (var7));
                  if (!param1) {
                    break L6;
                  } else {
                    var8.a(param4 ^ 25408);
                    break L6;
                  }
                }
                stackOut_14_0 = new qk(var8, param0, param2);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.math.BigInteger param0, pb param1, java.math.BigInteger param2, byte param3, pb param4) {
        if (param3 != -75) {
            return;
        }
        try {
            uc.a(param1, param2, param4.field_i, (byte) 0, 0, param0, param4.field_g);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "lf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Music: ";
        field_c = new byte[50][];
        field_a = new int[16384];
    }
}
