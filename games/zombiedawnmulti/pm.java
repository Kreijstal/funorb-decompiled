/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pm extends gn {
    private long field_T;
    static String field_P;
    static k field_R;
    private int field_O;
    static int field_Q;
    private boolean field_U;
    private int field_V;
    private long field_X;
    private boolean field_M;
    private int field_W;
    private int field_S;
    static ri field_N;

    final boolean a(int param0, char param1, cf param2, int param3) {
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        L0: {
          ((pm) this).field_T = bl.a((byte) 45);
          if (param1 == 60) {
            break L0;
          } else {
            if (param1 == 62) {
              break L0;
            } else {
              L1: {
                if (param1 < 32) {
                  break L1;
                } else {
                  if (param1 > 126) {
                    break L1;
                  } else {
                    L2: {
                      if (((pm) this).field_S == ((pm) this).field_O) {
                        break L2;
                      } else {
                        this.c(false);
                        break L2;
                      }
                    }
                    L3: {
                      if (0 == (((pm) this).field_W ^ -1)) {
                        break L3;
                      } else {
                        if (((pm) this).field_j.length() < ((pm) this).field_W) {
                          break L3;
                        } else {
                          return true;
                        }
                      }
                    }
                    L4: {
                      if (((pm) this).field_O >= ((pm) this).field_j.length()) {
                        ((pm) this).field_j = ((pm) this).field_j + param1;
                        ((pm) this).field_O = ((pm) this).field_j.length();
                        ((pm) this).field_S = ((pm) this).field_j.length();
                        break L4;
                      } else {
                        ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_O) + param1 + ((pm) this).field_j.substring(((pm) this).field_O, ((pm) this).field_j.length());
                        ((pm) this).field_O = ((pm) this).field_O + 1;
                        ((pm) this).field_S = ((pm) this).field_O;
                        break L4;
                      }
                    }
                    ((pm) this).j(param3 ^ -14400);
                    return true;
                  }
                }
              }
              L5: {
                if (param0 == 85) {
                  if (((pm) this).field_O == ((pm) this).field_S) {
                    if (((pm) this).field_O <= 0) {
                      break L5;
                    } else {
                      ((pm) this).field_S = -1 + ((pm) this).field_O;
                      this.c(false);
                      return true;
                    }
                  } else {
                    this.c(false);
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) == -102) {
                    if (((pm) this).field_O == ((pm) this).field_S) {
                      if (((pm) this).field_O < ((pm) this).field_j.length()) {
                        ((pm) this).field_S = ((pm) this).field_O + 1;
                        this.c(false);
                        return true;
                      } else {
                        break L5;
                      }
                    } else {
                      this.c(false);
                      return true;
                    }
                  } else {
                    if (param0 != 13) {
                      if ((param0 ^ -1) != -97) {
                        if (97 != param0) {
                          if (param0 != 102) {
                            if (-104 == param0) {
                              this.b(false, ((pm) this).field_j.length());
                              return true;
                            } else {
                              if (84 == param0) {
                                this.h(97);
                                return true;
                              } else {
                                L6: {
                                  if (!lc.field_m[82]) {
                                    break L6;
                                  } else {
                                    if (-66 == param0) {
                                      this.f(102);
                                      return true;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (!lc.field_m[82]) {
                                    break L7;
                                  } else {
                                    if ((param0 ^ -1) == -67) {
                                      this.i((byte) -60);
                                      return true;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (!lc.field_m[82]) {
                                  break L5;
                                } else {
                                  if (param0 != 67) {
                                    break L5;
                                  } else {
                                    this.i(param3 + 6458);
                                    return true;
                                  }
                                }
                              }
                            }
                          } else {
                            this.b(false, 0);
                            return true;
                          }
                        } else {
                          if (((pm) this).field_O >= ((pm) this).field_j.length()) {
                            break L5;
                          } else {
                            L8: {
                              stackOut_27_0 = this;
                              stackOut_27_1 = 0;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              if (!lc.field_m[82]) {
                                stackOut_29_0 = this;
                                stackOut_29_1 = stackIn_29_1;
                                stackOut_29_2 = ((pm) this).field_O + 1;
                                stackIn_30_0 = stackOut_29_0;
                                stackIn_30_1 = stackOut_29_1;
                                stackIn_30_2 = stackOut_29_2;
                                break L8;
                              } else {
                                stackOut_28_0 = this;
                                stackOut_28_1 = stackIn_28_1;
                                stackOut_28_2 = this.g(param3 + 6329);
                                stackIn_30_0 = stackOut_28_0;
                                stackIn_30_1 = stackOut_28_1;
                                stackIn_30_2 = stackOut_28_2;
                                break L8;
                              }
                            }
                            this.b(stackIn_30_1 != 0, stackIn_30_2);
                            return true;
                          }
                        }
                      } else {
                        if ((((pm) this).field_O ^ -1) >= -1) {
                          break L5;
                        } else {
                          L9: {
                            stackOut_21_0 = this;
                            stackOut_21_1 = 0;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            if (lc.field_m[82]) {
                              stackOut_23_0 = this;
                              stackOut_23_1 = stackIn_23_1;
                              stackOut_23_2 = this.h((byte) -110);
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              stackIn_24_2 = stackOut_23_2;
                              break L9;
                            } else {
                              stackOut_22_0 = this;
                              stackOut_22_1 = stackIn_22_1;
                              stackOut_22_2 = -1 + ((pm) this).field_O;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              stackIn_24_2 = stackOut_22_2;
                              break L9;
                            }
                          }
                          this.b(stackIn_24_1 != 0, stackIn_24_2);
                          return true;
                        }
                      }
                    } else {
                      ((pm) this).b(true);
                      return true;
                    }
                  }
                }
              }
              if (param3 == -6208) {
                return false;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    public static void d(boolean param0) {
        if (param0) {
            field_P = null;
        }
        field_R = null;
        field_P = null;
        field_N = null;
    }

    private final void i(byte param0) {
        if (param0 != -60) {
            field_R = null;
        }
        String var2 = this.k(-112);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(param0 ^ 67)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (((pm) this).field_h instanceof rk) {
                var8_int = ((rk) (Object) ((pm) this).field_h).b(param5, param6, bd.field_g, bo.field_d, 98, (cf) this);
                this.b(false, -1 != var8_int ? var8_int : 0);
                var8 = bl.a((byte) 115);
                ((pm) this).field_M = (-((pm) this).field_X + var8 ^ -1L) > -251L ? true : false;
                if (!(!((pm) this).field_M)) {
                    ((pm) this).field_S = this.h((byte) -110);
                    ((pm) this).field_O = this.g(114);
                    if (-1 > (((pm) this).field_O ^ -1)) {
                        if (!(32 != ((pm) this).field_j.charAt(-1 + ((pm) this).field_O))) {
                            ((pm) this).field_O = ((pm) this).field_O - 1;
                        }
                    }
                    ((pm) this).field_V = ((pm) this).field_O;
                }
                ((pm) this).field_X = var8;
                return true;
            }
        }
        return false;
    }

    final void b(boolean param0) {
        ((pm) this).field_S = 0;
        if (!param0) {
            ((pm) this).field_V = 88;
        }
        ((pm) this).field_j = "";
        ((pm) this).field_O = 0;
        ((pm) this).j(8192);
    }

    private final int g(int param0) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 110) {
            pm.d(true);
        }
        int var2 = ((pm) this).field_j.length();
        if (!(((pm) this).field_O != var2)) {
            return ((pm) this).field_O;
        }
        for (var3 = 1 + ((pm) this).field_O; var3 < var2; var3++) {
            // if_icmpeq L75
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3) {
        rk var8 = null;
        long var6 = 0L;
        if (param0 != -2) {
            ((pm) this).field_O = -67;
        }
        if (null != ((pm) this).field_h) {
            if (!(0 != param2)) {
                ((pm) this).field_h.a(((pm) this).field_F, param1, -15112, param3, (cf) this);
                if (!(!(((pm) this).field_h instanceof rk))) {
                    var8 = (rk) (Object) ((pm) this).field_h;
                    if (!(((pm) this).field_S == ((pm) this).field_O)) {
                        var8.a(((pm) this).field_S, param1, ((pm) this).field_O, param3, param0 ^ -93, (cf) this);
                    }
                    var6 = bl.a((byte) 56);
                    if (!(500L <= (-((pm) this).field_T + var6) % 1000L)) {
                        var8.a((cf) this, (byte) 2, param3, ((pm) this).field_O, param1);
                    }
                }
            }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((pm) this).field_S == ((pm) this).field_O)) {
            var2 = ((pm) this).field_O <= ((pm) this).field_S ? ((pm) this).field_O : ((pm) this).field_S;
            var3 = ((pm) this).field_O > ((pm) this).field_S ? ((pm) this).field_O : ((pm) this).field_S;
            ((pm) this).field_S = var2;
            ((pm) this).field_O = var2;
            ((pm) this).field_j = ((pm) this).field_j.substring(0, var2) + ((pm) this).field_j.substring(var3, ((pm) this).field_j.length());
            ((pm) this).j(8192);
        }
        if (param0) {
            ((pm) this).field_V = 105;
        }
    }

    private final void g(byte param0) {
        mp var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rk var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pm) this).field_U) {
          if (((pm) this).field_h instanceof rk) {
            L0: {
              var9 = (rk) (Object) ((pm) this).field_h;
              var3 = var9.a((cf) this, -112);
              if (param0 < -60) {
                break L0;
              } else {
                ((pm) this).field_W = -107;
                break L0;
              }
            }
            var4 = var3.b(101);
            var5 = var9.a((cf) this, true);
            var6 = var9.a(0) >> -1925733471;
            if (var4 < var5 - var6) {
              ((pm) this).field_z = 0;
              ((pm) this).field_q = 0;
              return;
            } else {
              L1: {
                var7 = ((pm) this).field_z - -var3.a(52224, ((pm) this).field_O);
                if (var5 + -var6 >= var7) {
                  if (var7 < var6) {
                    ((pm) this).field_z = ((pm) this).field_z - -var6 + -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((pm) this).field_z = ((pm) this).field_z + (-var7 - (-var5 + var6));
                  break L1;
                }
              }
              L2: {
                if (-1 > (((pm) this).field_z ^ -1)) {
                  ((pm) this).field_z = 0;
                  break L2;
                } else {
                  if (-var5 + var6 > ((pm) this).field_z) {
                    ((pm) this).field_z = -var5 - -var6;
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
        } else {
          ((pm) this).field_z = 0;
          ((pm) this).field_q = 0;
          return;
        }
    }

    pm(String param0, bj param1, int param2) {
        super(param0, param1);
        ((pm) this).field_M = false;
        ((pm) this).field_V = -1;
        ((pm) this).field_X = 0L;
        ((pm) this).field_W = param2;
        ((pm) this).field_h = ra.field_o.field_o;
        ((pm) this).a(true, param0, (byte) 108);
        ((pm) this).field_U = true;
        ((pm) this).field_T = bl.a((byte) 106);
    }

    private final String k(int param0) {
        int var2 = ((pm) this).field_O > ((pm) this).field_S ? ((pm) this).field_S : ((pm) this).field_O;
        int var3 = ((pm) this).field_O <= ((pm) this).field_S ? ((pm) this).field_S : ((pm) this).field_O;
        if (param0 >= -98) {
            Object var4 = null;
            sl discarded$0 = pm.a((ul) null, -5, 40, (ul) null, -102);
        }
        return ((pm) this).field_j.substring(var2, var3);
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.c(false);
              if (param0 == 250) {
                this.a(var2, (byte) 112);
              } else {
                return;
              }
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

    void a(int param0, cf param1, int param2, int param3) {
        rk var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.g((byte) -84);
        if (1 == ((pm) this).field_u) {
            if (((pm) this).field_h instanceof rk) {
                var5 = (rk) (Object) ((pm) this).field_h;
                var6 = var5.b(param2, param3, bd.field_g, bo.field_d, 98, (cf) this);
                if (!((var6 ^ -1) == 0)) {
                    if (((pm) this).field_M) {
                        if (var6 < ((pm) this).field_V) {
                            if (((pm) this).field_S < var6) {
                                var6 = ((pm) this).field_V;
                            }
                        }
                    }
                    ((pm) this).field_O = var6;
                }
            }
            ((pm) this).field_T = bl.a((byte) 121);
        }
    }

    void j(int param0) {
        if (((pm) this).field_A instanceof fi) {
            ((fi) (Object) ((pm) this).field_A).a((pm) this, 0);
        }
        if (param0 != 8192) {
            ((pm) this).field_T = 67L;
        }
    }

    private final void b(boolean param0, int param1) {
        ((pm) this).field_O = param1;
        if (!lc.field_m[81]) {
            ((pm) this).field_S = ((pm) this).field_O;
        }
        if (param0) {
            Object var4 = null;
            this.a((String) null, (byte) -92);
        }
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(0 != ((pm) this).field_O)) {
            return ((pm) this).field_O;
        }
        for (var2 = ((pm) this).field_O + -1; var2 > 0; var2--) {
            // if_icmpeq L52
        }
        if (param0 != -110) {
            this.h(15);
        }
        return var2;
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (!((((pm) this).field_W ^ -1) == 0)) {
            var3 = ((pm) this).field_W + -((pm) this).field_j.length();
            if (0 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((pm) this).field_O != ((pm) this).field_j.length()) {
            ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_O) + param0 + ((pm) this).field_j.substring(((pm) this).field_O, ((pm) this).field_j.length());
        } else {
            ((pm) this).field_j = ((pm) this).field_j + param0;
        }
        ((pm) this).field_O = ((pm) this).field_O + param0.length();
        if (param1 <= 109) {
            return;
        }
        ((pm) this).field_S = ((pm) this).field_O;
        ((pm) this).j(8192);
    }

    private final void f(int param0) {
        this.i((byte) -60);
        this.c(false);
        if (param0 != 102) {
            this.b(true, -83);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!(null == ui.field_j)) {
            qk.a(ui.field_j, -123);
        }
        if (param0) {
            Object var3 = null;
            sl discarded$0 = pm.a((ul) null, -81, 46, (ul) null, -115);
        }
        if (!(null == pk.field_b)) {
            pk.field_b.b(param1, (byte) 47);
        }
        hd.a(param1, -19);
        if (null != bk.field_i) {
            bk.field_i.c(param1, -1);
        }
        ie.a(param1, param0);
    }

    final static sl a(ul param0, int param1, int param2, ul param3, int param4) {
        if (!ud.a(param2, param3, param1, (byte) -42)) {
            return null;
        }
        if (param4 != -29435) {
            field_R = null;
        }
        return me.a(param0.a(param2, true, param1), true);
    }

    private final void h(int param0) {
        if (!(!(((pm) this).field_A instanceof fi))) {
            ((fi) (Object) ((pm) this).field_A).a((pm) this, true);
        }
        if (param0 != 97) {
            ((pm) this).field_S = -78;
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        if (param1 == null) {
            param1 = "";
        }
        ((pm) this).field_j = param1;
        int var4 = param1.length();
        if (-1 != ((pm) this).field_W) {
            if (((pm) this).field_W < var4) {
                ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_W);
            }
        }
        ((pm) this).field_S = ((pm) this).field_j.length();
        ((pm) this).field_O = ((pm) this).field_j.length();
        if (!(param0)) {
            ((pm) this).j(8192);
        }
        if (param2 <= 102) {
            ((pm) this).a(91, 117, 22, -113);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = null;
        field_R = new k(256);
    }
}
