/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ni {
    static boolean field_c;
    private qm field_a;
    private qm field_d;
    private eja field_b;

    final void a(byte param0) {
        this.field_a.a(12574);
        if (param0 < 22) {
            this.field_d = (qm) null;
        }
    }

    final static void a(uia param0, byte param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte stackIn_5_0 = 0;
            int stackIn_11_0 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_4_0 = 0;
            int stackOut_10_0 = 0;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var5 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var8 = new byte[24];
                    var7 = var8;
                    var6 = var7;
                    var2 = var6;
                    if (null == fua.field_b) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          fua.field_b.a((byte) 2, 0L);
                          fua.field_b.a(var8, 0);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (24 <= var3_int) {
                                  break L6;
                                } else {
                                  stackOut_4_0 = var8[var3_int];
                                  stackIn_11_0 = stackOut_4_0;
                                  stackIn_5_0 = stackOut_4_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (stackIn_5_0 == 0) {
                                        break L7;
                                      } else {
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              stackOut_10_0 = -25;
                              stackIn_11_0 = stackOut_10_0;
                              break L5;
                            }
                            if (stackIn_11_0 >= (var3_int ^ -1)) {
                              throw new IOException();
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L9: while (true) {
                            L10: {
                              if ((var4 ^ -1) <= -25) {
                                break L10;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
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
                  param0.a(0, var8, 24, 68);
                  break L1;
                }
                if (param1 > 61) {
                  break L0;
                } else {
                  field_c = true;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var2_ref);
                stackOut_24_1 = new StringBuilder().append("ni.B(");
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
                  break L11;
                } else {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(eo param0) {
        mna discarded$4 = null;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$4 = param0.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b, gj.field_n}), new ne(gj.field_e)}, 0);
              this.field_a = param0.c(6, true);
              this.field_d = param0.c(6, false);
              discarded$5 = this.field_d.a(393168, 12, true);
              this.field_b = param0.a(26, false);
              this.field_b.a(18, 49146);
              var7 = this.field_b.a(true, (byte) -44);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param0.a(var7, 125);
                      if (jaclib.memory.Stream.b()) {
                        break L4;
                      } else {
                        var4_int = 0;
                        L5: while (true) {
                          L6: {
                            if (-8192 >= (var4_int ^ -1)) {
                              break L6;
                            } else {
                              var5 = var4_int * 4;
                              var8.b(var5);
                              var8.b(var5 + 1);
                              var8.b(2 + var5);
                              var8.b(2 + var5);
                              var8.b(var5 + 3);
                              var8.b(var5);
                              var4_int++;
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4_int = 0;
                    L7: while (true) {
                      if (var4_int >= 8191) {
                        break L3;
                      } else {
                        var5 = var4_int * 4;
                        var8.a(var5);
                        var8.a(1 + var5);
                        var8.a(2 + var5);
                        var8.a(var5 + 2);
                        var8.a(var5 - -3);
                        var8.a(var5);
                        var4_int++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          continue L7;
                        }
                      }
                    }
                  }
                  var8.a();
                  break L2;
                }
                discarded$6 = this.field_b.a((byte) -97);
                break L1;
              }
            }
            var9 = this.field_d.a(-15730, true);
            if (var9 != null) {
              L8: {
                L9: {
                  L10: {
                    var4 = param0.a(var9, 127);
                    if (!jaclib.memory.Stream.b()) {
                      break L10;
                    } else {
                      var5 = 0;
                      L11: while (true) {
                        L12: {
                          if ((var5 ^ -1) <= -8192) {
                            break L12;
                          } else {
                            var4.b(0.0f);
                            var4.b(-1.0f);
                            var4.b(0.0f);
                            var4.b(0.0f);
                            var4.b(-1.0f);
                            var4.b(0.0f);
                            var4.b(0.0f);
                            var4.b(-1.0f);
                            var4.b(0.0f);
                            var4.b(0.0f);
                            var4.b(-1.0f);
                            var4.b(0.0f);
                            var5++;
                            if (var6 != 0) {
                              break L8;
                            } else {
                              if (var6 == 0) {
                                continue L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (var6 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  L13: while (true) {
                    if ((var5 ^ -1) <= -8192) {
                      break L9;
                    } else {
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var5++;
                      if (var6 != 0) {
                        break L8;
                      } else {
                        if (var6 == 0) {
                          continue L13;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                var4.a();
                break L8;
              }
              discarded$7 = this.field_d.a(true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("ni.<init>(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0, eo param1) {
        boolean discarded$0 = false;
        try {
            discarded$0 = this.field_a.a(786336, 24, true);
            int var3_int = -61 / ((param0 - -55) / 41);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ni.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = true;
    }
}
