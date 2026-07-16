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
        if (param0 != 3) {
            ((sl) this).field_N = 98;
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
        while (-1L != (var4 ^ -1L)) {
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
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (!(!(((sl) this).field_z instanceof io))) {
            var8_int = ((io) (Object) ((sl) this).field_z).a(param5, wn.field_i, gg.field_f, (ei) this, 105, param1);
            this.a(86, 0 == (var8_int ^ -1) ? 0 : var8_int);
            var8 = rl.a((byte) -107);
            ((sl) this).field_Q = -251L < (var8 - ((sl) this).field_X ^ -1L) ? true : false;
            if (!(!((sl) this).field_Q)) {
                ((sl) this).field_N = this.j(32);
                ((sl) this).field_R = this.h(27);
                if ((((sl) this).field_R ^ -1) < -1) {
                    if (!(-33 != (((sl) this).field_m.charAt(((sl) this).field_R - 1) ^ -1))) {
                        ((sl) this).field_R = ((sl) this).field_R - 1;
                    }
                }
                ((sl) this).field_Z = ((sl) this).field_R;
            }
            ((sl) this).field_X = var8;
            return true;
        }
        return false;
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -14642) {
            Object var4 = null;
            boolean discarded$0 = ((sl) this).a('ﾣ', -96, true, (ei) null);
        }
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
        io var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.k(-20923);
        if (((sl) this).field_n == 1) {
            if (!(!(((sl) this).field_z instanceof io))) {
                var7 = (io) (Object) ((sl) this).field_z;
                var6 = var7.a(param3, wn.field_i, gg.field_f, (ei) this, param1 + -882, param2);
                if (-1 != var6) {
                    if (((sl) this).field_Q) {
                        if (var6 < ((sl) this).field_Z) {
                            if (!(var6 <= ((sl) this).field_N)) {
                                var6 = ((sl) this).field_Z;
                            }
                        }
                    }
                    ((sl) this).field_R = var6;
                }
            }
            ((sl) this).field_T = rl.a((byte) -126);
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
        if (!(param2 != null)) {
            param2 = "";
        }
        ((sl) this).field_m = param2;
        if (param0 != -124) {
            return;
        }
        int var4 = param2.length();
        if (-1 != ((sl) this).field_O) {
            if (!(var4 <= ((sl) this).field_O)) {
                ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_O);
            }
        }
        int dupTemp$0 = ((sl) this).field_m.length();
        ((sl) this).field_N = dupTemp$0;
        ((sl) this).field_R = dupTemp$0;
        if (!param1) {
            ((sl) this).i(param0 + 211);
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (-1 != ((sl) this).field_O) {
            var3 = ((sl) this).field_O + -((sl) this).field_m.length();
            if (-1 >= (var3 ^ -1)) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((sl) this).field_R == ((sl) this).field_m.length()) {
            ((sl) this).field_m = ((sl) this).field_m + param1;
        } else {
            ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_R) + param1 + ((sl) this).field_m.substring(((sl) this).field_R, ((sl) this).field_m.length());
        }
        ((sl) this).field_R = ((sl) this).field_R + param1.length();
        if (param0 <= 21) {
            this.a(-32, -52);
        }
        ((sl) this).field_N = ((sl) this).field_R;
        ((sl) this).i(118);
    }

    public static void i(byte param0) {
        field_Y = null;
        field_V = null;
        field_U = null;
        field_W = null;
        if (param0 != 23) {
            return;
        }
        field_P = null;
    }

    private final void g(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            if (param0 == 4) {
              try {
                L0: {
                  var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  this.g(-14642);
                  this.a(param0 + 106, var2_ref);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = (Exception) (Object) decompiledCaughtException;
                  break L1;
                }
              }
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

    private final void k(int param0) {
        op var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        io var9 = null;
        var8 = Pool.field_O;
        if (!((sl) this).field_S) {
          ((sl) this).field_r = 0;
          ((sl) this).field_v = 0;
          return;
        } else {
          if (!(((sl) this).field_z instanceof io)) {
            return;
          } else {
            var9 = (io) (Object) ((sl) this).field_z;
            var3 = var9.b(0, (ei) this);
            var4 = var3.a(-1);
            var5 = var9.a((byte) 26, (ei) this);
            var6 = var9.a(-10492) >> 1352383521;
            if (-var6 + var5 <= var4) {
              L0: {
                var7 = ((sl) this).field_v + var3.a(((sl) this).field_R, (byte) -88);
                if (-var6 + var5 >= var7) {
                  if (var7 < var6) {
                    ((sl) this).field_v = ((sl) this).field_v - var7 - -var6;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((sl) this).field_v = -var7 + (-var6 + (var5 + ((sl) this).field_v));
                  break L0;
                }
              }
              if (param0 == -20923) {
                L1: {
                  if (0 >= ((sl) this).field_v) {
                    if (-var5 + var6 > ((sl) this).field_v) {
                      ((sl) this).field_v = -var5 - -var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((sl) this).field_v = 0;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              ((sl) this).field_v = 0;
              ((sl) this).field_r = 0;
              return;
            }
          }
        }
    }

    sl(String param0, cc param1, int param2) {
        super(param0, param1);
        ((sl) this).field_Z = -1;
        ((sl) this).field_Q = false;
        ((sl) this).field_X = 0L;
        ((sl) this).field_O = param2;
        ((sl) this).field_z = db.field_Sb.field_j;
        ((sl) this).a((byte) -124, true, param0);
        ((sl) this).field_S = true;
        ((sl) this).field_T = rl.a((byte) -101);
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
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        L0: {
          ((sl) this).field_T = rl.a((byte) -116);
          if (!param2) {
            break L0;
          } else {
            ((sl) this).field_T = 25L;
            break L0;
          }
        }
        L1: {
          if (param0 == 60) {
            break L1;
          } else {
            if (param0 == 62) {
              break L1;
            } else {
              L2: {
                if (param0 < 32) {
                  break L2;
                } else {
                  if (param0 > 126) {
                    break L2;
                  } else {
                    L3: {
                      if (((sl) this).field_R == ((sl) this).field_N) {
                        break L3;
                      } else {
                        this.g(-14642);
                        break L3;
                      }
                    }
                    L4: {
                      if (((sl) this).field_O == -1) {
                        break L4;
                      } else {
                        if (((sl) this).field_m.length() < ((sl) this).field_O) {
                          break L4;
                        } else {
                          return true;
                        }
                      }
                    }
                    L5: {
                      if (((sl) this).field_R >= ((sl) this).field_m.length()) {
                        ((sl) this).field_m = ((sl) this).field_m + param0;
                        int dupTemp$1 = ((sl) this).field_m.length();
                        ((sl) this).field_R = dupTemp$1;
                        ((sl) this).field_N = dupTemp$1;
                        break L5;
                      } else {
                        ((sl) this).field_m = ((sl) this).field_m.substring(0, ((sl) this).field_R) + param0 + ((sl) this).field_m.substring(((sl) this).field_R, ((sl) this).field_m.length());
                        ((sl) this).field_R = ((sl) this).field_R + 1;
                        ((sl) this).field_N = ((sl) this).field_R;
                        break L5;
                      }
                    }
                    ((sl) this).i(-27);
                    return true;
                  }
                }
              }
              L6: {
                if (85 != param1) {
                  if ((param1 ^ -1) == -102) {
                    if (((sl) this).field_R == ((sl) this).field_N) {
                      if (((sl) this).field_R < ((sl) this).field_m.length()) {
                        ((sl) this).field_N = 1 + ((sl) this).field_R;
                        this.g(-14642);
                        return true;
                      } else {
                        break L6;
                      }
                    } else {
                      this.g(-14642);
                      return true;
                    }
                  } else {
                    if (param1 != 13) {
                      if ((param1 ^ -1) != -97) {
                        if (-98 != (param1 ^ -1)) {
                          if (102 != param1) {
                            if (-104 != (param1 ^ -1)) {
                              if (84 != param1) {
                                L7: {
                                  if (!vj.field_c[82]) {
                                    break L7;
                                  } else {
                                    if (65 == param1) {
                                      this.l(-98);
                                      return true;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (!vj.field_c[82]) {
                                    break L8;
                                  } else {
                                    if (66 != param1) {
                                      break L8;
                                    } else {
                                      this.a(param2);
                                      return true;
                                    }
                                  }
                                }
                                if (!vj.field_c[82]) {
                                  break L6;
                                } else {
                                  if (-68 != (param1 ^ -1)) {
                                    break L6;
                                  } else {
                                    this.g((byte) 4);
                                    return true;
                                  }
                                }
                              } else {
                                this.j((byte) 3);
                                return true;
                              }
                            } else {
                              this.a(76, ((sl) this).field_m.length());
                              return true;
                            }
                          } else {
                            this.a(-113, 0);
                            return true;
                          }
                        } else {
                          if (((sl) this).field_R < ((sl) this).field_m.length()) {
                            L9: {
                              stackOut_35_0 = this;
                              stackOut_35_1 = -128;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              if (!vj.field_c[82]) {
                                stackOut_37_0 = this;
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = ((sl) this).field_R + 1;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                break L9;
                              } else {
                                stackOut_36_0 = this;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = this.h(31);
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                stackIn_38_2 = stackOut_36_2;
                                break L9;
                              }
                            }
                            this.a(stackIn_38_1, stackIn_38_2);
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        if (((sl) this).field_R > 0) {
                          L10: {
                            stackOut_28_0 = this;
                            stackOut_28_1 = 97;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            if (vj.field_c[82]) {
                              stackOut_30_0 = this;
                              stackOut_30_1 = stackIn_30_1;
                              stackOut_30_2 = this.j(32);
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              stackIn_31_2 = stackOut_30_2;
                              break L10;
                            } else {
                              stackOut_29_0 = this;
                              stackOut_29_1 = stackIn_29_1;
                              stackOut_29_2 = ((sl) this).field_R - 1;
                              stackIn_31_0 = stackOut_29_0;
                              stackIn_31_1 = stackOut_29_1;
                              stackIn_31_2 = stackOut_29_2;
                              break L10;
                            }
                          }
                          this.a(stackIn_31_1, stackIn_31_2);
                          return true;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      ((sl) this).f(57);
                      return true;
                    }
                  }
                } else {
                  if (((sl) this).field_N != ((sl) this).field_R) {
                    this.g(-14642);
                    return true;
                  } else {
                    if ((((sl) this).field_R ^ -1) >= -1) {
                      break L6;
                    } else {
                      ((sl) this).field_N = -1 + ((sl) this).field_R;
                      this.g(-14642);
                      return true;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    private final void l(int param0) {
        this.a(false);
        int var2 = -115 % ((-16 - param0) / 63);
        this.g(-14642);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (0 != ((sl) this).field_R) {
          L0: {
            if (param0 == 32) {
              break L0;
            } else {
              ((sl) this).field_T = -5L;
              break L0;
            }
          }
          var2 = -1 + ((sl) this).field_R;
          L1: while (true) {
            L2: {
              if (-1 <= (var2 ^ -1)) {
                break L2;
              } else {
                if (32 == ((sl) this).field_m.charAt(var2 + -1)) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
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
        if (param0 != 63) {
            String discarded$0 = sl.a(true, -93L);
        }
        int var2 = ((sl) this).field_N >= ((sl) this).field_R ? ((sl) this).field_R : ((sl) this).field_N;
        int var3 = ((sl) this).field_R <= ((sl) this).field_N ? ((sl) this).field_N : ((sl) this).field_R;
        return ((sl) this).field_m.substring(var2, var3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        io var6 = null;
        long var7 = 0L;
        int var5 = 60 % ((-42 - param1) / 53);
        if (null != ((sl) this).field_z) {
            if (-1 == (param0 ^ -1)) {
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
        field_Y = new byte[]{(byte)2, (byte)3, (byte)4, (byte)5};
        field_P = new int[8192];
        field_U = "Basics";
        field_W = "You and <%0> are out of lives!";
    }
}
