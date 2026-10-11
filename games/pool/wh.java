/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private fg field_d;
    static String field_i;
    private di field_h;
    static sj field_c;
    static int field_b;
    static int field_f;
    static int[] field_j;
    static di field_a;
    static int field_g;
    private di field_e;

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        if (0 == param6) {
          return -1;
        }
        var11 = lh.a(param6, (byte) -86, (long)((param4 << 16) + param1 - param3));
        var12 = lh.a(param6, (byte) -121, (long)(-(param4 << 16) + param1 - param3));
        if (param9 < 14) {
          wh.a(112, 24, -32, -89, -126, -39, -3, 91, -69, 50);
          if (var11 > 0) {
            if (65536 - param2 < var11) {
              if (var12 <= 0) {
                return -1;
              }
              if (-param2 + 65536 < var12) {
                return -1;
              }
              var10 = aj.a(var12, false, param8) + param7;
              if (param5 < param0) {
                if (param5 > var10) {
                  return -1;
                }
                if (param0 < var10) {
                  return -1;
                }
                return param2 + var12;
              }
              if (var10 < param0) {
                return -1;
              }
              if (param5 < var10) {
                return -1;
              }
              return param2 + var12;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12 > var11) {
              var10Lifetime7 = param7 + aj.a(var11, false, param8);
              if (param0 <= param5) {
                decompiledFrameRemainder0 = !(param0 > var10Lifetime7);
                if (decompiledFrameRemainder0) {
                  decompiledFrameRemainder0 = !(param5 < var10Lifetime7);
                }
              } else {
                decompiledFrameRemainder0 = !(param5 > var10Lifetime7);
                if (decompiledFrameRemainder0) {
                  decompiledFrameRemainder0 = !(var10Lifetime7 > param0);
                }
              }
              if (decompiledFrameRemainder0) {
                return param2 + var11;
              }
            }
          }
          if (var12 <= 0) {
            return -1;
          }
          if (-param2 + 65536 < var12) {
            return -1;
          }
          var10Lifetime6 = aj.a(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 > var10Lifetime6) {
              return -1;
            }
            if (param0 >= var10Lifetime6) {
              return param2 + var12;
            }
            return -1;
          }
          if (var10Lifetime6 < param0) {
            return -1;
          }
          if (param5 >= var10Lifetime6) {
            return param2 + var12;
          }
          return -1;
        }
        if (var11 <= 0) {
          if (var12 > 0 &&
            -param2 + 65536 >= var12) {
            var10Lifetime1 = aj.a(var12, false, param8) + param7;
            if (param5 < param0) {
              if (param5 <= var10Lifetime1 &&
                param0 >= var10Lifetime1) {
                return param2 + var12;
              }
            } else {
              if (var10Lifetime1 >= param0 &&
                param5 >= var10Lifetime1) {
                return param2 + var12;
              }
            }
          }
          return -1;
        }
        if (65536 - param2 < var11) {
          if (var12 > 0 &&
            -param2 + 65536 >= var12) {
            var10Lifetime2 = aj.a(var12, false, param8) + param7;
            if (param5 < param0) {
              if (param5 <= var10Lifetime2 &&
                param0 >= var10Lifetime2) {
                return param2 + var12;
              }
            } else {
              if (var10Lifetime2 >= param0 &&
                param5 >= var10Lifetime2) {
                return param2 + var12;
              }
            }
          }
          return -1;
        }
        if (var12 <= var11) {
          if (var12 <= 0) {
            return -1;
          }
          if (-param2 + 65536 < var12) {
            return -1;
          }
          var10Lifetime3 = aj.a(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 <= var10Lifetime3 &&
              param0 >= var10Lifetime3) {
              return param2 + var12;
            }
          } else {
            if (var10Lifetime3 >= param0 &&
              param5 >= var10Lifetime3) {
              return param2 + var12;
            }
          }
          return -1;
        }
        var10Lifetime4 = param7 + aj.a(var11, false, param8);
        if (param0 <= param5) {
          if (param0 <= var10Lifetime4 &&
            param5 >= var10Lifetime4) {
            return param2 + var11;
          }
        } else {
          if (param5 <= var10Lifetime4 &&
            var10Lifetime4 <= param0) {
            return param2 + var11;
          }
        }
        if (var12 > 0 &&
          -param2 + 65536 >= var12) {
          var10Lifetime5 = aj.a(var12, false, param8) + param7;
          if (param5 < param0) {
            if (param5 <= var10Lifetime5 &&
              param0 >= var10Lifetime5) {
              return param2 + var12;
            }
          } else {
            if (var10Lifetime5 >= param0 &&
              param5 >= var10Lifetime5) {
              return param2 + var12;
            }
          }
        }
        return -1;
    }

    final ap a(int param0, int param1) {
        ap var6 = null;
        byte[] var4 = null;
        ap var3 = null;
        byte[] var4Lifetime1;
        ap var3Lifetime1;
        if (param0 <= 125) {
          wh.a(54, 63, 5, -67, 84, -31, 70, -27, -99, 108);
          var3 = (ap) (this.field_d.a((long)param1, true));
          if (var3 != null) {
            return var3;
          }
          if (param1 < 32768) {
            var4 = this.field_e.a(83, param1, 1);
          } else {
            var4 = this.field_h.a(96, param1 & 32767, 1);
          }
          var6 = new ap();
          ap var5 = var6;
          if (var4 == null) {
            if (param1 < 32768) {
              this.field_d.a(90, var6, (long)param1);
              return var6;
            }
            var6.b(true);
            this.field_d.a(90, var6, (long)param1);
            return var6;
          }
          var6.a(-20678, new ge(var4));
          if (param1 >= 32768) {
            var6.b(true);
            this.field_d.a(90, var6, (long)param1);
            return var6;
          }
          this.field_d.a(90, var6, (long)param1);
          return var6;
        }
        var3Lifetime1 = (ap) (this.field_d.a((long)param1, true));
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        if (param1 < 32768) {
          var4Lifetime1 = this.field_e.a(83, param1, 1);
        } else {
          var4Lifetime1 = this.field_h.a(96, param1 & 32767, 1);
        }
        ap var7 = new ap();
        if (var4Lifetime1 != null) {
          var7.a(-20678, new ge(var4Lifetime1));
          if (param1 < 32768) {
            this.field_d.a(90, var7, (long)param1);
            return var7;
          }
          var7.b(true);
          this.field_d.a(90, var7, (long)param1);
          return var7;
        }
        if (param1 < 32768) {
          this.field_d.a(90, var7, (long)param1);
          return var7;
        }
        var7.b(true);
        this.field_d.a(90, var7, (long)param1);
        return var7;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 35 / ((-27 - param3) / 38);
        uc.a((byte) -106);
        qh.d(param0, param1, param2, param4);
    }

    public static void a(byte param0) {
        if (param0 != -62) {
          return;
        }
        field_c = null;
        field_a = null;
        field_i = null;
        field_j = null;
    }

    wh(int param0, di param1, di param2, si param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_d = new fg(64);
        try {
          this.field_e = param1;
          this.field_h = param2;
          if (this.field_e != null) {
            this.field_e.a(false, 1);
          }
          if (this.field_h != null) {
            this.field_h.a(false, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("wh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_i = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_g = 0;
    }
}
