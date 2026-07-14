/*
 * Decompiled by CFR-JS 0.4.0.
 */
class og extends pl {
    private boolean field_F;
    private int field_L;
    private int field_H;
    private boolean field_Q;
    private long field_I;
    static qj field_N;
    static String field_P;
    static qj field_S;
    static String[] field_R;
    static int field_O;
    private int field_M;
    static String field_G;
    private int field_J;
    private long field_K;

    final void a(int param0, int param1, int param2, int param3) {
        qe var8 = null;
        long var6 = 0L;
        if (null != ((og) this).field_w) {
            if (param2 == 0) {
                ((og) this).field_w.a(param0, param3, (ub) this, true, ((og) this).field_B);
                if (((og) this).field_w instanceof qe) {
                    var8 = (qe) (Object) ((og) this).field_w;
                    if (!(((og) this).field_J == ((og) this).field_L)) {
                        var8.a(((og) this).field_L, true, ((og) this).field_J, param3, param0, (ub) this);
                    }
                    var6 = d.a((byte) 54);
                    if (-501L < ((-((og) this).field_I + var6) % 1000L ^ -1L)) {
                        var8.a(param3, param0, (ub) this, 0, ((og) this).field_L);
                    }
                }
            }
        }
        if (param1 != 0) {
            ((og) this).field_Q = true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 > -69) {
            return;
        }
        field_O = param0;
        ee.field_r = param1;
    }

