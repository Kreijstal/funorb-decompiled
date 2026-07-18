/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wa extends tg {
    private int field_N;
    private long field_O;
    private boolean field_T;
    private long field_Q;
    private int field_R;
    private int field_J;
    private boolean field_P;
    static Random field_M;
    private int field_G;
    static int field_F;
    static String field_H;
    static int field_K;
    static String field_S;
    static String field_L;
    static km field_I;

    final void a(String param0, int param1, boolean param2) {
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
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((wa) this).field_n = param0;
              var4_int = param0.length();
              if (((wa) this).field_N == -1) {
                break L2;
              } else {
                if (var4_int <= ((wa) this).field_N) {
                  break L2;
                } else {
                  ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_N);
                  break L2;
                }
              }
            }
            L3: {
              if (param1 == 81) {
                break L3;
              } else {
                ((wa) this).field_G = -11;
                break L3;
              }
            }
            int dupTemp$2 = ((wa) this).field_n.length();
            ((wa) this).field_R = dupTemp$2;
            ((wa) this).field_J = dupTemp$2;
            if (!param2) {
              ((wa) this).e(param1 ^ -29445);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("wa.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0) {
        String var2 = this.i(-15816);
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.i(-15816)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void d(byte param0) {
        ie var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (((wa) this).field_T) {
          if (!(((wa) this).field_w instanceof gm)) {
            return;
          } else {
            var9 = (gm) (Object) ((wa) this).field_w;
            var3 = var9.a((fi) this, (byte) -124);
            var4 = var3.a(3209);
            var5 = var9.b((fi) this, true);
            var6 = var9.a(0) >> 1;
            if (var5 - var6 <= var4) {
              var7 = ((wa) this).field_k - -var3.a(((wa) this).field_J, -1);
              if (-var6 + var5 >= var7) {
                if (var6 > var7) {
                  ((wa) this).field_k = -var7 + (var6 + ((wa) this).field_k);
                  if (((wa) this).field_k <= 0) {
                    if (-var5 + var6 > ((wa) this).field_k) {
                      ((wa) this).field_k = -var5 + var6;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((wa) this).field_k = 0;
                    return;
                  }
                } else {
                  if (((wa) this).field_k <= 0) {
                    if (-var5 + var6 <= ((wa) this).field_k) {
                      return;
                    } else {
                      ((wa) this).field_k = -var5 + var6;
                      return;
                    }
                  } else {
                    ((wa) this).field_k = 0;
                    return;
                  }
                }
              } else {
                ((wa) this).field_k = -var7 + (var5 - var6 + ((wa) this).field_k);
                if (((wa) this).field_k <= 0) {
                  if (-var5 + var6 <= ((wa) this).field_k) {
                    return;
                  } else {
                    ((wa) this).field_k = -var5 + var6;
                    return;
                  }
                } else {
                  ((wa) this).field_k = 0;
                  return;
                }
              }
            } else {
              ((wa) this).field_k = 0;
              ((wa) this).field_q = 0;
              return;
            }
          }
        } else {
          ((wa) this).field_q = 0;
          ((wa) this).field_k = 0;
          return;
        }
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.k(0);
                this.a(var2, (byte) -124);
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

    void a(int param0, int param1, fi param2, int param3) {
        gm var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 127, param2, param3);
              this.d((byte) 103);
              if (((wa) this).field_i != 1) {
                break L1;
              } else {
                L2: {
                  if (!(((wa) this).field_w instanceof gm)) {
                    break L2;
                  } else {
                    var5 = (gm) (Object) ((wa) this).field_w;
                    var6 = var5.a(param0, param3, hk.field_Jb, (fi) this, true, nl.field_u);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((wa) this).field_P) {
                          break L3;
                        } else {
                          if (((wa) this).field_G <= var6) {
                            break L3;
                          } else {
                            if (((wa) this).field_R < var6) {
                              var6 = ((wa) this).field_G;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((wa) this).field_J = var6;
                      break L2;
                    }
                  }
                }
                ((wa) this).field_Q = hc.a(-9986);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(114).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 > -101) {
          L0: {
            field_L = null;
            ((wa) this).field_J = param0;
            if (!dc.field_Y[81]) {
              ((wa) this).field_R = ((wa) this).field_J;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((wa) this).field_J = param0;
            if (!dc.field_Y[81]) {
              ((wa) this).field_R = ((wa) this).field_J;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (((wa) this).field_N != -1) {
                var3_int = ((wa) this).field_N - ((wa) this).field_n.length();
                if (var3_int >= 0) {
                  return;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = 0;
              if (((wa) this).field_J == ((wa) this).field_n.length()) {
                ((wa) this).field_n = ((wa) this).field_n + param0;
                break L2;
              } else {
                ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_J) + param0 + ((wa) this).field_n.substring(((wa) this).field_J, ((wa) this).field_n.length());
                break L2;
              }
            }
            ((wa) this).field_J = ((wa) this).field_J + param0.length();
            ((wa) this).field_R = ((wa) this).field_J;
            ((wa) this).e(-29526);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("wa.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -124 + ')');
        }
    }

    private final int c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (((wa) this).field_J != 0) {
          var2 = -108 / ((-10 - param0) / 58);
          var3 = -1 + ((wa) this).field_J;
          L0: while (true) {
            if (var3 > 0) {
              if (((wa) this).field_n.charAt(-1 + var3) != 32) {
                var3--;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((wa) this).field_J;
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
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
                if (!(((wa) this).field_w instanceof gm)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((gm) (Object) ((wa) this).field_w).a(param3, param5, hk.field_Jb, (fi) this, true, nl.field_u);
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (-1 != var8_int) {
                      stackOut_4_0 = this;
                      stackOut_4_1 = var8_int;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = 0;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, (byte) -119);
                    var8_long = hc.a(-9986);
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (250L <= var8_long - ((wa) this).field_O) {
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
                    ((wa) this).field_P = stackIn_8_1 != 0;
                    if (((wa) this).field_P) {
                      L5: {
                        ((wa) this).field_R = this.c((byte) -117);
                        ((wa) this).field_J = this.e((byte) -80);
                        if (((wa) this).field_J <= 0) {
                          break L5;
                        } else {
                          if (((wa) this).field_n.charAt(((wa) this).field_J + -1) == 32) {
                            ((wa) this).field_J = ((wa) this).field_J - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((wa) this).field_G = ((wa) this).field_J;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((wa) this).field_O = var8_long;
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
            stackOut_19_1 = new StringBuilder().append("wa.NA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((wa) this).field_R != ((wa) this).field_J) {
            var2 = ((wa) this).field_J > ((wa) this).field_R ? ((wa) this).field_R : ((wa) this).field_J;
            var3 = ((wa) this).field_J <= ((wa) this).field_R ? ((wa) this).field_R : ((wa) this).field_J;
            ((wa) this).field_R = var2;
            ((wa) this).field_J = var2;
            ((wa) this).field_n = ((wa) this).field_n.substring(0, var2) + ((wa) this).field_n.substring(var3, ((wa) this).field_n.length());
            ((wa) this).e(-29526);
        }
    }

    private final String i(int param0) {
        int var2 = ((wa) this).field_J > ((wa) this).field_R ? ((wa) this).field_R : ((wa) this).field_J;
        int var3 = ((wa) this).field_J > ((wa) this).field_R ? ((wa) this).field_J : ((wa) this).field_R;
        return ((wa) this).field_n.substring(var2, var3);
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_73_0 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_62_0 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        try {
          L0: {
            ((wa) this).field_Q = hc.a(-9986);
            if (param1 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 != 62) {
                L1: {
                  if (32 > param1) {
                    break L1;
                  } else {
                    if (param1 <= 126) {
                      L2: {
                        if (~((wa) this).field_R == ~((wa) this).field_J) {
                          break L2;
                        } else {
                          this.k(0);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((wa) this).field_N == -1) {
                            break L4;
                          } else {
                            if (((wa) this).field_n.length() >= ((wa) this).field_N) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (~((wa) this).field_J > ~((wa) this).field_n.length()) {
                            ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_J) + param1 + ((wa) this).field_n.substring(((wa) this).field_J, ((wa) this).field_n.length());
                            ((wa) this).field_J = ((wa) this).field_J + 1;
                            ((wa) this).field_R = ((wa) this).field_J;
                            break L5;
                          } else {
                            ((wa) this).field_n = ((wa) this).field_n + param1;
                            int dupTemp$1 = ((wa) this).field_n.length();
                            ((wa) this).field_J = dupTemp$1;
                            ((wa) this).field_R = dupTemp$1;
                            break L5;
                          }
                        }
                        ((wa) this).e(-29526);
                        break L3;
                      }
                      stackOut_73_0 = 1;
                      stackIn_74_0 = stackOut_73_0;
                      return stackIn_74_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (param2 != 85) {
                    if (param2 != 101) {
                      if (param2 != 13) {
                        if (param2 == 96) {
                          if (((wa) this).field_J > 0) {
                            L7: {
                              stackOut_59_0 = this;
                              stackIn_61_0 = stackOut_59_0;
                              stackIn_60_0 = stackOut_59_0;
                              if (dc.field_Y[82]) {
                                stackOut_61_0 = this;
                                stackOut_61_1 = this.c((byte) 97);
                                stackIn_62_0 = stackOut_61_0;
                                stackIn_62_1 = stackOut_61_1;
                                break L7;
                              } else {
                                stackOut_60_0 = this;
                                stackOut_60_1 = -1 + ((wa) this).field_J;
                                stackIn_62_0 = stackOut_60_0;
                                stackIn_62_1 = stackOut_60_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_62_1, (byte) -120);
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            return stackIn_63_0 != 0;
                          } else {
                            break L6;
                          }
                        } else {
                          if (param2 == 97) {
                            if (~((wa) this).field_J > ~((wa) this).field_n.length()) {
                              L8: {
                                stackOut_52_0 = this;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                if (!dc.field_Y[82]) {
                                  stackOut_54_0 = this;
                                  stackOut_54_1 = 1 + ((wa) this).field_J;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  break L8;
                                } else {
                                  stackOut_53_0 = this;
                                  stackOut_53_1 = this.e((byte) 47);
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_55_1, (byte) -125);
                              stackOut_55_0 = 1;
                              stackIn_56_0 = stackOut_55_0;
                              return stackIn_56_0 != 0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param2 != 102) {
                              if (param2 == 103) {
                                this.a(((wa) this).field_n.length(), (byte) -112);
                                stackOut_48_0 = 1;
                                stackIn_49_0 = stackOut_48_0;
                                return stackIn_49_0 != 0;
                              } else {
                                if (param2 == 84) {
                                  this.j(0);
                                  stackOut_46_0 = 1;
                                  stackIn_47_0 = stackOut_46_0;
                                  return stackIn_47_0 != 0;
                                } else {
                                  L9: {
                                    if (!dc.field_Y[82]) {
                                      break L9;
                                    } else {
                                      if (param2 == 65) {
                                        this.g((byte) 67);
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!dc.field_Y[82]) {
                                      break L10;
                                    } else {
                                      if (param2 != 66) {
                                        break L10;
                                      } else {
                                        this.f(-27135);
                                        stackOut_37_0 = 1;
                                        stackIn_38_0 = stackOut_37_0;
                                        return stackIn_38_0 != 0;
                                      }
                                    }
                                  }
                                  if (!dc.field_Y[82]) {
                                    break L6;
                                  } else {
                                    if (param2 == 67) {
                                      this.h(500);
                                      stackOut_42_0 = 1;
                                      stackIn_43_0 = stackOut_42_0;
                                      return stackIn_43_0 != 0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.a(0, (byte) -122);
                              stackOut_28_0 = 1;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0 != 0;
                            }
                          }
                        }
                      } else {
                        ((wa) this).g(0);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      }
                    } else {
                      if (~((wa) this).field_J != ~((wa) this).field_R) {
                        this.k(0);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      } else {
                        if (((wa) this).field_J >= ((wa) this).field_n.length()) {
                          break L6;
                        } else {
                          ((wa) this).field_R = 1 + ((wa) this).field_J;
                          this.k(0);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                  } else {
                    if (((wa) this).field_J == ((wa) this).field_R) {
                      if (((wa) this).field_J <= 0) {
                        break L6;
                      } else {
                        ((wa) this).field_R = ((wa) this).field_J + -1;
                        this.k(0);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    } else {
                      this.k(0);
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
                var5_int = -52 / ((param3 - -75) / 36);
                stackOut_75_0 = 0;
                stackIn_76_0 = stackOut_75_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("wa.AA(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L11;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L11;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_76_0 != 0;
    }

    private final void j(int param0) {
        if (param0 != 0) {
          L0: {
            ((wa) this).field_N = -42;
            if (((wa) this).field_o instanceof bo) {
              ((bo) (Object) ((wa) this).field_o).a(false, (wa) this);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((wa) this).field_o instanceof bo) {
              ((bo) (Object) ((wa) this).field_o).a(false, (wa) this);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void f(byte param0) {
        field_M = null;
        field_L = null;
        field_S = null;
        field_I = null;
        field_H = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        long var6 = 0L;
        gm var8 = null;
        if (param0 == 37) {
          if (((wa) this).field_w != null) {
            if (param3 == 0) {
              ((wa) this).field_w.a(param1, (fi) this, ((wa) this).field_C, param2, -23294);
              if (((wa) this).field_w instanceof gm) {
                L0: {
                  var8 = (gm) (Object) ((wa) this).field_w;
                  if (((wa) this).field_J != ((wa) this).field_R) {
                    var8.a((byte) -49, ((wa) this).field_J, param1, (fi) this, ((wa) this).field_R, param2);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = hc.a(-9986);
                if ((-((wa) this).field_Q + var6) % 1000L >= 500L) {
                  return;
                } else {
                  var8.a(param1, ((wa) this).field_J, true, (fi) this, param2);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        this.f(-27135);
        this.k(0);
    }

    final static mg[] a(byte param0, int param1, int param2) {
        int var3 = -45 / ((param0 - -20) / 33);
        return ak.a(param1, param2, 1, (byte) 121);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = ((wa) this).field_n.length();
        if (((wa) this).field_J != var2) {
          var3 = 1 + ((wa) this).field_J;
          var4 = -2 % ((-8 - param0) / 53);
          L0: while (true) {
            if (var2 > var3) {
              if (32 != ((wa) this).field_n.charAt(-1 + var3)) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((wa) this).field_J;
        }
    }

    wa(String param0, cd param1, int param2) {
        super(param0, param1);
        ((wa) this).field_O = 0L;
        ((wa) this).field_P = false;
        ((wa) this).field_G = -1;
        try {
            ((wa) this).field_w = vi.field_g.field_h;
            ((wa) this).field_N = param2;
            ((wa) this).a(param0, 81, true);
            ((wa) this).field_T = true;
            ((wa) this).field_Q = hc.a(-9986);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void g(int param0) {
        ((wa) this).field_J = 0;
        ((wa) this).field_n = "";
        ((wa) this).field_R = param0;
        ((wa) this).e(-29526);
    }

    void e(int param0) {
        if (!(((wa) this).field_o instanceof bo)) {
          if (param0 != -29526) {
            this.j(117);
            return;
          } else {
            return;
          }
        } else {
          ((bo) (Object) ((wa) this).field_o).a((wa) this, 13);
          if (param0 == -29526) {
            return;
          } else {
            this.j(117);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new Random();
        field_F = 0;
        field_L = "Connection timed out. Please try using a different server.";
        field_S = "<%0> wants to draw.";
        field_K = 0;
        field_H = "Names cannot start or end with space or underscore";
    }
}
