/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rl extends kf {
    private int field_L;
    private long field_M;
    private boolean field_N;
    private long field_J;
    static int field_E;
    private int field_F;
    private int field_G;
    private boolean field_K;
    private int field_I;
    static rb field_H;
    static volatile boolean field_O;

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 >>> -1397638113;
        if (param2 != 25668) {
            field_H = null;
        }
        return (var3 + param1) / param0 - var3;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((rl) this).field_F != ((rl) this).field_I) {
            var2 = ((rl) this).field_I < ((rl) this).field_F ? ((rl) this).field_I : ((rl) this).field_F;
            var3 = ((rl) this).field_F > ((rl) this).field_I ? ((rl) this).field_F : ((rl) this).field_I;
            ((rl) this).field_I = var2;
            ((rl) this).field_F = var2;
            ((rl) this).field_u = ((rl) this).field_u.substring(0, var2) + ((rl) this).field_u.substring(var3, ((rl) this).field_u.length());
            ((rl) this).f(false);
        }
        if (param0 != -1) {
            this.m(-24);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (((rl) this).field_G != -1) {
            var3 = ((rl) this).field_G + -((rl) this).field_u.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((rl) this).field_F != ((rl) this).field_u.length()) {
            ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_F) + param0 + ((rl) this).field_u.substring(((rl) this).field_F, ((rl) this).field_u.length());
        } else {
            ((rl) this).field_u = ((rl) this).field_u + param0;
        }
        ((rl) this).field_F = ((rl) this).field_F + param0.length();
        if (param1 < 85) {
            Object var4 = null;
            boolean discarded$0 = ((rl) this).a(10, -121, (w) null, 67, -118, 113, -122);
        }
        ((rl) this).field_I = ((rl) this).field_F;
        ((rl) this).f(false);
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ((rl) this).field_J = rf.c(0);
        var5 = 32 / ((param3 - -13) / 55);
        if (param0 == 60) {
          return false;
        } else {
          if (param0 != 62) {
            L0: {
              if (param0 < 32) {
                break L0;
              } else {
                if (param0 <= 126) {
                  L1: {
                    if (((rl) this).field_F == ((rl) this).field_I) {
                      break L1;
                    } else {
                      this.l(-1);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (0 == (((rl) this).field_G ^ -1)) {
                        break L3;
                      } else {
                        if (((rl) this).field_u.length() >= ((rl) this).field_G) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (((rl) this).field_F < ((rl) this).field_u.length()) {
                        ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_F) + param0 + ((rl) this).field_u.substring(((rl) this).field_F, ((rl) this).field_u.length());
                        ((rl) this).field_F = ((rl) this).field_F + 1;
                        ((rl) this).field_I = ((rl) this).field_F;
                        break L4;
                      } else {
                        ((rl) this).field_u = ((rl) this).field_u + param0;
                        ((rl) this).field_F = ((rl) this).field_u.length();
                        ((rl) this).field_I = ((rl) this).field_u.length();
                        break L4;
                      }
                    }
                    ((rl) this).f(false);
                    break L2;
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if (-86 == (param1 ^ -1)) {
                if (((rl) this).field_I == ((rl) this).field_F) {
                  if (((rl) this).field_F <= 0) {
                    break L5;
                  } else {
                    ((rl) this).field_I = ((rl) this).field_F + -1;
                    this.l(-1);
                    return true;
                  }
                } else {
                  this.l(-1);
                  return true;
                }
              } else {
                if (101 == param1) {
                  if (((rl) this).field_F == ((rl) this).field_I) {
                    if (((rl) this).field_F >= ((rl) this).field_u.length()) {
                      break L5;
                    } else {
                      ((rl) this).field_I = ((rl) this).field_F - -1;
                      this.l(-1);
                      return true;
                    }
                  } else {
                    this.l(-1);
                    return true;
                  }
                } else {
                  if ((param1 ^ -1) != -14) {
                    if ((param1 ^ -1) == -97) {
                      if (((rl) this).field_F <= 0) {
                        break L5;
                      } else {
                        L6: {
                          stackOut_35_0 = this;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (!wa.field_j[82]) {
                            stackOut_37_0 = this;
                            stackOut_37_1 = -1 + ((rl) this).field_F;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            break L6;
                          } else {
                            stackOut_36_0 = this;
                            stackOut_36_1 = this.n(-1);
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            break L6;
                          }
                        }
                        this.a(stackIn_38_1, 10);
                        return true;
                      }
                    } else {
                      if (97 != param1) {
                        if (-103 == (param1 ^ -1)) {
                          this.a(0, -124);
                          return true;
                        } else {
                          if (param1 != -104) {
                            if (-85 != param1) {
                              L7: {
                                if (!wa.field_j[82]) {
                                  break L7;
                                } else {
                                  if (param1 != 65) {
                                    break L7;
                                  } else {
                                    this.m(67);
                                    return true;
                                  }
                                }
                              }
                              L8: {
                                if (!wa.field_j[82]) {
                                  break L8;
                                } else {
                                  if (-67 != (param1 ^ -1)) {
                                    break L8;
                                  } else {
                                    this.k(-1);
                                    return true;
                                  }
                                }
                              }
                              if (!wa.field_j[82]) {
                                break L5;
                              } else {
                                if (param1 != 67) {
                                  break L5;
                                } else {
                                  this.f((byte) 113);
                                  return true;
                                }
                              }
                            } else {
                              this.e(false);
                              return true;
                            }
                          } else {
                            this.a(((rl) this).field_u.length(), -115);
                            return true;
                          }
                        }
                      } else {
                        if (((rl) this).field_F < ((rl) this).field_u.length()) {
                          L9: {
                            stackOut_15_0 = this;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (!wa.field_j[82]) {
                              stackOut_17_0 = this;
                              stackOut_17_1 = 1 + ((rl) this).field_F;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              break L9;
                            } else {
                              stackOut_16_0 = this;
                              stackOut_16_1 = this.i(32);
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_18_1, 5);
                          return true;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    ((rl) this).j(0);
                    return true;
                  }
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((rl) this).field_i instanceof ub) {
            var8_int = ((ub) (Object) ((rl) this).field_i).a((w) this, param4, 9, param5, bk.field_b, sh.field_e);
            this.a(-1 == var8_int ? 0 : var8_int, -124);
            var8 = rf.c(0);
            ((rl) this).field_K = 250L > -((rl) this).field_M + var8 ? true : false;
            if (!(!((rl) this).field_K)) {
                ((rl) this).field_I = this.n(param0 ^ 4807);
                ((rl) this).field_F = this.i(32);
                if (0 < ((rl) this).field_F) {
                    if (!(-33 != (((rl) this).field_u.charAt(-1 + ((rl) this).field_F) ^ -1))) {
                        ((rl) this).field_F = ((rl) this).field_F - 1;
                    }
                }
                ((rl) this).field_L = ((rl) this).field_F;
            }
            ((rl) this).field_M = var8;
            return true;
        }
        return false;
    }

    private final void e(byte param0) {
        ve var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ub var10 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (((rl) this).field_N) {
          if (((rl) this).field_i instanceof ub) {
            var10 = (ub) (Object) ((rl) this).field_i;
            var3 = var10.a((w) this, (byte) 122);
            var4 = var3.a((byte) 94);
            var5 = var10.a((w) this, 227);
            var6 = var10.a(2) >> -2073301887;
            if (var4 < var5 + -var6) {
              ((rl) this).field_l = 0;
              ((rl) this).field_p = 0;
              return;
            } else {
              L0: {
                var7 = ((rl) this).field_p - -var3.a((byte) -116, ((rl) this).field_F);
                if (-var6 + var5 < var7) {
                  ((rl) this).field_p = -var7 - var6 - (-var5 - ((rl) this).field_p);
                  break L0;
                } else {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    ((rl) this).field_p = ((rl) this).field_p - -var6 - var7;
                    break L0;
                  }
                }
              }
              L1: {
                if ((((rl) this).field_p ^ -1) < -1) {
                  ((rl) this).field_p = 0;
                  break L1;
                } else {
                  if (-var5 - -var6 > ((rl) this).field_p) {
                    ((rl) this).field_p = -var5 - -var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var8 = 62 / ((param0 - 30) / 38);
              return;
            }
          } else {
            return;
          }
        } else {
          ((rl) this).field_l = 0;
          ((rl) this).field_p = 0;
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if ((((rl) this).field_F ^ -1) == param0) {
            return ((rl) this).field_F;
        }
        for (var2 = ((rl) this).field_F + -1; (var2 ^ -1) < -1; var2--) {
            // if_icmpeq L54
        }
        return var2;
    }

    final void a(String param0, int param1, boolean param2) {
        if (!(param0 != null)) {
            param0 = "";
        }
        if (param1 != -1) {
            this.f((byte) 39);
        }
        ((rl) this).field_u = param0;
        int var4 = param0.length();
        if (0 != (((rl) this).field_G ^ -1)) {
            if (((rl) this).field_G < var4) {
                ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_G);
            }
        }
        ((rl) this).field_I = ((rl) this).field_u.length();
        ((rl) this).field_F = ((rl) this).field_u.length();
        if (!(param2)) {
            ((rl) this).f(false);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ub var8 = null;
        long var6 = 0L;
        if (((rl) this).field_i != null) {
            if (!(param3 != 0)) {
                ((rl) this).field_i.a(param1, param2, ((rl) this).field_D, (w) this, -3284);
                if (!(!(((rl) this).field_i instanceof ub))) {
                    var8 = (ub) (Object) ((rl) this).field_i;
                    if (!(((rl) this).field_F == ((rl) this).field_I)) {
                        var8.a(param1, param2, (w) this, (byte) 31, ((rl) this).field_I, ((rl) this).field_F);
                    }
                    var6 = rf.c(0);
                    if (!((var6 + -((rl) this).field_J) % 1000L >= 500L)) {
                        var8.a(((rl) this).field_F, param2, param1, (w) this, true);
                    }
                }
            }
        }
        if (param0 != -115) {
            field_O = false;
        }
    }

    final void j(int param0) {
        ((rl) this).field_u = "";
        ((rl) this).field_F = param0;
        ((rl) this).field_I = 0;
        ((rl) this).f(false);
    }

    public static void g(byte param0) {
        field_H = null;
        int var1 = -50 / ((param0 - 16) / 52);
    }

    private final void a(int param0, int param1) {
        ((rl) this).field_F = param0;
        if (!(wa.field_j[81])) {
            ((rl) this).field_I = ((rl) this).field_F;
        }
        int var3 = 79 % ((-75 - param1) / 40);
    }

    void f(boolean param0) {
        if (((rl) this).field_r instanceof nf) {
            ((nf) (Object) ((rl) this).field_r).a((byte) 10, (rl) this);
        }
        if (param0) {
            ((rl) this).field_N = true;
        }
    }

    private final void m(int param0) {
        if (param0 < 40) {
            return;
        }
        this.k(-1);
        this.l(-1);
    }

    void a(byte param0, w param1, int param2, int param3) {
        ub var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.e((byte) 94);
        if (((rl) this).field_h == 1) {
            if (((rl) this).field_i instanceof ub) {
                var5 = (ub) (Object) ((rl) this).field_i;
                var6 = var5.a((w) this, param2, 9, param3, bk.field_b, sh.field_e);
                if (var6 != -1) {
                    if (((rl) this).field_K) {
                        if (var6 < ((rl) this).field_L) {
                            if (((rl) this).field_I < var6) {
                                var6 = ((rl) this).field_L;
                            }
                        }
                    }
                    ((rl) this).field_F = var6;
                }
            }
            ((rl) this).field_J = rf.c(param0 ^ -119);
        }
    }

    private final void e(boolean param0) {
        if (!(!(((rl) this).field_r instanceof nf))) {
            ((nf) (Object) ((rl) this).field_r).a((rl) this, true);
        }
        if (param0) {
            this.m(-20);
        }
    }

    private final void f(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.l(-1);
              var3 = -67 % ((19 - param0) / 35);
              this.a(var2, (byte) 100);
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

    private final void k(int param0) {
        String var2 = this.d((byte) -83);
        if (!((var2.length() ^ -1) >= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.d((byte) -41)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String d(byte param0) {
        int var2 = ((rl) this).field_F > ((rl) this).field_I ? ((rl) this).field_I : ((rl) this).field_F;
        int var3 = ((rl) this).field_F <= ((rl) this).field_I ? ((rl) this).field_I : ((rl) this).field_F;
        if (param0 > -27) {
            return null;
        }
        return ((rl) this).field_u.substring(var2, var3);
    }

    private final int i(int param0) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = ((rl) this).field_u.length();
        if (var2 == ((rl) this).field_F) {
            return ((rl) this).field_F;
        }
        if (param0 != 32) {
            ((rl) this).field_F = 55;
        }
        for (var3 = 1 + ((rl) this).field_F; var3 < var2; var3++) {
            // if_icmpeq L74
        }
        return var3;
    }

    rl(String param0, vd param1, int param2) {
        super(param0, param1);
        ((rl) this).field_M = 0L;
        ((rl) this).field_L = -1;
        ((rl) this).field_K = false;
        ((rl) this).field_i = nb.field_z.field_a;
        ((rl) this).field_G = param2;
        ((rl) this).a(param0, -1, true);
        ((rl) this).field_N = true;
        ((rl) this).field_J = rf.c(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new rb();
        field_O = false;
    }
}
