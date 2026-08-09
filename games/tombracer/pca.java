/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pca {
    private int field_b;
    private int field_f;
    static String field_a;
    private int field_j;
    private int field_c;
    private uq field_e;
    private int field_g;
    private tqa field_i;
    int field_h;
    static iu[] field_k;
    private int[] field_d;

    final tqa a(int param0) {
        if (param0 != 18641) {
            return (tqa) null;
        }
        return this.field_i;
    }

    final void a(byte param0, iq param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 > 104) {
                break L1;
              } else {
                this.field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_e != null) {
                this.field_e.a(113, param1);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pca.L(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int c(byte param0) {
        if (param0 <= 48) {
            this.field_j = -59;
        }
        return this.field_j;
    }

    final int a(byte param0) {
        if (param0 != -104) {
            return 95;
        }
        return this.field_c;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 < 5) {
            field_k = (iu[]) null;
        }
        return 0 != (param2 & 16) ? true : false;
    }

    final void a(int param0, uq param1) {
        try {
            this.field_e = param1;
            param1.a(30711, (pca) (this));
            if (param0 != 3) {
                this.a(-124);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pca.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int[] param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = param1;
              var3 = var7;
              if (param0 <= -110) {
                break L1;
              } else {
                this.a((byte) 5);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = var7[var4];
                if (this.a(var5, 0)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("pca.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void c(int param0) {
        if (param0 != 8) {
            field_k = (iu[]) null;
        }
        field_a = null;
        field_k = null;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 0) {
            this.a(21);
        }
        return 0 < this.field_d[param0] ? true : false;
    }

    final boolean b(boolean param0) {
        if (param0) {
            this.a(106);
        }
        return -1 > (this.field_g ^ -1) ? true : false;
    }

    final void a(kh param0, int param1) {
        if (param1 > -75) {
            return;
        }
        try {
            param0.a((byte) 92, this.field_h, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pca.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, tqa param3) {
        try {
            this.field_i = param3;
            this.field_f = param2;
            this.field_j = param0;
            this.field_c = param3.d(-30551) * param0 + param3.d(-30551) / 2;
            this.field_b = param3.d(-30551) * param2 + param3.d(-30551) / 2;
            if (param1 <= 124) {
                this.a(-52, 68, true);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pca.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_d[param1] = this.field_d[param1] + param0;
        if (!param2) {
            field_a = (String) null;
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            pca.a(89, (byte) 98);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_e) {
              break L2;
            } else {
              if (!this.field_e.c(param0 + -2)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final la d(int param0) {
        if (param0 != 0) {
            return (la) null;
        }
        return this.field_i.b(0);
    }

    final void a(uw param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_e) {
                break L1;
              } else {
                param0.a((byte) -88, 4, this.field_e);
                break L1;
              }
            }
            L2: {
              if (param1 == 84) {
                break L2;
              } else {
                this.field_h = -37;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pca.U(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        this.field_g = this.field_g + param1;
        if (param0 <= 5) {
            this.field_i = (tqa) null;
        }
    }

    final void e(int param0) {
        if (!(null == this.field_e)) {
            this.field_e.a(true);
        }
        if (param0 != 0) {
            this.field_h = 1;
        }
    }

    final void a(pca param0, int param1) {
        try {
            this.field_h = param0.field_h;
            if (param1 != 21324) {
                this.field_j = -39;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pca.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, byte param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        woa var2 = (woa) ((Object) is.field_xb.a(0, (long)param0));
        if (param1 < 37) {
            return (byte[]) null;
        }
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; 255 > var5; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; (var5 ^ -1) > -256; var5++) {
                var6 = -var5 + 255;
                var7 = jqa.a(var6, var4, -110);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[-var5 + 511] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2 = new woa(var11);
            is.field_xb.a(var2, (byte) 52, (long)param0);
        }
        return var2.field_k;
    }

    final void a(byte param0, la param1, kh param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param0 == 29) {
              L1: {
                this.field_h = param2.b((byte) 44, 8);
                if ((param1.field_E ^ -1) > -11) {
                  break L1;
                } else {
                  if (param1.field_E <= 17) {
                    param2.b((byte) 44, 1);
                    param2.b((byte) 44, 1);
                    if (this.field_h > 5) {
                      this.field_h = 1;
                      break L1;
                    } else {
                      this.field_h = 0;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("pca.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final uq b(byte param0) {
        if (param0 >= -79) {
            this.a(true);
        }
        return this.field_e;
    }

    pca() {
        this.field_d = new int[3];
    }

    final int a(boolean param0) {
        if (!param0) {
            return -58;
        }
        return this.field_b;
    }

    final static void a(int param0, int param1, int param2) {
        lu.a(param0, (double)param2, param1 + 26108, param0, (double)param2);
        if (param1 != -26109) {
            pca.c(99);
        }
    }

    final int f(int param0) {
        int var2 = -8 / ((param0 - 44) / 50);
        return this.field_f;
    }

    static {
    }
}
