/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uv extends gm {
    private ne[] field_p;
    static int[] field_o;
    static long field_n;

    final static int b(int param0) {
        jn var2 = null;
        if (param0 != -25843) {
          var2 = (jn) null;
          uv.a(-92, -128, -112, -123, (jn) null, -24);
          return -hu.field_b + dj.field_n;
        } else {
          return -hu.field_b + dj.field_n;
        }
    }

    uv(ne[] param0) {
        try {
            this.field_e = kw.field_b;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, jn param4, int param5) {
        float[] dupTemp$1 = null;
        RuntimeException var6 = null;
        int var6_int = 0;
        float[] var7 = null;
        vt var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            if (param2 == -9) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (8 <= var6_int) {
                      break L3;
                    } else {
                      var7 = new float[]{0.0f, (float)(-(fi.a(param5, he.field_o, (byte) -96) + 1))};
                      var13 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6_int) * 0.017453292519943295));
                      var12 = var13;
                      var10 = var12;
                      var7 = var10;
                      var8 = new vt(24, param3, param1, param0, (int)var13[0] << 814838792, (int)var13[1] << 545108968, 0);
                      param4.a((ms) (var8), (byte) 39);
                      var6_int++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6_int = 0;
                  break L2;
                }
                L4: while (true) {
                  if ((var6_int ^ -1) <= -9) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var7 = new float[]{0.0f, (float)(-(1 + fi.a(param5, he.field_o, (byte) -96)))};
                    dupTemp$1 = kt.a((byte) -92, var7, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6_int)));
                    var11 = dupTemp$1;
                    var7 = dupTemp$1;
                    var8 = new vt(24, param3, param1, param0, (int)var11[0] << 283696296, (int)var11[1] << -373036440, 1);
                    param4.a((ms) (var8), (byte) 39);
                    var6_int++;
                    if (var9 == 0) {
                      continue L4;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              lk.b(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, 10197915);
              if (param3) {
                if (((wp) ((Object) param0)).field_C) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param2 == 5592405) {
                break L2;
              } else {
                discarded$1 = uv.b(124);
                break L2;
              }
            }
            L3: {
              if (param3) {
                if (param0.d(-1)) {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_14_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              var8 = 0;
              if (var7 == 0) {
                break L4;
              } else {
                var8 = var8 | 2;
                break L4;
              }
            }
            L5: {
              if (var6_int != 0) {
                stackOut_18_0 = 2394342;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 16777215;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            L6: {
              var9 = stackIn_19_0;
              if (var6_int != 0) {
                var8 = var8 | 1;
                break L6;
              } else {
                break L6;
              }
            }
            var10 = this.field_p[var8];
            var11 = param4 - (-param0.field_r - (param0.field_q + -var10.field_e) / 2);
            var12 = (param0.field_p + -var10.field_a) / 2 + (param0.field_v + param1);
            var13 = param0.field_q / 2 + (param4 + param0.field_r);
            var10.a(var11, var12);
            this.field_e.a(this.a(true, param0), var13, param1, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var6);
            stackOut_24_1 = new StringBuilder().append("uv.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -31) {
            field_n = -34L;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if (36 >= param0) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param3 <= -78) {
                      break L2;
                    } else {
                      field_n = 102L;
                      break L2;
                    }
                  }
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      if (var7 <= var8) {
                        stackOut_41_0 = var5;
                        stackIn_42_0 = stackOut_41_0;
                        break L4;
                      } else {
                        var9 = param1.charAt(var8);
                        stackOut_9_0 = var8;
                        stackIn_42_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_10_0 == 0) {
                                L7: {
                                  if (45 == var9) {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var9 != 43) {
                                  break L6;
                                } else {
                                  if (param2) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (57 < var9) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var9 < 65) {
                                  break L10;
                                } else {
                                  if (var9 > 90) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    break L8;
                                  }
                                }
                              }
                              L11: {
                                if (var9 < 97) {
                                  break L11;
                                } else {
                                  if (var9 <= 122) {
                                    var9 -= 87;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      var9 -= 55;
                                      break L8;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              throw new NumberFormatException();
                            }
                            if (var9 < param0) {
                              L12: {
                                if (var4_int == 0) {
                                  break L12;
                                } else {
                                  var9 = -var9;
                                  break L12;
                                }
                              }
                              var10 = var6 * param0 - -var9;
                              if (var6 != var10 / param0) {
                                throw new NumberFormatException();
                              } else {
                                var6 = var10;
                                var5 = 1;
                                break L5;
                              }
                            } else {
                              throw new NumberFormatException();
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    if (stackIn_42_0 == 0) {
                      throw new NumberFormatException();
                    } else {
                      stackOut_45_0 = var6;
                      stackIn_46_0 = stackOut_45_0;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("uv.D(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_46_0;
    }

    static {
    }
}
