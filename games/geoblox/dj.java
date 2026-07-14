/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends hk {
    static byte[] field_F;
    private int field_H;
    private int field_L;
    private int field_J;
    private boolean field_G;
    private boolean field_E;
    private long field_P;
    static byte[][] field_I;
    private int field_M;
    private long field_O;
    static int[] field_N;

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 0) {
            ((dj) this).field_J = -7;
        }
        if (((dj) this).field_L != ((dj) this).field_H) {
            var2 = ((dj) this).field_L >= ((dj) this).field_H ? ((dj) this).field_H : ((dj) this).field_L;
            var3 = ((dj) this).field_H > ((dj) this).field_L ? ((dj) this).field_H : ((dj) this).field_L;
            ((dj) this).field_H = var2;
            ((dj) this).field_L = var2;
            ((dj) this).field_s = ((dj) this).field_s.substring(0, var2) + ((dj) this).field_s.substring(var3, ((dj) this).field_s.length());
            ((dj) this).g((byte) -117);
        }
    }

    void a(boolean param0, int param1, el param2, int param3) {
        cc var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.j(-115);
        if (!(-2 != (((dj) this).field_f ^ -1))) {
            if (((dj) this).field_q instanceof cc) {
                var7 = (cc) (Object) ((dj) this).field_q;
                var6 = var7.a((el) this, qa.field_a, -15539, param1, ue.field_e, param3);
                if (!(-1 == var6)) {
                    if (((dj) this).field_G) {
                        if (((dj) this).field_J > var6) {
                            if (((dj) this).field_L < var6) {
                                var6 = ((dj) this).field_J;
                            }
                        }
                    }
                    ((dj) this).field_H = var6;
                }
            }
            ((dj) this).field_O = oa.a(-12520);
        }
        if (param0) {
            field_I = null;
        }
    }

    private final int h(byte param0) {
        int var4 = Geoblox.field_C;
        int var2 = ((dj) this).field_s.length();
        if (var2 == ((dj) this).field_H) {
            return ((dj) this).field_H;
        }
        int var3 = 1 + ((dj) this).field_H;
        if (param0 != -57) {
            String discarded$0 = this.k((byte) -79);
        }
        while (var3 < var2) {
            // if_icmpeq L75
            var3++;
        }
        return var3;
    }

    private final String k(byte param0) {
        int var2 = 33 % ((-77 - param0) / 39);
        int var3 = ((dj) this).field_L >= ((dj) this).field_H ? ((dj) this).field_H : ((dj) this).field_L;
        int var4 = ((dj) this).field_L < ((dj) this).field_H ? ((dj) this).field_H : ((dj) this).field_L;
        return ((dj) this).field_s.substring(var3, var4);
    }

    final static dm[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -70) {
            field_F = null;
        }
        dm[] var6 = new dm[9];
        dm[] var5 = var6;
        var6[6] = ef.a(0, param0, param4);
        var5[3] = ef.a(0, param0, param4);
        var5[2] = ef.a(0, param0, param4);
        var5[1] = ef.a(0, param0, param4);
        var5[0] = ef.a(0, param0, param4);
        var6[8] = ef.a(0, param2, param4);
        var5[7] = ef.a(0, param2, param4);
        var5[5] = ef.a(0, param2, param4);
        if (!(param3 == 0)) {
            var6[4] = ef.a(0, param3, 64);
        }
        return var5;
    }

    dj(String param0, bb param1, int param2) {
        super(param0, param1);
        ((dj) this).field_G = false;
        ((dj) this).field_P = 0L;
        ((dj) this).field_J = -1;
        ((dj) this).field_M = param2;
        ((dj) this).field_q = hb.field_j.field_g;
        ((dj) this).a(-128, param0, true);
        ((dj) this).field_E = true;
        ((dj) this).field_O = oa.a(-12520);
    }

    private final void h(int param0) {
        this.i(-23161);
        if (param0 <= 29) {
            ((dj) this).field_G = false;
        }
        this.g(0);
    }

    private final void a(String param0, int param1) {
        int var4 = 0;
        int var3 = -6 / ((param1 - 63) / 50);
        if (!(((dj) this).field_M == -1)) {
            var4 = ((dj) this).field_M + -((dj) this).field_s.length();
            if (-1 >= (var4 ^ -1)) {
                return;
            }
            param0 = param0.substring(0, var4);
        }
        if (((dj) this).field_H == ((dj) this).field_s.length()) {
            ((dj) this).field_s = ((dj) this).field_s + param0;
        } else {
            ((dj) this).field_s = ((dj) this).field_s.substring(0, ((dj) this).field_H) + param0 + ((dj) this).field_s.substring(((dj) this).field_H, ((dj) this).field_s.length());
        }
        ((dj) this).field_H = ((dj) this).field_H + param0.length();
        ((dj) this).field_L = ((dj) this).field_H;
        ((dj) this).g((byte) -36);
    }

    private final void a(int param0, byte param1) {
        ((dj) this).field_H = param0;
        if (param1 >= -114) {
            this.j(-114);
        }
        if (!(kj.field_o[81])) {
            ((dj) this).field_L = ((dj) this).field_H;
        }
    }

    public static void l(byte param0) {
        field_F = null;
        if (param0 != -15) {
            return;
        }
        field_N = null;
        field_I = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8 = 0;
        long var8_long = 0L;
        if (super.a(param0, 104, param2, param3, param4, param5, param6)) {
            if (((dj) this).field_q instanceof cc) {
                var8 = ((cc) (Object) ((dj) this).field_q).a((el) this, qa.field_a, -15539, param0, ue.field_e, param2);
                this.a((var8 ^ -1) == 0 ? 0 : var8, (byte) -123);
                var8_long = oa.a(-12520);
                ((dj) this).field_G = -251L < (var8_long - ((dj) this).field_P ^ -1L) ? true : false;
                if (!(!((dj) this).field_G)) {
                    ((dj) this).field_L = this.j((byte) 77);
                    ((dj) this).field_H = this.h((byte) -57);
                    if (0 < ((dj) this).field_H) {
                        if (-33 == (((dj) this).field_s.charAt(((dj) this).field_H + -1) ^ -1)) {
                            ((dj) this).field_H = ((dj) this).field_H - 1;
                        }
                    }
                    ((dj) this).field_J = ((dj) this).field_H;
                }
                ((dj) this).field_P = var8_long;
                return true;
            }
        }
        var8 = 70 / ((param1 - -3) / 38);
        return false;
    }

    private final void f(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.g(param0 ^ param0);
              this.a(var2, param0 ^ 43);
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

    final void a(int param0, int param1, byte param2, int param3) {
        cc var6 = null;
        long var7 = 0L;
        int var5 = -124 % ((param2 - 1) / 43);
        if (((dj) this).field_q != null) {
            if (!(param3 != 0)) {
                ((dj) this).field_q.a(param0, -8, param1, ((dj) this).field_D, (el) this);
                if (((dj) this).field_q instanceof cc) {
                    var6 = (cc) (Object) ((dj) this).field_q;
                    if (!(((dj) this).field_H == ((dj) this).field_L)) {
                        var6.a(((dj) this).field_L, 0, param1, param0, ((dj) this).field_H, (el) this);
                    }
                    var7 = oa.a(-12520);
                    if (((-((dj) this).field_O + var7) % 1000L ^ -1L) > -501L) {
                        var6.a(param0, ((dj) this).field_H, -2, (el) this, param1);
                    }
                }
            }
        }
    }

    private final void m(byte param0) {
        if (((dj) this).field_u instanceof ga) {
            ((ga) (Object) ((dj) this).field_u).a((dj) this, -18649);
        }
        if (param0 < 107) {
            ((dj) this).field_G = true;
        }
    }

    private final int j(byte param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        if (0 == ((dj) this).field_H) {
            return ((dj) this).field_H;
        }
        if (param0 != 77) {
            return 108;
        }
        for (var2 = ((dj) this).field_H + -1; -1 > (var2 ^ -1); var2--) {
            // if_icmpeq L61
        }
        return var2;
    }

    private final void i(int param0) {
        if (param0 != -23161) {
            return;
        }
        String var2 = this.k((byte) -128);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k((byte) -117)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void i(byte param0) {
        ((dj) this).field_L = 0;
        ((dj) this).field_H = 0;
        ((dj) this).field_s = "";
        ((dj) this).g((byte) -78);
        if (param0 <= 20) {
            ((dj) this).field_E = true;
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        if (param1 == 13) {
          ((dj) this).field_O = oa.a(-12520);
          if (60 == param2) {
            return false;
          } else {
            if (param2 != 62) {
              L0: {
                if (32 > param2) {
                  break L0;
                } else {
                  if (param2 <= 126) {
                    L1: {
                      if (((dj) this).field_H == ((dj) this).field_L) {
                        break L1;
                      } else {
                        this.g(0);
                        break L1;
                      }
                    }
                    L2: {
                      L3: {
                        if (-1 == ((dj) this).field_M) {
                          break L3;
                        } else {
                          if (((dj) this).field_s.length() < ((dj) this).field_M) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (((dj) this).field_H >= ((dj) this).field_s.length()) {
                          ((dj) this).field_s = ((dj) this).field_s + param2;
                          ((dj) this).field_H = ((dj) this).field_s.length();
                          ((dj) this).field_L = ((dj) this).field_s.length();
                          break L4;
                        } else {
                          ((dj) this).field_s = ((dj) this).field_s.substring(0, ((dj) this).field_H) + param2 + ((dj) this).field_s.substring(((dj) this).field_H, ((dj) this).field_s.length());
                          ((dj) this).field_H = ((dj) this).field_H + 1;
                          ((dj) this).field_L = ((dj) this).field_H;
                          break L4;
                        }
                      }
                      ((dj) this).g((byte) -36);
                      break L2;
                    }
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
              L5: {
                if ((param0 ^ -1) == -86) {
                  if (((dj) this).field_H == ((dj) this).field_L) {
                    if (0 < ((dj) this).field_H) {
                      ((dj) this).field_L = ((dj) this).field_H + -1;
                      this.g(param1 ^ 13);
                      return true;
                    } else {
                      break L5;
                    }
                  } else {
                    this.g(0);
                    return true;
                  }
                } else {
                  if (101 != param0) {
                    if (param0 == 13) {
                      ((dj) this).i((byte) 76);
                      return true;
                    } else {
                      if (-97 == param0) {
                        if (0 < ((dj) this).field_H) {
                          L6: {
                            stackOut_41_0 = this;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (!kj.field_o[82]) {
                              stackOut_43_0 = this;
                              stackOut_43_1 = ((dj) this).field_H - 1;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L6;
                            } else {
                              stackOut_42_0 = this;
                              stackOut_42_1 = this.j((byte) 77);
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              break L6;
                            }
                          }
                          this.a(stackIn_44_1, (byte) -126);
                          return true;
                        } else {
                          break L5;
                        }
                      } else {
                        if (-98 == param0) {
                          if (((dj) this).field_H >= ((dj) this).field_s.length()) {
                            break L5;
                          } else {
                            L7: {
                              stackOut_35_0 = this;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              if (!kj.field_o[82]) {
                                stackOut_37_0 = this;
                                stackOut_37_1 = ((dj) this).field_H - -1;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                break L7;
                              } else {
                                stackOut_36_0 = this;
                                stackOut_36_1 = this.h((byte) -57);
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_38_1, (byte) -125);
                            return true;
                          }
                        } else {
                          if (102 != param0) {
                            if (param0 == 103) {
                              this.a(((dj) this).field_s.length(), (byte) -126);
                              return true;
                            } else {
                              if (-85 != (param0 ^ -1)) {
                                L8: {
                                  if (!kj.field_o[82]) {
                                    break L8;
                                  } else {
                                    if (param0 != 65) {
                                      break L8;
                                    } else {
                                      this.h(112);
                                      return true;
                                    }
                                  }
                                }
                                L9: {
                                  if (!kj.field_o[82]) {
                                    break L9;
                                  } else {
                                    if (-67 != (param0 ^ -1)) {
                                      break L9;
                                    } else {
                                      this.i(-23161);
                                      return true;
                                    }
                                  }
                                }
                                if (!kj.field_o[82]) {
                                  break L5;
                                } else {
                                  if (67 == param0) {
                                    this.f(82);
                                    return true;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                this.m((byte) 111);
                                return true;
                              }
                            }
                          } else {
                            this.a(0, (byte) -118);
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    if (((dj) this).field_L != ((dj) this).field_H) {
                      this.g(0);
                      return true;
                    } else {
                      if (((dj) this).field_H >= ((dj) this).field_s.length()) {
                        break L5;
                      } else {
                        ((dj) this).field_L = ((dj) this).field_H - -1;
                        this.g(0);
                        return true;
                      }
                    }
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void j(int param0) {
        int var8 = Geoblox.field_C;
        if (!(((dj) this).field_E)) {
            ((dj) this).field_n = 0;
            ((dj) this).field_k = 0;
            return;
        }
        if (!(((dj) this).field_q instanceof cc)) {
            return;
        }
        cc var9 = (cc) (Object) ((dj) this).field_q;
        if (param0 > -66) {
            return;
        }
        dk var3 = var9.a((byte) 119, (el) this);
        int var4 = var3.a(96);
        int var5 = var9.a((el) this, -1);
        int var6 = var9.a(1) >> -2144366815;
        if (var4 < var5 + -var6) {
            ((dj) this).field_k = 0;
            ((dj) this).field_n = 0;
            return;
        }
        int var7 = ((dj) this).field_k + var3.a(((dj) this).field_H, 120);
        if (var7 <= var5 - var6) {
            // if_icmpge L204
            ((dj) this).field_k = ((dj) this).field_k - (-var6 + var7);
        } else {
            ((dj) this).field_k = ((dj) this).field_k - (var7 - -var6 - var5);
        }
        if ((((dj) this).field_k ^ -1) < -1) {
            ((dj) this).field_k = 0;
        } else {
            if (var6 + -var5 > ((dj) this).field_k) {
                ((dj) this).field_k = var6 + -var5;
            }
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int var4 = 8 / ((param0 - -65) / 44);
        if (param1 == null) {
            param1 = "";
        }
        ((dj) this).field_s = param1;
        int var5 = param1.length();
        if (0 != (((dj) this).field_M ^ -1)) {
            if (!(((dj) this).field_M >= var5)) {
                ((dj) this).field_s = ((dj) this).field_s.substring(0, ((dj) this).field_M);
            }
        }
        ((dj) this).field_L = ((dj) this).field_s.length();
        ((dj) this).field_H = ((dj) this).field_s.length();
        if (!param2) {
            ((dj) this).g((byte) -58);
        }
    }

    void g(byte param0) {
        if (param0 >= -16) {
            return;
        }
        if (!(!(((dj) this).field_u instanceof ga))) {
            ((ga) (Object) ((dj) this).field_u).a((dj) this, (byte) 74);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new byte[520];
        field_I = new byte[1000][];
        field_N = new int[8192];
    }
}
