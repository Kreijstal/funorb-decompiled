/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends pg {
    byte[] field_j;
    static int field_m;
    static String field_h;
    static String field_k;
    int field_g;
    static String field_i;
    static qb field_l;

    final static kc f(byte param0) {
        return ja.d((byte) 90);
    }

    final int f(int param0) {
        int var2 = ((wk) this).field_j[((wk) this).field_g] & 255;
        if (param0 <= var2) {
            return -32768 + ((wk) this).n(-98);
        }
        return ((wk) this).e((byte) -119);
    }

    public static void b(boolean param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (!param0) {
            field_i = null;
        }
        field_k = null;
    }

    final int a(byte param0) {
        if (param0 != -29) {
            String discarded$0 = ((wk) this).g(-102);
        }
        if (((wk) this).field_j[((wk) this).field_g] < 0) {
            return ((wk) this).d(param0 ^ 10669) & 2147483647;
        }
        return ((wk) this).n(-98);
    }

    final void a(int param0, byte param1) {
        if (param1 != -101) {
            Object var4 = null;
            ((wk) this).a(41, (int[]) null);
        }
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$3] = (byte)param0;
    }

    final void d(int param0, byte param1) {
        if (param0 >= 0) {
            if (param0 < 128) {
                ((wk) this).f(param0, (byte) -62);
                return;
            }
        }
        if (param1 >= -95) {
            ((wk) this).d(-48, (byte) -23);
        }
        if (param0 >= 0) {
            if (32768 > param0) {
                ((wk) this).c(32768 - -param0, (byte) -100);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private final void b(long param0, byte param1) {
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 37) {
                break L1;
              } else {
                int discarded$10 = ((wk) this).a(true, 13);
                break L1;
              }
            }
            var5_int = param1;
            L2: while (true) {
              if (param1 - -param3 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$11 = ((wk) this).field_g;
                ((wk) this).field_g = ((wk) this).field_g + 1;
                param2[var5_int] = ((wk) this).field_j[fieldTemp$11];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("wk.OA(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final long c(int param0) {
        if (param0 != -943038560) {
            field_i = null;
        }
        long var2 = 4294967295L & (long)((wk) this).d(-10674);
        long var4 = 4294967295L & (long)((wk) this).d(-10674);
        return (var2 << 32) - -var4;
    }

    final int i(int param0) {
        if (param0 != -1) {
            field_h = null;
        }
        int var2 = ((wk) this).field_j[((wk) this).field_g] & 255;
        if (var2 < 128) {
            return -64 + ((wk) this).e((byte) -99);
        }
        return -49152 + ((wk) this).n(-98);
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
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((wk) this).field_g;
              ((wk) this).field_g = param1;
              var6 = (param2 - param1) / 8;
              if (param3 >= 122) {
                break L1;
              } else {
                field_m = -95;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                ((wk) this).field_g = var5_int;
                break L0;
              } else {
                var8 = ((wk) this).d(-10674);
                var9 = ((wk) this).d(-10674);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((wk) this).field_g = ((wk) this).field_g - 8;
                    ((wk) this).a(var8, (byte) -101);
                    ((wk) this).a(var9, (byte) -101);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param0[-469762045 & var10 >>> 11] + var10 ^ (var8 >>> 5 ^ var8 << 4) - -var8);
                    var10 = var10 - var11;
                    var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 - -param0[var10 & 3]);
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
            stackOut_11_1 = new StringBuilder().append("wk.Q(");
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
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
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
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = ((wk) this).field_g / 8;
            ((wk) this).field_g = 0;
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                L2: {
                  if (param0 >= 75) {
                    break L2;
                  } else {
                    var11 = null;
                    ((wk) this).a((byte) -5, (String) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = ((wk) this).d(-10674);
                var6 = ((wk) this).d(-10674);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (incrementValue$1 <= 0) {
                    ((wk) this).field_g = ((wk) this).field_g - 8;
                    ((wk) this).a(var5, (byte) -101);
                    ((wk) this).a(var6, (byte) -101);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + (param1[3 & var7] + var7 ^ (var6 >>> 5 ^ var6 << 4) - -var6);
                    var7 = var7 + var8;
                    var6 = var6 + ((var5 << 4 ^ var5 >>> 5) - -var5 ^ var7 + param1[(var7 & 7037) >>> 11]);
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wk.N(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void j(int param0) {
        vn var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        ml var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1 = rk.field_O.g((byte) 34);
            var2 = 0;
            var3 = (ml) (Object) var1.b(12623);
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (3 <= var2) {
                    rk.field_O.a(0, 0, 0, 104, 6);
                    break L2;
                  } else {
                    rk.field_O.a(0, 0, -1, 38, 6);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (var3.field_jb != 11) {
                    break L3;
                  } else {
                    var2++;
                    break L3;
                  }
                }
                var3 = (ml) (Object) var1.a(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "wk.AB(" + 13805 + 41);
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 <= 34) {
            return;
        }
        int fieldTemp$5 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$7] = (byte)(int)param0;
    }

    final String g(int param0) {
        if (0 == ((wk) this).field_j[((wk) this).field_g]) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            return null;
        }
        int var2 = 76 % ((58 - param0) / 32);
        return ((wk) this).l(-1);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)(param1 >> 16);
        if (param0 != -120) {
            field_h = null;
        }
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$2] = (byte)param1;
    }

    final void b(int param0, int param1) {
        if (!((param1 & -128) == 0)) {
            if ((-16384 & param1) != -1) {
                if (!(-1 == (-2097152 & param1))) {
                    if (0 != (-268435456 & param1)) {
                        ((wk) this).f(param1 >>> 28 | 128, (byte) -12);
                    }
                    ((wk) this).f((param1 | 270515212) >>> 21, (byte) -103);
                }
                ((wk) this).f((2106311 | param1) >>> 14, (byte) -67);
            }
            ((wk) this).f((param1 | 16401) >>> 7, (byte) -43);
        }
        if (param0 != 10888) {
            return;
        }
        ((wk) this).f(param1 & 127, (byte) -44);
    }

    final void a(int param0, int param1) {
        ((wk) this).field_j[((wk) this).field_g + -param0 + -2] = (byte)(param0 >> 8);
        if (param1 != -19571) {
            ((wk) this).d(44, (byte) -106);
        }
        ((wk) this).field_j[-param0 + (((wk) this).field_g + -1)] = (byte)param0;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (var5_int >= param1 + param3) {
                L2: {
                  if (param2 == -86) {
                    break L2;
                  } else {
                    ((wk) this).a(114, (byte) 115);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((wk) this).field_g;
                ((wk) this).field_g = ((wk) this).field_g + 1;
                ((wk) this).field_j[fieldTemp$2] = param0[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("wk.WA(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int h(int param0) {
        if (param0 != 11609) {
            wk.b(true);
        }
        ((wk) this).field_g = ((wk) this).field_g + 3;
        return (((wk) this).field_j[-1 + ((wk) this).field_g] & 255) + ((((wk) this).field_j[((wk) this).field_g - 3] & 255) << 16) - -((((wk) this).field_j[-2 + ((wk) this).field_g] & 255) << 8);
    }

    final String e(int param0) {
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        int var2 = ((wk) this).field_j[fieldTemp$0];
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        if (param0 != -32461) {
            Object var5 = null;
            ((wk) this).a((String) null, 112);
        }
        int var3 = ((wk) this).field_g;
        while (true) {
            int fieldTemp$1 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            if (0 == ((wk) this).field_j[fieldTemp$1]) {
                break;
            }
        }
        int var4 = ((wk) this).field_g - (var3 - -1);
        if (!(var4 != 0)) {
            return "";
        }
        return ba.a(var3, var4, (byte) -126, ((wk) this).field_j);
    }

    final String l(int param0) {
        int var2 = ((wk) this).field_g;
        while (true) {
            int fieldTemp$0 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            if (-1 == ((wk) this).field_j[fieldTemp$0]) {
                break;
            }
        }
        int var3 = -var2 + (((wk) this).field_g + -1);
        if (!(param0 != var3)) {
            return "";
        }
        return ba.a(var2, var3, (byte) -124, ((wk) this).field_j);
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              var5 = 0L;
              var7 = param1.length();
              if (param0 == 7) {
                break L1;
              } else {
                int discarded$1 = ((wk) this).a(true, 75);
                break L1;
              }
            }
            var8 = 19;
            L2: while (true) {
              if (var8 < 0) {
                this.b(var3_long, (byte) 12);
                this.b(var5, (byte) 12);
                break L0;
              } else {
                var3_long = var3_long * 38L;
                if (var7 > var8) {
                  L3: {
                    L4: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(var9 + -63);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 > 122) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(var9 - 95);
                          break L3;
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
                          var3_long = var3_long + (long)(-48 + var9 + 28);
                          break L3;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                  L7: {
                    if (var8 != 10) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var8--;
                  continue L2;
                } else {
                  L8: {
                    if (var8 != 10) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var8--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("wk.BB(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void k(int param0) {
        da.field_d = new ln();
        g.field_e.a((byte) -92, (qm) (Object) da.field_d);
    }

    final int n(int param0) {
        if (param0 != -98) {
            return 125;
        }
        ((wk) this).field_g = ((wk) this).field_g + 2;
        return ((255 & ((wk) this).field_j[-2 + ((wk) this).field_g]) << 8) + (255 & ((wk) this).field_j[((wk) this).field_g + -1]);
    }

    final int a(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        int var2 = ((wk) this).field_j[fieldTemp$0];
        if (param0 < 10) {
            ((wk) this).field_g = -57;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << 7;
            int fieldTemp$1 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            var2 = ((wk) this).field_j[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void c(int param0, int param1) {
        ((wk) this).field_j[((wk) this).field_g - (param1 + 4)] = (byte)(param1 >> 24);
        ((wk) this).field_j[-3 + -param1 + ((wk) this).field_g] = (byte)(param1 >> 16);
        ((wk) this).field_j[-2 + ((wk) this).field_g + -param1] = (byte)(param1 >> 8);
        if (param0 != 10089) {
            field_h = null;
        }
        ((wk) this).field_j[-param1 + (((wk) this).field_g + -1)] = (byte)param1;
    }

    final void a(byte param0, long param1) {
        if (param0 > -115) {
            int discarded$0 = ((wk) this).h(-89);
        }
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 32);
        int fieldTemp$2 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 24);
        int fieldTemp$3 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 16);
        int fieldTemp$4 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$4] = (byte)(int)(param1 >> 8);
        int fieldTemp$5 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$5] = (byte)(int)param1;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            if (param1 != 23333) {
                Object var4 = null;
                ((wk) this).a((String) null, (byte) 74);
            }
            var3_int = param0.indexOf(' ');
            if (0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) (Object) param0;
            ((wk) this).field_g = ((wk) this).field_g + ji.a(0, ((wk) this).field_j, ((wk) this).field_g, (byte) 89, var5, param0.length());
            int fieldTemp$0 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        if (param1 >= -80) {
            return;
        }
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param0;
            ((wk) this).field_g = ((wk) this).field_g + ji.a(0, ((wk) this).field_j, ((wk) this).field_g, (byte) 89, var4, param0.length());
            int fieldTemp$1 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int d(int param0) {
        if (param0 != -10674) {
            int discarded$0 = ((wk) this).a((byte) -7);
        }
        ((wk) this).field_g = ((wk) this).field_g + 4;
        return ((255 & ((wk) this).field_j[-2 + ((wk) this).field_g]) << 8) + ((((wk) this).field_j[((wk) this).field_g - 4] & 255) << 24) + (((wk) this).field_j[((wk) this).field_g + -3] << 16 & 16711680) + (((wk) this).field_j[-1 + ((wk) this).field_g] & 255);
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            return -101;
        }
        int var3 = db.a(((wk) this).field_g, false, ((wk) this).field_j, param1);
        ((wk) this).a(var3, (byte) -101);
        return var3;
    }

    final int m(int param0) {
        ((wk) this).field_g = ((wk) this).field_g + 2;
        if (param0 != 0) {
            field_i = null;
        }
        int var2 = (((wk) this).field_j[-1 + ((wk) this).field_g] & 255) + (65280 & ((wk) this).field_j[-2 + ((wk) this).field_g] << 8);
        if (var2 > 32767) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            da.a((byte) -101);
            int var2 = 122 % ((param0 - -21) / 48);
            for (var1_int = 0; var1_int < 17; var1_int++) {
                tl.field_f[var1_int] = new lc(var1_int);
            }
            mn.field_r = 13;
            si.field_g = 13;
            qn.a(16, 50);
            sm.a(-107, 50);
            if (!(lc.a((byte) 112))) {
                ce.field_i = tj.a(4, -21402);
                ci.field_d = ld.a(6, false);
            }
            bk.a(2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.FB(" + param0 + 41);
        }
    }

    final void e(int param0, byte param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = -8 % ((40 - param1) / 37);
        while (((wk) this).field_g < param0) {
            int fieldTemp$0 = ((wk) this).field_g;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final int e(byte param0) {
        int var2 = 69 / ((param0 - -28) / 58);
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        return ((wk) this).field_j[fieldTemp$0] & 255;
    }

    wk(int param0) {
        ((wk) this).field_g = 0;
        ((wk) this).field_j = bb.a(param0, 56);
    }

    final void f(int param0, byte param1) {
        if (param1 >= -2) {
            ((wk) this).e(51, (byte) -125);
        }
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((wk) this).field_g;
            ((wk) this).field_g = 0;
            var5 = new byte[var4_int];
            ((wk) this).a((byte) 81, 0, var5, var4_int);
            var6 = new java.math.BigInteger(var5);
            if (param1 <= 71) {
                ((wk) this).field_g = -16;
            }
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            ((wk) this).field_g = 0;
            ((wk) this).c(var8.length, (byte) -62);
            ((wk) this).a(var8, 0, (byte) -86, var8.length);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.AA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0, byte param1) {
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[fieldTemp$1] = (byte)param0;
        if (param1 > -53) {
            wk.d((byte) 112);
        }
    }

    final byte o(int param0) {
        if (param0 != 6) {
            return (byte) 103;
        }
        int fieldTemp$0 = ((wk) this).field_g;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        return ((wk) this).field_j[fieldTemp$0];
    }

    wk(byte[] param0) {
        try {
            ((wk) this).field_j = param0;
            ((wk) this).field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, byte param1) {
        ((wk) this).field_j[-param0 + (((wk) this).field_g - 1)] = (byte)param0;
        if (param1 != 43) {
            ((wk) this).a(120, (byte) 58);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        co.field_e[je.field_b] = param2;
        ki.field_r[je.field_b] = je.field_b;
        nf.field_z[je.field_b] = param4;
        if (!(ao.field_g <= param4)) {
            ld.field_m = param4;
        }
        if (param4 > tm.field_g) {
            qa.field_m = param4;
        }
        hc.field_e[je.field_b] = param1;
        tj.field_u[je.field_b] = param5;
        ba.field_o[je.field_b] = param3;
        int var6 = param3 + param5 + param1;
        int var7 = ~var6 != param0 ? param1 * 1000 / var6 : 0;
        lm.field_i[je.field_b] = var7;
        if (ld.field_m > var7) {
            ld.field_m = var7;
        }
        je.field_b = je.field_b + 1;
        if (!(var7 <= qa.field_m)) {
            qa.field_m = var7;
        }
    }

    final boolean c(boolean param0) {
        if (!param0) {
            field_k = null;
        }
        ((wk) this).field_g = ((wk) this).field_g - 4;
        int var2 = db.a(((wk) this).field_g, !param0 ? true : false, ((wk) this).field_j, 0);
        int var3 = ((wk) this).d(-10674);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_h = "MOST USELESS - ";
        field_k = "This is a hidden Achievement. The requirements and rewards for it will be shown once it has been achieved.";
        field_i = "Name is available";
    }
}
