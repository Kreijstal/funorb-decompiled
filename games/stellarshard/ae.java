/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ae extends ig {
    private boolean field_L;
    private int field_H;
    private long field_K;
    private int field_M;
    static ha field_N;
    private boolean field_G;
    private long field_J;
    private int field_F;
    private int field_I;

    final static ub a(String param0, String param1, pf param2, int param3, pf param4) {
        if (param3 >= -105) {
            field_N = null;
        }
        int var5 = param2.b(param0, (byte) -118);
        int var6 = param2.a(var5, param1, (byte) -11);
        return pc.a(var5, param4, param2, (byte) -39, var6);
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (!(((ae) this).field_M == -1)) {
            var3 = ((ae) this).field_M + -((ae) this).field_m.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((ae) this).field_H != ((ae) this).field_m.length()) {
            ((ae) this).field_m = ((ae) this).field_m.substring(0, ((ae) this).field_H) + param0 + ((ae) this).field_m.substring(((ae) this).field_H, ((ae) this).field_m.length());
        } else {
            ((ae) this).field_m = ((ae) this).field_m + param0;
        }
        if (param1 != 97) {
            this.a(12, -91);
        }
        ((ae) this).field_H = ((ae) this).field_H + param0.length();
        ((ae) this).field_I = ((ae) this).field_H;
        ((ae) this).l(0);
    }

    private final void a(int param0, int param1) {
        ((ae) this).field_H = param1;
        if (!si.field_jb[param0]) {
            ((ae) this).field_I = ((ae) this).field_H;
        }
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, (byte) 38, param6)) {
            if (((ae) this).field_u instanceof pj) {
                var8_int = ((pj) (Object) ((ae) this).field_u).a(-109, (rj) this, param4, eb.field_a, param6, ni.field_e);
                this.a(81, (var8_int ^ -1) != 0 ? var8_int : 0);
                var8 = ih.a((byte) -98);
                ((ae) this).field_L = 250L > -((ae) this).field_K + var8 ? true : false;
                if (!(!((ae) this).field_L)) {
                    ((ae) this).field_I = this.n(-1);
                    ((ae) this).field_H = this.j(-4238);
                    if (0 < ((ae) this).field_H) {
                        if (!(((ae) this).field_m.charAt(((ae) this).field_H - 1) != 32)) {
                            ((ae) this).field_H = ((ae) this).field_H - 1;
                        }
                    }
                    ((ae) this).field_F = ((ae) this).field_H;
                }
                ((ae) this).field_K = var8;
                return true;
            }
        }
        if (param5 <= 24) {
            return true;
        }
        return false;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((ae) this).field_I != ((ae) this).field_H) {
            var2 = ((ae) this).field_H > ((ae) this).field_I ? ((ae) this).field_I : ((ae) this).field_H;
            var3 = ((ae) this).field_H <= ((ae) this).field_I ? ((ae) this).field_I : ((ae) this).field_H;
            ((ae) this).field_I = var2;
            ((ae) this).field_H = var2;
            ((ae) this).field_m = ((ae) this).field_m.substring(0, var2) + ((ae) this).field_m.substring(var3, ((ae) this).field_m.length());
            ((ae) this).l(param0 + 0);
        }
        if (param0 != 0) {
            field_N = null;
        }
    }

    void l(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!(!(((ae) this).field_v instanceof ec))) {
            ((ec) (Object) ((ae) this).field_v).a((ae) this, param0 + 0);
        }
    }

    private final void d(byte param0) {
        this.g(0);
        this.i(0);
        if (param0 != -20) {
            int discarded$0 = this.n(120);
        }
    }

    private final void k(int param0) {
        if (param0 != -1) {
            ((ae) this).field_H = 78;
        }
        if (!(!(((ae) this).field_v instanceof ec))) {
            ((ec) (Object) ((ae) this).field_v).b((ae) this, 0);
        }
    }

    final void d(boolean param0) {
        ((ae) this).field_H = 0;
        if (!param0) {
            this.i(68);
        }
        ((ae) this).field_m = "";
        ((ae) this).field_I = 0;
        ((ae) this).l(0);
    }

    private final void o(int param0) {
        int var8 = stellarshard.field_B;
        if (!((ae) this).field_G) {
            ((ae) this).field_l = 0;
            ((ae) this).field_n = 0;
            return;
        }
        if (!(((ae) this).field_u instanceof pj)) {
            return;
        }
        if (param0 != -9104) {
            return;
        }
        pj var9 = (pj) (Object) ((ae) this).field_u;
        vk var3 = var9.b((rj) this, (byte) 107);
        int var4 = var3.a(false);
        int var5 = var9.a(-27246, (rj) this);
        int var6 = var9.a((byte) -73) >> 424407713;
        if (!(var5 - var6 <= var4)) {
            ((ae) this).field_l = 0;
            ((ae) this).field_n = 0;
            return;
        }
        int var7 = ((ae) this).field_l + var3.b(((ae) this).field_H, 49);
        if (var7 > var5 + -var6) {
            ((ae) this).field_l = ((ae) this).field_l - var6 - (-var5 + var7);
        } else {
            if (var6 > var7) {
                ((ae) this).field_l = ((ae) this).field_l + -var7 + var6;
            }
        }
        if (-1 > (((ae) this).field_l ^ -1)) {
            ((ae) this).field_l = 0;
        } else {
            if (!(((ae) this).field_l >= var6 + -var5)) {
                ((ae) this).field_l = var6 + -var5;
            }
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        pj var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.o(-9104);
        if (-2 == (((ae) this).field_o ^ -1)) {
            if (((ae) this).field_u instanceof pj) {
                var5 = (pj) (Object) ((ae) this).field_u;
                var6 = var5.a(73, (rj) this, param2, eb.field_a, param0, ni.field_e);
                if (!(-1 == var6)) {
                    if (((ae) this).field_L) {
                        if (var6 < ((ae) this).field_F) {
                            if (var6 > ((ae) this).field_I) {
                                var6 = ((ae) this).field_F;
                            }
                        }
                    }
                    ((ae) this).field_H = var6;
                }
            }
            ((ae) this).field_J = ih.a((byte) -98);
        }
    }

    public static void m(int param0) {
        field_N = null;
        if (param0 < 110) {
            Object var2 = null;
            ae.a(-3, (pf) null);
        }
    }

    final static void a(int param0, pf param1) {
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        ha var10 = null;
        var7 = stellarshard.field_B;
        var8 = new ha(param1.a("logo.fo3d", "", (byte) -12));
        var10 = var8;
        var3 = var10.f(4);
        var10.j(8);
        e.field_d = uh.a(var10, -1);
        sj.field_B = new n[var3];
        bi.field_s = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var10.g((byte) 95);
            var9 = 0;
            var4 = var9;
            if (param0 > 4) {
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var5 = sj.field_B[var9];
                  var5.a(-12966, 6, 1, 6, 6);
                  var5.b((byte) -53);
                  var6 = new int[]{var5.field_F + var5.field_t >> -1531242687, var5.field_x - -var5.field_G >> -588309407, var5.field_u - -var5.field_k >> 1605485377};
                  bi.field_s[var9] = var6;
                  var5.a((byte) 108, -var6[1], -var6[2], -var6[0]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            sj.field_B[var4] = pf.a(16, var8);
            var4++;
            continue L0;
          }
        }
    }

    ae(String param0, lf param1, int param2) {
        super(param0, param1);
        ((ae) this).field_L = false;
        ((ae) this).field_K = 0L;
        ((ae) this).field_F = -1;
        ((ae) this).field_M = param2;
        ((ae) this).field_u = n.field_i.field_d;
        ((ae) this).a((byte) 20, param0, true);
        ((ae) this).field_G = true;
        ((ae) this).field_J = ih.a((byte) -98);
    }

    private final void h(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 < -53) {
                break L0;
              } else {
                this.k(-83);
                break L0;
              }
            }
            try {
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.i(0);
              this.a(var2_ref, (byte) 97);
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

    final void a(int param0, byte param1, int param2, int param3) {
        pj var8 = null;
        long var6 = 0L;
        if (param1 != -57) {
            ((ae) this).field_L = true;
        }
        if (null != ((ae) this).field_u) {
            if (0 == param0) {
                ((ae) this).field_u.a(((ae) this).field_E, param3, param2, (rj) this, 4549);
                if (((ae) this).field_u instanceof pj) {
                    var8 = (pj) (Object) ((ae) this).field_u;
                    if (!(((ae) this).field_H == ((ae) this).field_I)) {
                        var8.a((rj) this, ((ae) this).field_H, param2, 0, param3, ((ae) this).field_I);
                    }
                    var6 = ih.a((byte) -98);
                    if (500L > (var6 - ((ae) this).field_J) % 1000L) {
                        var8.a(((ae) this).field_H, false, param2, (rj) this, param3);
                    }
                }
            }
        }
    }

    final void a(byte param0, String param1, boolean param2) {
        if (!(param1 != null)) {
            param1 = "";
        }
        ((ae) this).field_m = param1;
        int var4 = param1.length();
        if (-1 != ((ae) this).field_M) {
            if (!(var4 <= ((ae) this).field_M)) {
                ((ae) this).field_m = ((ae) this).field_m.substring(0, ((ae) this).field_M);
            }
        }
        ((ae) this).field_I = ((ae) this).field_m.length();
        ((ae) this).field_H = ((ae) this).field_m.length();
        if (param0 != 20) {
            ((ae) this).field_G = false;
        }
        if (!param2) {
            ((ae) this).l(0);
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          if (param0 == 29657) {
            break L0;
          } else {
            int discarded$1 = this.n(-114);
            break L0;
          }
        }
        L1: {
          ((ae) this).field_J = ih.a((byte) -98);
          if (param2 == 60) {
            break L1;
          } else {
            if (param2 == 62) {
              break L1;
            } else {
              L2: {
                if (param2 < 32) {
                  break L2;
                } else {
                  if (126 >= param2) {
                    L3: {
                      if (((ae) this).field_H == ((ae) this).field_I) {
                        break L3;
                      } else {
                        this.i(0);
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if (((ae) this).field_M == -1) {
                          break L5;
                        } else {
                          if (((ae) this).field_m.length() >= ((ae) this).field_M) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((ae) this).field_H < ((ae) this).field_m.length()) {
                          ((ae) this).field_m = ((ae) this).field_m.substring(0, ((ae) this).field_H) + param2 + ((ae) this).field_m.substring(((ae) this).field_H, ((ae) this).field_m.length());
                          ((ae) this).field_H = ((ae) this).field_H + 1;
                          ((ae) this).field_I = ((ae) this).field_H;
                          break L6;
                        } else {
                          ((ae) this).field_m = ((ae) this).field_m + param2;
                          ((ae) this).field_H = ((ae) this).field_m.length();
                          ((ae) this).field_I = ((ae) this).field_m.length();
                          break L6;
                        }
                      }
                      ((ae) this).l(0);
                      break L4;
                    }
                    return true;
                  } else {
                    break L2;
                  }
                }
              }
              L7: {
                if (param1 != 85) {
                  if (-102 != (param1 ^ -1)) {
                    if (param1 == 13) {
                      ((ae) this).d(true);
                      return true;
                    } else {
                      if ((param1 ^ -1) == -97) {
                        if ((((ae) this).field_H ^ -1) < -1) {
                          L8: {
                            stackOut_47_0 = this;
                            stackOut_47_1 = 81;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            if (!si.field_jb[82]) {
                              stackOut_49_0 = this;
                              stackOut_49_1 = stackIn_49_1;
                              stackOut_49_2 = -1 + ((ae) this).field_H;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              stackIn_50_2 = stackOut_49_2;
                              break L8;
                            } else {
                              stackOut_48_0 = this;
                              stackOut_48_1 = stackIn_48_1;
                              stackOut_48_2 = this.n(-1);
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_50_2 = stackOut_48_2;
                              break L8;
                            }
                          }
                          this.a(stackIn_50_1, stackIn_50_2);
                          return true;
                        } else {
                          break L7;
                        }
                      } else {
                        if ((param1 ^ -1) != -98) {
                          if (102 != param1) {
                            if ((param1 ^ -1) == -104) {
                              this.a(81, ((ae) this).field_m.length());
                              return true;
                            } else {
                              if (param1 == 84) {
                                this.k(-1);
                                return true;
                              } else {
                                L9: {
                                  if (!si.field_jb[82]) {
                                    break L9;
                                  } else {
                                    if ((param1 ^ -1) == -66) {
                                      this.d((byte) -20);
                                      return true;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (!si.field_jb[82]) {
                                    break L10;
                                  } else {
                                    if ((param1 ^ -1) == -67) {
                                      this.g(0);
                                      return true;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (!si.field_jb[82]) {
                                  break L7;
                                } else {
                                  if (67 != param1) {
                                    break L7;
                                  } else {
                                    this.h(-78);
                                    return true;
                                  }
                                }
                              }
                            }
                          } else {
                            this.a(81, 0);
                            return true;
                          }
                        } else {
                          if (((ae) this).field_H >= ((ae) this).field_m.length()) {
                            break L7;
                          } else {
                            L11: {
                              stackOut_24_0 = this;
                              stackOut_24_1 = param0 + -29576;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              if (si.field_jb[82]) {
                                stackOut_26_0 = this;
                                stackOut_26_1 = stackIn_26_1;
                                stackOut_26_2 = this.j(param0 + -33895);
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                stackIn_27_2 = stackOut_26_2;
                                break L11;
                              } else {
                                stackOut_25_0 = this;
                                stackOut_25_1 = stackIn_25_1;
                                stackOut_25_2 = ((ae) this).field_H + 1;
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_27_1 = stackOut_25_1;
                                stackIn_27_2 = stackOut_25_2;
                                break L11;
                              }
                            }
                            this.a(stackIn_27_1, stackIn_27_2);
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    if (((ae) this).field_H != ((ae) this).field_I) {
                      this.i(0);
                      return true;
                    } else {
                      if (((ae) this).field_H < ((ae) this).field_m.length()) {
                        ((ae) this).field_I = ((ae) this).field_H - -1;
                        this.i(0);
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  if (((ae) this).field_I == ((ae) this).field_H) {
                    if (0 >= ((ae) this).field_H) {
                      break L7;
                    } else {
                      ((ae) this).field_I = -1 + ((ae) this).field_H;
                      this.i(0);
                      return true;
                    }
                  } else {
                    this.i(0);
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

    private final int j(int param0) {
        int var3 = 0;
        int var4 = stellarshard.field_B;
        if (param0 != -4238) {
            Object var5 = null;
            ((ae) this).a((byte) 68, (String) null, true);
        }
        int var2 = ((ae) this).field_m.length();
        if (!(((ae) this).field_H != var2)) {
            return ((ae) this).field_H;
        }
        for (var3 = 1 + ((ae) this).field_H; var2 > var3; var3++) {
            // if_icmpeq L86
        }
        return var3;
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        if (!(((ae) this).field_H != 0)) {
            return ((ae) this).field_H;
        }
        for (var2 = param0 + ((ae) this).field_H; (var2 ^ -1) < -1; var2--) {
            // if_icmpeq L54
        }
        return var2;
    }

    private final void g(int param0) {
        String var2 = this.p(79);
        if (var2.length() > param0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(44)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String p(int param0) {
        int var2 = ((ae) this).field_H > ((ae) this).field_I ? ((ae) this).field_I : ((ae) this).field_H;
        int var4 = 59 / ((-66 - param0) / 56);
        int var3 = ((ae) this).field_H > ((ae) this).field_I ? ((ae) this).field_H : ((ae) this).field_I;
        return ((ae) this).field_m.substring(var2, var3);
    }

    static {
    }
}
