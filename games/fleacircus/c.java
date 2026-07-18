/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends bb {
    private long field_L;
    private int field_N;
    static boolean field_U;
    static long field_P;
    private int field_M;
    private long field_Q;
    static int field_S;
    private int field_O;
    private boolean field_T;
    private boolean field_R;
    private int field_K;

    private final void q(int param0) {
        try {
            RuntimeException runtimeException = null;
            String var2 = null;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = this.p(0);
                  if (param0 > 82) {
                    break L1;
                  } else {
                    ((c) this).field_O = -105;
                    break L1;
                  }
                }
                L2: {
                  if (0 < var2.length()) {
                    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(0)), (java.awt.datatransfer.ClipboardOwner) null);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              runtimeException = decompiledCaughtException;
              throw pf.a((Throwable) (Object) runtimeException, "c.RA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
              if (~((c) this).field_K != ~((c) this).field_M) {
                L2: {
                  if (((c) this).field_M > ((c) this).field_K) {
                    stackOut_6_0 = ((c) this).field_K;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ((c) this).field_M;
                    stackIn_7_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var2_int = stackIn_7_0;
                  if (~((c) this).field_M >= ~((c) this).field_K) {
                    stackOut_10_0 = ((c) this).field_K;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_8_0 = ((c) this).field_M;
                    stackIn_11_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var3 = stackIn_11_0;
                ((c) this).field_M = var2_int;
                ((c) this).field_K = var2_int;
                ((c) this).field_i = ((c) this).field_i.substring(0, var2_int) + ((c) this).field_i.substring(var3, ((c) this).field_i.length());
                ((c) this).i(-1);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                ((c) this).field_R = true;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.OA(" + param0 + ')');
        }
    }

    final static void o(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ij.field_H = null;
              of.field_d = null;
              if (param0 == -28210) {
                break L1;
              } else {
                field_S = 0;
                break L1;
              }
            }
            vg.field_I = null;
            rd.field_d = null;
            ob.field_a = null;
            b.field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "c.LA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        eg var5_ref = null;
        long var6 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                ((c) this).field_O = -50;
                break L1;
              }
            }
            L2: {
              if (null == ((c) this).field_p) {
                break L2;
              } else {
                if (param3 == 0) {
                  ((c) this).field_p.a(-74, param1, ((c) this).field_D, (qa) this, param0);
                  if (!(((c) this).field_p instanceof eg)) {
                    break L2;
                  } else {
                    L3: {
                      var5_ref = (eg) (Object) ((c) this).field_p;
                      if (((c) this).field_M == ((c) this).field_K) {
                        break L3;
                      } else {
                        var5_ref.a((qa) this, ((c) this).field_M, param0, ((c) this).field_K, -30298, param1);
                        break L3;
                      }
                    }
                    var6 = lj.a((byte) -27);
                    if ((var6 + -((c) this).field_Q) % 1000L >= 500L) {
                      break L2;
                    } else {
                      var5_ref.a(param0, 0, (qa) this, ((c) this).field_M, param1);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var5, "c.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void r(int param0) {
        try {
            ((c) this).field_M = 0;
            ((c) this).field_K = 0;
            ((c) this).field_i = "";
            ((c) this).i(-1);
            if (param0 != 32) {
                field_U = false;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "c.MA(" + param0 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ~((c) this).field_O) {
                break L1;
              } else {
                var3_int = ((c) this).field_O - ((c) this).field_i.length();
                if (var3_int < 0) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              L3: {
                if (((c) this).field_M != ((c) this).field_i.length()) {
                  break L3;
                } else {
                  ((c) this).field_i = ((c) this).field_i + param1;
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param1 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
              break L2;
            }
            ((c) this).field_M = ((c) this).field_M + param1.length();
            ((c) this).field_K = ((c) this).field_M;
            ((c) this).i(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("c.QA(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(((c) this).field_p instanceof eg)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((eg) (Object) ((c) this).field_p).a(kc.field_b, (qa) this, (byte) 97, param6, param0, ag.field_f);
                    stackOut_4_0 = this;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (-1 == var8_int) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = var8_int;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_8_1, -57);
                    var8_long = lj.a((byte) -93);
                    stackOut_8_0 = this;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var8_long - ((c) this).field_L >= 250L) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((c) this).field_R = stackIn_12_1 != 0;
                    if (((c) this).field_R) {
                      L5: {
                        ((c) this).field_K = this.j(127);
                        ((c) this).field_M = this.l(32);
                        if (((c) this).field_M <= 0) {
                          break L5;
                        } else {
                          if (32 == ((c) this).field_i.charAt(-1 + ((c) this).field_M)) {
                            ((c) this).field_M = ((c) this).field_M - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((c) this).field_N = ((c) this).field_M;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((c) this).field_L = var8_long;
                  stackOut_23_0 = 1;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                }
              }
            }
            stackOut_25_0 = 0;
            stackIn_26_0 = stackOut_25_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var8;
            stackOut_27_1 = new StringBuilder().append("c.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_26_0 != 0;
    }

    private final void n(int param0) {
        try {
            Exception var2 = null;
            RuntimeException var2_ref = null;
            String var2_ref2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == -1) {
                        break L2;
                      } else {
                        ((c) this).field_N = 63;
                        break L2;
                      }
                    }
                    var2_ref2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                    this.c(false);
                    this.a(param0 + 1, var2_ref2);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw pf.a((Throwable) (Object) var2_ref, "c.VA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    c(String param0, kd param1, int param2) {
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
        ((c) this).field_N = -1;
        ((c) this).field_R = false;
        ((c) this).field_L = 0L;
        try {
          L0: {
            ((c) this).field_p = nf.field_M.field_l;
            ((c) this).field_O = param2;
            ((c) this).a(true, (byte) -78, param0);
            ((c) this).field_T = true;
            ((c) this).field_Q = lj.a((byte) -19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("c.<init>(");
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        eg var2_ref = null;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (((c) this).field_T) {
              if (!(((c) this).field_p instanceof eg)) {
                return;
              } else {
                L1: {
                  var2_ref = (eg) (Object) ((c) this).field_p;
                  var3 = var2_ref.a((qa) this, (byte) -35);
                  var4 = var3.b((byte) 97);
                  if (param0 > 89) {
                    break L1;
                  } else {
                    boolean discarded$1 = ((c) this).a(11, 11, (qa) null, '*');
                    break L1;
                  }
                }
                var5 = var2_ref.b((qa) this, (byte) -67);
                var6 = var2_ref.a((byte) 127) >> -1183616383;
                if (~var4 <= ~(var5 + -var6)) {
                  L2: {
                    L3: {
                      var7 = ((c) this).field_r - -var3.c(-1, ((c) this).field_M);
                      if (var5 + -var6 >= var7) {
                        break L3;
                      } else {
                        ((c) this).field_r = ((c) this).field_r - (-var5 - -var6) - var7;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (~var7 > ~var6) {
                      ((c) this).field_r = ((c) this).field_r + (var6 - var7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    L5: {
                      if (((c) this).field_r <= 0) {
                        break L5;
                      } else {
                        ((c) this).field_r = 0;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (~((c) this).field_r <= ~(-var5 - -var6)) {
                      break L4;
                    } else {
                      ((c) this).field_r = -var5 + var6;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  ((c) this).field_r = 0;
                  ((c) this).field_n = 0;
                  return;
                }
              }
            } else {
              ((c) this).field_n = 0;
              ((c) this).field_r = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.KA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        if (param0 != -14) {
            return;
        }
        try {
            this.q(param0 ^ -97);
            this.c(false);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "c.SA(" + param0 + ')');
        }
    }

    private final int j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (0 != ((c) this).field_M) {
              L1: {
                var2_int = -1 + ((c) this).field_M;
                if (param0 > 79) {
                  break L1;
                } else {
                  ((c) this).r(-57);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (var2_int <= 0) {
                      break L4;
                    } else {
                      stackOut_8_0 = -33;
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (stackIn_9_0 == ~((c) this).field_i.charAt(var2_int - 1)) {
                          break L4;
                        } else {
                          var2_int--;
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_15_0 = var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = ((c) this).field_M;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.NA(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    final void a(boolean param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
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
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              if (param1 <= -39) {
                break L2;
              } else {
                ((c) this).i(125);
                break L2;
              }
            }
            L3: {
              ((c) this).field_i = param2;
              var4_int = param2.length();
              if (-1 == ((c) this).field_O) {
                break L3;
              } else {
                if (((c) this).field_O < var4_int) {
                  ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_O);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((c) this).field_i.length();
              ((c) this).field_K = dupTemp$3;
              ((c) this).field_M = dupTemp$3;
              if (!param0) {
                ((c) this).i(-1);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("c.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -27) {
                break L1;
              } else {
                int discarded$2 = this.j(-45);
                break L1;
              }
            }
            L2: {
              ((c) this).field_M = param0;
              if (!ei.field_H[81]) {
                ((c) this).field_K = ((c) this).field_M;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "c.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 88) {
              L1: {
                if (((c) this).field_s instanceof nk) {
                  ((nk) (Object) ((c) this).field_s).a(-31825, (c) this);
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
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.TA(" + param0 + ')');
        }
    }

    void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((c) this).field_s instanceof nk) {
                ((nk) (Object) ((c) this).field_s).b(param0 ^ -41, (c) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                field_U = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.DA(" + param0 + ')');
        }
    }

    private final String p(int param0) {
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
            if (param0 == 0) {
              L1: {
                if (((c) this).field_M > ((c) this).field_K) {
                  stackOut_6_0 = ((c) this).field_K;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((c) this).field_M;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var2_int = stackIn_7_0;
                if (~((c) this).field_M >= ~((c) this).field_K) {
                  stackOut_10_0 = ((c) this).field_K;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = ((c) this).field_M;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              var3 = stackIn_11_0;
              stackOut_11_0 = ((c) this).field_i.substring(var2_int, var3);
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
          throw pf.a((Throwable) (Object) var2, "c.HA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, param11, param10, param6);
              if (param1 > 66) {
                break L1;
              } else {
                field_P = 53L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("c.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        eg var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -93);
              if (param3 < -85) {
                break L1;
              } else {
                ((c) this).field_N = 68;
                break L1;
              }
            }
            L2: {
              this.m(127);
              if (((c) this).field_v == 1) {
                L3: {
                  if (((c) this).field_p instanceof eg) {
                    var5_ref = (eg) (Object) ((c) this).field_p;
                    var6 = var5_ref.a(kc.field_b, (qa) this, (byte) 80, param1, param0, ag.field_f);
                    if (var6 != -1) {
                      L4: {
                        if (!((c) this).field_R) {
                          break L4;
                        } else {
                          if (((c) this).field_N <= var6) {
                            break L4;
                          } else {
                            if (~((c) this).field_K > ~var6) {
                              var6 = ((c) this).field_N;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((c) this).field_M = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                ((c) this).field_Q = lj.a((byte) -81);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_121_0 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_96_0 = 0;
        Object stackOut_63_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_67_0 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        try {
          L0: {
            ((c) this).field_Q = lj.a((byte) -37);
            if (param0 == -2) {
              L1: {
                if (param3 == 60) {
                  break L1;
                } else {
                  if (62 == param3) {
                    break L1;
                  } else {
                    L2: {
                      if (param3 < 32) {
                        break L2;
                      } else {
                        if (126 < param3) {
                          break L2;
                        } else {
                          L3: {
                            if (~((c) this).field_K != ~((c) this).field_M) {
                              this.c(false);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (((c) this).field_O == -1) {
                                break L5;
                              } else {
                                if (~((c) this).field_i.length() > ~((c) this).field_O) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              L7: {
                                if (~((c) this).field_M <= ~((c) this).field_i.length()) {
                                  break L7;
                                } else {
                                  ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param3 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
                                  ((c) this).field_M = ((c) this).field_M + 1;
                                  ((c) this).field_K = ((c) this).field_M;
                                  if (!fleas.field_A) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              ((c) this).field_i = ((c) this).field_i + param3;
                              int dupTemp$1 = ((c) this).field_i.length();
                              ((c) this).field_M = dupTemp$1;
                              ((c) this).field_K = dupTemp$1;
                              break L6;
                            }
                            ((c) this).i(-1);
                            break L4;
                          }
                          stackOut_34_0 = 1;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0 != 0;
                        }
                      }
                    }
                    L8: {
                      if (85 == param1) {
                        if (~((c) this).field_M == ~((c) this).field_K) {
                          if (0 >= ((c) this).field_M) {
                            break L8;
                          } else {
                            ((c) this).field_K = -1 + ((c) this).field_M;
                            this.c(false);
                            stackOut_118_0 = 1;
                            stackIn_119_0 = stackOut_118_0;
                            return stackIn_119_0 != 0;
                          }
                        } else {
                          this.c(false);
                          stackOut_115_0 = 1;
                          stackIn_116_0 = stackOut_115_0;
                          return stackIn_116_0 != 0;
                        }
                      } else {
                        if (param1 == 101) {
                          if (~((c) this).field_M != ~((c) this).field_K) {
                            this.c(false);
                            stackOut_112_0 = 1;
                            stackIn_113_0 = stackOut_112_0;
                            return stackIn_113_0 != 0;
                          } else {
                            if (((c) this).field_M < ((c) this).field_i.length()) {
                              ((c) this).field_K = ((c) this).field_M - -1;
                              this.c(false);
                              stackOut_110_0 = 1;
                              stackIn_111_0 = stackOut_110_0;
                              return stackIn_111_0 != 0;
                            } else {
                              break L8;
                            }
                          }
                        } else {
                          if (param1 != 13) {
                            if (param1 != 96) {
                              if (param1 != 97) {
                                if (102 == param1) {
                                  this.a(0, -47);
                                  stackOut_102_0 = 1;
                                  stackIn_103_0 = stackOut_102_0;
                                  return stackIn_103_0 != 0;
                                } else {
                                  if (103 == param1) {
                                    this.a(((c) this).field_i.length(), -92);
                                    stackOut_100_0 = 1;
                                    stackIn_101_0 = stackOut_100_0;
                                    return stackIn_101_0 != 0;
                                  } else {
                                    if (param1 == 84) {
                                      this.d((byte) 115);
                                      stackOut_98_0 = 1;
                                      stackIn_99_0 = stackOut_98_0;
                                      return stackIn_99_0 != 0;
                                    } else {
                                      L9: {
                                        if (!ei.field_H[82]) {
                                          break L9;
                                        } else {
                                          if (65 != param1) {
                                            break L9;
                                          } else {
                                            this.k(-14);
                                            stackOut_82_0 = 1;
                                            stackIn_83_0 = stackOut_82_0;
                                            return stackIn_83_0 != 0;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (!ei.field_H[82]) {
                                          break L10;
                                        } else {
                                          if (param1 != 66) {
                                            break L10;
                                          } else {
                                            this.q(105);
                                            stackOut_88_0 = 1;
                                            stackIn_89_0 = stackOut_88_0;
                                            return stackIn_89_0 != 0;
                                          }
                                        }
                                      }
                                      if (!ei.field_H[82]) {
                                        break L8;
                                      } else {
                                        if (param1 == 67) {
                                          this.n(-1);
                                          stackOut_96_0 = 1;
                                          stackIn_97_0 = stackOut_96_0;
                                          return stackIn_97_0 != 0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (~((c) this).field_M > ~((c) this).field_i.length()) {
                                  L11: {
                                    stackOut_63_0 = this;
                                    stackIn_66_0 = stackOut_63_0;
                                    stackIn_64_0 = stackOut_63_0;
                                    if (!ei.field_H[82]) {
                                      stackOut_66_0 = this;
                                      stackOut_66_1 = ((c) this).field_M - -1;
                                      stackIn_67_0 = stackOut_66_0;
                                      stackIn_67_1 = stackOut_66_1;
                                      break L11;
                                    } else {
                                      stackOut_64_0 = this;
                                      stackOut_64_1 = this.l(32);
                                      stackIn_67_0 = stackOut_64_0;
                                      stackIn_67_1 = stackOut_64_1;
                                      break L11;
                                    }
                                  }
                                  this.a(stackIn_67_1, -72);
                                  stackOut_67_0 = 1;
                                  stackIn_68_0 = stackOut_67_0;
                                  return stackIn_68_0 != 0;
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              if (((c) this).field_M > 0) {
                                L12: {
                                  stackOut_51_0 = this;
                                  stackIn_54_0 = stackOut_51_0;
                                  stackIn_52_0 = stackOut_51_0;
                                  if (ei.field_H[82]) {
                                    stackOut_54_0 = this;
                                    stackOut_54_1 = this.j(param0 ^ -100);
                                    stackIn_55_0 = stackOut_54_0;
                                    stackIn_55_1 = stackOut_54_1;
                                    break L12;
                                  } else {
                                    stackOut_52_0 = this;
                                    stackOut_52_1 = ((c) this).field_M + -1;
                                    stackIn_55_0 = stackOut_52_0;
                                    stackIn_55_1 = stackOut_52_1;
                                    break L12;
                                  }
                                }
                                this.a(stackIn_55_1, -127);
                                stackOut_55_0 = 1;
                                stackIn_56_0 = stackOut_55_0;
                                return stackIn_56_0 != 0;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            ((c) this).r(32);
                            stackOut_43_0 = 1;
                            stackIn_44_0 = stackOut_43_0;
                            return stackIn_44_0 != 0;
                          }
                        }
                      }
                    }
                    stackOut_120_0 = 0;
                    stackIn_121_0 = stackOut_120_0;
                    break L0;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_122_0 = (RuntimeException) var5;
            stackOut_122_1 = new StringBuilder().append("c.N(").append(param0).append(',').append(param1).append(',');
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param2 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L13;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L13;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + ',' + param3 + ')');
        }
        return stackIn_121_0 != 0;
    }

    private final int l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        char stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        char stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = ((c) this).field_i.length();
            if (~var2_int == ~((c) this).field_M) {
              stackOut_4_0 = ((c) this).field_M;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 == 32) {
                var3 = ((c) this).field_M - -1;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var3 <= ~var2_int) {
                        break L3;
                      } else {
                        stackOut_11_0 = ((c) this).field_i.charAt(var3 + -1);
                        stackIn_19_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (stackIn_12_0 == 32) {
                            break L3;
                          } else {
                            var3++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var3;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = -60;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "c.UA(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
    }
}
