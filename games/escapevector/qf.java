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
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  om.field_g = new c(param1);
                  om.field_c = new c(param0);
                  if (param8 == 84) {
                    break L1;
                  } else {
                    qf.b(-106);
                    break L1;
                  }
                }
                L2: {
                  ca.field_c = param5;
                  if (!param7) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  jc.field_b = stackIn_5_0 != 0;
                  cn.field_h = param11;
                  sj.field_i = param13;
                  jm.field_L = param6;
                  if (!param3) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                ej.field_d = stackIn_8_0 != 0;
                ck.field_q = param10;
                ej.field_b = param9;
                qa.field_D = param4;
                ac.field_b = param12;
                rd.field_a = param2;
                if (ca.field_c.field_j == null) {
                  break L0;
                } else {
                  try {
                    L4: {
                      bd.field_h = new rg(ca.field_c.field_j, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var15_ref);
                stackOut_13_1 = new StringBuilder().append("qf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param5 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param11 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param12 + ',' + param13 + ')');
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
          field_h = (String) null;
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
            this.field_e = 0L;
            if (this.field_c < this.field_g) {
              this.field_c = this.field_c + (-this.field_c + this.field_g);
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
        var4 = -this.field_e + var2;
        this.field_e = var2;
        if (-5000000000L < var4) {
          if (5000000000L > var4) {
            this.field_f[this.field_i] = var4;
            if ((this.field_k ^ -1) <= -2) {
              this.field_i = (1 + this.field_i) % 10;
              var6 = 0L;
              var8 = param0;
              L0: while (true) {
                if (this.field_k < var8) {
                  return var6 / (long)this.field_k;
                } else {
                  var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              this.field_k = this.field_k + 1;
              this.field_i = (1 + this.field_i) % 10;
              var6 = 0L;
              var8 = param0;
              L1: while (true) {
                if (this.field_k < var8) {
                  return var6 / (long)this.field_k;
                } else {
                  var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = param0;
            L2: while (true) {
              if (this.field_k < var8) {
                return var6 / (long)this.field_k;
              } else {
                var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = param0;
          L3: while (true) {
            if (this.field_k < var8) {
              return var6 / (long)this.field_k;
            } else {
              var6 = var6 + this.field_f[(this.field_i - var8 + 10) % 10];
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
        this.field_c = this.field_c + this.c(1);
        if (!(this.field_g <= this.field_c)) {
            return (-this.field_c + this.field_g) / 1000000L;
        }
        return 0L;
    }

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var4 = 21 % ((param0 - -29) / 51);
        if (this.field_c < this.field_g) {
          this.field_e = this.field_e + (-this.field_c + this.field_g);
          this.field_c = this.field_c + (this.field_g - this.field_c);
          this.field_g = this.field_g + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              this.field_g = this.field_g + param1;
              var5++;
              if ((var5 ^ -1) <= -11) {
                break L1;
              } else {
                if ((this.field_g ^ -1L) > (this.field_c ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_c > this.field_g) {
                this.field_g = this.field_c;
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
        this.field_i = 0;
        this.field_k = 1;
        this.field_g = 0L;
        this.field_e = 0L;
        this.field_f = new long[10];
        this.field_c = 0L;
        this.field_c = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_m = new java.util.zip.CRC32();
        field_h = "Loading fonts";
        field_o = "Mode";
        field_n = "Unpacking sound effects";
        field_l = 250;
        field_j = 0;
    }
}
