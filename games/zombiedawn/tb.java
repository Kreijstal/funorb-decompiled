/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb extends an {
    private int field_L;
    static int field_E;
    private int field_N;
    private int field_H;
    private boolean field_F;
    static vn field_G;
    private long field_M;
    private int field_O;
    private boolean field_I;
    private long field_J;
    static dj field_K;

    private final void c() {
        if (!(!(((tb) this).field_v instanceof ok))) {
            ((ok) (Object) ((tb) this).field_v).b((tb) this, -19);
        }
    }

    private final int b() {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (((tb) this).field_N != 0) {
          var2 = ((tb) this).field_N - 1;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((tb) this).field_o.charAt(var2 - 1)) {
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
          return ((tb) this).field_N;
        }
    }

    private final void g() {
        this.k(-127);
        this.h(121);
    }

    final static vn[] c(int param0, int param1, int param2, int param3) {
        if (param2 != -2967) {
            return null;
        }
        return kj.a(1, param1, 12692, param3, param0);
    }

    final void a(boolean param0, boolean param1, String param2) {
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
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              ((tb) this).field_o = param2;
              var4_int = param2.length();
              if (((tb) this).field_O == -1) {
                break L2;
              } else {
                if (var4_int <= ((tb) this).field_O) {
                  break L2;
                } else {
                  ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_O);
                  break L2;
                }
              }
            }
            int dupTemp$2 = ((tb) this).field_o.length();
            ((tb) this).field_H = dupTemp$2;
            ((tb) this).field_N = dupTemp$2;
            if (!param0) {
              L3: {
                if (!param1) {
                  ((tb) this).d((byte) 77);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("tb.LA(").append(param0).append(44).append(param1).append(44);
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
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((tb) this).field_H == ((tb) this).field_N)) {
            var2 = ((tb) this).field_H < ((tb) this).field_N ? ((tb) this).field_H : ((tb) this).field_N;
            var3 = ((tb) this).field_N > ((tb) this).field_H ? ((tb) this).field_N : ((tb) this).field_H;
            ((tb) this).field_H = var2;
            ((tb) this).field_N = var2;
            ((tb) this).field_o = ((tb) this).field_o.substring(0, var2) + ((tb) this).field_o.substring(var3, ((tb) this).field_o.length());
            ((tb) this).d((byte) -113);
        }
        var2 = -113 % ((param0 - -26) / 49);
    }

    final void j(int param0) {
        ((tb) this).field_o = "";
        ((tb) this).field_H = 0;
        ((tb) this).field_N = param0;
        ((tb) this).d((byte) 119);
    }

    void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        ak var6 = null;
        int var7 = 0;
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
              var5_int = -108;
              super.a(param0, (byte) 119, param2, param3);
              int discarded$2 = -94;
              this.i();
              if (1 != ((tb) this).field_m) {
                break L1;
              } else {
                L2: {
                  if (((tb) this).field_h instanceof ak) {
                    var6 = (ak) (Object) ((tb) this).field_h;
                    var7 = var6.a((ga) this, -1, param2, ha.field_b, ei.field_K, param3);
                    if (-1 == var7) {
                      break L2;
                    } else {
                      L3: {
                        if (!((tb) this).field_F) {
                          break L3;
                        } else {
                          if (var7 >= ((tb) this).field_L) {
                            break L3;
                          } else {
                            if (((tb) this).field_H >= var7) {
                              break L3;
                            } else {
                              var7 = ((tb) this).field_L;
                              break L3;
                            }
                          }
                        }
                      }
                      ((tb) this).field_N = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((tb) this).field_M = pd.a(-22826);
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
            stackOut_11_1 = new StringBuilder().append("tb.D(");
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
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 121 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void d(byte param0) {
        if (!(!(((tb) this).field_v instanceof ok))) {
            ((ok) (Object) ((tb) this).field_v).a((tb) this, 8);
        }
        int var2 = 4 % ((-50 - param0) / 49);
    }

    tb(String param0, sk param1, int param2) {
        super(param0, param1);
        ((tb) this).field_L = -1;
        ((tb) this).field_F = false;
        ((tb) this).field_J = 0L;
        try {
            ((tb) this).field_h = se.field_j.field_b;
            ((tb) this).field_O = param2;
            ((tb) this).a(false, true, param0);
            ((tb) this).field_I = true;
            ((tb) this).field_M = pd.a(-22826);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "tb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final int f() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var2 = ((tb) this).field_o.length();
        if (var2 != ((tb) this).field_N) {
          var3 = ((tb) this).field_N - -1;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (((tb) this).field_o.charAt(var3 - 1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        } else {
          return ((tb) this).field_N;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ak var8 = null;
        long var6 = 0L;
        if (param3 != 0) {
            byte discarded$0 = tb.a('ﾲ', 59);
        }
        if (((tb) this).field_h != null) {
            if (param1 == 0) {
                ((tb) this).field_h.a(16777215, ((tb) this).field_C, param0, (ga) this, param2);
                if (!(!(((tb) this).field_h instanceof ak))) {
                    var8 = (ak) (Object) ((tb) this).field_h;
                    if (!(((tb) this).field_H == ((tb) this).field_N)) {
                        var8.a(-118, ((tb) this).field_H, param0, (ga) this, param2, ((tb) this).field_N);
                    }
                    var6 = pd.a(-22826);
                    if (!((var6 + -((tb) this).field_M) % 1000L >= 500L)) {
                        var8.a(((tb) this).field_N, param2, param0, param3 ^ -39, (ga) this);
                    }
                }
            }
        }
    }

    public static void d(boolean param0) {
        field_G = null;
        field_K = null;
        if (!param0) {
            tb.d(true);
        }
    }

    private final void k(int param0) {
        if (param0 >= -40) {
            return;
        }
        String var2 = this.e((byte) 112);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.e((byte) -10)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(String param0) {
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
              if (((tb) this).field_O == -1) {
                break L1;
              } else {
                var3_int = ((tb) this).field_O + -((tb) this).field_o.length();
                if (0 > var3_int) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((tb) this).field_N == ((tb) this).field_o.length()) {
                ((tb) this).field_o = ((tb) this).field_o + param0;
                break L2;
              } else {
                ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_N) + param0 + ((tb) this).field_o.substring(((tb) this).field_N, ((tb) this).field_o.length());
                break L2;
              }
            }
            ((tb) this).field_N = ((tb) this).field_N + param0.length();
            ((tb) this).field_H = ((tb) this).field_N;
            ((tb) this).d((byte) -103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("tb.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + -37 + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param1.length()) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (param1.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("tb.S(").append(-10723).append(44);
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final void a(int param0, int param1) {
        ((tb) this).field_N = param0;
        if (!bo.field_p[81]) {
            ((tb) this).field_H = ((tb) this).field_N;
        }
    }

    private final void g(int param0) {
        try {
            int var2 = 0;
            Exception var3 = null;
            String var3_ref = null;
            Throwable decompiledCaughtException = null;
            var2 = -1;
            try {
              L0: {
                var3_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.h(127);
                int discarded$1 = -37;
                this.a(var3_ref);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String e(byte param0) {
        int var2 = ((tb) this).field_N <= ((tb) this).field_H ? ((tb) this).field_N : ((tb) this).field_H;
        int var4 = -7 / ((param0 - 66) / 34);
        int var3 = ((tb) this).field_H < ((tb) this).field_N ? ((tb) this).field_N : ((tb) this).field_H;
        return ((tb) this).field_o.substring(var2, var3);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
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
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
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
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (((tb) this).field_h instanceof ak) {
                  L2: {
                    var8_int = ((ak) (Object) ((tb) this).field_h).a((ga) this, param1 + -2, param2, ha.field_b, ei.field_K, param4);
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
                    this.a(stackIn_6_1, 81);
                    var8_long = pd.a(param1 + -22827);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (-((tb) this).field_J + var8_long >= 250L) {
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
                    ((tb) this).field_F = stackIn_9_1 != 0;
                    if (((tb) this).field_F) {
                      L5: {
                        int discarded$2 = 1;
                        ((tb) this).field_H = this.b();
                        int discarded$3 = 7;
                        ((tb) this).field_N = this.f();
                        if (((tb) this).field_N <= 0) {
                          break L5;
                        } else {
                          if (((tb) this).field_o.charAt(-1 + ((tb) this).field_N) != 32) {
                            break L5;
                          } else {
                            ((tb) this).field_N = ((tb) this).field_N - 1;
                            break L5;
                          }
                        }
                      }
                      ((tb) this).field_L = ((tb) this).field_N;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((tb) this).field_J = var8_long;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 == 1) {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("tb.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    private final void i() {
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ak var9 = null;
        var8 = ZombieDawn.field_J;
        if (!((tb) this).field_I) {
          ((tb) this).field_u = 0;
          ((tb) this).field_p = 0;
          return;
        } else {
          if (((tb) this).field_h instanceof ak) {
            var9 = (ak) (Object) ((tb) this).field_h;
            var3 = var9.a(98, (ga) this);
            var4 = var3.b((byte) 123);
            var5 = var9.a((byte) 124, (ga) this);
            var6 = var9.a(5) >> 1;
            if (var5 - var6 <= var4) {
              L0: {
                var7 = ((tb) this).field_u - -var3.a((byte) -72, ((tb) this).field_N);
                if (var7 <= var5 - var6) {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    ((tb) this).field_u = ((tb) this).field_u - -var6 + -var7;
                    break L0;
                  }
                } else {
                  ((tb) this).field_u = var5 - (var6 + (var7 - ((tb) this).field_u));
                  break L0;
                }
              }
              L1: {
                if (0 < ((tb) this).field_u) {
                  ((tb) this).field_u = 0;
                  break L1;
                } else {
                  if (-var5 - -var6 > ((tb) this).field_u) {
                    ((tb) this).field_u = var6 + -var5;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((tb) this).field_u = 0;
              ((tb) this).field_p = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = ZombieDawn.field_J;
              if (0 >= param0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 > 255) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            if (8364 == param0) {
              var2 = -128;
              break L0;
            } else {
              if (param0 == 8218) {
                var2 = -126;
                break L0;
              } else {
                if (param0 == 402) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param0 != 8222) {
                    if (param0 == 8230) {
                      var2 = -123;
                      break L0;
                    } else {
                      if (param0 != 8224) {
                        if (8225 == param0) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param0 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L0;
                            } else {
                              if (352 == param0) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param0 != 381) {
                                      if (param0 != 8216) {
                                        if (param0 == 8217) {
                                          var2 = -110;
                                          break L0;
                                        } else {
                                          if (param0 != 8220) {
                                            if (param0 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L0;
                                              } else {
                                                if (8211 != param0) {
                                                  if (param0 == 8212) {
                                                    var2 = -105;
                                                    break L0;
                                                  } else {
                                                    if (732 == param0) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param0 == 8482) {
                                                        var2 = -103;
                                                        break L0;
                                                      } else {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                          break L0;
                                                        } else {
                                                          if (param0 != 8250) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param0 != 382) {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2 = -122;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -124;
                    break L0;
                  }
                }
              }
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        if (param1 == -8225) {
          return (byte) var2;
        } else {
          return (byte) 9;
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_74_0 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_76_0 = 0;
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
            ((tb) this).field_M = pd.a(-22826);
            if (param3 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param3 != 62) {
                L1: {
                  var5_int = -121 / ((param0 - -83) / 32);
                  if (param3 < 32) {
                    break L1;
                  } else {
                    if (126 >= param3) {
                      L2: {
                        if (((tb) this).field_N != ((tb) this).field_H) {
                          this.h(77);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == ((tb) this).field_O) {
                            break L4;
                          } else {
                            if (~((tb) this).field_o.length() > ~((tb) this).field_O) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (~((tb) this).field_N > ~((tb) this).field_o.length()) {
                            ((tb) this).field_o = ((tb) this).field_o.substring(0, ((tb) this).field_N) + param3 + ((tb) this).field_o.substring(((tb) this).field_N, ((tb) this).field_o.length());
                            ((tb) this).field_N = ((tb) this).field_N + 1;
                            ((tb) this).field_H = ((tb) this).field_N;
                            break L5;
                          } else {
                            ((tb) this).field_o = ((tb) this).field_o + param3;
                            int dupTemp$5 = ((tb) this).field_o.length();
                            ((tb) this).field_N = dupTemp$5;
                            ((tb) this).field_H = dupTemp$5;
                            break L5;
                          }
                        }
                        ((tb) this).d((byte) -101);
                        break L3;
                      }
                      stackOut_74_0 = 1;
                      stackIn_75_0 = stackOut_74_0;
                      return stackIn_75_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (param1 != 85) {
                    if (param1 != 101) {
                      if (param1 != 13) {
                        if (param1 == 96) {
                          if (((tb) this).field_N > 0) {
                            L7: {
                              stackOut_59_0 = this;
                              stackIn_61_0 = stackOut_59_0;
                              stackIn_60_0 = stackOut_59_0;
                              if (!bo.field_p[82]) {
                                stackOut_61_0 = this;
                                stackOut_61_1 = ((tb) this).field_N - 1;
                                stackIn_62_0 = stackOut_61_0;
                                stackIn_62_1 = stackOut_61_1;
                                break L7;
                              } else {
                                int discarded$6 = 1;
                                stackOut_60_0 = this;
                                stackOut_60_1 = this.b();
                                stackIn_62_0 = stackOut_60_0;
                                stackIn_62_1 = stackOut_60_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_62_1, 81);
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            return stackIn_63_0 != 0;
                          } else {
                            break L6;
                          }
                        } else {
                          if (param1 != 97) {
                            if (param1 != 102) {
                              if (param1 == 103) {
                                this.a(((tb) this).field_o.length(), 81);
                                stackOut_55_0 = 1;
                                stackIn_56_0 = stackOut_55_0;
                                return stackIn_56_0 != 0;
                              } else {
                                if (84 != param1) {
                                  L8: {
                                    if (!bo.field_p[82]) {
                                      break L8;
                                    } else {
                                      if (65 == param1) {
                                        int discarded$7 = -58;
                                        this.g();
                                        stackOut_53_0 = 1;
                                        stackIn_54_0 = stackOut_53_0;
                                        return stackIn_54_0 != 0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!bo.field_p[82]) {
                                      break L9;
                                    } else {
                                      if (param1 != 66) {
                                        break L9;
                                      } else {
                                        this.k(-111);
                                        stackOut_47_0 = 1;
                                        stackIn_48_0 = stackOut_47_0;
                                        return stackIn_48_0 != 0;
                                      }
                                    }
                                  }
                                  if (!bo.field_p[82]) {
                                    break L6;
                                  } else {
                                    if (67 != param1) {
                                      break L6;
                                    } else {
                                      this.g(91);
                                      stackOut_51_0 = 1;
                                      stackIn_52_0 = stackOut_51_0;
                                      return stackIn_52_0 != 0;
                                    }
                                  }
                                } else {
                                  int discarded$8 = 0;
                                  this.c();
                                  stackOut_40_0 = 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0 != 0;
                                }
                              }
                            } else {
                              this.a(0, 81);
                              stackOut_36_0 = 1;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            }
                          } else {
                            if (~((tb) this).field_N > ~((tb) this).field_o.length()) {
                              L10: {
                                stackOut_30_0 = this;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (!bo.field_p[82]) {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = 1 + ((tb) this).field_N;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  break L10;
                                } else {
                                  int discarded$9 = 7;
                                  stackOut_31_0 = this;
                                  stackOut_31_1 = this.f();
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  break L10;
                                }
                              }
                              this.a(stackIn_33_1, 81);
                              stackOut_33_0 = 1;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        ((tb) this).j(0);
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      }
                    } else {
                      if (((tb) this).field_H != ((tb) this).field_N) {
                        this.h(-96);
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      } else {
                        if (~((tb) this).field_N > ~((tb) this).field_o.length()) {
                          ((tb) this).field_H = ((tb) this).field_N - -1;
                          this.h(-82);
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  } else {
                    if (((tb) this).field_H == ((tb) this).field_N) {
                      if (((tb) this).field_N <= 0) {
                        break L6;
                      } else {
                        ((tb) this).field_H = -1 + ((tb) this).field_N;
                        this.h(75);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    } else {
                      this.h(28);
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
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
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("tb.I(").append(param0).append(44).append(param1).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L11;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L11;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param3 + 41);
        }
        return stackIn_77_0 != 0;
    }

    static {
    }
}
