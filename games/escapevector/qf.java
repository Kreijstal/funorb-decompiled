/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qf extends eo {
    private int field_i;
    private long field_e;
    private long[] field_f;
    private int field_k;
    private long field_g;
    private long field_c;
    static java.util.zip.CRC32 field_m;
    static String field_h;
    static int field_l;
    static String field_o;
    static String field_n;
    static ed field_d;
    static int field_j;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, lk param5, int param6, boolean param7, byte param8, int param9, long param10, String param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              om.field_g = new c(param1);
              om.field_c = new c(param0);
              if (param8 == 84) {
                break L0;
              } else {
                qf.b(-106);
                break L0;
              }
            }
            L1: {
              ca.field_c = param5;
              if (!param7) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              jc.field_b = stackIn_5_0 != 0;
              cn.field_h = param11;
              sj.field_i = param13;
              jm.field_L = param6;
              if (!param3) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            ej.field_d = stackIn_8_0 != 0;
            ck.field_q = param10;
            ej.field_b = param9;
            qa.field_D = param4;
            ac.field_b = param12;
            rd.field_a = param2;
            if (ca.field_c.field_j == null) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                bd.field_h = new rg(ca.field_c.field_j, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_n = null;
        field_m = null;
        field_o = null;
        if (param0 <= 89) {
          field_h = null;
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final void a(int param0) {
        if (param0 != 237) {
          return;
        } else {
          L0: {
            ((qf) this).field_e = 0L;
            if (((qf) this).field_c < ((qf) this).field_g) {
              ((qf) this).field_c = ((qf) this).field_c + (-((qf) this).field_c + ((qf) this).field_g);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        var2 = System.nanoTime();
        var4 = -((qf) this).field_e + var2;
        ((qf) this).field_e = var2;
        if (-5000000000L < var4) {
          if (5000000000L > var4) {
            ((qf) this).field_f[((qf) this).field_i] = var4;
            if ((((qf) this).field_k ^ -1) <= -2) {
              ((qf) this).field_i = (1 + ((qf) this).field_i) % 10;
              var6 = 0L;
              var8 = param0;
              L0: while (true) {
                if (((qf) this).field_k < var8) {
                  return var6 / (long)((qf) this).field_k;
                } else {
                  var6 = var6 + ((qf) this).field_f[(((qf) this).field_i - var8 + 10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((qf) this).field_k = ((qf) this).field_k + 1;
              ((qf) this).field_i = (1 + ((qf) this).field_i) % 10;
              var6 = 0L;
              var8 = param0;
              L1: while (true) {
                if (((qf) this).field_k < var8) {
                  return var6 / (long)((qf) this).field_k;
                } else {
                  var6 = var6 + ((qf) this).field_f[(((qf) this).field_i - var8 + 10) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = param0;
            L2: while (true) {
              if (((qf) this).field_k < var8) {
                return var6 / (long)((qf) this).field_k;
              } else {
                var6 = var6 + ((qf) this).field_f[(((qf) this).field_i - var8 + 10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = param0;
          L3: while (true) {
            if (((qf) this).field_k < var8) {
              return var6 / (long)((qf) this).field_k;
            } else {
              var6 = var6 + ((qf) this).field_f[(((qf) this).field_i - var8 + 10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final long c(byte param0) {
        if (param0 <= 70) {
            return -6L;
        }
        ((qf) this).field_c = ((qf) this).field_c + this.c(1);
        if (!(((qf) this).field_g <= ((qf) this).field_c)) {
            return (-((qf) this).field_c + ((qf) this).field_g) / 1000000L;
        }
        return 0L;
    }

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var4 = 21 % ((param0 - -29) / 51);
        if (((qf) this).field_c < ((qf) this).field_g) {
          ((qf) this).field_e = ((qf) this).field_e + (-((qf) this).field_c + ((qf) this).field_g);
          ((qf) this).field_c = ((qf) this).field_c + (((qf) this).field_g - ((qf) this).field_c);
          ((qf) this).field_g = ((qf) this).field_g + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              ((qf) this).field_g = ((qf) this).field_g + param1;
              var5++;
              if ((var5 ^ -1) <= -11) {
                break L1;
              } else {
                if ((((qf) this).field_g ^ -1L) > (((qf) this).field_c ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((qf) this).field_c > ((qf) this).field_g) {
                ((qf) this).field_g = ((qf) this).field_c;
                break L2;
              } else {
                break L2;
              }
            }
            return var5;
          }
        }
    }

    qf() {
        ((qf) this).field_i = 0;
        ((qf) this).field_k = 1;
        ((qf) this).field_g = 0L;
        ((qf) this).field_e = 0L;
        ((qf) this).field_f = new long[10];
        ((qf) this).field_c = 0L;
        ((qf) this).field_c = System.nanoTime();
        ((qf) this).field_g = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new java.util.zip.CRC32();
        field_h = "Loading fonts";
        field_o = "Mode";
        field_n = "Unpacking sound effects";
        field_l = 250;
        field_j = 0;
    }
}
