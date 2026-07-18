/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lka extends hf {
    private boolean field_D;
    private int field_I;
    private boolean field_L;
    static String[][] field_E;
    private long field_A;
    private int field_H;
    private int field_J;
    private long field_F;
    static int[] field_G;
    private int field_K;

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = 0;
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.i(-12);
                int discarded$1 = -51;
                this.a(var2);
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

    private final int j() {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (0 != ((lka) this).field_H) {
          var2 = -1 + ((lka) this).field_H;
          L0: while (true) {
            if (var2 > 0) {
              if (((lka) this).field_w.charAt(var2 - 1) != 32) {
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
          return ((lka) this).field_H;
        }
    }

    public static void g() {
        field_E = null;
        field_G = null;
    }

    final void j(byte param0) {
        int var2 = -106 / ((52 - param0) / 41);
        ((lka) this).field_K = 0;
        ((lka) this).field_w = "";
        ((lka) this).field_H = 0;
        ((lka) this).i((byte) -118);
    }

    private final int e() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = ((lka) this).field_w.length();
        if (var2 == ((lka) this).field_H) {
          return ((lka) this).field_H;
        } else {
          var3 = 1 + ((lka) this).field_H;
          L0: while (true) {
            if (var2 > var3) {
              if (((lka) this).field_w.charAt(-1 + var3) != 32) {
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
    }

    void i(byte param0) {
        if (param0 < -87) {
          if (((lka) this).field_k instanceof fca) {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, (byte) 63);
            return;
          } else {
            return;
          }
        } else {
          field_G = null;
          if (!(((lka) this).field_k instanceof fca)) {
            return;
          } else {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, (byte) 63);
            return;
          }
        }
    }

    final static kv a(byte param0, kv param1) {
        RuntimeException var2 = null;
        kv stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_0_0 = null;
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
            param1.g(2);
            param1.f(65793);
            stackOut_0_0 = (kv) param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lka.C(").append(54).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
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
              if (0 == ((lka) this).field_I) {
                break L1;
              } else {
                var3_int = ((lka) this).field_I - ((lka) this).field_w.length();
                if (-1 <= var3_int) {
                  return;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (((lka) this).field_H != ((lka) this).field_w.length()) {
                ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param0 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
                break L2;
              } else {
                ((lka) this).field_w = ((lka) this).field_w + param0;
                break L2;
              }
            }
            ((lka) this).field_H = ((lka) this).field_H + param0.length();
            ((lka) this).field_K = ((lka) this).field_H;
            ((lka) this).i((byte) -104);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("lka.G(");
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -51 + ')');
        }
    }

    private final void g(int param0) {
        int discarded$0 = 0;
        this.b();
        this.i(115);
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
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
        int stackOut_17_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
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
            if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              if (((lka) this).field_f instanceof qka) {
                L1: {
                  var8_int = ((qka) (Object) ((lka) this).field_f).a((wj) this, gd.field_m, param2, param4, mk.field_p, (byte) -86);
                  stackOut_3_0 = this;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (-1 != var8_int) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var8_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1 != 0, stackIn_6_2);
                  var8_long = f.b((byte) 73);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var8_long - ((lka) this).field_A >= 250L) {
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
                  ((lka) this).field_L = stackIn_9_1 != 0;
                  if (!((lka) this).field_L) {
                    break L3;
                  } else {
                    L4: {
                      int discarded$2 = 0;
                      ((lka) this).field_K = this.j();
                      int discarded$3 = -26;
                      ((lka) this).field_H = this.e();
                      if (((lka) this).field_H <= 0) {
                        break L4;
                      } else {
                        if (((lka) this).field_w.charAt(((lka) this).field_H + -1) == 32) {
                          ((lka) this).field_H = ((lka) this).field_H - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((lka) this).field_J = ((lka) this).field_H;
                    break L3;
                  }
                }
                ((lka) this).field_A = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("lka.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void a(boolean param0, int param1) {
        ((lka) this).field_H = param1;
        if (!(wga.field_q[81])) {
            ((lka) this).field_K = ((lka) this).field_H;
        }
    }

    private final void h() {
        if (!(!(((lka) this).field_k instanceof fca))) {
            ((fca) (Object) ((lka) this).field_k).a((lka) this, 0);
        }
    }

    lka(String param0, pl param1, int param2) {
        super(param0, param1);
        ((lka) this).field_L = false;
        ((lka) this).field_A = 0L;
        ((lka) this).field_J = -1;
        try {
            ((lka) this).field_f = fda.field_i.field_s;
            ((lka) this).field_I = param2;
            ((lka) this).a((byte) -26, param0, true);
            ((lka) this).field_D = true;
            ((lka) this).field_F = f.b((byte) 73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String f() {
        int var2 = ((lka) this).field_H > ((lka) this).field_K ? ((lka) this).field_K : ((lka) this).field_H;
        int var3 = ((lka) this).field_H > ((lka) this).field_K ? ((lka) this).field_H : ((lka) this).field_K;
        return ((lka) this).field_w.substring(var2, var3);
    }

    private final void d() {
        vv var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qka var9 = null;
        var8 = BachelorFridge.field_y;
        if (((lka) this).field_D) {
          if (((lka) this).field_f instanceof qka) {
            var9 = (qka) (Object) ((lka) this).field_f;
            var3 = var9.b((wj) this, false);
            var4 = var3.b((byte) 124);
            var5 = var9.a((wj) this, false);
            var6 = var9.a(-30983) >> 1;
            if (-var6 + var5 <= var4) {
              var7 = ((lka) this).field_m - -var3.a(((lka) this).field_H, (byte) -99);
              if (var7 <= var5 + -var6) {
                if (var6 <= var7) {
                  if (0 >= ((lka) this).field_m) {
                    if (((lka) this).field_m < -var5 - -var6) {
                      ((lka) this).field_m = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((lka) this).field_m = 0;
                    return;
                  }
                } else {
                  ((lka) this).field_m = ((lka) this).field_m + (var6 + -var7);
                  if (0 >= ((lka) this).field_m) {
                    if (((lka) this).field_m >= -var5 - -var6) {
                      return;
                    } else {
                      ((lka) this).field_m = var6 + -var5;
                      return;
                    }
                  } else {
                    ((lka) this).field_m = 0;
                    return;
                  }
                }
              } else {
                ((lka) this).field_m = -var7 + (var5 + -var6 + ((lka) this).field_m);
                if (0 >= ((lka) this).field_m) {
                  if (((lka) this).field_m >= -var5 - -var6) {
                    return;
                  } else {
                    ((lka) this).field_m = var6 + -var5;
                    return;
                  }
                } else {
                  ((lka) this).field_m = 0;
                  return;
                }
              }
            } else {
              ((lka) this).field_o = 0;
              ((lka) this).field_m = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((lka) this).field_m = 0;
          ((lka) this).field_o = 0;
          return;
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        qka var7 = null;
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
            super.a(param0, param1, param2, param3);
            int discarded$2 = -75;
            this.d();
            if (param3 == 20) {
              if (((lka) this).field_u == 1) {
                L1: {
                  if (((lka) this).field_f instanceof qka) {
                    var7 = (qka) (Object) ((lka) this).field_f;
                    var6 = var7.a((wj) this, gd.field_m, param0, param1, mk.field_p, (byte) -85);
                    if (-1 == var6) {
                      break L1;
                    } else {
                      L2: {
                        if (!((lka) this).field_L) {
                          break L2;
                        } else {
                          if (((lka) this).field_J <= var6) {
                            break L2;
                          } else {
                            if (((lka) this).field_K >= var6) {
                              break L2;
                            } else {
                              var6 = ((lka) this).field_J;
                              break L2;
                            }
                          }
                        }
                      }
                      ((lka) this).field_H = var6;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                ((lka) this).field_F = f.b((byte) 73);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("lka.O(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = -101 / ((param0 - 58) / 54);
              ((lka) this).field_w = param1;
              var5 = param1.length();
              if (((lka) this).field_I == -1) {
                break L2;
              } else {
                if (((lka) this).field_I < var5) {
                  ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_I);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            int dupTemp$2 = ((lka) this).field_w.length();
            ((lka) this).field_K = dupTemp$2;
            ((lka) this).field_H = dupTemp$2;
            if (!param2) {
              ((lka) this).i((byte) -90);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("lka.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final void b() {
        int discarded$0 = -53;
        String var2 = this.f();
        if (!(var2.length() <= 0)) {
            int discarded$1 = -53;
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f()), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((lka) this).field_F = f.b((byte) 73);
              if (param2 == 60) {
                break L1;
              } else {
                if (62 == param2) {
                  break L1;
                } else {
                  L2: {
                    if (32 > param2) {
                      break L2;
                    } else {
                      if (param2 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (((lka) this).field_H == ((lka) this).field_K) {
                            break L3;
                          } else {
                            this.i(param0 ^ -49);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (-1 == ((lka) this).field_I) {
                              break L5;
                            } else {
                              if (~((lka) this).field_w.length() <= ~((lka) this).field_I) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (((lka) this).field_H < ((lka) this).field_w.length()) {
                              ((lka) this).field_w = ((lka) this).field_w.substring(0, ((lka) this).field_H) + param2 + ((lka) this).field_w.substring(((lka) this).field_H, ((lka) this).field_w.length());
                              ((lka) this).field_H = ((lka) this).field_H + 1;
                              ((lka) this).field_K = ((lka) this).field_H;
                              break L6;
                            } else {
                              ((lka) this).field_w = ((lka) this).field_w + param2;
                              int dupTemp$6 = ((lka) this).field_w.length();
                              ((lka) this).field_H = dupTemp$6;
                              ((lka) this).field_K = dupTemp$6;
                              break L6;
                            }
                          }
                          ((lka) this).i((byte) -123);
                          break L4;
                        }
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      }
                    }
                  }
                  L7: {
                    if (param1 == 85) {
                      if (~((lka) this).field_H != ~((lka) this).field_K) {
                        this.i(120);
                        stackOut_72_0 = 1;
                        stackIn_73_0 = stackOut_72_0;
                        return stackIn_73_0 != 0;
                      } else {
                        if (((lka) this).field_H > 0) {
                          ((lka) this).field_K = ((lka) this).field_H - 1;
                          this.i(111);
                          stackOut_70_0 = 1;
                          stackIn_71_0 = stackOut_70_0;
                          return stackIn_71_0 != 0;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      if (param1 == 101) {
                        if (((lka) this).field_H != ((lka) this).field_K) {
                          this.i(param0 + 109);
                          stackOut_65_0 = 1;
                          stackIn_66_0 = stackOut_65_0;
                          return stackIn_66_0 != 0;
                        } else {
                          if (((lka) this).field_H < ((lka) this).field_w.length()) {
                            ((lka) this).field_K = 1 + ((lka) this).field_H;
                            this.i(106);
                            stackOut_63_0 = 1;
                            stackIn_64_0 = stackOut_63_0;
                            return stackIn_64_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        if (param1 != 13) {
                          if (param1 != 96) {
                            if (97 != param1) {
                              if (param1 != 102) {
                                if (103 != param1) {
                                  if (84 != param1) {
                                    L8: {
                                      if (!wga.field_q[82]) {
                                        break L8;
                                      } else {
                                        if (param1 != 65) {
                                          break L8;
                                        } else {
                                          this.g(81);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          return stackIn_49_0 != 0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!wga.field_q[82]) {
                                        break L9;
                                      } else {
                                        if (param1 == 66) {
                                          int discarded$7 = 0;
                                          this.b();
                                          stackOut_58_0 = 1;
                                          stackIn_59_0 = stackOut_58_0;
                                          return stackIn_59_0 != 0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!wga.field_q[82]) {
                                      break L7;
                                    } else {
                                      if (param1 == 67) {
                                        this.h(104);
                                        stackOut_56_0 = 1;
                                        stackIn_57_0 = stackOut_56_0;
                                        return stackIn_57_0 != 0;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  } else {
                                    int discarded$8 = 52;
                                    this.h();
                                    stackOut_44_0 = 1;
                                    stackIn_45_0 = stackOut_44_0;
                                    return stackIn_45_0 != 0;
                                  }
                                } else {
                                  this.a(true, ((lka) this).field_w.length());
                                  stackOut_41_0 = 1;
                                  stackIn_42_0 = stackOut_41_0;
                                  return stackIn_42_0 != 0;
                                }
                              } else {
                                this.a(true, 0);
                                stackOut_38_0 = 1;
                                stackIn_39_0 = stackOut_38_0;
                                return stackIn_39_0 != 0;
                              }
                            } else {
                              if (((lka) this).field_H >= ((lka) this).field_w.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = 1;
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  if (!wga.field_q[82]) {
                                    stackOut_34_0 = this;
                                    stackOut_34_1 = stackIn_34_1;
                                    stackOut_34_2 = 1 + ((lka) this).field_H;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    stackIn_35_2 = stackOut_34_2;
                                    break L10;
                                  } else {
                                    int discarded$9 = -26;
                                    stackOut_33_0 = this;
                                    stackOut_33_1 = stackIn_33_1;
                                    stackOut_33_2 = this.e();
                                    stackIn_35_0 = stackOut_33_0;
                                    stackIn_35_1 = stackOut_33_1;
                                    stackIn_35_2 = stackOut_33_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_35_1 != 0, stackIn_35_2);
                                stackOut_35_0 = 1;
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0 != 0;
                              }
                            }
                          } else {
                            if (((lka) this).field_H <= 0) {
                              break L7;
                            } else {
                              L11: {
                                stackOut_25_0 = this;
                                stackOut_25_1 = 1;
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_27_1 = stackOut_25_1;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                if (wga.field_q[82]) {
                                  int discarded$10 = 0;
                                  stackOut_27_0 = this;
                                  stackOut_27_1 = stackIn_27_1;
                                  stackOut_27_2 = this.j();
                                  stackIn_28_0 = stackOut_27_0;
                                  stackIn_28_1 = stackOut_27_1;
                                  stackIn_28_2 = stackOut_27_2;
                                  break L11;
                                } else {
                                  stackOut_26_0 = this;
                                  stackOut_26_1 = stackIn_26_1;
                                  stackOut_26_2 = -1 + ((lka) this).field_H;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  stackIn_28_2 = stackOut_26_2;
                                  break L11;
                                }
                              }
                              this.a(stackIn_28_1 != 0, stackIn_28_2);
                              stackOut_28_0 = 1;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0 != 0;
                            }
                          }
                        } else {
                          ((lka) this).j((byte) -85);
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        }
                      }
                    }
                  }
                  if (param0 == 10) {
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    break L0;
                  } else {
                    var6 = null;
                    boolean discarded$11 = ((lka) this).b(-24, 51, -40, -52, -18, (wj) null, -94);
                    return false;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("lka.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ')');
        }
        return stackIn_77_0 != 0;
    }

    private final void i(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -97 / ((43 - param0) / 38);
        if (!(((lka) this).field_H == ((lka) this).field_K)) {
            var3 = ((lka) this).field_H <= ((lka) this).field_K ? ((lka) this).field_H : ((lka) this).field_K;
            var4 = ((lka) this).field_K < ((lka) this).field_H ? ((lka) this).field_H : ((lka) this).field_K;
            ((lka) this).field_H = var3;
            ((lka) this).field_K = var3;
            ((lka) this).field_w = ((lka) this).field_w.substring(0, var3) + ((lka) this).field_w.substring(var4, ((lka) this).field_w.length());
            ((lka) this).i((byte) -106);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        qka var8 = null;
        if (null != ((lka) this).field_f) {
          if (param2 == 0) {
            ((lka) this).field_f.a(param3, (wj) this, 32679, param1, ((lka) this).field_z);
            if (((lka) this).field_f instanceof qka) {
              var8 = (qka) (Object) ((lka) this).field_f;
              if (((lka) this).field_K == ((lka) this).field_H) {
                var6 = f.b((byte) 73);
                if ((-((lka) this).field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) this, ((lka) this).field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              } else {
                var8.a(((lka) this).field_K, -17394, param3, ((lka) this).field_H, param1, (wj) this);
                var6 = f.b((byte) 73);
                if ((-((lka) this).field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) this, ((lka) this).field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              }
            } else {
              var5 = -91 / ((-20 - param0) / 54);
              return;
            }
          } else {
            var5 = -91 / ((-20 - param0) / 54);
            return;
          }
        } else {
          var5 = -91 / ((-20 - param0) / 54);
          return;
        }
    }

    static {
    }
}
