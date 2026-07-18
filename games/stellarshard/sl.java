/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl {
    static int[] field_a;
    static boolean field_c;
    private static sl field_e;
    private java.util.zip.Inflater field_f;
    static int field_b;
    static th field_d;

    public sl() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, byte param1) {
        ta var5 = null;
        int var4 = stellarshard.field_B;
        try {
            var5 = (ta) (Object) eg.field_b.b(-86);
            while (var5 != null) {
                fb.a(7, (byte) -118, var5);
                var5 = (ta) (Object) eg.field_b.b((byte) 55);
            }
            int var3 = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "sl.C(" + 7 + ',' + -105 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        ka var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
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
              var10 = new ka(param1);
              var3 = var10.f(4);
              if (param0 < -57) {
                break L1;
              } else {
                var9 = null;
                sl.a((String) null, 44, (byte) -44, (String[]) null);
                break L1;
              }
            }
            L2: {
              var4 = var10.b(false);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (0 == of.field_B) {
                    break L3;
                  } else {
                    if (var4 <= of.field_B) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var10.b(false);
                    if (var5 < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (of.field_B == 0) {
                          break L5;
                        } else {
                          if (of.field_B >= var5) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var18 = new byte[var5];
                        var16 = var18;
                        var14 = var16;
                        var12 = var14;
                        var6 = var12;
                        if (var3 == 1) {
                          int discarded$2 = 9;
                          int discarded$3 = j.a(var6, var5, param1, var4);
                          break L6;
                        } else {
                          var7 = (Object) (Object) field_e;
                          synchronized (var7) {
                            L7: {
                              field_e.a(-1, var18, var10);
                              break L7;
                            }
                          }
                          break L6;
                        }
                      }
                      stackOut_22_0 = (byte[]) var6;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5_ref_byte__ = var11;
                  var10.a(0, (byte) -118, var4, var17);
                  stackOut_8_0 = (byte[]) var5_ref_byte__;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("sl.G(").append(param0).append(',');
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
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            el.field_E = ta.field_m;
            if (param2 < -15) {
              if (param1 == 255) {
                L1: {
                  if (u.field_k >= 13) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L1;
                  }
                }
                ed.field_d = dg.a(stackIn_13_0 != 0, 0);
                var6 = null;
                mk.a((String[]) null, true);
                break L0;
              } else {
                if (param1 < 100) {
                  ed.field_d = fb.a(param1, true, param0);
                  return;
                } else {
                  if (param1 <= 105) {
                    var4 = param3;
                    mk.a(var4, true);
                    ed.field_d = gj.a(true, param3);
                    return;
                  } else {
                    ed.field_d = fb.a(param1, true, param0);
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("sl.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private final void a(int param0, byte[] param1, ka param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              L0: {
                L1: {
                  if (param2.field_r[param2.field_k] != 31) {
                    break L1;
                  } else {
                    if (param2.field_r[param2.field_k - -1] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (((sl) this).field_f == null) {
                          ((sl) this).field_f = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((sl) this).field_f.setInput(param2.field_r, param2.field_k - -10, -10 - param2.field_k - (8 - param2.field_r.length));
                          int discarded$2 = ((sl) this).field_f.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        ((sl) this).field_f.reset();
                        throw new RuntimeException("");
                      }
                      ((sl) this).field_f.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) var4_ref;
                stackOut_14_1 = new StringBuilder().append("sl.E(").append(-1).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L4;
                }
              }
              L5: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L5;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        wd.field_c = false;
        int discarded$0 = ae.field_N.f(4);
    }

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          param0.removeMouseListener((java.awt.event.MouseListener) (Object) sf.field_c);
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) sf.field_c);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) sf.field_c);
          ib.field_g = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sl.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 103 + ')');
        }
    }

    private sl(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_e = new sl();
        field_b = 0;
    }
}
