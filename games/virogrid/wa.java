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
        int var4 = 0;
        L0: {
          if (param0 == null) {
            param0 = "";
            break L0;
          } else {
            break L0;
          }
        }
        ((wa) this).field_n = param0;
        var4 = param0.length();
        if ((((wa) this).field_N ^ -1) != 0) {
          if (var4 > ((wa) this).field_N) {
            ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_N);
            if (param1 != 81) {
              L1: {
                ((wa) this).field_G = -11;
                ((wa) this).field_R = ((wa) this).field_n.length();
                ((wa) this).field_J = ((wa) this).field_n.length();
                if (!param2) {
                  ((wa) this).e(param1 ^ -29445);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                ((wa) this).field_R = ((wa) this).field_n.length();
                ((wa) this).field_J = ((wa) this).field_n.length();
                if (!param2) {
                  ((wa) this).e(param1 ^ -29445);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            if (param1 != 81) {
              L3: {
                ((wa) this).field_G = -11;
                ((wa) this).field_R = ((wa) this).field_n.length();
                ((wa) this).field_J = ((wa) this).field_n.length();
                if (!param2) {
                  ((wa) this).e(param1 ^ -29445);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                ((wa) this).field_R = ((wa) this).field_n.length();
                ((wa) this).field_J = ((wa) this).field_n.length();
                if (!param2) {
                  ((wa) this).e(param1 ^ -29445);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          }
        } else {
          if (param1 != 81) {
            L5: {
              ((wa) this).field_G = -11;
              ((wa) this).field_R = ((wa) this).field_n.length();
              ((wa) this).field_J = ((wa) this).field_n.length();
              if (!param2) {
                ((wa) this).e(param1 ^ -29445);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              ((wa) this).field_R = ((wa) this).field_n.length();
              ((wa) this).field_J = ((wa) this).field_n.length();
              if (!param2) {
                ((wa) this).e(param1 ^ -29445);
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        }
    }

    private final void f(int param0) {
        try {
            String var2 = null;
            Object var3 = null;
            L0: {
              var2 = this.i(-15816);
              if (0 < var2.length()) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.i(-15816)), (java.awt.datatransfer.ClipboardOwner) null);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 != -27135) {
              var3 = null;
              this.a((String) null, (byte) 114);
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

    private final void d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        gm var11 = null;
        ie var12 = null;
        gm var13 = null;
        ie var14 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (((wa) this).field_T) {
          if (!(((wa) this).field_w instanceof gm)) {
            return;
          } else {
            if (param0 > 63) {
              var13 = (gm) (Object) ((wa) this).field_w;
              var14 = var13.a((fi) this, (byte) -124);
              var4 = var14.a(3209);
              var5 = var13.b((fi) this, true);
              var6 = var13.a(0) >> -1244770591;
              if (var5 - var6 <= var4) {
                var7 = ((wa) this).field_k - -var14.a(((wa) this).field_J, -1);
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
            } else {
              var9 = null;
              boolean discarded$1 = ((wa) this).a((fi) null, '*', 68, -11);
              var11 = (gm) (Object) ((wa) this).field_w;
              var12 = var11.a((fi) this, (byte) -124);
              var4 = var12.a(3209);
              var5 = var11.b((fi) this, true);
              var6 = var11.a(0) >> -1244770591;
              if (var5 - var6 <= var4) {
                L0: {
                  var7 = ((wa) this).field_k - -var12.a(((wa) this).field_J, -1);
                  if (-var6 + var5 >= var7) {
                    if (var6 > var7) {
                      ((wa) this).field_k = -var7 + (var6 + ((wa) this).field_k);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((wa) this).field_k = -var7 + (var5 - var6 + ((wa) this).field_k);
                    break L0;
                  }
                }
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
              } else {
                ((wa) this).field_k = 0;
                ((wa) this).field_q = 0;
                return;
              }
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
                if (param0 == 500) {
                  break L0;
                } else {
                  this.j(11);
                  break L0;
                }
              }
              this.a(var2, (byte) -124);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        int var6 = 0;
        gm var7 = null;
        L0: {
          super.a(param0, 127, param2, param3);
          this.d((byte) 103);
          if (((wa) this).field_i != 1) {
            break L0;
          } else {
            if (((wa) this).field_w instanceof gm) {
              var7 = (gm) (Object) ((wa) this).field_w;
              var6 = var7.a(param0, param3, hk.field_Jb, (fi) this, true, nl.field_u);
              if ((var6 ^ -1) != 0) {
                if (((wa) this).field_P) {
                  if (((wa) this).field_G > var6) {
                    if (((wa) this).field_R < var6) {
                      var6 = ((wa) this).field_G;
                      ((wa) this).field_J = var6;
                      ((wa) this).field_Q = hc.a(-9986);
                      break L0;
                    } else {
                      ((wa) this).field_J = var6;
                      ((wa) this).field_Q = hc.a(-9986);
                      if (param1 <= 113) {
                        ((wa) this).field_T = false;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((wa) this).field_J = var6;
                    ((wa) this).field_Q = hc.a(-9986);
                    if (param1 <= 113) {
                      ((wa) this).field_T = false;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  ((wa) this).field_J = var6;
                  ((wa) this).field_Q = hc.a(-9986);
                  if (param1 <= 113) {
                    ((wa) this).field_T = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((wa) this).field_Q = hc.a(-9986);
                if (param1 <= 113) {
                  ((wa) this).field_T = false;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((wa) this).field_Q = hc.a(-9986);
              if (param1 <= 113) {
                ((wa) this).field_T = false;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1 <= 113) {
          ((wa) this).field_T = false;
          return;
        } else {
          return;
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
        int var3 = 0;
        L0: {
          if ((((wa) this).field_N ^ -1) != 0) {
            var3 = ((wa) this).field_N - ((wa) this).field_n.length();
            if ((var3 ^ -1) <= -1) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = -96 % ((52 - param1) / 49);
        if (((wa) this).field_J != ((wa) this).field_n.length()) {
          ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_J) + param0 + ((wa) this).field_n.substring(((wa) this).field_J, ((wa) this).field_n.length());
          ((wa) this).field_J = ((wa) this).field_J + param0.length();
          ((wa) this).field_R = ((wa) this).field_J;
          ((wa) this).e(-29526);
          return;
        } else {
          ((wa) this).field_n = ((wa) this).field_n + param0;
          ((wa) this).field_J = ((wa) this).field_J + param0.length();
          ((wa) this).field_R = ((wa) this).field_J;
          ((wa) this).e(-29526);
          return;
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
            if (-1 > var3) {
              if (-33 != ((wa) this).field_n.charAt(-1 + var3)) {
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
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((wa) this).field_w instanceof gm) {
            L0: {
              var8_int = ((gm) (Object) ((wa) this).field_w).a(param3, param5, hk.field_Jb, (fi) this, true, nl.field_u);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-1 != var8_int) {
                stackOut_6_0 = this;
                stackOut_6_1 = var8_int;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1, (byte) -119);
              var8 = hc.a(-9986);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (250L <= var8 - ((wa) this).field_O) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((wa) this).field_P = stackIn_10_1 != 0;
            if (((wa) this).field_P) {
              ((wa) this).field_R = this.c((byte) -117);
              ((wa) this).field_J = this.e((byte) -80);
              if ((((wa) this).field_J ^ -1) < -1) {
                if (((wa) this).field_n.charAt(((wa) this).field_J + -1) != 32) {
                  ((wa) this).field_G = ((wa) this).field_J;
                  ((wa) this).field_O = var8;
                  return true;
                } else {
                  ((wa) this).field_J = ((wa) this).field_J - 1;
                  ((wa) this).field_G = ((wa) this).field_J;
                  ((wa) this).field_O = var8;
                  return true;
                }
              } else {
                ((wa) this).field_G = ((wa) this).field_J;
                ((wa) this).field_O = var8;
                return true;
              }
            } else {
              ((wa) this).field_O = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((wa) this).field_R == ((wa) this).field_J) {
            break L0;
          } else {
            L1: {
              if (((wa) this).field_J <= ((wa) this).field_R) {
                stackOut_3_0 = ((wa) this).field_J;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((wa) this).field_R;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((wa) this).field_J > ((wa) this).field_R) {
                stackOut_6_0 = ((wa) this).field_J;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((wa) this).field_R;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((wa) this).field_R = var2;
            ((wa) this).field_J = var2;
            ((wa) this).field_n = ((wa) this).field_n.substring(0, var2) + ((wa) this).field_n.substring(var3, ((wa) this).field_n.length());
            ((wa) this).e(param0 + -29526);
            break L0;
          }
        }
        if (param0 != 0) {
          int discarded$2 = this.c((byte) -120);
          return;
        } else {
          return;
        }
    }

    private final String i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((wa) this).field_J <= ((wa) this).field_R) {
            stackOut_2_0 = ((wa) this).field_J;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((wa) this).field_R;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != -15816) {
          return null;
        } else {
          L1: {
            if (((wa) this).field_J <= ((wa) this).field_R) {
              stackOut_6_0 = ((wa) this).field_R;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((wa) this).field_J;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((wa) this).field_n.substring(var2, var3);
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_117_0 = null;
        Object stackIn_118_0 = null;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        Object stackIn_123_0 = null;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        Object stackOut_122_0 = null;
        Object stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        Object stackOut_116_0 = null;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ((wa) this).field_Q = hc.a(-9986);
        if (param1 != 60) {
          if (param1 != 62) {
            if (32 > param1) {
              if (param2 != 85) {
                if ((param2 ^ -1) != -102) {
                  if (param2 != -14) {
                    if (param2 == -97) {
                      if (-1 > (((wa) this).field_J ^ -1)) {
                        L0: {
                          stackOut_122_0 = this;
                          stackIn_124_0 = stackOut_122_0;
                          stackIn_123_0 = stackOut_122_0;
                          if (dc.field_Y[82]) {
                            stackOut_124_0 = this;
                            stackOut_124_1 = this.c((byte) 97);
                            stackIn_125_0 = stackOut_124_0;
                            stackIn_125_1 = stackOut_124_1;
                            break L0;
                          } else {
                            stackOut_123_0 = this;
                            stackOut_123_1 = -1 + ((wa) this).field_J;
                            stackIn_125_0 = stackOut_123_0;
                            stackIn_125_1 = stackOut_123_1;
                            break L0;
                          }
                        }
                        this.a(stackIn_125_1, (byte) -120);
                        return true;
                      } else {
                        var5 = -52 / ((param3 - -75) / 36);
                        return false;
                      }
                    } else {
                      if (-98 == param2) {
                        if (((wa) this).field_J < ((wa) this).field_n.length()) {
                          L1: {
                            stackOut_116_0 = this;
                            stackIn_118_0 = stackOut_116_0;
                            stackIn_117_0 = stackOut_116_0;
                            if (!dc.field_Y[82]) {
                              stackOut_118_0 = this;
                              stackOut_118_1 = 1 + ((wa) this).field_J;
                              stackIn_119_0 = stackOut_118_0;
                              stackIn_119_1 = stackOut_118_1;
                              break L1;
                            } else {
                              stackOut_117_0 = this;
                              stackOut_117_1 = this.e((byte) 47);
                              stackIn_119_0 = stackOut_117_0;
                              stackIn_119_1 = stackOut_117_1;
                              break L1;
                            }
                          }
                          this.a(stackIn_119_1, (byte) -125);
                          return true;
                        } else {
                          var5 = -52 / ((param3 - -75) / 36);
                          return false;
                        }
                      } else {
                        if (-103 != param2) {
                          if (-104 != param2) {
                            if (-85 != param2) {
                              if (!dc.field_Y[82]) {
                                if (dc.field_Y[82]) {
                                  if (param2 == 66) {
                                    this.f(-27135);
                                    return true;
                                  } else {
                                    L2: {
                                      if (!dc.field_Y[82]) {
                                        break L2;
                                      } else {
                                        if ((param2 ^ -1) == -68) {
                                          this.h(500);
                                          return true;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    var5 = -52 / ((param3 - -75) / 36);
                                    return false;
                                  }
                                } else {
                                  L3: {
                                    if (!dc.field_Y[82]) {
                                      break L3;
                                    } else {
                                      if ((param2 ^ -1) == -68) {
                                        this.h(500);
                                        return true;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var5 = -52 / ((param3 - -75) / 36);
                                  return false;
                                }
                              } else {
                                if (-66 != (param2 ^ -1)) {
                                  if (dc.field_Y[82]) {
                                    if (param2 != 66) {
                                      L4: {
                                        if (!dc.field_Y[82]) {
                                          break L4;
                                        } else {
                                          if ((param2 ^ -1) == -68) {
                                            this.h(500);
                                            return true;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      var5 = -52 / ((param3 - -75) / 36);
                                      return false;
                                    } else {
                                      this.f(-27135);
                                      return true;
                                    }
                                  } else {
                                    if (dc.field_Y[82]) {
                                      if ((param2 ^ -1) == -68) {
                                        this.h(500);
                                        return true;
                                      } else {
                                        var5 = -52 / ((param3 - -75) / 36);
                                        return false;
                                      }
                                    } else {
                                      var5 = -52 / ((param3 - -75) / 36);
                                      return false;
                                    }
                                  }
                                } else {
                                  this.g((byte) 67);
                                  return true;
                                }
                              }
                            } else {
                              this.j(0);
                              return true;
                            }
                          } else {
                            this.a(((wa) this).field_n.length(), (byte) -112);
                            return true;
                          }
                        } else {
                          this.a(0, (byte) -122);
                          return true;
                        }
                      }
                    }
                  } else {
                    ((wa) this).g(0);
                    return true;
                  }
                } else {
                  if (((wa) this).field_J == ((wa) this).field_R) {
                    if (((wa) this).field_J < ((wa) this).field_n.length()) {
                      ((wa) this).field_R = 1 + ((wa) this).field_J;
                      this.k(0);
                      return true;
                    } else {
                      var5 = -52 / ((param3 - -75) / 36);
                      return false;
                    }
                  } else {
                    this.k(0);
                    return true;
                  }
                }
              } else {
                if (((wa) this).field_J == ((wa) this).field_R) {
                  if (((wa) this).field_J > 0) {
                    ((wa) this).field_R = ((wa) this).field_J + -1;
                    this.k(0);
                    return true;
                  } else {
                    var5 = -52 / ((param3 - -75) / 36);
                    return false;
                  }
                } else {
                  this.k(0);
                  return true;
                }
              }
            } else {
              if (param1 <= 126) {
                L5: {
                  if (((wa) this).field_R == ((wa) this).field_J) {
                    break L5;
                  } else {
                    this.k(0);
                    break L5;
                  }
                }
                if (0 == (((wa) this).field_N ^ -1)) {
                  if (((wa) this).field_J < ((wa) this).field_n.length()) {
                    ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_J) + param1 + ((wa) this).field_n.substring(((wa) this).field_J, ((wa) this).field_n.length());
                    ((wa) this).field_J = ((wa) this).field_J + 1;
                    ((wa) this).field_R = ((wa) this).field_J;
                    ((wa) this).e(-29526);
                    return true;
                  } else {
                    ((wa) this).field_n = ((wa) this).field_n + param1;
                    ((wa) this).field_J = ((wa) this).field_n.length();
                    ((wa) this).field_R = ((wa) this).field_n.length();
                    ((wa) this).e(-29526);
                    return true;
                  }
                } else {
                  if (((wa) this).field_n.length() >= ((wa) this).field_N) {
                    return true;
                  } else {
                    L6: {
                      if (((wa) this).field_J < ((wa) this).field_n.length()) {
                        ((wa) this).field_n = ((wa) this).field_n.substring(0, ((wa) this).field_J) + param1 + ((wa) this).field_n.substring(((wa) this).field_J, ((wa) this).field_n.length());
                        ((wa) this).field_J = ((wa) this).field_J + 1;
                        ((wa) this).field_R = ((wa) this).field_J;
                        break L6;
                      } else {
                        ((wa) this).field_n = ((wa) this).field_n + param1;
                        ((wa) this).field_J = ((wa) this).field_n.length();
                        ((wa) this).field_R = ((wa) this).field_n.length();
                        break L6;
                      }
                    }
                    ((wa) this).e(-29526);
                    return true;
                  }
                }
              } else {
                if (param2 != 85) {
                  if ((param2 ^ -1) != -102) {
                    if (param2 != -14) {
                      L7: {
                        if (param2 == -97) {
                          if (-1 > (((wa) this).field_J ^ -1)) {
                            L8: {
                              stackOut_53_0 = this;
                              stackIn_55_0 = stackOut_53_0;
                              stackIn_54_0 = stackOut_53_0;
                              if (dc.field_Y[82]) {
                                stackOut_55_0 = this;
                                stackOut_55_1 = this.c((byte) 97);
                                stackIn_56_0 = stackOut_55_0;
                                stackIn_56_1 = stackOut_55_1;
                                break L8;
                              } else {
                                stackOut_54_0 = this;
                                stackOut_54_1 = -1 + ((wa) this).field_J;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_56_1, (byte) -120);
                            return true;
                          } else {
                            break L7;
                          }
                        } else {
                          if (-98 == param2) {
                            if (((wa) this).field_J < ((wa) this).field_n.length()) {
                              L9: {
                                stackOut_46_0 = this;
                                stackIn_48_0 = stackOut_46_0;
                                stackIn_47_0 = stackOut_46_0;
                                if (!dc.field_Y[82]) {
                                  stackOut_48_0 = this;
                                  stackOut_48_1 = 1 + ((wa) this).field_J;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  break L9;
                                } else {
                                  stackOut_47_0 = this;
                                  stackOut_47_1 = this.e((byte) 47);
                                  stackIn_49_0 = stackOut_47_0;
                                  stackIn_49_1 = stackOut_47_1;
                                  break L9;
                                }
                              }
                              this.a(stackIn_49_1, (byte) -125);
                              return true;
                            } else {
                              var5 = -52 / ((param3 - -75) / 36);
                              return false;
                            }
                          } else {
                            if (-103 != param2) {
                              if (-104 != param2) {
                                if (-85 != param2) {
                                  L10: {
                                    if (!dc.field_Y[82]) {
                                      break L10;
                                    } else {
                                      if (-66 != (param2 ^ -1)) {
                                        break L10;
                                      } else {
                                        this.g((byte) 67);
                                        return true;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (!dc.field_Y[82]) {
                                      break L11;
                                    } else {
                                      if (param2 != 66) {
                                        break L11;
                                      } else {
                                        this.f(-27135);
                                        return true;
                                      }
                                    }
                                  }
                                  if (dc.field_Y[82]) {
                                    if ((param2 ^ -1) == -68) {
                                      this.h(500);
                                      return true;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    var5 = -52 / ((param3 - -75) / 36);
                                    return false;
                                  }
                                } else {
                                  this.j(0);
                                  return true;
                                }
                              } else {
                                this.a(((wa) this).field_n.length(), (byte) -112);
                                return true;
                              }
                            } else {
                              this.a(0, (byte) -122);
                              return true;
                            }
                          }
                        }
                      }
                      var5 = -52 / ((param3 - -75) / 36);
                      return false;
                    } else {
                      ((wa) this).g(0);
                      return true;
                    }
                  } else {
                    if (((wa) this).field_J == ((wa) this).field_R) {
                      if (((wa) this).field_J < ((wa) this).field_n.length()) {
                        ((wa) this).field_R = 1 + ((wa) this).field_J;
                        this.k(0);
                        return true;
                      } else {
                        var5 = -52 / ((param3 - -75) / 36);
                        return false;
                      }
                    } else {
                      this.k(0);
                      return true;
                    }
                  }
                } else {
                  if (((wa) this).field_J == ((wa) this).field_R) {
                    if (((wa) this).field_J > 0) {
                      ((wa) this).field_R = ((wa) this).field_J + -1;
                      this.k(0);
                      return true;
                    } else {
                      var5 = -52 / ((param3 - -75) / 36);
                      return false;
                    }
                  } else {
                    this.k(0);
                    return true;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
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
        if (param0 != 39) {
            return;
        }
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
                if (-501L >= ((-((wa) this).field_Q + var6) % 1000L ^ -1L)) {
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
        if (param0 <= 61) {
            int discarded$0 = this.e((byte) -3);
        }
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
        ((wa) this).field_w = vi.field_g.field_h;
        ((wa) this).field_N = param2;
        ((wa) this).a(param0, 81, true);
        ((wa) this).field_T = true;
        ((wa) this).field_Q = hc.a(-9986);
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
