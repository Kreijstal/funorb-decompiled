/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mi extends el {
    private eh field_S;
    private qj field_P;
    private int field_Q;
    private String field_R;

    final static int a(int param0, int param1) {
        if (param0 != 2048) {
            return -107;
        }
        param1 = param1 & 8191;
        if (4096 > param1) {
            return param1 >= 2048 ? -ta.field_b[param1 - 2048] : ta.field_b[2048 + -param1];
        }
        return param1 >= 6144 ? ta.field_b[-6144 + param1] : -ta.field_b[6144 - param1];
    }

    final static void k(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (rj.field_d != null) {
                    rj.field_d.c((byte) 101);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (rb.field_a != null) {
                    rb.field_a.a(83);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null != sd.field_c) {
                    {
                      L4: {
                        sd.field_c.d(0);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (kh.field_e == null) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= kh.field_e.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null != kh.field_e[var1_int]) {
                            {
                              L9: {
                                kh.field_e[var1_int].d(0);
                                break L9;
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
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw sl.a((Throwable) (Object) var1, "mi.I(" + 10228 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        ud var6 = null;
        dl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qj var14 = null;
        qj var15 = null;
        qj var16 = null;
        var13 = TrackController.field_F ? 1 : 0;
        if (param3 == 29221) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6 = ((mi) this).field_S.a((byte) -61);
                  if (lh.field_x == var6) {
                    break L3;
                  } else {
                    if (var6 == tk.field_t) {
                      break L3;
                    } else {
                      var5 = ((mi) this).field_S.c(param3 ^ 19471);
                      if (var5 == null) {
                        var5 = ((mi) this).field_R;
                        break L2;
                      } else {
                        if (!var5.equals((Object) (Object) ((mi) this).field_s)) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
                var5 = bf.field_d;
                break L2;
              }
              if (!var5.equals((Object) (Object) ((mi) this).field_s)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((mi) this).field_s = var5;
            ((mi) this).b(true);
            break L0;
          }
          L4: {
            L5: {
              super.a(param0, param1, param2, param3);
              var6 = ((mi) this).field_S.a((byte) -5);
              var8 = (dl) (Object) ((mi) this).field_y;
              var9 = param1 + ((mi) this).field_p;
              var10 = var8.a((al) this, param3 ^ -29188, param2) - -(var8.a((byte) 124, (al) this).a(12323) >> 1);
              if (var6 == lh.field_x) {
                break L5;
              } else {
                if (var6 != tk.field_t) {
                  if (ef.field_b == var6) {
                    var16 = TrackController.field_D[2];
                    var16.a(var9, var10 - (var16.field_q >> 1), 256);
                    break L4;
                  } else {
                    if (TrackController.field_G == var6) {
                      var15 = TrackController.field_D[1];
                      var15.a(var9, -(var15.field_q >> 1) + var10, 256);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L6: {
              L7: {
                var14 = TrackController.field_D[0];
                var11 = var14.field_s << 1;
                var12 = var14.field_v << 1;
                if (null == ((mi) this).field_P) {
                  break L7;
                } else {
                  if (var11 > ((mi) this).field_P.field_t) {
                    break L7;
                  } else {
                    if (var12 <= ((mi) this).field_P.field_q) {
                      mb.a((byte) 126, ((mi) this).field_P);
                      ll.a();
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              ((mi) this).field_P = new qj(var11, var12);
              mb.a((byte) -110, ((mi) this).field_P);
              break L6;
            }
            var14.a(112, 144, var14.field_s << 4, var14.field_v << 4, -((mi) this).field_Q << 10, 4096);
            ch.m(57);
            ((mi) this).field_P.a(-(var14.field_s >> 1) + var9, var10 + -var14.field_v, 256);
            break L4;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        try {
            ((mi) this).field_Q = ((mi) this).field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mi.EA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -104) {
                break L1;
              } else {
                var4 = null;
                ((mi) this).a(66, -39, (byte) 109, (al) null);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mi.QA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final String e(int param0) {
        if (param0 == 0) {
            return null;
        }
        ((mi) this).field_R = null;
        return null;
    }

    mi(eh param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (t) (Object) jc.a((byte) 97));
        try {
            ((mi) this).field_S = param0;
            ((mi) this).field_R = param1;
            ((mi) this).a(param5, -3050, param3, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
