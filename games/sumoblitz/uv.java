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
            jn var2 = (jn) null;
            uv.a(-92, -128, -112, -123, (jn) null, -24);
            return -hu.field_b + dj.field_n;
        }
        return -hu.field_b + dj.field_n;
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
        float[] dupTemp$2 = null;
        int var6_int = 0;
        float[] var7 = null;
        vt var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            if (param2 == -9) {
              L1: while (true) {
                if (8 <= var6_int) {
                  var6_int = 0;
                  L2: while (true) {
                    if ((var6_int ^ -1) <= -9) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var7 = new float[]{0.0f, (float)(-(1 + fi.a(param5, he.field_o, (byte) -96)))};
                      dupTemp$2 = kt.a((byte) -92, var7, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6_int)));
                      var11 = dupTemp$2;
                      var7 = dupTemp$2;
                      var8 = new vt(24, param3, param1, param0, (int)var11[0] << 283696296, (int)var11[1] << -373036440, 1);
                      param4.a((ms) (var8), (byte) 39);
                      var6_int++;
                      continue L2;
                    }
                  }
                } else {
                  var7 = new float[]{0.0f, (float)(-(fi.a(param5, he.field_o, (byte) -96) + 1))};
                  var13 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6_int) * 0.017453292519943295));
                  var12 = var13;
                  var10 = var12;
                  var7 = var10;
                  var8 = new vt(24, param3, param1, param0, (int)var13[0] << 814838792, (int)var13[1] << 545108968, 0);
                  param4.a((ms) (var8), (byte) 39);
                  var6_int++;
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          L0: {
            L1: {
              lk.b(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, 10197915);
              if (param3) {
                if (((wp) ((Object) param0)).field_C) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param2 == 5592405) {
                break L2;
              } else {
                uv.b(124);
                break L2;
              }
            }
            L3: {
              if (param3) {
                if (param0.d(-1)) {
                  stackIn_14_0 = 1;
                  break L3;
                } else {
                  stackIn_14_0 = 0;
                  break L3;
                }
              } else {
                stackIn_14_0 = 0;
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
                stackIn_19_0 = 2394342;
                break L5;
              } else {
                stackIn_19_0 = 16777215;
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
            stackIn_26_0 = (RuntimeException) (var6);

            stackIn_26_1 = new StringBuilder().append("uv.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
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
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_42_0 = var6;
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
                                if (param2) {
                                  break L4;
                                } else {
                                  break L5;
                                }
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
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("uv.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_42_0;
    }

    static {
    }
}
