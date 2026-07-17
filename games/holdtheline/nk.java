/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends rm {
    private boolean field_I;
    static String field_M;
    private boolean field_G;
    private int field_N;
    private long field_P;
    static int[] field_K;
    private int field_L;
    static int[] field_J;
    private int field_O;
    private long field_H;
    static boolean field_R;
    private int field_Q;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (((nk) this).field_O != ((nk) this).field_L) {
            var2 = ((nk) this).field_O > ((nk) this).field_L ? ((nk) this).field_L : ((nk) this).field_O;
            var3 = ((nk) this).field_L < ((nk) this).field_O ? ((nk) this).field_O : ((nk) this).field_L;
            ((nk) this).field_O = var2;
            ((nk) this).field_L = var2;
            ((nk) this).field_q = ((nk) this).field_q.substring(0, var2) + ((nk) this).field_q.substring(var3, ((nk) this).field_q.length());
            ((nk) this).f((byte) 100);
        }
    }

    private final void a(int param0, int param1) {
        if (param0 == -31523) {
          ((nk) this).field_O = param1;
          if (!lk.field_g[81]) {
            ((nk) this).field_L = ((nk) this).field_O;
            return;
          } else {
            return;
          }
        } else {
          ((nk) this).a(-33, -31, 0, 101);
          ((nk) this).field_O = param1;
          if (lk.field_g[81]) {
            return;
          } else {
            ((nk) this).field_L = ((nk) this).field_O;
            return;
          }
        }
    }

    private final void m(int param0) {
        this.j(-117);
        this.a(false);
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.a(false);
                this.a(-127, var2);
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

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
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
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (((nk) this).field_l instanceof vc) {
                L1: {
                  var8_int = ((vc) (Object) ((nk) this).field_l).a(param2, (byte) 76, nc.field_g, param0, (n) this, rf.field_X);
                  stackOut_4_0 = this;
                  stackOut_4_1 = -31523;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var8_int != -1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = var8_int;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = bb.b(-1);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-((nk) this).field_H + var8_long >= 250L) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((nk) this).field_G = stackIn_10_1 != 0;
                  if (((nk) this).field_G) {
                    L4: {
                      ((nk) this).field_L = this.a((byte) 70);
                      ((nk) this).field_O = this.e((byte) -88);
                      if (((nk) this).field_O <= 0) {
                        break L4;
                      } else {
                        if (32 != ((nk) this).field_q.charAt(((nk) this).field_O + -1)) {
                          break L4;
                        } else {
                          ((nk) this).field_O = ((nk) this).field_O - 1;
                          break L4;
                        }
                      }
                    }
                    ((nk) this).field_Q = ((nk) this).field_O;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((nk) this).field_H = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("nk.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        vc var5 = null;
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
              super.a(param0, param1, param2, param3);
              this.k(-62);
              if (((nk) this).field_v != 1) {
                break L1;
              } else {
                L2: {
                  if (((nk) this).field_l instanceof vc) {
                    var5 = (vc) (Object) ((nk) this).field_l;
                    var6 = var5.a(param2, (byte) 110, nc.field_g, param0, (n) this, rf.field_X);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((nk) this).field_G) {
                          break L3;
                        } else {
                          if (var6 >= ((nk) this).field_Q) {
                            break L3;
                          } else {
                            if (var6 <= ((nk) this).field_L) {
                              break L3;
                            } else {
                              var6 = ((nk) this).field_Q;
                              break L3;
                            }
                          }
                        }
                      }
                      ((nk) this).field_O = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((nk) this).field_P = bb.b(-1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("nk.JA(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        vc var8 = null;
        if (((nk) this).field_l != null) {
          if (param3 == 0) {
            L0: {
              ((nk) this).field_l.a(((nk) this).field_D, param2, -101, (n) this, param1);
              if (!(((nk) this).field_l instanceof vc)) {
                break L0;
              } else {
                L1: {
                  var8 = (vc) (Object) ((nk) this).field_l;
                  if (((nk) this).field_O != ((nk) this).field_L) {
                    var8.a(-108, param1, param2, ((nk) this).field_O, ((nk) this).field_L, (n) this);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = bb.b(-1);
                if ((var6 + -((nk) this).field_P) % 1000L < 500L) {
                  var8.a(param2, (n) this, ((nk) this).field_O, (byte) -98, param1);
                  break L0;
                } else {
                  if (param0 != -9532) {
                    this.k(-36);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -9532) {
            this.k(-36);
            return;
          } else {
            return;
          }
        }
    }

    private final String g(byte param0) {
        int var3 = -83 / ((-74 - param0) / 45);
        int var2 = ((nk) this).field_L >= ((nk) this).field_O ? ((nk) this).field_O : ((nk) this).field_L;
        int var4 = ((nk) this).field_L >= ((nk) this).field_O ? ((nk) this).field_L : ((nk) this).field_O;
        return ((nk) this).field_q.substring(var2, var4);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        var2 = ((nk) this).field_q.length();
        if (((nk) this).field_O != var2) {
          if (param0 == -88) {
            var3 = 1 + ((nk) this).field_O;
            L0: while (true) {
              if (var2 > var3) {
                if (((nk) this).field_q.charAt(var3 + -1) != 32) {
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
            return -8;
          }
        } else {
          return ((nk) this).field_O;
        }
    }

    nk(String param0, tb param1, int param2) {
        super(param0, param1);
        ((nk) this).field_G = false;
        ((nk) this).field_Q = -1;
        ((nk) this).field_H = 0L;
        try {
            ((nk) this).field_N = param2;
            ((nk) this).field_l = pc.field_b.field_s;
            ((nk) this).a(true, param0, 1471);
            ((nk) this).field_I = true;
            ((nk) this).field_P = bb.b(-1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (((nk) this).field_N != -1) {
                var3_int = ((nk) this).field_N + -((nk) this).field_q.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -117) {
                break L2;
              } else {
                ((nk) this).field_L = -34;
                break L2;
              }
            }
            L3: {
              if (((nk) this).field_O != ((nk) this).field_q.length()) {
                ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param1 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
                break L3;
              } else {
                ((nk) this).field_q = ((nk) this).field_q + param1;
                break L3;
              }
            }
            ((nk) this).field_O = ((nk) this).field_O + param1.length();
            ((nk) this).field_L = ((nk) this).field_O;
            ((nk) this).f((byte) -123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("nk.EA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (((nk) this).field_O == 0) {
          return ((nk) this).field_O;
        } else {
          var2 = -1 + ((nk) this).field_O;
          var3 = 56 / ((5 - param0) / 42);
          L0: while (true) {
            if (var2 > 0) {
              if (32 != ((nk) this).field_q.charAt(-1 + var2)) {
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
    }

    private final void l(int param0) {
        if (((nk) this).field_t instanceof ed) {
            ((ed) (Object) ((nk) this).field_t).a((byte) 19, (nk) this);
            return;
        }
    }

    void f(byte param0) {
        if (!(!(((nk) this).field_t instanceof ed))) {
            ((ed) (Object) ((nk) this).field_t).a((nk) this, -110);
        }
        int var2 = 81 % ((param0 - -44) / 59);
    }

    private final void k(int param0) {
        int var3 = 0;
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vc var10 = null;
        var9 = HoldTheLine.field_D;
        if (((nk) this).field_I) {
          if (((nk) this).field_l instanceof vc) {
            var10 = (vc) (Object) ((nk) this).field_l;
            var3 = 14 / ((70 - param0) / 49);
            var4 = var10.a((byte) 20, (n) this);
            var5 = var4.a((byte) 98);
            var6 = var10.a(9, (n) this);
            var7 = var10.a(true) >> 1;
            if (var6 + -var7 <= var5) {
              var8 = ((nk) this).field_m - -var4.a(16777215, ((nk) this).field_O);
              if (-var7 + var6 >= var8) {
                if (var8 >= var7) {
                  if (0 >= ((nk) this).field_m) {
                    if (((nk) this).field_m < -var6 - -var7) {
                      ((nk) this).field_m = -var6 - -var7;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((nk) this).field_m = 0;
                    return;
                  }
                } else {
                  ((nk) this).field_m = ((nk) this).field_m - -var7 + -var8;
                  if (0 >= ((nk) this).field_m) {
                    if (((nk) this).field_m >= -var6 - -var7) {
                      return;
                    } else {
                      ((nk) this).field_m = -var6 - -var7;
                      return;
                    }
                  } else {
                    ((nk) this).field_m = 0;
                    return;
                  }
                }
              } else {
                ((nk) this).field_m = ((nk) this).field_m - (var8 - -var7) + var6;
                if (0 >= ((nk) this).field_m) {
                  if (((nk) this).field_m >= -var6 - -var7) {
                    return;
                  } else {
                    ((nk) this).field_m = -var6 - -var7;
                    return;
                  }
                } else {
                  ((nk) this).field_m = 0;
                  return;
                }
              }
            } else {
              ((nk) this).field_y = 0;
              ((nk) this).field_m = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((nk) this).field_m = 0;
          ((nk) this).field_y = 0;
          return;
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_43_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            ((nk) this).field_P = bb.b(-1);
            if (param2 == -78) {
              L1: {
                if (param3 == 60) {
                  break L1;
                } else {
                  if (param3 == 62) {
                    break L1;
                  } else {
                    L2: {
                      if (param3 < 32) {
                        break L2;
                      } else {
                        if (param3 <= 126) {
                          L3: {
                            if (~((nk) this).field_L == ~((nk) this).field_O) {
                              break L3;
                            } else {
                              this.a(false);
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (((nk) this).field_N == -1) {
                                break L5;
                              } else {
                                if (~((nk) this).field_q.length() <= ~((nk) this).field_N) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (~((nk) this).field_O > ~((nk) this).field_q.length()) {
                                ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_O) + param3 + ((nk) this).field_q.substring(((nk) this).field_O, ((nk) this).field_q.length());
                                ((nk) this).field_O = ((nk) this).field_O + 1;
                                ((nk) this).field_L = ((nk) this).field_O;
                                break L6;
                              } else {
                                ((nk) this).field_q = ((nk) this).field_q + param3;
                                int dupTemp$1 = ((nk) this).field_q.length();
                                ((nk) this).field_O = dupTemp$1;
                                ((nk) this).field_L = dupTemp$1;
                                break L6;
                              }
                            }
                            ((nk) this).f((byte) 126);
                            break L4;
                          }
                          stackOut_74_0 = 1;
                          stackIn_75_0 = stackOut_74_0;
                          return stackIn_75_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if (param1 == 85) {
                        if (((nk) this).field_L != ((nk) this).field_O) {
                          this.a(false);
                          stackOut_63_0 = 1;
                          stackIn_64_0 = stackOut_63_0;
                          return stackIn_64_0 != 0;
                        } else {
                          if (((nk) this).field_O <= 0) {
                            break L7;
                          } else {
                            ((nk) this).field_L = -1 + ((nk) this).field_O;
                            this.a(false);
                            stackOut_61_0 = 1;
                            stackIn_62_0 = stackOut_61_0;
                            return stackIn_62_0 != 0;
                          }
                        }
                      } else {
                        if (param1 == 101) {
                          if (((nk) this).field_L == ((nk) this).field_O) {
                            if (((nk) this).field_O >= ((nk) this).field_q.length()) {
                              break L7;
                            } else {
                              ((nk) this).field_L = 1 + ((nk) this).field_O;
                              this.a(false);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0 != 0;
                            }
                          } else {
                            this.a(false);
                            stackOut_54_0 = 1;
                            stackIn_55_0 = stackOut_54_0;
                            return stackIn_55_0 != 0;
                          }
                        } else {
                          if (13 == param1) {
                            ((nk) this).o(1);
                            stackOut_51_0 = 1;
                            stackIn_52_0 = stackOut_51_0;
                            return stackIn_52_0 != 0;
                          } else {
                            if (param1 == 96) {
                              if (0 >= ((nk) this).field_O) {
                                break L7;
                              } else {
                                L8: {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = -31523;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if (lk.field_g[82]) {
                                    stackOut_48_0 = this;
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = this.a((byte) -37);
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    break L8;
                                  } else {
                                    stackOut_47_0 = this;
                                    stackOut_47_1 = stackIn_47_1;
                                    stackOut_47_2 = -1 + ((nk) this).field_O;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    stackIn_49_2 = stackOut_47_2;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_49_1, stackIn_49_2);
                                stackOut_49_0 = 1;
                                stackIn_50_0 = stackOut_49_0;
                                return stackIn_50_0 != 0;
                              }
                            } else {
                              if (param1 == 97) {
                                if (((nk) this).field_O >= ((nk) this).field_q.length()) {
                                  break L7;
                                } else {
                                  L9: {
                                    stackOut_40_0 = this;
                                    stackOut_40_1 = -31523;
                                    stackIn_42_0 = stackOut_40_0;
                                    stackIn_42_1 = stackOut_40_1;
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    if (!lk.field_g[82]) {
                                      stackOut_42_0 = this;
                                      stackOut_42_1 = stackIn_42_1;
                                      stackOut_42_2 = 1 + ((nk) this).field_O;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      stackIn_43_2 = stackOut_42_2;
                                      break L9;
                                    } else {
                                      stackOut_41_0 = this;
                                      stackOut_41_1 = stackIn_41_1;
                                      stackOut_41_2 = this.e((byte) -88);
                                      stackIn_43_0 = stackOut_41_0;
                                      stackIn_43_1 = stackOut_41_1;
                                      stackIn_43_2 = stackOut_41_2;
                                      break L9;
                                    }
                                  }
                                  this.a(stackIn_43_1, stackIn_43_2);
                                  stackOut_43_0 = 1;
                                  stackIn_44_0 = stackOut_43_0;
                                  return stackIn_44_0 != 0;
                                }
                              } else {
                                if (param1 != 102) {
                                  if (103 != param1) {
                                    if (84 == param1) {
                                      this.l(93);
                                      stackOut_37_0 = 1;
                                      stackIn_38_0 = stackOut_37_0;
                                      return stackIn_38_0 != 0;
                                    } else {
                                      L10: {
                                        if (!lk.field_g[82]) {
                                          break L10;
                                        } else {
                                          if (param1 == 65) {
                                            this.m(103);
                                            stackOut_35_0 = 1;
                                            stackIn_36_0 = stackOut_35_0;
                                            return stackIn_36_0 != 0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (!lk.field_g[82]) {
                                          break L11;
                                        } else {
                                          if (param1 == 66) {
                                            this.j(-73);
                                            stackOut_33_0 = 1;
                                            stackIn_34_0 = stackOut_33_0;
                                            return stackIn_34_0 != 0;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      if (!lk.field_g[82]) {
                                        break L7;
                                      } else {
                                        if (67 != param1) {
                                          break L7;
                                        } else {
                                          this.b(true);
                                          stackOut_31_0 = 1;
                                          stackIn_32_0 = stackOut_31_0;
                                          return stackIn_32_0 != 0;
                                        }
                                      }
                                    }
                                  } else {
                                    this.a(-31523, ((nk) this).field_q.length());
                                    stackOut_20_0 = 1;
                                    stackIn_21_0 = stackOut_20_0;
                                    return stackIn_21_0 != 0;
                                  }
                                } else {
                                  this.a(-31523, 0);
                                  stackOut_17_0 = 1;
                                  stackIn_18_0 = stackOut_17_0;
                                  return stackIn_18_0 != 0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    break L0;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("nk.T(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_77_0 != 0;
    }

    private final void j(int param0) {
        try {
            String var2 = null;
            var2 = this.g((byte) -126);
            if (param0 <= -37) {
              if (var2.length() > 0) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              ((nk) this).field_I = false;
              if (var2.length() <= 0) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20)), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              if (param2 == 1471) {
                break L2;
              } else {
                ((nk) this).o(114);
                break L2;
              }
            }
            L3: {
              ((nk) this).field_q = param1;
              var4_int = param1.length();
              if (((nk) this).field_N == -1) {
                break L3;
              } else {
                if (((nk) this).field_N >= var4_int) {
                  break L3;
                } else {
                  ((nk) this).field_q = ((nk) this).field_q.substring(0, ((nk) this).field_N);
                  break L3;
                }
              }
            }
            int dupTemp$2 = ((nk) this).field_q.length();
            ((nk) this).field_L = dupTemp$2;
            ((nk) this).field_O = dupTemp$2;
            if (param0) {
              break L0;
            } else {
              ((nk) this).f((byte) 19);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("nk.FA(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    final void o(int param0) {
        ((nk) this).field_O = 0;
        ((nk) this).field_q = "";
        ((nk) this).field_L = 0;
        ((nk) this).f((byte) 105);
        if (param0 != 1) {
            this.b(true);
        }
    }

    public static void n(int param0) {
        field_M = null;
        field_J = null;
        if (param0 != 3875) {
            return;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Create a free account to";
    }
}
