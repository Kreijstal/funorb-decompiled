/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kra {
    static lqa field_a;
    static Vector field_c;
    private int[] field_b;
    private int[] field_d;
    private byte[] field_e;

    final static void a(boolean param0) {
        if (param0) {
          return;
        }
        era.field_d = new ara(lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2350) {
          return;
        }
        field_a = null;
    }

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = 0;
          var8 = param3 << 3;
          if (param0 > -66) {
            var16 = (byte[]) null;
            this.a(103, (byte) -26, -127, (byte[]) null, 31, (byte[]) null);
          }
          param4 = param4 + param2;
          while (true) {
            if (param2 >= param4) {
              stackIn_15_0 = -param3 + (var8 + 7 >> 3);
              return stackIn_15_0;
            }
            var9 = 255 & param5[param2];
            var10 = this.field_d[var9];
            var11 = this.field_e[var9];
            if (0 == var11) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (-1 + var13 + var11 >> 3);
            var13 += 24;
            dupTemp$0 = fh.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param1[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param1[var12] = (byte)(var10 >>> var13);
              if (var14 > var12) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param1[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param1[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param1[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            var8 = var8 + var11;
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("kra.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    kra(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_e = param0;
          this.field_d = new int[var2_int];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_b = new int[8];
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (0 != var6) {
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_d[var5] = var8;
              if ((var8 & var7) == 0) {
                for (var10 = var6 - 1; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (~var8 == ~var11) {
                    var12 = 1 << -var10 + 32;
                    if ((var11 & var12) == 0) {
                      var3[var10] = fh.a(var12, var11);
                      continue;
                    }
                    var3[var10] = var3[var10 - 1];
                  }
                  break;
                }
                var9 = var8 | var7;
              } else {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = 1 + var6; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var8 == ~var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 == (var8 & var12Lifetime1)) {
                  var10Lifetime2++;
                } else {
                  if (this.field_b[var10Lifetime2] == 0) {
                    this.field_b[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_b[var10Lifetime2];
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (var10Lifetime2 >= this.field_b.length) {
                  var13 = new int[this.field_b.length * 2];
                  for (var14 = 0; var14 < this.field_b.length; var14++) {
                    var13[var14] = this.field_b[var14];
                  }
                  this.field_b = var13;
                }
              }
              if (var10Lifetime2 >= var4) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_b[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("kra.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 71) {
            this.field_b = (int[]) null;
          }
          if (param2 == 0) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var7_int = 0;
          param2 = param2 + param4;
          var8 = param0;
          L3: while (true) {
            var9 = param3[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param4;
              param4++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param2 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              incrementValue$3 = param4;
              param4++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 16)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (0 > dupTemp$10) {
              incrementValue$11 = param4;
              param4++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 2) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 <= param4) {
                return -param0 + var8 + 1;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = -param0 + var8 + 1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("kra.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
    }
}
