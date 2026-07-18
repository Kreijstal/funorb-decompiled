/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uv extends gm {
    private ne[] field_p;
    static int[] field_o;
    static long field_n;

    final static int b(int param0) {
        if (param0 != -25843) {
            Object var2 = null;
            uv.a(-92, -128, -112, -123, (jn) null, -24);
            return -hu.field_b + dj.field_n;
        }
        return -hu.field_b + dj.field_n;
    }

    uv(ne[] param0) {
        try {
            ((uv) this).field_e = kw.field_b;
            ((uv) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "uv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, jn param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        float[] var7 = null;
        vt var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
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
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            if (param2 == -9) {
              L1: while (true) {
                if (8 <= var6_int) {
                  var6_int = 0;
                  L2: while (true) {
                    if (var6_int >= 8) {
                      break L0;
                    } else {
                      int discarded$3 = -96;
                      var7 = new float[]{0.0f, (float)(-(1 + fi.a(param5, he.field_o)))};
                      float[] dupTemp$4 = kt.a((byte) -92, var7, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6_int)));
                      var11 = dupTemp$4;
                      var7 = dupTemp$4;
                      var8 = new vt(24, param3, param1, param0, (int)var11[0] << 8, (int)var11[1] << 8, 1);
                      param4.a((ms) (Object) var8, (byte) 39);
                      var6_int++;
                      continue L2;
                    }
                  }
                } else {
                  int discarded$5 = -96;
                  var7 = new float[]{0.0f, (float)(-(fi.a(param5, he.field_o) + 1))};
                  var15 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6_int) * 0.017453292519943295));
                  var14 = var15;
                  var13 = var14;
                  var12 = var13;
                  var10 = var12;
                  var7 = var10;
                  var8 = new vt(24, param3, param1, param0, (int)var15[0] << 8, (int)var15[1] << 8, 0);
                  param4.a((ms) (Object) var8, (byte) 39);
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
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
                if (((wp) (Object) param0).field_C) {
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
                int discarded$1 = uv.b(124);
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
            var10 = ((uv) this).field_p[var8];
            var11 = param4 - (-param0.field_r - (param0.field_q + -var10.field_e) / 2);
            var12 = (param0.field_p + -var10.field_a) / 2 + (param0.field_v + param1);
            var13 = param0.field_q / 2 + (param4 + param0.field_r);
            var10.a(var11, var12);
            ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("uv.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
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
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
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
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_39_0 = var6;
                        stackIn_40_0 = stackOut_39_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 == 0) {
                            if (45 == var9) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 < var9) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param0) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var6 * param0 - -var9;
                          if (var6 != var10 / param0) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
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
          L11: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("uv.D(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + true + ',' + param3 + ')');
        }
        return stackIn_40_0;
    }

    static {
    }
}
