/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qn extends fb {
    private boolean field_S;
    private int field_T;
    static ci field_P;
    static int field_M;
    static nk field_U;
    private int field_Q;
    private int field_X;
    private int field_N;
    private boolean field_W;
    static String field_R;
    private long field_V;
    private long field_O;

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((qn) this).field_Q != ((qn) this).field_X) {
            var2 = ((qn) this).field_Q <= ((qn) this).field_X ? ((qn) this).field_Q : ((qn) this).field_X;
            var3 = ((qn) this).field_Q <= ((qn) this).field_X ? ((qn) this).field_X : ((qn) this).field_Q;
            ((qn) this).field_Q = var2;
            ((qn) this).field_X = var2;
            ((qn) this).field_v = ((qn) this).field_v.substring(0, var2) + ((qn) this).field_v.substring(var3, ((qn) this).field_v.length());
            ((qn) this).g((byte) 63);
        }
        if (param0 != 1) {
            this.h((byte) -107);
        }
    }

    private final void c(boolean param0) {
        if (!(!(((qn) this).field_p instanceof ha))) {
            ((ha) (Object) ((qn) this).field_p).b((qn) this, 3);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
              if (((qn) this).field_n instanceof mg) {
                L1: {
                  var8_int = ((mg) (Object) ((qn) this).field_n).a(rf.field_b, param5, -4, param6, (mf) this, hn.field_k);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 != var8_int) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = var8_int;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, (byte) 80);
                  var8_long = ud.a(2);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var8_long + -((qn) this).field_O >= 250L) {
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
                  ((qn) this).field_S = stackIn_10_1 != 0;
                  if (((qn) this).field_S) {
                    L4: {
                      ((qn) this).field_X = this.l(param3 ^ 41);
                      ((qn) this).field_Q = this.k(param3 + -23899);
                      if (((qn) this).field_Q <= 0) {
                        break L4;
                      } else {
                        if (32 != ((qn) this).field_v.charAt(-1 + ((qn) this).field_Q)) {
                          break L4;
                        } else {
                          ((qn) this).field_Q = ((qn) this).field_Q - 1;
                          break L4;
                        }
                      }
                    }
                    ((qn) this).field_N = ((qn) this).field_Q;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((qn) this).field_O = var8_long;
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
            stackOut_20_1 = new StringBuilder().append("qn.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void e(byte param0) {
        int var3 = 71 % ((param0 - 31) / 51);
        String var2 = this.b(false);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b(false)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
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
              if (param0 == 0) {
                break L2;
              } else {
                int discarded$6 = qn.a((byte) 44, 60, -34);
                break L2;
              }
            }
            L3: {
              ((qn) this).field_v = param2;
              var4_int = param2.length();
              if (((qn) this).field_T == -1) {
                break L3;
              } else {
                if (((qn) this).field_T < var4_int) {
                  ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_T);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$7 = ((qn) this).field_v.length();
              ((qn) this).field_X = dupTemp$7;
              ((qn) this).field_Q = dupTemp$7;
              if (!param1) {
                ((qn) this).g((byte) 63);
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
            stackOut_13_1 = new StringBuilder().append("qn.C(").append(param0).append(',').append(param1).append(',');
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
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final String b(boolean param0) {
        int var2 = ((qn) this).field_Q <= ((qn) this).field_X ? ((qn) this).field_Q : ((qn) this).field_X;
        int var3 = ((qn) this).field_X < ((qn) this).field_Q ? ((qn) this).field_Q : ((qn) this).field_X;
        return ((qn) this).field_v.substring(var2, var3);
    }

    private final void h(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == -18) {
                    break L1;
                  } else {
                    ((qn) this).field_W = true;
                    break L1;
                  }
                }
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.j(1);
                this.a(var2_ref, 99);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Chess.field_G;
          if (param0 > 47) {
            break L0;
          } else {
            ((qn) this).field_V = -33L;
            break L0;
          }
        }
        if (((qn) this).field_Q == 0) {
          return ((qn) this).field_Q;
        } else {
          var2 = -1 + ((qn) this).field_Q;
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (((qn) this).field_v.charAt(var2 + -1) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        mg var8 = null;
        long var6 = 0L;
        if (param2 > -80) {
            ((qn) this).field_Q = -93;
        }
        if (null != ((qn) this).field_n) {
            if (0 == param1) {
                ((qn) this).field_n.a((byte) 124, param3, param0, ((qn) this).field_H, (mf) this);
                if (!(!(((qn) this).field_n instanceof mg))) {
                    var8 = (mg) (Object) ((qn) this).field_n;
                    if (((qn) this).field_Q != ((qn) this).field_X) {
                        var8.a((mf) this, param3, ((qn) this).field_Q, param0, 122, ((qn) this).field_X);
                    }
                    var6 = ud.a(2);
                    if (500L > (-((qn) this).field_V + var6) % 1000L) {
                        var8.a(param3, ((qn) this).field_Q, param0, (byte) -125, (mf) this);
                    }
                }
            }
        }
    }

    private final void a(String param0, int param1) {
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
              if (((qn) this).field_T != -1) {
                var3_int = ((qn) this).field_T - ((qn) this).field_v.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((qn) this).field_Q != ((qn) this).field_v.length()) {
                ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_Q) + param0 + ((qn) this).field_v.substring(((qn) this).field_Q, ((qn) this).field_v.length());
                break L2;
              } else {
                ((qn) this).field_v = ((qn) this).field_v + param0;
                break L2;
              }
            }
            ((qn) this).field_Q = ((qn) this).field_Q + param0.length();
            ((qn) this).field_X = ((qn) this).field_Q;
            ((qn) this).g((byte) 63);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("qn.A(");
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
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 99 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        ((qn) this).field_Q = param0;
        if (param1 < 55) {
            ((qn) this).field_W = false;
        }
        if (!ok.field_Jb[81]) {
            ((qn) this).field_X = ((qn) this).field_Q;
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_U = null;
        field_P = null;
    }

    qn(String param0, rg param1, int param2) {
        super(param0, param1);
        ((qn) this).field_S = false;
        ((qn) this).field_N = -1;
        ((qn) this).field_O = 0L;
        try {
            ((qn) this).field_n = a.field_a.field_o;
            ((qn) this).field_T = param2;
            ((qn) this).a(0, true, param0);
            ((qn) this).field_W = true;
            ((qn) this).field_V = ud.a(2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var8 = Chess.field_G;
        try {
          L0: {
            if (param0 == 107) {
              var3_int = 0;
              var4 = id.field_c;
              L1: while (true) {
                if (var3_int >= bd.field_e.length) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ec.field_l[var3_int];
                    if (var5 < 0) {
                      var4 = var4 + qd.field_r;
                      break L2;
                    } else {
                      var6 = in.a(bd.field_e[var3_int], 71, true);
                      var4 = var4 + mf.field_z;
                      var7 = of.field_k + -(var6 >> 1);
                      if (ve.a(var4, var7 + -gm.field_e, var6 + (gm.field_e << 1), param2, (fh.field_e << 1) + ug.field_a, 2, param1)) {
                        stackOut_9_0 = var5;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        var4 = var4 + ((fh.field_e << 1) - (-mf.field_z - ug.field_a));
                        break L2;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 104;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "qn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final static double a(int param0, double param1) {
        if (param0 != -17513) {
            field_U = null;
        }
        return li.field_e[65535 & (int)(param1 * 32768.0 / 3.141592653589793)];
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        if (param0 == -23811) {
          var2 = ((qn) this).field_v.length();
          if (((qn) this).field_Q == var2) {
            return ((qn) this).field_Q;
          } else {
            var3 = 1 + ((qn) this).field_Q;
            L0: while (true) {
              L1: {
                if (var2 <= var3) {
                  break L1;
                } else {
                  if (((qn) this).field_v.charAt(-1 + var3) == 32) {
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
        } else {
          return 12;
        }
    }

    private final void f(byte param0) {
        this.e((byte) -98);
        this.j(1);
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_6_0 = 0;
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
            ((qn) this).field_V = ud.a(2);
            if (param0 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                if (param2 == -1) {
                  L1: {
                    if (32 > param0) {
                      break L1;
                    } else {
                      if (param0 <= 126) {
                        L2: {
                          if (~((qn) this).field_X == ~((qn) this).field_Q) {
                            break L2;
                          } else {
                            this.j(1);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (((qn) this).field_T == -1) {
                              break L4;
                            } else {
                              if (((qn) this).field_v.length() >= ((qn) this).field_T) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (((qn) this).field_Q < ((qn) this).field_v.length()) {
                              ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_Q) + param0 + ((qn) this).field_v.substring(((qn) this).field_Q, ((qn) this).field_v.length());
                              ((qn) this).field_Q = ((qn) this).field_Q + 1;
                              ((qn) this).field_X = ((qn) this).field_Q;
                              break L5;
                            } else {
                              ((qn) this).field_v = ((qn) this).field_v + param0;
                              int dupTemp$1 = ((qn) this).field_v.length();
                              ((qn) this).field_Q = dupTemp$1;
                              ((qn) this).field_X = dupTemp$1;
                              break L5;
                            }
                          }
                          ((qn) this).g((byte) 63);
                          break L3;
                        }
                        stackOut_75_0 = 1;
                        stackIn_76_0 = stackOut_75_0;
                        return stackIn_76_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if (param1 == 85) {
                      if (((qn) this).field_Q != ((qn) this).field_X) {
                        this.j(1);
                        stackOut_64_0 = 1;
                        stackIn_65_0 = stackOut_64_0;
                        return stackIn_65_0 != 0;
                      } else {
                        if (0 < ((qn) this).field_Q) {
                          ((qn) this).field_X = ((qn) this).field_Q - 1;
                          this.j(1);
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0 != 0;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if (param1 != 101) {
                        if (param1 != 13) {
                          if (param1 == 96) {
                            if (((qn) this).field_Q <= 0) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_54_0 = this;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_55_0 = stackOut_54_0;
                                if (!ok.field_Jb[82]) {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = ((qn) this).field_Q - 1;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  break L7;
                                } else {
                                  stackOut_55_0 = this;
                                  stackOut_55_1 = this.l(param2 ^ -113);
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_57_1, (byte) 56);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0 != 0;
                            }
                          } else {
                            if (param1 == 97) {
                              if (~((qn) this).field_Q > ~((qn) this).field_v.length()) {
                                L8: {
                                  stackOut_48_0 = this;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  if (ok.field_Jb[82]) {
                                    stackOut_50_0 = this;
                                    stackOut_50_1 = this.k(-23811);
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    break L8;
                                  } else {
                                    stackOut_49_0 = this;
                                    stackOut_49_1 = ((qn) this).field_Q - -1;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_51_1, (byte) 65);
                                stackOut_51_0 = 1;
                                stackIn_52_0 = stackOut_51_0;
                                return stackIn_52_0 != 0;
                              } else {
                                break L6;
                              }
                            } else {
                              if (102 != param1) {
                                if (param1 != 103) {
                                  if (param1 == 84) {
                                    this.c(true);
                                    stackOut_44_0 = 1;
                                    stackIn_45_0 = stackOut_44_0;
                                    return stackIn_45_0 != 0;
                                  } else {
                                    L9: {
                                      if (!ok.field_Jb[82]) {
                                        break L9;
                                      } else {
                                        if (param1 != 65) {
                                          break L9;
                                        } else {
                                          this.f((byte) 79);
                                          stackOut_33_0 = 1;
                                          stackIn_34_0 = stackOut_33_0;
                                          return stackIn_34_0 != 0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!ok.field_Jb[82]) {
                                        break L10;
                                      } else {
                                        if (66 == param1) {
                                          this.e((byte) 122);
                                          stackOut_42_0 = 1;
                                          stackIn_43_0 = stackOut_42_0;
                                          return stackIn_43_0 != 0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!ok.field_Jb[82]) {
                                      break L6;
                                    } else {
                                      if (param1 != 67) {
                                        break L6;
                                      } else {
                                        this.h((byte) -18);
                                        stackOut_40_0 = 1;
                                        stackIn_41_0 = stackOut_40_0;
                                        return stackIn_41_0 != 0;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(((qn) this).field_v.length(), (byte) 99);
                                  stackOut_28_0 = 1;
                                  stackIn_29_0 = stackOut_28_0;
                                  return stackIn_29_0 != 0;
                                }
                              } else {
                                this.a(0, (byte) 114);
                                stackOut_25_0 = 1;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0 != 0;
                              }
                            }
                          }
                        } else {
                          ((qn) this).i(-12881);
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      } else {
                        if (~((qn) this).field_Q == ~((qn) this).field_X) {
                          if (((qn) this).field_Q >= ((qn) this).field_v.length()) {
                            break L6;
                          } else {
                            ((qn) this).field_X = ((qn) this).field_Q + 1;
                            this.j(param2 ^ -2);
                            stackOut_17_0 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            return stackIn_18_0 != 0;
                          }
                        } else {
                          this.j(1);
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_77_0 = 0;
                  stackIn_78_0 = stackOut_77_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5;
            stackOut_79_1 = new StringBuilder().append("qn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param3 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ')');
        }
        return stackIn_78_0 != 0;
    }

    void g(byte param0) {
        if (((qn) this).field_p instanceof ha) {
            ((ha) (Object) ((qn) this).field_p).a((qn) this, 10999);
        }
        if (param0 != 63) {
            int discarded$0 = qn.a((byte) 32, -122, 110);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = Chess.field_G;
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param7 < param4) {
                lg.a(wb.field_d, false, param10, param7, param9, param1, param6, param15, param12, param11, param2, param8, param4, param5, param0, param13, param14);
                break L0;
              } else {
                lg.a(wb.field_d, false, param0, param4, param15, param1, param6, param9, param11, param12, param2, param14, param7, param5, param10, param13, param8);
                break L0;
              }
            } else {
              lg.a(wb.field_d, false, param10, param7, param9, param15, param4, param1, param2, param11, param12, param8, param6, param14, param13, param0, param5);
              break L0;
            }
          } else {
            if (param4 > param7) {
              lg.a(wb.field_d, false, param13, param6, param1, param15, param4, param9, param11, param2, param12, param5, param7, param14, param10, param0, param8);
              break L0;
            } else {
              if (param4 <= param6) {
                lg.a(wb.field_d, false, param0, param4, param15, param9, param7, param1, param2, param12, param11, param14, param6, param8, param13, param10, param5);
                break L0;
              } else {
                lg.a(wb.field_d, false, param13, param6, param1, param9, param7, param15, param12, param2, param11, param5, param4, param8, param0, param10, param14);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param3 == 0) {
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void d(boolean param0) {
        ub var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        var8 = Chess.field_G;
        if (((qn) this).field_W) {
          if (!(((qn) this).field_n instanceof mg)) {
            return;
          } else {
            var9 = (mg) (Object) ((qn) this).field_n;
            var3 = var9.a((mf) this, -23159);
            var4 = var3.c((byte) -24);
            var5 = var9.b((mf) this, 0);
            var6 = var9.a((byte) 76) >> 1;
            if (var4 >= -var6 + var5) {
              L0: {
                var7 = ((qn) this).field_A - -var3.a(-5940, ((qn) this).field_Q);
                if (var7 <= -var6 + var5) {
                  if (var6 > var7) {
                    ((qn) this).field_A = -var7 - (-var6 - ((qn) this).field_A);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((qn) this).field_A = ((qn) this).field_A + -var7 + (var5 - var6);
                  break L0;
                }
              }
              L1: {
                if (((qn) this).field_A > 0) {
                  ((qn) this).field_A = 0;
                  break L1;
                } else {
                  if (var6 + -var5 <= ((qn) this).field_A) {
                    break L1;
                  } else {
                    ((qn) this).field_A = -var5 + var6;
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((qn) this).field_A = 0;
              ((qn) this).field_k = 0;
              return;
            }
          }
        } else {
          ((qn) this).field_A = 0;
          ((qn) this).field_k = 0;
          return;
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        mg var5 = null;
        int var6 = 0;
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
            super.a(param0, -51, param2, param3);
            L1: {
              this.d(true);
              if (1 != ((qn) this).field_q) {
                break L1;
              } else {
                L2: {
                  if (((qn) this).field_n instanceof mg) {
                    var5 = (mg) (Object) ((qn) this).field_n;
                    var6 = var5.a(rf.field_b, param3, -4, param0, (mf) this, hn.field_k);
                    if (var6 != -1) {
                      L3: {
                        if (!((qn) this).field_S) {
                          break L3;
                        } else {
                          if (((qn) this).field_N <= var6) {
                            break L3;
                          } else {
                            if (((qn) this).field_X >= var6) {
                              break L3;
                            } else {
                              var6 = ((qn) this).field_N;
                              break L3;
                            }
                          }
                        }
                      }
                      ((qn) this).field_Q = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((qn) this).field_V = ud.a(2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("qn.G(").append(param0).append(',').append(-30).append(',');
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
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        ((qn) this).field_X = 0;
        ((qn) this).field_Q = 0;
        if (param0 != -12881) {
            this.h((byte) 102);
        }
        ((qn) this).field_v = "";
        ((qn) this).g((byte) 63);
    }

    static {
    }
}
