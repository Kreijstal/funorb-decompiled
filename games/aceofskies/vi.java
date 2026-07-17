/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vi extends qm {
    static String[] field_p;
    private sc field_q;
    static String field_n;
    private sc[] field_o;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                L0: {
                  if (param0 == 103) {
                    var3 = new java.net.URL(param2.getCodeBase(), param1);
                    var3 = jf.a(param2, var3, param0 ^ 54);
                    wc.a(var3.toString(), param2, param0 + 14198, true);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var3_ref = (Exception) (Object) decompiledCaughtException;
                  var3_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("vi.P(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
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
              throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, vi param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sc var5 = null;
        sc var6 = null;
        int var7 = 0;
        sc stackIn_9_0 = null;
        sc stackIn_10_0 = null;
        sc stackIn_11_0 = null;
        sc stackIn_11_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_8_0 = null;
        sc stackOut_10_0 = null;
        sc stackOut_10_1 = null;
        sc stackOut_9_0 = null;
        sc stackOut_9_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((qm) (Object) param1, 27529);
              if (param0) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((vi) this).field_o[var4_int];
                      if (var5 == null) {
                        param1.field_o[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_o[var4_int];
                          stackOut_8_0 = (sc) var5;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var6 != null) {
                            stackOut_10_0 = (sc) (Object) stackIn_10_0;
                            stackOut_10_1 = (sc) var6;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            break L4;
                          } else {
                            sc dupTemp$17 = new sc();
                            param1.field_o[var4_int] = dupTemp$17;
                            stackOut_9_0 = (sc) (Object) stackIn_9_0;
                            stackOut_9_1 = (sc) dupTemp$17;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            break L4;
                          }
                        }
                        ((sc) (Object) stackIn_11_0).a(stackIn_11_1, (byte) -22);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                au.a((Object[]) (Object) ((vi) this).field_o, 0, (Object[]) (Object) param1.field_o, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("vi.O(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 0 + 41);
        }
    }

    final sc a(int param0, int param1) {
        if (param0 >= -40) {
            Object var4 = null;
            vi.a((byte) 62, (rb) null);
        }
        sc dupTemp$0 = new sc();
        ((vi) this).field_o[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public static void a(boolean param0) {
        field_p = null;
        field_n = null;
    }

    public vi() {
        ((vi) this).field_o = new sc[6];
        ((vi) this).field_q = new sc();
        sc dupTemp$0 = new sc();
        ((vi) this).field_o[0] = dupTemp$0;
        sc var1 = dupTemp$0;
        var1.a(-70);
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        sc var7 = null;
        sc var9 = null;
        Object var10 = null;
        mi var11 = null;
        sc var12 = null;
        sc var13 = null;
        sc var14 = null;
        sc var15 = null;
        ea stackIn_5_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                var10 = null;
                vi.a((byte) -20, (rb) null);
                break L1;
              }
            }
            L2: {
              if (param3 instanceof mi) {
                stackOut_4_0 = (ea) param3;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = null;
                stackIn_5_0 = (ea) (Object) stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var11 = (mi) (Object) stackIn_5_0;
              fp.a((byte) 67, param4 - -param3.field_h, param3.field_n + param3.field_h + param4, param3.field_q + (param2 - -param3.field_p), param3.field_p + param2);
              if (var11 == null) {
                break L3;
              } else {
                param0 = param0 & var11.field_u;
                break L3;
              }
            }
            L4: {
              var7 = ((vi) this).field_o[0];
              ((vi) this).field_q.a(-93);
              var7.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (!var11.field_s) {
                    break L5;
                  } else {
                    var12 = ((vi) this).field_o[1];
                    if (var12 != null) {
                      var12.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var11.field_g) {
                  L6: {
                    var13 = ((vi) this).field_o[3];
                    if (var11.field_i == 0) {
                      break L6;
                    } else {
                      if (var13 == null) {
                        break L6;
                      } else {
                        var13.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                        break L4;
                      }
                    }
                  }
                  var9 = ((vi) this).field_o[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (!param3.e(28660)) {
                break L7;
              } else {
                var14 = ((vi) this).field_o[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                  break L7;
                }
              }
            }
            L8: {
              if (!param0) {
                var15 = ((vi) this).field_o[4];
                if (var15 != null) {
                  var15.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((vi) this).field_q.a(param3, true, param2, (vi) this, param4);
            sl.c(2765);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("vi.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param4 + 41);
        }
    }

    final void a(byte param0, ll param1) {
        sc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sc var5 = null;
        int var6 = 0;
        Object var7 = null;
        sc[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var8 = ((vi) this).field_o;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var8.length <= var4) {
                L2: {
                  if (param0 == -90) {
                    break L2;
                  } else {
                    var7 = null;
                    ((vi) this).a(65, (ll[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_f = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("vi.M(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final void a(int param0, int param1, ll[] param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (param1 != 0) {
                field_p = null;
            }
            if (!(null != ((vi) this).field_o[var4_int])) {
                ((vi) this).field_o[var4_int] = new sc();
            }
            ((vi) this).field_o[param0].field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vi.R(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    vi(vi param0, boolean param1) {
        this();
        try {
            param0.a(param1, (vi) this, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, ll[] param1) {
        sc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sc var5 = null;
        int var6 = 0;
        Object var7 = null;
        sc[] var8 = null;
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
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var8 = ((vi) this).field_o;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var8.length <= var4) {
                L2: {
                  if (param0 <= -32) {
                    break L2;
                  } else {
                    var7 = null;
                    ((vi) this).a((byte) -114, (ll) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_d = param1;
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vi.Q(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static void a(byte param0, rb param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            Object var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
            byte[] var15 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var5 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var14 = new byte[24];
                  var12 = var14;
                  var10 = var12;
                  var8 = var10;
                  var7 = var8;
                  var15 = var7;
                  var13 = var15;
                  var11 = var13;
                  var9 = var11;
                  var2 = var9;
                  if (vs.field_g == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        vs.field_g.a(true, 0L);
                        vs.field_g.a(var14, param0 ^ -13542);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (0 == var15[var3_int]) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int >= 24) {
                            throw new IOException();
                          } else {
                            break L2;
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  if (param0 == -1) {
                    break L7;
                  } else {
                    var6 = null;
                    vi.a((byte) -110, (rb) null);
                    break L7;
                  }
                }
                param1.a(true, 24, 0, var15);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) runtimeException;
                stackOut_18_1 = new StringBuilder().append("vi.S(").append(param0).append(44);
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param1 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L8;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L8;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[100];
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
