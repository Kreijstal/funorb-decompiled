/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln extends df {
    int field_C;
    int field_Q;
    sd field_R;
    static bi[][] field_O;
    int field_z;
    String field_I;
    int field_S;
    static String field_U;
    static String field_P;
    static String field_q;
    static int field_w;
    ln[] field_D;
    int field_x;
    static bi field_F;
    int field_B;
    jd[] field_r;
    int field_p;
    static int[] field_H;
    static String field_o;
    fi[] field_v;
    pf field_T;
    int field_N;
    boolean field_u;
    fs field_t;
    fs field_y;
    int field_L;
    static bi field_K;
    int field_A;
    int field_J;
    db field_s;
    int[] field_G;
    static String field_E;

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_D != null) {
          L0: {
            var2 = 0;
            var3 = this.field_D.length;
            if (param0 < -97) {
              break L0;
            } else {
              this.field_z = -57;
              break L0;
            }
          }
          L1: while (true) {
            if (var2 != 0) {
              return;
            } else {
              var3--;
              var2 = 1;
              var4 = 0;
              L2: while (true) {
                if (var3 <= var4) {
                  continue L1;
                } else {
                  if (this.field_D[var4].field_p > this.field_D[var4 - -1].field_p) {
                    var5 = this.field_D[var4];
                    this.field_D[var4] = this.field_D[1 + var4];
                    this.field_D[var4 - -1] = var5;
                    var2 = 0;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_E = null;
        field_H = null;
        field_P = null;
        if (param0 != 0) {
            ln.e(-26);
        }
        field_o = null;
        field_K = null;
        field_U = null;
        field_q = null;
        field_F = null;
        field_O = (bi[][]) null;
    }

    final void a(ln param0, byte param1) {
        ln[] var7 = null;
        ln[] var8 = null;
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(this.b(param0, (byte) 10))) {
            return;
        }
        if ((this.field_D.length ^ -1) == -2) {
            this.field_D = new ln[]{};
            param0.a((ln) (this), (byte) -124);
            return;
        }
        try {
            var7 = new ln[-1 + this.field_D.length];
            var8 = var7;
            ln[] var3 = var8;
            var4 = 0;
            for (var5 = 0; this.field_D.length > var5; var5++) {
                if (param0 != this.field_D[var5]) {
                    incrementValue$0 = var4;
                    var4++;
                    var7[incrementValue$0] = this.field_D[var5];
                }
            }
            if (param1 >= -122) {
                this.field_s = (db) null;
            }
            this.field_D = var8;
            param0.a((ln) (this), (byte) -123);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ln.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ln param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
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
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_D) {
                this.field_D = new ln[]{param1};
                break L1;
              } else {
                var6 = new ln[1 + this.field_D.length];
                var3 = var6;
                var4 = 0;
                L2: while (true) {
                  if (var4 >= this.field_D.length) {
                    var3[this.field_D.length] = param1;
                    this.field_D = var3;
                    break L1;
                  } else {
                    var6[var4] = this.field_D[var4];
                    var4++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0 <= -74) {
                break L3;
              } else {
                field_q = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ln.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(Random param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_G[0] < 0) {
              this.field_B = 6;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 == this.field_G[1]) {
                  break L1;
                } else {
                  if (this.field_G[2] == 0) {
                    break L1;
                  } else {
                    if (this.field_G[3] == 0) {
                      break L1;
                    } else {
                      if (0 == this.field_G[0]) {
                        break L1;
                      } else {
                        this.field_B = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              L2: {
                var12 = new int[6];
                var10 = var12;
                var8 = var10;
                var15 = var8;
                var4 = 0;
                if (param1 >= 61) {
                  break L2;
                } else {
                  var7 = (ln) null;
                  this.a((ln) null, (byte) 104);
                  break L2;
                }
              }
              var8[2] = 4 * this.field_G[3];
              var8[3] = 4 * this.field_G[2];
              var8[1] = 4 * this.field_G[1];
              var8[5] = this.field_G[0] * 4;
              var8[0] = (this.field_G[0] + this.field_G[3]) * 3;
              var8[4] = 2 * (this.field_G[2] + this.field_G[3] + this.field_G[1]);
              var5 = 0;
              L3: while (true) {
                if (var12.length <= var5) {
                  var4 = qf.a((byte) 126, var4, param0);
                  var9 = 0;
                  var5 = var9;
                  L4: while (true) {
                    if (var9 >= var15.length) {
                      throw new RuntimeException();
                    } else {
                      var4 = var4 - var15[var9];
                      if (var4 >= 0) {
                        var9++;
                        continue L4;
                      } else {
                        this.field_B = var9;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  var4 = var4 + var12[var5];
                  var5++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("ln.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(ln param0, byte param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_D == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7 = this.field_D;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  L2: {
                    if (param1 == 10) {
                      break L2;
                    } else {
                      this.a((ln) null, (byte) 102);
                      break L2;
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (param0 != var5) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("ln.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void f(byte param0) {
        int var2 = -118 / ((3 - param0) / 49);
        cl var1 = (cl) ((Object) ta.field_b.a(true));
        if (var1 == null) {
            throw new IllegalStateException();
        }
        gf.a(var1.field_i, var1.field_r, var1.field_k);
        gf.d(var1.field_o, var1.field_h, var1.field_j, var1.field_l);
        var1.field_i = null;
        ql.field_p.a((byte) -113, var1);
    }

    ln(int param0, int param1, int param2, int param3) {
        this.field_G = new int[4];
        this.field_z = param3;
        this.field_p = param0;
        this.field_S = param2;
        this.field_A = param1;
        this.field_T = new pf();
        this.field_s = new db();
    }

    static {
        field_U = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_P = "Battles lost in hostile space.";
        field_q = "Incoming fleet";
        field_E = "Enter name of player to delete from list";
    }
}
