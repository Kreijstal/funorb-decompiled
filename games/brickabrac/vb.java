/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends d {
    private long field_P;
    private int field_Q;
    private boolean field_M;
    private int field_L;
    static int field_S;
    private int field_T;
    static mh field_K;
    private boolean field_N;
    private int field_R;
    private long field_O;

    final void c(boolean param0) {
        ((vb) this).field_L = 0;
        ((vb) this).field_A = "";
        ((vb) this).field_T = 0;
        ((vb) this).n(122);
        if (param0) {
            field_S = 97;
        }
    }

    public static void i(int param0) {
        if (param0 < 63) {
            return;
        }
        field_K = null;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((vb) this).field_L == ((vb) this).field_T)) {
            var2 = ((vb) this).field_L >= ((vb) this).field_T ? ((vb) this).field_T : ((vb) this).field_L;
            var3 = ((vb) this).field_L < ((vb) this).field_T ? ((vb) this).field_T : ((vb) this).field_L;
            ((vb) this).field_L = var2;
            ((vb) this).field_T = var2;
            ((vb) this).field_A = ((vb) this).field_A.substring(0, var2) + ((vb) this).field_A.substring(var3, ((vb) this).field_A.length());
            ((vb) this).n(46);
        }
        if (param0 >= -34) {
            Object var4 = null;
            this.a(false, (String) null);
        }
    }

    vb(String param0, uh param1, int param2) {
        super(param0, param1);
        ((vb) this).field_P = 0L;
        ((vb) this).field_M = false;
        ((vb) this).field_R = -1;
        ((vb) this).field_l = bj.field_T.field_b;
        ((vb) this).field_Q = param2;
        ((vb) this).a(param0, -12592, true);
        ((vb) this).field_N = true;
        ((vb) this).field_O = ue.a(false);
    }

    private final int h(byte param0) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = ((vb) this).field_A.length();
        if (!(var2 != ((vb) this).field_T)) {
            return ((vb) this).field_T;
        }
        if (param0 < 93) {
            return -128;
        }
        for (var3 = ((vb) this).field_T + 1; var3 < var2; var3++) {
            // if_icmpeq L71
        }
        return var3;
    }

    private final void f(byte param0) {
        ep var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (((vb) this).field_N) {
          if (!(((vb) this).field_l instanceof qe)) {
            return;
          } else {
            L0: {
              if (param0 == 81) {
                break L0;
              } else {
                ((vb) this).field_L = 16;
                break L0;
              }
            }
            var9 = (qe) (Object) ((vb) this).field_l;
            var3 = var9.c((oc) this, -3);
            var4 = var3.b(31458);
            var5 = var9.a(61823, (oc) this);
            var6 = var9.a((byte) 99) >> -671140159;
            if (var4 >= var5 - var6) {
              L1: {
                var7 = ((vb) this).field_r - -var3.a(((vb) this).field_T, (byte) -108);
                if (-var6 + var5 < var7) {
                  ((vb) this).field_r = -var7 - (-var5 - -var6 - ((vb) this).field_r);
                  break L1;
                } else {
                  if (var7 < var6) {
                    ((vb) this).field_r = var6 - (var7 - ((vb) this).field_r);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-1 > (((vb) this).field_r ^ -1)) {
                  ((vb) this).field_r = 0;
                  break L2;
                } else {
                  if (((vb) this).field_r < -var5 - -var6) {
                    ((vb) this).field_r = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              ((vb) this).field_B = 0;
              ((vb) this).field_r = 0;
              return;
            }
          }
        } else {
          ((vb) this).field_r = 0;
          ((vb) this).field_B = 0;
          return;
        }
    }

    private final void a(boolean param0, String param1) {
        int var3 = 0;
        if (!(((vb) this).field_Q == -1)) {
            var3 = ((vb) this).field_Q - ((vb) this).field_A.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((vb) this).field_T != ((vb) this).field_A.length()) {
            ((vb) this).field_A = ((vb) this).field_A.substring(0, ((vb) this).field_T) + param1 + ((vb) this).field_A.substring(((vb) this).field_T, ((vb) this).field_A.length());
        } else {
            ((vb) this).field_A = ((vb) this).field_A + param1;
        }
        ((vb) this).field_T = ((vb) this).field_T + param1.length();
        ((vb) this).field_L = ((vb) this).field_T;
        if (param0) {
            this.l(95);
        }
        ((vb) this).n(80);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        qe var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.f((byte) 81);
        if (!(-2 != (((vb) this).field_n ^ -1))) {
            if (((vb) this).field_l instanceof qe) {
                var7 = (qe) (Object) ((vb) this).field_l;
                var6 = var7.a((oc) this, pq.field_k, true, param3, po.field_a, param2);
                if (!(0 == (var6 ^ -1))) {
                    if (((vb) this).field_M) {
                        if (((vb) this).field_R > var6) {
                            if (var6 > ((vb) this).field_L) {
                                var6 = ((vb) this).field_R;
                            }
                        }
                    }
                    ((vb) this).field_T = var6;
                }
            }
            ((vb) this).field_O = ue.a(false);
        }
    }

    private final void m(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 32) {
                break L0;
              } else {
                field_S = 68;
                break L0;
              }
            }
            try {
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.h(param0 ^ -8);
              this.a(false, var2_ref);
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

    final void a(String param0, int param1, boolean param2) {
        if (param0 == null) {
            param0 = "";
        }
        ((vb) this).field_A = param0;
        int var4 = param0.length();
        if (((vb) this).field_Q != -1) {
            if (!(((vb) this).field_Q >= var4)) {
                ((vb) this).field_A = ((vb) this).field_A.substring(0, ((vb) this).field_Q);
            }
        }
        ((vb) this).field_L = ((vb) this).field_A.length();
        ((vb) this).field_T = ((vb) this).field_A.length();
        if (!(param2)) {
            ((vb) this).n(19);
        }
        if (param1 != -12592) {
            Object var5 = null;
            ((vb) this).a((String) null, 58, false);
        }
    }

    private final void l(int param0) {
        String var2 = this.a((byte) -108);
        if (!(var2.length() <= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.a((byte) -124)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, int param1) {
        ((vb) this).field_T = param0;
        if (!pe.field_l[param1]) {
            ((vb) this).field_L = ((vb) this).field_T;
        }
    }

    private final void j(int param0) {
        if (param0 != -66) {
            ((vb) this).field_M = false;
        }
        if (((vb) this).field_i instanceof hf) {
            ((hf) (Object) ((vb) this).field_i).a((vb) this, -40);
        }
    }

    void n(int param0) {
        if (((vb) this).field_i instanceof hf) {
            ((hf) (Object) ((vb) this).field_i).a((vb) this, (byte) -100);
        }
        if (param0 <= 7) {
            vb.i(41);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (-1 == (((vb) this).field_T ^ -1)) {
            return ((vb) this).field_T;
        }
        for (var2 = -1 + ((vb) this).field_T; var2 > 0; var2--) {
            // if_icmpeq L51
        }
        if (param0) {
            ((vb) this).field_L = -72;
        }
        return var2;
    }

    private final String a(byte param0) {
        int var2 = ((vb) this).field_L >= ((vb) this).field_T ? ((vb) this).field_T : ((vb) this).field_L;
        if (param0 > -97) {
            return null;
        }
        int var3 = ((vb) this).field_L < ((vb) this).field_T ? ((vb) this).field_T : ((vb) this).field_L;
        return ((vb) this).field_A.substring(var2, var3);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        qe var5 = null;
        long var6 = 0L;
        if (param3 != -11) {
            return;
        }
        if (null != ((vb) this).field_l) {
            if (-1 == (param2 ^ -1)) {
                ((vb) this).field_l.a(((vb) this).field_J, -20618, param1, (oc) this, param0);
                if (!(!(((vb) this).field_l instanceof qe))) {
                    var5 = (qe) (Object) ((vb) this).field_l;
                    if (((vb) this).field_T != ((vb) this).field_L) {
                        var5.a(-15964, param0, param1, ((vb) this).field_L, ((vb) this).field_T, (oc) this);
                    }
                    var6 = ue.a(false);
                    if ((var6 - ((vb) this).field_O) % 1000L < 500L) {
                        var5.a((oc) this, param1, ((vb) this).field_T, param0, (byte) 123);
                    }
                }
            }
        }
    }

    final static void k(int param0) {
        if (!(ol.field_s)) {
            throw new IllegalStateException();
        }
        ci.field_t = true;
        lf.a((byte) -71, true);
        i.field_j = param0;
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackOut_54_0;
        Object stackOut_56_0;
        int stackOut_56_1;
        Object stackOut_55_0;
        int stackOut_55_1;
        Object stackOut_30_0;
        Object stackOut_32_0;
        int stackOut_32_1;
        Object stackOut_31_0;
        int stackOut_31_1;
        L0: {
          ((vb) this).field_O = ue.a(false);
          if (param1 == 110) {
            break L0;
          } else {
            field_S = 20;
            break L0;
          }
        }
        L1: {
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
                      if (((vb) this).field_T != ((vb) this).field_L) {
                        this.h(-84);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if (-1 == ((vb) this).field_Q) {
                          break L5;
                        } else {
                          if (((vb) this).field_A.length() >= ((vb) this).field_Q) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((vb) this).field_T >= ((vb) this).field_A.length()) {
                          ((vb) this).field_A = ((vb) this).field_A + param3;
                          ((vb) this).field_T = ((vb) this).field_A.length();
                          ((vb) this).field_L = ((vb) this).field_A.length();
                          break L6;
                        } else {
                          ((vb) this).field_A = ((vb) this).field_A.substring(0, ((vb) this).field_T) + param3 + ((vb) this).field_A.substring(((vb) this).field_T, ((vb) this).field_A.length());
                          ((vb) this).field_T = ((vb) this).field_T + 1;
                          ((vb) this).field_L = ((vb) this).field_T;
                          break L6;
                        }
                      }
                      ((vb) this).n(66);
                      break L4;
                    }
                    return true;
                  }
                }
              }
              L7: {
                if (-86 != (param0 ^ -1)) {
                  if (-102 == (param0 ^ -1)) {
                    if (((vb) this).field_T == ((vb) this).field_L) {
                      if (((vb) this).field_T < ((vb) this).field_A.length()) {
                        ((vb) this).field_L = ((vb) this).field_T - -1;
                        this.h(param1 + -182);
                        return true;
                      } else {
                        break L7;
                      }
                    } else {
                      this.h(-114);
                      return true;
                    }
                  } else {
                    if (param0 != 13) {
                      if (96 != param0) {
                        if (param0 == 97) {
                          if (((vb) this).field_T < ((vb) this).field_A.length()) {
                            L8: {
                              stackOut_54_0 = this;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_55_0 = stackOut_54_0;
                              if (!pe.field_l[82]) {
                                stackOut_56_0 = this;
                                stackOut_56_1 = ((vb) this).field_T - -1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                break L8;
                              } else {
                                stackOut_55_0 = this;
                                stackOut_55_1 = this.h((byte) 106);
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_57_1, 81);
                            return true;
                          } else {
                            break L7;
                          }
                        } else {
                          if (-103 == param0) {
                            this.a(0, 81);
                            return true;
                          } else {
                            if (-104 != param0) {
                              if (-85 != param0) {
                                L9: {
                                  if (!pe.field_l[82]) {
                                    break L9;
                                  } else {
                                    if (-66 == param0) {
                                      this.g((byte) -49);
                                      return true;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (!pe.field_l[82]) {
                                    break L10;
                                  } else {
                                    if (66 == param0) {
                                      this.l(0);
                                      return true;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (!pe.field_l[82]) {
                                  break L7;
                                } else {
                                  if (67 != param0) {
                                    break L7;
                                  } else {
                                    this.m(32);
                                    return true;
                                  }
                                }
                              } else {
                                this.j(-66);
                                return true;
                              }
                            } else {
                              this.a(((vb) this).field_A.length(), 81);
                              return true;
                            }
                          }
                        }
                      } else {
                        if ((((vb) this).field_T ^ -1) < -1) {
                          L11: {
                            stackOut_30_0 = this;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_31_0 = stackOut_30_0;
                            if (!pe.field_l[82]) {
                              stackOut_32_0 = this;
                              stackOut_32_1 = ((vb) this).field_T - 1;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              break L11;
                            } else {
                              stackOut_31_0 = this;
                              stackOut_31_1 = this.d(false);
                              stackIn_33_0 = stackOut_31_0;
                              stackIn_33_1 = stackOut_31_1;
                              break L11;
                            }
                          }
                          this.a(stackIn_33_1, param1 + -29);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      ((vb) this).c(false);
                      return true;
                    }
                  }
                } else {
                  if (((vb) this).field_L == ((vb) this).field_T) {
                    if (((vb) this).field_T <= 0) {
                      break L7;
                    } else {
                      ((vb) this).field_L = -1 + ((vb) this).field_T;
                      this.h(param1 ^ -41);
                      return true;
                    }
                  } else {
                    this.h(param1 ^ -55);
                    return true;
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    private final void g(byte param0) {
        this.l(param0 ^ -49);
        this.h(-118);
        if (param0 != -49) {
            ((vb) this).field_O = -103L;
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
            return false;
        }
        if (!(!(((vb) this).field_l instanceof qe))) {
            var8_int = ((qe) (Object) ((vb) this).field_l).a((oc) this, pq.field_k, true, param3, po.field_a, param2);
            this.a((var8_int ^ -1) != 0 ? var8_int : 0, 81);
            var8 = ue.a(false);
            ((vb) this).field_M = (-((vb) this).field_P + var8 ^ -1L) > -251L ? true : false;
            if (((vb) this).field_M) {
                ((vb) this).field_L = this.d(false);
                ((vb) this).field_T = this.h((byte) 103);
                if (-1 > (((vb) this).field_T ^ -1)) {
                    if (!(((vb) this).field_A.charAt(-1 + ((vb) this).field_T) != 32)) {
                        ((vb) this).field_T = ((vb) this).field_T - 1;
                    }
                }
                ((vb) this).field_R = ((vb) this).field_T;
            }
            ((vb) this).field_P = var8;
            return true;
        }
        return false;
    }

    static {
    }
}
