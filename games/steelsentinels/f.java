/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class f extends vk {
    static String field_x;
    static int[] field_w;
    static gh field_y;
    private sg field_F;
    static String field_u;
    static int[] field_B;
    static rf field_D;
    static String field_E;
    static java.util.zip.CRC32 field_G;
    static nk field_A;
    static int field_v;
    static String field_z;

    final void b(int param0) {
        if (param0 < 61) {
            Object var3 = null;
            ((f) this).a((Object) null, true, 56);
        }
        if (!(((f) this).field_F == null)) {
            ((f) this).field_F.b(12110);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            gi stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            gi stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gi stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            gi stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            gi stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            gi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (((f) this).field_F == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((f) this).field_o.field_p = 0;
                    stackOut_3_0 = ((f) this).field_o;
                    stackOut_3_1 = 111;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param1) {
                      stackOut_5_0 = (gi) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (gi) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((gi) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2);
                  ((f) this).field_o.a(0L, (byte) 120);
                  ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((f) this).field_F.b(12110);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((f) this).field_t = -2;
                  ((f) this).field_f = ((f) this).field_f + 1;
                  ((f) this).field_F = null;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_B = null;
        field_y = null;
        field_x = null;
        field_w = null;
        field_E = null;
        field_u = null;
        field_G = null;
        field_D = null;
        field_A = null;
        field_z = null;
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            int var4_int = 0;
            IOException var5 = null;
            qa var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var7 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  if (null != ((f) this).field_F) {
                    try {
                      L2: {
                        ((f) this).field_F.b(12110);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((f) this).field_F = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((f) this).field_F = (sg) param0;
                var4_int = 98 % ((param2 - -72) / 32);
                this.f(123);
                this.a(true, param1);
                ((f) this).field_c.field_p = 0;
                ((f) this).field_d = null;
                L4: while (true) {
                  var5_ref = (qa) (Object) ((f) this).field_a.c(25);
                  if (var5_ref == null) {
                    L5: while (true) {
                      var5_ref = (qa) (Object) ((f) this).field_p.c(54);
                      if (var5_ref != null) {
                        ((f) this).field_j.a((byte) 45, (kd) (Object) var5_ref);
                        continue L5;
                      } else {
                        L6: {
                          if (((f) this).field_n != 0) {
                            {
                              L7: {
                                ((f) this).field_o.field_p = 0;
                                ((f) this).field_o.a((byte) 116, 4);
                                ((f) this).field_o.a((byte) 114, (int) ((f) this).field_n);
                                ((f) this).field_o.b(true, 0);
                                ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((f) this).field_i = 0;
                        ((f) this).field_e = mm.a(-108);
                        break L0;
                      }
                    }
                  } else {
                    ((f) this).field_m.a((byte) 58, (kd) (Object) var5_ref);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref;
                stackOut_24_1 = new StringBuilder().append("f.G(");
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
                  break L11;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = bg.a((byte) 80, true, 16, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("f.B(").append(true).append(',').append(16).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if (1 > var3_int) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = ui.a(1, param0);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (jd.a(var4.charAt(0), -33)) {
                            break L2;
                          } else {
                            if (jd.a(var4.charAt(-1 + var4.length()), -33)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  if (0 >= var5) {
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L0;
                                  } else {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    return stackIn_31_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!jd.a((char) var7, -33)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (2 > var5) {
                                      break L5;
                                    } else {
                                      if (param2) {
                                        break L5;
                                      } else {
                                        stackOut_26_0 = 0;
                                        stackIn_27_0 = stackOut_26_0;
                                        return stackIn_27_0 != 0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("f.I(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + 4 + ',' + param2 + ')');
        }
        return stackIn_33_0 != 0;
    }

    private final void f(int param0) {
        try {
            int var2_int = 0;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((f) this).field_F == null) {
              return;
            } else {
              {
                L0: {
                  ((f) this).field_o.field_p = 0;
                  ((f) this).field_o.a((byte) 111, 6);
                  ((f) this).field_o.e(31, 3);
                  ((f) this).field_o.d(0, 90);
                  var2_int = 28;
                  ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        Exception exception = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((f) this).field_F.b(12110);
              if (param0 == 14900) {
                break L1;
              } else {
                var3 = null;
                ((f) this).a((Object) null, true, 90);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((f) this).field_t = -1;
        ((f) this).field_f = ((f) this).field_f + 1;
        ((f) this).field_F = null;
        ((f) this).field_n = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            Exception var3 = null;
            qa var3_ref = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            long var13 = 0L;
            Object var15 = null;
            qa var15_ref = null;
            int var16 = 0;
            int var17 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_86_0 = 0;
            L0: {
              var17 = SteelSentinels.field_G;
              if (null != ((f) this).field_F) {
                L1: {
                  var2_long = mm.a(52);
                  var4 = (int)(-((f) this).field_e + var2_long);
                  ((f) this).field_e = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((f) this).field_i = ((f) this).field_i + var4;
                if (((f) this).field_i <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((f) this).field_F.b(12110);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((f) this).field_F = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (((f) this).field_F == null) {
              if (((f) this).a((byte) 16) != -1) {
                return false;
              } else {
                if (-1 == ((f) this).d(-21033)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  var2_int = -82 % ((78 - param0) / 33);
                  ((f) this).field_F.a(true);
                  var3_ref = (qa) (Object) ((f) this).field_m.b(22);
                  L5: while (true) {
                    if (var3_ref == null) {
                      var3_ref = (qa) (Object) ((f) this).field_j.b(22);
                      L6: while (true) {
                        if (var3_ref == null) {
                          var3_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var3_int >= 100) {
                                break L8;
                              } else {
                                var4 = ((f) this).field_F.a(-114);
                                if (0 > var4) {
                                  throw new IOException();
                                } else {
                                  if (var4 != 0) {
                                    L9: {
                                      ((f) this).field_i = 0;
                                      var5 = 0;
                                      if (((f) this).field_d == null) {
                                        var5 = 10;
                                        break L9;
                                      } else {
                                        if (((f) this).field_d.field_I != 0) {
                                          break L9;
                                        } else {
                                          var5 = 1;
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (0 < var5) {
                                        L11: {
                                          var6 = var5 + -((f) this).field_c.field_p;
                                          if (var6 > var4) {
                                            var6 = var4;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((f) this).field_F.a(((f) this).field_c.field_p, var6, ((f) this).field_c.field_t, -256);
                                          if (0 == ((f) this).field_n) {
                                            break L12;
                                          } else {
                                            var7 = 0;
                                            L13: while (true) {
                                              if (var7 >= var6) {
                                                break L12;
                                              } else {
                                                ((f) this).field_c.field_t[((f) this).field_c.field_p - -var7] = (byte)bi.a((int) ((f) this).field_c.field_t[((f) this).field_c.field_p + var7], (int) ((f) this).field_n);
                                                var7++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        ((f) this).field_c.field_p = ((f) this).field_c.field_p + var6;
                                        if (((f) this).field_c.field_p < var5) {
                                          break L10;
                                        } else {
                                          if (((f) this).field_d != null) {
                                            if (((f) this).field_d.field_I == 0) {
                                              if (((f) this).field_c.field_t[0] != -1) {
                                                ((f) this).field_d = null;
                                                break L10;
                                              } else {
                                                ((f) this).field_d.field_I = 1;
                                                ((f) this).field_c.field_p = 0;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L14: {
                                              ((f) this).field_c.field_p = 0;
                                              var7 = ((f) this).field_c.f((byte) -86);
                                              var8 = ((f) this).field_c.i(0);
                                              var9 = ((f) this).field_c.f((byte) -113);
                                              var10 = ((f) this).field_c.i(0);
                                              var11 = var9 & 127;
                                              if (0 == (var9 & 128)) {
                                                stackOut_61_0 = 0;
                                                stackIn_62_0 = stackOut_61_0;
                                                break L14;
                                              } else {
                                                stackOut_60_0 = 1;
                                                stackIn_62_0 = stackOut_60_0;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var12 = stackIn_62_0;
                                              var13 = ((long)var7 << 32) - -(long)var8;
                                              var15 = null;
                                              if (var12 != 0) {
                                                var15_ref = (qa) (Object) ((f) this).field_p.b(22);
                                                L16: while (true) {
                                                  if (var15_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var15_ref.field_w != ~var13) {
                                                      var15_ref = (qa) (Object) ((f) this).field_p.a(false);
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var15_ref = (qa) (Object) ((f) this).field_a.b(22);
                                                L17: while (true) {
                                                  if (var15_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var15_ref.field_w != var13) {
                                                      var15_ref = (qa) (Object) ((f) this).field_a.a(false);
                                                      continue L17;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var15_ref != null) {
                                              L18: {
                                                if (var11 != 0) {
                                                  stackOut_77_0 = 9;
                                                  stackIn_78_0 = stackOut_77_0;
                                                  break L18;
                                                } else {
                                                  stackOut_76_0 = 5;
                                                  stackIn_78_0 = stackOut_76_0;
                                                  break L18;
                                                }
                                              }
                                              var16 = stackIn_78_0;
                                              ((f) this).field_d = var15_ref;
                                              ((f) this).field_d.field_G = new gi(var16 + (var10 + ((f) this).field_d.field_K));
                                              ((f) this).field_d.field_G.a((byte) 125, var11);
                                              ((f) this).field_d.field_G.b(true, var10);
                                              ((f) this).field_c.field_p = 0;
                                              ((f) this).field_d.field_I = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var6 = -((f) this).field_d.field_K + ((f) this).field_d.field_G.field_t.length;
                                          var7 = 512 - ((f) this).field_d.field_I;
                                          if (var7 > var6 + -((f) this).field_d.field_G.field_p) {
                                            var7 = -((f) this).field_d.field_G.field_p + var6;
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var7 <= var4) {
                                            break L20;
                                          } else {
                                            var7 = var4;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          ((f) this).field_F.a(((f) this).field_d.field_G.field_p, var7, ((f) this).field_d.field_G.field_t, -256);
                                          if (((f) this).field_n != 0) {
                                            var8 = 0;
                                            L22: while (true) {
                                              if (var7 <= var8) {
                                                break L21;
                                              } else {
                                                ((f) this).field_d.field_G.field_t[((f) this).field_d.field_G.field_p + var8] = (byte)bi.a((int) ((f) this).field_d.field_G.field_t[((f) this).field_d.field_G.field_p + var8], (int) ((f) this).field_n);
                                                var8++;
                                                continue L22;
                                              }
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        ((f) this).field_d.field_G.field_p = ((f) this).field_d.field_G.field_p + var7;
                                        ((f) this).field_d.field_I = ((f) this).field_d.field_I + var7;
                                        if (var6 != ((f) this).field_d.field_G.field_p) {
                                          if (((f) this).field_d.field_I == 512) {
                                            ((f) this).field_d.field_I = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          ((f) this).field_d.e(480);
                                          ((f) this).field_d.field_z = false;
                                          ((f) this).field_d = null;
                                          break L10;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            stackOut_86_0 = 1;
                            stackIn_87_0 = stackOut_86_0;
                            break L4;
                          }
                        } else {
                          ((f) this).field_o.field_p = 0;
                          ((f) this).field_o.a((byte) 110, 0);
                          ((f) this).field_o.a(var3_ref.field_w, (byte) 120);
                          ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                          ((f) this).field_p.a((byte) 106, (kd) (Object) var3_ref);
                          var3_ref = (qa) (Object) ((f) this).field_j.a(false);
                          continue L6;
                        }
                      }
                    } else {
                      ((f) this).field_o.field_p = 0;
                      ((f) this).field_o.a((byte) 111, 1);
                      ((f) this).field_o.a(var3_ref.field_w, (byte) 120);
                      ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                      ((f) this).field_a.a((byte) 121, (kd) (Object) var3_ref);
                      var3_ref = (qa) (Object) ((f) this).field_m.a(false);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((f) this).field_F.b(12110);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  ((f) this).field_f = ((f) this).field_f + 1;
                  ((f) this).field_F = null;
                  ((f) this).field_t = -2;
                  if (((f) this).a((byte) 16) != 0) {
                    break L25;
                  } else {
                    if (0 != ((f) this).d(-21033)) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_87_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[256];
        field_u = "<%0> is already on your friend list.";
        field_D = new rf();
        field_E = "<%0> sec";
        field_G = new java.util.zip.CRC32();
        field_v = 0;
        field_z = "Skip mission";
    }
}
