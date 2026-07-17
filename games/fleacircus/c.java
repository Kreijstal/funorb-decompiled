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
        String var2 = this.p(0);
        if (param0 <= 82) {
            ((c) this).field_O = -105;
        }
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(0)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((c) this).field_K == ((c) this).field_M)) {
            var2 = ((c) this).field_M <= ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
            var3 = ((c) this).field_M > ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
            ((c) this).field_M = var2;
            ((c) this).field_K = var2;
            ((c) this).field_i = ((c) this).field_i.substring(0, var2) + ((c) this).field_i.substring(var3, ((c) this).field_i.length());
            ((c) this).i(-1);
        }
    }

    final static void o(int param0) {
        ij.field_H = null;
        of.field_d = null;
        vg.field_I = null;
        rd.field_d = null;
        ob.field_a = null;
        b.field_b = null;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        eg var8 = null;
        long var6 = 0L;
        if (!param2) {
            ((c) this).field_O = -50;
        }
        if (null != ((c) this).field_p) {
            if (!(param3 != 0)) {
                ((c) this).field_p.a(-74, param1, ((c) this).field_D, (qa) this, param0);
                if (((c) this).field_p instanceof eg) {
                    var8 = (eg) (Object) ((c) this).field_p;
                    if (((c) this).field_M != ((c) this).field_K) {
                        var8.a((qa) this, ((c) this).field_M, param0, ((c) this).field_K, -30298, param1);
                    }
                    var6 = lj.a((byte) -27);
                    if ((var6 + -((c) this).field_Q) % 1000L < 500L) {
                        var8.a(param0, 0, (qa) this, ((c) this).field_M, param1);
                    }
                }
            }
        }
    }

    final void r(int param0) {
        ((c) this).field_M = 0;
        ((c) this).field_K = 0;
        ((c) this).field_i = "";
        ((c) this).i(-1);
        if (param0 != 32) {
            field_U = false;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (((c) this).field_M != ((c) this).field_i.length()) {
                ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param1 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
                break L2;
              } else {
                ((c) this).field_i = ((c) this).field_i + param1;
                break L2;
              }
            }
            ((c) this).field_M = ((c) this).field_M + param1.length();
            ((c) this).field_K = ((c) this).field_M;
            ((c) this).i(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("c.QA(").append(param0).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (-1 == var8_int) {
                      stackOut_4_0 = this;
                      stackOut_4_1 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = var8_int;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, -57);
                    var8_long = lj.a((byte) -93);
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var8_long - ((c) this).field_L >= 250L) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((c) this).field_R = stackIn_8_1 != 0;
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
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("c.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_18_0 != 0;
    }

    private final void n(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.c(false);
                this.a(0, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    c(String param0, kd param1, int param2) {
        super(param0, param1);
        ((c) this).field_N = -1;
        ((c) this).field_R = false;
        ((c) this).field_L = 0L;
        try {
            ((c) this).field_p = nf.field_M.field_l;
            ((c) this).field_O = param2;
            ((c) this).a(true, (byte) -78, param0);
            ((c) this).field_T = true;
            ((c) this).field_Q = lj.a((byte) -19);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "c.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void m(int param0) {
        int var8 = fleas.field_A ? 1 : 0;
        if (!((c) this).field_T) {
            ((c) this).field_n = 0;
            ((c) this).field_r = 0;
            return;
        }
        if (!(((c) this).field_p instanceof eg)) {
            return;
        }
        eg var10 = (eg) (Object) ((c) this).field_p;
        ne var3 = var10.a((qa) this, (byte) -35);
        int var4 = var3.b((byte) 97);
        int var5 = var10.b((qa) this, (byte) -67);
        int var6 = var10.a((byte) 127) >> 1;
        if (var4 < var5 + -var6) {
            ((c) this).field_r = 0;
            ((c) this).field_n = 0;
            return;
        }
        int var7 = ((c) this).field_r - -var3.c(-1, ((c) this).field_M);
        if (var5 + -var6 < var7) {
            ((c) this).field_r = ((c) this).field_r - (-var5 - -var6) - var7;
        } else {
            if (!(var7 >= var6)) {
                ((c) this).field_r = ((c) this).field_r + (var6 - var7);
            }
        }
        if (((c) this).field_r > 0) {
            ((c) this).field_r = 0;
        } else {
            if (((c) this).field_r < -var5 - -var6) {
                ((c) this).field_r = -var5 + var6;
            }
        }
    }

    private final void k(int param0) {
        this.q(109);
        this.c(false);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (0 != ((c) this).field_M) {
          L0: {
            var2 = -1 + ((c) this).field_M;
            if (param0 > 79) {
              break L0;
            } else {
              ((c) this).r(-57);
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (((c) this).field_i.charAt(var2 - 1) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return ((c) this).field_M;
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("c.PA(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        if (param1 > -27) {
            int discarded$0 = this.j(-45);
        }
        ((c) this).field_M = param0;
        if (!(ei.field_H[81])) {
            ((c) this).field_K = ((c) this).field_M;
        }
    }

    private final void d(byte param0) {
        if (!(!(((c) this).field_s instanceof nk))) {
            ((nk) (Object) ((c) this).field_s).a(-31825, (c) this);
        }
    }

    void i(int param0) {
        if (!(!(((c) this).field_s instanceof nk))) {
            ((nk) (Object) ((c) this).field_s).b(param0 ^ -41, (c) this);
        }
        if (param0 != -1) {
            field_U = true;
        }
    }

    private final String p(int param0) {
        int var2 = ((c) this).field_M <= ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
        int var3 = ((c) this).field_M > ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
        return ((c) this).field_i.substring(var2, var3);
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
          L0: {
            L1: {
              ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, 8, param10, param6);
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
            stackOut_3_1 = new StringBuilder().append("c.IA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param7 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + 8 + 41);
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        eg var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -93);
              this.m(127);
              if (((c) this).field_v == 1) {
                L2: {
                  if (((c) this).field_p instanceof eg) {
                    var7 = (eg) (Object) ((c) this).field_p;
                    var6 = var7.a(kc.field_b, (qa) this, (byte) 80, param1, param0, ag.field_f);
                    if (var6 != -1) {
                      L3: {
                        if (!((c) this).field_R) {
                          break L3;
                        } else {
                          if (((c) this).field_N <= var6) {
                            break L3;
                          } else {
                            if (((c) this).field_K < var6) {
                              var6 = ((c) this).field_N;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((c) this).field_M = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((c) this).field_Q = lj.a((byte) -81);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("c.I(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -93 + 41);
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_56_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
                            if (((c) this).field_O == -1) {
                              break L4;
                            } else {
                              if (~((c) this).field_i.length() > ~((c) this).field_O) {
                                break L4;
                              } else {
                                return true;
                              }
                            }
                          }
                          L5: {
                            if (~((c) this).field_M <= ~((c) this).field_i.length()) {
                              ((c) this).field_i = ((c) this).field_i + param3;
                              int dupTemp$1 = ((c) this).field_i.length();
                              ((c) this).field_M = dupTemp$1;
                              ((c) this).field_K = dupTemp$1;
                              break L5;
                            } else {
                              ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param3 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
                              ((c) this).field_M = ((c) this).field_M + 1;
                              ((c) this).field_K = ((c) this).field_M;
                              break L5;
                            }
                          }
                          ((c) this).i(-1);
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        }
                      }
                    }
                    L6: {
                      if (85 == param1) {
                        if (~((c) this).field_M == ~((c) this).field_K) {
                          if (0 >= ((c) this).field_M) {
                            break L6;
                          } else {
                            ((c) this).field_K = -1 + ((c) this).field_M;
                            this.c(false);
                            stackOut_75_0 = 1;
                            stackIn_76_0 = stackOut_75_0;
                            return stackIn_76_0 != 0;
                          }
                        } else {
                          this.c(false);
                          stackOut_72_0 = 1;
                          stackIn_73_0 = stackOut_72_0;
                          return stackIn_73_0 != 0;
                        }
                      } else {
                        if (param1 == 101) {
                          if (~((c) this).field_M != ~((c) this).field_K) {
                            this.c(false);
                            stackOut_69_0 = 1;
                            stackIn_70_0 = stackOut_69_0;
                            return stackIn_70_0 != 0;
                          } else {
                            if (((c) this).field_M < ((c) this).field_i.length()) {
                              ((c) this).field_K = ((c) this).field_M - -1;
                              this.c(false);
                              stackOut_67_0 = 1;
                              stackIn_68_0 = stackOut_67_0;
                              return stackIn_68_0 != 0;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          if (param1 != 13) {
                            if (param1 != 96) {
                              if (param1 != 97) {
                                if (102 == param1) {
                                  this.a(0, -47);
                                  stackOut_62_0 = 1;
                                  stackIn_63_0 = stackOut_62_0;
                                  return stackIn_63_0 != 0;
                                } else {
                                  if (103 == param1) {
                                    this.a(((c) this).field_i.length(), -92);
                                    stackOut_60_0 = 1;
                                    stackIn_61_0 = stackOut_60_0;
                                    return stackIn_61_0 != 0;
                                  } else {
                                    if (param1 == 84) {
                                      this.d((byte) 115);
                                      stackOut_58_0 = 1;
                                      stackIn_59_0 = stackOut_58_0;
                                      return stackIn_59_0 != 0;
                                    } else {
                                      L7: {
                                        if (!ei.field_H[82]) {
                                          break L7;
                                        } else {
                                          if (65 != param1) {
                                            break L7;
                                          } else {
                                            this.k(-14);
                                            stackOut_47_0 = 1;
                                            stackIn_48_0 = stackOut_47_0;
                                            return stackIn_48_0 != 0;
                                          }
                                        }
                                      }
                                      L8: {
                                        if (!ei.field_H[82]) {
                                          break L8;
                                        } else {
                                          if (param1 != 66) {
                                            break L8;
                                          } else {
                                            this.q(105);
                                            stackOut_51_0 = 1;
                                            stackIn_52_0 = stackOut_51_0;
                                            return stackIn_52_0 != 0;
                                          }
                                        }
                                      }
                                      if (!ei.field_H[82]) {
                                        break L6;
                                      } else {
                                        if (param1 == 67) {
                                          this.n(-1);
                                          stackOut_56_0 = 1;
                                          stackIn_57_0 = stackOut_56_0;
                                          return stackIn_57_0 != 0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (~((c) this).field_M > ~((c) this).field_i.length()) {
                                  L9: {
                                    stackOut_37_0 = this;
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_38_0 = stackOut_37_0;
                                    if (!ei.field_H[82]) {
                                      stackOut_39_0 = this;
                                      stackOut_39_1 = ((c) this).field_M - -1;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      break L9;
                                    } else {
                                      stackOut_38_0 = this;
                                      stackOut_38_1 = this.l(32);
                                      stackIn_40_0 = stackOut_38_0;
                                      stackIn_40_1 = stackOut_38_1;
                                      break L9;
                                    }
                                  }
                                  this.a(stackIn_40_1, -72);
                                  stackOut_40_0 = 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0 != 0;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              if (((c) this).field_M > 0) {
                                L10: {
                                  stackOut_29_0 = this;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_30_0 = stackOut_29_0;
                                  if (ei.field_H[82]) {
                                    stackOut_31_0 = this;
                                    stackOut_31_1 = this.j(param0 ^ -100);
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    break L10;
                                  } else {
                                    stackOut_30_0 = this;
                                    stackOut_30_1 = ((c) this).field_M + -1;
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_32_1, -127);
                                stackOut_32_0 = 1;
                                stackIn_33_0 = stackOut_32_0;
                                return stackIn_33_0 != 0;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            ((c) this).r(32);
                            stackOut_24_0 = 1;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0 != 0;
                          }
                        }
                      }
                    }
                    stackOut_77_0 = 0;
                    stackIn_78_0 = stackOut_77_0;
                    break L0;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5;
            stackOut_79_1 = new StringBuilder().append("c.N(").append(param0).append(44).append(param1).append(44);
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
              break L11;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L11;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param3 + 41);
        }
        return stackIn_78_0 != 0;
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = ((c) this).field_i.length();
        if (var2 == ((c) this).field_M) {
          return ((c) this).field_M;
        } else {
          var3 = ((c) this).field_M - -1;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (((c) this).field_i.charAt(var3 + -1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
    }
}
