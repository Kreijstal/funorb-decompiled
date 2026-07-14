/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends ng {
    private int field_bb;
    private int field_R;
    private long field_T;
    private int field_U;
    private long field_X;
    private boolean field_Y;
    private boolean field_ab;
    private int field_S;
    static ka field_O;
    static vi field_W;
    static ge[] field_V;
    static ll field_P;
    static lj field_cb;
    static int field_Q;
    static boolean field_Z;

    private final void d(byte param0) {
        lg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gd var9 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (((dj) this).field_ab) {
          if (((dj) this).field_q instanceof gd) {
            var9 = (gd) (Object) ((dj) this).field_q;
            var3 = var9.a(-96, (ee) this);
            var4 = var3.b((byte) 57);
            var5 = var9.a((ee) this, (byte) -1);
            var6 = var9.a(param0 ^ -6) >> -213221343;
            if (var4 >= -var6 + var5) {
              if (param0 == 5) {
                L0: {
                  var7 = ((dj) this).field_u + var3.a(-109, ((dj) this).field_R);
                  if (var5 - var6 < var7) {
                    ((dj) this).field_u = ((dj) this).field_u + (-var7 + var5 + -var6);
                    break L0;
                  } else {
                    if (var7 >= var6) {
                      break L0;
                    } else {
                      ((dj) this).field_u = -var7 + (var6 + ((dj) this).field_u);
                      break L0;
                    }
                  }
                }
                L1: {
                  if ((((dj) this).field_u ^ -1) >= -1) {
                    if (-var5 - -var6 <= ((dj) this).field_u) {
                      break L1;
                    } else {
                      ((dj) this).field_u = var6 + -var5;
                      break L1;
                    }
                  } else {
                    ((dj) this).field_u = 0;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              ((dj) this).field_j = 0;
              ((dj) this).field_u = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((dj) this).field_u = 0;
          ((dj) this).field_j = 0;
          return;
        }
    }

    dj(String param0, gg param1, int param2) {
        super(param0, param1);
        ((dj) this).field_Y = false;
        ((dj) this).field_S = -1;
        ((dj) this).field_T = 0L;
        ((dj) this).field_q = kl.field_e.field_m;
        ((dj) this).field_bb = param2;
        ((dj) this).a(param0, true, (byte) -21);
        ((dj) this).field_ab = true;
        ((dj) this).field_X = ol.a(256);
    }

    private final int h(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 < 101) {
            return -48;
        }
        if (((dj) this).field_R == 0) {
            return ((dj) this).field_R;
        }
        for (var2 = -1 + ((dj) this).field_R; var2 > 0; var2--) {
            // if_icmpeq L59
        }
        return var2;
    }

    void a(ee param0, int param1, byte param2, int param3) {
        gd var7 = null;
        int var6 = 0;
        if (param2 > -97) {
            og discarded$0 = dj.c((byte) -78);
        }
        super.a(param0, param1, (byte) -99, param3);
        this.d((byte) 5);
        if (!(-2 != (((dj) this).field_z ^ -1))) {
            if (((dj) this).field_q instanceof gd) {
                var7 = (gd) (Object) ((dj) this).field_q;
                var6 = var7.a(ph.field_d, kc.field_u, (ee) this, (byte) -41, param3, param1);
                if (!((var6 ^ -1) == 0)) {
                    if (((dj) this).field_Y) {
                        if (var6 < ((dj) this).field_S) {
                            if (((dj) this).field_U < var6) {
                                var6 = ((dj) this).field_S;
                            }
                        }
                    }
                    ((dj) this).field_R = var6;
                }
            }
            ((dj) this).field_X = ol.a(256);
        }
    }

    public static void l(int param0) {
        if (param0 != 65) {
            return;
        }
        field_W = null;
        field_O = null;
        field_P = null;
        field_V = null;
        field_cb = null;
    }

    private final void e(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            if (param0 > 11) {
              try {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.d(true);
                this.a(var2_ref, 1);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              var2 = (Exception) (Object) decompiledCaughtException;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void i(int param0) {
        ((dj) this).field_v = "";
        if (param0 != -22617) {
            ((dj) this).field_S = 38;
        }
        ((dj) this).field_R = 0;
        ((dj) this).field_U = 0;
        ((dj) this).k(-105);
    }

    private final void a(int param0, int param1) {
        if (param1 != -1) {
            ((dj) this).field_ab = true;
        }
        ((dj) this).field_R = param0;
        if (!(nj.field_c[81])) {
            ((dj) this).field_U = ((dj) this).field_R;
        }
    }

    void k(int param0) {
        if (param0 >= -79) {
            return;
        }
        if (((dj) this).field_k instanceof cc) {
            ((cc) (Object) ((dj) this).field_k).b((dj) this, 3);
        }
    }

    private final String j(int param0) {
        if (param0 != -12349) {
            ((dj) this).k(-78);
        }
        int var2 = ((dj) this).field_R > ((dj) this).field_U ? ((dj) this).field_U : ((dj) this).field_R;
        int var3 = ((dj) this).field_U >= ((dj) this).field_R ? ((dj) this).field_U : ((dj) this).field_R;
        return ((dj) this).field_v.substring(var2, var3);
    }

    private final void a(String param0, int param1) {
        int var4 = 0;
        int var3 = -47 % ((-34 - param1) / 32);
        if (!(((dj) this).field_bb == -1)) {
            var4 = ((dj) this).field_bb - ((dj) this).field_v.length();
            if (!(-1 < (var4 ^ -1))) {
                return;
            }
            param0 = param0.substring(0, var4);
        }
        if (((dj) this).field_R != ((dj) this).field_v.length()) {
            ((dj) this).field_v = ((dj) this).field_v.substring(0, ((dj) this).field_R) + param0 + ((dj) this).field_v.substring(((dj) this).field_R, ((dj) this).field_v.length());
        } else {
            ((dj) this).field_v = ((dj) this).field_v + param0;
        }
        ((dj) this).field_R = ((dj) this).field_R + param0.length();
        ((dj) this).field_U = ((dj) this).field_R;
        ((dj) this).k(-115);
    }

    private final void g(byte param0) {
        if (param0 < 74) {
            return;
        }
        this.g(0);
        this.d(true);
    }

    final static void f(byte param0) {
        if (!(lj.field_q)) {
            throw new IllegalStateException();
        }
        fh.field_g = true;
        wb.a(true, (byte) -73);
        if (param0 > -51) {
            og discarded$0 = dj.c((byte) -1);
        }
        gj.field_c = 0;
    }

    final void a(String param0, boolean param1, byte param2) {
        if (!(param0 != null)) {
            param0 = "";
        }
        ((dj) this).field_v = param0;
        int var4 = param0.length();
        if (((dj) this).field_bb != -1) {
            if (var4 > ((dj) this).field_bb) {
                ((dj) this).field_v = ((dj) this).field_v.substring(0, ((dj) this).field_bb);
            }
        }
        if (param2 != -21) {
            return;
        }
        ((dj) this).field_U = ((dj) this).field_v.length();
        ((dj) this).field_R = ((dj) this).field_v.length();
        if (!(param1)) {
            ((dj) this).k(-93);
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
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
        L0: {
          ((dj) this).field_X = ol.a(256);
          if (param2 >= 9) {
            break L0;
          } else {
            int discarded$1 = this.h(110);
            break L0;
          }
        }
        if (param1 == 60) {
          return false;
        } else {
          if (param1 != 62) {
            L1: {
              if (32 > param1) {
                break L1;
              } else {
                if (param1 > 126) {
                  break L1;
                } else {
                  L2: {
                    if (((dj) this).field_R != ((dj) this).field_U) {
                      this.d(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if ((((dj) this).field_bb ^ -1) == 0) {
                        break L4;
                      } else {
                        if (((dj) this).field_v.length() >= ((dj) this).field_bb) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((dj) this).field_R >= ((dj) this).field_v.length()) {
                        ((dj) this).field_v = ((dj) this).field_v + param1;
                        ((dj) this).field_R = ((dj) this).field_v.length();
                        ((dj) this).field_U = ((dj) this).field_v.length();
                        break L5;
                      } else {
                        ((dj) this).field_v = ((dj) this).field_v.substring(0, ((dj) this).field_R) + param1 + ((dj) this).field_v.substring(((dj) this).field_R, ((dj) this).field_v.length());
                        ((dj) this).field_R = ((dj) this).field_R + 1;
                        ((dj) this).field_U = ((dj) this).field_R;
                        break L5;
                      }
                    }
                    ((dj) this).k(-105);
                    break L3;
                  }
                  return true;
                }
              }
            }
            L6: {
              if (param0 != 85) {
                if (101 != param0) {
                  if (-14 != param0) {
                    if (param0 != 96) {
                      if (97 != param0) {
                        if (param0 != 102) {
                          if ((param0 ^ -1) == -104) {
                            this.a(((dj) this).field_v.length(), -1);
                            return true;
                          } else {
                            if (param0 != 84) {
                              L7: {
                                if (!nj.field_c[82]) {
                                  break L7;
                                } else {
                                  if (65 != param0) {
                                    break L7;
                                  } else {
                                    this.g((byte) 79);
                                    return true;
                                  }
                                }
                              }
                              L8: {
                                if (!nj.field_c[82]) {
                                  break L8;
                                } else {
                                  if ((param0 ^ -1) == -67) {
                                    this.g(0);
                                    return true;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (!nj.field_c[82]) {
                                break L6;
                              } else {
                                if ((param0 ^ -1) != -68) {
                                  break L6;
                                } else {
                                  this.e((byte) 65);
                                  return true;
                                }
                              }
                            } else {
                              this.h((byte) -108);
                              return true;
                            }
                          }
                        } else {
                          this.a(0, -1);
                          return true;
                        }
                      } else {
                        if (((dj) this).field_R >= ((dj) this).field_v.length()) {
                          break L6;
                        } else {
                          L9: {
                            stackOut_41_0 = this;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (nj.field_c[82]) {
                              stackOut_43_0 = this;
                              stackOut_43_1 = this.e(true);
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L9;
                            } else {
                              stackOut_42_0 = this;
                              stackOut_42_1 = 1 + ((dj) this).field_R;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_44_1, -1);
                          return true;
                        }
                      }
                    } else {
                      if (-1 >= ((dj) this).field_R) {
                        break L6;
                      } else {
                        L10: {
                          stackOut_35_0 = this;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (nj.field_c[82]) {
                            stackOut_37_0 = this;
                            stackOut_37_1 = this.h(121);
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            break L10;
                          } else {
                            stackOut_36_0 = this;
                            stackOut_36_1 = ((dj) this).field_R + -1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            break L10;
                          }
                        }
                        this.a(stackIn_38_1, -1);
                        return true;
                      }
                    }
                  } else {
                    ((dj) this).i(-22617);
                    return true;
                  }
                } else {
                  if (((dj) this).field_U != ((dj) this).field_R) {
                    this.d(true);
                    return true;
                  } else {
                    if (((dj) this).field_R < ((dj) this).field_v.length()) {
                      ((dj) this).field_U = 1 + ((dj) this).field_R;
                      this.d(true);
                      return true;
                    } else {
                      break L6;
                    }
                  }
                }
              } else {
                if (((dj) this).field_R != ((dj) this).field_U) {
                  this.d(true);
                  return true;
                } else {
                  if (-1 > (((dj) this).field_R ^ -1)) {
                    ((dj) this).field_U = -1 + ((dj) this).field_R;
                    this.d(true);
                    return true;
                  } else {
                    break L6;
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

    final static og c(byte param0) {
        try {
            Throwable var1 = null;
            og stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            og stackOut_2_0 = null;
            try {
              L0: {
                if (param0 > 66) {
                  break L0;
                } else {
                  field_P = null;
                  break L0;
                }
              }
              stackOut_2_0 = (og) Class.forName("sc").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
            field_P = null;
        }
        if (!(((dj) this).field_U == ((dj) this).field_R)) {
            var2 = ((dj) this).field_R > ((dj) this).field_U ? ((dj) this).field_U : ((dj) this).field_R;
            var3 = ((dj) this).field_U < ((dj) this).field_R ? ((dj) this).field_R : ((dj) this).field_U;
            ((dj) this).field_R = var2;
            ((dj) this).field_U = var2;
            ((dj) this).field_v = ((dj) this).field_v.substring(0, var2) + ((dj) this).field_v.substring(var3, ((dj) this).field_v.length());
            ((dj) this).k(-100);
        }
    }

    private final int e(boolean param0) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
            return -110;
        }
        int var2 = ((dj) this).field_v.length();
        if (((dj) this).field_R == var2) {
            return ((dj) this).field_R;
        }
        for (var3 = ((dj) this).field_R - -1; var3 < var2; var3++) {
            // if_icmpeq L67
        }
        return var3;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        gd var8 = null;
        long var6 = 0L;
        if (param2) {
            return;
        }
        if (((dj) this).field_q != null) {
            if (-1 == (param3 ^ -1)) {
                ((dj) this).field_q.a((ee) this, param0, param1, (byte) 97, ((dj) this).field_F);
                if (!(!(((dj) this).field_q instanceof gd))) {
                    var8 = (gd) (Object) ((dj) this).field_q;
                    if (((dj) this).field_R != ((dj) this).field_U) {
                        var8.a((byte) 3, param0, ((dj) this).field_U, ((dj) this).field_R, param1, (ee) this);
                    }
                    var6 = ol.a(256);
                    if (500L > (-((dj) this).field_X + var6) % 1000L) {
                        var8.a(param1, param0, (ee) this, ((dj) this).field_R, (byte) 77);
                    }
                }
            }
        }
    }

    private final void g(int param0) {
        String var2 = this.j(-12349);
        if (!(param0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(param0 + -12349)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void h(byte param0) {
        int var2 = -76 / ((param0 - -21) / 61);
        if (((dj) this).field_k instanceof cc) {
            ((cc) (Object) ((dj) this).field_k).a((dj) this, 5);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (((dj) this).field_q instanceof gd) {
                var8_int = ((gd) (Object) ((dj) this).field_q).a(ph.field_d, kc.field_u, (ee) this, (byte) 72, param3, param4);
                this.a(0 == (var8_int ^ -1) ? 0 : var8_int, param2 ^ 80);
                var8 = ol.a(param2 + 337);
                ((dj) this).field_Y = var8 + -((dj) this).field_T < 250L ? true : false;
                if (!(!((dj) this).field_Y)) {
                    ((dj) this).field_U = this.h(param2 ^ -41);
                    ((dj) this).field_R = this.e(true);
                    if (0 < ((dj) this).field_R) {
                        if (!(((dj) this).field_v.charAt(((dj) this).field_R + -1) != 32)) {
                            ((dj) this).field_R = ((dj) this).field_R - 1;
                        }
                    }
                    ((dj) this).field_S = ((dj) this).field_R;
                }
                ((dj) this).field_T = var8;
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new vi();
        field_Q = -1;
        field_P = new ll();
    }
}
