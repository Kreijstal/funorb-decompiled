/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rm extends ck {
    private int field_R;
    private int field_M;
    static String field_J;
    private boolean field_Q;
    private long field_I;
    static boolean field_P;
    private int field_L;
    private int field_K;
    private boolean field_N;
    static int field_T;
    private long field_O;
    static String[] field_S;

    private final void l(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.g((byte) -90);
                if (param0 > 49) {
                  break L0;
                } else {
                  field_J = null;
                  break L0;
                }
              }
              this.a(var2, (byte) -127);
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

    private final void s(int param0) {
        if (param0 != 32) {
            field_J = null;
        }
        if (((rm) this).field_n instanceof jo) {
            ((jo) (Object) ((rm) this).field_n).a((rm) this, (byte) -127);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (!(((rm) this).field_K == -1)) {
            var3 = ((rm) this).field_K + -((rm) this).field_w.length();
            if (!((var3 ^ -1) > -1)) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (param1 >= -67) {
            ((rm) this).field_I = -77L;
        }
        if (((rm) this).field_L != ((rm) this).field_w.length()) {
            ((rm) this).field_w = ((rm) this).field_w.substring(0, ((rm) this).field_L) + param0 + ((rm) this).field_w.substring(((rm) this).field_L, ((rm) this).field_w.length());
        } else {
            ((rm) this).field_w = ((rm) this).field_w + param0;
        }
        ((rm) this).field_L = ((rm) this).field_L + param0.length();
        ((rm) this).field_M = ((rm) this).field_L;
        ((rm) this).n(4746);
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        L0: {
          ((rm) this).field_I = kd.c(-2456);
          if (param3 >= 55) {
            break L0;
          } else {
            ((rm) this).field_R = 21;
            break L0;
          }
        }
        if (60 == param1) {
          return false;
        } else {
          if (62 != param1) {
            L1: {
              if (param1 < 32) {
                break L1;
              } else {
                if (param1 <= 126) {
                  L2: {
                    if (((rm) this).field_L == ((rm) this).field_M) {
                      break L2;
                    } else {
                      this.g((byte) -105);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (0 == (((rm) this).field_K ^ -1)) {
                        break L4;
                      } else {
                        if (((rm) this).field_w.length() < ((rm) this).field_K) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (((rm) this).field_L < ((rm) this).field_w.length()) {
                        ((rm) this).field_w = ((rm) this).field_w.substring(0, ((rm) this).field_L) + param1 + ((rm) this).field_w.substring(((rm) this).field_L, ((rm) this).field_w.length());
                        ((rm) this).field_L = ((rm) this).field_L + 1;
                        ((rm) this).field_M = ((rm) this).field_L;
                        break L5;
                      } else {
                        ((rm) this).field_w = ((rm) this).field_w + param1;
                        ((rm) this).field_L = ((rm) this).field_w.length();
                        ((rm) this).field_M = ((rm) this).field_w.length();
                        break L5;
                      }
                    }
                    ((rm) this).n(4746);
                    break L3;
                  }
                  return true;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (85 == param2) {
                if (((rm) this).field_M == ((rm) this).field_L) {
                  if (-1 > (((rm) this).field_L ^ -1)) {
                    ((rm) this).field_M = ((rm) this).field_L - 1;
                    this.g((byte) -93);
                    return true;
                  } else {
                    break L6;
                  }
                } else {
                  this.g((byte) -118);
                  return true;
                }
              } else {
                if (param2 == 101) {
                  if (((rm) this).field_L == ((rm) this).field_M) {
                    if (((rm) this).field_L >= ((rm) this).field_w.length()) {
                      break L6;
                    } else {
                      ((rm) this).field_M = ((rm) this).field_L - -1;
                      this.g((byte) 113);
                      return true;
                    }
                  } else {
                    this.g((byte) -117);
                    return true;
                  }
                } else {
                  if (param2 == 13) {
                    ((rm) this).p(61);
                    return true;
                  } else {
                    if ((param2 ^ -1) == -97) {
                      if (0 >= ((rm) this).field_L) {
                        break L6;
                      } else {
                        L7: {
                          stackOut_36_0 = this;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_37_0 = stackOut_36_0;
                          if (qk.field_e[82]) {
                            stackOut_38_0 = this;
                            stackOut_38_1 = this.o(88);
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            break L7;
                          } else {
                            stackOut_37_0 = this;
                            stackOut_37_1 = ((rm) this).field_L - 1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            break L7;
                          }
                        }
                        this.a(stackIn_39_1, 6931);
                        return true;
                      }
                    } else {
                      if (97 == param2) {
                        if (((rm) this).field_L >= ((rm) this).field_w.length()) {
                          break L6;
                        } else {
                          L8: {
                            stackOut_31_0 = this;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (!qk.field_e[82]) {
                              stackOut_33_0 = this;
                              stackOut_33_1 = 1 + ((rm) this).field_L;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              break L8;
                            } else {
                              stackOut_32_0 = this;
                              stackOut_32_1 = this.f((byte) 116);
                              stackIn_34_0 = stackOut_32_0;
                              stackIn_34_1 = stackOut_32_1;
                              break L8;
                            }
                          }
                          this.a(stackIn_34_1, 6931);
                          return true;
                        }
                      } else {
                        if ((param2 ^ -1) == -103) {
                          this.a(0, 6931);
                          return true;
                        } else {
                          if (param2 == -104) {
                            this.a(((rm) this).field_w.length(), 6931);
                            return true;
                          } else {
                            if (-85 == param2) {
                              this.s(32);
                              return true;
                            } else {
                              L9: {
                                if (!qk.field_e[82]) {
                                  break L9;
                                } else {
                                  if (param2 == 65) {
                                    this.i(0);
                                    return true;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (!qk.field_e[82]) {
                                  break L10;
                                } else {
                                  if (param2 != 66) {
                                    break L10;
                                  } else {
                                    this.h((byte) -86);
                                    return true;
                                  }
                                }
                              }
                              if (!qk.field_e[82]) {
                                break L6;
                              } else {
                                if (67 != param2) {
                                  break L6;
                                } else {
                                  this.l(69);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
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
    }

    final void a(String param0, boolean param1, byte param2) {
        if (param0 == null) {
            param0 = "";
        }
        ((rm) this).field_w = param0;
        if (param2 < 2) {
            this.g((byte) -16);
        }
        int var4 = param0.length();
        if (-1 != ((rm) this).field_K) {
            if (!(var4 <= ((rm) this).field_K)) {
                ((rm) this).field_w = ((rm) this).field_w.substring(0, ((rm) this).field_K);
            }
        }
        ((rm) this).field_M = ((rm) this).field_w.length();
        ((rm) this).field_L = ((rm) this).field_w.length();
        if (!param1) {
            ((rm) this).n(4746);
        }
    }

    private final void h(byte param0) {
        if (param0 >= -73) {
            return;
        }
        String var2 = this.k(82);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(82)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void i(int param0) {
        if (param0 != 0) {
            field_S = null;
        }
        this.h((byte) -89);
        this.g((byte) -111);
    }

    void n(int param0) {
        if (((rm) this).field_n instanceof jo) {
            ((jo) (Object) ((rm) this).field_n).a((rm) this, 10000536);
        }
        if (param0 != 4746) {
            int discarded$0 = this.o(99);
        }
    }

    final static int a(ec param0, int param1) {
        int var2 = param0.c(true);
        if (var2 == 255) {
            var2 = ek.field_c;
        }
        if (param1 != 6065) {
            field_J = null;
        }
        return var2;
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (((rm) this).field_L == 0) {
            return ((rm) this).field_L;
        }
        if (param0 < 37) {
            ((rm) this).field_O = 78L;
        }
        for (var2 = -1 + ((rm) this).field_L; -1 > (var2 ^ -1); var2--) {
            // if_icmpeq L67
        }
        return var2;
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var9_int = 0;
        long var9 = 0L;
        int var8 = -112 / ((-80 - param5) / 35);
        if (!super.a(param0, param1, param2, param3, param4, (byte) -124, param6)) {
            return false;
        }
        if (!(!(((rm) this).field_o instanceof th))) {
            var9_int = ((th) (Object) ((rm) this).field_o).a(16, param6, hj.field_S, param3, (lm) this, eh.field_h);
            this.a((var9_int ^ -1) == 0 ? 0 : var9_int, 6931);
            var9 = kd.c(-2456);
            ((rm) this).field_N = (-((rm) this).field_O + var9 ^ -1L) > -251L ? true : false;
            if (((rm) this).field_N) {
                ((rm) this).field_M = this.o(88);
                ((rm) this).field_L = this.f((byte) 99);
                if (((rm) this).field_L > 0) {
                    if (!(((rm) this).field_w.charAt(-1 + ((rm) this).field_L) != 32)) {
                        ((rm) this).field_L = ((rm) this).field_L - 1;
                    }
                }
                ((rm) this).field_R = ((rm) this).field_L;
            }
            ((rm) this).field_O = var9;
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        th var8 = null;
        long var6 = 0L;
        if (((rm) this).field_o != null) {
            if (-1 == (param0 ^ -1)) {
                ((rm) this).field_o.a((byte) 34, (lm) this, param1, param3, ((rm) this).field_B);
                if (((rm) this).field_o instanceof th) {
                    var8 = (th) (Object) ((rm) this).field_o;
                    if (((rm) this).field_L != ((rm) this).field_M) {
                        var8.a(((rm) this).field_M, param1, param3, (lm) this, 33, ((rm) this).field_L);
                    }
                    var6 = kd.c(param2 + -2456);
                    if (!((-((rm) this).field_I + var6) % 1000L >= 500L)) {
                        var8.a((lm) this, ((rm) this).field_L, param3, -1, param1);
                    }
                }
            }
        }
        if (param2 != 0) {
            this.j(31);
        }
    }

    final static int a(byte param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        var3 = 0;
        var4 = param1.length();
        var5 = -123 / ((12 - param0) / 32);
        var6 = 0;
        L0: while (true) {
          if (var6 >= var4) {
            return var3;
          } else {
            if (param2 == param1.charAt(var6)) {
              var3++;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 82 % ((param0 - -32) / 54);
        if (!(((rm) this).field_M == ((rm) this).field_L)) {
            var3 = ((rm) this).field_M < ((rm) this).field_L ? ((rm) this).field_M : ((rm) this).field_L;
            var4 = ((rm) this).field_M < ((rm) this).field_L ? ((rm) this).field_L : ((rm) this).field_M;
            ((rm) this).field_M = var3;
            ((rm) this).field_L = var3;
            ((rm) this).field_w = ((rm) this).field_w.substring(0, var3) + ((rm) this).field_w.substring(var4, ((rm) this).field_w.length());
            ((rm) this).n(4746);
        }
    }

    final static double a(byte param0, int param1, int param2, double param3, int param4) {
        double var6 = (double)param4 / (double)param2;
        double var8 = -((double)param1 * 0.02) + 0.1;
        int var12 = -29 / ((54 - param0) / 40);
        double var10 = 0.9 - 0.08 * (double)param1;
        double var13 = var6 * var10 + (param3 + var8);
        if (!(1.0 >= var13)) {
            var13 = 1.0;
        }
        return var13;
    }

    private final void a(int param0, int param1) {
        ((rm) this).field_L = param0;
        if (param1 != 6931) {
            field_P = false;
        }
        if (!qk.field_e[81]) {
            ((rm) this).field_M = ((rm) this).field_L;
        }
    }

    public static void m(int param0) {
        field_S = null;
        field_J = null;
        if (param0 != 4) {
            field_P = false;
        }
    }

    private final int f(byte param0) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (param0 <= 76) {
            this.l(39);
        }
        int var2 = ((rm) this).field_w.length();
        if (((rm) this).field_L == var2) {
            return ((rm) this).field_L;
        }
        for (var3 = 1 + ((rm) this).field_L; var2 > var3; var3++) {
            // if_icmpeq L74
        }
        return var3;
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        th var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.j(-24768);
        if (1 == ((rm) this).field_y) {
            if (((rm) this).field_o instanceof th) {
                var5 = (th) (Object) ((rm) this).field_o;
                var6 = var5.a(16, param1, hj.field_S, param0, (lm) this, eh.field_h);
                if (!(-1 == var6)) {
                    if (((rm) this).field_N) {
                        if (var6 < ((rm) this).field_R) {
                            if (((rm) this).field_M < var6) {
                                var6 = ((rm) this).field_R;
                            }
                        }
                    }
                    ((rm) this).field_L = var6;
                }
            }
            ((rm) this).field_I = kd.c(-2456);
        }
    }

    rm(String param0, pg param1, int param2) {
        super(param0, param1);
        ((rm) this).field_R = -1;
        ((rm) this).field_O = 0L;
        ((rm) this).field_N = false;
        ((rm) this).field_K = param2;
        ((rm) this).field_o = hl.field_a.field_c;
        ((rm) this).a(param0, true, (byte) 57);
        ((rm) this).field_Q = true;
        ((rm) this).field_I = kd.c(-2456);
    }

    final static void q(int param0) {
        int var2 = 0;
        int var3 = 0;
        ue var4_ref_ue = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        ub var8 = null;
        wj var9 = null;
        byte[] var13 = null;
        L0: {
          var6 = DungeonAssault.field_K;
          var9 = ra.field_c;
          if (param0 == -5705) {
            break L0;
          } else {
            field_T = -87;
            break L0;
          }
        }
        L1: {
          var2 = var9.c(true);
          if (var2 == 0) {
            var8 = (ub) (Object) bg.field_s.e(-24172);
            if (var8 == null) {
              tl.a(-86);
              return;
            } else {
              L2: {
                var4 = var9.c(true);
                if (0 == var4) {
                  var5 = null;
                  break L2;
                } else {
                  var13 = new byte[var4];
                  var9.a((byte) -111, 0, var4, var13);
                  break L2;
                }
              }
              var9.field_o = var9.field_o + 4;
              if (var9.d(true)) {
                var8.a(false);
                break L1;
              } else {
                tl.a(param0 ^ -5667);
                return;
              }
            }
          } else {
            if (var2 != 1) {
              sm.a((Throwable) null, 1, "A1: " + sj.l(192));
              tl.a(-85);
              break L1;
            } else {
              var3 = var9.h(-107);
              var4_ref_ue = (ue) (Object) qm.field_q.e(-24172);
              L3: while (true) {
                L4: {
                  if (var4_ref_ue == null) {
                    break L4;
                  } else {
                    if (var4_ref_ue.field_k == var3) {
                      break L4;
                    } else {
                      var4_ref_ue = (ue) (Object) qm.field_q.a(4);
                      continue L3;
                    }
                  }
                }
                if (var4_ref_ue != null) {
                  var4_ref_ue.a(false);
                  break L1;
                } else {
                  tl.a(126);
                  return;
                }
              }
            }
          }
        }
    }

    private final void j(int param0) {
        l var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        th var10 = null;
        var8 = DungeonAssault.field_K;
        if (!((rm) this).field_Q) {
          ((rm) this).field_A = 0;
          ((rm) this).field_j = 0;
          return;
        } else {
          if (((rm) this).field_o instanceof th) {
            L0: {
              var10 = (th) (Object) ((rm) this).field_o;
              if (param0 == -24768) {
                break L0;
              } else {
                var9 = null;
                int discarded$1 = rm.a((ec) null, -49);
                break L0;
              }
            }
            var3 = var10.b(-2, (lm) this);
            var4 = var3.c(-117);
            var5 = var10.c(param0 + 24772, (lm) this);
            var6 = var10.a(param0 ^ -24774) >> 1084425857;
            if (-var6 + var5 > var4) {
              ((rm) this).field_j = 0;
              ((rm) this).field_A = 0;
              return;
            } else {
              L1: {
                var7 = ((rm) this).field_j - -var3.a((byte) 86, ((rm) this).field_L);
                if (var5 + -var6 >= var7) {
                  if (var7 >= var6) {
                    break L1;
                  } else {
                    ((rm) this).field_j = var6 + (-var7 + ((rm) this).field_j);
                    break L1;
                  }
                } else {
                  ((rm) this).field_j = ((rm) this).field_j - (-var5 - -var6 + var7);
                  break L1;
                }
              }
              L2: {
                if (-1 > (((rm) this).field_j ^ -1)) {
                  ((rm) this).field_j = 0;
                  break L2;
                } else {
                  if (var6 + -var5 > ((rm) this).field_j) {
                    ((rm) this).field_j = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final void p(int param0) {
        if (param0 <= 30) {
            int discarded$0 = rm.a((byte) 6, (CharSequence) null, 'ﾫ');
        }
        ((rm) this).field_M = 0;
        ((rm) this).field_w = "";
        ((rm) this).field_L = 0;
        ((rm) this).n(4746);
    }

    private final String k(int param0) {
        int var2 = ((rm) this).field_L <= ((rm) this).field_M ? ((rm) this).field_L : ((rm) this).field_M;
        if (param0 != 82) {
            return null;
        }
        int var3 = ((rm) this).field_M < ((rm) this).field_L ? ((rm) this).field_L : ((rm) this).field_M;
        return ((rm) this).field_w.substring(var2, var3);
    }

    final static void r(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = DungeonAssault.field_K;
          ga.field_o = new cn[9];
          if (1 != hc.field_d) {
            if (-3 != (hc.field_d ^ -1)) {
              sj.field_db = dd.field_C;
              break L0;
            } else {
              sj.field_db = na.field_G;
              break L0;
            }
          } else {
            sj.field_db = hl.field_e;
            break L0;
          }
        }
        L1: {
          if (param0 == 22362) {
            break L1;
          } else {
            rm.q(124);
            break L1;
          }
        }
        ga.field_o[0] = rc.a("", sb.field_a, "intro_01.jpg", (byte) 71);
        ga.field_o[1] = rc.a("", sb.field_a, "intro_03.jpg", (byte) 71);
        ga.field_o[2] = rc.a("", sb.field_a, "intro_02.jpg", (byte) 71);
        ga.field_o[3] = rc.a("", sb.field_a, "intro_04.jpg", (byte) 71);
        ga.field_o[4] = rc.a("", sb.field_a, "intro_05.jpg", (byte) 71);
        ga.field_o[5] = ga.field_o[4];
        ga.field_o[6] = rc.a("", sb.field_a, "intro_06.jpg", (byte) 71);
        ga.field_o[7] = rc.a("", sb.field_a, "intro_07.jpg", (byte) 71);
        ga.field_o[8] = rc.a("", sb.field_a, "intro_08.jpg", (byte) 71);
        jh.c();
        var1 = 0;
        L2: while (true) {
          if (var1 >= ga.field_o.length) {
            jh.b();
            sg.field_b = rc.a("", sb.field_a, "logo.jpg", (byte) 71);
            ro.field_B = true;
            return;
          } else {
            ga.field_o[var1].e();
            gf.e(0, 0, gf.field_i, gf.field_c, 0);
            gf.e(1, 1, -2 + gf.field_i, -2 + gf.field_c, 0, 128);
            var1++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Passive ability - <%0>";
        field_S = new String[]{"Defeat", "<%highlight>Your raider has failed!</col><br><br><%command>Seek another route or try again with another raider. Continue moving your party toward the hoard room.</col>"};
    }
}
