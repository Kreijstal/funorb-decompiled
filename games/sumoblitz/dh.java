/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends wp {
    private long field_L;
    private int field_I;
    static float[] field_N;
    private boolean field_G;
    private int field_E;
    private long field_J;
    private int field_F;
    static float[] field_M;
    private int field_K;
    private boolean field_O;
    static int[] field_H;

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (param1 >= -42) {
            ((dh) this).field_G = true;
        }
        if (!super.a(param0, -128, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((dh) this).field_w instanceof de) {
            var8_int = ((de) (Object) ((dh) this).field_w).a(param4, (pk) this, ko.field_p, pi.field_e, -4059, param6);
            this.a(124, -1 == var8_int ? 0 : var8_int);
            var8 = wq.a(-17);
            ((dh) this).field_G = 250L > var8 - ((dh) this).field_L ? true : false;
            if (((dh) this).field_G) {
                ((dh) this).field_E = this.g(14236);
                ((dh) this).field_F = this.d(true);
                if ((((dh) this).field_F ^ -1) < -1) {
                    if (!(((dh) this).field_m.charAt(((dh) this).field_F + -1) != 32)) {
                        ((dh) this).field_F = ((dh) this).field_F - 1;
                    }
                }
                ((dh) this).field_K = ((dh) this).field_F;
            }
            ((dh) this).field_L = var8;
            return true;
        }
        return false;
    }

    private final void a(int param0, int param1) {
        if (param0 < 84) {
            ((dh) this).field_I = 55;
        }
        ((dh) this).field_F = param1;
        if (!(hw.field_b[81])) {
            ((dh) this).field_E = ((dh) this).field_F;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        if (param2) {
            field_N = null;
        }
        int var3 = param0 >>> -322954945;
        return (var3 + param0) / param1 + -var3;
    }

    public static void j(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
            field_N = null;
        }
    }

    private final String k(int param0) {
        if (param0 > -99) {
            ((dh) this).field_G = true;
        }
        int var2 = ((dh) this).field_E < ((dh) this).field_F ? ((dh) this).field_E : ((dh) this).field_F;
        int var3 = ((dh) this).field_F > ((dh) this).field_E ? ((dh) this).field_F : ((dh) this).field_E;
        return ((dh) this).field_m.substring(var2, var3);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.h((byte) -80);
                this.a(true, var2);
            } catch (Exception exception) {
            }
            if (param0 != -1) {
                ((dh) this).field_O = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3 = 0;
        if (!param0) {
            ((dh) this).field_L = -107L;
        }
        if (!(0 == (((dh) this).field_I ^ -1))) {
            var3 = ((dh) this).field_I + -((dh) this).field_m.length();
            if (!(var3 < 0)) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((dh) this).field_F != ((dh) this).field_m.length()) {
            ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_F) + param1 + ((dh) this).field_m.substring(((dh) this).field_F, ((dh) this).field_m.length());
        } else {
            ((dh) this).field_m = ((dh) this).field_m + param1;
        }
        ((dh) this).field_F = ((dh) this).field_F + param1.length();
        ((dh) this).field_E = ((dh) this).field_F;
        ((dh) this).g((byte) 88);
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((dh) this).field_F == 0) {
            return ((dh) this).field_F;
        }
        if (param0 != 14236) {
            return 31;
        }
        for (var2 = -1 + ((dh) this).field_F; var2 > 0; var2--) {
            // if_icmpeq L58
        }
        return var2;
    }

    dh(String param0, qm param1, int param2) {
        super(param0, param1);
        ((dh) this).field_L = 0L;
        ((dh) this).field_G = false;
        ((dh) this).field_K = -1;
        ((dh) this).field_I = param2;
        ((dh) this).field_w = ks.field_x.field_j;
        ((dh) this).a(true, param0, (byte) 118);
        ((dh) this).field_O = true;
        ((dh) this).field_J = wq.a(-9);
    }

    final void a(boolean param0, String param1, byte param2) {
        if (param1 == null) {
            param1 = "";
        }
        ((dh) this).field_m = param1;
        int var4 = param1.length();
        if ((((dh) this).field_I ^ -1) != 0) {
            if (!(var4 <= ((dh) this).field_I)) {
                ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_I);
            }
        }
        ((dh) this).field_E = ((dh) this).field_m.length();
        ((dh) this).field_F = ((dh) this).field_m.length();
        if (!(param0)) {
            ((dh) this).g((byte) 103);
        }
        if (param2 < 3) {
            field_N = null;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        ((dh) this).field_J = wq.a(-6);
        if (param1 == 60) {
          return false;
        } else {
          if (62 != param1) {
            if (param2 > 9) {
              L0: {
                if (32 > param1) {
                  break L0;
                } else {
                  if (126 >= param1) {
                    L1: {
                      if (((dh) this).field_F == ((dh) this).field_E) {
                        break L1;
                      } else {
                        this.h((byte) -71);
                        break L1;
                      }
                    }
                    L2: {
                      L3: {
                        if (-1 == ((dh) this).field_I) {
                          break L3;
                        } else {
                          if (((dh) this).field_m.length() < ((dh) this).field_I) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (((dh) this).field_F >= ((dh) this).field_m.length()) {
                          ((dh) this).field_m = ((dh) this).field_m + param1;
                          ((dh) this).field_F = ((dh) this).field_m.length();
                          ((dh) this).field_E = ((dh) this).field_m.length();
                          break L4;
                        } else {
                          ((dh) this).field_m = ((dh) this).field_m.substring(0, ((dh) this).field_F) + param1 + ((dh) this).field_m.substring(((dh) this).field_F, ((dh) this).field_m.length());
                          ((dh) this).field_F = ((dh) this).field_F + 1;
                          ((dh) this).field_E = ((dh) this).field_F;
                          break L4;
                        }
                      }
                      ((dh) this).g((byte) 124);
                      break L2;
                    }
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
              L5: {
                if ((param3 ^ -1) == -86) {
                  if (((dh) this).field_F == ((dh) this).field_E) {
                    if (0 >= ((dh) this).field_F) {
                      break L5;
                    } else {
                      ((dh) this).field_E = -1 + ((dh) this).field_F;
                      this.h((byte) 127);
                      return true;
                    }
                  } else {
                    this.h((byte) 122);
                    return true;
                  }
                } else {
                  if (101 != param3) {
                    if (param3 == 13) {
                      ((dh) this).i(-1);
                      return true;
                    } else {
                      if (96 == param3) {
                        if (((dh) this).field_F > 0) {
                          L6: {
                            stackOut_43_0 = this;
                            stackOut_43_1 = 127;
                            stackIn_45_0 = stackOut_43_0;
                            stackIn_45_1 = stackOut_43_1;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            if (hw.field_b[82]) {
                              stackOut_45_0 = this;
                              stackOut_45_1 = stackIn_45_1;
                              stackOut_45_2 = this.g(14236);
                              stackIn_46_0 = stackOut_45_0;
                              stackIn_46_1 = stackOut_45_1;
                              stackIn_46_2 = stackOut_45_2;
                              break L6;
                            } else {
                              stackOut_44_0 = this;
                              stackOut_44_1 = stackIn_44_1;
                              stackOut_44_2 = -1 + ((dh) this).field_F;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_46_2 = stackOut_44_2;
                              break L6;
                            }
                          }
                          this.a(stackIn_46_1, stackIn_46_2);
                          return true;
                        } else {
                          break L5;
                        }
                      } else {
                        if (param3 != 97) {
                          if (-103 == param3) {
                            this.a(93, 0);
                            return true;
                          } else {
                            if (param3 == 103) {
                              this.a(121, ((dh) this).field_m.length());
                              return true;
                            } else {
                              if (-85 == param3) {
                                this.e((byte) -106);
                                return true;
                              } else {
                                L7: {
                                  if (!hw.field_b[82]) {
                                    break L7;
                                  } else {
                                    if (param3 != 65) {
                                      break L7;
                                    } else {
                                      this.f(96);
                                      return true;
                                    }
                                  }
                                }
                                L8: {
                                  if (!hw.field_b[82]) {
                                    break L8;
                                  } else {
                                    if (-67 == (param3 ^ -1)) {
                                      this.e(false);
                                      return true;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (!hw.field_b[82]) {
                                  break L5;
                                } else {
                                  if ((param3 ^ -1) == -68) {
                                    this.h(-1);
                                    return true;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (((dh) this).field_F >= ((dh) this).field_m.length()) {
                            break L5;
                          } else {
                            L9: {
                              stackOut_20_0 = this;
                              stackOut_20_1 = 111;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (!hw.field_b[82]) {
                                stackOut_22_0 = this;
                                stackOut_22_1 = stackIn_22_1;
                                stackOut_22_2 = ((dh) this).field_F - -1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                stackIn_23_2 = stackOut_22_2;
                                break L9;
                              } else {
                                stackOut_21_0 = this;
                                stackOut_21_1 = stackIn_21_1;
                                stackOut_21_2 = this.d(true);
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                stackIn_23_2 = stackOut_21_2;
                                break L9;
                              }
                            }
                            this.a(stackIn_23_1, stackIn_23_2);
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    if (((dh) this).field_F != ((dh) this).field_E) {
                      this.h((byte) 123);
                      return true;
                    } else {
                      if (((dh) this).field_F < ((dh) this).field_m.length()) {
                        ((dh) this).field_E = ((dh) this).field_F - -1;
                        this.h((byte) -69);
                        return true;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((dh) this).field_F != ((dh) this).field_E) {
            var2 = ((dh) this).field_E >= ((dh) this).field_F ? ((dh) this).field_F : ((dh) this).field_E;
            var3 = ((dh) this).field_E < ((dh) this).field_F ? ((dh) this).field_F : ((dh) this).field_E;
            ((dh) this).field_F = var2;
            ((dh) this).field_E = var2;
            ((dh) this).field_m = ((dh) this).field_m.substring(0, var2) + ((dh) this).field_m.substring(var3, ((dh) this).field_m.length());
            ((dh) this).g((byte) 81);
        }
        var2 = -67 / ((85 - param0) / 37);
    }

    private final void e(byte param0) {
        if (!(!(((dh) this).field_o instanceof pw))) {
            ((pw) (Object) ((dh) this).field_o).a((dh) this, -66);
        }
        if (param0 != -106) {
            ((dh) this).g((byte) -55);
        }
    }

    private final void f(int param0) {
        if (param0 != 96) {
            return;
        }
        this.e(false);
        this.h((byte) 123);
    }

    private final void f(byte param0) {
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!((dh) this).field_O) {
          ((dh) this).field_s = 0;
          ((dh) this).field_n = 0;
          return;
        } else {
          if (((dh) this).field_w instanceof de) {
            L0: {
              var9 = (de) (Object) ((dh) this).field_w;
              var3 = var9.b(-3, (pk) this);
              var4 = var3.a((byte) -15);
              if (param0 == -44) {
                break L0;
              } else {
                field_H = null;
                break L0;
              }
            }
            var5 = var9.a(param0 ^ -120, (pk) this);
            var6 = var9.a(14763) >> 1411058977;
            if (-var6 + var5 <= var4) {
              L1: {
                var7 = ((dh) this).field_s + var3.a((byte) 113, ((dh) this).field_F);
                if (-var6 + var5 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    ((dh) this).field_s = -var7 - -var6 + ((dh) this).field_s;
                    break L1;
                  }
                } else {
                  ((dh) this).field_s = -var7 - (-var5 + (var6 - ((dh) this).field_s));
                  break L1;
                }
              }
              L2: {
                if (((dh) this).field_s <= 0) {
                  if (var6 + -var5 <= ((dh) this).field_s) {
                    break L2;
                  } else {
                    ((dh) this).field_s = -var5 - -var6;
                    break L2;
                  }
                } else {
                  ((dh) this).field_s = 0;
                  break L2;
                }
              }
              return;
            } else {
              ((dh) this).field_n = 0;
              ((dh) this).field_s = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void i(int param0) {
        ((dh) this).field_F = 0;
        ((dh) this).field_E = 0;
        ((dh) this).field_m = "";
        ((dh) this).g((byte) 104);
        if (param0 != -1) {
            ((dh) this).field_O = true;
        }
    }

    private final void e(boolean param0) {
        String var2 = this.k(-115);
        if (!((var2.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(-116)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0) {
            this.f((byte) -38);
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        de var6 = null;
        int var7 = 0;
        super.a(param0, 62, param2, param3);
        int var5 = 109 % ((-25 - param1) / 45);
        this.f((byte) -44);
        if (!(((dh) this).field_l != 1)) {
            if (!(!(((dh) this).field_w instanceof de))) {
                var6 = (de) (Object) ((dh) this).field_w;
                var7 = var6.a(param0, (pk) this, ko.field_p, pi.field_e, -4059, param3);
                if (var7 != -1) {
                    if (((dh) this).field_G) {
                        if (((dh) this).field_K > var7) {
                            if (((dh) this).field_E < var7) {
                                var7 = ((dh) this).field_K;
                            }
                        }
                    }
                    ((dh) this).field_F = var7;
                }
            }
            ((dh) this).field_J = wq.a(-93);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        de var8 = null;
        long var6 = 0L;
        if (null != ((dh) this).field_w) {
            if (!(-1 != (param3 ^ -1))) {
                ((dh) this).field_w.a((pk) this, param1, 5592405, ((dh) this).field_x, param0);
                if (((dh) this).field_w instanceof de) {
                    var8 = (de) (Object) ((dh) this).field_w;
                    if (((dh) this).field_F != ((dh) this).field_E) {
                        var8.a(param0, ((dh) this).field_E, 0, ((dh) this).field_F, (pk) this, param1);
                    }
                    var6 = wq.a(-6);
                    if (500L > (-((dh) this).field_J + var6) % 1000L) {
                        var8.a(1, param0, param1, ((dh) this).field_F, (pk) this);
                    }
                }
            }
        }
        if (param2 >= -35) {
            int discarded$0 = this.d(false);
        }
    }

    private final int d(boolean param0) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
            this.f((byte) -32);
        }
        int var2 = ((dh) this).field_m.length();
        if (((dh) this).field_F == var2) {
            return ((dh) this).field_F;
        }
        for (var3 = ((dh) this).field_F + 1; var2 > var3; var3++) {
            // if_icmpeq L73
        }
        return var3;
    }

    void g(byte param0) {
        if (((dh) this).field_o instanceof pw) {
            ((pw) (Object) ((dh) this).field_o).a((dh) this, (byte) -128);
        }
        if (param0 <= 78) {
            dh.j(5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; (var2 ^ -1) > -16385; var2++) {
            field_N[var2] = (float)Math.sin(var0 * (double)var2);
            field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
