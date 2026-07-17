/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

class ig extends ph {
    private int field_P;
    private boolean field_G;
    static ej field_N;
    private int field_J;
    static String field_H;
    private int field_O;
    private long field_Q;
    static bd field_S;
    static bd field_R;
    static int field_L;
    private long field_M;
    private int field_K;
    private boolean field_I;

    private final void f(byte param0) {
        this.l(-6200);
        this.b(true);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (((ig) this).field_J == 0) {
          return ((ig) this).field_J;
        } else {
          var2 = -1 + ((ig) this).field_J;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((ig) this).field_n.charAt(var2 - 1)) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (-1 != ((ig) this).field_P) {
            var3_int = ((ig) this).field_P - ((ig) this).field_n.length();
            if (!(var3_int < 0)) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (param0 != 0) {
            return;
        }
        try {
            if (((ig) this).field_J == ((ig) this).field_n.length()) {
                ((ig) this).field_n = ((ig) this).field_n + param1;
            } else {
                ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_J) + param1 + ((ig) this).field_n.substring(((ig) this).field_J, ((ig) this).field_n.length());
            }
            ((ig) this).field_J = ((ig) this).field_J + param1.length();
            ((ig) this).field_K = ((ig) this).field_J;
            ((ig) this).e((byte) 125);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ig.DA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((ig) this).field_n = param2;
              var4_int = param2.length();
              if (((ig) this).field_P == -1) {
                break L2;
              } else {
                if (((ig) this).field_P < var4_int) {
                  ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_P);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$3 = ((ig) this).field_n.length();
              ((ig) this).field_K = dupTemp$3;
              ((ig) this).field_J = dupTemp$3;
              if (param0 >= 18) {
                break L3;
              } else {
                ((ig) this).field_I = true;
                break L3;
              }
            }
            L4: {
              if (!param1) {
                ((ig) this).e((byte) 125);
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ig.AA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_26_0 = null;
        Object stackOut_12_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (param3 == 1) {
                var10 = param1[param2];
                var4 = var10;
                if (var4 != null) {
                  stackOut_9_0 = ((Object) (Object) var10).toString();
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                var4_int = param2 + param3;
                var5 = 0;
                if (param0 == 28) {
                  var6_int = param2;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param2;
                      L2: while (true) {
                        if (~var7 <= ~var4_int) {
                          stackOut_26_0 = var6.toString();
                          stackIn_27_0 = stackOut_26_0;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              StringBuilder discarded$5 = var6.append(var8);
                              break L3;
                            } else {
                              StringBuilder discarded$6 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param1[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (String) (Object) stackIn_13_0;
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
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4_ref;
            stackOut_28_1 = new StringBuilder().append("ig.CA(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_27_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        mi var8 = null;
        long var6 = 0L;
        if (null != ((ig) this).field_h) {
            if (0 == param3) {
                ((ig) this).field_h.a(param0, param1, 15430, (ag) this, ((ig) this).field_D);
                if (!(!(((ig) this).field_h instanceof mi))) {
                    var8 = (mi) (Object) ((ig) this).field_h;
                    if (((ig) this).field_J != ((ig) this).field_K) {
                        var8.a(param1, (byte) 41, ((ig) this).field_K, (ag) this, param0, ((ig) this).field_J);
                    }
                    var6 = hn.a((byte) 80);
                    if (!((-((ig) this).field_M + var6) % 1000L >= 500L)) {
                        var8.a(param0, (ag) this, ((ig) this).field_J, 0, param1);
                    }
                }
            }
        }
        if (param2 <= 42) {
            field_R = null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
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
        int stackOut_18_0 = 0;
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
        int stackOut_16_0 = 0;
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
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              if (((ig) this).field_h instanceof mi) {
                L1: {
                  var8_int = ((mi) (Object) ((ig) this).field_h).a(param1, j.field_c, param4 + -226, (ag) this, param2, rb.field_m);
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
                  this.a(stackIn_6_1, param4 ^ 12);
                  var8_long = hn.a((byte) 80);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -((ig) this).field_Q + var8_long) {
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
                  ((ig) this).field_I = stackIn_9_1 != 0;
                  if (((ig) this).field_I) {
                    L4: {
                      ((ig) this).field_K = this.j(10747);
                      ((ig) this).field_J = this.a(true);
                      if (0 >= ((ig) this).field_J) {
                        break L4;
                      } else {
                        if (((ig) this).field_n.charAt(((ig) this).field_J + -1) == 32) {
                          ((ig) this).field_J = ((ig) this).field_J - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((ig) this).field_O = ((ig) this).field_J;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((ig) this).field_Q = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("ig.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    private final String g(byte param0) {
        int var2 = ((ig) this).field_J <= ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
        int var4 = 102 % ((-29 - param0) / 57);
        int var3 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
        return ((ig) this).field_n.substring(var2, var3);
    }

    private final void l(int param0) {
        String var2 = this.g((byte) 77);
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) 93)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static boolean c(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (fa.field_c < 10) {
              break L1;
            } else {
              if (md.field_k) {
                break L1;
              } else {
                if (kl.b(50)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    private final void k(int param0) {
        if (param0 != -1) {
            ((ig) this).field_O = 45;
        }
        if (((ig) this).field_p instanceof cd) {
            ((cd) (Object) ((ig) this).field_p).a((ig) this, -97);
        }
    }

    private final void h(byte param0) {
        int var8 = HostileSpawn.field_I ? 1 : 0;
        if (!((ig) this).field_G) {
            ((ig) this).field_q = 0;
            ((ig) this).field_o = 0;
            return;
        }
        if (!(((ig) this).field_h instanceof mi)) {
            return;
        }
        mi var9 = (mi) (Object) ((ig) this).field_h;
        ce var3 = var9.a((ag) this, 1);
        int var4 = var3.a(3915);
        int var5 = var9.a((ag) this, (byte) 15);
        int var6 = var9.a(true) >> 1;
        if (var4 < -var6 + var5) {
            ((ig) this).field_q = 0;
            ((ig) this).field_o = 0;
            return;
        }
        int var7 = ((ig) this).field_q - -var3.b(((ig) this).field_J, 0);
        if (-var6 + var5 < var7) {
            ((ig) this).field_q = -var7 - (-var5 - -var6 - ((ig) this).field_q);
        } else {
            if (var6 > var7) {
                ((ig) this).field_q = -var7 - -var6 + ((ig) this).field_q;
            }
        }
        if (0 < ((ig) this).field_q) {
            ((ig) this).field_q = 0;
        } else {
            if (!(var6 + -var5 <= ((ig) this).field_q)) {
                ((ig) this).field_q = var6 + -var5;
            }
        }
    }

    final void o(int param0) {
        if (param0 > -121) {
            return;
        }
        ((ig) this).field_J = 0;
        ((ig) this).field_K = 0;
        ((ig) this).field_n = "";
        ((ig) this).e((byte) 125);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((ig) this).field_K == ((ig) this).field_J)) {
            var2 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_K : ((ig) this).field_J;
            var3 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
            ((ig) this).field_J = var2;
            ((ig) this).field_K = var2;
            ((ig) this).field_n = ((ig) this).field_n.substring(0, var2) + ((ig) this).field_n.substring(var3, ((ig) this).field_n.length());
            ((ig) this).e((byte) 125);
        }
    }

    private final int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = ((ig) this).field_n.length();
        if (var2 == ((ig) this).field_J) {
          return ((ig) this).field_J;
        } else {
          var3 = 1 + ((ig) this).field_J;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (((ig) this).field_n.charAt(var3 - 1) == 32) {
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

    private final void n(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.b(true);
                this.a(0, var2);
            } catch (Exception exception) {
            }
            if (param0 <= 90) {
                this.n(-125);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1) {
        ((ig) this).field_J = param0;
        if (param1 < 92) {
            ((ig) this).field_G = false;
        }
        if (!(qh.field_m[81])) {
            ((ig) this).field_K = ((ig) this).field_J;
        }
    }

    void e(byte param0) {
        if (param0 != 125) {
            return;
        }
        if (((ig) this).field_p instanceof cd) {
            ((cd) (Object) ((ig) this).field_p).a((ig) this, (byte) -125);
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        field_H = null;
        field_S = null;
        if (param0 <= 5) {
            field_L = 78;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_47_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
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
              ((ig) this).field_M = hn.a((byte) 80);
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
                      if (param3 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (~((ig) this).field_J == ~((ig) this).field_K) {
                            break L3;
                          } else {
                            this.b(true);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (((ig) this).field_P == -1) {
                              break L5;
                            } else {
                              if (((ig) this).field_n.length() >= ((ig) this).field_P) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (((ig) this).field_J >= ((ig) this).field_n.length()) {
                              ((ig) this).field_n = ((ig) this).field_n + param3;
                              int dupTemp$1 = ((ig) this).field_n.length();
                              ((ig) this).field_J = dupTemp$1;
                              ((ig) this).field_K = dupTemp$1;
                              break L6;
                            } else {
                              ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_J) + param3 + ((ig) this).field_n.substring(((ig) this).field_J, ((ig) this).field_n.length());
                              ((ig) this).field_J = ((ig) this).field_J + 1;
                              ((ig) this).field_K = ((ig) this).field_J;
                              break L6;
                            }
                          }
                          ((ig) this).e((byte) 125);
                          break L4;
                        }
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      }
                    }
                  }
                  L7: {
                    if (param2 != 85) {
                      if (param2 != 101) {
                        if (13 != param2) {
                          if (param2 != 96) {
                            if (97 == param2) {
                              if (((ig) this).field_J >= ((ig) this).field_n.length()) {
                                break L7;
                              } else {
                                L8: {
                                  stackOut_68_0 = this;
                                  stackIn_70_0 = stackOut_68_0;
                                  stackIn_69_0 = stackOut_68_0;
                                  if (!qh.field_m[82]) {
                                    stackOut_70_0 = this;
                                    stackOut_70_1 = ((ig) this).field_J - -1;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    break L8;
                                  } else {
                                    stackOut_69_0 = this;
                                    stackOut_69_1 = this.a(true);
                                    stackIn_71_0 = stackOut_69_0;
                                    stackIn_71_1 = stackOut_69_1;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_71_1, 124);
                                stackOut_71_0 = 1;
                                stackIn_72_0 = stackOut_71_0;
                                return stackIn_72_0 != 0;
                              }
                            } else {
                              if (param2 != 102) {
                                if (param2 == 103) {
                                  this.a(((ig) this).field_n.length(), 98);
                                  stackOut_65_0 = 1;
                                  stackIn_66_0 = stackOut_65_0;
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (param2 != 84) {
                                    L9: {
                                      if (!qh.field_m[82]) {
                                        break L9;
                                      } else {
                                        if (param2 != 65) {
                                          break L9;
                                        } else {
                                          this.f((byte) 93);
                                          stackOut_55_0 = 1;
                                          stackIn_56_0 = stackOut_55_0;
                                          return stackIn_56_0 != 0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!qh.field_m[82]) {
                                        break L10;
                                      } else {
                                        if (param2 != 66) {
                                          break L10;
                                        } else {
                                          this.l(-6200);
                                          stackOut_59_0 = 1;
                                          stackIn_60_0 = stackOut_59_0;
                                          return stackIn_60_0 != 0;
                                        }
                                      }
                                    }
                                    if (!qh.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param2) {
                                        break L7;
                                      } else {
                                        this.n(param0 + -158);
                                        stackOut_63_0 = 1;
                                        stackIn_64_0 = stackOut_63_0;
                                        return stackIn_64_0 != 0;
                                      }
                                    }
                                  } else {
                                    this.k(-1);
                                    stackOut_51_0 = 1;
                                    stackIn_52_0 = stackOut_51_0;
                                    return stackIn_52_0 != 0;
                                  }
                                }
                              } else {
                                this.a(0, 115);
                                stackOut_47_0 = 1;
                                stackIn_48_0 = stackOut_47_0;
                                return stackIn_48_0 != 0;
                              }
                            }
                          } else {
                            if (((ig) this).field_J > 0) {
                              L11: {
                                stackOut_40_0 = this;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_41_0 = stackOut_40_0;
                                if (!qh.field_m[82]) {
                                  stackOut_42_0 = this;
                                  stackOut_42_1 = ((ig) this).field_J - 1;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  break L11;
                                } else {
                                  stackOut_41_0 = this;
                                  stackOut_41_1 = this.j(10747);
                                  stackIn_43_0 = stackOut_41_0;
                                  stackIn_43_1 = stackOut_41_1;
                                  break L11;
                                }
                              }
                              this.a(stackIn_43_1, 114);
                              stackOut_43_0 = 1;
                              stackIn_44_0 = stackOut_43_0;
                              return stackIn_44_0 != 0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          ((ig) this).o(-122);
                          stackOut_35_0 = 1;
                          stackIn_36_0 = stackOut_35_0;
                          return stackIn_36_0 != 0;
                        }
                      } else {
                        if (~((ig) this).field_K != ~((ig) this).field_J) {
                          this.b(true);
                          stackOut_32_0 = 1;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0 != 0;
                        } else {
                          if (~((ig) this).field_J > ~((ig) this).field_n.length()) {
                            ((ig) this).field_K = ((ig) this).field_J - -1;
                            this.b(true);
                            stackOut_30_0 = 1;
                            stackIn_31_0 = stackOut_30_0;
                            return stackIn_31_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    } else {
                      if (~((ig) this).field_K == ~((ig) this).field_J) {
                        if (0 < ((ig) this).field_J) {
                          ((ig) this).field_K = -1 + ((ig) this).field_J;
                          this.b(true);
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0 != 0;
                        } else {
                          break L7;
                        }
                      } else {
                        this.b(true);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                  if (param0 == 274) {
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    ((ig) this).field_Q = 124L;
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
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("ig.F(").append(param0).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_76_0 != 0;
    }

    final static java.net.URL a(boolean param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_39_0 = null;
            java.net.URL stackIn_41_0 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_38_0 = null;
            java.net.URL stackOut_40_0 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                var5_ref = param1.getFile();
                if (param0) {
                  break L0;
                } else {
                  field_S = null;
                  break L0;
                }
              }
              var6 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L3;
                      } else {
                        if (param3 < 0) {
                          break L2;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L5;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (0 > var7_int) {
                        break L5;
                      } else {
                        if (param2 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L7;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param4 == null) {
                        break L2;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (param3 <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 == null) {
                      break L9;
                    } else {
                      if (param2.length() <= 0) {
                        break L9;
                      } else {
                        StringBuilder discarded$12 = var7.append("/p=");
                        StringBuilder discarded$13 = var7.append(param2);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param4 == null) {
                      break L10;
                    } else {
                      if (0 >= param4.length()) {
                        break L10;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param4);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var5_ref.length() > var6) {
                      StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L11;
                    } else {
                      StringBuilder discarded$17 = var7.append(47);
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackOut_38_0 = new java.net.URL(param1, var7.toString());
                      stackIn_39_0 = stackOut_38_0;
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_40_0 = (java.net.URL) param1;
                    stackIn_41_0 = stackOut_40_0;
                    return stackIn_41_0;
                  }
                  return stackIn_39_0;
                }
                var6 = var7_int;
                continue L1;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_42_0 = (RuntimeException) var5;
                stackOut_42_1 = new StringBuilder().append("ig.E(").append(param0).append(44);
                stackIn_44_0 = stackOut_42_0;
                stackIn_44_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (param1 == null) {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "null";
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  break L13;
                } else {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "{...}";
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  break L13;
                }
              }
              L14: {
                stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44);
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param2 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L14;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L14;
                }
              }
              L15: {
                stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param3).append(44);
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param4 == null) {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L15;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L15;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        mi var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              this.h((byte) -121);
              if (((ig) this).field_r == 1) {
                L2: {
                  if (!(((ig) this).field_h instanceof mi)) {
                    break L2;
                  } else {
                    var5 = (mi) (Object) ((ig) this).field_h;
                    var6 = var5.a(param3, j.field_c, -115, (ag) this, param1, rb.field_m);
                    if (-1 != var6) {
                      L3: {
                        if (!((ig) this).field_I) {
                          break L3;
                        } else {
                          if (var6 >= ((ig) this).field_O) {
                            break L3;
                          } else {
                            if (var6 <= ((ig) this).field_K) {
                              break L3;
                            } else {
                              var6 = ((ig) this).field_O;
                              break L3;
                            }
                          }
                        }
                      }
                      ((ig) this).field_J = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ((ig) this).field_M = hn.a((byte) 80);
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
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("ig.W(");
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
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    ig(String param0, mh param1, int param2) {
        super(param0, param1);
        ((ig) this).field_Q = 0L;
        ((ig) this).field_I = false;
        ((ig) this).field_O = -1;
        try {
            ((ig) this).field_h = gf.field_e.field_j;
            ((ig) this).field_P = param2;
            ((ig) this).a((byte) 57, true, param0);
            ((ig) this).field_G = true;
            ((ig) this).field_M = hn.a((byte) 80);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ig.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Unpacking graphics";
        field_L = 0;
    }
}
