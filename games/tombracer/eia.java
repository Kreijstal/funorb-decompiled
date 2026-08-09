/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eia extends nv implements ut {
    private int field_v;
    private int field_n;
    private int field_w;
    static long[] field_r;
    private int field_s;
    private kpa field_u;
    private jma field_q;
    private kpa field_t;
    static String field_o;
    private int field_p;

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        this.field_q.a(this.h((byte) 116), (byte) 111, param1);
        param1.a((byte) 42, this.field_w, 8);
        param1.a((byte) -128, this.field_v, 8);
        param1.a((byte) 70, this.field_n, 4);
        this.field_u.a(param1, (byte) -128);
        if (param0) {
            return;
        }
        try {
            this.field_t.a(param1, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eia.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -12 % ((param0 - -46) / 45);
        return this.field_w;
    }

    public static void l(int param0) {
        field_o = null;
        if (param0 <= 1) {
            field_r = (long[]) null;
        }
        field_r = null;
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            fsa var4 = (fsa) null;
            this.a(false, (fsa) null);
        }
        param0 = fs.a((byte) 87, param0, this.field_s);
        param0 = fs.a((byte) 82, param0, this.field_p);
        return this.field_q.a(89, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != -2029) {
            return;
        }
        this.field_v = param0;
        this.field_n = param1;
        this.field_w = param2;
    }

    final void g(int param0) {
        super.g(param0 ^ 0);
        this.field_q.a((byte) 48, this.h((byte) 110));
        if (param0 != -2) {
            kh var3 = (kh) null;
            this.a(false, (kh) null);
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        boolean discarded$0 = false;
        if (param2 >= -119) {
            discarded$0 = this.a(true, -31);
        }
        this.field_u.a(param1, -17075, param0);
    }

    private final boolean a(boolean param0, int param1) {
        if (!param0) {
            this.k(85);
        }
        if (!this.field_u.a(0, param1)) {
            return false;
        }
        return true;
    }

    final int a(boolean param0) {
        if (param0) {
            return -122;
        }
        return 18;
    }

    private final boolean a(byte param0, int param1) {
        if (param0 >= -109) {
            this.field_q = (jma) null;
        }
        if (!this.field_t.a(0, param1)) {
            return false;
        }
        return true;
    }

    eia(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        this.field_s = 0;
        try {
          L0: {
            L1: {
              this.field_q = new jma(15, param0, param1);
              this.field_w = param1.b((byte) 44, 8);
              this.field_v = param1.b((byte) 44, 8);
              this.field_n = param1.b((byte) 44, 4);
              if ((param0.field_E ^ -1) <= -10) {
                this.field_u = new kpa(6, param0.field_E, param1);
                this.field_t = new kpa(6, param0.field_E, param1);
                break L1;
              } else {
                var4_int = param1.b((byte) 44, 3);
                var12 = new int[var4_int];
                var10 = var12;
                var5 = var10;
                var6 = 0;
                L2: while (true) {
                  if (var4_int <= var6) {
                    var6 = param1.b((byte) 44, 3);
                    var13 = new int[var6];
                    var11 = var13;
                    var7 = var11;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        this.field_u = new kpa(6);
                        this.field_u.a(var12, 0);
                        this.field_t = new kpa(6);
                        this.field_t.a(var13, 0);
                        break L1;
                      } else {
                        var7[var8] = param1.b((byte) 44, 4);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var5[var6] = param1.b((byte) 44, 4);
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("eia.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -56 % ((62 - param4) / 52);
            stackIn_1_0 = this.a((byte) 14, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("eia.UB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final int a(int param0, ep param1, up param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 25940) {
                break L1;
              } else {
                this.field_w = 2;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) 14, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("eia.BC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(byte param0, up param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 14) {
              var3_int = param1.field_j;
              if (!this.a(true, var3_int)) {
                if (!this.a((byte) -127, var3_int)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  this.field_p = -3;
                  this.field_s = this.field_s - param1.field_b;
                  stackIn_8_0 = param1.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                this.field_p = 3;
                this.field_s = this.field_s + param1.field_b;
                stackIn_5_0 = param1.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("eia.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            this.field_u = (kpa) null;
        }
        return 1131537;
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            up var3 = (up) null;
            this.a(-122, (ep) null, (up) null);
        }
        return this.field_s;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            return (jma) null;
        }
        return this.field_q;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return -2;
        }
        return 12320699;
    }

    final void a(boolean param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_t.a(param1, -17075, param0);
        if (param2 > -32) {
            up var5 = (up) null;
            discarded$0 = this.a((byte) -27, (up) null);
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1);
            var3_int = 0;
            L1: while (true) {
              if (-7 >= (var3_int ^ -1)) {
                L2: {
                  if (4 > this.b(true).field_E) {
                    param1.h(3, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  L4: {
                    if (this.field_u.a(0, var3_int)) {
                      break L4;
                    } else {
                      if (this.field_t.a(0, var3_int)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1.a(26492, true, var3_int);
                  break L3;
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("eia.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void k(int param0) {
        if (!(!this.field_q.f((byte) -56))) {
            this.c(false);
        }
        this.field_s = this.field_s - this.field_n;
        if (-1 < (this.field_s ^ -1)) {
            this.field_s = 0;
        } else {
            if (!(this.field_v >= this.field_s)) {
                this.field_s = this.field_v;
            }
        }
        int var2 = this.field_s >= this.field_w ? 1 : 0;
        this.field_q.a((byte) -14, var2 != 0);
        if (!(0 >= this.field_p)) {
            this.field_p = this.field_p - 1;
        }
        if (-1 < (this.field_p ^ -1)) {
            this.field_p = this.field_p + 1;
        }
        if (param0 != 5418) {
            this.field_v = 52;
        }
    }

    eia(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = 0;
        try {
            this.field_q = new jma(15);
            this.field_v = 100;
            this.field_w = 50;
            this.field_u = new kpa(6);
            this.field_t = new kpa(6);
            this.field_n = 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -85) {
              stackIn_4_0 = this.a((byte) 14, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 59;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("eia.S(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_r = new long[32];
        field_o = "Unable to add name - system busy";
    }
}
