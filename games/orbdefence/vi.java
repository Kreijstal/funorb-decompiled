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
        try {
            int discarded$4 = nk.a((byte) -126);
            if (param0) {
                vi.a(false, -63);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vi.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final int l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 != ~((vi) this).field_N) {
              var2_int = ((vi) this).field_N - 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int <= 0) {
                      break L3;
                    } else {
                      stackOut_6_0 = 32;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 == ((vi) this).field_l.charAt(var2_int - 1)) {
                          break L3;
                        } else {
                          var2_int--;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var2_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = ((vi) this).field_N;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.K(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final void a(int param0, boolean param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                if (~((vi) this).field_P > ~var4_int) {
                  ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_P);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$3 = ((vi) this).field_l.length();
              ((vi) this).field_L = dupTemp$3;
              ((vi) this).field_N = dupTemp$3;
              if (!param1) {
                ((vi) this).c((byte) -128);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("vi.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        ui var3 = null;
        StringWriter var3_ref = null;
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
        L0: {
          L1: {
            var13 = OrbDefence.field_D ? 1 : 0;
            if (param1 instanceof ui) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = (ui) (Object) param1;
          var2 = var3.field_d + " | ";
          param1 = var3.field_c;
          break L0;
        }
        L2: {
          var3_ref = new StringWriter();
          if (param0 == 41) {
            break L2;
          } else {
            String discarded$1 = vi.a((CharSequence[]) null, -61, -90, 112);
            break L2;
          }
        }
        var4 = new PrintWriter((Writer) (Object) var3_ref);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        L3: while (true) {
          L4: {
            L5: {
              var8 = var6.readLine();
              if (var8 == null) {
                break L5;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (var9 == -1) {
                        break L7;
                      } else {
                        var11 = var8.substring(0, var9);
                        if (var13 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = var8;
                    break L6;
                  }
                  L8: {
                    var11 = var11.trim();
                    var11 = var11.substring(1 + var11.lastIndexOf(' '));
                    var11 = var11.substring(1 + var11.lastIndexOf('\t'));
                    var2 = var2 + var11;
                    if (var9 == -1) {
                      break L8;
                    } else {
                      if (var10 == -1) {
                        break L8;
                      } else {
                        var12 = var8.indexOf(".java:", var9);
                        if (var12 >= 0) {
                          var2 = var2 + var8.substring(5 + var12, var10);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  if (var13 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var2 = var2 + "| " + var7;
            break L4;
          }
          return var2;
        }
    }

    final static sc a(int param0, ki param1, ki param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        sc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        sc stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!pk.a(113, param4, param2, param3)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (sc) (Object) stackIn_4_0;
            } else {
              if (param0 == -13449) {
                stackOut_8_0 = fc.a(param1.b(param4, false, param3), -62);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (sc) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("vi.FA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_9_0;
    }

    final void e(byte param0) {
        try {
            ((vi) this).field_N = 0;
            ((vi) this).field_L = 0;
            ((vi) this).field_l = "";
            ((vi) this).c((byte) -125);
            if (param0 >= -119) {
                field_O = null;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vi.O(" + param0 + ')');
        }
    }

    private final String d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        String stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -114) {
              L1: {
                if (((vi) this).field_N <= ((vi) this).field_L) {
                  stackOut_6_0 = ((vi) this).field_N;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((vi) this).field_L;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var2_int = stackIn_7_0;
                if (((vi) this).field_N > ((vi) this).field_L) {
                  stackOut_10_0 = ((vi) this).field_N;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = ((vi) this).field_L;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              var3 = stackIn_11_0;
              stackOut_11_0 = ((vi) this).field_l.substring(var2_int, var3);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.BA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        rj var2_ref = null;
        dm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((vi) this).field_G) {
              if (((vi) this).field_j instanceof rj) {
                L1: {
                  var2_ref = (rj) (Object) ((vi) this).field_j;
                  var3 = var2_ref.a((pj) this, true);
                  if (param0 == 1970553377) {
                    break L1;
                  } else {
                    ((vi) this).field_L = -101;
                    break L1;
                  }
                }
                var4 = var3.a(false);
                var5 = var2_ref.a((pj) this, param0 + -1970553495);
                var6 = var2_ref.a((byte) 94) >> 1970553377;
                if (~(-var6 + var5) < ~var4) {
                  ((vi) this).field_f = 0;
                  ((vi) this).field_q = 0;
                  return;
                } else {
                  L2: {
                    L3: {
                      var7 = ((vi) this).field_f - -var3.a(param0 + -1970553503, ((vi) this).field_N);
                      if (~var7 >= ~(-var6 + var5)) {
                        break L3;
                      } else {
                        ((vi) this).field_f = -var7 - var6 - -var5 + ((vi) this).field_f;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (~var7 > ~var6) {
                      ((vi) this).field_f = ((vi) this).field_f + -var7 + var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    L5: {
                      if (0 < ((vi) this).field_f) {
                        break L5;
                      } else {
                        if (~((vi) this).field_f <= ~(-var5 - -var6)) {
                          break L4;
                        } else {
                          ((vi) this).field_f = -var5 - -var6;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    ((vi) this).field_f = 0;
                    break L4;
                  }
                  break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.AA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (~((vi) this).field_L == ~((vi) this).field_N) {
                break L1;
              } else {
                L2: {
                  if (((vi) this).field_L >= ((vi) this).field_N) {
                    stackOut_6_0 = ((vi) this).field_N;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ((vi) this).field_L;
                    stackIn_7_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var2_int = stackIn_7_0;
                  if (~((vi) this).field_N >= ~((vi) this).field_L) {
                    stackOut_10_0 = ((vi) this).field_L;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_8_0 = ((vi) this).field_N;
                    stackIn_11_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var3 = stackIn_11_0;
                ((vi) this).field_N = var2_int;
                ((vi) this).field_L = var2_int;
                ((vi) this).field_l = ((vi) this).field_l.substring(0, var2_int) + ((vi) this).field_l.substring(var3, ((vi) this).field_l.length());
                ((vi) this).c((byte) -128);
                break L1;
              }
            }
            L4: {
              if (param0 == 25177) {
                break L4;
              } else {
                this.m(68);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.W(" + param0 + ')');
        }
    }

    private final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -47) {
                break L1;
              } else {
                boolean discarded$2 = ((vi) this).a('i', 85, (pj) null, 10);
                break L1;
              }
            }
            var2_int = ((vi) this).field_l.length();
            if (var2_int == ((vi) this).field_N) {
              stackOut_7_0 = ((vi) this).field_N;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 1 + ((vi) this).field_N;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var2_int <= var3) {
                      break L4;
                    } else {
                      stackOut_11_0 = -33;
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (stackIn_12_0 == ~((vi) this).field_l.charAt(-1 + var3)) {
                          break L4;
                        } else {
                          var3++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_18_0 = var3;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.HA(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    private final void f(byte param0) {
        try {
            RuntimeException runtimeException = null;
            String var2 = null;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = this.d((byte) -114);
                  if (var2.length() > 0) {
                    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.d((byte) -114)), (java.awt.datatransfer.ClipboardOwner) null);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 >= 5) {
                    break L2;
                  } else {
                    boolean discarded$2 = ((vi) this).a('ﾦ', 54, (pj) null, -16);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              runtimeException = decompiledCaughtException;
              throw dd.a((Throwable) (Object) runtimeException, "vi.P(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_106_0 = null;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_117_0 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_104_0 = null;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_55_0 = null;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        try {
          L0: {
            L1: {
              ((vi) this).field_Q = ji.b(109);
              if (60 == param0) {
                break L1;
              } else {
                if (param0 != 62) {
                  L2: {
                    if (param0 < 32) {
                      break L2;
                    } else {
                      if (param0 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (((vi) this).field_N != ((vi) this).field_L) {
                            this.m(25177);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (((vi) this).field_P == -1) {
                              break L5;
                            } else {
                              if (((vi) this).field_l.length() < ((vi) this).field_P) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            L7: {
                              if (((vi) this).field_N >= ((vi) this).field_l.length()) {
                                break L7;
                              } else {
                                ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
                                ((vi) this).field_N = ((vi) this).field_N + 1;
                                ((vi) this).field_L = ((vi) this).field_N;
                                if (!OrbDefence.field_D) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ((vi) this).field_l = ((vi) this).field_l + param0;
                            int dupTemp$1 = ((vi) this).field_l.length();
                            ((vi) this).field_N = dupTemp$1;
                            ((vi) this).field_L = dupTemp$1;
                            break L6;
                          }
                          ((vi) this).c((byte) -122);
                          break L4;
                        }
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0 != 0;
                      }
                    }
                  }
                  L8: {
                    if (param1 != 85) {
                      if (param1 == 101) {
                        if (((vi) this).field_N != ((vi) this).field_L) {
                          this.m(25177);
                          stackOut_119_0 = 1;
                          stackIn_120_0 = stackOut_119_0;
                          return stackIn_120_0 != 0;
                        } else {
                          if (~((vi) this).field_N > ~((vi) this).field_l.length()) {
                            ((vi) this).field_L = ((vi) this).field_N + 1;
                            this.m(25177);
                            stackOut_117_0 = 1;
                            stackIn_118_0 = stackOut_117_0;
                            return stackIn_118_0 != 0;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        if (13 != param1) {
                          if (param1 != 96) {
                            if (param1 == 97) {
                              if (~((vi) this).field_N <= ~((vi) this).field_l.length()) {
                                break L8;
                              } else {
                                L9: {
                                  stackOut_103_0 = this;
                                  stackIn_108_0 = stackOut_103_0;
                                  stackIn_104_0 = stackOut_103_0;
                                  if (!ek.field_a[82]) {
                                    stackOut_108_0 = this;
                                    stackOut_108_1 = ((vi) this).field_N + 1;
                                    stackIn_109_0 = stackOut_108_0;
                                    stackIn_109_1 = stackOut_108_1;
                                    break L9;
                                  } else {
                                    stackOut_104_0 = this;
                                    stackIn_106_0 = stackOut_104_0;
                                    stackOut_106_0 = this;
                                    stackOut_106_1 = this.b((byte) -123);
                                    stackIn_109_0 = stackOut_106_0;
                                    stackIn_109_1 = stackOut_106_1;
                                    break L9;
                                  }
                                }
                                this.b(stackIn_109_1, 1242);
                                stackOut_109_0 = 1;
                                stackIn_110_0 = stackOut_109_0;
                                return stackIn_110_0 != 0;
                              }
                            } else {
                              if (param1 == 102) {
                                this.b(0, 1242);
                                stackOut_100_0 = 1;
                                stackIn_101_0 = stackOut_100_0;
                                return stackIn_101_0 != 0;
                              } else {
                                if (103 == param1) {
                                  this.b(((vi) this).field_l.length(), 1242);
                                  stackOut_98_0 = 1;
                                  stackIn_99_0 = stackOut_98_0;
                                  return stackIn_99_0 != 0;
                                } else {
                                  if (param1 == 84) {
                                    this.j(param3 + -8108);
                                    stackOut_96_0 = 1;
                                    stackIn_97_0 = stackOut_96_0;
                                    return stackIn_97_0 != 0;
                                  } else {
                                    L10: {
                                      if (!ek.field_a[82]) {
                                        break L10;
                                      } else {
                                        if (param1 != 65) {
                                          break L10;
                                        } else {
                                          this.k(param3 + -89);
                                          stackOut_78_0 = 1;
                                          stackIn_79_0 = stackOut_78_0;
                                          return stackIn_79_0 != 0;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!ek.field_a[82]) {
                                        break L11;
                                      } else {
                                        if (param1 == 66) {
                                          this.f((byte) 64);
                                          stackOut_94_0 = 1;
                                          stackIn_95_0 = stackOut_94_0;
                                          return stackIn_95_0 != 0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!ek.field_a[82]) {
                                      break L8;
                                    } else {
                                      if (param1 == 67) {
                                        this.o(0);
                                        stackOut_92_0 = 1;
                                        stackIn_93_0 = stackOut_92_0;
                                        return stackIn_93_0 != 0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (((vi) this).field_N <= 0) {
                              break L8;
                            } else {
                              L12: {
                                stackOut_54_0 = this;
                                stackIn_59_0 = stackOut_54_0;
                                stackIn_55_0 = stackOut_54_0;
                                if (ek.field_a[82]) {
                                  stackOut_59_0 = this;
                                  stackOut_59_1 = this.l(-1);
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  break L12;
                                } else {
                                  stackOut_55_0 = this;
                                  stackIn_57_0 = stackOut_55_0;
                                  stackOut_57_0 = this;
                                  stackOut_57_1 = -1 + ((vi) this).field_N;
                                  stackIn_60_0 = stackOut_57_0;
                                  stackIn_60_1 = stackOut_57_1;
                                  break L12;
                                }
                              }
                              this.b(stackIn_60_1, 1242);
                              stackOut_60_0 = 1;
                              stackIn_61_0 = stackOut_60_0;
                              return stackIn_61_0 != 0;
                            }
                          }
                        } else {
                          ((vi) this).e((byte) -126);
                          stackOut_48_0 = 1;
                          stackIn_49_0 = stackOut_48_0;
                          return stackIn_49_0 != 0;
                        }
                      }
                    } else {
                      if (~((vi) this).field_N != ~((vi) this).field_L) {
                        this.m(25177);
                        stackOut_42_0 = 1;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0 != 0;
                      } else {
                        if (((vi) this).field_N > 0) {
                          ((vi) this).field_L = -1 + ((vi) this).field_N;
                          this.m(25177);
                          stackOut_40_0 = 1;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0 != 0;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L13: {
                    if (param3 == 0) {
                      break L13;
                    } else {
                      vi.a(true, 15);
                      break L13;
                    }
                  }
                  stackOut_124_0 = 0;
                  stackIn_125_0 = stackOut_124_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) var5;
            stackOut_126_1 = new StringBuilder().append("vi.I(").append(param0).append(',').append(param1).append(',');
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param2 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L14;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L14;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + ',' + param3 + ')');
        }
        return stackIn_125_0 != 0;
    }

    void a(byte param0, pj param1, int param2, int param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                            if (~var6 >= ~((vi) this).field_L) {
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
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("vi.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a((byte) -116, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (((vi) this).field_j instanceof rj) {
                  L2: {
                    var8_int = ((rj) (Object) ((vi) this).field_j).a(vl.field_d, param6, 2147483647, ua.field_a, (pj) this, param3);
                    stackOut_6_0 = this;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8_int != -1) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = var8_int;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L2;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.b(stackIn_10_1, 1242);
                    var8_long = ji.b(119);
                    stackOut_10_0 = this;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (-((vi) this).field_R + var8_long >= 250L) {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L3;
                    } else {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 1;
                      stackIn_14_0 = stackOut_11_0;
                      stackIn_14_1 = stackOut_11_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((vi) this).field_J = stackIn_14_1 != 0;
                    if (!((vi) this).field_J) {
                      break L4;
                    } else {
                      L5: {
                        ((vi) this).field_L = this.l(-1);
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
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 <= -115) {
                break L6;
              } else {
                ((vi) this).field_Q = 71L;
                break L6;
              }
            }
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var8;
            stackOut_31_1 = new StringBuilder().append("vi.F(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_30_0 != 0;
    }

    vi(String param0, ag param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((vi) this).field_J = false;
        ((vi) this).field_R = 0L;
        ((vi) this).field_K = -1;
        try {
          L0: {
            ((vi) this).field_P = param2;
            ((vi) this).field_j = mb.field_a.field_q;
            ((vi) this).a(0, true, param0);
            ((vi) this).field_G = true;
            ((vi) this).field_Q = ji.b(-53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vi.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        if (param0 >= -33) {
            return;
        }
        try {
            this.f((byte) 91);
            this.m(25177);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vi.T(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        try {
            Exception var2 = null;
            RuntimeException var2_ref = null;
            String var2_ref2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 0) {
                  try {
                    L1: {
                      var2_ref2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                      this.m(25177);
                      this.a(var2_ref2, true);
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw dd.a((Throwable) (Object) var2_ref, "vi.U(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        CharSequence var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 != 0) {
              if (1 != param2) {
                var4_int = param2 - -param3;
                var5 = param1;
                var6_int = param3;
                L1: while (true) {
                  L2: {
                    if (~var4_int >= ~var6_int) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          var7_ref_CharSequence = param0[var6_int];
                          if (null == var7_ref_CharSequence) {
                            break L4;
                          } else {
                            var5 = var5 + var7_ref_CharSequence.length();
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 += 4;
                        break L3;
                      }
                      var6_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6 = new StringBuilder(var5);
                  var7 = param3;
                  L5: while (true) {
                    L6: {
                      if (~var4_int >= ~var7) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var8 = param0[var7];
                            if (null != var8) {
                              break L8;
                            } else {
                              StringBuilder discarded$2 = var6.append("null");
                              if (var9 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          StringBuilder discarded$3 = var6.append(var8);
                          break L7;
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              } else {
                var4_ref = param0[param3];
                if (null != var4_ref) {
                  stackOut_8_0 = ((Object) (Object) var4_ref).toString();
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
          L9: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("vi.S(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_27_0;
    }

    private final void a(String param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (((vi) this).field_P != -1) {
                var3_int = ((vi) this).field_P - ((vi) this).field_l.length();
                if (var3_int < 0) {
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
              L3: {
                if (~((vi) this).field_N == ~((vi) this).field_l.length()) {
                  break L3;
                } else {
                  ((vi) this).field_l = ((vi) this).field_l.substring(0, ((vi) this).field_N) + param0 + ((vi) this).field_l.substring(((vi) this).field_N, ((vi) this).field_l.length());
                  if (!OrbDefence.field_D) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((vi) this).field_l = ((vi) this).field_l + param0;
              break L2;
            }
            L4: {
              ((vi) this).field_N = ((vi) this).field_N + param0.length();
              ((vi) this).field_L = ((vi) this).field_N;
              if (param1) {
                break L4;
              } else {
                ((vi) this).field_G = false;
                break L4;
              }
            }
            ((vi) this).c((byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("vi.CA(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((vi) this).field_h instanceof jb) {
                ((jb) (Object) ((vi) this).field_h).a((vi) this, 66);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -120) {
                break L2;
              } else {
                this.p(89);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.Q(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -8108) {
                break L1;
              } else {
                ((vi) this).a((byte) -122, (pj) null, -81, 77);
                break L1;
              }
            }
            L2: {
              if (!(((vi) this).field_h instanceof jb)) {
                break L2;
              } else {
                ((jb) (Object) ((vi) this).field_h).a((vi) this, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((vi) this).field_j == null) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  ((vi) this).field_j.a(param0, param3, (pj) this, -4394, ((vi) this).field_F);
                  if (!(((vi) this).field_j instanceof rj)) {
                    break L1;
                  } else {
                    L2: {
                      var5 = (rj) (Object) ((vi) this).field_j;
                      if (~((vi) this).field_N != ~((vi) this).field_L) {
                        var5.a(((vi) this).field_L, ((vi) this).field_N, (pj) this, param3, param2 ^ -1048511, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var6 = ji.b(126);
                    if ((-((vi) this).field_Q + var6) % 1000L >= 500L) {
                      break L1;
                    } else {
                      var5.a(param0, (pj) this, param3, (byte) 94, ((vi) this).field_N);
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (param2 == 1048575) {
                break L3;
              } else {
                this.b(-122, -76);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var5_ref, "vi.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void n(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_O = null;
              if (param0 == 1) {
                break L1;
              } else {
                String discarded$2 = vi.a((CharSequence[]) null, 10, 59, 11);
                break L1;
              }
            }
            field_H = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "vi.DA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((vi) this).field_N = param0;
            if (param1 == 1242) {
              L1: {
                if (!ek.field_a[81]) {
                  ((vi) this).field_L = ((vi) this).field_N;
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "vi.R(" + param0 + ',' + param1 + ')');
        }
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 & param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vi.V(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_H = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_O = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_O[var1] = var0;
                var1++;
                continue L0;
              } else {
                L2: {
                  if ((1 & var0) != 1) {
                    var0 = var0 >>> 1;
                    break L2;
                  } else {
                    var0 = -306674912 ^ var0 >>> 1204531841;
                    break L2;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        }
    }
}
