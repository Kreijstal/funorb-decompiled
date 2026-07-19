/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends ng {
    static int field_q;
    static sj field_u;
    private int field_l;
    static db field_p;
    static int[] field_k;
    static String[] field_t;
    private bm field_r;
    static long field_m;
    static String field_s;
    static String field_o;
    static String field_n;

    md(int param0) {
        super(param0);
    }

    final static boolean l(int param0) {
        if (param0 >= -59) {
            return false;
        }
        if (null == kf.field_h) {
            return false;
        }
        if (null == kf.field_h.j(0)) {
            return false;
        }
        return true;
    }

    final int d(byte param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var3 = this.field_l >> 1717204771;
        if (param0 < -47) {
          var4 = -(7 & this.field_l) + 8;
          this.field_l = this.field_l + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (param1 != var4) {
                  var5 = var5 + (this.field_h[var3] >> -param1 + var4 & kd.field_j[param1]);
                  break L1;
                } else {
                  var5 = var5 + (this.field_h[var3] & kd.field_j[var4]);
                  break L1;
                }
              }
              return var5;
            } else {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((this.field_h[incrementValue$2] & kd.field_j[var4]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          this.k(-102);
          var4 = -(7 & this.field_l) + 8;
          this.field_l = this.field_l + param1;
          var5 = 0;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (param1 != var4) {
                  var5 = var5 + (this.field_h[var3] >> -param1 + var4 & kd.field_j[param1]);
                  break L3;
                } else {
                  var5 = var5 + (this.field_h[var3] & kd.field_j[var4]);
                  break L3;
                }
              }
              return var5;
            } else {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((this.field_h[incrementValue$3] & kd.field_j[var4]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_h[fieldTemp$0] = (byte)(this.field_r.a(false) + param1);
        if (param0 != 8) {
            field_q = -127;
        }
    }

    final void a(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_r = new bm(param0);
              if (param1) {
                break L1;
              } else {
                this.d(42, 32);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("md.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static f[][] a(int param0, boolean param1, int param2, int param3, f[][] param4) {
        RuntimeException var5 = null;
        f[][] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        f[][] var9 = null;
        f[][] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        f[][] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var9 = new f[param0 * 2 + param4.length][2 * param2 + param4[0].length];
            var5_array = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length <= var6) {
                var7 = 116 % ((param3 - 8) / 32);
                stackOut_13_0 = (f[][]) (var5_array);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                var7 = 0;
                L2: while (true) {
                  if (var9[0].length <= var7) {
                    var6++;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        if (var7 < param2) {
                          break L4;
                        } else {
                          if (var7 >= param4[0].length + param2) {
                            break L4;
                          } else {
                            if (var6 < param0) {
                              break L4;
                            } else {
                              if (var6 >= param4.length + param0) {
                                break L4;
                              } else {
                                var9[var6][var7] = (f) (param4[-param0 + var6][-param2 + var7].clone());
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var9[var6][var7] = (f) (param4[0][0].clone());
                      break L3;
                    }
                    var9[var6][var7].a(393989, var6, var7, var9);
                    var9[var6][var7].b(true, param1);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("md.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final int e(boolean param0) {
        int discarded$0 = 0;
        int fieldTemp$1 = 0;
        if (!param0) {
            discarded$0 = this.e(false);
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            return 255 & this.field_h[fieldTemp$1] - this.field_r.a(!param0 ? true : false);
        }
        int fieldTemp$2 = this.field_f;
        this.field_f = this.field_f + 1;
        return 255 & this.field_h[fieldTemp$2] - this.field_r.a(!param0 ? true : false);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$5 = 0;
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param2 == 29712) {
                break L1;
              } else {
                field_t = (String[]) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= param0) {
                break L0;
              } else {
                fieldTemp$5 = this.field_f;
                this.field_f = this.field_f + 1;
                param3[var5_int + param1] = (byte)(this.field_h[fieldTemp$5] + -this.field_r.a(false));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void k(int param0) {
        dk discarded$0 = null;
        if (param0 != -2321) {
            db var3 = (db) null;
            discarded$0 = md.a(6, -104, (db) null);
            this.field_f = (this.field_l - -7) / 8;
            return;
        }
        this.field_f = (this.field_l - -7) / 8;
    }

    public static void j(int param0) {
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
        field_u = null;
        field_k = null;
        field_n = null;
        field_t = null;
        field_p = null;
    }

    md(byte[] param0) {
        super(param0);
    }

    final static dk a(int param0, int param1, db param2) {
        f[][] discarded$2 = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        dk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param2.d(-113, param0);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param1 >= 74) {
                  break L1;
                } else {
                  discarded$2 = md.a(-108, true, 93, 119, (f[][]) null);
                  break L1;
                }
              }
              stackOut_5_0 = new dk(var4);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("md.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dk) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void f(byte param0) {
        int var2 = 121 % ((param0 - -48) / 50);
        this.field_l = 8 * this.field_f;
    }

    static {
        field_u = new sj(11, 0, 1, 2);
        field_k = new int[3];
        field_t = new String[]{"Doable", "Insane", "Theoretically Possible", "Bonus Levels"};
        field_o = "Play the game without logging in just yet";
        field_n = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
