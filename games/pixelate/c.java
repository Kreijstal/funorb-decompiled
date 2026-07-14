/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends qm {
    private boolean field_P;
    private int field_N;
    private long field_U;
    private int field_ab;
    private boolean field_Q;
    private int field_V;
    static bd field_Z;
    private long field_W;
    private int field_S;
    static boolean field_T;
    static volatile int field_X;
    static String field_O;
    static ha field_R;
    static tc field_Y;

    private final void d(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.l(121);
                if (param0) {
                  break L0;
                } else {
                  field_X = 86;
                  break L0;
                }
              }
              this.a(var2, 32240);
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

    private final int k(int param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -5782) {
            field_O = null;
        }
        int var2 = ((c) this).field_q.length();
        if (var2 == ((c) this).field_ab) {
            return ((c) this).field_ab;
        }
        for (var3 = ((c) this).field_ab + 1; var3 < var2; var3++) {
            // if_icmpeq L76
        }
        return var3;
    }

    c(String param0, fn param1, int param2) {
        super(param0, param1);
        ((c) this).field_U = 0L;
        ((c) this).field_V = -1;
        ((c) this).field_P = false;
        ((c) this).field_y = h.field_X.field_i;
        ((c) this).field_N = param2;
        ((c) this).a(true, (byte) 87, param0);
        ((c) this).field_Q = true;
        ((c) this).field_W = hm.a(64);
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        if (!((((c) this).field_N ^ -1) == 0)) {
            var3 = ((c) this).field_N + -((c) this).field_q.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((c) this).field_ab != ((c) this).field_q.length()) {
            ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_ab) + param0 + ((c) this).field_q.substring(((c) this).field_ab, ((c) this).field_q.length());
        } else {
            ((c) this).field_q = ((c) this).field_q + param0;
        }
        ((c) this).field_ab = ((c) this).field_ab + param0.length();
        if (param1 != 32240) {
            field_R = null;
        }
        ((c) this).field_S = ((c) this).field_ab;
        ((c) this).n(param1 + 1392121585);
    }

    private final void r(int param0) {
        this.e(false);
        if (param0 != -1) {
            return;
        }
        this.l(126);
    }

    public static void o(int param0) {
        field_Z = null;
        field_Y = null;
        field_O = null;
        if (param0 != 12669) {
            return;
        }
        field_R = null;
    }

    final static void m(int param0) {
        int var1 = (ni.field_q + -640) / 2;
        if (param0 < 18) {
            field_Y = null;
        }
        int var2 = qh.field_c * qh.field_c;
        int var3 = var2 + -(oo.field_b * oo.field_b);
        ql.field_n.a(90, -210 + t.field_d - 4, -(var3 * 199 / var2) + var1, 256, 199);
        ti.field_E.a(0, -120 + t.field_d + -4, 438 * var3 / var2 + var1 + 202, 256, 438);
    }

    private final String a(byte param0) {
        if (param0 != 11) {
            ((c) this).field_V = -69;
        }
        int var2 = ((c) this).field_S >= ((c) this).field_ab ? ((c) this).field_ab : ((c) this).field_S;
        int var3 = ((c) this).field_ab <= ((c) this).field_S ? ((c) this).field_S : ((c) this).field_ab;
        return ((c) this).field_q.substring(var2, var3);
    }

    private final void a(int param0, int param1) {
        ((c) this).field_ab = param0;
        if (!bc.field_m[param1]) {
            ((c) this).field_S = ((c) this).field_ab;
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          if (param1 == 3) {
            break L0;
          } else {
            ((c) this).field_P = true;
            break L0;
          }
        }
        ((c) this).field_W = hm.a(64);
        if (60 == param3) {
          return false;
        } else {
          if (param3 != 62) {
            L1: {
              if (param3 < 32) {
                break L1;
              } else {
                if (param3 <= 126) {
                  L2: {
                    if (((c) this).field_S == ((c) this).field_ab) {
                      break L2;
                    } else {
                      this.l(-114);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if ((((c) this).field_N ^ -1) == 0) {
                        break L4;
                      } else {
                        if (((c) this).field_q.length() < ((c) this).field_N) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (((c) this).field_ab < ((c) this).field_q.length()) {
                        ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_ab) + param3 + ((c) this).field_q.substring(((c) this).field_ab, ((c) this).field_q.length());
                        ((c) this).field_ab = ((c) this).field_ab + 1;
                        ((c) this).field_S = ((c) this).field_ab;
                        break L5;
                      } else {
                        ((c) this).field_q = ((c) this).field_q + param3;
                        ((c) this).field_ab = ((c) this).field_q.length();
                        ((c) this).field_S = ((c) this).field_q.length();
                        break L5;
                      }
                    }
                    ((c) this).n(1392153825);
                    break L3;
                  }
                  return true;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (-86 == param0) {
                if (((c) this).field_ab != ((c) this).field_S) {
                  this.l(-14);
                  return true;
                } else {
                  if (-1 > (((c) this).field_ab ^ -1)) {
                    ((c) this).field_S = ((c) this).field_ab - 1;
                    this.l(-78);
                    return true;
                  } else {
                    break L6;
                  }
                }
              } else {
                if (-102 != param0) {
                  if ((param0 ^ -1) != -14) {
                    if (param0 != 96) {
                      if (97 == param0) {
                        if (((c) this).field_ab >= ((c) this).field_q.length()) {
                          break L6;
                        } else {
                          L7: {
                            stackOut_43_0 = this;
                            stackIn_45_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (!bc.field_m[82]) {
                              stackOut_45_0 = this;
                              stackOut_45_1 = 1 + ((c) this).field_ab;
                              stackIn_46_0 = stackOut_45_0;
                              stackIn_46_1 = stackOut_45_1;
                              break L7;
                            } else {
                              stackOut_44_0 = this;
                              stackOut_44_1 = this.k(-5782);
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              break L7;
                            }
                          }
                          this.a(stackIn_46_1, 81);
                          return true;
                        }
                      } else {
                        if (param0 != 102) {
                          if ((param0 ^ -1) != -104) {
                            if ((param0 ^ -1) == -85) {
                              this.d((byte) -126);
                              return true;
                            } else {
                              L8: {
                                if (!bc.field_m[82]) {
                                  break L8;
                                } else {
                                  if (param0 == 65) {
                                    this.r(-1);
                                    return true;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (!bc.field_m[82]) {
                                  break L9;
                                } else {
                                  if ((param0 ^ -1) != -67) {
                                    break L9;
                                  } else {
                                    this.e(false);
                                    return true;
                                  }
                                }
                              }
                              if (!bc.field_m[82]) {
                                break L6;
                              } else {
                                if (67 != param0) {
                                  break L6;
                                } else {
                                  this.d(true);
                                  return true;
                                }
                              }
                            }
                          } else {
                            this.a(((c) this).field_q.length(), param1 + 78);
                            return true;
                          }
                        } else {
                          this.a(0, param1 + 78);
                          return true;
                        }
                      }
                    } else {
                      if (0 < ((c) this).field_ab) {
                        L10: {
                          stackOut_21_0 = this;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (!bc.field_m[82]) {
                            stackOut_23_0 = this;
                            stackOut_23_1 = ((c) this).field_ab + -1;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            break L10;
                          } else {
                            stackOut_22_0 = this;
                            stackOut_22_1 = this.c(false);
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            break L10;
                          }
                        }
                        this.a(stackIn_24_1, 81);
                        return true;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    ((c) this).p(127);
                    return true;
                  }
                } else {
                  if (((c) this).field_ab == ((c) this).field_S) {
                    if (((c) this).field_ab < ((c) this).field_q.length()) {
                      ((c) this).field_S = 1 + ((c) this).field_ab;
                      this.l(18);
                      return true;
                    } else {
                      break L6;
                    }
                  } else {
                    this.l(param1 + -12);
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

    void n(int param0) {
        if (!(!(((c) this).field_n instanceof hi))) {
            ((hi) (Object) ((c) this).field_n).a(-107, (c) this);
        }
        if (param0 != 1392153825) {
            ((c) this).n(103);
        }
    }

    final void p(int param0) {
        ((c) this).field_ab = 0;
        ((c) this).field_S = 0;
        int var2 = 19 % ((52 - param0) / 55);
        ((c) this).field_q = "";
        ((c) this).n(1392153825);
    }

    private final void q(int param0) {
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        af var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        if (((c) this).field_Q) {
          if (!(((c) this).field_y instanceof af)) {
            return;
          } else {
            var9 = (af) (Object) ((c) this).field_y;
            var3 = var9.b(-88, (ng) this);
            var4 = var3.a(0);
            var5 = var9.a(true, (ng) this);
            var6 = var9.a(-3) >> -826926079;
            if (-var6 + var5 <= var4) {
              L0: {
                var7 = ((c) this).field_B + var3.b(true, ((c) this).field_ab);
                if (var5 + -var6 < var7) {
                  ((c) this).field_B = -var6 - -var5 + (-var7 + ((c) this).field_B);
                  break L0;
                } else {
                  if (var6 <= var7) {
                    break L0;
                  } else {
                    ((c) this).field_B = -var7 - -var6 + ((c) this).field_B;
                    break L0;
                  }
                }
              }
              if (param0 < -60) {
                L1: {
                  if (((c) this).field_B <= 0) {
                    if (var6 + -var5 <= ((c) this).field_B) {
                      break L1;
                    } else {
                      ((c) this).field_B = -var5 - -var6;
                      break L1;
                    }
                  } else {
                    ((c) this).field_B = 0;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              ((c) this).field_B = 0;
              ((c) this).field_x = 0;
              return;
            }
          }
        } else {
          ((c) this).field_B = 0;
          ((c) this).field_x = 0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        af var6 = null;
        long var7 = 0L;
        int var5 = 118 % ((param3 - 70) / 49);
        if (null != ((c) this).field_y) {
            if (param1 == 0) {
                ((c) this).field_y.a((ng) this, (byte) -124, param0, param2, ((c) this).field_H);
                if (!(!(((c) this).field_y instanceof af))) {
                    var6 = (af) (Object) ((c) this).field_y;
                    if (!(((c) this).field_S == ((c) this).field_ab)) {
                        var6.a(((c) this).field_S, (ng) this, -1, ((c) this).field_ab, param0, param2);
                    }
                    var7 = hm.a(64);
                    if (!((var7 - ((c) this).field_W) % 1000L >= 500L)) {
                        var6.a(param2, param0, (byte) -91, (ng) this, ((c) this).field_ab);
                    }
                }
            }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((c) this).field_S != ((c) this).field_ab) {
            var2 = ((c) this).field_ab > ((c) this).field_S ? ((c) this).field_S : ((c) this).field_ab;
            var3 = ((c) this).field_ab > ((c) this).field_S ? ((c) this).field_ab : ((c) this).field_S;
            ((c) this).field_ab = var2;
            ((c) this).field_S = var2;
            ((c) this).field_q = ((c) this).field_q.substring(0, var2) + ((c) this).field_q.substring(var3, ((c) this).field_q.length());
            ((c) this).n(1392153825);
        }
        var2 = 96 / ((param0 - 64) / 46);
    }

    private final void d(byte param0) {
        if (!(!(((c) this).field_n instanceof hi))) {
            ((hi) (Object) ((c) this).field_n).a((c) this, 4);
        }
        int var2 = -72 / ((-78 - param0) / 32);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (!(((c) this).field_y instanceof af)) {
                return false;
            }
            var8_int = ((af) (Object) ((c) this).field_y).a(param3, param5, 0, uf.field_d, bg.field_k, (ng) this);
            this.a(0 != (var8_int ^ -1) ? var8_int : 0, 81);
            var8 = hm.a(64);
            ((c) this).field_P = -251L < (-((c) this).field_U + var8 ^ -1L) ? true : false;
            if (((c) this).field_P) {
                ((c) this).field_S = this.c(false);
                ((c) this).field_ab = this.k(-5782);
                if (((c) this).field_ab > 0) {
                    if (!(32 != ((c) this).field_q.charAt(-1 + ((c) this).field_ab))) {
                        ((c) this).field_ab = ((c) this).field_ab - 1;
                    }
                }
                ((c) this).field_V = ((c) this).field_ab;
            }
            ((c) this).field_U = var8;
            return true;
        }
        return false;
    }

    private final void e(boolean param0) {
        if (param0) {
            return;
        }
        String var2 = this.a((byte) 11);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.a((byte) 11)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        if (param2 == null) {
            param2 = "";
        }
        ((c) this).field_q = param2;
        int var4 = param2.length();
        if ((((c) this).field_N ^ -1) != 0) {
            if (!(((c) this).field_N >= var4)) {
                ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_N);
            }
        }
        ((c) this).field_S = ((c) this).field_q.length();
        ((c) this).field_ab = ((c) this).field_q.length();
        if (param1 != 87) {
            c.o(97);
        }
        if (!param0) {
            ((c) this).n(1392153825);
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        af var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.q(-117);
        if (!(-2 != (((c) this).field_k ^ -1))) {
            if (((c) this).field_y instanceof af) {
                var5 = (af) (Object) ((c) this).field_y;
                var6 = var5.a(param1, param2, param0 ^ 40, uf.field_d, bg.field_k, (ng) this);
                if ((var6 ^ -1) != 0) {
                    if (((c) this).field_P) {
                        if (var6 < ((c) this).field_V) {
                            if (!(var6 <= ((c) this).field_S)) {
                                var6 = ((c) this).field_V;
                            }
                        }
                    }
                    ((c) this).field_ab = var6;
                }
            }
            ((c) this).field_W = hm.a(64);
        }
    }

    private final int c(boolean param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (((c) this).field_ab == -1) {
            return ((c) this).field_ab;
        }
        for (var2 = -1 + ((c) this).field_ab; -1 < var2; var2--) {
            // if_icmpeq L50
        }
        if (param0) {
            ((c) this).field_N = -56;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = new bd();
        field_O = "Your request to join has been declined.";
        field_X = 0;
    }
}
