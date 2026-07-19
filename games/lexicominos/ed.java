/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ed extends ca {
    static int field_v;
    int field_x;
    static th field_q;
    int field_p;
    int field_s;
    int field_u;
    int field_w;
    int field_r;
    static String[] field_t;

    public static void c(int param0) {
        field_q = null;
        field_t = null;
        if (param0 >= -31) {
            field_v = -74;
        }
    }

    final static void a(int param0, wf param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            wf var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte stackIn_5_0 = 0;
            int stackIn_9_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_4_0 = 0;
            int stackOut_8_0 = 0;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var9 = new byte[24];
                    var8 = var9;
                    var7 = var8;
                    var2 = var7;
                    if (null == kf.field_y) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          kf.field_y.a((byte) 40, 0L);
                          kf.field_y.a(var9, 0);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (24 <= var3_int) {
                                  break L6;
                                } else {
                                  stackOut_4_0 = var9[var3_int];
                                  stackIn_9_0 = stackOut_4_0;
                                  stackIn_5_0 = stackOut_4_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    if (stackIn_5_0 != 0) {
                                      break L6;
                                    } else {
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_8_0 = -25;
                              stackIn_9_0 = stackOut_8_0;
                              break L5;
                            }
                            if (stackIn_9_0 >= (var3_int ^ -1)) {
                              throw new IOException();
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L7: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L8: while (true) {
                            L9: {
                              if (-25 >= (var4 ^ -1)) {
                                break L9;
                              } else {
                                var7[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L7;
                                } else {
                                  if (var5 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L7;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L10: {
                    if (param0 > 79) {
                      break L10;
                    } else {
                      var6 = (wf) null;
                      ed.a(-106, (wf) null);
                      break L10;
                    }
                  }
                  param1.a(0, var9, 255, 24);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (runtimeException);
                stackOut_22_1 = new StringBuilder().append("ed.GB(").append(param0).append(',');
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param1 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, sh param1) {
        sd var2 = null;
        ke discarded$0 = null;
        try {
            sd.b(param1.a((byte) 127, "", "headers.packvorbis"));
            if (param0 != 0) {
                ed.c(-110);
            }
            var2 = sd.a(param1, "jagex logo2.packvorbis", "");
            discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ed.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static eb[] a(sh param0, boolean param1) {
        RuntimeException var2 = null;
        eb[] var2_array = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eb var7 = null;
        int var8 = 0;
        int var9 = 0;
        eb[] stackIn_6_0 = null;
        eb[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        eb[] stackOut_5_0 = null;
        eb[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_array = new eb[64];
              if (param1) {
                break L1;
              } else {
                field_q = (th) null;
                break L1;
              }
            }
            var3 = new wf(param0.a((byte) 127, "", "index"));
            L2: while (true) {
              L3: {
                L4: {
                  if (var3.field_j.length <= var3.field_h) {
                    break L4;
                  } else {
                    var4 = var3.d(true);
                    var5 = var3.b(-1698573656);
                    var6 = var3.d(true);
                    var7 = new eb(var4, var3.b(-1698573656));
                    stackOut_5_0 = (eb[]) (var2_array);
                    stackIn_14_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      stackIn_6_0[var7.field_g] = var7;
                      var8 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var8 >= var7.field_c.length) {
                              break L7;
                            } else {
                              var7.field_c[var8][0] = var3.c(false);
                              var7.field_c[var8][1] = var3.c(false);
                              var8++;
                              if (var9 != 0) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var7.a(new wf(param0.a(var5, -27493, var6)), (byte) 96);
                          break L6;
                        }
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_13_0 = (eb[]) (var2_array);
                stackIn_14_0 = stackOut_13_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ed.DB(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    ed() {
    }

    static {
        field_v = 0;
    }
}
