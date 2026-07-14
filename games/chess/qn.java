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
        if (!param0) {
            this.a(-126, (byte) -127);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (!(!(((qn) this).field_n instanceof mg))) {
            var8_int = ((mg) (Object) ((qn) this).field_n).a(rf.field_b, param5, -4, param6, (mf) this, hn.field_k);
            this.a(-1 == var8_int ? 0 : var8_int, (byte) 80);
            var8 = ud.a(2);
            ((qn) this).field_S = -251L < (var8 + -((qn) this).field_O ^ -1L) ? true : false;
            if (!(!((qn) this).field_S)) {
                ((qn) this).field_X = this.l(param3 ^ 41);
                ((qn) this).field_Q = this.k(param3 + -23899);
                if ((((qn) this).field_Q ^ -1) < -1) {
                    if (32 == ((qn) this).field_v.charAt(-1 + ((qn) this).field_Q)) {
                        ((qn) this).field_Q = ((qn) this).field_Q - 1;
                    }
                }
                ((qn) this).field_N = ((qn) this).field_Q;
            }
            ((qn) this).field_O = var8;
            return true;
        }
        return false;
    }

    private final void e(byte param0) {
        int var3 = 71 % ((param0 - 31) / 51);
        String var2 = this.b(false);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b(false)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        if (!(param2 != null)) {
            param2 = "";
        }
        if (param0 != 0) {
            int discarded$0 = qn.a((byte) 44, 60, -34);
        }
        ((qn) this).field_v = param2;
        int var4 = param2.length();
        if (((qn) this).field_T != -1) {
            if (!(((qn) this).field_T >= var4)) {
                ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_T);
            }
        }
        ((qn) this).field_X = ((qn) this).field_v.length();
        ((qn) this).field_Q = ((qn) this).field_v.length();
        if (!(param1)) {
            ((qn) this).g((byte) 63);
        }
    }

    private final String b(boolean param0) {
        int var2 = ((qn) this).field_Q <= ((qn) this).field_X ? ((qn) this).field_Q : ((qn) this).field_X;
        if (param0) {
            return null;
        }
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
                if (param0 == -18) {
                  break L0;
                } else {
                  ((qn) this).field_W = true;
                  break L0;
                }
              }
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.j(1);
              this.a(var2_ref, 99);
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

    private final int l(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        if (param0 <= 47) {
            ((qn) this).field_V = -33L;
        }
        if (!(((qn) this).field_Q != 0)) {
            return ((qn) this).field_Q;
        }
        for (var2 = -1 + ((qn) this).field_Q; var2 > 0; var2--) {
            // if_icmpeq L69
        }
        return var2;
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
        int var3 = 0;
        if (param1 < 93) {
            ((qn) this).g((byte) 65);
        }
        if (!(((qn) this).field_T == -1)) {
            var3 = ((qn) this).field_T - ((qn) this).field_v.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((qn) this).field_Q == ((qn) this).field_v.length()) {
            ((qn) this).field_v = ((qn) this).field_v + param0;
        } else {
            ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_Q) + param0 + ((qn) this).field_v.substring(((qn) this).field_Q, ((qn) this).field_v.length());
        }
        ((qn) this).field_Q = ((qn) this).field_Q + param0.length();
        ((qn) this).field_X = ((qn) this).field_Q;
        ((qn) this).g((byte) 63);
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
        if (param0 != -14) {
            field_R = null;
        }
        field_U = null;
        field_P = null;
    }

    qn(String param0, rg param1, int param2) {
        super(param0, param1);
        ((qn) this).field_S = false;
        ((qn) this).field_N = -1;
        ((qn) this).field_O = 0L;
        ((qn) this).field_n = a.field_a.field_o;
        ((qn) this).field_T = param2;
        ((qn) this).a(0, true, param0);
        ((qn) this).field_W = true;
        ((qn) this).field_V = ud.a(2);
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        if (param0 == 107) {
          var3 = 0;
          var4 = id.field_c;
          L0: while (true) {
            if (var3 >= bd.field_e.length) {
              return -1;
            } else {
              var5 = ec.field_l[var3];
              if ((var5 ^ -1) > -1) {
                var4 = var4 + qd.field_r;
                var3++;
                continue L0;
              } else {
                var6 = in.a(bd.field_e[var3], 71, true);
                var4 = var4 + mf.field_z;
                var7 = of.field_k + -(var6 >> 475785921);
                if (ve.a(var4, var7 + -gm.field_e, var6 + (gm.field_e << -5310527), param2, (fh.field_e << -19543679) + ug.field_a, 2, param1)) {
                  return var5;
                } else {
                  var4 = var4 + ((fh.field_e << -1606804639) - (-mf.field_z - ug.field_a));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 104;
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != -17513) {
            field_U = null;
        }
        return li.field_e[65535 & (int)(param1 * 32768.0 / 3.141592653589793)];
    }

    private final int k(int param0) {
        int var3 = 0;
        int var4 = Chess.field_G;
        if (param0 != -23811) {
            return 12;
        }
        int var2 = ((qn) this).field_v.length();
        if (!(((qn) this).field_Q != var2)) {
            return ((qn) this).field_Q;
        }
        for (var3 = 1 + ((qn) this).field_Q; var2 > var3; var3++) {
            // if_icmpeq L72
        }
        return var3;
    }

    private final void f(byte param0) {
        this.e((byte) -98);
        this.j(param0 ^ 78);
        if (param0 != 79) {
            this.h((byte) 7);
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ((qn) this).field_V = ud.a(2);
        if (param0 == 60) {
          return false;
        } else {
          if (param0 != 62) {
            if (param2 == -1) {
              L0: {
                if (32 > param0) {
                  break L0;
                } else {
                  if (param0 <= 126) {
                    L1: {
                      if (((qn) this).field_X == ((qn) this).field_Q) {
                        break L1;
                      } else {
                        this.j(1);
                        break L1;
                      }
                    }
                    L2: {
                      L3: {
                        if (0 == (((qn) this).field_T ^ -1)) {
                          break L3;
                        } else {
                          if (((qn) this).field_v.length() >= ((qn) this).field_T) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (((qn) this).field_Q < ((qn) this).field_v.length()) {
                          ((qn) this).field_v = ((qn) this).field_v.substring(0, ((qn) this).field_Q) + param0 + ((qn) this).field_v.substring(((qn) this).field_Q, ((qn) this).field_v.length());
                          ((qn) this).field_Q = ((qn) this).field_Q + 1;
                          ((qn) this).field_X = ((qn) this).field_Q;
                          break L4;
                        } else {
                          ((qn) this).field_v = ((qn) this).field_v + param0;
                          ((qn) this).field_Q = ((qn) this).field_v.length();
                          ((qn) this).field_X = ((qn) this).field_v.length();
                          break L4;
                        }
                      }
                      ((qn) this).g((byte) 63);
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
                  if (((qn) this).field_Q != ((qn) this).field_X) {
                    this.j(1);
                    return true;
                  } else {
                    if (0 < ((qn) this).field_Q) {
                      ((qn) this).field_X = ((qn) this).field_Q - 1;
                      this.j(1);
                      return true;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  if ((param1 ^ -1) != -102) {
                    if (-14 != param1) {
                      if (-97 == param1) {
                        if ((((qn) this).field_Q ^ -1) >= -1) {
                          break L5;
                        } else {
                          L6: {
                            stackOut_42_0 = this;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (!ok.field_Jb[82]) {
                              stackOut_44_0 = this;
                              stackOut_44_1 = ((qn) this).field_Q - 1;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L6;
                            } else {
                              stackOut_43_0 = this;
                              stackOut_43_1 = this.l(param2 ^ -113);
                              stackIn_45_0 = stackOut_43_0;
                              stackIn_45_1 = stackOut_43_1;
                              break L6;
                            }
                          }
                          this.a(stackIn_45_1, (byte) 56);
                          return true;
                        }
                      } else {
                        if (param1 == -98) {
                          if (((qn) this).field_Q < ((qn) this).field_v.length()) {
                            L7: {
                              stackOut_37_0 = this;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              if (ok.field_Jb[82]) {
                                stackOut_39_0 = this;
                                stackOut_39_1 = this.k(-23811);
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                break L7;
                              } else {
                                stackOut_38_0 = this;
                                stackOut_38_1 = ((qn) this).field_Q - -1;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_40_1 = stackOut_38_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_40_1, (byte) 65);
                            return true;
                          } else {
                            break L5;
                          }
                        } else {
                          if (102 != param1) {
                            if (-104 != param1) {
                              if (param1 == 84) {
                                this.c(true);
                                return true;
                              } else {
                                L8: {
                                  if (!ok.field_Jb[82]) {
                                    break L8;
                                  } else {
                                    if (-66 != (param1 ^ -1)) {
                                      break L8;
                                    } else {
                                      this.f((byte) 79);
                                      return true;
                                    }
                                  }
                                }
                                L9: {
                                  if (!ok.field_Jb[82]) {
                                    break L9;
                                  } else {
                                    if (66 == param1) {
                                      this.e((byte) 122);
                                      return true;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (!ok.field_Jb[82]) {
                                  break L5;
                                } else {
                                  if (-68 != (param1 ^ -1)) {
                                    break L5;
                                  } else {
                                    this.h((byte) -18);
                                    return true;
                                  }
                                }
                              }
                            } else {
                              this.a(((qn) this).field_v.length(), (byte) 99);
                              return true;
                            }
                          } else {
                            this.a(0, (byte) 114);
                            return true;
                          }
                        }
                      }
                    } else {
                      ((qn) this).i(-12881);
                      return true;
                    }
                  } else {
                    if (((qn) this).field_Q == ((qn) this).field_X) {
                      if (((qn) this).field_Q >= ((qn) this).field_v.length()) {
                        break L5;
                      } else {
                        ((qn) this).field_X = ((qn) this).field_Q + 1;
                        this.j(param2 ^ -2);
                        return true;
                      }
                    } else {
                      this.j(1);
                      return true;
                    }
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
            var6 = var9.a((byte) 76) >> -2083444415;
            if (var4 >= -var6 + var5) {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  qn.m(61);
                  break L0;
                }
              }
              L1: {
                var7 = ((qn) this).field_A - -var3.a(-5940, ((qn) this).field_Q);
                if (var7 <= -var6 + var5) {
                  if (var6 > var7) {
                    ((qn) this).field_A = -var7 - (-var6 - ((qn) this).field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((qn) this).field_A = ((qn) this).field_A + -var7 + (var5 - var6);
                  break L1;
                }
              }
              L2: {
                if (((qn) this).field_A > 0) {
                  ((qn) this).field_A = 0;
                  break L2;
                } else {
                  if (var6 + -var5 <= ((qn) this).field_A) {
                    break L2;
                  } else {
                    ((qn) this).field_A = -var5 + var6;
                    break L2;
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
        mg var5 = null;
        int var6 = 0;
        super.a(param0, -51, param2, param3);
        if (param1 >= -6) {
            return;
        }
        this.d(true);
        if (1 == ((qn) this).field_q) {
            if (!(!(((qn) this).field_n instanceof mg))) {
                var5 = (mg) (Object) ((qn) this).field_n;
                var6 = var5.a(rf.field_b, param3, -4, param0, (mf) this, hn.field_k);
                if (!(0 == (var6 ^ -1))) {
                    if (((qn) this).field_S) {
                        if (((qn) this).field_N > var6) {
                            if (((qn) this).field_X < var6) {
                                var6 = ((qn) this).field_N;
                            }
                        }
                    }
                    ((qn) this).field_Q = var6;
                }
            }
            ((qn) this).field_V = ud.a(2);
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
