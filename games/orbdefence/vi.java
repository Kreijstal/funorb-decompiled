/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class vi extends s {
    private int field_P;
    private int field_N;
    private boolean field_G;
    private long field_R;
    private long field_Q;
    static int[] field_O;
    static String field_H;
    private boolean field_J;
    private int field_K;
    static int field_I;
    private int field_L;

    final static void a(boolean param0, int param1) {
        int discarded$4 = nk.a((byte) -126);
        if (param0) {
            vi.a(false, -63);
        }
    }

    private final int l() {
        int var2 = 0;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (((vi) this).field_N != 0) {
          var2 = ((vi) this).field_N - 1;
          L0: while (true) {
            if (var2 > 0) {
              if (32 != ((vi) this).field_l.charAt(var2 - 1)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((vi) this).field_N;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              ((vi) this).field_l = param2;
              var4_int = param2.length();
              if (param0 == ~((vi) this).field_P) {
                break L2;
              } else {
                if (((vi) this).field_P < var4_int) {
                  ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_P);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            int dupTemp$2 = ((vi) this).field_l.length();
            ((vi) this).field_L = dupTemp$2;
            ((vi) this).field_N = dupTemp$2;
            if (!param1) {
              ((vi) this).c((byte) -128);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("vi.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ui var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          if (param1 instanceof ui) {
            var14 = (ui) (Object) param1;
            var2 = var14.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14.field_c;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf('\t'));
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    final static sc a(int param0, ki param1, ki param2, int param3, int param4) {
        RuntimeException var5 = null;
        sc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (pk.a(113, param4, param2, param3)) {
              stackOut_3_0 = fc.a(param1.b(param4, false, param3), -62);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("vi.FA(").append(-13449).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    final void e(byte param0) {
        ((vi) this).field_N = 0;
        ((vi) this).field_L = 0;
        ((vi) this).field_l = "";
        ((vi) this).c((byte) -125);
        if (param0 >= -119) {
            field_O = null;
        }
    }

    private final String d() {
        int var2 = ((vi) this).field_N > ((vi) this).field_L ? ((vi) this).field_L : ((vi) this).field_N;
        int var3 = ((vi) this).field_N <= ((vi) this).field_L ? ((vi) this).field_L : ((vi) this).field_N;
        return ((vi) this).field_l.substring(var2, var3);
    }

    private final void p(int param0) {
        dm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rj var9 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (((vi) this).field_G) {
          if (((vi) this).field_j instanceof rj) {
            var9 = (rj) (Object) ((vi) this).field_j;
            var3 = var9.a((pj) this, true);
            if (param0 == 1970553377) {
              var4 = var3.a(false);
              var5 = var9.a((pj) this, param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1;
              if (-var6 + var5 > var4) {
                ((vi) this).field_f = 0;
                ((vi) this).field_q = 0;
                return;
              } else {
                var7 = ((vi) this).field_f - -var3.a(param0 + -1970553503, ((vi) this).field_N);
                if (var7 <= -var6 + var5) {
                  if (var7 < var6) {
                    ((vi) this).field_f = ((vi) this).field_f + -var7 + var6;
                    if (0 >= ((vi) this).field_f) {
                      if (((vi) this).field_f < -var5 - -var6) {
                        ((vi) this).field_f = -var5 - -var6;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vi) this).field_f = 0;
                      return;
                    }
                  } else {
                    if (0 >= ((vi) this).field_f) {
                      if (((vi) this).field_f < -var5 - -var6) {
                        ((vi) this).field_f = -var5 - -var6;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vi) this).field_f = 0;
                      return;
                    }
                  }
                } else {
                  ((vi) this).field_f = -var7 - var6 - -var5 + ((vi) this).field_f;
                  if (0 >= ((vi) this).field_f) {
                    if (((vi) this).field_f >= -var5 - -var6) {
                      return;
                    } else {
                      ((vi) this).field_f = -var5 - -var6;
                      return;
                    }
                  } else {
                    ((vi) this).field_f = 0;
                    return;
                  }
                }
              }
            } else {
              ((vi) this).field_L = -101;
              var4 = var3.a(false);
              var5 = var9.a((pj) this, param0 + -1970553495);
              var6 = var9.a((byte) 94) >> 1;
              if (-var6 + var5 > var4) {
                ((vi) this).field_f = 0;
                ((vi) this).field_q = 0;
                return;
              } else {
                L0: {
                  var7 = ((vi) this).field_f - -var3.a(param0 + -1970553503, ((vi) this).field_N);
                  if (var7 <= -var6 + var5) {
                    if (var7 < var6) {
                      ((vi) this).field_f = ((vi) this).field_f + -var7 + var6;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((vi) this).field_f = -var7 - var6 - -var5 + ((vi) this).field_f;
                    break L0;
                  }
                }
                if (0 >= ((vi) this).field_f) {
                  if (((vi) this).field_f >= -var5 - -var6) {
                    return;
                  } else {
                    ((vi) this).field_f = -var5 - -var6;
                    return;
                  }
                } else {
                  ((vi) this).field_f = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          ((vi) this).field_f = 0;
          ((vi) this).field_q = 0;
          return;
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((vi) this).field_L == ((vi) this).field_N) {
            break L0;
          } else {
            L1: {
              if (((vi) this).field_L >= ((vi) this).field_N) {
                stackOut_3_0 = ((vi) this).field_N;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((vi) this).field_L;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((vi) this).field_N <= ((vi) this).field_L) {
                stackOut_6_0 = ((vi) this).field_L;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((vi) this).field_N;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((vi) this).field_N = var2;
            ((vi) this).field_L = var2;
            ((vi) this).field_l = ((vi) this).field_l.substring(0, var2) + ((vi) this).field_l.substring(var3, ((vi) this).field_l.length());
            ((vi) this).c((byte) -128);
            break L0;
          }
        }
        if (param0 != 25177) {
          this.m(68);
          return;
        } else {
          return;
        }
    }

    private final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -47) {
          var2 = ((vi) this).field_l.length();
          if (var2 == ((vi) this).field_N) {
            return ((vi) this).field_N;
          } else {
            var3 = 1 + ((vi) this).field_N;
            L0: while (true) {
              if (var2 > var3) {
                if (((vi) this).field_l.charAt(-1 + var3) != 32) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          var5 = null;
          boolean discarded$5 = ((vi) this).a('i', 85, (pj) null, 10);
          var2 = ((vi) this).field_l.length();
          if (var2 == ((vi) this).field_N) {
            return ((vi) this).field_N;
          } else {
            var3 = 1 + ((vi) this).field_N;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((vi) this).field_l.charAt(-1 + var3)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void f(byte param0) {
        try {
            String var2 = null;
            Object var3 = null;
            L0: {
              int discarded$6 = -114;
              var2 = this.d();
              if (var2.length() > 0) {
                int discarded$7 = -114;
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.d()), (java.awt.datatransfer.ClipboardOwner) null);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 < 5) {
              var3 = null;
              boolean discarded$8 = ((vi) this).a('ﾦ', 54, (pj) null, -16);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        try {
          L0: {
            ((vi) this).field_Q = ji.b(109);
            if (60 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 > 126) {
                      break L1;
                    } else {
                      L2: {
                        if (((vi) this).field_N != ((vi) this).field_L) {
                          this.m(25177);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((vi) this).field_P == -1) {
                            break L4;
                          } else {
                            if (((vi) this).field_l.length() < ((vi) this).field_P) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (((vi) this).field_N >= ((vi) this).field_l.length()) {
                            ((vi) this).field_l = ((vi) this).field_l + param0;
                            int dupTemp$3 = ((vi) this).field_l.length();
                            ((vi) this).field_N = dupTemp$3;
                            ((vi) this).field_L = dupTemp$3;
                            break L5;
                          } else {
                            ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
                            ((vi) this).field_N = ((vi) this).field_N + 1;
                            ((vi) this).field_L = ((vi) this).field_N;
                            break L5;
                          }
                        }
                        ((vi) this).c((byte) -122);
                        break L3;
                      }
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    }
                  }
                }
                L6: {
                  if (param1 != 85) {
                    if (param1 == 101) {
                      if (((vi) this).field_N != ((vi) this).field_L) {
                        this.m(25177);
                        stackOut_73_0 = 1;
                        stackIn_74_0 = stackOut_73_0;
                        return stackIn_74_0 != 0;
                      } else {
                        if (~((vi) this).field_N > ~((vi) this).field_l.length()) {
                          ((vi) this).field_L = ((vi) this).field_N + 1;
                          this.m(25177);
                          stackOut_71_0 = 1;
                          stackIn_72_0 = stackOut_71_0;
                          return stackIn_72_0 != 0;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if (13 != param1) {
                        if (param1 != 96) {
                          if (param1 == 97) {
                            if (~((vi) this).field_N <= ~((vi) this).field_l.length()) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_63_0 = this;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_64_0 = stackOut_63_0;
                                if (!ek.field_a[82]) {
                                  stackOut_65_0 = this;
                                  stackOut_65_1 = ((vi) this).field_N + 1;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  break L7;
                                } else {
                                  stackOut_64_0 = this;
                                  stackOut_64_1 = this.b((byte) -123);
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  break L7;
                                }
                              }
                              this.b(stackIn_66_1, 1242);
                              stackOut_66_0 = 1;
                              stackIn_67_0 = stackOut_66_0;
                              return stackIn_67_0 != 0;
                            }
                          } else {
                            if (param1 == 102) {
                              this.b(0, 1242);
                              stackOut_60_0 = 1;
                              stackIn_61_0 = stackOut_60_0;
                              return stackIn_61_0 != 0;
                            } else {
                              if (103 == param1) {
                                this.b(((vi) this).field_l.length(), 1242);
                                stackOut_58_0 = 1;
                                stackIn_59_0 = stackOut_58_0;
                                return stackIn_59_0 != 0;
                              } else {
                                if (param1 == 84) {
                                  this.j(param3 + -8108);
                                  stackOut_56_0 = 1;
                                  stackIn_57_0 = stackOut_56_0;
                                  return stackIn_57_0 != 0;
                                } else {
                                  L8: {
                                    if (!ek.field_a[82]) {
                                      break L8;
                                    } else {
                                      if (param1 != 65) {
                                        break L8;
                                      } else {
                                        this.k(param3 + -89);
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ek.field_a[82]) {
                                      break L9;
                                    } else {
                                      if (param1 == 66) {
                                        this.f((byte) 64);
                                        stackOut_54_0 = 1;
                                        stackIn_55_0 = stackOut_54_0;
                                        return stackIn_55_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (!ek.field_a[82]) {
                                    break L6;
                                  } else {
                                    if (param1 == 67) {
                                      int discarded$4 = 0;
                                      this.o();
                                      stackOut_52_0 = 1;
                                      stackIn_53_0 = stackOut_52_0;
                                      return stackIn_53_0 != 0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (((vi) this).field_N <= 0) {
                            break L6;
                          } else {
                            L10: {
                              stackOut_33_0 = this;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              if (ek.field_a[82]) {
                                int discarded$5 = -1;
                                stackOut_35_0 = this;
                                stackOut_35_1 = this.l();
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                break L10;
                              } else {
                                stackOut_34_0 = this;
                                stackOut_34_1 = -1 + ((vi) this).field_N;
                                stackIn_36_0 = stackOut_34_0;
                                stackIn_36_1 = stackOut_34_1;
                                break L10;
                              }
                            }
                            this.b(stackIn_36_1, 1242);
                            stackOut_36_0 = 1;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0 != 0;
                          }
                        }
                      } else {
                        ((vi) this).e((byte) -126);
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0 != 0;
                      }
                    }
                  } else {
                    if (~((vi) this).field_N != ~((vi) this).field_L) {
                      this.m(25177);
                      stackOut_25_0 = 1;
                      stackIn_26_0 = stackOut_25_0;
                      return stackIn_26_0 != 0;
                    } else {
                      if (((vi) this).field_N > 0) {
                        ((vi) this).field_L = -1 + ((vi) this).field_N;
                        this.m(25177);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L11: {
                  if (param3 == 0) {
                    break L11;
                  } else {
                    vi.a(true, 15);
                    break L11;
                  }
                }
                stackOut_77_0 = 0;
                stackIn_78_0 = stackOut_77_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5;
            stackOut_79_1 = new StringBuilder().append("vi.I(").append(param0).append(44).append(param1).append(44);
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L12;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L12;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param3 + 41);
        }
        return stackIn_78_0 != 0;
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rj var5 = null;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.p(1970553377);
              if (((vi) this).field_v != 1) {
                break L1;
              } else {
                L2: {
                  if (!(((vi) this).field_j instanceof rj)) {
                    break L2;
                  } else {
                    var5 = (rj) (Object) ((vi) this).field_j;
                    var6 = var5.a(vl.field_d, param3, 2147483647, ua.field_a, (pj) this, param2);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((vi) this).field_J) {
                          break L3;
                        } else {
                          if (((vi) this).field_K <= var6) {
                            break L3;
                          } else {
                            if (var6 <= ((vi) this).field_L) {
                              break L3;
                            } else {
                              var6 = ((vi) this).field_K;
                              break L3;
                            }
                          }
                        }
                      }
                      ((vi) this).field_N = var6;
                      break L2;
                    }
                  }
                }
                ((vi) this).field_Q = ji.b(-98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("vi.A(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a((byte) -116, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (((vi) this).field_j instanceof rj) {
                  L2: {
                    var8_int = ((rj) (Object) ((vi) this).field_j).a(vl.field_d, param6, 2147483647, ua.field_a, (pj) this, param3);
                    stackOut_3_0 = this;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8_int != -1) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = var8_int;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = 0;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.b(stackIn_6_1, 1242);
                    var8_long = ji.b(119);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (-((vi) this).field_R + var8_long >= 250L) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((vi) this).field_J = stackIn_9_1 != 0;
                    if (!((vi) this).field_J) {
                      break L4;
                    } else {
                      L5: {
                        int discarded$1 = -1;
                        ((vi) this).field_L = this.l();
                        ((vi) this).field_N = this.b((byte) -115);
                        if (((vi) this).field_N <= 0) {
                          break L5;
                        } else {
                          if (((vi) this).field_l.charAt(-1 + ((vi) this).field_N) != 32) {
                            break L5;
                          } else {
                            ((vi) this).field_N = ((vi) this).field_N - 1;
                            break L5;
                          }
                        }
                      }
                      ((vi) this).field_K = ((vi) this).field_N;
                      break L4;
                    }
                  }
                  ((vi) this).field_R = var8_long;
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 <= -115) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              ((vi) this).field_Q = 71L;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("vi.F(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    vi(String param0, ag param1, int param2) {
        super(param0, param1);
        ((vi) this).field_J = false;
        ((vi) this).field_R = 0L;
        ((vi) this).field_K = -1;
        try {
            ((vi) this).field_P = param2;
            ((vi) this).field_j = mb.field_a.field_q;
            ((vi) this).a(0, true, param0);
            ((vi) this).field_G = true;
            ((vi) this).field_Q = ji.b(-53);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void k(int param0) {
        if (param0 >= -33) {
            return;
        }
        this.f((byte) 91);
        this.m(25177);
    }

    private final void o() {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.m(25177);
                int discarded$1 = 1;
                this.a(var2_ref);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 != 0) {
              if (1 != param2) {
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var7 = 0;
                      if (var4_int <= var7) {
                        break L2;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            StringBuilder discarded$2 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append("null");
                            var7++;
                            break L3;
                          }
                        }
                        var7++;
                        var7++;
                        break L2;
                      }
                    }
                    stackOut_23_0 = var6.toString();
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        var6_int++;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              } else {
                var10 = param0[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_8_0 = ((Object) (Object) var10).toString();
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_6_0 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4_ref;
            stackOut_25_1 = new StringBuilder().append("vi.S(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + 0 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_24_0;
    }

    private final void a(String param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (((vi) this).field_P != 0) {
                var3_int = ((vi) this).field_P - ((vi) this).field_l.length();
                if (-1 > var3_int) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((vi) this).field_N == ((vi) this).field_l.length()) {
                ((vi) this).field_l = ((vi) this).field_l + param0;
                break L2;
              } else {
                ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
                break L2;
              }
            }
            ((vi) this).field_N = ((vi) this).field_N + param0.length();
            ((vi) this).field_L = ((vi) this).field_N;
            ((vi) this).c((byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vi.CA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 1 + 41);
        }
    }

    void c(byte param0) {
        L0: {
          if (((vi) this).field_h instanceof jb) {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, 66);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -120) {
          this.p(89);
          return;
        } else {
          return;
        }
    }

    private final void j(int param0) {
        Object var3 = null;
        if (param0 == -8108) {
          if (((vi) this).field_h instanceof jb) {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, false);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          ((vi) this).a((byte) -122, (pj) null, -81, 77);
          if (!(((vi) this).field_h instanceof jb)) {
            return;
          } else {
            ((jb) (Object) ((vi) this).field_h).a((vi) this, false);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        rj var8 = null;
        if (((vi) this).field_j != null) {
          if (param1 == 0) {
            ((vi) this).field_j.a(param0, param3, (pj) this, -4394, ((vi) this).field_F);
            if (((vi) this).field_j instanceof rj) {
              L0: {
                var8 = (rj) (Object) ((vi) this).field_j;
                if (((vi) this).field_N != ((vi) this).field_L) {
                  var8.a(((vi) this).field_L, ((vi) this).field_N, (pj) this, param3, param2 ^ -1048511, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = ji.b(126);
              if ((-((vi) this).field_Q + var6) % 1000L < 500L) {
                var8.a(param0, (pj) this, param3, (byte) 94, ((vi) this).field_N);
                if (param2 != 1048575) {
                  this.b(-122, -76);
                  return;
                } else {
                  return;
                }
              } else {
                if (param2 != 1048575) {
                  this.b(-122, -76);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param2 != 1048575) {
                this.b(-122, -76);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param2 != 1048575) {
              this.b(-122, -76);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != 1048575) {
            this.b(-122, -76);
            return;
          } else {
            return;
          }
        }
    }

    public static void n() {
        field_O = null;
        field_H = null;
    }

    private final void b(int param0, int param1) {
        ((vi) this).field_N = param0;
        if (param1 != 1242) {
            return;
        }
        if (!(ek.field_a[81])) {
            ((vi) this).field_L = ((vi) this).field_N;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var0 = 0;
        int var2 = 0;
        field_H = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_O = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
            var0 = var1;
            for (var2 = 0; var2 < 8; var2++) {
                if ((1 & var0) == 1) {
                    var0 = -306674912 ^ var0 >>> 1;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_O[var1] = var0;
        }
    }
}
