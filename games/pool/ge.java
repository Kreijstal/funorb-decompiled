/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ge extends ma {
    static String field_o;
    static String field_n;
    static jg field_q;
    static String field_m;
    static int[] field_p;
    static String field_r;
    static le field_u;
    int field_v;
    static vh field_s;
    static String field_w;
    static String field_x;
    byte[] field_t;
    static int field_l;

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int fieldTemp$8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        try {
          L0: {
            if (param1 <= -113) {
              var5_int = param0;
              L1: while (true) {
                if (var5_int >= param0 - -param3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$8 = this.field_v;
                  this.field_v = this.field_v + 1;
                  param2[var5_int] = this.field_t[fieldTemp$8];
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
            stackOut_6_1 = new StringBuilder().append("ge.V(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int f(int param0) {
        int discarded$0 = 0;
        if (param0 <= 43) {
            discarded$0 = this.l(-98);
        }
        this.field_v = this.field_v + 3;
        return (this.field_t[this.field_v + -1] & 255) + ((this.field_t[this.field_v + -3] << 1573598160 & 16711680) - -((255 & this.field_t[-2 + this.field_v]) << -2002738872));
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int fieldTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (var5_int >= param3 + param2) {
                break L0;
              } else {
                fieldTemp$7 = this.field_v;
                this.field_v = this.field_v + 1;
                this.field_t[fieldTemp$7] = param0[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("ge.PA(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0) {
        boolean discarded$0 = false;
        this.field_v = this.field_v - 4;
        if (param0) {
            discarded$0 = this.a(true);
        }
        int var2 = oa.a(0, this.field_v, -1, this.field_t);
        int var3 = this.b(true);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final int i(int param0) {
        if (param0 >= -2) {
            return 77;
        }
        int var2 = this.field_t[this.field_v] & 255;
        if (-129 < (var2 ^ -1)) {
            return -64 + this.g(-60);
        }
        return this.d(-1034) - 49152;
    }

    final String m(int param0) {
        if (this.field_t[this.field_v] == 0) {
            this.field_v = this.field_v + 1;
            return null;
        }
        if (param0 < 106) {
            this.a((byte) -12, -102);
        }
        return this.j(-112);
    }

    final int l(int param0) {
        this.field_v = this.field_v + 3;
        int var2 = (65280 & this.field_t[-2 + this.field_v] << -2118263256) + (((255 & this.field_t[-3 + this.field_v]) << 167900880) + (this.field_t[this.field_v - 1] & 255));
        if (-8388608 > (var2 ^ -1)) {
            var2 = var2 - 16777216;
        }
        if (param0 != 0) {
            return 110;
        }
        return var2;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 445149112);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> 925271152);
        if (param1 >= -75) {
            return;
        }
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 1627194088);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 366413984);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param0 >> -1866229224);
        int fieldTemp$5 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param0 >> -1589086768);
        int fieldTemp$6 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$6] = (byte)(int)(param0 >> -2010928376);
        int fieldTemp$7 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$7] = (byte)(int)param0;
    }

    private final void a(long param0, int param1) {
        int var4 = 122 % ((30 - param1) / 51);
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 1187552944);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> -1535475096);
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> -1173962080);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 2079688408);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param0 >> 1793009616);
        int fieldTemp$5 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param0 >> -1077156344);
        int fieldTemp$6 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$6] = (byte)(int)param0;
    }

    final int g(int param0) {
        int discarded$0 = 0;
        if (param0 >= -59) {
            discarded$0 = this.g(-3);
        }
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        return 255 & this.field_t[fieldTemp$1];
    }

    final int c(byte param0) {
        if (param0 != -115) {
            String var3 = (String) null;
            this.a((String) null, 68);
        }
        int var2 = this.field_t[this.field_v] & 255;
        if (-129 < (var2 ^ -1)) {
            return this.g(-82);
        }
        return this.d(-1034) + -32768;
    }

    final void a(String param0, int param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            if (param1 >= 77) {
              var7 = param0.length();
              var8 = 19;
              L1: while (true) {
                if (0 > var8) {
                  this.a(var3_long, -47);
                  this.a(var5, 109);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var3_long = var3_long * 38L;
                    if (var7 > var8) {
                      L3: {
                        L4: {
                          var9 = param0.charAt(var8);
                          if (65 > var9) {
                            break L4;
                          } else {
                            if (var9 <= 90) {
                              var3_long = var3_long + (long)(2 + (var9 + -65));
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (97 > var9) {
                            break L5;
                          } else {
                            if (var9 > 122) {
                              break L5;
                            } else {
                              var3_long = var3_long + (long)(-97 + var9 + 2);
                              break L3;
                            }
                          }
                        }
                        L6: {
                          if (48 > var9) {
                            break L6;
                          } else {
                            if (var9 <= 57) {
                              var3_long = var3_long + (long)(28 + (var9 - 48));
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ge.K(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1) {
        int incrementValue$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
            L1: {
              if (param0 == 32052) {
                break L1;
              } else {
                var10 = (String) null;
                this.a((String) null, 85);
                break L1;
              }
            }
            var3_int = this.field_v / 8;
            this.field_v = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = this.b(true);
                var6 = this.b(true);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  incrementValue$1 = var9;
                  var9--;
                  if ((incrementValue$1 ^ -1) >= -1) {
                    this.field_v = this.field_v - 8;
                    this.a(true, var5);
                    this.a(true, var6);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var7 + param1[3 & var7] ^ var6 + (var6 >>> -1810491163 ^ var6 << -1461911068));
                    var7 = var7 + var8;
                    var6 = var6 + (var7 + param1[(6753 & var7) >>> 716469259] ^ var5 + (var5 >>> -800313339 ^ var5 << -307741532));
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
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ge.KA(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param0 >> 1606445616);
        if (param1 <= 37) {
            this.field_v = 87;
        }
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(param0 >> -528716216);
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)param0;
    }

    final int k(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        int var2 = this.field_t[fieldTemp$0];
        int var4 = 22 % ((param0 - 0) / 63);
        int var3 = 0;
        while (-1 < (var2 ^ -1)) {
            var3 = (var3 | var2 & 127) << -125198233;
            fieldTemp$1 = this.field_v;
            this.field_v = this.field_v + 1;
            var2 = this.field_t[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 1786401048);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(param1 >> -375994736);
        if (!param0) {
            return;
        }
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(param1 >> -760051640);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)param1;
    }

    public static void e(int param0) {
        if (param0 != 4109) {
            field_m = (String) null;
        }
        field_o = null;
        field_m = null;
        field_s = null;
        field_r = null;
        field_n = null;
        field_u = null;
        field_x = null;
        field_p = null;
        field_q = null;
        field_w = null;
    }

    final int b(boolean param0) {
        this.field_v = this.field_v + 4;
        if (!param0) {
            return 15;
        }
        return (255 & this.field_t[this.field_v - 1]) + (65280 & this.field_t[-2 + this.field_v] << -1124121144) + (this.field_t[-4 + this.field_v] << 357384600 & -16777216) + (16711680 & this.field_t[-3 + this.field_v] << 416428176);
    }

    final void a(int param0, byte param1) {
        this.field_t[-4 + (this.field_v + -param0)] = (byte)(param0 >> 849471608);
        this.field_t[this.field_v - param0 - 3] = (byte)(param0 >> -92103664);
        if (param1 > -90) {
            int[] var4 = (int[]) null;
            this.a(125, -118, (int[]) null, -41);
        }
        this.field_t[-2 + (-param0 + this.field_v)] = (byte)(param0 >> -612497144);
        this.field_t[-param0 + this.field_v - 1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        if (param1 != -32768) {
            return;
        }
        if ((param0 & -128) != 0) {
            if (!(0 == (-16384 & param0))) {
                if ((-2097152 & param0) != 0) {
                    if (!(-1 == (param0 & -268435456 ^ -1))) {
                        this.a(param0 >>> 1794573564 | 128, false);
                    }
                    this.a(128 | param0 >>> 1725818645, false);
                }
                this.a(128 | param0 >>> 208328078, false);
            }
            this.a(param0 >>> 1508300519 | 128, false);
        }
        this.a(param0 & 127, false);
    }

    final int d(int param0, int param1) {
        int var3 = oa.a(param1, this.field_v, param0, this.field_t);
        this.a(true, var3);
        return var3;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 421411976);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)param1;
        if (param0 != -81) {
            String var4 = (String) null;
            this.a(false, (String) null);
        }
    }

    final long h(int param0) {
        long var2 = 4294967295L & (long)this.b(true);
        if (param0 != -412303328) {
            field_s = (vh) null;
        }
        long var4 = (long)this.b(true) & 4294967295L;
        return (var2 << -412303328) + var4;
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        if (param1 != -8) {
            return;
        }
        while (param0 > this.field_v) {
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            this.field_t[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_v;
            this.field_v = 0;
            var5 = new byte[var4_int];
            this.a(0, (byte) -128, var5, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            this.field_v = 0;
            if (param1 <= 39) {
                String var9 = (String) null;
                this.a(true, (String) null);
            }
            this.a((byte) -81, var8.length);
            this.a(var8, (byte) 0, 0, var8.length);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ge.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int discarded$1 = 0;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)param0;
        if (param1) {
            discarded$1 = this.c(-68);
        }
    }

    final int d(byte param0) {
        int discarded$0 = 0;
        this.field_v = this.field_v + 2;
        int var2 = (this.field_t[-1 + this.field_v] & 255) + ((this.field_t[this.field_v + -2] & 255) << 1433810280);
        if (32767 < var2) {
            var2 = var2 - 65536;
        }
        if (param0 > -76) {
            discarded$0 = this.b(true);
        }
        return var2;
    }

    final String j(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= -10) {
            return (String) null;
        }
        int var2 = this.field_v;
        while (true) {
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            if (this.field_t[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -var2 + this.field_v - 1;
        if (0 == var3) {
            return "";
        }
        return tl.a(var3, -7510, this.field_t, var2);
    }

    final static void a(float[] param0, int[] param1, int[] param2, float[] param3, int[] param4, int[] param5, int[] param6, byte param7, int[] param8) {
        float var9_float = 0.0f;
        RuntimeException var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var9_float = (float)param4[0];
            var10 = (float)param6[0];
            var11 = (float)param1[0];
            var12 = (float)param4[1] - var9_float;
            var13 = -var10 + (float)param6[1];
            var14 = (float)param1[1] - var11;
            var15 = -var9_float + (float)param4[2];
            var16 = -var10 + (float)param6[2];
            var17 = (float)param1[2] - var11;
            var18 = -var9_float + (float)param5[0];
            var19 = (float)param8[0] - var10;
            var20 = -var11 + (float)param2[0];
            var21 = (float)param5[1] - var9_float;
            var22 = -var10 + (float)param8[1];
            var23 = -var11 + (float)param2[1];
            var24 = (float)param5[2] - var9_float;
            var25 = -var10 + (float)param8[2];
            var26 = -var11 + (float)param2[2];
            if (param7 >= 23) {
              var27 = var17 * var13 - var14 * var16;
              var28 = -(var12 * var17) + var15 * var14;
              var29 = var12 * var16 - var15 * var13;
              var30 = -(var17 * var28) + var29 * var16;
              var31 = var27 * var17 - var29 * var15;
              var32 = -(var27 * var16) + var15 * var28;
              var33 = 1.0f / (var31 * var13 + var12 * var30 + var14 * var32);
              param0[1] = var33 * (var32 * var23 + (var30 * var21 + var22 * var31));
              param0[0] = (var32 * var20 + (var18 * var30 + var31 * var19)) * var33;
              param0[2] = var33 * (var32 * var26 + (var31 * var25 + var30 * var24));
              var30 = var13 * var29 - var28 * var14;
              var32 = -(var13 * var27) + var28 * var12;
              var31 = var14 * var27 - var29 * var12;
              var33 = 1.0f / (var15 * var30 + var16 * var31 + var32 * var17);
              param3[0] = var33 * (var30 * var18 + var31 * var19 + var32 * var20);
              param3[1] = var33 * (var22 * var31 + var30 * var21 + var23 * var32);
              param3[2] = (var31 * var25 + var24 * var30 + var26 * var32) * var33;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9);
            stackOut_4_1 = new StringBuilder().append("ge.AA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param7).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param8 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0) {
            if (128 > param1) {
                this.a(param1, false);
                return;
            }
        }
        if (param0 != -49) {
            field_x = (String) null;
        }
        if (0 <= param1) {
            if (!(-32769 >= (param1 ^ -1))) {
                this.a((byte) -81, param1 + 32768);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void c(int param0, byte param1) {
        this.field_t[this.field_v + (-param0 + -2)] = (byte)(param0 >> 1825337384);
        if (param1 != -92) {
            String var4 = (String) null;
            this.a((String) null, 44);
        }
        this.field_t[-1 + (this.field_v - param0)] = (byte)param0;
    }

    final String a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        int var2 = this.field_t[fieldTemp$0];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        if (param0 != 10762) {
            return (String) null;
        }
        int var3 = this.field_v;
        while (true) {
            fieldTemp$1 = this.field_v;
            this.field_v = this.field_v + 1;
            if (this.field_t[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + (-var3 + this.field_v);
        if (0 == var4) {
            return "";
        }
        return tl.a(var4, param0 + -18272, this.field_t, var3);
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param1.indexOf(' ');
            if (0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            this.field_t[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_v = this.field_v + o.a(this.field_t, var4, -24984, param1.length(), 0, this.field_v);
            if (param0) {
                this.field_t = (byte[]) null;
            }
            fieldTemp$1 = this.field_v;
            this.field_v = this.field_v + 1;
            this.field_t[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ge.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(long param0, int param1) {
        int discarded$1 = 0;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> -1897199520);
        if (param1 != 24136) {
            discarded$1 = this.i(-128);
        }
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 1246471832);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> -1370318384);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param0 >> 566256520);
        int fieldTemp$5 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$5] = (byte)(int)param0;
    }

    final int d(int param0) {
        this.field_v = this.field_v + 2;
        if (param0 != -1034) {
            field_s = (vh) null;
        }
        return (this.field_t[-2 + this.field_v] << 841803048 & 65280) + (this.field_t[this.field_v + -1] & 255);
    }

    final int c(int param0) {
        int var2 = -95 / ((9 - param0) / 59);
        if (0 > this.field_t[this.field_v]) {
            return this.b(true) & 2147483647;
        }
        return this.d(-1034);
    }

    ge(int param0) {
        this.field_t = ja.a(param0, -1);
        this.field_v = 0;
    }

    ge(byte[] param0) {
        try {
            this.field_v = 0;
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        if (param1 < 64) {
            if (!(-64 > param1)) {
                this.a(param1 + 64, false);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if ((param1 ^ -1) <= 16383) {
                this.a((byte) -81, 49152 + param1);
                return;
            }
        }
        if (param0 > -84) {
            return;
        }
        throw new IllegalArgumentException();
    }

    final static String a(byte param0, pn param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        int[] var5 = null;
        String var6 = null;
        String stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == -24) {
                break L1;
              } else {
                var5 = (int[]) null;
                ge.a((float[]) null, (int[]) null, (int[]) null, (float[]) null, (int[]) null, (int[]) null, (int[]) null, (byte) 9, (int[]) null);
                break L1;
              }
            }
            L2: {
              var2 = null;
              if (null == param1.field_j) {
                break L2;
              } else {
                L3: {
                  var6 = param1.field_j;
                  var3 = var6;
                  var3 = var6;
                  var2 = var6;
                  if (1 == param1.field_h) {
                    var2 = "<img=0>" + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-3 == (param1.field_h ^ -1)) {
                  var2 = "<img=1>" + (String) (var2);
                  var3 = (String) (var2);
                  var3 = (String) (var2);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              var3 = "";
              if (-3 == (param1.field_p ^ -1)) {
                if (!param1.field_g) {
                  L5: {
                    if (param1.field_m != 0) {
                      break L5;
                    } else {
                      if (param1.field_e == 0) {
                        var3 = nr.a(new String[]{(String) (var2)}, -1, jl.field_a);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = nr.a(new String[]{(String) (var2)}, -1, vh.field_S);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                L6: {
                  if (param1.field_p != 0) {
                    break L6;
                  } else {
                    if (!ej.field_l) {
                      break L6;
                    } else {
                      var3 = "[" + sn.field_l + "] ";
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1.field_p != 1) {
                    break L7;
                  } else {
                    var3 = "[" + nr.a(new String[]{param1.field_n}, -1, th.field_c) + "] ";
                    break L7;
                  }
                }
                L8: {
                  if (-5 != (param1.field_p ^ -1)) {
                    break L8;
                  } else {
                    if (null == kn.field_g) {
                      break L8;
                    } else {
                      var3 = "[" + kn.field_g + "] ";
                      break L8;
                    }
                  }
                }
                L9: {
                  if ((param1.field_p ^ -1) != -4) {
                    break L9;
                  } else {
                    var3 = "[#" + param1.field_n + "] ";
                    break L9;
                  }
                }
                if (param1.field_g) {
                  break L4;
                } else {
                  var3 = var3 + (String) (var2) + ": ";
                  break L4;
                }
              }
            }
            stackOut_30_0 = (String) (var3);
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = var2;
            stackOut_32_1 = new StringBuilder().append("ge.U(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            if (param0 != -9946) {
                field_q = (jg) null;
            }
            var3_int = param1.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param1);
            this.field_v = this.field_v + o.a(this.field_t, var4, param0 + -15038, param1.length(), 0, this.field_v);
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            this.field_t[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ge.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int incrementValue$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        try {
          L0: {
            var6 = -28 / ((param3 - -39) / 41);
            var5_int = this.field_v;
            this.field_v = param1;
            var7 = (param0 + -param1) / 8;
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                this.field_v = var5_int;
                break L0;
              } else {
                var9 = this.b(true);
                var10 = this.b(true);
                var11 = -957401312;
                var12 = -1640531527;
                var13 = 32;
                L2: while (true) {
                  incrementValue$1 = var13;
                  var13--;
                  if (-1 <= (incrementValue$1 ^ -1)) {
                    this.field_v = this.field_v - 8;
                    this.a(true, var9);
                    this.a(true, var10);
                    var8++;
                    continue L1;
                  } else {
                    var10 = var10 - ((var9 << -814168444 ^ var9 >>> -2134175003) + var9 ^ var11 + param2[(var11 & 8044) >>> 1819825739]);
                    var11 = var11 - var12;
                    var9 = var9 - (var11 - -param2[var11 & 3] ^ (var10 << 1406437572 ^ var10 >>> -53509723) - -var10);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ge.R(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        this.field_t[-1 + -param0 + this.field_v] = (byte)param0;
        if (!param1) {
            field_o = (String) null;
        }
    }

    final byte e(byte param0) {
        if (param0 != 105) {
            return (byte) -27;
        }
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        return this.field_t[fieldTemp$0];
    }

    static {
        field_o = "Achievements";
        field_m = "Remove friend";
        field_r = "<%0> has won!";
        field_w = "Spectate <%0>'s game";
        field_x = "All players have left <%0>'s game.";
        field_n = "Wants a rematch.";
        field_p = new int[8192];
    }
}
