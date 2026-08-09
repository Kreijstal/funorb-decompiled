/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn extends mi {
    int field_y;
    int field_w;
    static String[] field_z;
    int field_C;
    int field_x;
    int field_A;
    int field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = param2 - this.field_C - (param1 - -this.field_p);
                var9 = param6 - (this.field_x + this.field_h) - param4;
                if (this.field_A * this.field_A <= var8_int * var8_int + var9 * var9) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - gj.field_c;
                    if (0.0 <= var10) {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)this.field_w;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)this.field_w;
                      break L2;
                    }
                  }
                  this.field_y = (int)(var10 * (double)this.field_w / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_y < this.field_w) {
                      L4: while (true) {
                        if (0 <= this.field_y) {
                          break L1;
                        } else {
                          this.field_y = this.field_y + this.field_w;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_y = this.field_y - this.field_w;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_15_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("cn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public static void a(int param0) {
        field_z = null;
        if (param0 < -27) {
            return;
        }
        rk var2 = (rk) null;
        cn.a((rk) null, (byte) 13);
    }

    final static byte[] a(File param0, int param1, boolean param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            rk var4 = null;
            byte[] var5 = null;
            byte[] stackIn_3_0 = null;
            Object stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (!param2) {
                        break L2;
                      } else {
                        var4 = (rk) null;
                        cn.a((rk) null, (byte) -127);
                        break L2;
                      }
                    }
                    var5 = new byte[param1];
                    var3 = var5;
                    nm.a((byte) -106, param1, param0, var5);
                    stackIn_3_0 = (byte[]) (var5);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  stackIn_5_0 = null;
                  return (byte[]) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("cn.DA(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            cn.a(95);
            return ks.field_b;
        }
        return ks.field_b;
    }

    private cn() throws Throwable {
        throw new Error();
    }

    final static boolean a(rk param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 75) {
              stackIn_4_0 = param0.a((byte) 84);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("cn.V(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
