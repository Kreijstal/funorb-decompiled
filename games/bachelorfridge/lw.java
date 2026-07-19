/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lw {
    static ws field_g;
    int field_a;
    static String[] field_k;
    String field_j;
    static kv[] field_b;
    int field_e;
    private int field_d;
    String[] field_h;
    int[][] field_c;
    boolean field_i;
    static be[] field_f;

    void a(int param0) {
        int var2 = 87 / ((59 - param0) / 33);
        this.field_e = 0;
    }

    final void c(int param0) {
        int discarded$0 = 0;
        ua.field_b = true;
        if (param0 <= 69) {
            discarded$0 = lw.a(-78, 62, 3, 125, -30, -74, -51, 3, 42);
        }
    }

    final boolean c(byte param0) {
        if (param0 != 95) {
            return true;
        }
        if (this.field_i) {
            return this.field_d == this.field_e ? true : false;
        }
        return rfa.a(false, this.field_e) == this.field_d ? true : false;
    }

    abstract void a(int param0, byte param1);

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_b = null;
        field_k = null;
        if (!param0) {
            field_b = (kv[]) null;
        }
    }

    abstract void a(byte param0);

    final void b(byte param0) {
        if (param0 != 112) {
            this.field_a = 72;
        }
        ua.field_b = false;
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        if (this.field_i) {
            this.field_e = this.field_e + 1;
        } else {
            this.field_e = this.field_e | 1 << this.field_a;
        }
        aga.d(false);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_50_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_49_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_16_0 = 0;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param4 = param4 - param1;
              if (param5 == 12175) {
                break L1;
              } else {
                field_b = (kv[]) null;
                break L1;
              }
            }
            param7 = param7 - param3;
            var9_int = param6;
            if (-1 != (param7 ^ -1)) {
              if (-1 != (param4 ^ -1)) {
                L2: {
                  if (0 > param4 + param7) {
                    param1 = param1 + param4;
                    param4 = -param4;
                    param3 = param3 + param7;
                    param7 = -param7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param7 < param4) {
                    param3 = param3 << 16;
                    param7 = param7 << 16;
                    param3 = param3 + 32768;
                    var10 = (int)Math.floor(0.5 + (double)param7 / (double)param4);
                    param4 = param4 + param1;
                    L4: while (true) {
                      if (param1 > param4) {
                        break L3;
                      } else {
                        L5: {
                          var11 = param3 >> 1934868304;
                          incrementValue$6 = var9_int;
                          var9_int++;
                          if (0 == incrementValue$6 / param0 % 2) {
                            qea.a(param1, var11, param8, (byte) -102, param2);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        param3 = param3 + var10;
                        param1++;
                        continue L4;
                      }
                    }
                  } else {
                    param1 = param1 << 16;
                    param1 = param1 + 32768;
                    param4 = param4 << 16;
                    var10 = (int)Math.floor((double)param4 / (double)param7 + 0.5);
                    param7 = param7 + param3;
                    L6: while (true) {
                      if (param3 > param7) {
                        break L3;
                      } else {
                        L7: {
                          var11 = param1 >> 661913104;
                          param1 = param1 + var10;
                          incrementValue$7 = var9_int;
                          var9_int++;
                          if (0 == incrementValue$7 / param0 % 2) {
                            qea.a(var11, param3, param8, (byte) -128, param2);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        param3++;
                        continue L6;
                      }
                    }
                  }
                }
                stackOut_49_0 = var9_int;
                stackIn_50_0 = stackOut_49_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L8: {
                  if ((param7 ^ -1) > -1) {
                    var10 = param7 + param3;
                    L9: while (true) {
                      if (1 + -param7 <= var10) {
                        break L8;
                      } else {
                        L10: {
                          incrementValue$8 = var9_int;
                          var9_int++;
                          if (incrementValue$8 / param0 % 2 != 0) {
                            break L10;
                          } else {
                            qea.a(param1, var10, param8, (byte) -104, param2);
                            break L10;
                          }
                        }
                        var10++;
                        continue L9;
                      }
                    }
                  } else {
                    var10 = param3;
                    L11: while (true) {
                      if (param7 - -1 <= var10) {
                        break L8;
                      } else {
                        L12: {
                          incrementValue$9 = var9_int;
                          var9_int++;
                          if (0 == incrementValue$9 / param0 % 2) {
                            qea.a(param1, var10, param8, (byte) -97, param2);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var10++;
                        continue L11;
                      }
                    }
                  }
                }
                stackOut_31_0 = var9_int;
                stackIn_32_0 = stackOut_31_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L13: {
                if ((param4 ^ -1) <= -1) {
                  var10 = param1;
                  L14: while (true) {
                    if (param4 + 1 <= var10) {
                      break L13;
                    } else {
                      L15: {
                        incrementValue$10 = var9_int;
                        var9_int++;
                        if (incrementValue$10 / param0 % 2 != 0) {
                          break L15;
                        } else {
                          qea.a(var10, param3, param8, (byte) -107, param2);
                          break L15;
                        }
                      }
                      var10++;
                      continue L14;
                    }
                  }
                } else {
                  var10 = param1 - -param4;
                  L16: while (true) {
                    if (var10 >= -param4 - -1) {
                      break L13;
                    } else {
                      L17: {
                        incrementValue$11 = var9_int;
                        var9_int++;
                        if (incrementValue$11 / param0 % 2 == 0) {
                          qea.a(var10, param3, param8, (byte) -113, param2);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var10++;
                      continue L16;
                    }
                  }
                }
              }
              stackOut_16_0 = var9_int;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var9), "lw.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0;
          } else {
            return stackIn_50_0;
          }
        }
    }

    lw(boolean param0, String[] param1, String param2) {
        this.field_a = 1;
        try {
            this.field_h = param1;
            this.field_j = param2;
            this.field_d = this.field_h.length;
            this.field_i = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new be[10];
        field_g = new ws();
    }
}
