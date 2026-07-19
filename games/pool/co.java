/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co extends eq {
    private sl field_bb;
    private sl field_eb;
    private sl field_Z;
    static int field_db;
    private boolean field_cb;
    static int[] field_ab;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
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
            param8 = param8 - param5[1];
            param6 = param6 - param5[0];
            param1 = param1 - param5[1];
            param2 = param2 - param5[2];
            param7 = param7 - param5[2];
            param9 = param9 - param5[0];
            var10_int = param5[9] * param9 + param1 * param5[10] + param7 * param5[11] >> -2026476080;
            if (var10_int <= 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = param6 * param5[9] + param8 * param5[10] + param2 * param5[11] >> -519630352;
              if (var11 <= 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var12 = param5[4] * param1 + param9 * param5[3] + param7 * param5[5] >> 27126919;
                var13 = param7 * param5[8] + param1 * param5[7] + param5[6] * param9 >> 829452231;
                var14 = param5[4] * param8 + (param6 * param5[3] + param2 * param5[5]) >> -1958439289;
                var13 = fb.field_d + (qh.field_c + var13 / var10_int);
                var12 = fb.field_q + (qh.field_b - -(var12 / var10_int));
                var15 = param8 * param5[param0] + param6 * param5[6] + param2 * param5[8] >> -56908889;
                var14 = var14 / var11 + fb.field_q + qh.field_b;
                var15 = fb.field_d + qh.field_c + var15 / var11;
                qh.b(var12, var13, var14, var15, param4, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var10 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var10);
            stackOut_8_1 = new StringBuilder().append("co.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -79) {
                break L1;
              } else {
                field_db = 112;
                break L1;
              }
            }
            L2: {
              L3: {
                param0 = o.a('_', "", param0, 1);
                var3 = qa.a(param2, 0);
                if (0 != (param0.indexOf(param2) ^ -1)) {
                  break L3;
                } else {
                  if (0 == (param0.indexOf(var3) ^ -1)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("co.P(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_ab = (int[]) null;
            field_ab = null;
            return;
        }
        field_ab = null;
    }

    final int j(int param0) {
        int discarded$2 = 0;
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 25) {
            break L0;
          } else {
            discarded$2 = this.h((byte) 122);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(this.field_bb.field_m) + -1;
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final boolean g(byte param0) {
        if (null != this.field_Z.field_m) {
          if (this.field_Z.field_m.length() != 0) {
            if (null != this.field_bb.field_m) {
              if (this.field_bb.field_m.length() != 0) {
                if (null != this.field_eb.field_m) {
                  if (this.field_eb.field_m.length() != 0) {
                    if (param0 != 114) {
                      field_db = -125;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final String e(int param0) {
        String var2 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        if (param0 <= -10) {
          var2 = this.field_bb.e(-122);
          if (var2 == null) {
            if (!this.field_s) {
              return null;
            } else {
              L0: {
                if (this.field_p != null) {
                  stackOut_7_0 = this.field_p;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = this.field_m;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0;
            }
          } else {
            return var2;
          }
        } else {
          return (String) null;
        }
    }

    co(fp param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a(param4, param2, param5, false, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, param3, param4);
        var6 = -130 + param0 >> 1863653953;
        if (this.field_cb) {
          this.field_bb.a(25, var6, param2, false, 0);
          this.field_Z.a(25, 45 + var6, param2, param3, 0);
          this.field_eb.a(40, var6 + 90, param2, false, 0);
          return;
        } else {
          this.field_Z.a(25, var6, param2, false, 0);
          this.field_bb.a(25, var6 - -45, param2, false, 0);
          this.field_eb.a(40, var6 + 90, param2, false, 0);
          return;
        }
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 13) {
                break L1;
              } else {
                this.field_Z = (sl) null;
                break L1;
              }
            }
            stackOut_2_0 = Integer.parseInt(this.field_eb.field_m);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(int param0, sn param1) {
        try {
            super.a(param0, param1);
            this.field_Z.field_t = (cc) ((Object) param1);
            this.field_bb.field_t = (cc) ((Object) param1);
            this.field_eb.field_t = (cc) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "co.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private co(fp param0, boolean param1) {
        super(0, 0, 0, 0, (fp) null);
        try {
            this.field_Z = (sl) ((Object) new ga("", (cc) null, 2));
            this.field_bb = (sl) ((Object) new ga("", (cc) null, 2));
            this.field_eb = (sl) ((Object) new ga("", (cc) null, 4));
            this.field_cb = param1 ? true : false;
            this.field_eb.field_z = param0;
            this.field_bb.field_z = param0;
            this.field_Z.field_z = param0;
            if (!this.field_cb) {
                this.a(true, this.field_Z);
                this.a(true, this.field_bb);
            } else {
                this.a(true, this.field_bb);
                this.a(true, this.field_Z);
            }
            this.a(true, this.field_eb);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(byte param0) {
        NumberFormatException var2 = null;
        sn var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == -119) {
            break L0;
          } else {
            var3 = (sn) null;
            this.a(-106, (sn) null);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(this.field_Z.field_m);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -104, param2, param3);
        if (!(-1 == (param0 ^ -1))) {
            return;
        }
        param3 = param3 + this.field_D;
        param2 = param2 + this.field_C;
        int var5 = 30 % ((-42 - param1) / 53);
        this.a(param2, param3, 75, this.field_Z, dp.field_h);
        this.a(param2, param3, 114, this.field_bb, pc.field_c);
        this.a(param2, param3, 91, this.field_eb, bb.field_a);
    }

    private final void a(int param0, int param1, int param2, ei param3, String param4) {
        if (param2 <= 65) {
            return;
        }
        try {
            qk.field_a.b(param4, (param3.field_l >> -2008029759) + param0 - -param3.field_C, -5 + (param3.field_D + param1), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "co.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
