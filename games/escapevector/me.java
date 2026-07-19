/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends hg {
    static String[] field_o;
    private String[] field_i;
    private int field_q;
    static String[] field_g;
    private int field_s;
    static long field_p;
    private ih field_l;
    private int field_j;
    static String field_n;
    private int field_r;
    private int field_m;
    private String field_h;
    private int field_k;

    private final int a(byte param0, int param1) {
        int var3 = this.d(param0 + -4093);
        int var4 = param1 - -var3;
        int var5 = this.h(param0 ^ -31);
        if (param0 != 106) {
            ih var7 = (ih) null;
            this.a((ih) null, -7, (byte) 1, 49);
        }
        int var6 = var4 < var5 ? var5 : var4;
        return var6;
    }

    private final int a(byte param0) {
        int var2 = this.d((byte) 102);
        int var3 = 46;
        int var4 = this.field_l.a((char) var3);
        if (param0 != -65) {
            this.a(21, 106, -114);
        }
        int var5 = this.d(-3987);
        int var6 = var5 + var4 + 2 * var2;
        return var6;
    }

    private final int f(int param0) {
        int var2 = un.a(this.field_l, 31512);
        int var3 = 0;
        if (param0 != -1) {
            return -113;
        }
        var3 = var3 + var2;
        var3 += 2;
        return var3;
    }

    final void a(ih param0, int param1, byte param2, int param3) {
        int discarded$0 = 0;
        try {
            this.field_l = param0;
            this.field_r = param1;
            if (param2 > -25) {
                discarded$0 = this.e(-42);
            }
            this.field_m = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "me.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 0) {
            field_o = (String[]) null;
        }
        field_g = null;
        field_n = null;
        field_o = null;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = param4 == param0 ? 1 : 0;
        int var8 = var7 == 0 ? this.field_m : this.field_r;
        if (null != this.field_i[param4]) {
            this.field_l.a(this.field_i[param4], param2, param3, var8, -1);
        }
        if (param5 != -17751) {
            this.field_k = -120;
        }
        param3 = param3 + param1;
        return param3;
    }

    private final int i(int param0) {
        int var2 = gi.a((byte) -96, this.field_l);
        if (param0 != -407) {
            boolean[] var3 = (boolean[]) null;
            this.a(100, (boolean[]) null, (byte) 94);
        }
        return this.a((byte) 106, var2);
    }

    private final int g(int param0) {
        int var2 = un.a(this.field_l, 31512);
        int var3 = 0;
        var3 = var3 + param0;
        var3 = var3 + var2;
        var3 += 2;
        var3 += 2;
        return var3;
    }

    private final void a(int param0, boolean param1, boolean[] param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = this.field_k;
              var5 = this.g(2);
              var6 = this.f(-1);
              var7 = var5 + (this.field_j - -uc.a(-1, this.field_l));
              if (param1) {
                break L1;
              } else {
                discarded$2 = this.d((byte) 22);
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (var8 >= this.field_i.length) {
                break L0;
              } else {
                L3: {
                  var9 = param2[var8] ? 1 : 0;
                  if (var9 != 0) {
                    var7 = this.a(param0, var6, var4_int, var7, var8, -17751);
                    break L3;
                  } else {
                    var7 = var7 + var6;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("me.N(").append(param0).append(',').append(param1).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.j(-115);
        if (param0 != -6131) {
            this.field_r = -63;
        }
        this.b(3, param1);
    }

    final void a(int param0, boolean[] param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param2 == 48) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (this.field_s != param1.length) {
                    break L1;
                  } else {
                    this.j(-128);
                    this.a(param0, true, param1);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              this.a(-6131, param0);
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
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("me.P(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
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

    final int e(byte param0) {
        int discarded$0 = 0;
        if (!(0 != this.field_q)) {
            return this.a((byte) -65);
        }
        if (!((this.field_q ^ -1) != -2)) {
            return this.i(param0 + -280);
        }
        if (param0 != -127) {
            discarded$0 = this.g(21);
        }
        if (-3 == (this.field_q ^ -1)) {
            return this.g((byte) -124);
        }
        if (3 == this.field_q) {
            return this.e(param0 ^ -126);
        }
        return 0;
    }

    final int f(byte param0) {
        if (param0 <= 78) {
            this.field_k = 56;
        }
        int var2 = 0;
        var2 = var2 + this.g(2);
        int var3 = this.f(-1);
        var2 = var2 + this.field_s * var3;
        return var2;
    }

    private final void j(int param0) {
        if (param0 >= -22) {
            this.field_q = 104;
        }
        if (this.field_h == null) {
            return;
        }
        int var2 = this.field_k;
        int var3 = this.field_j - (-2 + -uc.a(-1, this.field_l));
        this.field_l.a(this.field_h, var2, var3, this.field_m, -1);
        int var4 = this.field_l.b(this.field_h);
        em.a(var2, var3, var4, 2, this.field_m);
    }

    private final int g(byte param0) {
        int var2 = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var2 = 0;
        var4 = -23 % ((-68 - param0) / 56);
        var3 = this.field_i;
        var5 = 0;
        L0: while (true) {
          if (var3.length <= var5) {
            return this.a((byte) 106, var2);
          } else {
            var6 = var3[var5];
            var7 = this.field_l.b(var6);
            if (var2 < var7) {
              var2 = var7;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final int d(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-10 > (var3 ^ -1)) {
            L1: {
              if (param0 > 92) {
                break L1;
              } else {
                discarded$1 = this.e(7);
                break L1;
              }
            }
            return var2;
          } else {
            var4 = Character.forDigit(var3, 10);
            var5 = this.field_l.a((char) var4);
            if (var5 > var2) {
              var2 = var5;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final int e(int param0) {
        int var2 = this.d((byte) 123);
        int var3 = this.d(param0 + -3990);
        if (param0 != 3) {
            this.field_h = (String) null;
        }
        int var4 = var3 + var2 * 2;
        int var5 = this.h(param0 + -113);
        int var6 = var5 <= var4 ? var4 : var5;
        return var6;
    }

    private final void b(int param0, int param1) {
        int discarded$0 = 0;
        int var8 = EscapeVector.field_A;
        int var3 = this.field_k;
        int var4 = this.g(2);
        int var5 = this.f(-1);
        int var6 = var4 + this.field_j + uc.a(-1, this.field_l);
        int var7 = 0;
        if (param0 != 3) {
            discarded$0 = this.a(-111, -60, -104, -15, 22, -100);
        }
        while (this.field_i.length > var7) {
            var6 = this.a(param1, var5, var3, var6, var7, -17751);
            var7++;
        }
    }

    private final int d(int param0) {
        int discarded$0 = 0;
        int var2 = 32;
        if (param0 != -3987) {
            discarded$0 = this.i(-81);
        }
        int var3 = this.field_l.a((char) var2);
        return var3 * 2;
    }

    final void a(int param0, int param1, int param2) {
        this.field_k = param0;
        if (param2 != 0) {
            return;
        }
        this.field_j = param1;
    }

    private final int h(int param0) {
        if (!(null != this.field_h)) {
            return 0;
        }
        int var2 = this.field_l.b(this.field_h);
        if (param0 > -102) {
            return 31;
        }
        int var3 = this.d(-3987);
        return var2 - -var3;
    }

    me(int param0) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        this.field_s = param0;
        this.field_q = 0;
        this.field_i = new String[this.field_s];
        String var2 = ".";
        for (var3 = 0; this.field_s > var3; var3++) {
            var4 = 1 + var3;
            var5 = Integer.toString(var4) + var2;
            this.field_i[var3] = var5;
        }
    }

    me(String param0, String[] param1, int param2) {
        try {
            this.field_q = 2;
            this.field_h = param0;
            this.field_i = param1;
            if (-2 == (param2 ^ -1)) {
                this.field_q = 1;
            }
            this.field_s = this.field_i.length;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    me(String param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            this.field_q = 3;
            this.field_h = param0;
            this.field_s = param1.length;
            this.field_i = new String[this.field_s];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= this.field_s) {
                break L0;
              } else {
                L2: {
                  var4 = param1[var3_int];
                  var5 = Integer.toString(var4);
                  if (var4 >= 0) {
                    break L2;
                  } else {
                    var5 = null;
                    break L2;
                  }
                }
                this.field_i[var3_int] = var5;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("me.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_o = new String[]{"Congratulations, commander. You have recovered Earth's most advanced technologies from the mysterious aliens.", "Unfortunately, the aliens had time to analyze and duplicate some of our stolen weapons technology.", "They are now quickly amassing an armada, ready to strike at Earth.", "Earth's defences need time to prepare for repelling the alien invasion.", "Given your location in the alien home system, you have been ordered to do all in your powers to delay the alien arms build-up, and give Earth time to prepare."};
        field_p = 0L;
        field_g = new String[]{"Excellent work, commander. You have retrieved all of our technology from the sun-baked moon orbiting the innermost planet.", "Our next destination is an icy moon orbiting the aliens' home world.<br><br>Information about this moon is sketchy, but you should expect the alien defences to be considerably stronger here."};
        field_n = "This entry doesn't match";
    }
}
