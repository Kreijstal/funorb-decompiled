/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ga extends wi {
    private boolean field_H;
    private long field_J;
    private int field_I;
    private int field_T;
    private int field_S;
    private boolean field_G;
    private long field_L;
    private int field_Q;
    static ut field_N;
    static boolean[] field_O;
    static ut field_E;
    static int field_P;
    static String field_M;
    static String field_U;
    static float field_R;
    static String field_K;

    private final void a(int param0, int param1) {
        ((ga) this).field_I = param0;
        if (!(ne.field_G[81])) {
            ((ga) this).field_Q = ((ga) this).field_I;
        }
        if (param1 != 20) {
            field_E = null;
        }
    }

    final static String a(boolean param0, String param1) {
        if (param0) {
            field_E = null;
        }
        int var2 = ki.a(bl.field_c, (byte) -105, tk.field_Ib);
        if (1 == var2) {
            param1 = "<img=0>" + param1;
        }
        if (!(-3 != (var2 ^ -1))) {
            param1 = "<img=1>" + param1;
        }
        return param1;
    }

    private final void m(int param0) {
        if (((ga) this).field_k instanceof sv) {
            ((sv) (Object) ((ga) this).field_k).a(-86, (ga) this);
        }
        if (param0 <= 66) {
            ((ga) this).field_Q = 66;
        }
    }

    public static void l(int param0) {
        field_E = null;
        field_U = null;
        field_N = null;
        field_K = null;
        field_O = null;
        if (param0 != 0) {
            field_P = 82;
        }
        field_M = null;
    }

    private final String k(int param0) {
        if (param0 != 82) {
            return null;
        }
        int var2 = ((ga) this).field_Q < ((ga) this).field_I ? ((ga) this).field_Q : ((ga) this).field_I;
        int var3 = ((ga) this).field_I > ((ga) this).field_Q ? ((ga) this).field_I : ((ga) this).field_Q;
        return ((ga) this).field_q.substring(var2, var3);
    }

    private final void k(byte param0) {
        if (param0 < 99) {
            ((ga) this).i((byte) 116);
        }
        String var2 = this.k(82);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(82)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(boolean param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Object var3 = null;
            Object stackIn_3_0 = null;
            String stackIn_3_1 = null;
            Object stackIn_4_0 = null;
            String stackIn_4_1 = null;
            Object stackIn_5_0 = null;
            String stackIn_5_1 = null;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_2_0 = null;
            String stackOut_2_1 = null;
            Object stackOut_4_0 = null;
            String stackOut_4_1 = null;
            int stackOut_4_2 = 0;
            Object stackOut_3_0 = null;
            String stackOut_3_1 = null;
            int stackOut_3_2 = 0;
            L0: {
              if (param0) {
                break L0;
              } else {
                var3 = null;
                ((ga) this).a((String) null, (byte) -122, true);
                break L0;
              }
            }
            try {
              L1: {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.i(-126);
                stackOut_2_0 = this;
                stackOut_2_1 = (String) var2_ref;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (param0) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = (String) (Object) stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = (String) (Object) stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              this.a(stackIn_5_1, stackIn_5_2 != 0);
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

    void m(byte param0) {
        if (param0 > -57) {
            this.m(49);
        }
        if (!(!(((ga) this).field_k instanceof sv))) {
            ((sv) (Object) ((ga) this).field_k).a((byte) 113, (ga) this);
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        if (!(param0 != null)) {
            param0 = "";
        }
        ((ga) this).field_q = param0;
        int var4 = param0.length();
        if ((((ga) this).field_S ^ -1) != 0) {
            if (!(((ga) this).field_S >= var4)) {
                ((ga) this).field_q = ((ga) this).field_q.substring(0, ((ga) this).field_S);
            }
        }
        ((ga) this).field_Q = ((ga) this).field_q.length();
        ((ga) this).field_I = ((ga) this).field_q.length();
        if (!param2) {
            ((ga) this).m((byte) -83);
        }
        if (param1 != -17) {
            ((ga) this).field_S = 42;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ke var8 = null;
        long var6 = 0L;
        if (null != ((ga) this).field_r) {
            if (0 == param0) {
                ((ga) this).field_r.a(127, ((ga) this).field_y, param3, (fd) this, param2);
                if (((ga) this).field_r instanceof ke) {
                    var8 = (ke) (Object) ((ga) this).field_r;
                    if (!(((ga) this).field_I == ((ga) this).field_Q)) {
                        var8.a(param2, ((ga) this).field_I, ((ga) this).field_Q, (fd) this, 91, param3);
                    }
                    var6 = nj.a(30);
                    if (-501L < ((var6 + -((ga) this).field_L) % 1000L ^ -1L)) {
                        var8.a(((ga) this).field_I, param2, param3, true, (fd) this);
                    }
                }
            }
        }
        if (param1 != 65) {
            ((ga) this).field_I = -80;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 >= -117) {
            Object var4 = null;
            ag discarded$0 = ga.a((vm) null, -85);
        }
        if (((ga) this).field_I != ((ga) this).field_Q) {
            var2 = ((ga) this).field_Q >= ((ga) this).field_I ? ((ga) this).field_I : ((ga) this).field_Q;
            var3 = ((ga) this).field_Q >= ((ga) this).field_I ? ((ga) this).field_Q : ((ga) this).field_I;
            ((ga) this).field_Q = var2;
            ((ga) this).field_I = var2;
            ((ga) this).field_q = ((ga) this).field_q.substring(0, var2) + ((ga) this).field_q.substring(var3, ((ga) this).field_q.length());
            ((ga) this).m((byte) -96);
        }
    }

    ga(String param0, jv param1, int param2) {
        super(param0, param1);
        ((ga) this).field_J = 0L;
        ((ga) this).field_T = -1;
        ((ga) this).field_G = false;
        ((ga) this).field_r = nb.field_i.field_h;
        ((ga) this).field_S = param2;
        ((ga) this).a(param0, (byte) -17, true);
        ((ga) this).field_H = true;
        ((ga) this).field_L = nj.a(-123);
    }

    final void i(byte param0) {
        ((ga) this).field_I = 0;
        ((ga) this).field_q = "";
        if (param0 >= -11) {
            field_E = null;
        }
        ((ga) this).field_Q = 0;
        ((ga) this).m((byte) -85);
    }

    final static ag a(vm param0, int param1) {
        ag var2 = new ag(param0, (gn) (Object) param0);
        ps.field_a.a((gn) (Object) var2, 3);
        if (param1 <= 108) {
            field_U = null;
        }
        pi.field_b.a((lq) (Object) param0);
        return var2;
    }

    void a(byte param0, fd param1, int param2, int param3) {
        ke var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.j((byte) 110);
        if ((((ga) this).field_p ^ -1) == -2) {
            if (((ga) this).field_r instanceof ke) {
                var7 = (ke) (Object) ((ga) this).field_r;
                var6 = var7.a(n.field_m, (fd) this, el.field_A, param2, param3, 0);
                if (0 != (var6 ^ -1)) {
                    if (((ga) this).field_G) {
                        if (var6 < ((ga) this).field_T) {
                            if (!(((ga) this).field_Q >= var6)) {
                                var6 = ((ga) this).field_T;
                            }
                        }
                    }
                    ((ga) this).field_I = var6;
                }
            }
            ((ga) this).field_L = nj.a(param0 ^ -117);
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((ga) this).field_r instanceof ke) {
            var8_int = ((ke) (Object) ((ga) this).field_r).a(n.field_m, (fd) this, el.field_A, param5, param1, 0);
            this.a(var8_int != -1 ? var8_int : 0, 20);
            var8 = nj.a(95);
            ((ga) this).field_G = -251L < (var8 - ((ga) this).field_J ^ -1L) ? true : false;
            if (!(!((ga) this).field_G)) {
                ((ga) this).field_Q = this.l((byte) -55);
                ((ga) this).field_I = this.h((byte) 104);
                if ((((ga) this).field_I ^ -1) < -1) {
                    if (((ga) this).field_q.charAt(((ga) this).field_I - 1) == 32) {
                        ((ga) this).field_I = ((ga) this).field_I - 1;
                    }
                }
                ((ga) this).field_T = ((ga) this).field_I;
            }
            ((ga) this).field_J = var8;
            return true;
        }
        return false;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          if (param1 < -60) {
            break L0;
          } else {
            field_O = null;
            break L0;
          }
        }
        ((ga) this).field_L = nj.a(101);
        if (param0 == 60) {
          return false;
        } else {
          if (param0 != 62) {
            L1: {
              if (32 > param0) {
                break L1;
              } else {
                if (param0 <= 126) {
                  L2: {
                    if (((ga) this).field_Q == ((ga) this).field_I) {
                      break L2;
                    } else {
                      this.i(-125);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (0 == (((ga) this).field_S ^ -1)) {
                        break L4;
                      } else {
                        if (((ga) this).field_q.length() >= ((ga) this).field_S) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((ga) this).field_I < ((ga) this).field_q.length()) {
                        ((ga) this).field_q = ((ga) this).field_q.substring(0, ((ga) this).field_I) + param0 + ((ga) this).field_q.substring(((ga) this).field_I, ((ga) this).field_q.length());
                        ((ga) this).field_I = ((ga) this).field_I + 1;
                        ((ga) this).field_Q = ((ga) this).field_I;
                        break L5;
                      } else {
                        ((ga) this).field_q = ((ga) this).field_q + param0;
                        ((ga) this).field_I = ((ga) this).field_q.length();
                        ((ga) this).field_Q = ((ga) this).field_q.length();
                        break L5;
                      }
                    }
                    ((ga) this).m((byte) -61);
                    break L3;
                  }
                  return true;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if ((param3 ^ -1) != -86) {
                if (param3 != 101) {
                  if (param3 != 13) {
                    if (96 != param3) {
                      if (param3 != 97) {
                        if (param3 != -103) {
                          if (-104 != param3) {
                            if (84 != param3) {
                              L7: {
                                if (!ne.field_G[82]) {
                                  break L7;
                                } else {
                                  if (65 == param3) {
                                    this.j(-13630);
                                    return true;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (!ne.field_G[82]) {
                                  break L8;
                                } else {
                                  if (-67 == (param3 ^ -1)) {
                                    this.k((byte) 109);
                                    return true;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (!ne.field_G[82]) {
                                break L6;
                              } else {
                                if (param3 != 67) {
                                  break L6;
                                } else {
                                  this.a(true);
                                  return true;
                                }
                              }
                            } else {
                              this.m(99);
                              return true;
                            }
                          } else {
                            this.a(((ga) this).field_q.length(), 20);
                            return true;
                          }
                        } else {
                          this.a(0, 20);
                          return true;
                        }
                      } else {
                        if (((ga) this).field_I >= ((ga) this).field_q.length()) {
                          break L6;
                        } else {
                          L9: {
                            stackOut_30_0 = this;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_31_0 = stackOut_30_0;
                            if (ne.field_G[82]) {
                              stackOut_32_0 = this;
                              stackOut_32_1 = this.h((byte) 37);
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              break L9;
                            } else {
                              stackOut_31_0 = this;
                              stackOut_31_1 = 1 + ((ga) this).field_I;
                              stackIn_33_0 = stackOut_31_0;
                              stackIn_33_1 = stackOut_31_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_33_1, 20);
                          return true;
                        }
                      }
                    } else {
                      if (((ga) this).field_I <= 0) {
                        break L6;
                      } else {
                        L10: {
                          stackOut_24_0 = this;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (!ne.field_G[82]) {
                            stackOut_26_0 = this;
                            stackOut_26_1 = -1 + ((ga) this).field_I;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L10;
                          } else {
                            stackOut_25_0 = this;
                            stackOut_25_1 = this.l((byte) -55);
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L10;
                          }
                        }
                        this.a(stackIn_27_1, 20);
                        return true;
                      }
                    }
                  } else {
                    ((ga) this).i((byte) -107);
                    return true;
                  }
                } else {
                  if (((ga) this).field_I == ((ga) this).field_Q) {
                    if (((ga) this).field_I < ((ga) this).field_q.length()) {
                      ((ga) this).field_Q = ((ga) this).field_I + 1;
                      this.i(-126);
                      return true;
                    } else {
                      break L6;
                    }
                  } else {
                    this.i(-127);
                    return true;
                  }
                }
              } else {
                if (((ga) this).field_Q != ((ga) this).field_I) {
                  this.i(-128);
                  return true;
                } else {
                  if (0 >= ((ga) this).field_I) {
                    break L6;
                  } else {
                    ((ga) this).field_Q = -1 + ((ga) this).field_I;
                    this.i(-123);
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

    private final int l(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!(0 != ((ga) this).field_I)) {
            return ((ga) this).field_I;
        }
        for (var2 = -1 + ((ga) this).field_I; var2 > 0; var2--) {
            // if_icmpeq L52
        }
        if (param0 != -55) {
            return -81;
        }
        return var2;
    }

    private final void j(int param0) {
        if (param0 != -13630) {
            return;
        }
        this.k((byte) 119);
        this.i(-124);
    }

    private final int h(byte param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = ((ga) this).field_q.length();
        if (!(((ga) this).field_I != var2)) {
            return ((ga) this).field_I;
        }
        if (param0 <= 1) {
            return -65;
        }
        for (var3 = ((ga) this).field_I + 1; var3 < var2; var3++) {
            // if_icmpeq L72
        }
        return var3;
    }

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (!(0 == (((ga) this).field_S ^ -1))) {
            var3 = ((ga) this).field_S + -((ga) this).field_q.length();
            if (!((var3 ^ -1) > -1)) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((ga) this).field_I != ((ga) this).field_q.length()) {
            ((ga) this).field_q = ((ga) this).field_q.substring(0, ((ga) this).field_I) + param0 + ((ga) this).field_q.substring(((ga) this).field_I, ((ga) this).field_q.length());
        } else {
            ((ga) this).field_q = ((ga) this).field_q + param0;
        }
        if (param1) {
            Object var4 = null;
            ((ga) this).a((String) null, (byte) -99, true);
        }
        ((ga) this).field_I = ((ga) this).field_I + param0.length();
        ((ga) this).field_Q = ((ga) this).field_I;
        ((ga) this).m((byte) -86);
    }

    private final void j(byte param0) {
        int var3 = 0;
        iq var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ke var10 = null;
        var9 = Kickabout.field_G;
        if (((ga) this).field_H) {
          if (!(((ga) this).field_r instanceof ke)) {
            return;
          } else {
            var10 = (ke) (Object) ((ga) this).field_r;
            var3 = 21 / ((param0 - 45) / 37);
            var4 = var10.a(5035, (fd) this);
            var5 = var4.a((byte) -25);
            var6 = var10.a((byte) -124, (fd) this);
            var7 = var10.a((byte) -76) >> -824223839;
            if (var5 >= var6 + -var7) {
              L0: {
                var8 = ((ga) this).field_s + var4.b(0, ((ga) this).field_I);
                if (-var7 + var6 >= var8) {
                  if (var8 >= var7) {
                    break L0;
                  } else {
                    ((ga) this).field_s = var7 + (-var8 + ((ga) this).field_s);
                    break L0;
                  }
                } else {
                  ((ga) this).field_s = ((ga) this).field_s + var6 - var7 + -var8;
                  break L0;
                }
              }
              L1: {
                if (((ga) this).field_s > 0) {
                  ((ga) this).field_s = 0;
                  break L1;
                } else {
                  if (var7 + -var6 <= ((ga) this).field_s) {
                    break L1;
                  } else {
                    ((ga) this).field_s = var7 + -var6;
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((ga) this).field_s = 0;
              ((ga) this).field_o = 0;
              return;
            }
          }
        } else {
          ((ga) this).field_s = 0;
          ((ga) this).field_o = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_N = (ut) (Object) new ot(140, 140);
        field_M = "No options available";
        field_P = field_N.field_o >> 1474897601;
        field_O = new boolean[89];
        field_U = "You can spectate this game";
        var0 = 0;
        L0: while (true) {
          if (field_O.length <= var0) {
            field_K = "Offline";
          } else {
            L1: {
              if (var0 == -1) {
                field_O[var0] = false;
                break L1;
              } else {
                if (-2 == var0) {
                  field_O[var0] = false;
                  break L1;
                } else {
                  if (var0 == 2) {
                    field_O[var0] = false;
                    break L1;
                  } else {
                    if ((var0 ^ -1) != -4) {
                      if (4 != var0) {
                        if (var0 != 5) {
                          if (-7 != (var0 ^ -1)) {
                            if ((var0 ^ -1) == -8) {
                              field_O[var0] = true;
                              break L1;
                            } else {
                              if (var0 == 8) {
                                field_O[var0] = true;
                                break L1;
                              } else {
                                if ((var0 ^ -1) == -10) {
                                  field_O[var0] = true;
                                  break L1;
                                } else {
                                  if (var0 == 10) {
                                    field_O[var0] = true;
                                    break L1;
                                  } else {
                                    if ((var0 ^ -1) == -12) {
                                      field_O[var0] = true;
                                      break L1;
                                    } else {
                                      if (12 == var0) {
                                        field_O[var0] = true;
                                        break L1;
                                      } else {
                                        if ((var0 ^ -1) != -14) {
                                          if (var0 != 14) {
                                            if (var0 != 15) {
                                              if (-17 != (var0 ^ -1)) {
                                                if (17 == var0) {
                                                  field_O[var0] = true;
                                                  break L1;
                                                } else {
                                                  if ((var0 ^ -1) != -19) {
                                                    if (var0 == 19) {
                                                      field_O[var0] = true;
                                                      break L1;
                                                    } else {
                                                      if (var0 != 20) {
                                                        if (21 == var0) {
                                                          field_O[var0] = true;
                                                          break L1;
                                                        } else {
                                                          if (-23 == (var0 ^ -1)) {
                                                            field_O[var0] = true;
                                                            break L1;
                                                          } else {
                                                            if (var0 != 23) {
                                                              if ((var0 ^ -1) == -25) {
                                                                field_O[var0] = true;
                                                                break L1;
                                                              } else {
                                                                if (25 != var0) {
                                                                  if (var0 != 26) {
                                                                    if (27 == var0) {
                                                                      field_O[var0] = true;
                                                                      break L1;
                                                                    } else {
                                                                      if (28 == var0) {
                                                                        field_O[var0] = true;
                                                                        break L1;
                                                                      } else {
                                                                        if (var0 != 29) {
                                                                          if (var0 != -31) {
                                                                            if (31 != var0) {
                                                                              if (-33 != var0) {
                                                                                if (33 != var0) {
                                                                                  if (var0 != 34) {
                                                                                    if (var0 != -36) {
                                                                                      if (-37 != var0) {
                                                                                        if (37 == var0) {
                                                                                          field_O[var0] = false;
                                                                                          break L1;
                                                                                        } else {
                                                                                          if (var0 != 38) {
                                                                                            if (var0 != -40) {
                                                                                              if (var0 == -41) {
                                                                                                field_O[var0] = false;
                                                                                                break L1;
                                                                                              } else {
                                                                                                if (-42 == var0) {
                                                                                                  field_O[var0] = false;
                                                                                                  break L1;
                                                                                                } else {
                                                                                                  if (-43 != var0) {
                                                                                                    if (43 == var0) {
                                                                                                      field_O[var0] = true;
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if (44 != var0) {
                                                                                                        if (var0 != -46) {
                                                                                                          if (-47 != var0) {
                                                                                                            if (var0 != 47) {
                                                                                                              if (-49 == var0) {
                                                                                                                field_O[var0] = false;
                                                                                                                break L1;
                                                                                                              } else {
                                                                                                                if (-50 != var0) {
                                                                                                                  if (var0 != -51) {
                                                                                                                    if (-52 == var0) {
                                                                                                                      field_O[var0] = false;
                                                                                                                      break L1;
                                                                                                                    } else {
                                                                                                                      if (var0 == -53) {
                                                                                                                        field_O[var0] = false;
                                                                                                                        break L1;
                                                                                                                      } else {
                                                                                                                        if (53 != var0) {
                                                                                                                          if (-55 != var0) {
                                                                                                                            if (-56 != (var0 ^ -1)) {
                                                                                                                              if (var0 == -57) {
                                                                                                                                field_O[var0] = false;
                                                                                                                                break L1;
                                                                                                                              } else {
                                                                                                                                if (-58 != var0) {
                                                                                                                                  if ((var0 ^ -1) == -59) {
                                                                                                                                    field_O[var0] = false;
                                                                                                                                    break L1;
                                                                                                                                  } else {
                                                                                                                                    if ((var0 ^ -1) == -60) {
                                                                                                                                      field_O[var0] = false;
                                                                                                                                      break L1;
                                                                                                                                    } else {
                                                                                                                                      if ((var0 ^ -1) == -61) {
                                                                                                                                        field_O[var0] = false;
                                                                                                                                        break L1;
                                                                                                                                      } else {
                                                                                                                                        if (61 != var0) {
                                                                                                                                          if (var0 == 62) {
                                                                                                                                            field_O[var0] = false;
                                                                                                                                            break L1;
                                                                                                                                          } else {
                                                                                                                                            if (var0 != 63) {
                                                                                                                                              if (var0 != 64) {
                                                                                                                                                if (var0 == 65) {
                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                  break L1;
                                                                                                                                                } else {
                                                                                                                                                  if ((var0 ^ -1) == -67) {
                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                    break L1;
                                                                                                                                                  } else {
                                                                                                                                                    if (var0 != 67) {
                                                                                                                                                      if ((var0 ^ -1) == -69) {
                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                        break L1;
                                                                                                                                                      } else {
                                                                                                                                                        if (69 != var0) {
                                                                                                                                                          if ((var0 ^ -1) != -71) {
                                                                                                                                                            if (var0 != 71) {
                                                                                                                                                              if (var0 == 72) {
                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                break L1;
                                                                                                                                                              } else {
                                                                                                                                                                if ((var0 ^ -1) == -74) {
                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                  break L1;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var0 != -75) {
                                                                                                                                                                    if (75 == var0) {
                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                      break L1;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (-77 == var0) {
                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                        break L1;
                                                                                                                                                                      } else {
                                                                                                                                                                        if ((var0 ^ -1) != -78) {
                                                                                                                                                                          if (var0 == 78) {
                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                            break L1;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (79 == var0) {
                                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                                              break L1;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (80 != var0) {
                                                                                                                                                                                if (-82 == var0) {
                                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                                  break L1;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (-83 != var0) {
                                                                                                                                                                                    if (83 == var0) {
                                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                                      break L1;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (var0 == 84) {
                                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                                        break L1;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (85 == var0) {
                                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                                          break L1;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if ((var0 ^ -1) != -87) {
                                                                                                                                                                                            if (var0 == 87) {
                                                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                                                              break L1;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (var0 != 88) {
                                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          } else {
                                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                                            break L1;
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                                    break L1;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                                break L1;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        } else {
                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                          break L1;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                    break L1;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                              break L1;
                                                                                                                                                            }
                                                                                                                                                          } else {
                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                            break L1;
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                          break L1;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                      break L1;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              } else {
                                                                                                                                                field_O[var0] = false;
                                                                                                                                                break L1;
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              field_O[var0] = false;
                                                                                                                                              break L1;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          field_O[var0] = false;
                                                                                                                                          break L1;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  field_O[var0] = false;
                                                                                                                                  break L1;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              field_O[var0] = false;
                                                                                                                              break L1;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            field_O[var0] = false;
                                                                                                                            break L1;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          field_O[var0] = false;
                                                                                                                          break L1;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    field_O[var0] = false;
                                                                                                                    break L1;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  field_O[var0] = false;
                                                                                                                  break L1;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              field_O[var0] = false;
                                                                                                              break L1;
                                                                                                            }
                                                                                                          } else {
                                                                                                            field_O[var0] = false;
                                                                                                            break L1;
                                                                                                          }
                                                                                                        } else {
                                                                                                          field_O[var0] = false;
                                                                                                          break L1;
                                                                                                        }
                                                                                                      } else {
                                                                                                        field_O[var0] = false;
                                                                                                        break L1;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    field_O[var0] = false;
                                                                                                    break L1;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              field_O[var0] = false;
                                                                                              break L1;
                                                                                            }
                                                                                          } else {
                                                                                            field_O[var0] = false;
                                                                                            break L1;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        field_O[var0] = false;
                                                                                        break L1;
                                                                                      }
                                                                                    } else {
                                                                                      field_O[var0] = false;
                                                                                      break L1;
                                                                                    }
                                                                                  } else {
                                                                                    field_O[var0] = false;
                                                                                    break L1;
                                                                                  }
                                                                                } else {
                                                                                  field_O[var0] = false;
                                                                                  break L1;
                                                                                }
                                                                              } else {
                                                                                field_O[var0] = true;
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              field_O[var0] = true;
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            field_O[var0] = true;
                                                                            break L1;
                                                                          }
                                                                        } else {
                                                                          field_O[var0] = true;
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    field_O[var0] = true;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  field_O[var0] = true;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              field_O[var0] = true;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        field_O[var0] = true;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    field_O[var0] = true;
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                field_O[var0] = true;
                                                break L1;
                                              }
                                            } else {
                                              field_O[var0] = true;
                                              break L1;
                                            }
                                          } else {
                                            field_O[var0] = true;
                                            break L1;
                                          }
                                        } else {
                                          field_O[var0] = true;
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            field_O[var0] = true;
                            break L1;
                          }
                        } else {
                          field_O[var0] = true;
                          break L1;
                        }
                      } else {
                        field_O[var0] = true;
                        break L1;
                      }
                    } else {
                      field_O[var0] = true;
                      break L1;
                    }
                  }
                }
              }
            }
            var0++;
            continue L0;
          }
        }
    }
}
