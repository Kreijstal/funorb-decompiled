/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends bb {
    private long field_L;
    private int field_N;
    static boolean field_U;
    static long field_P;
    private int field_M;
    private long field_Q;
    static int field_S;
    private int field_O;
    private boolean field_T;
    private boolean field_R;
    private int field_K;

    private final void q(int param0) {
        String var2 = this.p(0);
        if (param0 <= 82) {
            ((c) this).field_O = -105;
        }
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(0)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((c) this).field_K == ((c) this).field_M)) {
            var2 = ((c) this).field_M <= ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
            var3 = ((c) this).field_M > ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
            ((c) this).field_M = var2;
            ((c) this).field_K = var2;
            ((c) this).field_i = ((c) this).field_i.substring(0, var2) + ((c) this).field_i.substring(var3, ((c) this).field_i.length());
            ((c) this).i(-1);
        }
        if (param0) {
            ((c) this).field_R = true;
        }
    }

    final static void o(int param0) {
        ij.field_H = null;
        of.field_d = null;
        if (param0 != -28210) {
            field_S = 0;
        }
        vg.field_I = null;
        rd.field_d = null;
        ob.field_a = null;
        b.field_b = null;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        eg var8 = null;
        long var6 = 0L;
        if (!param2) {
            ((c) this).field_O = -50;
        }
        if (null != ((c) this).field_p) {
            if (!(-1 != (param3 ^ -1))) {
                ((c) this).field_p.a(-74, param1, ((c) this).field_D, (qa) this, param0);
                if (((c) this).field_p instanceof eg) {
                    var8 = (eg) (Object) ((c) this).field_p;
                    if (((c) this).field_M != ((c) this).field_K) {
                        var8.a((qa) this, ((c) this).field_M, param0, ((c) this).field_K, -30298, param1);
                    }
                    var6 = lj.a((byte) -27);
                    if (((var6 + -((c) this).field_Q) % 1000L ^ -1L) > -501L) {
                        var8.a(param0, 0, (qa) this, ((c) this).field_M, param1);
                    }
                }
            }
        }
    }

    final void r(int param0) {
        ((c) this).field_M = 0;
        ((c) this).field_K = 0;
        ((c) this).field_i = "";
        ((c) this).i(-1);
        if (param0 != 32) {
            field_U = false;
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (param0 != (((c) this).field_O ^ -1)) {
            var3 = ((c) this).field_O - ((c) this).field_i.length();
            if (var3 >= 0) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((c) this).field_M == ((c) this).field_i.length()) {
            ((c) this).field_i = ((c) this).field_i + param1;
        } else {
            ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param1 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
        }
        ((c) this).field_M = ((c) this).field_M + param1.length();
        ((c) this).field_K = ((c) this).field_M;
        ((c) this).i(-1);
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (((c) this).field_p instanceof eg) {
                var8_int = ((eg) (Object) ((c) this).field_p).a(kc.field_b, (qa) this, (byte) 97, param6, param0, ag.field_f);
                this.a(-1 != var8_int ? var8_int : 0, -57);
                var8 = lj.a((byte) -93);
                ((c) this).field_R = (var8 - ((c) this).field_L ^ -1L) > -251L ? true : false;
                if (!(!((c) this).field_R)) {
                    ((c) this).field_K = this.j(127);
                    ((c) this).field_M = this.l(32);
                    if ((((c) this).field_M ^ -1) < -1) {
                        if (!(32 != ((c) this).field_i.charAt(-1 + ((c) this).field_M))) {
                            ((c) this).field_M = ((c) this).field_M - 1;
                        }
                    }
                    ((c) this).field_N = ((c) this).field_M;
                }
                ((c) this).field_L = var8;
                return true;
            }
        }
        return false;
    }

    private final void n(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == -1) {
                  break L0;
                } else {
                  ((c) this).field_N = 63;
                  break L0;
                }
              }
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.c(false);
              this.a(param0 + 1, var2_ref);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    c(String param0, kd param1, int param2) {
        super(param0, param1);
        ((c) this).field_N = -1;
        ((c) this).field_R = false;
        ((c) this).field_L = 0L;
        ((c) this).field_p = nf.field_M.field_l;
        ((c) this).field_O = param2;
        ((c) this).a(true, (byte) -78, param0);
        ((c) this).field_T = true;
        ((c) this).field_Q = lj.a((byte) -19);
    }

    private final void m(int param0) {
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        eg var10 = null;
        var8 = fleas.field_A ? 1 : 0;
        if (((c) this).field_T) {
          if (!(((c) this).field_p instanceof eg)) {
            return;
          } else {
            L0: {
              var10 = (eg) (Object) ((c) this).field_p;
              var3 = var10.a((qa) this, (byte) -35);
              var4 = var3.b((byte) 97);
              if (param0 > 89) {
                break L0;
              } else {
                var9 = null;
                boolean discarded$1 = ((c) this).a(11, 11, (qa) null, '*');
                break L0;
              }
            }
            var5 = var10.b((qa) this, (byte) -67);
            var6 = var10.a((byte) 127) >> -1183616383;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = ((c) this).field_r - -var3.c(-1, ((c) this).field_M);
                if (var5 + -var6 >= var7) {
                  if (var7 < var6) {
                    ((c) this).field_r = ((c) this).field_r + (var6 - var7);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((c) this).field_r = ((c) this).field_r - (-var5 - -var6) - var7;
                  break L1;
                }
              }
              L2: {
                if (((c) this).field_r <= 0) {
                  if (((c) this).field_r >= -var5 - -var6) {
                    break L2;
                  } else {
                    ((c) this).field_r = -var5 + var6;
                    break L2;
                  }
                } else {
                  ((c) this).field_r = 0;
                  break L2;
                }
              }
              return;
            } else {
              ((c) this).field_r = 0;
              ((c) this).field_n = 0;
              return;
            }
          }
        } else {
          ((c) this).field_n = 0;
          ((c) this).field_r = 0;
          return;
        }
    }

    private final void k(int param0) {
        if (param0 != -14) {
            return;
        }
        this.q(param0 ^ -97);
        this.c(false);
    }

    private final int j(int param0) {
        int var3 = fleas.field_A ? 1 : 0;
        if (0 == ((c) this).field_M) {
            return ((c) this).field_M;
        }
        int var2 = -1 + ((c) this).field_M;
        if (param0 <= 79) {
            ((c) this).r(-57);
        }
        while (var2 < -1) {
            // if_icmpeq L65
            var2--;
        }
        return var2;
    }

    final void a(boolean param0, byte param1, String param2) {
        if (param2 == null) {
            param2 = "";
        }
        if (param1 > -39) {
            ((c) this).i(125);
        }
        ((c) this).field_i = param2;
        int var4 = param2.length();
        if (-1 != ((c) this).field_O) {
            if (!(((c) this).field_O >= var4)) {
                ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_O);
            }
        }
        ((c) this).field_K = ((c) this).field_i.length();
        ((c) this).field_M = ((c) this).field_i.length();
        if (!(param0)) {
            ((c) this).i(-1);
        }
    }

    private final void a(int param0, int param1) {
        if (param1 > -27) {
            int discarded$0 = this.j(-45);
        }
        ((c) this).field_M = param0;
        if (!(ei.field_H[81])) {
            ((c) this).field_K = ((c) this).field_M;
        }
    }

    private final void d(byte param0) {
        if (param0 <= 88) {
            return;
        }
        if (!(!(((c) this).field_s instanceof nk))) {
            ((nk) (Object) ((c) this).field_s).a(-31825, (c) this);
        }
    }

    void i(int param0) {
        if (!(!(((c) this).field_s instanceof nk))) {
            ((nk) (Object) ((c) this).field_s).b(param0 ^ -41, (c) this);
        }
        if (param0 != -1) {
            field_U = true;
        }
    }

    private final String p(int param0) {
        if (param0 != 0) {
            return null;
        }
        int var2 = ((c) this).field_M <= ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
        int var3 = ((c) this).field_M > ((c) this).field_K ? ((c) this).field_M : ((c) this).field_K;
        return ((c) this).field_i.substring(var2, var3);
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
        ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, param11, param10, param6);
        if (param1 <= 66) {
            field_P = 53L;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        eg var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, (byte) -93);
        if (param3 >= -85) {
            ((c) this).field_N = 68;
        }
        this.m(127);
        if (!(((c) this).field_v != 1)) {
            if (!(!(((c) this).field_p instanceof eg))) {
                var7 = (eg) (Object) ((c) this).field_p;
                var6 = var7.a(kc.field_b, (qa) this, (byte) 80, param1, param0, ag.field_f);
                if (!(0 == (var6 ^ -1))) {
                    if (((c) this).field_R) {
                        if (((c) this).field_N > var6) {
                            if (!(((c) this).field_K >= var6)) {
                                var6 = ((c) this).field_N;
                            }
                        }
                    }
                    ((c) this).field_M = var6;
                }
            }
            ((c) this).field_Q = lj.a((byte) -81);
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        ((c) this).field_Q = lj.a((byte) -37);
        if (param0 == -2) {
          L0: {
            if (param3 == 60) {
              break L0;
            } else {
              if (62 == param3) {
                break L0;
              } else {
                L1: {
                  if (param3 < 32) {
                    break L1;
                  } else {
                    if (126 < param3) {
                      break L1;
                    } else {
                      L2: {
                        if (((c) this).field_K != ((c) this).field_M) {
                          this.c(false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (0 == (((c) this).field_O ^ -1)) {
                          break L3;
                        } else {
                          if (((c) this).field_i.length() < ((c) this).field_O) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      L4: {
                        if (((c) this).field_M >= ((c) this).field_i.length()) {
                          ((c) this).field_i = ((c) this).field_i + param3;
                          ((c) this).field_M = ((c) this).field_i.length();
                          ((c) this).field_K = ((c) this).field_i.length();
                          break L4;
                        } else {
                          ((c) this).field_i = ((c) this).field_i.substring(0, ((c) this).field_M) + param3 + ((c) this).field_i.substring(((c) this).field_M, ((c) this).field_i.length());
                          ((c) this).field_M = ((c) this).field_M + 1;
                          ((c) this).field_K = ((c) this).field_M;
                          break L4;
                        }
                      }
                      ((c) this).i(-1);
                      return true;
                    }
                  }
                }
                L5: {
                  if (85 == param1) {
                    if (((c) this).field_M == ((c) this).field_K) {
                      if (0 >= ((c) this).field_M) {
                        break L5;
                      } else {
                        ((c) this).field_K = -1 + ((c) this).field_M;
                        this.c(false);
                        return true;
                      }
                    } else {
                      this.c(false);
                      return true;
                    }
                  } else {
                    if (-102 == param1) {
                      if (((c) this).field_M != ((c) this).field_K) {
                        this.c(false);
                        return true;
                      } else {
                        if (((c) this).field_M < ((c) this).field_i.length()) {
                          ((c) this).field_K = ((c) this).field_M - -1;
                          this.c(false);
                          return true;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      if (-14 != param1) {
                        if ((param1 ^ -1) != -97) {
                          if (param1 != 97) {
                            if (102 == param1) {
                              this.a(0, -47);
                              return true;
                            } else {
                              if (103 == param1) {
                                this.a(((c) this).field_i.length(), -92);
                                return true;
                              } else {
                                if ((param1 ^ -1) == -85) {
                                  this.d((byte) 115);
                                  return true;
                                } else {
                                  L6: {
                                    if (!ei.field_H[82]) {
                                      break L6;
                                    } else {
                                      if (65 != param1) {
                                        break L6;
                                      } else {
                                        this.k(-14);
                                        return true;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (!ei.field_H[82]) {
                                      break L7;
                                    } else {
                                      if ((param1 ^ -1) != -67) {
                                        break L7;
                                      } else {
                                        this.q(105);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!ei.field_H[82]) {
                                    break L5;
                                  } else {
                                    if (param1 == 67) {
                                      this.n(-1);
                                      return true;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (((c) this).field_M < ((c) this).field_i.length()) {
                              L8: {
                                stackOut_32_0 = this;
                                stackIn_34_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (!ei.field_H[82]) {
                                  stackOut_34_0 = this;
                                  stackOut_34_1 = ((c) this).field_M - -1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  break L8;
                                } else {
                                  stackOut_33_0 = this;
                                  stackOut_33_1 = this.l(32);
                                  stackIn_35_0 = stackOut_33_0;
                                  stackIn_35_1 = stackOut_33_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_35_1, -72);
                              return true;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          if (((c) this).field_M > 0) {
                            L9: {
                              stackOut_25_0 = this;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (ei.field_H[82]) {
                                stackOut_27_0 = this;
                                stackOut_27_1 = this.j(param0 ^ -100);
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L9;
                              } else {
                                stackOut_26_0 = this;
                                stackOut_26_1 = ((c) this).field_M + -1;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                break L9;
                              }
                            }
                            this.a(stackIn_28_1, -127);
                            return true;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        ((c) this).r(32);
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
        } else {
          return true;
        }
    }

    private final int l(int param0) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        int var2 = ((c) this).field_i.length();
        if (!(var2 != ((c) this).field_M)) {
            return ((c) this).field_M;
        }
        if (param0 != 32) {
            return -60;
        }
        for (var3 = ((c) this).field_M - -1; var3 < var2; var3++) {
            // if_icmpeq L71
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
    }
}
