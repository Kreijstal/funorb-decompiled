/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk extends ek {
    static qk field_L;
    private int field_Q;
    static String field_N;
    static int field_cb;
    static String[] field_P;
    private long field_Z;
    static String field_bb;
    static String[] field_O;
    private boolean field_T;
    private int field_M;
    static String field_U;
    static java.security.SecureRandom field_K;
    private long field_ab;
    static mm field_R;
    static String field_Y;
    private int field_S;
    private int field_X;
    private boolean field_W;
    static int field_V;

    void l(int param0) {
        if (param0 != 18929) {
            field_K = null;
        }
        if (!(!(((rk) this).field_v instanceof qh))) {
            ((qh) (Object) ((rk) this).field_v).a(16737894, (rk) this);
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        if (param0 == null) {
            param0 = "";
        }
        ((rk) this).field_E = param0;
        int var4 = param0.length();
        if ((((rk) this).field_X ^ -1) != 0) {
            if (((rk) this).field_X < var4) {
                ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_X);
            }
        }
        ((rk) this).field_M = ((rk) this).field_E.length();
        ((rk) this).field_S = ((rk) this).field_E.length();
        if (param1 != 114) {
            field_U = null;
        }
        if (!(param2)) {
            ((rk) this).l(18929);
        }
    }

    private final void k(int param0) {
        cf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nl var9 = null;
        var8 = client.field_A ? 1 : 0;
        if (!((rk) this).field_T) {
          ((rk) this).field_x = 0;
          ((rk) this).field_F = 0;
          return;
        } else {
          if (!(((rk) this).field_p instanceof nl)) {
            return;
          } else {
            L0: {
              var9 = (nl) (Object) ((rk) this).field_p;
              var3 = var9.a((ce) this, (byte) 118);
              var4 = var3.a(false);
              if (param0 == -17122) {
                break L0;
              } else {
                ((rk) this).field_M = -109;
                break L0;
              }
            }
            var5 = var9.a(false, (ce) this);
            var6 = var9.a((byte) -106) >> -1897107391;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = ((rk) this).field_x + var3.a((byte) -94, ((rk) this).field_S);
                if (var5 + -var6 < var7) {
                  ((rk) this).field_x = ((rk) this).field_x + (-var6 + var5) + -var7;
                  break L1;
                } else {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    ((rk) this).field_x = ((rk) this).field_x - (-var6 + var7);
                    break L1;
                  }
                }
              }
              L2: {
                if (0 < ((rk) this).field_x) {
                  ((rk) this).field_x = 0;
                  break L2;
                } else {
                  if (-var5 - -var6 <= ((rk) this).field_x) {
                    break L2;
                  } else {
                    ((rk) this).field_x = -var5 - -var6;
                    break L2;
                  }
                }
              }
              return;
            } else {
              ((rk) this).field_F = 0;
              ((rk) this).field_x = 0;
              return;
            }
          }
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((rk) this).field_S == ((rk) this).field_M)) {
            var2 = ((rk) this).field_S <= ((rk) this).field_M ? ((rk) this).field_S : ((rk) this).field_M;
            var3 = ((rk) this).field_S <= ((rk) this).field_M ? ((rk) this).field_M : ((rk) this).field_S;
            ((rk) this).field_M = var2;
            ((rk) this).field_S = var2;
            ((rk) this).field_E = ((rk) this).field_E.substring(0, var2) + ((rk) this).field_E.substring(var3, ((rk) this).field_E.length());
            ((rk) this).l(18929);
        }
        var2 = -30 / ((param0 - 40) / 59);
    }

    private final int e(byte param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        int var2 = ((rk) this).field_E.length();
        if (!(var2 != ((rk) this).field_S)) {
            return ((rk) this).field_S;
        }
        for (var3 = 1 + ((rk) this).field_S; var3 < var2; var3++) {
            // if_icmpeq L64
        }
        if (param0 != -30) {
            ((rk) this).field_X = 46;
        }
        return var3;
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (!(((rk) this).field_p instanceof nl)) {
                return false;
            }
            var8_int = ((nl) (Object) ((rk) this).field_p).a(param5, -257, (ce) this, param4, pm.field_f, bh.field_g);
            this.b(param6 ^ 30294, 0 != (var8_int ^ -1) ? var8_int : 0);
            var8 = ik.a(4);
            ((rk) this).field_W = 250L > -((rk) this).field_ab + var8 ? true : false;
            if (!(!((rk) this).field_W)) {
                ((rk) this).field_M = this.n(0);
                ((rk) this).field_S = this.e((byte) -30);
                if ((((rk) this).field_S ^ -1) < -1) {
                    if (((rk) this).field_E.charAt(-1 + ((rk) this).field_S) == 32) {
                        ((rk) this).field_S = ((rk) this).field_S - 1;
                    }
                }
                ((rk) this).field_Q = ((rk) this).field_S;
            }
            ((rk) this).field_ab = var8;
            return true;
        }
        return false;
    }

    private final void g(byte param0) {
        if (param0 != -76) {
            return;
        }
        this.h((byte) -113);
        this.f((byte) -95);
    }

    private final void b(boolean param0) {
        if (!(!(((rk) this).field_v instanceof qh))) {
            ((qh) (Object) ((rk) this).field_v).b(-2569, (rk) this);
        }
        if (param0) {
            ((rk) this).field_ab = 15L;
        }
    }

    rk(String param0, kg param1, int param2) {
        super(param0, param1);
        ((rk) this).field_ab = 0L;
        ((rk) this).field_Q = -1;
        ((rk) this).field_W = false;
        ((rk) this).field_X = param2;
        ((rk) this).field_p = bf.field_x.field_l;
        ((rk) this).a(param0, (byte) 114, true);
        ((rk) this).field_T = true;
        ((rk) this).field_Z = ik.a(4);
    }

    final static void c(boolean param0) {
        em.a(-1199770620);
        if (param0) {
            return;
        }
        hm.a(4, (byte) -104);
    }

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
            return;
        }
        if (0 != ((rk) this).field_X) {
            var3 = ((rk) this).field_X + -((rk) this).field_E.length();
            if (-1 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((rk) this).field_S != ((rk) this).field_E.length()) {
            ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_S) + param0 + ((rk) this).field_E.substring(((rk) this).field_S, ((rk) this).field_E.length());
        } else {
            ((rk) this).field_E = ((rk) this).field_E + param0;
        }
        ((rk) this).field_S = ((rk) this).field_S + param0.length();
        ((rk) this).field_M = ((rk) this).field_S;
        ((rk) this).l(18929);
    }

    private final void h(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 >= 112) {
                break L0;
              } else {
                field_R = null;
                break L0;
              }
            }
            try {
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.f((byte) -92);
              this.a(var2_ref, true);
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

    final void a(int param0, int param1, int param2, int param3) {
        nl var9 = null;
        long var6 = 0L;
        if (param1 > -103) {
            Object var8 = null;
            boolean discarded$0 = ((rk) this).a(-88, -47, (ce) null, '%');
        }
        if (null != ((rk) this).field_p) {
            if (!(param2 != 0)) {
                ((rk) this).field_p.a(((rk) this).field_I, param0, param3, (byte) -110, (ce) this);
                if (((rk) this).field_p instanceof nl) {
                    var9 = (nl) (Object) ((rk) this).field_p;
                    if (((rk) this).field_M != ((rk) this).field_S) {
                        var9.a(((rk) this).field_M, ((rk) this).field_S, param3, param0, -123, (ce) this);
                    }
                    var6 = ik.a(4);
                    if (((var6 + -((rk) this).field_Z) % 1000L ^ -1L) > -501L) {
                        var9.a((ce) this, ((rk) this).field_S, 1, param0, param3);
                    }
                }
            }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        nl var7 = null;
        int var6 = 0;
        super.a(param0, 94, param2, param3);
        if (param1 < 38) {
            ((rk) this).field_X = 63;
        }
        this.k(-17122);
        if (-2 == (((rk) this).field_o ^ -1)) {
            if (((rk) this).field_p instanceof nl) {
                var7 = (nl) (Object) ((rk) this).field_p;
                var6 = var7.a(param3, -257, (ce) this, param2, pm.field_f, bh.field_g);
                if ((var6 ^ -1) != 0) {
                    if (((rk) this).field_W) {
                        if (((rk) this).field_Q > var6) {
                            if (!(((rk) this).field_M >= var6)) {
                                var6 = ((rk) this).field_Q;
                            }
                        }
                    }
                    ((rk) this).field_S = var6;
                }
            }
            ((rk) this).field_Z = ik.a(4);
        }
    }

    final void m(int param0) {
        ((rk) this).field_M = param0;
        ((rk) this).field_E = "";
        ((rk) this).field_S = 0;
        ((rk) this).l(18929);
    }

    private final String i(int param0) {
        int var2 = ((rk) this).field_S > ((rk) this).field_M ? ((rk) this).field_M : ((rk) this).field_S;
        if (param0 <= 102) {
            return null;
        }
        int var3 = ((rk) this).field_M >= ((rk) this).field_S ? ((rk) this).field_M : ((rk) this).field_S;
        return ((rk) this).field_E.substring(var2, var3);
    }

    public static void j(int param0) {
        field_N = null;
        field_R = null;
        field_L = null;
        field_Y = null;
        field_P = null;
        field_U = null;
        field_bb = null;
        field_O = null;
        field_K = null;
        if (param0 != 81) {
            rk.c(true);
        }
    }

    private final void b(int param0, int param1) {
        ((rk) this).field_S = param1;
        if (!(bj.field_d[81])) {
            ((rk) this).field_M = ((rk) this).field_S;
        }
        if (param0 != -30305) {
            ((rk) this).field_Z = 4L;
        }
    }

    private final void h(byte param0) {
        String var2 = this.i(127);
        if (!(-1 <= (var2.length() ^ -1))) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.i(103)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 > -96) {
            Object var3 = null;
            this.a((String) null, true);
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        L0: {
          ((rk) this).field_Z = ik.a(4);
          if (60 == param3) {
            break L0;
          } else {
            if (param3 == 62) {
              break L0;
            } else {
              L1: {
                if (32 > param3) {
                  break L1;
                } else {
                  if (param3 <= 126) {
                    L2: {
                      if (((rk) this).field_S == ((rk) this).field_M) {
                        break L2;
                      } else {
                        this.f((byte) -94);
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if ((((rk) this).field_X ^ -1) == 0) {
                          break L4;
                        } else {
                          if (((rk) this).field_E.length() >= ((rk) this).field_X) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (((rk) this).field_S < ((rk) this).field_E.length()) {
                          ((rk) this).field_E = ((rk) this).field_E.substring(0, ((rk) this).field_S) + param3 + ((rk) this).field_E.substring(((rk) this).field_S, ((rk) this).field_E.length());
                          ((rk) this).field_S = ((rk) this).field_S + 1;
                          ((rk) this).field_M = ((rk) this).field_S;
                          break L5;
                        } else {
                          ((rk) this).field_E = ((rk) this).field_E + param3;
                          ((rk) this).field_S = ((rk) this).field_E.length();
                          ((rk) this).field_M = ((rk) this).field_E.length();
                          break L5;
                        }
                      }
                      ((rk) this).l(18929);
                      break L3;
                    }
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                if ((param1 ^ -1) == -86) {
                  if (((rk) this).field_M == ((rk) this).field_S) {
                    if (((rk) this).field_S <= 0) {
                      break L6;
                    } else {
                      ((rk) this).field_M = -1 + ((rk) this).field_S;
                      this.f((byte) 113);
                      return true;
                    }
                  } else {
                    this.f((byte) -94);
                    return true;
                  }
                } else {
                  if (param1 != 101) {
                    if ((param1 ^ -1) != -14) {
                      if ((param1 ^ -1) != -97) {
                        if (param1 == 97) {
                          if (((rk) this).field_S >= ((rk) this).field_E.length()) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_42_0 = this;
                              stackOut_42_1 = -30305;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              if (bj.field_d[82]) {
                                stackOut_44_0 = this;
                                stackOut_44_1 = stackIn_44_1;
                                stackOut_44_2 = this.e((byte) -30);
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                break L7;
                              } else {
                                stackOut_43_0 = this;
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 1 + ((rk) this).field_S;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_45_2 = stackOut_43_2;
                                break L7;
                              }
                            }
                            this.b(stackIn_45_1, stackIn_45_2);
                            return true;
                          }
                        } else {
                          if (102 != param1) {
                            if (param1 == 103) {
                              this.b(-30305, ((rk) this).field_E.length());
                              return true;
                            } else {
                              if (-85 != param1) {
                                L8: {
                                  if (!bj.field_d[82]) {
                                    break L8;
                                  } else {
                                    if (-66 == param1) {
                                      this.g((byte) -76);
                                      return true;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (!bj.field_d[82]) {
                                    break L9;
                                  } else {
                                    if (66 == param1) {
                                      this.h((byte) -101);
                                      return true;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (!bj.field_d[82]) {
                                  break L6;
                                } else {
                                  if ((param1 ^ -1) != -68) {
                                    break L6;
                                  } else {
                                    this.h(118);
                                    return true;
                                  }
                                }
                              } else {
                                this.b(false);
                                return true;
                              }
                            }
                          } else {
                            this.b(-30305, 0);
                            return true;
                          }
                        }
                      } else {
                        if (0 < ((rk) this).field_S) {
                          L10: {
                            stackOut_19_0 = this;
                            stackOut_19_1 = -30305;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            if (bj.field_d[82]) {
                              stackOut_21_0 = this;
                              stackOut_21_1 = stackIn_21_1;
                              stackOut_21_2 = this.n(0);
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              stackIn_22_2 = stackOut_21_2;
                              break L10;
                            } else {
                              stackOut_20_0 = this;
                              stackOut_20_1 = stackIn_20_1;
                              stackOut_20_2 = -1 + ((rk) this).field_S;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              stackIn_22_2 = stackOut_20_2;
                              break L10;
                            }
                          }
                          this.b(stackIn_22_1, stackIn_22_2);
                          return true;
                        } else {
                          var5 = -114 / ((-22 - param0) / 49);
                          return false;
                        }
                      }
                    } else {
                      ((rk) this).m(0);
                      return true;
                    }
                  } else {
                    if (((rk) this).field_S != ((rk) this).field_M) {
                      this.f((byte) -65);
                      return true;
                    } else {
                      if (((rk) this).field_S < ((rk) this).field_E.length()) {
                        ((rk) this).field_M = 1 + ((rk) this).field_S;
                        this.f((byte) -50);
                        return true;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              var5 = -114 / ((-22 - param0) / 49);
              return false;
            }
          }
        }
        return false;
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 == ((rk) this).field_S) {
            return ((rk) this).field_S;
        }
        for (var2 = ((rk) this).field_S - 1; 0 < var2; var2--) {
            // if_icmpeq L50
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new String[]{"Get four of the same colour touching!", "The wildcard special item (multicoloured star) can be used in place of any other colour!", "Watch out! All shapes you match will now come back as solid shapes. Match four loose pieces of the same colour against the solid shape to get rid of it again.", "Did you know that if you get two or more matches at the same time, you get a special item?"};
        field_bb = "Suggest muting this player";
        field_U = "You have entered another game.";
        field_N = "To clear a solid shape, make another shape of the same colour against it.";
        field_V = -1;
    }
}
