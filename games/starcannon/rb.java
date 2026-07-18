/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rb extends rf {
    int field_g;
    static ge field_h;
    byte[] field_f;
    static int field_i;

    final void a(int param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((rb) this).g(63);
        }
        while (param0 > ((rb) this).field_g) {
            int fieldTemp$1 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[fieldTemp$1] = (byte) 0;
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (0 > var8) {
                L2: {
                  this.a(65, var3_long);
                  this.a(-127, var5);
                  if (param0 == -86) {
                    break L2;
                  } else {
                    int discarded$1 = ((rb) this).f((byte) 81);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var7 > var8) {
                    L4: {
                      var9 = param1.charAt(var8);
                      if (65 > var9) {
                        break L4;
                      } else {
                        if (90 < var9) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(-63 - -var9);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(2 - (-var9 + 97));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 > 57) {
                          break L6;
                        } else {
                          var3_long = var3_long + (long)(-48 + (var9 + 28));
                          break L3;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L7: {
                  if (10 == var8) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var8--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("rb.V(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final int d(byte param0) {
        int var2 = ((rb) this).field_f[((rb) this).field_g] & 255;
        if (param0 <= 17) {
            int discarded$0 = ((rb) this).f((byte) 10);
        }
        if (var2 < 128) {
            return -64 + ((rb) this).j(7909);
        }
        return -49152 + ((rb) this).i(-1174051992);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int var4 = -20 / ((-54 - param0) / 33);
        int fieldTemp$2 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$6] = (byte)(int)param1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        CharSequence var4 = null;
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
            L1: {
              if (param1 == 65) {
                break L1;
              } else {
                var3 = null;
                rb.a((java.applet.Applet) null, 75);
                break L1;
              }
            }
            L2: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L2;
              } else {
                var4 = (CharSequence) (Object) var2;
                if (0L != ik.a(var4, (byte) 109)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("rb.GA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0, int param1) {
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 >= -67) {
            ((rb) this).a(90, 18);
        }
        int fieldTemp$3 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$3] = (byte)param1;
    }

    final void b(int param0, int param1) {
        ((rb) this).field_f[-1 + (((rb) this).field_g - param0)] = (byte)param0;
        if (param1 != 31700) {
            field_i = 5;
        }
    }

    final int g(int param0) {
        int var2 = -39 % ((-27 - param0) / 60);
        ((rb) this).field_g = ((rb) this).field_g + 3;
        return (65280 & ((rb) this).field_f[((rb) this).field_g - 2] << 8) + ((16711680 & ((rb) this).field_f[((rb) this).field_g - 3] << 16) - -(255 & ((rb) this).field_f[-1 + ((rb) this).field_g]));
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = ((rb) this).field_g;
        ((rb) this).field_g = 0;
        byte[] var5 = new byte[var4_int];
        ((rb) this).a(var4_int, (byte) 88, var5, 0);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        ((rb) this).field_g = 0;
        ((rb) this).c(var8.length, param2 + 8093);
        if (param2 != -8399) {
            return;
        }
        try {
            ((rb) this).a(var8, var8.length, -20144, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rb.OA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -39) {
            ((rb) this).a((byte) -99, 27);
        }
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$2] = (byte)param0;
    }

    final int d(int param0) {
        int var2 = 255 & ((rb) this).field_f[((rb) this).field_g];
        if (var2 < param0) {
            return ((rb) this).j(7909);
        }
        return ((rb) this).i(-1174051992) - 32768;
    }

    final void a(byte param0, long param1) {
        if (param0 > -41) {
            return;
        }
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$4] = (byte)(int)param1;
    }

    final byte a(boolean param0) {
        if (param0) {
            field_i = -29;
        }
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        return ((rb) this).field_f[fieldTemp$0];
    }

    final void a(byte param0, int param1) {
        if (param0 != 88) {
            field_i = 116;
        }
        ((rb) this).field_f[-2 + -param1 + ((rb) this).field_g] = (byte)(param1 >> 8);
        ((rb) this).field_f[-1 + (((rb) this).field_g + -param1)] = (byte)param1;
    }

    final static boolean e() {
        return true;
    }

    final int b(byte param0, int param1) {
        if (param0 > -46) {
            return -57;
        }
        int var3 = rj.a(param1, ((rb) this).field_g, (byte) 123, ((rb) this).field_f);
        ((rb) this).c((byte) -89, var3);
        return var3;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var13 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = ((rb) this).field_g;
              ((rb) this).field_g = param3;
              if (param2 <= -30) {
                break L1;
              } else {
                byte discarded$2 = ((rb) this).a(false);
                break L1;
              }
            }
            var6 = (-param3 + param1) / 8;
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                ((rb) this).field_g = var5_int;
                break L0;
              } else {
                var8 = ((rb) this).f((byte) -128);
                var9 = ((rb) this).f((byte) -123);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$3 = var12;
                  var12--;
                  if (incrementValue$3 <= 0) {
                    ((rb) this).field_g = ((rb) this).field_g - 8;
                    ((rb) this).c((byte) -69, var8);
                    ((rb) this).c((byte) -75, var9);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param0[-310378493 & var10 >>> 11] + var10);
                    var10 = var10 - var11;
                    var8 = var8 - (var10 + param0[3 & var10] ^ var9 + (var9 >>> 5 ^ var9 << 4));
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("rb.JA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(byte param0) {
        if (((rb) this).field_f[((rb) this).field_g] == 0) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            return null;
        }
        int var2 = 118 % ((-18 - param0) / 37);
        return ((rb) this).a(-38);
    }

    final String a(int param0) {
        int var2 = ((rb) this).field_g;
        if (param0 >= -7) {
            this.a(15, 52L);
        }
        while (true) {
            int fieldTemp$0 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            if (0 == ((rb) this).field_f[fieldTemp$0]) {
                break;
            }
        }
        int var3 = -1 + (((rb) this).field_g - var2);
        if (var3 == 0) {
            return "";
        }
        return va.a(var2, 105, ((rb) this).field_f, var3);
    }

    final int i(int param0) {
        ((rb) this).field_g = ((rb) this).field_g + 2;
        if (param0 != -1174051992) {
            int discarded$0 = ((rb) this).j(82);
        }
        return (((rb) this).field_f[-2 + ((rb) this).field_g] << 8 & 65280) + (255 & ((rb) this).field_f[-1 + ((rb) this).field_g]);
    }

    final boolean f(int param0) {
        ((rb) this).field_g = ((rb) this).field_g - 4;
        int var2 = rj.a(param0, ((rb) this).field_g, (byte) 94, ((rb) this).field_f);
        int var3 = ((rb) this).f((byte) -89);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (!param0) {
            return;
        }
        int fieldTemp$5 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$7] = (byte)(int)param1;
    }

    final String h(int param0) {
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        int var2 = ((rb) this).field_f[fieldTemp$0];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        if (param0 != -12287) {
            ((rb) this).field_f = null;
        }
        int var3 = ((rb) this).field_g;
        while (true) {
            int fieldTemp$1 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            if (0 == ((rb) this).field_f[fieldTemp$1]) {
                break;
            }
        }
        int var4 = -1 + (-var3 + ((rb) this).field_g);
        if (var4 == 0) {
            return "";
        }
        return va.a(var3, param0 + 12372, ((rb) this).field_f, var4);
    }

    final void a(int param0, int param1) {
        if (param1 >= -49) {
            return;
        }
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
            var5_int = param3;
            L1: while (true) {
              if (var5_int >= param3 + param1) {
                L2: {
                  if (param2 == -20144) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((rb) this).field_g;
                ((rb) this).field_g = ((rb) this).field_g + 1;
                ((rb) this).field_f[fieldTemp$2] = param0[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("rb.PA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void g() {
        field_h = null;
    }

    final int j(int param0) {
        if (param0 != 7909) {
            ((rb) this).a((byte) 45, -105);
        }
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        return ((rb) this).field_f[fieldTemp$0] & 255;
    }

    final void b(boolean param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        if (param0) {
            return;
        }
        try {
            var3_int = param1.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param1;
            ((rb) this).field_g = ((rb) this).field_g + o.a(((rb) this).field_g, param1.length(), var4, 0, (byte) -80, ((rb) this).field_f);
            int fieldTemp$0 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
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
              var3_int = ((rb) this).field_g / 8;
              if (param0 <= -22) {
                break L1;
              } else {
                var10 = null;
                ((rb) this).a((byte[]) null, -6, -89, 118);
                break L1;
              }
            }
            ((rb) this).field_g = 0;
            var4 = 0;
            L2: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = ((rb) this).f((byte) -121);
                var6 = ((rb) this).f((byte) -107);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (incrementValue$1 <= 0) {
                    ((rb) this).field_g = ((rb) this).field_g - 8;
                    ((rb) this).c((byte) -102, var5);
                    ((rb) this).c((byte) -95, var6);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var7 - -param1[var7 & 3] ^ (var6 >>> 5 ^ var6 << 4) - -var6);
                    var7 = var7 + var8;
                    var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ param1[-1736441853 & var7 >>> 11] + var7);
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("rb.BA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) {
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
              if (param1 == 88) {
                break L1;
              } else {
                ((rb) this).field_f = null;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (var5_int >= param0 + param3) {
                break L0;
              } else {
                int fieldTemp$7 = ((rb) this).field_g;
                ((rb) this).field_g = ((rb) this).field_g + 1;
                param2[var5_int] = ((rb) this).field_f[fieldTemp$7];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("rb.EB(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, String param1) {
        CharSequence var4 = null;
        int var3_int = param1.indexOf(' ');
        if (var3_int >= 0) {
            throw new IllegalArgumentException("");
        }
        if (param0) {
            return;
        }
        try {
            int fieldTemp$0 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((rb) this).field_g = ((rb) this).field_g + o.a(((rb) this).field_g, param1.length(), var4, 0, (byte) -84, ((rb) this).field_f);
            int fieldTemp$1 = ((rb) this).field_g;
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rb.BB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -306) {
            ((rb) this).c((byte) 114, -102);
        }
        int fieldTemp$1 = ((rb) this).field_g;
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[fieldTemp$1] = (byte)param0;
    }

    rb(int param0) {
        ((rb) this).field_f = mc.a(65536, param0);
        ((rb) this).field_g = 0;
    }

    final int e(int param0) {
        int var2 = 109 % ((param0 - 12) / 47);
        if (((rb) this).field_f[((rb) this).field_g] >= 0) {
            return ((rb) this).i(-1174051992);
        }
        return 2147483647 & ((rb) this).f((byte) -109);
    }

    rb(byte[] param0) {
        try {
            ((rb) this).field_g = 0;
            ((rb) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final long c(byte param0) {
        long var2 = (long)((rb) this).f((byte) -126) & 4294967295L;
        if (param0 != 5) {
            field_i = 82;
        }
        long var4 = 4294967295L & (long)((rb) this).f((byte) -104);
        return var4 + (var2 << 32);
    }

    final int f(byte param0) {
        ((rb) this).field_g = ((rb) this).field_g + 4;
        if (param0 >= -78) {
            return -5;
        }
        return ((((rb) this).field_f[((rb) this).field_g + -2] & 255) << 8) + (((rb) this).field_f[-4 + ((rb) this).field_g] << 24 & -16777216) - (-((255 & ((rb) this).field_f[((rb) this).field_g + -3]) << 16) + -(((rb) this).field_f[-1 + ((rb) this).field_g] & 255));
    }

    final void d(int param0, int param1) {
        if (param1 < 64) {
            if (!(param1 < -64)) {
                ((rb) this).a(64 + param1, -66);
                return;
            }
        }
        if (param0 != 5918) {
            field_i = 25;
        }
        if (16384 > param1) {
            if (!(-16384 > param1)) {
                ((rb) this).c(49152 + param1, -306);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ge();
    }
}
