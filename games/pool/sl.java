/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sl extends fe {
    private int field_O;
    static byte[] field_Y;
    private int field_Z;
    private long field_T;
    private long field_X;
    static int[] field_V;
    private int field_R;
    static int[] field_P;
    private int field_N;
    private boolean field_S;
    private boolean field_Q;
    static String field_W;
    static String field_U;

    private final void j(byte param0) {
        if (!(!(((sl) this).field_t instanceof pe))) {
            ((pe) (Object) ((sl) this).field_t).a((sl) this, false);
        }
    }

    final static String a(boolean param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        if (0L >= param1) {
            return null;
        }
        if (param1 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = dp.field_d[(int)(var7 + -(param1 * 37L))];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$5 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0) {
            field_U = null;
        }
        return var6.toString();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (((sl) this).field_z instanceof io) {
                L1: {
                  var8_int = ((io) (Object) ((sl) this).field_z).a(param5, wn.field_i, gg.field_f, (ei) this, 105, param1);
                  stackOut_4_0 = this;
                  stackOut_4_1 = 86;
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
                  var8_long = rl.a((byte) -107);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var8_long - ((sl) this).field_X >= 250L) {
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
                  ((sl) this).field_Q = stackIn_10_1 != 0;
                  if (((sl) this).field_Q) {
                    L4: {
                      ((sl) this).field_N = this.j(32);
                      ((sl) this).field_R = this.h(27);
                      if (((sl) this).field_R <= 0) {
                        break L4;
                      } else {
                        if (((sl) this).field_m.charAt(((sl) this).field_R - 1) == 32) {
                          ((sl) this).field_R = ((sl) this).field_R - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((sl) this).field_Z = ((sl) this).field_R;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((sl) this).field_X = var8_long;
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
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
            stackOut_21_0 = (RuntimeException) var8;
            stackOut_21_1 = new StringBuilder().append("sl.AA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_20_0 != 0;
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((sl) this).field_N == ((sl) this).field_R)) {
            var2 = ((sl) this).field_N < ((sl) this).field_R ? ((sl) this).field_N : ((sl) this).field_R;
            var3 = ((sl) this).field_N >= ((sl) this).field_R ? ((sl) this).field_N : ((sl) this).field_R;
            ((sl) this).field_N = var2;
            ((sl) this).field_R = var2;
            ((sl) this).field_m = ((sl) this).field_m.substring(0, var2) + ((sl) this).field_m.substring(var3, ((sl) this).field_m.length());
            ((sl) this).i(117);
        }
    }

    private final int h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          if (param0 > 15) {
            break L0;
          } else {
            int discarded$2 = this.h(-3);
            break L0;
          }
        }
        var2 = ((sl) this).field_m.length();
        if (((sl) this).field_R == var2) {
          return ((sl) this).field_R;
        } else {
          var3 = 1 + ((sl) this).field_R;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (((sl) this).field_m.charAt(-1 + var3) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    private final void a(int param0, int param1) {
        ((sl) this).field_R = param1;
        if (!(vj.field_c[81])) {
            ((sl) this).field_N = ((sl) this).field_R;
        }
        int var3 = -72 / ((param0 - -33) / 62);
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        io var7 = null;
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
              this.k(-20923);
              if (((sl) this).field_n != 1) {
                break L1;
              } else {
                L2: {
                  if (((sl) this).field_z instanceof io) {
                    var7 = (io) (Object) ((sl) this).field_z;
                    var6 = var7.a(param3, wn.field_i, gg.field_f, (ei) this, param1 + -882, param2);
                    if (-1 == var6) {
                      break L2;
                    } else {
                      L3: {
                        if (!((sl) this).field_Q) {
                          break L3;
                        } else {
                          if (var6 >= ((sl) this).field_Z) {
                            break L3;
                          } else {
                            if (var6 > ((sl) this).field_N) {
                              var6 = ((sl) this).field_Z;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((sl) this).field_R = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((sl) this).field_T = rl.a((byte) -126);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("sl.S(");
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
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void f(int param0) {
        if (param0 < 55) {
            ((sl) this).field_Z = -85;
        }
        ((sl) this).field_R = 0;
        ((sl) this).field_N = 0;
        ((sl) this).field_m = "";
        ((sl) this).i(-44);
    }

    final void a(byte param0, boolean param1, String param2) {
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
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            ((sl) this).field_m = param2;
            if (param0 == -124) {
              L2: {
                var4_int = param2.length();
                if (-1 == ((sl) this).field_O) {
                  break L2;
                } else {
                  if (var4_int > ((sl) this).field_O) {
                    ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_O);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                int dupTemp$2 = ((sl) this).field_m.length();
                ((sl) this).field_N = dupTemp$2;
                ((sl) this).field_R = dupTemp$2;
                if (param1) {
                  break L3;
                } else {
                  ((sl) this).i(param0 + 211);
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
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("sl.T(").append(param0).append(44).append(param1).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    private final void a(int param0, String param1) {
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
              if (-1 == ((sl) this).field_O) {
                break L1;
              } else {
                var3_int = ((sl) this).field_O + -((sl) this).field_m.length();
                if (var3_int < 0) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((sl) this).field_R != ((sl) this).field_m.length()) {
                ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_R) + param1 + ((sl) this).field_m.substring(((sl) this).field_R, ((sl) this).field_m.length());
                break L2;
              } else {
                ((sl) this).field_m = ((sl) this).field_m + param1;
                break L2;
              }
            }
            L3: {
              ((sl) this).field_R = ((sl) this).field_R + param1.length();
              if (param0 > 21) {
                break L3;
              } else {
                this.a(-32, -52);
                break L3;
              }
            }
            ((sl) this).field_N = ((sl) this).field_R;
            ((sl) this).i(118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("sl.J(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void i(byte param0) {
        field_Y = null;
        field_V = null;
        field_U = null;
        field_W = null;
        field_P = null;
    }

    private final void g(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.g(-14642);
                this.a(110, var2_ref);
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

    private final void k(int param0) {
        int var8 = Pool.field_O;
        if (!(((sl) this).field_S)) {
            ((sl) this).field_r = 0;
            ((sl) this).field_v = 0;
            return;
        }
        if (!(((sl) this).field_z instanceof io)) {
            return;
        }
        io var9 = (io) (Object) ((sl) this).field_z;
        op var3 = var9.b(0, (ei) this);
        int var4 = var3.a(-1);
        int var5 = var9.a((byte) 26, (ei) this);
        int var6 = var9.a(-10492) >> 1;
        if (-var6 + var5 > var4) {
            ((sl) this).field_v = 0;
            ((sl) this).field_r = 0;
            return;
        }
        int var7 = ((sl) this).field_v + var3.a(((sl) this).field_R, (byte) -88);
        if (-var6 + var5 < var7) {
            ((sl) this).field_v = -var7 + (-var6 + (var5 + ((sl) this).field_v));
        } else {
            if (!(var7 >= var6)) {
                ((sl) this).field_v = ((sl) this).field_v - var7 - -var6;
            }
        }
        if (0 < ((sl) this).field_v) {
            ((sl) this).field_v = 0;
        } else {
            if (!(-var5 + var6 <= ((sl) this).field_v)) {
                ((sl) this).field_v = -var5 - -var6;
            }
        }
    }

    sl(String param0, cc param1, int param2) {
        super(param0, param1);
        ((sl) this).field_Z = -1;
        ((sl) this).field_Q = false;
        ((sl) this).field_X = 0L;
        try {
            ((sl) this).field_O = param2;
            ((sl) this).field_z = db.field_Sb.field_j;
            ((sl) this).a((byte) -124, true, param0);
            ((sl) this).field_S = true;
            ((sl) this).field_T = rl.a((byte) -101);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "sl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h((byte) 63);
        if (param0) {
            ((sl) this).field_O = 71;
        }
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h((byte) 63)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_44_0 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_5_0 = 0;
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
              ((sl) this).field_T = rl.a((byte) -116);
              if (!param2) {
                break L1;
              } else {
                ((sl) this).field_T = 25L;
                break L1;
              }
            }
            L2: {
              if (param0 == 60) {
                break L2;
              } else {
                if (param0 == 62) {
                  break L2;
                } else {
                  L3: {
                    if (param0 < 32) {
                      break L3;
                    } else {
                      if (param0 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (((sl) this).field_R == ((sl) this).field_N) {
                            break L4;
                          } else {
                            this.g(-14642);
                            break L4;
                          }
                        }
                        L5: {
                          if (((sl) this).field_O == -1) {
                            break L5;
                          } else {
                            if (((sl) this).field_m.length() < ((sl) this).field_O) {
                              break L5;
                            } else {
                              return true;
                            }
                          }
                        }
                        L6: {
                          if (((sl) this).field_R >= ((sl) this).field_m.length()) {
                            ((sl) this).field_m = ((sl) this).field_m + param0;
                            int dupTemp$1 = ((sl) this).field_m.length();
                            ((sl) this).field_R = dupTemp$1;
                            ((sl) this).field_N = dupTemp$1;
                            break L6;
                          } else {
                            ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_R) + param0 + ((sl) this).field_m.substring(((sl) this).field_R, ((sl) this).field_m.length());
                            ((sl) this).field_R = ((sl) this).field_R + 1;
                            ((sl) this).field_N = ((sl) this).field_R;
                            break L6;
                          }
                        }
                        ((sl) this).i(-27);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  L7: {
                    if (85 != param1) {
                      if (param1 == 101) {
                        if (((sl) this).field_R == ((sl) this).field_N) {
                          if (((sl) this).field_R < ((sl) this).field_m.length()) {
                            ((sl) this).field_N = 1 + ((sl) this).field_R;
                            this.g(-14642);
                            stackOut_73_0 = 1;
                            stackIn_74_0 = stackOut_73_0;
                            return stackIn_74_0 != 0;
                          } else {
                            break L7;
                          }
                        } else {
                          this.g(-14642);
                          stackOut_69_0 = 1;
                          stackIn_70_0 = stackOut_69_0;
                          return stackIn_70_0 != 0;
                        }
                      } else {
                        if (param1 != 13) {
                          if (param1 != 96) {
                            if (param1 != 97) {
                              if (102 != param1) {
                                if (param1 != 103) {
                                  if (84 != param1) {
                                    L8: {
                                      if (!vj.field_c[82]) {
                                        break L8;
                                      } else {
                                        if (65 == param1) {
                                          this.l(-98);
                                          stackOut_66_0 = 1;
                                          stackIn_67_0 = stackOut_66_0;
                                          return stackIn_67_0 != 0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!vj.field_c[82]) {
                                        break L9;
                                      } else {
                                        if (66 != param1) {
                                          break L9;
                                        } else {
                                          this.a(param2);
                                          stackOut_60_0 = 1;
                                          stackIn_61_0 = stackOut_60_0;
                                          return stackIn_61_0 != 0;
                                        }
                                      }
                                    }
                                    if (!vj.field_c[82]) {
                                      break L7;
                                    } else {
                                      if (param1 != 67) {
                                        break L7;
                                      } else {
                                        this.g((byte) 4);
                                        stackOut_64_0 = 1;
                                        stackIn_65_0 = stackOut_64_0;
                                        return stackIn_65_0 != 0;
                                      }
                                    }
                                  } else {
                                    this.j((byte) 3);
                                    stackOut_53_0 = 1;
                                    stackIn_54_0 = stackOut_53_0;
                                    return stackIn_54_0 != 0;
                                  }
                                } else {
                                  this.a(76, ((sl) this).field_m.length());
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  return stackIn_51_0 != 0;
                                }
                              } else {
                                this.a(-113, 0);
                                stackOut_47_0 = 1;
                                stackIn_48_0 = stackOut_47_0;
                                return stackIn_48_0 != 0;
                              }
                            } else {
                              if (((sl) this).field_R < ((sl) this).field_m.length()) {
                                L10: {
                                  stackOut_41_0 = this;
                                  stackOut_41_1 = -128;
                                  stackIn_43_0 = stackOut_41_0;
                                  stackIn_43_1 = stackOut_41_1;
                                  stackIn_42_0 = stackOut_41_0;
                                  stackIn_42_1 = stackOut_41_1;
                                  if (!vj.field_c[82]) {
                                    stackOut_43_0 = this;
                                    stackOut_43_1 = stackIn_43_1;
                                    stackOut_43_2 = ((sl) this).field_R + 1;
                                    stackIn_44_0 = stackOut_43_0;
                                    stackIn_44_1 = stackOut_43_1;
                                    stackIn_44_2 = stackOut_43_2;
                                    break L10;
                                  } else {
                                    stackOut_42_0 = this;
                                    stackOut_42_1 = stackIn_42_1;
                                    stackOut_42_2 = this.h(31);
                                    stackIn_44_0 = stackOut_42_0;
                                    stackIn_44_1 = stackOut_42_1;
                                    stackIn_44_2 = stackOut_42_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_44_1, stackIn_44_2);
                                stackOut_44_0 = 1;
                                stackIn_45_0 = stackOut_44_0;
                                return stackIn_45_0 != 0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            if (((sl) this).field_R > 0) {
                              L11: {
                                stackOut_33_0 = this;
                                stackOut_33_1 = 97;
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_35_1 = stackOut_33_1;
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                if (vj.field_c[82]) {
                                  stackOut_35_0 = this;
                                  stackOut_35_1 = stackIn_35_1;
                                  stackOut_35_2 = this.j(32);
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  stackIn_36_2 = stackOut_35_2;
                                  break L11;
                                } else {
                                  stackOut_34_0 = this;
                                  stackOut_34_1 = stackIn_34_1;
                                  stackOut_34_2 = ((sl) this).field_R - 1;
                                  stackIn_36_0 = stackOut_34_0;
                                  stackIn_36_1 = stackOut_34_1;
                                  stackIn_36_2 = stackOut_34_2;
                                  break L11;
                                }
                              }
                              this.a(stackIn_36_1, stackIn_36_2);
                              stackOut_36_0 = 1;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          ((sl) this).f(57);
                          stackOut_28_0 = 1;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0 != 0;
                        }
                      }
                    } else {
                      if (((sl) this).field_N != ((sl) this).field_R) {
                        this.g(-14642);
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        if (((sl) this).field_R <= 0) {
                          break L7;
                        } else {
                          ((sl) this).field_N = -1 + ((sl) this).field_R;
                          this.g(-14642);
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_75_0 = 0;
                  stackIn_76_0 = stackOut_75_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("sl.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 41);
        }
        return stackIn_76_0 != 0;
    }

    private final void l(int param0) {
        this.a(false);
        int var2 = 0;
        this.g(-14642);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (0 != ((sl) this).field_R) {
          var2 = -1 + ((sl) this).field_R;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((sl) this).field_m.charAt(var2 + -1)) {
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
          return ((sl) this).field_R;
        }
    }

    private final String h(byte param0) {
        int var2 = ((sl) this).field_N >= ((sl) this).field_R ? ((sl) this).field_R : ((sl) this).field_N;
        int var3 = ((sl) this).field_R <= ((sl) this).field_N ? ((sl) this).field_N : ((sl) this).field_R;
        return ((sl) this).field_m.substring(var2, var3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        io var6 = null;
        long var7 = 0L;
        int var5 = 60 % ((-42 - param1) / 53);
        if (null != ((sl) this).field_z) {
            if (param0 == 0) {
                ((sl) this).field_z.a(((sl) this).field_I, param2, (byte) 77, param3, (ei) this);
                if (((sl) this).field_z instanceof io) {
                    var6 = (io) (Object) ((sl) this).field_z;
                    if (((sl) this).field_N != ((sl) this).field_R) {
                        var6.a(((sl) this).field_R, ((sl) this).field_N, param2, param3, 154888568, (ei) this);
                    }
                    var7 = rl.a((byte) -126);
                    if (!(500L <= (-((sl) this).field_T + var7) % 1000L)) {
                        var6.a(1, param3, ((sl) this).field_R, param2, (ei) this);
                    }
                }
            }
        }
    }

    void i(int param0) {
        if (((sl) this).field_t instanceof pe) {
            ((pe) (Object) ((sl) this).field_t).a((sl) this, -79);
        }
        int var2 = -31 % ((param0 - 28) / 49);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new byte[]{(byte) 2, (byte) 3, (byte) 4, (byte) 5};
        field_P = new int[8192];
        field_U = "Basics";
        field_W = "You and <%0> are out of lives!";
    }
}
