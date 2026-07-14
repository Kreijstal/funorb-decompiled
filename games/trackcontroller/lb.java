/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends rh {
    static boolean field_M;
    private int field_L;
    private long field_R;
    static rd field_O;
    private boolean field_K;
    private long field_I;
    private boolean field_P;
    private int field_N;
    private int field_Q;
    private int field_J;

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          ((lb) this).field_I = qg.a(false);
          var5 = -37 % ((param0 - 17) / 51);
          if (param1 == 60) {
            break L0;
          } else {
            if (62 == param1) {
              break L0;
            } else {
              L1: {
                if (param1 < 32) {
                  break L1;
                } else {
                  if (param1 <= 126) {
                    L2: {
                      if (((lb) this).field_N == ((lb) this).field_Q) {
                        break L2;
                      } else {
                        this.j(29388);
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (((lb) this).field_J == -1) {
                          break L4;
                        } else {
                          if (((lb) this).field_s.length() < ((lb) this).field_J) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (((lb) this).field_Q < ((lb) this).field_s.length()) {
                          ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_Q) + param1 + ((lb) this).field_s.substring(((lb) this).field_Q, ((lb) this).field_s.length());
                          ((lb) this).field_Q = ((lb) this).field_Q + 1;
                          ((lb) this).field_N = ((lb) this).field_Q;
                          break L5;
                        } else {
                          ((lb) this).field_s = ((lb) this).field_s + param1;
                          ((lb) this).field_Q = ((lb) this).field_s.length();
                          ((lb) this).field_N = ((lb) this).field_s.length();
                          break L5;
                        }
                      }
                      ((lb) this).b(true);
                      break L3;
                    }
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                if (param3 != 85) {
                  if ((param3 ^ -1) == -102) {
                    if (((lb) this).field_Q != ((lb) this).field_N) {
                      this.j(29388);
                      return true;
                    } else {
                      if (((lb) this).field_Q >= ((lb) this).field_s.length()) {
                        break L6;
                      } else {
                        ((lb) this).field_N = 1 + ((lb) this).field_Q;
                        this.j(29388);
                        return true;
                      }
                    }
                  } else {
                    if (param3 == 13) {
                      ((lb) this).l(-90);
                      return true;
                    } else {
                      if ((param3 ^ -1) != -97) {
                        if (97 != param3) {
                          if (param3 == 102) {
                            this.a(-19166, 0);
                            return true;
                          } else {
                            if (-104 == (param3 ^ -1)) {
                              this.a(-19166, ((lb) this).field_s.length());
                              return true;
                            } else {
                              if (param3 != -85) {
                                L7: {
                                  if (!ni.field_m[82]) {
                                    break L7;
                                  } else {
                                    if (-66 == param3) {
                                      this.d((byte) 13);
                                      return true;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (!ni.field_m[82]) {
                                    break L8;
                                  } else {
                                    if (66 != param3) {
                                      break L8;
                                    } else {
                                      this.m(118);
                                      return true;
                                    }
                                  }
                                }
                                if (!ni.field_m[82]) {
                                  break L6;
                                } else {
                                  if (param3 == 67) {
                                    this.e((byte) 82);
                                    return true;
                                  } else {
                                    return false;
                                  }
                                }
                              } else {
                                this.c(false);
                                return true;
                              }
                            }
                          }
                        } else {
                          if (((lb) this).field_Q >= ((lb) this).field_s.length()) {
                            break L6;
                          } else {
                            L9: {
                              stackOut_22_0 = this;
                              stackOut_22_1 = -19166;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              if (!ni.field_m[82]) {
                                stackOut_24_0 = this;
                                stackOut_24_1 = stackIn_24_1;
                                stackOut_24_2 = 1 + ((lb) this).field_Q;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                stackIn_25_2 = stackOut_24_2;
                                break L9;
                              } else {
                                stackOut_23_0 = this;
                                stackOut_23_1 = stackIn_23_1;
                                stackOut_23_2 = this.r(0);
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                stackIn_25_2 = stackOut_23_2;
                                break L9;
                              }
                            }
                            this.a(stackIn_25_1, stackIn_25_2);
                            return true;
                          }
                        }
                      } else {
                        if ((((lb) this).field_Q ^ -1) >= -1) {
                          break L6;
                        } else {
                          L10: {
                            stackOut_16_0 = this;
                            stackOut_16_1 = -19166;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (ni.field_m[82]) {
                              stackOut_18_0 = this;
                              stackOut_18_1 = stackIn_18_1;
                              stackOut_18_2 = this.k(-1);
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              stackIn_19_2 = stackOut_18_2;
                              break L10;
                            } else {
                              stackOut_17_0 = this;
                              stackOut_17_1 = stackIn_17_1;
                              stackOut_17_2 = -1 + ((lb) this).field_Q;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              stackIn_19_2 = stackOut_17_2;
                              break L10;
                            }
                          }
                          this.a(stackIn_19_1, stackIn_19_2);
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  if (((lb) this).field_N == ((lb) this).field_Q) {
                    if (((lb) this).field_Q <= 0) {
                      break L6;
                    } else {
                      ((lb) this).field_N = -1 + ((lb) this).field_Q;
                      this.j(29388);
                      return true;
                    }
                  } else {
                    this.j(29388);
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

    public static void n(int param0) {
        if (param0 != -85) {
            lb.n(-22);
        }
        field_O = null;
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var3 = -49 % ((-7 - param0) / 53);
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.j(29388);
              this.a(0, var2);
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

    private final void c(boolean param0) {
        if (!(!(((lb) this).field_l instanceof se))) {
            ((se) (Object) ((lb) this).field_l).b(-28, (lb) this);
        }
        if (param0) {
            ((lb) this).field_N = -68;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4 + param4, param5, param6)) {
            return false;
        }
        if (!(!(((lb) this).field_y instanceof dl))) {
            var8_int = ((dl) (Object) ((lb) this).field_y).a(param6, kf.field_b, 81, fg.field_a, param5, (al) this);
            this.a(-19166, var8_int != -1 ? var8_int : 0);
            var8 = qg.a(false);
            ((lb) this).field_K = (-((lb) this).field_R + var8 ^ -1L) > -251L ? true : false;
            if (((lb) this).field_K) {
                ((lb) this).field_N = this.k(param4 + -1);
                ((lb) this).field_Q = this.r(0);
                if (0 < ((lb) this).field_Q) {
                    if (!(32 != ((lb) this).field_s.charAt(-1 + ((lb) this).field_Q))) {
                        ((lb) this).field_Q = ((lb) this).field_Q - 1;
                    }
                }
                ((lb) this).field_L = ((lb) this).field_Q;
            }
            ((lb) this).field_R = var8;
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        dl var8 = null;
        long var6 = 0L;
        if (param3 != 29221) {
            this.d((byte) 60);
        }
        if (((lb) this).field_y != null) {
            if (param0 == 0) {
                ((lb) this).field_y.a(-24969, (al) this, param2, ((lb) this).field_B, param1);
                if (((lb) this).field_y instanceof dl) {
                    var8 = (dl) (Object) ((lb) this).field_y;
                    if (((lb) this).field_Q != ((lb) this).field_N) {
                        var8.b(param1, param2, ((lb) this).field_Q, -84, ((lb) this).field_N, (al) this);
                    }
                    var6 = qg.a(false);
                    if (500L > (var6 + -((lb) this).field_I) % 1000L) {
                        var8.a(((lb) this).field_Q, (al) this, param3 ^ -29312, param2, param1);
                    }
                }
            }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        if (param1 == null) {
            param1 = "";
        }
        ((lb) this).field_s = param1;
        int var4 = -28 % ((param2 - 12) / 39);
        int var5 = param1.length();
        if ((((lb) this).field_J ^ -1) != 0) {
            if (((lb) this).field_J < var5) {
                ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_J);
            }
        }
        ((lb) this).field_N = ((lb) this).field_s.length();
        ((lb) this).field_Q = ((lb) this).field_s.length();
        if (!(param0)) {
            ((lb) this).b(true);
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -19166) {
            return;
        }
        ((lb) this).field_Q = param1;
        if (!(ni.field_m[81])) {
            ((lb) this).field_N = ((lb) this).field_Q;
        }
    }

    private final String p(int param0) {
        if (param0 > -82) {
            this.a(-5, 11);
        }
        int var2 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_Q : ((lb) this).field_N;
        int var3 = ((lb) this).field_N < ((lb) this).field_Q ? ((lb) this).field_Q : ((lb) this).field_N;
        return ((lb) this).field_s.substring(var2, var3);
    }

    private final void d(byte param0) {
        this.m(param0 + 110);
        if (param0 != 13) {
            return;
        }
        this.j(29388);
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        if (0 == ((lb) this).field_Q) {
            return ((lb) this).field_Q;
        }
        for (var2 = param0 + ((lb) this).field_Q; -1 > var2; var2--) {
            // if_icmpeq L50
        }
        return var2;
    }

    private final int r(int param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = ((lb) this).field_s.length();
        if (((lb) this).field_Q == var2) {
            return ((lb) this).field_Q;
        }
        if (param0 != 0) {
            lb.o(54);
        }
        for (var3 = 1 + ((lb) this).field_Q; var3 < var2; var3++) {
            // if_icmpeq L71
        }
        return var3;
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (param0 != 0) {
            return;
        }
        if (((lb) this).field_J != -1) {
            var3 = ((lb) this).field_J + -((lb) this).field_s.length();
            if (!(0 > var3)) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((lb) this).field_Q != ((lb) this).field_s.length()) {
            ((lb) this).field_s = ((lb) this).field_s.substring(0, ((lb) this).field_Q) + param1 + ((lb) this).field_s.substring(((lb) this).field_Q, ((lb) this).field_s.length());
        } else {
            ((lb) this).field_s = ((lb) this).field_s + param1;
        }
        ((lb) this).field_Q = ((lb) this).field_Q + param1.length();
        ((lb) this).field_N = ((lb) this).field_Q;
        ((lb) this).b(true);
    }

    private final void q(int param0) {
        int var2 = 0;
        dl var3 = null;
        rb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (((lb) this).field_P) {
          var2 = 124 / ((param0 - 28) / 54);
          if (((lb) this).field_y instanceof dl) {
            var3 = (dl) (Object) ((lb) this).field_y;
            var4 = var3.a((byte) 110, (al) this);
            var5 = var4.c(-1);
            var6 = var3.a((al) this, 121);
            var7 = var3.a((byte) 46) >> -95509567;
            if (-var7 + var6 > var5) {
              ((lb) this).field_o = 0;
              ((lb) this).field_A = 0;
              return;
            } else {
              L0: {
                var8 = ((lb) this).field_o + var4.a((byte) 111, ((lb) this).field_Q);
                if (var6 - var7 < var8) {
                  ((lb) this).field_o = -var7 - -var6 - (var8 - ((lb) this).field_o);
                  break L0;
                } else {
                  if (var7 > var8) {
                    ((lb) this).field_o = var7 - var8 + ((lb) this).field_o;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if ((((lb) this).field_o ^ -1) < -1) {
                  ((lb) this).field_o = 0;
                  break L1;
                } else {
                  if (((lb) this).field_o >= -var6 - -var7) {
                    break L1;
                  } else {
                    ((lb) this).field_o = var7 + -var6;
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((lb) this).field_o = 0;
          ((lb) this).field_A = 0;
          return;
        }
    }

    private final void m(int param0) {
        String var2 = this.p(-95);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(-87)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 <= 115) {
            Object var3 = null;
            ((lb) this).a(-33, -113, (byte) 101, (al) null);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        if (param0 != null) {
          L0: {
            var3 = param0.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                L1: {
                  var4 = r.a(param0, -11133);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (sf.a(var4.charAt(0), -33)) {
                          break L2;
                        } else {
                          if (sf.a(var4.charAt(var4.length() - 1), -33)) {
                            break L2;
                          } else {
                            var5 = 0;
                            if (param2 == 1236) {
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  if (var5 > 0) {
                                    return wd.field_J;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!sf.a((char) var7, param2 ^ -1269)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (var5 >= 2) {
                                    if (!param1) {
                                      return rb.field_d;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      return wd.field_J;
                    } else {
                      break L1;
                    }
                  }
                }
                return ei.field_j;
              }
            }
          }
          return ei.field_j;
        } else {
          return ei.field_j;
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        dl var7 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.q(param2 ^ 92);
        if (!(-2 != (((lb) this).field_r ^ -1))) {
            if (!(!(((lb) this).field_y instanceof dl))) {
                var7 = (dl) (Object) ((lb) this).field_y;
                var6 = var7.a(param0, kf.field_b, 119, fg.field_a, param1, (al) this);
                if (!((var6 ^ -1) == 0)) {
                    if (((lb) this).field_K) {
                        if (((lb) this).field_L > var6) {
                            if (!(((lb) this).field_N >= var6)) {
                                var6 = ((lb) this).field_L;
                            }
                        }
                    }
                    ((lb) this).field_Q = var6;
                }
            }
            ((lb) this).field_I = qg.a(false);
        }
    }

    void b(boolean param0) {
        if (!(!(((lb) this).field_l instanceof se))) {
            ((se) (Object) ((lb) this).field_l).a(-12230, (lb) this);
        }
        if (!param0) {
            ((lb) this).a(69, -108, 109, -105);
        }
    }

    lb(String param0, tg param1, int param2) {
        super(param0, param1);
        ((lb) this).field_L = -1;
        ((lb) this).field_K = false;
        ((lb) this).field_R = 0L;
        ((lb) this).field_y = field_O.field_e;
        ((lb) this).field_J = param2;
        ((lb) this).a(true, param0, -74);
        ((lb) this).field_P = true;
        ((lb) this).field_I = qg.a(false);
    }

    final static void o(int param0) {
        mc.field_H = new vd();
        re.field_g.b((al) (Object) mc.field_H, -103);
        if (param0 > -78) {
            Object var2 = null;
            String discarded$0 = lb.a((CharSequence) null, false, -68);
        }
    }

    final void l(int param0) {
        ((lb) this).field_s = "";
        ((lb) this).field_N = 0;
        ((lb) this).field_Q = 0;
        ((lb) this).b(true);
        if (param0 > -67) {
            ((lb) this).field_J = -105;
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((lb) this).field_N != ((lb) this).field_Q) {
            var2 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_Q : ((lb) this).field_N;
            var3 = ((lb) this).field_Q <= ((lb) this).field_N ? ((lb) this).field_N : ((lb) this).field_Q;
            ((lb) this).field_Q = var2;
            ((lb) this).field_N = var2;
            ((lb) this).field_s = ((lb) this).field_s.substring(0, var2) + ((lb) this).field_s.substring(var3, ((lb) this).field_s.length());
            ((lb) this).b(true);
        }
        if (param0 != 29388) {
            this.q(93);
        }
    }

    static {
    }
}