    private final int g(byte param0) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        int var2 = ((og) this).field_k.length();
        if (((og) this).field_L == var2) {
            return ((og) this).field_L;
        }
        if (param0 < 19) {
            return 50;
        }
        for (var3 = 1 + ((og) this).field_L; var3 < var2; var3++) {
            // if_icmpeq L68
        }
        return var3;
    }

    og(String param0, ce param1, int param2) {
        super(param0, param1);
        ((og) this).field_Q = false;
        ((og) this).field_M = -1;
        ((og) this).field_K = 0L;
        ((og) this).field_w = kc.field_H.field_b;
        ((og) this).field_H = param2;
        ((og) this).a(-1, true, param0);
        ((og) this).field_F = true;
        ((og) this).field_I = d.a((byte) 94);
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        L0: {
          ((og) this).field_I = d.a((byte) 99);
          if (param0 == 60) {
            break L0;
          } else {
            if (param0 == 62) {
              break L0;
            } else {
              if (param2 < -96) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 > 126) {
                      break L1;
                    } else {
                      L2: {
                        if (((og) this).field_J == ((og) this).field_L) {
                          break L2;
                        } else {
                          this.g(-110);
                          break L2;
                        }
                      }
                      L3: {
                        if ((((og) this).field_H ^ -1) == 0) {
                          break L3;
                        } else {
                          if (((og) this).field_k.length() < ((og) this).field_H) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      L4: {
                        if (((og) this).field_L >= ((og) this).field_k.length()) {
                          ((og) this).field_k = ((og) this).field_k + param0;
                          ((og) this).field_L = ((og) this).field_k.length();
                          ((og) this).field_J = ((og) this).field_k.length();
                          break L4;
                        } else {
                          ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_L) + param0 + ((og) this).field_k.substring(((og) this).field_L, ((og) this).field_k.length());
                          ((og) this).field_L = ((og) this).field_L + 1;
                          ((og) this).field_J = ((og) this).field_L;
                          break L4;
                        }
                      }
                      ((og) this).i((byte) -84);
                      return true;
                    }
                  }
                }
                L5: {
                  if (param1 != 85) {
                    if (-102 != (param1 ^ -1)) {
                      if (param1 == 13) {
                        ((og) this).e(true);
                        return true;
                      } else {
                        if (96 == param1) {
                          if (0 >= ((og) this).field_L) {
                            break L5;
                          } else {
                            L6: {
                              stackOut_54_0 = this;
                              stackOut_54_1 = 27;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_55_0 = stackOut_54_0;
                              stackIn_55_1 = stackOut_54_1;
                              if (hi.field_p[82]) {
                                stackOut_56_0 = this;
                                stackOut_56_1 = stackIn_56_1;
                                stackOut_56_2 = this.d(31823);
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                stackIn_57_2 = stackOut_56_2;
                                break L6;
                              } else {
                                stackOut_55_0 = this;
                                stackOut_55_1 = stackIn_55_1;
                                stackOut_55_2 = -1 + ((og) this).field_L;
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                stackIn_57_2 = stackOut_55_2;
                                break L6;
                              }
                            }
                            this.a((byte) stackIn_57_1, stackIn_57_2);
                            return true;
                          }
                        } else {
                          if (-98 != (param1 ^ -1)) {
                            if ((param1 ^ -1) == -103) {
                              this.a((byte) 10, 0);
                              return true;
                            } else {
                              if (param1 != -104) {
                                if (-85 != param1) {
                                  L7: {
                                    if (!hi.field_p[82]) {
                                      break L7;
                                    } else {
                                      if ((param1 ^ -1) == -66) {
                                        this.j((byte) 75);
                                        return true;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (!hi.field_p[82]) {
                                      break L8;
                                    } else {
                                      if (param1 != 66) {
                                        break L8;
                                      } else {
                                        this.f(false);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!hi.field_p[82]) {
                                    break L5;
                                  } else {
                                    if (param1 == 67) {
                                      this.h((byte) 126);
                                      return true;
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  this.h(0);
                                  return true;
                                }
                              } else {
                                this.a((byte) 92, ((og) this).field_k.length());
                                return true;
                              }
                            }
                          } else {
                            if (((og) this).field_L >= ((og) this).field_k.length()) {
                              break L5;
                            } else {
                              L9: {
                                stackOut_32_0 = this;
                                stackOut_32_1 = -127;
                                stackIn_34_0 = stackOut_32_0;
                                stackIn_34_1 = stackOut_32_1;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                if (!hi.field_p[82]) {
                                  stackOut_34_0 = this;
                                  stackOut_34_1 = stackIn_34_1;
                                  stackOut_34_2 = 1 + ((og) this).field_L;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  stackIn_35_2 = stackOut_34_2;
                                  break L9;
                                } else {
                                  stackOut_33_0 = this;
                                  stackOut_33_1 = stackIn_33_1;
                                  stackOut_33_2 = this.g((byte) 24);
                                  stackIn_35_0 = stackOut_33_0;
                                  stackIn_35_1 = stackOut_33_1;
                                  stackIn_35_2 = stackOut_33_2;
                                  break L9;
                                }
                              }
                              this.a((byte) stackIn_35_1, stackIn_35_2);
                              return true;
                            }
                          }
                        }
                      }
                    } else {
                      if (((og) this).field_L != ((og) this).field_J) {
                        this.g(76);
                        return true;
                      } else {
                        if (((og) this).field_L < ((og) this).field_k.length()) {
                          ((og) this).field_J = 1 + ((og) this).field_L;
                          this.g(-73);
                          return true;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    if (((og) this).field_J != ((og) this).field_L) {
                      this.g(-92);
                      return true;
                    } else {
                      if ((((og) this).field_L ^ -1) >= -1) {
                        break L5;
                      } else {
                        ((og) this).field_J = -1 + ((og) this).field_L;
                        this.g(31);
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
        }
        return false;
    }

    private final void b(String param0, int param1) {
        int var3 = 0;
        if (!(((og) this).field_H == -1)) {
            var3 = ((og) this).field_H + -((og) this).field_k.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((og) this).field_L == ((og) this).field_k.length()) {
            ((og) this).field_k = ((og) this).field_k + param0;
        } else {
            ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_L) + param0 + ((og) this).field_k.substring(((og) this).field_L, ((og) this).field_k.length());
        }
        ((og) this).field_L = ((og) this).field_L + param0.length();
        if (param1 <= 76) {
            this.a((byte) -42, -84);
        }
        ((og) this).field_J = ((og) this).field_L;
        ((og) this).i((byte) -122);
    }

    void i(byte param0) {
        if (((og) this).field_s instanceof fj) {
            ((fj) (Object) ((og) this).field_s).a((og) this, 5);
        }
        if (param0 >= -59) {
            ((og) this).field_Q = true;
        }
    }

    final static void a(ai param0, int param1, int param2) {
        int var7 = wizardrun.field_H;
        mg var8 = n.field_b;
        mg var9 = var8;
        var9.c((byte) -105, param1);
        var9.field_m = var9.field_m + 1;
        int var4 = var9.field_m;
        var9.b((byte) 11, 1);
        var9.b(-1947079288, param0.field_i);
        var9.b(-1947079288, param0.field_t);
        var9.b(-1947079288, param0.field_o);
        var9.f(param0.field_k, 613003928);
        var9.f(param0.field_l, 613003928);
        var9.f(param0.field_m, 613003928);
        var9.f(param0.field_p, 613003928);
        var9.b((byte) 11, param0.field_q.length);
        int var5 = 0;
        int var6 = -49 / ((param2 - 44) / 56);
        while (param0.field_q.length > var5) {
            var8.f(param0.field_q[var5], 613003928);
            var5++;
        }
        int discarded$0 = var9.e(var4, -1182887024);
        var9.a(-var4 + var9.field_m, -87);
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8 = 0;
        long var8_long = 0L;
        if (!(!super.a(param0, (byte) -83, param2, param3, param4, param5, param6))) {
            if (((og) this).field_w instanceof qe) {
                var8 = ((qe) (Object) ((og) this).field_w).a(9397, pg.field_n, param0, (ub) this, param3, fi.field_B);
                this.a((byte) -118, -1 != var8 ? var8 : 0);
                var8_long = d.a((byte) 42);
                ((og) this).field_Q = -251L < (var8_long + -((og) this).field_K ^ -1L) ? true : false;
                if (((og) this).field_Q) {
                    ((og) this).field_J = this.d(31823);
                    ((og) this).field_L = this.g((byte) 113);
                    if (-1 > (((og) this).field_L ^ -1)) {
                        if (((og) this).field_k.charAt(-1 + ((og) this).field_L) == 32) {
                            ((og) this).field_L = ((og) this).field_L - 1;
                        }
                    }
                    ((og) this).field_M = ((og) this).field_L;
                }
                ((og) this).field_K = var8_long;
                return true;
            }
        }
        var8 = -66 % ((param1 - 12) / 36);
        return false;
    }

    final void e(boolean param0) {
        ((og) this).field_J = 0;
        ((og) this).field_L = 0;
        ((og) this).field_k = "";
        if (!param0) {
            return;
        }
        ((og) this).i((byte) -81);
    }

    void a(int param0, int param1, int param2, ub param3) {
        qe var7 = null;
        int var6 = 0;
        super.a(param0 + 0, param1, param2, param3);
        this.e(param0 ^ param0);
        if ((((og) this).field_q ^ -1) == -2) {
            if (!(!(((og) this).field_w instanceof qe))) {
                var7 = (qe) (Object) ((og) this).field_w;
                var6 = var7.a(9397, pg.field_n, param2, (ub) this, param1, fi.field_B);
                if (!((var6 ^ -1) == 0)) {
                    if (((og) this).field_Q) {
                        if (var6 < ((og) this).field_M) {
                            if (!(var6 <= ((og) this).field_J)) {
                                var6 = ((og) this).field_M;
                            }
                        }
                    }
                    ((og) this).field_L = var6;
                }
            }
            ((og) this).field_I = d.a((byte) 44);
        }
    }

    public static void k(byte param0) {
        field_S = null;
        field_G = null;
        if (param0 != 37) {
            Object var2 = null;
            og.a((ai) null, 98, 109);
        }
        field_N = null;
        field_R = null;
        field_P = null;
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        if (!(-1 != (((og) this).field_L ^ -1))) {
            return ((og) this).field_L;
        }
        if (param0 != 31823) {
            field_O = -60;
        }
        for (var2 = ((og) this).field_L - 1; 0 < var2; var2--) {
            // if_icmpeq L70
        }
        return var2;
    }

    private final void h(int param0) {
        if (param0 != 0) {
            ((og) this).a(59, -78, 27, 72);
        }
        if (((og) this).field_s instanceof fj) {
            ((fj) (Object) ((og) this).field_s).a(param0 ^ -117, (og) this);
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 10 % ((-48 - param0) / 44);
        ((og) this).field_L = param1;
        if (!(hi.field_p[81])) {
            ((og) this).field_J = ((og) this).field_L;
        }
    }

    private final String f(int param0) {
        if (param0 != -12938) {
            ((og) this).field_J = 68;
        }
        int var2 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
        int var3 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_L : ((og) this).field_J;
        return ((og) this).field_k.substring(var2, var3);
    }

    private final void e(int param0) {
        af var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        var8 = wizardrun.field_H;
        if (((og) this).field_F) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              ((og) this).field_K = 13L;
              break L0;
            }
          }
          if (!(((og) this).field_w instanceof qe)) {
            return;
          } else {
            var9 = (qe) (Object) ((og) this).field_w;
            var3 = var9.a((ub) this, (byte) 78);
            var4 = var3.a(-127);
            var5 = var9.a((ub) this, param0 + -106);
            var6 = var9.a((byte) 62) >> -815417439;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = ((og) this).field_i - -var3.a(62, ((og) this).field_L);
                if (var5 + -var6 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    ((og) this).field_i = ((og) this).field_i + var6 - var7;
                    break L1;
                  }
                } else {
                  ((og) this).field_i = var5 + (-var6 - var7) + ((og) this).field_i;
                  break L1;
                }
              }
              L2: {
                if (-1 > (((og) this).field_i ^ -1)) {
                  ((og) this).field_i = 0;
                  break L2;
                } else {
                  if (((og) this).field_i < var6 + -var5) {
                    ((og) this).field_i = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              ((og) this).field_i = 0;
              ((og) this).field_j = 0;
              return;
            }
          }
        } else {
          ((og) this).field_j = 0;
          ((og) this).field_i = 0;
          return;
        }
    }

    private final void f(boolean param0) {
        String var2 = this.f(-12938);
        if (param0) {
            return;
        }
        if (!(-1 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f(-12938)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        if (!(param2 != null)) {
            param2 = "";
        }
        ((og) this).field_k = param2;
        int var4 = param2.length();
        if (((og) this).field_H != param0) {
            if (!(((og) this).field_H >= var4)) {
                ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_H);
            }
        }
        ((og) this).field_J = ((og) this).field_k.length();
        ((og) this).field_L = ((og) this).field_k.length();
        if (!param1) {
            ((og) this).i((byte) -94);
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((og) this).field_J != ((og) this).field_L) {
            var2 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
            var3 = ((og) this).field_L <= ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
            ((og) this).field_L = var2;
            ((og) this).field_J = var2;
            ((og) this).field_k = ((og) this).field_k.substring(0, var2) + ((og) this).field_k.substring(var3, ((og) this).field_k.length());
            ((og) this).i((byte) -115);
        }
        var2 = 47 / ((param0 - -20) / 43);
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                if (param0 >= 1) {
                  break L0;
                } else {
                  ((og) this).field_J = -125;
                  break L0;
                }
              }
              this.g(-125);
              this.b(var2, 84);
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

    private final void j(byte param0) {
        if (param0 != 75) {
            ((og) this).a(-59, 57, 98, 61);
        }
        this.f(false);
        this.g(param0 + -145);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = -1;
        field_G = "Main Menu";
        field_P = "Move left and right";
    }
}
