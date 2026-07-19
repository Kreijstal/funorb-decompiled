/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ji {
    private byte field_a;
    static int field_d;
    private dk[] field_l;
    private short[] field_n;
    private byte field_c;
    static boolean field_f;
    private int[] field_k;
    private int field_j;
    static int field_g;
    private boolean field_e;
    private int[] field_i;
    private byte[] field_m;
    static na field_h;
    static int[] field_b;

    final void a(boolean param0, byte param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 > 56) {
                break L1;
              } else {
                this.a((byte) -68);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (!this.field_e) {
                    if (this.field_j <= var4_int) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    if (var4_int >= this.field_l.length) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_l[var4_int].a(262144, param2);
                var4_int++;
                continue L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ji.D(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public static void a(boolean param0) {
        di discarded$0 = null;
        field_b = null;
        field_h = null;
        if (param0) {
            discarded$0 = ji.a(-2, true, (byte) 41, 72, false, false);
        }
    }

    final static di a(int param0, boolean param1, byte param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            up var8 = null;
            di stackIn_5_0 = null;
            di stackIn_16_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            di stackOut_15_0 = null;
            di stackOut_4_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != fe.field_M.field_x) {
                    ih.field_a = new ir(fe.field_M.field_x, 5200, 0);
                    fe.field_M.field_x = null;
                    var6 = new np(255, ih.field_a, new ir(fe.field_M.field_e, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 == -56) {
                  L2: {
                    if (ih.field_a != null) {
                      L3: {
                        if (null != ia.field_d) {
                          break L3;
                        } else {
                          ia.field_d = new ir[fe.field_M.field_n.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (null != ia.field_d[param3]) {
                          break L4;
                        } else {
                          ia.field_d[param3] = new ir(fe.field_M.field_n[param3], 12000, 0);
                          fe.field_M.field_n[param3] = null;
                          break L4;
                        }
                      }
                      var7 = new np(param3, ih.field_a, ia.field_d[param3], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = nk.field_m.a(param4, (np) (var7), param3, (byte) 0, (np) (var6));
                    if (!param5) {
                      break L5;
                    } else {
                      var8.b(117);
                      break L5;
                    }
                  }
                  stackOut_15_0 = new di(var8, param1, param0);
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_4_0 = (di) null;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        byte fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          fieldTemp$1 = (byte)(this.field_a - 1);
          this.field_a = (byte)(this.field_a - 1);
          if (-1 <= (fieldTemp$1 ^ -1)) {
            L1: {
              this.field_l[this.field_j].field_c = false;
              this.field_l[this.field_j].field_e = this.field_k[0];
              this.field_l[this.field_j].field_i = this.field_i[0];
              this.field_l[this.field_j].field_d = 0;
              this.field_l[this.field_j].field_l = (short) 0;
              this.field_m[this.field_j] = (byte) 0;
              this.field_n[this.field_j] = (short)0;
              this.field_j = (this.field_j + 1) % this.field_l.length;
              if (-1 == (this.field_j ^ -1)) {
                this.field_e = true;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_a = sl.field_Y[this.field_c];
            this.field_c = (byte)((this.field_c + 1) % sl.field_Y.length);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 0;
        L2: while (true) {
          if (var2 >= this.field_l.length) {
            L3: {
              if (param0 == -43) {
                break L3;
              } else {
                this.field_j = -58;
                break L3;
              }
            }
            return;
          } else {
            if (!this.field_l[var2].field_c) {
              L4: {
                var3 = this.field_m[var2];
                if (var3 == 0) {
                  this.field_n[var2] = (short)(this.field_n[var2] + 17);
                  break L4;
                } else {
                  if (-2 == (var3 ^ -1)) {
                    this.field_n[var2] = (short)(this.field_n[var2] + 91);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((this.field_n[var2] ^ -1) > -4097) {
                  break L5;
                } else {
                  this.field_n[var2] = (short)0;
                  this.field_m[var2] = (byte)(this.field_m[var2] + 1);
                  break L5;
                }
              }
              if (this.field_k.length + -1 > this.field_m[var2]) {
                var3 = this.field_n[var2] * this.field_n[var2] / 4096;
                var4 = -var3 + 4096;
                this.field_l[var2].a(var4 * this.field_k[this.field_m[var2]] + this.field_k[this.field_m[var2] - -1] * var3 >> -426719924, (byte) 78, var4 * this.field_i[this.field_m[var2]] + this.field_i[1 + this.field_m[var2]] * var3 >> 1762250892);
                var2++;
                continue L2;
              } else {
                this.field_l[var2].field_c = true;
                this.field_l[var2].field_b = (short)(this.field_l[var2].field_b + (ga.a(17, true, ea.field_r) - 8));
                this.field_l[var2].field_k = (short)(this.field_l[var2].field_k + (-8 + ga.a(17, true, ea.field_r)));
                var2++;
                continue L2;
              }
            } else {
              this.field_l[var2].field_l = (short)(this.field_l[var2].field_l + 1);
              this.field_l[var2].field_e = this.field_l[var2].field_e + this.field_l[var2].field_b;
              this.field_l[var2].field_i = this.field_l[var2].field_i + this.field_l[var2].field_k;
              this.field_l[var2].field_d = this.field_l[var2].field_d + this.field_l[var2].field_l;
              var2++;
              continue L2;
            }
          }
        }
    }

    ji(int[] param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        this.field_e = false;
        this.field_c = (byte) 0;
        try {
          L0: {
            this.field_k = new int[param0.length / 2];
            this.field_i = new int[param0.length / 2];
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (this.field_k.length <= var3) {
                this.field_l = new dk[256];
                this.field_m = new byte[this.field_l.length];
                this.field_n = new short[this.field_l.length];
                var5 = 0;
                var3 = var5;
                L2: while (true) {
                  if (this.field_l.length <= var5) {
                    break L0;
                  } else {
                    this.field_l[var5] = new dk(this.field_k[0], this.field_i[0]);
                    this.field_m[var5] = (byte) 0;
                    this.field_n[var5] = (short)0;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                incrementValue$4 = var2_int;
                var2_int++;
                this.field_k[var3] = param0[incrementValue$4];
                incrementValue$5 = var2_int;
                var2_int++;
                this.field_i[var3] = param0[incrementValue$5];
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("ji.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_d = 250;
        field_f = false;
        field_h = new na();
        field_b = new int[16];
    }
}
