/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba {
    int field_n;
    byte[] field_l;
    static long field_a;
    byte[] field_h;
    static String field_c;
    int field_g;
    int field_e;
    int field_i;
    static int[] field_k;
    int field_m;
    int field_d;
    static String field_f;
    static int[] field_o;
    static String field_b;
    int field_j;

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 <= 75) {
            return;
        }
        field_c = null;
        field_o = null;
        field_b = null;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = gk.a(param1, -13);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L3: {
                            if (rk.a((byte) 117, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!rk.a((byte) 118, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                if (param2) {
                                  L4: while (true) {
                                    if (var6 >= param1.length()) {
                                      if ((var5 ^ -1) < -1) {
                                        stackIn_34_0 = ua.field_H;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (rk.a((byte) 123, (char) var7)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (param0) {
                                            break L6;
                                          } else {
                                            stackIn_29_0 = ff.field_e;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackIn_21_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackIn_18_0 = ua.field_H;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = lm.field_c;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_8_0 = lm.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = lm.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("ba.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L7;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0;
                  } else {
                    return stackIn_34_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 < 80) {
            ba.a((byte) 114);
        }
        g.field_e.a((byte) -92, (qm) (new td()));
    }

    final static void c(int param0) {
        if (param0 != 0) {
            ba.a(-120);
        }
        p.field_b.f(-120);
        if (null == ci.field_c) {
            ci.field_c = new gd(p.field_b, fg.field_o);
        }
        p.field_b.b(ci.field_c, param0 + 15637);
    }

    final static void b(int param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            RuntimeException runtimeException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (jl.field_c == null) {
                    break L1;
                  } else {
                    jl.field_c.c(param0 ^ 16700264);
                    break L1;
                  }
                }
                L2: {
                  if (null == ed.field_yb) {
                    break L2;
                  } else {
                    ed.field_yb.a((byte) 90);
                    break L2;
                  }
                }
                L3: {
                  if (null != bm.field_e) {
                    try {
                      L4: {
                        bm.field_e.c((byte) -101);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null == bb.field_b) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= bb.field_b.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null != bb.field_b[var1_int]) {
                            try {
                              L9: {
                                bb.field_b[var1_int].c((byte) -101);
                                break L9;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L10: {
                                var2_ref = (IOException) (Object) decompiledCaughtException;
                                break L10;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                L11: {
                  if (param0 == 11670) {
                    break L11;
                  } else {
                    field_f = (String) null;
                    break L11;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw aa.a((Throwable) ((Object) runtimeException), "ba.B(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        int var1 = -96 / ((param0 - -52) / 63);
        if (null != p.field_b) {
            p.field_b.h((byte) 83);
        }
        if (ci.field_c != null) {
            ci.field_c.k((byte) 61);
        }
        hb.f((byte) -102);
    }

    final static String a(int param0, int param1, byte param2, byte[] param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var12 = new char[param1];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            if (param2 < -122) {
              L1: while (true) {
                if (var6 >= param1) {
                  stackIn_14_0 = new String(var12, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = param3[param0 + var6] & 255;
                  if (var7 != 0) {
                    L2: {
                      if (-129 < (var7 ^ -1)) {
                        break L2;
                      } else {
                        if (-161 >= (var7 ^ -1)) {
                          break L2;
                        } else {
                          L3: {
                            var8 = oc.field_a[-128 + var7];
                            if (0 != var8) {
                              break L3;
                            } else {
                              var8 = 63;
                              break L3;
                            }
                          }
                          var7 = var8;
                          break L2;
                        }
                      }
                    }
                    incrementValue$0 = var5;
                    var5++;
                    var10[incrementValue$0] = (char)var7;
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("ba.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
        field_c = "Players";
        field_f = "Please wait...";
        field_k = new int[8192];
        field_b = "Reading Book of Flame";
    }
}
