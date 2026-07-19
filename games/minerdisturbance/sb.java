/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sb extends pi {
    int field_o;
    static Random field_t;
    static String[][] field_s;
    static String field_q;
    static bj field_r;
    static p field_n;
    byte[] field_u;
    static int field_p;

    final void a(int param0, int param1, boolean param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (param1 + param0 <= var5_int) {
                L2: {
                  if (param2) {
                    break L2;
                  } else {
                    field_n = (p) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                fieldTemp$2 = this.field_o;
                this.field_o = this.field_o + 1;
                this.field_u[fieldTemp$2] = param3[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("sb.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final int i(int param0) {
        this.field_o = this.field_o + 3;
        if (param0 < 1) {
            return 50;
        }
        return (this.field_u[this.field_o - 3] << 30984432 & 16711680) + ((65280 & this.field_u[-2 + this.field_o] << -1087431384) + (255 & this.field_u[this.field_o - 1]));
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param1 >> 1393082976);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param1 >> 859280792);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param1 >> -1618056880);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param1 >> -1017568952);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)param1;
        if (param0 > -43) {
            field_p = 23;
        }
    }

    final void g(int param0, int param1) {
        this.field_u[param0 + (-param1 + this.field_o)] = (byte)param1;
    }

    final void f(int param0, int param1) {
        this.field_u[-4 + -param0 + this.field_o] = (byte)(param0 >> 1623063128);
        this.field_u[-param0 + (this.field_o + -3)] = (byte)(param0 >> 1316492400);
        this.field_u[-param0 + this.field_o + -2] = (byte)(param0 >> -604751096);
        this.field_u[this.field_o - (param0 + 1)] = (byte)param0;
        if (param1 > -90) {
            this.field_u = (byte[]) null;
        }
    }

    final void d(int param0, int param1) {
        if (param0 >= -3) {
            return;
        }
        if (64 > param1) {
            if ((param1 ^ -1) <= 63) {
                this.c(64 + param1, 25564);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(-16384 > param1)) {
                this.b((byte) 123, 49152 + param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void a(int[] param0, int param1) {
        int incrementValue$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 == 31747) {
                break L1;
              } else {
                this.field_o = -33;
                break L1;
              }
            }
            var3_int = this.field_o / 8;
            this.field_o = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = this.b((byte) 24);
                var6 = this.b((byte) 35);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  incrementValue$1 = var9;
                  var9--;
                  if ((incrementValue$1 ^ -1) >= -1) {
                    this.field_o = this.field_o - 8;
                    this.a((byte) 106, var5);
                    this.a((byte) 111, var6);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + ((var6 >>> -1669477179 ^ var6 << -2075345628) - -var6 ^ param0[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (param0[(var7 & 6233) >>> -997310389] + var7 ^ var5 + (var5 << -1532748668 ^ var5 >>> -1791615611));
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("sb.EA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_o;
        this.field_o = 0;
        byte[] var5 = new byte[var4_int];
        this.a(var5, (byte) -120, 0, var4_int);
        if (param0 > -31) {
            return;
        }
        try {
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param2);
            var8 = var7.toByteArray();
            this.field_o = 0;
            this.b((byte) 125, var8.length);
            this.a(0, var8.length, true, var8);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "sb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf(' ');
        if (-1 >= (var3_int ^ -1)) {
            throw new IllegalArgumentException("");
        }
        if (param0 != 8) {
            return;
        }
        try {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_o = this.field_o + r.a(var4, this.field_u, this.field_o, 0, param1.length(), 8211);
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "sb.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != -506270856) {
            discarded$0 = this.e(13);
        }
        this.field_u[this.field_o - param0 - 2] = (byte)(param0 >> 1148462568);
        this.field_u[-1 + (this.field_o + -param0)] = (byte)param0;
    }

    final int a(byte param0) {
        if (param0 >= -116) {
            byte[] var3 = (byte[]) null;
            this.a((byte[]) null, (byte) -124, -10, -111);
        }
        if (-1 >= (this.field_u[this.field_o] ^ -1)) {
            return this.e(-91);
        }
        return this.b((byte) 35) & 2147483647;
    }

    final void a(int param0, int param1, int[] param2, boolean param3) {
        int incrementValue$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = this.field_o;
            this.field_o = param0;
            var6 = (param1 + -param0) / 8;
            var7 = 0;
            if (param3) {
              L1: while (true) {
                if (var6 <= var7) {
                  this.field_o = var5_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = this.b((byte) 54);
                  var9 = this.b((byte) 17);
                  var10 = -957401312;
                  var11 = -1640531527;
                  var12 = 32;
                  L2: while (true) {
                    incrementValue$1 = var12;
                    var12--;
                    if (-1 <= (incrementValue$1 ^ -1)) {
                      this.field_o = this.field_o - 8;
                      this.a((byte) 104, var8);
                      this.a((byte) 84, var9);
                      var7++;
                      continue L1;
                    } else {
                      var9 = var9 - (var10 - -param2[var10 >>> 319567819 & -1497366525] ^ var8 + (var8 >>> 108533797 ^ var8 << 480911460));
                      var10 = var10 - var11;
                      var8 = var8 - (param2[3 & var10] + var10 ^ var9 + (var9 << 396844004 ^ var9 >>> 1380929829));
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("sb.CA(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(param0 >> 1820249104);
        if (param1 != -113) {
            return;
        }
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param0 >> 1898904104);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)param0;
    }

    final int d(byte param0) {
        if (param0 != -54) {
            sb.a(-98);
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        return this.field_u[fieldTemp$0] & 255;
    }

    final int b(byte param0) {
        if (param0 < 14) {
            field_s = (String[][]) null;
        }
        this.field_o = this.field_o + 4;
        return ((this.field_u[-3 + this.field_o] & 255) << -1449784048) + (this.field_u[-4 + this.field_o] << -1892656136 & -16777216) - -((this.field_u[-2 + this.field_o] & 255) << -734040504) + (this.field_u[this.field_o - 1] & 255);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(param1 >> -506270856);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param1 >> -1910578192);
        if (param0 <= 79) {
            return;
        }
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(param1 >> 763785672);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)param1;
    }

    final void c(int param0, int param1) {
        if (param1 != 25564) {
            field_t = (Random) null;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)param0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int fieldTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = param2;
            if (param1 == -120) {
              L1: while (true) {
                if (var5_int >= param2 + param3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$7 = this.field_o;
                  this.field_o = this.field_o + 1;
                  param0[var5_int] = this.field_u[fieldTemp$7];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("sb.FA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (!kj.a(false)) {
            if (!(null != dm.field_f)) {
                dm.field_f = fn.a(0, 6);
            }
        }
        if (param0 != 6) {
            field_n = (p) null;
        }
        if (!si.field_a) {
            if (null != dm.field_f) {
                if (!(!dm.field_f.field_q)) {
                    fn.a(dm.field_f.field_t, true);
                    si.field_a = true;
                    aa.field_j.a(35, pj.field_c);
                    ck.a(param0 + -30839);
                }
            }
        }
    }

    final int e(int param0) {
        if (param0 > -8) {
            return -93;
        }
        this.field_o = this.field_o + 2;
        return (this.field_u[this.field_o + -1] & 255) + ((255 & this.field_u[this.field_o + -2]) << -1496786008);
    }

    final String a(boolean param0) {
        int fieldTemp$0 = 0;
        if (param0) {
            this.a(32, -68L);
        }
        int var2 = this.field_o;
        while (true) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            if (0 == this.field_u[fieldTemp$0]) {
                break;
            }
        }
        int var3 = -var2 + (this.field_o + -1);
        if (var3 == 0) {
            return "";
        }
        return ph.a((byte) 34, var3, this.field_u, var2);
    }

    final int c(byte param0) {
        int var2 = 255 & this.field_u[this.field_o];
        if (param0 <= 20) {
            return 42;
        }
        if (128 <= var2) {
            return this.e(-113) + -49152;
        }
        return this.d((byte) -54) + -64;
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param1 >> 1357519160);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param1 >> -1672608080);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param1 >> 164508072);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param1 >> -1656786144);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)(param1 >> -1434315112);
        if (param0 != -1) {
            field_p = 31;
        }
        int fieldTemp$5 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$5] = (byte)(int)(param1 >> -607441520);
        int fieldTemp$6 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$6] = (byte)(int)(param1 >> -21689336);
        int fieldTemp$7 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$7] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        int discarded$0 = 0;
        if (param0 <= 120) {
            discarded$0 = this.a((byte) 11);
        }
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param1 >> 1094513736);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)param1;
    }

    public static void l(int param0) {
        field_t = null;
        field_q = null;
        field_n = null;
        int var1 = 59 % ((param0 - -1) / 44);
        field_s = (String[][]) null;
        field_r = null;
    }

    final byte m(int param0) {
        if (param0 != 4) {
            field_r = (bj) null;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        return this.field_u[fieldTemp$0];
    }

    final String g(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        int var2 = this.field_u[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_o;
        while (true) {
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            if (-1 == (this.field_u[fieldTemp$1] ^ -1)) {
                break;
            }
        }
        int var4 = -var3 + (this.field_o + -1);
        if ((var4 ^ -1) == param0) {
            return "";
        }
        return ph.a((byte) 116, var4, this.field_u, var3);
    }

    final int e(int param0, int param1) {
        int var3 = 47 % ((-1 - param0) / 62);
        int var4 = qn.a(-1648911295, param1, this.field_o, this.field_u);
        this.a((byte) 99, var4);
        return var4;
    }

    final void h(int param0, int param1) {
        if (param0 >= -15) {
            return;
        }
        if ((-128 & param1) != 0) {
            if ((-16384 & param1) != 0) {
                if (-1 != (param1 & -2097152 ^ -1)) {
                    if ((param1 & -268435456) != 0) {
                        this.c(128 | param1 >>> -1385529316, 25564);
                    }
                    this.c((269712780 | param1) >>> 2099909557, 25564);
                }
                this.c((param1 | 2106349) >>> -1276113266, 25564);
            }
            this.c(param1 >>> -346654969 | 128, 25564);
        }
        this.c(127 & param1, 25564);
    }

    private final void a(long param0, int param1) {
        int discarded$5 = 0;
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$0] = (byte)(int)(param0 >> 1748100848);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(int)(param0 >> 298578280);
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$2] = (byte)(int)(param0 >> 654644960);
        int fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$3] = (byte)(int)(param0 >> 1187949976);
        int fieldTemp$4 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$4] = (byte)(int)(param0 >> 207836944);
        if (param1 != 63) {
            discarded$5 = this.d((byte) -44);
        }
        int fieldTemp$6 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$6] = (byte)(int)(param0 >> -1490915512);
        int fieldTemp$7 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$7] = (byte)(int)param0;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4 = MinerDisturbance.field_ab;
        while (param1 > this.field_o) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -1) {
            field_s = (String[][]) null;
        }
    }

    final void b(int param0, String param1) {
        int fieldTemp$0 = 0;
        int var3_int = param1.indexOf(' ');
        if (!((var3_int ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param1);
        this.field_o = this.field_o + r.a(var4, this.field_u, this.field_o, 0, param1.length(), 8211);
        if (param0 != 23446) {
            return;
        }
        try {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "sb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long h(int param0) {
        if (param0 < 1) {
            return -20L;
        }
        long var2 = (long)this.b((byte) 56) & 4294967295L;
        long var4 = (long)this.b((byte) 83) & 4294967295L;
        return var4 + (var2 << 1196220576);
    }

    final String j(int param0) {
        int var2 = 42 / ((-9 - param0) / 48);
        if (!(this.field_u[this.field_o] != 0)) {
            this.field_o = this.field_o + 1;
            return null;
        }
        return this.a(false);
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (-1 < (var8 ^ -1)) {
                if (param0 == 97) {
                  this.a(var3_long, 63);
                  this.a(var5, 63);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var8 < var7) {
                    L3: {
                      L4: {
                        var9 = param1.charAt(var8);
                        if (65 > var9) {
                          break L4;
                        } else {
                          if (var9 <= 90) {
                            var3_long = var3_long + (long)(-65 + var9 + 2);
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 97) {
                          break L5;
                        } else {
                          if (122 < var9) {
                            break L5;
                          } else {
                            var3_long = var3_long + (long)(var9 + 2 - 97);
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (48 > var9) {
                          break L6;
                        } else {
                          if (57 >= var9) {
                            var3_long = var3_long + (long)(-48 + (28 + var9));
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3_long = var3_long + 1L;
                      break L3;
                    }
                    if (var8 == 10) {
                      break L2;
                    } else {
                      var8--;
                      continue L1;
                    }
                  } else {
                    if (var8 == 10) {
                      break L2;
                    } else {
                      var8--;
                      continue L1;
                    }
                  }
                }
                var5 = var3_long;
                var3_long = 0L;
                var8--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("sb.MA(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            field_n = (p) null;
        }
        int var2 = 255 & this.field_u[this.field_o];
        if (-129 >= (var2 ^ -1)) {
            return -32768 + this.e(-11);
        }
        return this.d((byte) -54);
    }

    final boolean f(int param0) {
        this.field_o = this.field_o - 4;
        int var2 = qn.a(param0 + -1648911295, param0, this.field_o, this.field_u);
        int var3 = this.b((byte) 108);
        if (var3 != var2) {
            return false;
        }
        return true;
    }

    final int k(int param0) {
        int fieldTemp$1 = 0;
        int var4 = MinerDisturbance.field_ab;
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        int var2 = this.field_u[fieldTemp$0];
        int var3 = 0;
        while ((var2 ^ -1) > -1) {
            var3 = (var2 & 127 | var3) << 1349213223;
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            var2 = this.field_u[fieldTemp$1];
        }
        if (param0 != 8) {
            field_n = (p) null;
        }
        return var2 | var3;
    }

    sb(int param0) {
        this.field_o = 0;
        this.field_u = lh.a((byte) 33, param0);
    }

    sb(byte[] param0) {
        try {
            this.field_u = param0;
            this.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new Random();
        field_q = "This entry doesn't match";
        field_s = new String[][]{null, new String[]{"Yuck, you're covered in oil. Swiming in the water for a few seconds will clean it off. Don't use a jetpack while covered in oil!"}};
    }
}
