/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends lj {
    private int field_E;
    static int[] field_D;
    private boolean field_A;
    static int[] field_B;
    private int field_H;
    static oe[] field_L;
    private boolean field_J;
    static String field_I;
    private long field_K;
    private int field_F;
    private int field_M;
    private long field_C;

    private final void o() {
        int var2 = 0;
        int var3 = 0;
        if (((rg) this).field_F != ((rg) this).field_H) {
            var2 = ((rg) this).field_F < ((rg) this).field_H ? ((rg) this).field_F : ((rg) this).field_H;
            var3 = ((rg) this).field_F >= ((rg) this).field_H ? ((rg) this).field_F : ((rg) this).field_H;
            ((rg) this).field_H = var2;
            ((rg) this).field_F = var2;
            ((rg) this).field_k = ((rg) this).field_k.substring(0, var2) + ((rg) this).field_k.substring(var3, ((rg) this).field_k.length());
            ((rg) this).e((byte) 71);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        m var8 = null;
        if (null != ((rg) this).field_q) {
          if (param2 == 0) {
            ((rg) this).field_q.a(param0, param1, ((rg) this).field_t, (byte) 107, (qg) this);
            if (((rg) this).field_q instanceof m) {
              var8 = (m) (Object) ((rg) this).field_q;
              if (((rg) this).field_H == ((rg) this).field_F) {
                var6 = lk.a(0);
                if ((-((rg) this).field_C + var6) % 1000L >= 500L) {
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                } else {
                  var8.a(param0, ((rg) this).field_H, param1, (qg) this, true);
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                }
              } else {
                L0: {
                  var8.a((qg) this, param1, param0, ((rg) this).field_F, (byte) -49, ((rg) this).field_H);
                  var6 = lk.a(0);
                  if ((-((rg) this).field_C + var6) % 1000L < 500L) {
                    var8.a(param0, ((rg) this).field_H, param1, (qg) this, true);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = 55 % ((77 - param3) / 34);
                return;
              }
            } else {
              var5 = 55 % ((77 - param3) / 34);
              return;
            }
          } else {
            var5 = 55 % ((77 - param3) / 34);
            return;
          }
        } else {
          var5 = 55 % ((77 - param3) / 34);
          return;
        }
    }

    private final int m() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = ((rg) this).field_k.length();
        if (var2 != ((rg) this).field_H) {
          var3 = ((rg) this).field_H - -1;
          L0: while (true) {
            if (var2 > var3) {
              if (((rg) this).field_k.charAt(var3 - 1) != 32) {
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
          return ((rg) this).field_H;
        }
    }

    private final void k() {
        int discarded$0 = 0;
        this.d();
        int discarded$1 = 1;
        this.o();
    }

    private final void a(int param0, boolean param1) {
        ((rg) this).field_H = param0;
        if (!(ve.field_B[81])) {
            ((rg) this).field_F = ((rg) this).field_H;
        }
    }

    final void a(String param0, boolean param1, int param2) {
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
              ((rg) this).field_k = param0;
              var4_int = param0.length();
              if (((rg) this).field_E == -1) {
                break L2;
              } else {
                if (var4_int <= ((rg) this).field_E) {
                  break L2;
                } else {
                  ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_E);
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((rg) this).field_k.length();
              ((rg) this).field_F = dupTemp$2;
              ((rg) this).field_H = dupTemp$2;
              if (!param1) {
                ((rg) this).e((byte) 108);
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 == 1) {
              break L0;
            } else {
              ((rg) this).field_M = -100;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rg.HA(");
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
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h() {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                int discarded$1 = 1;
                this.o();
                this.a(true, var2);
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

    private final void a(boolean param0, String param1) {
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
              if (((rg) this).field_E == 0) {
                break L1;
              } else {
                var3_int = ((rg) this).field_E + -((rg) this).field_k.length();
                if (-1 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((rg) this).field_H == ((rg) this).field_k.length()) {
                ((rg) this).field_k = ((rg) this).field_k + param1;
                break L2;
              } else {
                ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_H) + param1 + ((rg) this).field_k.substring(((rg) this).field_H, ((rg) this).field_k.length());
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("rg.DA(").append(true).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -30) {
          if (0 == ((rg) this).field_H) {
            return ((rg) this).field_H;
          } else {
            var2 = -1 + ((rg) this).field_H;
            L0: while (true) {
              if (0 < var2) {
                if (((rg) this).field_k.charAt(var2 + -1) != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        } else {
          var4 = null;
          ((rg) this).a((String) null, true, 10);
          if (0 == ((rg) this).field_H) {
            return ((rg) this).field_H;
          } else {
            var2 = -1 + ((rg) this).field_H;
            L1: while (true) {
              if (0 < var2) {
                if (((rg) this).field_k.charAt(var2 + -1) != 32) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        }
    }

    public static void g() {
        field_I = null;
        field_B = null;
        field_D = null;
        field_L = null;
    }

    rg(String param0, ma param1, int param2) {
        super(param0, param1);
        ((rg) this).field_K = 0L;
        ((rg) this).field_M = -1;
        ((rg) this).field_A = false;
        try {
            ((rg) this).field_E = param2;
            ((rg) this).field_q = vi.field_e.field_f;
            ((rg) this).a(param0, true, 1);
            ((rg) this).field_J = true;
            ((rg) this).field_C = lk.a(0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        ((rg) this).field_H = 0;
        if (param0 != 81) {
            return;
        }
        ((rg) this).field_k = "";
        ((rg) this).field_F = 0;
        ((rg) this).e((byte) 107);
    }

    private final String f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= 7) {
          return null;
        } else {
          L0: {
            if (((rg) this).field_F >= ((rg) this).field_H) {
              stackOut_3_0 = ((rg) this).field_H;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((rg) this).field_F;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((rg) this).field_H <= ((rg) this).field_F) {
              stackOut_6_0 = ((rg) this).field_F;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((rg) this).field_H;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((rg) this).field_k.substring(var2, var3);
        }
    }

    private final void h(int param0) {
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        m var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (!((rg) this).field_J) {
          ((rg) this).field_o = 0;
          ((rg) this).field_r = 0;
          return;
        } else {
          if (!(((rg) this).field_q instanceof m)) {
            return;
          } else {
            var9 = (m) (Object) ((rg) this).field_q;
            var3 = var9.a((qg) this, -2);
            var4 = var3.b((byte) 3);
            var5 = var9.b(0, (qg) this);
            var6 = var9.a(true) >> 1;
            if (var4 < var5 + -var6) {
              ((rg) this).field_o = 0;
              ((rg) this).field_r = 0;
              return;
            } else {
              var7 = ((rg) this).field_r + var3.c(0, ((rg) this).field_H);
              if (var7 > var5 - var6) {
                ((rg) this).field_r = ((rg) this).field_r + -var6 - (-var5 - -var7);
                if (((rg) this).field_r <= 0) {
                  if (((rg) this).field_r >= -var5 + var6) {
                    return;
                  } else {
                    ((rg) this).field_r = var6 + -var5;
                    return;
                  }
                } else {
                  ((rg) this).field_r = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (((rg) this).field_r <= 0) {
                    if (((rg) this).field_r < -var5 + var6) {
                      ((rg) this).field_r = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((rg) this).field_r = 0;
                    return;
                  }
                } else {
                  ((rg) this).field_r = ((rg) this).field_r - var7 - -var6;
                  if (((rg) this).field_r <= 0) {
                    if (((rg) this).field_r >= -var5 + var6) {
                      return;
                    } else {
                      ((rg) this).field_r = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rg) this).field_r = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (super.b(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(((rg) this).field_q instanceof m)) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L1: {
                  var8_int = ((m) (Object) ((rg) this).field_q).a(param6, (byte) -50, bk.field_a, param3, oa.field_j, (qg) this);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8_int == -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, false);
                  var8_long = lk.a(param4 + 30386);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-((rg) this).field_K + var8_long >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((rg) this).field_A = stackIn_9_1 != 0;
                  if (!((rg) this).field_A) {
                    break L3;
                  } else {
                    L4: {
                      ((rg) this).field_F = this.l(-119);
                      int discarded$1 = -7638;
                      ((rg) this).field_H = this.m();
                      if (0 >= ((rg) this).field_H) {
                        break L4;
                      } else {
                        if (((rg) this).field_k.charAt(-1 + ((rg) this).field_H) != 32) {
                          break L4;
                        } else {
                          ((rg) this).field_H = ((rg) this).field_H - 1;
                          break L4;
                        }
                      }
                    }
                    ((rg) this).field_M = ((rg) this).field_H;
                    break L3;
                  }
                }
                ((rg) this).field_K = var8_long;
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("rg.O(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        m var5 = null;
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
              this.h(0);
              if (((rg) this).field_s != 1) {
                break L1;
              } else {
                L2: {
                  if (!(((rg) this).field_q instanceof m)) {
                    break L2;
                  } else {
                    var5 = (m) (Object) ((rg) this).field_q;
                    var6 = var5.a(param0, (byte) -50, bk.field_a, param3, oa.field_j, (qg) this);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((rg) this).field_A) {
                          break L3;
                        } else {
                          if (var6 >= ((rg) this).field_M) {
                            break L3;
                          } else {
                            if (var6 <= ((rg) this).field_F) {
                              break L3;
                            } else {
                              var6 = ((rg) this).field_M;
                              break L3;
                            }
                          }
                        }
                      }
                      ((rg) this).field_H = var6;
                      break L2;
                    }
                  }
                }
                ((rg) this).field_C = lk.a(0);
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
            stackOut_10_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
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
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
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
            ((rg) this).field_C = lk.a(0);
            if (60 == param3) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param3 != 62) {
                L1: {
                  var5_int = -98 / ((param2 - 65) / 55);
                  if (param3 < 32) {
                    break L1;
                  } else {
                    if (param3 <= 126) {
                      L2: {
                        if (~((rg) this).field_H != ~((rg) this).field_F) {
                          int discarded$11 = 1;
                          this.o();
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((rg) this).field_E == -1) {
                            break L4;
                          } else {
                            if (~((rg) this).field_k.length() <= ~((rg) this).field_E) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((rg) this).field_H >= ((rg) this).field_k.length()) {
                            ((rg) this).field_k = ((rg) this).field_k + param3;
                            int dupTemp$12 = ((rg) this).field_k.length();
                            ((rg) this).field_H = dupTemp$12;
                            ((rg) this).field_F = dupTemp$12;
                            break L5;
                          } else {
                            ((rg) this).field_k = ((rg) this).field_k.substring(0, ((rg) this).field_H) + param3 + ((rg) this).field_k.substring(((rg) this).field_H, ((rg) this).field_k.length());
                            ((rg) this).field_H = ((rg) this).field_H + 1;
                            ((rg) this).field_F = ((rg) this).field_H;
                            break L5;
                          }
                        }
                        ((rg) this).e((byte) 53);
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
                  if (param0 == 85) {
                    if (~((rg) this).field_F != ~((rg) this).field_H) {
                      int discarded$13 = 1;
                      this.o();
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      return stackIn_62_0 != 0;
                    } else {
                      if (((rg) this).field_H <= 0) {
                        break L6;
                      } else {
                        ((rg) this).field_F = -1 + ((rg) this).field_H;
                        int discarded$14 = 1;
                        this.o();
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      }
                    }
                  } else {
                    if (param0 == 101) {
                      if (~((rg) this).field_F != ~((rg) this).field_H) {
                        int discarded$15 = 1;
                        this.o();
                        stackOut_55_0 = 1;
                        stackIn_56_0 = stackOut_55_0;
                        return stackIn_56_0 != 0;
                      } else {
                        if (((rg) this).field_H >= ((rg) this).field_k.length()) {
                          break L6;
                        } else {
                          ((rg) this).field_F = ((rg) this).field_H + 1;
                          int discarded$16 = 1;
                          this.o();
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          return stackIn_54_0 != 0;
                        }
                      }
                    } else {
                      if (param0 == 13) {
                        ((rg) this).i(81);
                        stackOut_49_0 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        return stackIn_50_0 != 0;
                      } else {
                        if (param0 != 96) {
                          if (param0 == 97) {
                            if (((rg) this).field_H < ((rg) this).field_k.length()) {
                              L7: {
                                stackOut_44_0 = this;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (ve.field_B[82]) {
                                  int discarded$17 = -7638;
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = this.m();
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  break L7;
                                } else {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = 1 + ((rg) this).field_H;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_47_1, false);
                              stackOut_47_0 = 1;
                              stackIn_48_0 = stackOut_47_0;
                              return stackIn_48_0 != 0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param0 != 102) {
                              if (103 != param0) {
                                if (84 == param0) {
                                  int discarded$18 = 24349;
                                  this.j();
                                  stackOut_40_0 = 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0 != 0;
                                } else {
                                  L8: {
                                    if (!ve.field_B[82]) {
                                      break L8;
                                    } else {
                                      if (65 == param0) {
                                        int discarded$19 = 62;
                                        this.k();
                                        stackOut_38_0 = 1;
                                        stackIn_39_0 = stackOut_38_0;
                                        return stackIn_39_0 != 0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ve.field_B[82]) {
                                      break L9;
                                    } else {
                                      if (param0 != 66) {
                                        break L9;
                                      } else {
                                        int discarded$20 = 0;
                                        this.d();
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        return stackIn_32_0 != 0;
                                      }
                                    }
                                  }
                                  if (!ve.field_B[82]) {
                                    break L6;
                                  } else {
                                    if (param0 == 67) {
                                      int discarded$21 = 115;
                                      this.h();
                                      stackOut_36_0 = 1;
                                      stackIn_37_0 = stackOut_36_0;
                                      return stackIn_37_0 != 0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                this.a(((rg) this).field_k.length(), false);
                                stackOut_23_0 = 1;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0 != 0;
                              }
                            } else {
                              this.a(0, false);
                              stackOut_20_0 = 1;
                              stackIn_21_0 = stackOut_20_0;
                              return stackIn_21_0 != 0;
                            }
                          }
                        } else {
                          if (((rg) this).field_H <= 0) {
                            break L6;
                          } else {
                            L10: {
                              stackOut_13_0 = this;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (ve.field_B[82]) {
                                stackOut_15_0 = this;
                                stackOut_15_1 = this.l(-85);
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                break L10;
                              } else {
                                stackOut_14_0 = this;
                                stackOut_14_1 = ((rg) this).field_H + -1;
                                stackIn_16_0 = stackOut_14_0;
                                stackIn_16_1 = stackOut_14_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_16_1, false);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
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
            stackOut_77_1 = new StringBuilder().append("rg.K(").append(param0).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param1 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_76_0 != 0;
    }

    void e(byte param0) {
        L0: {
          if (((rg) this).field_m instanceof fb) {
            ((fb) (Object) ((rg) this).field_m).a((rg) this, -122);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 43) {
          int discarded$2 = this.l(-86);
          return;
        } else {
          return;
        }
    }

    final static void n(int param0) {
        ub.field_d = false;
        int discarded$4 = nf.field_l.d((byte) 29);
        if (param0 < 66) {
            rg.n(74);
        }
    }

    private final void j() {
        if (!(!(((rg) this).field_m instanceof fb))) {
            ((fb) (Object) ((rg) this).field_m).a(1330, (rg) this);
        }
    }

    private final void d() {
        String var2 = this.f((byte) 77);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{200, 300, 300, 500, 300, 500, 200, 500, 500, 1000, 300, 300, 200, 300, 300, 300};
        field_I = "Email (Login):";
    }
}
