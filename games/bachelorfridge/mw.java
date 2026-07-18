/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mw extends kj {
    static String field_g;
    private int field_h;
    private int field_j;
    static String field_i;
    private int field_f;

    private final int d(int param0) {
        ((mw) this).field_h = ((mw) this).field_h + 1;
        if (param0 < 15) {
            return -105;
        }
        return (int)(30.0 * (Math.sin((double)((mw) this).field_h) * Math.sin((double)((mw) this).field_h / 10.0) * Math.cos((double)((mw) this).field_h / 23.0) * Math.sin((double)((mw) this).field_h / 3.4) + 1.0) * Math.max(Math.min(Math.pow(0.5 + Math.sin((double)((mw) this).field_j / 20.0), 6.0), 1.0), 0.0));
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param0 <= 7) {
            field_i = null;
        }
        for (var5 = param2; param3 > var5; var5++) {
            oaa.a(var5, (byte) -121, this.d(58), param1);
        }
    }

    public static void c() {
        field_i = null;
        field_g = null;
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1 ^ param1, param2);
        this.a(param0 + 32, param1 + 8192, param2 + 64, param2 + 128, 64 + param0);
        this.a(param0, 8192, param2 + 128, param2 - -64, 32 + param0);
        this.a(param0 + 32, 8192, 64 + param2, param2, param0);
        this.a(64 + param0, 8192, param2, 64 + param2, 32 + param0);
    }

    final static boolean a(String param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (null != kda.field_b) {
              L1: {
                if (param0.toLowerCase().indexOf(kda.field_b.toLowerCase()) < 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("mw.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + -1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_g = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        for (var5 = param2; var5 < param1; var5++) {
            oaa.a(param0, (byte) -113, this.d(param3 + -83), var5);
        }
        if (param3 != 128) {
            this.a(93, -70, 105, 70, 45);
        }
    }

    final boolean b(int param0) {
        nia.e((byte) 113);
        if (Math.max(Math.min(Math.pow(0.5 + Math.sin((double)((mw) this).field_j / 20.0), 6.0), 1.0), 0.0) <= 0.1) {
            ((mw) this).field_f = ((mw) this).field_f + 1;
        } else {
            ((mw) this).field_h = ((mw) this).field_f;
        }
        if (param0 < 21) {
            this.a(59, -57, -3, -24, 64);
        }
        ((mw) this).field_j = ((mw) this).field_j + 1;
        if ((double)((mw) this).field_j <= 62.83185307179586) {
            return false;
        }
        return true;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          param0 = param0 - param4;
          param3 = param3 - param2;
          if (param1 == 8192) {
            break L0;
          } else {
            this.a(-46, 96, 57, -19);
            break L0;
          }
        }
        if (param0 == 0) {
          L1: {
            if (0 <= param3) {
              this.b(117, param4, param2, 1 + param3);
              break L1;
            } else {
              this.b(85, param4, param2 - -param3, 1 + -param3);
              break L1;
            }
          }
          return;
        } else {
          if (param3 != 0) {
            L2: {
              if (0 <= param0 + param3) {
                break L2;
              } else {
                param2 = param2 + param3;
                param3 = -param3;
                param4 = param4 + param0;
                param0 = -param0;
                break L2;
              }
            }
            L3: {
              if (param3 <= param0) {
                param2 = param2 << 16;
                param2 = param2 + 32768;
                param3 = param3 << 16;
                var6 = (int)Math.floor((double)param3 / (double)param0 + 0.5);
                param0 = param0 + param4;
                L4: while (true) {
                  if (param4 > param0) {
                    break L3;
                  } else {
                    var7 = param2 >> 16;
                    oaa.a(var7, (byte) -127, this.d(param1 ^ 8296), param4);
                    param2 = param2 + var6;
                    param4++;
                    continue L4;
                  }
                }
              } else {
                param4 = param4 << 16;
                param4 = param4 + 32768;
                param0 = param0 << 16;
                var6 = (int)Math.floor(0.5 + (double)param0 / (double)param3);
                param3 = param3 + param2;
                L5: while (true) {
                  if (param3 < param2) {
                    break L3;
                  } else {
                    var7 = param4 >> 16;
                    oaa.a(param2, (byte) -115, this.d(99), var7);
                    param4 = param4 + var6;
                    param2++;
                    continue L5;
                  }
                }
              }
            }
            return;
          } else {
            L6: {
              if (param0 >= 0) {
                this.a(param2, param0 - -1, param4, 128);
                break L6;
              } else {
                this.a(param2, -param0 + 1, param0 + param4, 128);
                break L6;
              }
            }
            return;
          }
        }
    }

    mw(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((mw) this).field_h = 0;
        try {
            nia.e((byte) 17);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "mw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, String param4, String param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ur.field_e[pe.field_m] = (oha) (Object) new tv(param7, param3, param1, param4, param5, param6, param2);
            pe.field_m = pe.field_m + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("mw.L(").append(-120).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Offer rematch";
        field_i = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
