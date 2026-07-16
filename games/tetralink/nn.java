/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nn extends ae {
    private int field_P;
    private long field_bb;
    static int[] field_S;
    static boolean field_X;
    static boolean field_R;
    private boolean field_Z;
    static ah field_T;
    private int field_ab;
    static int field_cb;
    private boolean field_W;
    private int field_Q;
    static byte[] field_Y;
    private int field_V;
    private long field_U;

    private final void m(int param0) {
        if (!(!(((nn) this).field_s instanceof ih))) {
            ((ih) (Object) ((nn) this).field_s).a((nn) this, (byte) 101);
        }
        if (param0 != 82) {
            Object var3 = null;
            this.a((String) null, false);
        }
    }

    nn(String param0, dn param1, int param2) {
        super(param0, param1);
        ((nn) this).field_Z = false;
        ((nn) this).field_ab = -1;
        ((nn) this).field_U = 0L;
        ((nn) this).field_P = param2;
        ((nn) this).field_H = dh.field_q.field_r;
        ((nn) this).a(true, 103, param0);
        ((nn) this).field_W = true;
        ((nn) this).field_bb = k.a(0);
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4 + 0, param5, param6)) {
            if (!(!(((nn) this).field_H instanceof jh))) {
                var8_int = ((jh) (Object) ((nn) this).field_H).a(param3, param1, a.field_a, aa.field_Nb, (na) this, (byte) -34);
                this.c(81, (var8_int ^ -1) != 0 ? var8_int : 0);
                var8 = k.a(0);
                ((nn) this).field_Z = (-((nn) this).field_U + var8 ^ -1L) > -251L ? true : false;
                if (!(!((nn) this).field_Z)) {
                    ((nn) this).field_Q = this.n(-33);
                    ((nn) this).field_V = this.d(false);
                    if (0 < ((nn) this).field_V) {
                        if (!(((nn) this).field_A.charAt(-1 + ((nn) this).field_V) != 32)) {
                            ((nn) this).field_V = ((nn) this).field_V - 1;
                        }
                    }
                    ((nn) this).field_ab = ((nn) this).field_V;
                }
                ((nn) this).field_U = var8;
                return true;
            }
        }
        if (param4 != -32738) {
            return false;
        }
        return false;
    }

    private final void c(int param0, int param1) {
        ((nn) this).field_V = param1;
        if (!sn.field_a[param0]) {
            ((nn) this).field_Q = ((nn) this).field_V;
        }
    }

    public static void e(boolean param0) {
        field_T = null;
        field_S = null;
        field_Y = null;
        if (!param0) {
            nn.g((byte) 45);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        if (param1 <= 11) {
            nn.g((byte) -70);
        }
        if (!(param2 != null)) {
            param2 = "";
        }
        ((nn) this).field_A = param2;
        int var4 = param2.length();
        if ((((nn) this).field_P ^ -1) != 0) {
            if (!(((nn) this).field_P >= var4)) {
                ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_P);
            }
        }
        int dupTemp$0 = ((nn) this).field_A.length();
        ((nn) this).field_Q = dupTemp$0;
        ((nn) this).field_V = dupTemp$0;
        if (!(param0)) {
            ((nn) this).j(-12956);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        String var3 = wg.a(param0, -3, param1);
        if (!(var3 == null)) {
            return var3;
        }
        for (var4 = 0; var4 < param0.length(); var4++) {
            if (!om.a(param0.charAt(var4), false)) {
                return tc.field_t;
            }
        }
        if (param2 == 82) {
            return null;
        }
        field_X = true;
        return null;
    }

    void a(na param0, int param1, int param2, boolean param3) {
        jh var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.h((byte) -85);
        if (!(((nn) this).field_x != 1)) {
            if (!(!(((nn) this).field_H instanceof jh))) {
                var5 = (jh) (Object) ((nn) this).field_H;
                var6 = var5.a(param2, param1, a.field_a, aa.field_Nb, (na) this, (byte) -34);
                if (!(0 == (var6 ^ -1))) {
                    if (((nn) this).field_Z) {
                        if (var6 < ((nn) this).field_ab) {
                            if (var6 > ((nn) this).field_Q) {
                                var6 = ((nn) this).field_ab;
                            }
                        }
                    }
                    ((nn) this).field_V = var6;
                }
            }
            ((nn) this).field_bb = k.a(0);
        }
    }

    private final String g(int param0) {
        int var2 = ((nn) this).field_V <= ((nn) this).field_Q ? ((nn) this).field_V : ((nn) this).field_Q;
        if (param0 < 43) {
            return null;
        }
        int var3 = ((nn) this).field_Q >= ((nn) this).field_V ? ((nn) this).field_Q : ((nn) this).field_V;
        return ((nn) this).field_A.substring(var2, var3);
    }

    final void k(int param0) {
        ((nn) this).field_A = "";
        ((nn) this).field_Q = 0;
        ((nn) this).field_V = param0;
        ((nn) this).j(-12956);
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((nn) this).field_V != ((nn) this).field_Q) {
            var2 = ((nn) this).field_V > ((nn) this).field_Q ? ((nn) this).field_Q : ((nn) this).field_V;
            var3 = ((nn) this).field_Q >= ((nn) this).field_V ? ((nn) this).field_Q : ((nn) this).field_V;
            ((nn) this).field_Q = var2;
            ((nn) this).field_V = var2;
            ((nn) this).field_A = ((nn) this).field_A.substring(0, var2) + ((nn) this).field_A.substring(var3, ((nn) this).field_A.length());
            ((nn) this).j(-12956);
        }
        if (param0 != 1) {
            Object var4 = null;
            ((nn) this).a(false, -8, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jh var8 = null;
        long var6 = 0L;
        if (param0 != 0) {
            return;
        }
        if (((nn) this).field_H != null) {
            if (!(0 != param3)) {
                ((nn) this).field_H.a((na) this, param1, param2, true, ((nn) this).field_K);
                if (((nn) this).field_H instanceof jh) {
                    var8 = (jh) (Object) ((nn) this).field_H;
                    if (((nn) this).field_Q != ((nn) this).field_V) {
                        var8.a(((nn) this).field_Q, 18985, ((nn) this).field_V, param1, param2, (na) this);
                    }
                    var6 = k.a(param0 ^ 0);
                    if (((var6 - ((nn) this).field_bb) % 1000L ^ -1L) > -501L) {
                        var8.a((na) this, param2, ((nn) this).field_V, 0, param1);
                    }
                }
            }
        }
    }

    final static int f(byte param0) {
        if (param0 >= -43) {
            int discarded$0 = nn.f((byte) -110);
        }
        return -ja.field_j + hd.field_q;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        L0: {
          ((nn) this).field_bb = k.a(param2 + -1);
          if (param2 == 1) {
            break L0;
          } else {
            int discarded$2 = nn.i(88);
            break L0;
          }
        }
        L1: {
          if (param1 == 60) {
            break L1;
          } else {
            if (param1 == 62) {
              break L1;
            } else {
              L2: {
                if (param1 < 32) {
                  break L2;
                } else {
                  if (126 < param1) {
                    break L2;
                  } else {
                    L3: {
                      if (((nn) this).field_V == ((nn) this).field_Q) {
                        break L3;
                      } else {
                        this.h(param2 ^ 0);
                        break L3;
                      }
                    }
                    L4: {
                      if ((((nn) this).field_P ^ -1) == 0) {
                        break L4;
                      } else {
                        if ((((nn) this).field_A.length() ^ -1) > (((nn) this).field_P ^ -1)) {
                          break L4;
                        } else {
                          return true;
                        }
                      }
                    }
                    L5: {
                      if (((nn) this).field_V >= ((nn) this).field_A.length()) {
                        ((nn) this).field_A = ((nn) this).field_A + param1;
                        int dupTemp$3 = ((nn) this).field_A.length();
                        ((nn) this).field_V = dupTemp$3;
                        ((nn) this).field_Q = dupTemp$3;
                        break L5;
                      } else {
                        ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_V) + param1 + ((nn) this).field_A.substring(((nn) this).field_V, ((nn) this).field_A.length());
                        ((nn) this).field_V = ((nn) this).field_V + 1;
                        ((nn) this).field_Q = ((nn) this).field_V;
                        break L5;
                      }
                    }
                    ((nn) this).j(param2 + -12957);
                    return true;
                  }
                }
              }
              L6: {
                if (-86 != (param0 ^ -1)) {
                  if (101 != param0) {
                    if ((param0 ^ -1) == -14) {
                      ((nn) this).k(0);
                      return true;
                    } else {
                      if (96 == param0) {
                        if (((nn) this).field_V <= 0) {
                          break L6;
                        } else {
                          L7: {
                            stackOut_53_0 = this;
                            stackOut_53_1 = 81;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            if (!sn.field_a[82]) {
                              stackOut_55_0 = this;
                              stackOut_55_1 = stackIn_55_1;
                              stackOut_55_2 = ((nn) this).field_V + -1;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              stackIn_56_2 = stackOut_55_2;
                              break L7;
                            } else {
                              stackOut_54_0 = this;
                              stackOut_54_1 = stackIn_54_1;
                              stackOut_54_2 = this.n(param2 ^ -34);
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_56_2 = stackOut_54_2;
                              break L7;
                            }
                          }
                          this.c(stackIn_56_1, stackIn_56_2);
                          return true;
                        }
                      } else {
                        if (param0 == 97) {
                          if ((((nn) this).field_V ^ -1) > (((nn) this).field_A.length() ^ -1)) {
                            L8: {
                              stackOut_48_0 = this;
                              stackOut_48_1 = 81;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (!sn.field_a[82]) {
                                stackOut_50_0 = this;
                                stackOut_50_1 = stackIn_50_1;
                                stackOut_50_2 = ((nn) this).field_V - -1;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                stackIn_51_2 = stackOut_50_2;
                                break L8;
                              } else {
                                stackOut_49_0 = this;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = this.d(false);
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                stackIn_51_2 = stackOut_49_2;
                                break L8;
                              }
                            }
                            this.c(stackIn_51_1, stackIn_51_2);
                            return true;
                          } else {
                            break L6;
                          }
                        } else {
                          if (-103 != (param0 ^ -1)) {
                            if ((param0 ^ -1) != -104) {
                              if ((param0 ^ -1) == -85) {
                                this.m(param2 ^ 83);
                                return true;
                              } else {
                                L9: {
                                  if (!sn.field_a[82]) {
                                    break L9;
                                  } else {
                                    if ((param0 ^ -1) == -66) {
                                      this.f(true);
                                      return true;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (!sn.field_a[82]) {
                                    break L10;
                                  } else {
                                    if (-67 != (param0 ^ -1)) {
                                      break L10;
                                    } else {
                                      this.l(83);
                                      return true;
                                    }
                                  }
                                }
                                if (!sn.field_a[82]) {
                                  break L6;
                                } else {
                                  if (67 != param0) {
                                    break L6;
                                  } else {
                                    this.e((byte) 77);
                                    return true;
                                  }
                                }
                              }
                            } else {
                              this.c(param2 + 80, ((nn) this).field_A.length());
                              return true;
                            }
                          } else {
                            this.c(81, 0);
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    if (((nn) this).field_V != ((nn) this).field_Q) {
                      this.h(1);
                      return true;
                    } else {
                      if ((((nn) this).field_V ^ -1) <= (((nn) this).field_A.length() ^ -1)) {
                        break L6;
                      } else {
                        ((nn) this).field_Q = 1 + ((nn) this).field_V;
                        this.h(1);
                        return true;
                      }
                    }
                  }
                } else {
                  if ((((nn) this).field_V ^ -1) != (((nn) this).field_Q ^ -1)) {
                    this.h(1);
                    return true;
                  } else {
                    if (((nn) this).field_V <= 0) {
                      break L6;
                    } else {
                      ((nn) this).field_Q = ((nn) this).field_V - 1;
                      this.h(1);
                      return true;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    private final void f(boolean param0) {
        this.l(93);
        if (!param0) {
            ((nn) this).j(95);
        }
        this.h(1);
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (((nn) this).field_V != 0) {
          L0: {
            if (param0 == -33) {
              break L0;
            } else {
              field_Y = null;
              break L0;
            }
          }
          var2 = ((nn) this).field_V - 1;
          L1: while (true) {
            L2: {
              if ((var2 ^ -1) >= -1) {
                break L2;
              } else {
                if (((nn) this).field_A.charAt(-1 + var2) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return ((nn) this).field_V;
        }
    }

    final static void g(byte param0) {
        int var2 = TetraLink.field_J;
        int var1 = 0;
        if (param0 >= -73) {
            Object var3 = null;
            String discarded$0 = nn.a((CharSequence) null, true, 124);
        }
        while (pl.field_d > var1) {
            n.field_L[var1] = null;
            var1++;
        }
        pl.field_d = 0;
    }

    void j(int param0) {
        if (((nn) this).field_s instanceof ih) {
            ((ih) (Object) ((nn) this).field_s).a((byte) 73, (nn) this);
        }
        if (param0 != -12956) {
            this.e((byte) 22);
        }
    }

    final static int i(int param0) {
        if (param0 < 66) {
            field_T = null;
        }
        return ea.field_a;
    }

    private final void h(byte param0) {
        hi var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jh var10 = null;
        var9 = TetraLink.field_J;
        if (((nn) this).field_W) {
          if (((nn) this).field_H instanceof jh) {
            var10 = (jh) (Object) ((nn) this).field_H;
            var5 = -2 % ((72 - param0) / 39);
            var3 = var10.a((na) this, false);
            var4 = var3.b((byte) 66);
            var6 = var10.b((na) this, 92);
            var7 = var10.a(true) >> 1539103425;
            if (var4 >= var6 - var7) {
              L0: {
                var8 = ((nn) this).field_E + var3.a(((nn) this).field_V, true);
                if (var8 > -var7 + var6) {
                  ((nn) this).field_E = -var7 - -var6 - (var8 - ((nn) this).field_E);
                  break L0;
                } else {
                  if (var7 > var8) {
                    ((nn) this).field_E = ((nn) this).field_E + (-var8 + var7);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if (((nn) this).field_E > 0) {
                  ((nn) this).field_E = 0;
                  break L1;
                } else {
                  if (-var6 - -var7 > ((nn) this).field_E) {
                    ((nn) this).field_E = -var6 - -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((nn) this).field_o = 0;
              ((nn) this).field_E = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((nn) this).field_o = 0;
          ((nn) this).field_E = 0;
          return;
        }
    }

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (!(((nn) this).field_P == -1)) {
            var3 = ((nn) this).field_P + -((nn) this).field_A.length();
            if (0 <= var3) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (!param1) {
            return;
        }
        if (((nn) this).field_V == ((nn) this).field_A.length()) {
            ((nn) this).field_A = ((nn) this).field_A + param0;
        } else {
            ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_V) + param0 + ((nn) this).field_A.substring(((nn) this).field_V, ((nn) this).field_A.length());
        }
        ((nn) this).field_V = ((nn) this).field_V + param0.length();
        ((nn) this).field_Q = ((nn) this).field_V;
        ((nn) this).j(-12956);
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  this.h(1);
                  this.a(var2, true);
                  if (param0 >= 29) {
                    break L1;
                  } else {
                    ((nn) this).field_P = -31;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        String var2 = this.g(46);
        if (param0 <= 26) {
            return;
        }
        if (!((var2.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g(71)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          if (!param0) {
            break L0;
          } else {
            field_cb = -17;
            break L0;
          }
        }
        var2 = ((nn) this).field_A.length();
        if (((nn) this).field_V != var2) {
          var3 = 1 + ((nn) this).field_V;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (((nn) this).field_A.charAt(var3 + -1) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return ((nn) this).field_V;
        }
    }

    final static void a(String param0, float param1, int param2, boolean param3) {
        if (nl.field_a == null) {
            nl.field_a = new ug(mf.field_s, wg.field_b);
            mf.field_s.a((na) (Object) nl.field_a, false);
        }
        nl.field_a.a(param0, (byte) -122, param1, param3);
        ra.a();
        i.b(true, 122);
        int var4 = -4 % ((param2 - -53) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = 0;
    }
}
