/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk extends ek {
    static qk field_L;
    private int field_Q;
    static String field_N;
    static int field_cb;
    static String[] field_P;
    private long field_Z;
    static String field_bb;
    static String[] field_O;
    private boolean field_T;
    private int field_M;
    static String field_U;
    static java.security.SecureRandom field_K;
    private long field_ab;
    static mm field_R;
    static String field_Y;
    private int field_S;
    private int field_X;
    private boolean field_W;
    static int field_V;

    void l(int param0) {
        if (param0 != 18929) {
            field_K = null;
        }
        if (!(!(((rk) this).field_v instanceof qh))) {
            ((qh) (Object) ((rk) this).field_v).a(16737894, (rk) this);
        }
    }

    final void a(String param0, byte param1, boolean param2) {
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
              if (param0 != null) {
                break L1;
              } else {
                param0 = "";
                break L1;
              }
            }
            L2: {
              ((rk) this).field_E = param0;
              var4_int = param0.length();
              if (((rk) this).field_X == -1) {
                break L2;
              } else {
                if (((rk) this).field_X >= var4_int) {
                  break L2;
                } else {
                  ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_X);
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$3 = ((rk) this).field_E.length();
              ((rk) this).field_M = dupTemp$3;
              ((rk) this).field_S = dupTemp$3;
              if (param1 == 114) {
                break L3;
              } else {
                field_U = null;
                break L3;
              }
            }
            L4: {
              if (!param2) {
                ((rk) this).l(18929);
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("rk.L(");
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k() {
        cf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nl var9 = null;
        var8 = client.field_A ? 1 : 0;
        if (!((rk) this).field_T) {
          ((rk) this).field_x = 0;
          ((rk) this).field_F = 0;
          return;
        } else {
          if (!(((rk) this).field_p instanceof nl)) {
            return;
          } else {
            var9 = (nl) (Object) ((rk) this).field_p;
            var3 = var9.a((ce) this, (byte) 118);
            var4 = var3.a(false);
            var5 = var9.a(false, (ce) this);
            var6 = var9.a((byte) -106) >> 1;
            if (var4 >= var5 + -var6) {
              L0: {
                var7 = ((rk) this).field_x + var3.a((byte) -94, ((rk) this).field_S);
                if (var5 + -var6 < var7) {
                  ((rk) this).field_x = ((rk) this).field_x + (-var6 + var5) + -var7;
                  break L0;
                } else {
                  if (var6 <= var7) {
                    break L0;
                  } else {
                    ((rk) this).field_x = ((rk) this).field_x - (-var6 + var7);
                    break L0;
                  }
                }
              }
              L1: {
                if (0 < ((rk) this).field_x) {
                  ((rk) this).field_x = 0;
                  break L1;
                } else {
                  if (-var5 - -var6 <= ((rk) this).field_x) {
                    break L1;
                  } else {
                    ((rk) this).field_x = -var5 - -var6;
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((rk) this).field_F = 0;
              ((rk) this).field_x = 0;
              return;
            }
          }
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((rk) this).field_S == ((rk) this).field_M)) {
            var2 = ((rk) this).field_S <= ((rk) this).field_M ? ((rk) this).field_S : ((rk) this).field_M;
            var3 = ((rk) this).field_S <= ((rk) this).field_M ? ((rk) this).field_M : ((rk) this).field_S;
            ((rk) this).field_M = var2;
            ((rk) this).field_S = var2;
            ((rk) this).field_E = ((rk) this).field_E.substring(0, var2) + ((rk) this).field_E.substring(var3, ((rk) this).field_E.length());
            ((rk) this).l(18929);
        }
        var2 = -30 / ((param0 - 40) / 59);
    }

    private final int e() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var2 = ((rk) this).field_E.length();
        if (var2 == ((rk) this).field_S) {
          return ((rk) this).field_S;
        } else {
          var3 = 1 + ((rk) this).field_S;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (((rk) this).field_E.charAt(var3 + -1) == 32) {
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

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
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
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              if (((rk) this).field_p instanceof nl) {
                L1: {
                  var8_int = ((nl) (Object) ((rk) this).field_p).a(param5, -257, (ce) this, param4, pm.field_f, bh.field_g);
                  stackOut_3_0 = this;
                  stackOut_3_1 = param6 ^ 30294;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var8_int == -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, stackIn_6_2);
                  var8_long = ik.a(4);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -((rk) this).field_ab + var8_long) {
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
                  ((rk) this).field_W = stackIn_9_1 != 0;
                  if (((rk) this).field_W) {
                    L4: {
                      int discarded$2 = 0;
                      ((rk) this).field_M = this.n();
                      int discarded$3 = -30;
                      ((rk) this).field_S = this.e();
                      if (((rk) this).field_S <= 0) {
                        break L4;
                      } else {
                        if (((rk) this).field_E.charAt(-1 + ((rk) this).field_S) != 32) {
                          break L4;
                        } else {
                          ((rk) this).field_S = ((rk) this).field_S - 1;
                          break L4;
                        }
                      }
                    }
                    ((rk) this).field_Q = ((rk) this).field_S;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((rk) this).field_ab = var8_long;
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
            stackOut_19_1 = new StringBuilder().append("rk.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void g(byte param0) {
        this.h((byte) -113);
        this.f((byte) -95);
    }

    private final void b() {
        if (!(!(((rk) this).field_v instanceof qh))) {
            ((qh) (Object) ((rk) this).field_v).b(-2569, (rk) this);
        }
    }

    rk(String param0, kg param1, int param2) {
        super(param0, param1);
        ((rk) this).field_ab = 0L;
        ((rk) this).field_Q = -1;
        ((rk) this).field_W = false;
        try {
            ((rk) this).field_X = param2;
            ((rk) this).field_p = bf.field_x.field_l;
            ((rk) this).a(param0, (byte) 114, true);
            ((rk) this).field_T = true;
            ((rk) this).field_Z = ik.a(4);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void c(boolean param0) {
        int discarded$0 = -1199770620;
        em.a();
        hm.a(4, (byte) -104);
    }

    private final void a(String param0) {
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
              if (0 == ((rk) this).field_X) {
                break L1;
              } else {
                var3_int = ((rk) this).field_X + -((rk) this).field_E.length();
                if (-1 > var3_int) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((rk) this).field_S == ((rk) this).field_E.length()) {
                ((rk) this).field_E = ((rk) this).field_E + param0;
                break L2;
              } else {
                ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_S) + param0 + ((rk) this).field_E.substring(((rk) this).field_S, ((rk) this).field_E.length());
                break L2;
              }
            }
            ((rk) this).field_S = ((rk) this).field_S + param0.length();
            ((rk) this).field_M = ((rk) this).field_S;
            ((rk) this).l(18929);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rk.I(");
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
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + true + ')');
        }
    }

    private final void h() {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.f((byte) -92);
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

    final void a(int param0, int param1, int param2, int param3) {
        nl var9 = null;
        long var6 = 0L;
        if (param1 > -103) {
            Object var8 = null;
            boolean discarded$0 = ((rk) this).a(-88, -47, (ce) null, '%');
        }
        if (null != ((rk) this).field_p) {
            if (!(param2 != 0)) {
                ((rk) this).field_p.a(((rk) this).field_I, param0, param3, (byte) -110, (ce) this);
                if (((rk) this).field_p instanceof nl) {
                    var9 = (nl) (Object) ((rk) this).field_p;
                    if (((rk) this).field_M != ((rk) this).field_S) {
                        var9.a(((rk) this).field_M, ((rk) this).field_S, param3, param0, -123, (ce) this);
                    }
                    var6 = ik.a(4);
                    if ((var6 + -((rk) this).field_Z) % 1000L < 500L) {
                        var9.a((ce) this, ((rk) this).field_S, 1, param0, param3);
                    }
                }
            }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        nl var5 = null;
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
              super.a(param0, 94, param2, param3);
              int discarded$2 = -17122;
              this.k();
              if (((rk) this).field_o != 1) {
                break L1;
              } else {
                L2: {
                  if (!(((rk) this).field_p instanceof nl)) {
                    break L2;
                  } else {
                    var5 = (nl) (Object) ((rk) this).field_p;
                    var6 = var5.a(param3, -257, (ce) this, param2, pm.field_f, bh.field_g);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((rk) this).field_W) {
                          break L3;
                        } else {
                          if (((rk) this).field_Q <= var6) {
                            break L3;
                          } else {
                            if (((rk) this).field_M < var6) {
                              var6 = ((rk) this).field_Q;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((rk) this).field_S = var6;
                      break L2;
                    }
                  }
                }
                ((rk) this).field_Z = ik.a(4);
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
            stackOut_11_1 = new StringBuilder().append("rk.A(");
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
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 50 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void m(int param0) {
        ((rk) this).field_M = param0;
        ((rk) this).field_E = "";
        ((rk) this).field_S = 0;
        ((rk) this).l(18929);
    }

    private final String i(int param0) {
        int var2 = ((rk) this).field_S > ((rk) this).field_M ? ((rk) this).field_M : ((rk) this).field_S;
        if (param0 <= 102) {
            return null;
        }
        int var3 = ((rk) this).field_M >= ((rk) this).field_S ? ((rk) this).field_M : ((rk) this).field_S;
        return ((rk) this).field_E.substring(var2, var3);
    }

    public static void j() {
        field_N = null;
        field_R = null;
        field_L = null;
        field_Y = null;
        field_P = null;
        field_U = null;
        field_bb = null;
        field_O = null;
        field_K = null;
    }

    private final void b(int param0, int param1) {
        ((rk) this).field_S = param1;
        if (!(bj.field_d[81])) {
            ((rk) this).field_M = ((rk) this).field_S;
        }
        if (param0 != -30305) {
            ((rk) this).field_Z = 4L;
        }
    }

    private final void h(byte param0) {
        String var2 = this.i(127);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.i(103)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 > -96) {
            int discarded$0 = 1;
            this.a((String) null);
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
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
        int stackOut_73_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_30_0 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              ((rk) this).field_Z = ik.a(4);
              if (60 == param3) {
                break L1;
              } else {
                if (param3 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (32 > param3) {
                      break L2;
                    } else {
                      if (param3 <= 126) {
                        L3: {
                          if (~((rk) this).field_S == ~((rk) this).field_M) {
                            break L3;
                          } else {
                            this.f((byte) -94);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (((rk) this).field_X == -1) {
                              break L5;
                            } else {
                              if (~((rk) this).field_E.length() <= ~((rk) this).field_X) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (~((rk) this).field_S > ~((rk) this).field_E.length()) {
                              ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_S) + param3 + ((rk) this).field_E.substring(((rk) this).field_S, ((rk) this).field_E.length());
                              ((rk) this).field_S = ((rk) this).field_S + 1;
                              ((rk) this).field_M = ((rk) this).field_S;
                              break L6;
                            } else {
                              ((rk) this).field_E = ((rk) this).field_E + param3;
                              int dupTemp$5 = ((rk) this).field_E.length();
                              ((rk) this).field_S = dupTemp$5;
                              ((rk) this).field_M = dupTemp$5;
                              break L6;
                            }
                          }
                          ((rk) this).l(18929);
                          break L4;
                        }
                        stackOut_73_0 = 1;
                        stackIn_74_0 = stackOut_73_0;
                        return stackIn_74_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param1 == 85) {
                      if (((rk) this).field_M == ((rk) this).field_S) {
                        if (((rk) this).field_S <= 0) {
                          break L7;
                        } else {
                          ((rk) this).field_M = -1 + ((rk) this).field_S;
                          this.f((byte) 113);
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0 != 0;
                        }
                      } else {
                        this.f((byte) -94);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      }
                    } else {
                      if (param1 != 101) {
                        if (param1 != 13) {
                          if (param1 != 96) {
                            if (param1 == 97) {
                              if (~((rk) this).field_S <= ~((rk) this).field_E.length()) {
                                break L7;
                              } else {
                                L8: {
                                  stackOut_53_0 = this;
                                  stackOut_53_1 = -30305;
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  if (bj.field_d[82]) {
                                    int discarded$6 = -30;
                                    stackOut_55_0 = this;
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = this.e();
                                    stackIn_56_0 = stackOut_55_0;
                                    stackIn_56_1 = stackOut_55_1;
                                    stackIn_56_2 = stackOut_55_2;
                                    break L8;
                                  } else {
                                    stackOut_54_0 = this;
                                    stackOut_54_1 = stackIn_54_1;
                                    stackOut_54_2 = 1 + ((rk) this).field_S;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_56_1 = stackOut_54_1;
                                    stackIn_56_2 = stackOut_54_2;
                                    break L8;
                                  }
                                }
                                this.b(stackIn_56_1, stackIn_56_2);
                                stackOut_56_0 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0 != 0;
                              }
                            } else {
                              if (102 != param1) {
                                if (param1 == 103) {
                                  this.b(-30305, ((rk) this).field_E.length());
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  return stackIn_51_0 != 0;
                                } else {
                                  if (param1 != 84) {
                                    L9: {
                                      if (!bj.field_d[82]) {
                                        break L9;
                                      } else {
                                        if (param1 == 65) {
                                          this.g((byte) -76);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          return stackIn_49_0 != 0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!bj.field_d[82]) {
                                        break L10;
                                      } else {
                                        if (66 == param1) {
                                          this.h((byte) -101);
                                          stackOut_46_0 = 1;
                                          stackIn_47_0 = stackOut_46_0;
                                          return stackIn_47_0 != 0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!bj.field_d[82]) {
                                      break L7;
                                    } else {
                                      if (param1 != 67) {
                                        break L7;
                                      } else {
                                        int discarded$7 = 118;
                                        this.h();
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      }
                                    }
                                  } else {
                                    int discarded$8 = 0;
                                    this.b();
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    return stackIn_35_0 != 0;
                                  }
                                }
                              } else {
                                this.b(-30305, 0);
                                stackOut_30_0 = 1;
                                stackIn_31_0 = stackOut_30_0;
                                return stackIn_31_0 != 0;
                              }
                            }
                          } else {
                            if (0 < ((rk) this).field_S) {
                              L11: {
                                stackOut_23_0 = this;
                                stackOut_23_1 = -30305;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (bj.field_d[82]) {
                                  int discarded$9 = 0;
                                  stackOut_25_0 = this;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = this.n();
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  stackIn_26_2 = stackOut_25_2;
                                  break L11;
                                } else {
                                  stackOut_24_0 = this;
                                  stackOut_24_1 = stackIn_24_1;
                                  stackOut_24_2 = -1 + ((rk) this).field_S;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  stackIn_26_2 = stackOut_24_2;
                                  break L11;
                                }
                              }
                              this.b(stackIn_26_1, stackIn_26_2);
                              stackOut_26_0 = 1;
                              stackIn_27_0 = stackOut_26_0;
                              return stackIn_27_0 != 0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          ((rk) this).m(0);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      } else {
                        if (((rk) this).field_S != ((rk) this).field_M) {
                          this.f((byte) -65);
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        } else {
                          if (~((rk) this).field_S > ~((rk) this).field_E.length()) {
                            ((rk) this).field_M = 1 + ((rk) this).field_S;
                            this.f((byte) -50);
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  var5_int = -114 / ((-22 - param0) / 49);
                  stackOut_75_0 = 0;
                  stackIn_76_0 = stackOut_75_0;
                  break L0;
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
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("rk.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L12;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L12;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param3 + ')');
        }
        return stackIn_76_0 != 0;
    }

    private final int n() {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        if (0 != ((rk) this).field_S) {
          var2 = ((rk) this).field_S - 1;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (((rk) this).field_E.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return ((rk) this).field_S;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new String[]{"Get four of the same colour touching!", "The wildcard special item (multicoloured star) can be used in place of any other colour!", "Watch out! All shapes you match will now come back as solid shapes. Match four loose pieces of the same colour against the solid shape to get rid of it again.", "Did you know that if you get two or more matches at the same time, you get a special item?"};
        field_bb = "Suggest muting this player";
        field_U = "You have entered another game.";
        field_N = "To clear a solid shape, make another shape of the same colour against it.";
        field_V = -1;
    }
}
