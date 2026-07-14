/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends rg {
    private long field_Y;
    private boolean field_Z;
    static boolean field_W;
    private int field_S;
    static bi field_P;
    private int field_R;
    static mi field_U;
    private long field_T;
    private boolean field_X;
    private int field_Q;
    private int field_V;

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((ul) this).field_Q != ((ul) this).field_R) {
            var2 = ((ul) this).field_R < ((ul) this).field_Q ? ((ul) this).field_R : ((ul) this).field_Q;
            var3 = ((ul) this).field_Q <= ((ul) this).field_R ? ((ul) this).field_R : ((ul) this).field_Q;
            ((ul) this).field_Q = var2;
            ((ul) this).field_R = var2;
            ((ul) this).field_B = ((ul) this).field_B.substring(0, var2) + ((ul) this).field_B.substring(var3, ((ul) this).field_B.length());
            ((ul) this).k((byte) -126);
        }
        if (param0 >= -120) {
            ((ul) this).l((byte) -38);
        }
    }

    ul(String param0, uk param1, int param2) {
        super(param0, param1);
        ((ul) this).field_T = 0L;
        ((ul) this).field_Z = false;
        ((ul) this).field_V = -1;
        ((ul) this).field_S = param2;
        ((ul) this).field_n = bg.field_d.field_u;
        ((ul) this).a(true, false, param0);
        ((ul) this).field_X = true;
        ((ul) this).field_Y = ri.a(-3);
    }

    private final void b(int param0, int param1) {
        ((ul) this).field_Q = param1;
        if (param0 != -12521) {
            String discarded$0 = this.j(47);
        }
        if (!mc.field_e[81]) {
            ((ul) this).field_R = ((ul) this).field_Q;
        }
    }

    final void a(boolean param0, boolean param1, String param2) {
        if (param1) {
            ((ul) this).field_T = 93L;
        }
        if (param2 == null) {
            param2 = "";
        }
        ((ul) this).field_B = param2;
        int var4 = param2.length();
        if (0 != (((ul) this).field_S ^ -1)) {
            if (((ul) this).field_S < var4) {
                ((ul) this).field_B = ((ul) this).field_B.substring(0, ((ul) this).field_S);
            }
        }
        ((ul) this).field_R = ((ul) this).field_B.length();
        ((ul) this).field_Q = ((ul) this).field_B.length();
        if (!(param0)) {
            ((ul) this).k((byte) -126);
        }
    }

    final void l(byte param0) {
        ((ul) this).field_B = "";
        ((ul) this).field_Q = 0;
        ((ul) this).field_R = 0;
        ((ul) this).k((byte) -126);
        if (param0 < 13) {
            String discarded$0 = ul.k(-26);
        }
    }

    private final void j(byte param0) {
        this.h((byte) 32);
        this.m((byte) -124);
        if (param0 >= -14) {
            ((ul) this).field_S = -93;
        }
    }

    private final void g(int param0) {
        sc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pj var9 = null;
        var8 = Confined.field_J ? 1 : 0;
        if (((ul) this).field_X) {
          if (((ul) this).field_n instanceof pj) {
            var9 = (pj) (Object) ((ul) this).field_n;
            var3 = var9.a((fj) this, (byte) -114);
            if (param0 >= 111) {
              var4 = var3.a(true);
              var5 = var9.a((fj) this, -123);
              var6 = var9.a(-1431655766) >> 2021856001;
              if (var4 < -var6 + var5) {
                ((ul) this).field_y = 0;
                ((ul) this).field_v = 0;
                return;
              } else {
                L0: {
                  var7 = ((ul) this).field_v - -var3.a(((ul) this).field_Q, -125);
                  if (var7 > var5 + -var6) {
                    ((ul) this).field_v = ((ul) this).field_v + var5 - (var6 - -var7);
                    break L0;
                  } else {
                    if (var6 > var7) {
                      ((ul) this).field_v = -var7 - (-var6 - ((ul) this).field_v);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                L1: {
                  if (((ul) this).field_v <= 0) {
                    if (var6 + -var5 > ((ul) this).field_v) {
                      ((ul) this).field_v = -var5 - -var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((ul) this).field_v = 0;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ul) this).field_y = 0;
          ((ul) this).field_v = 0;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pj var5 = null;
        long var6 = 0L;
        if (param2 <= 36) {
            return;
        }
        if (((ul) this).field_n != null) {
            if (-1 == (param1 ^ -1)) {
                ((ul) this).field_n.a((byte) -122, param3, ((ul) this).field_L, (fj) this, param0);
                if (!(!(((ul) this).field_n instanceof pj))) {
                    var5 = (pj) (Object) ((ul) this).field_n;
                    if (!(((ul) this).field_Q == ((ul) this).field_R)) {
                        var5.a(param3, (fj) this, 0, ((ul) this).field_R, param0, ((ul) this).field_Q);
                    }
                    var6 = ri.a(-3);
                    if (500L > (var6 - ((ul) this).field_Y) % 1000L) {
                        var5.a(param3, (fj) this, param0, -71, ((ul) this).field_Q);
                    }
                }
            }
        }
    }

    private final int f(int param0) {
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        int var2 = ((ul) this).field_B.length();
        if (param0 != 0) {
            return 39;
        }
        if (var2 == ((ul) this).field_Q) {
            return ((ul) this).field_Q;
        }
        for (var3 = ((ul) this).field_Q - -1; var3 < var2; var3++) {
            // if_icmpeq L66
        }
        return var3;
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        ((ul) this).field_Y = ri.a(-3);
        if (param3 == 60) {
          return false;
        } else {
          if (param3 != 62) {
            L0: {
              if (param3 < 32) {
                break L0;
              } else {
                if (param3 <= 126) {
                  L1: {
                    if (((ul) this).field_Q == ((ul) this).field_R) {
                      break L1;
                    } else {
                      this.m((byte) -121);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (((ul) this).field_S == -1) {
                        break L3;
                      } else {
                        if (((ul) this).field_B.length() < ((ul) this).field_S) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (((ul) this).field_Q < ((ul) this).field_B.length()) {
                        ((ul) this).field_B = ((ul) this).field_B.substring(0, ((ul) this).field_Q) + param3 + ((ul) this).field_B.substring(((ul) this).field_Q, ((ul) this).field_B.length());
                        ((ul) this).field_Q = ((ul) this).field_Q + 1;
                        ((ul) this).field_R = ((ul) this).field_Q;
                        break L4;
                      } else {
                        ((ul) this).field_B = ((ul) this).field_B + param3;
                        ((ul) this).field_Q = ((ul) this).field_B.length();
                        ((ul) this).field_R = ((ul) this).field_B.length();
                        break L4;
                      }
                    }
                    ((ul) this).k((byte) -121);
                    break L2;
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L5: {
              if (85 == param2) {
                if (((ul) this).field_R == ((ul) this).field_Q) {
                  if (0 < ((ul) this).field_Q) {
                    ((ul) this).field_R = ((ul) this).field_Q + -1;
                    this.m((byte) -127);
                    return true;
                  } else {
                    break L5;
                  }
                } else {
                  this.m((byte) -123);
                  return true;
                }
              } else {
                if ((param2 ^ -1) != -102) {
                  if (param2 != 13) {
                    if ((param2 ^ -1) != -97) {
                      if ((param2 ^ -1) != -98) {
                        if (-103 != (param2 ^ -1)) {
                          if (103 != param2) {
                            if (-85 == (param2 ^ -1)) {
                              this.i((byte) 122);
                              return true;
                            } else {
                              L6: {
                                if (!mc.field_e[82]) {
                                  break L6;
                                } else {
                                  if (65 != param2) {
                                    break L6;
                                  } else {
                                    this.j((byte) -89);
                                    return true;
                                  }
                                }
                              }
                              L7: {
                                if (!mc.field_e[82]) {
                                  break L7;
                                } else {
                                  if (66 == param2) {
                                    this.h((byte) 71);
                                    return true;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (!mc.field_e[82]) {
                                break L5;
                              } else {
                                if (-68 == (param2 ^ -1)) {
                                  this.i(83);
                                  return true;
                                } else {
                                  var5 = -114 % ((param1 - 47) / 43);
                                  return false;
                                }
                              }
                            }
                          } else {
                            this.b(-12521, ((ul) this).field_B.length());
                            return true;
                          }
                        } else {
                          this.b(-12521, 0);
                          return true;
                        }
                      } else {
                        if (((ul) this).field_Q < ((ul) this).field_B.length()) {
                          L8: {
                            stackOut_26_0 = this;
                            stackOut_26_1 = -12521;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_28_1 = stackOut_26_1;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            if (!mc.field_e[82]) {
                              stackOut_28_0 = this;
                              stackOut_28_1 = stackIn_28_1;
                              stackOut_28_2 = ((ul) this).field_Q - -1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              stackIn_29_2 = stackOut_28_2;
                              break L8;
                            } else {
                              stackOut_27_0 = this;
                              stackOut_27_1 = stackIn_27_1;
                              stackOut_27_2 = this.f(0);
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              stackIn_29_2 = stackOut_27_2;
                              break L8;
                            }
                          }
                          this.b(stackIn_29_1, stackIn_29_2);
                          return true;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      if ((((ul) this).field_Q ^ -1) < -1) {
                        L9: {
                          stackOut_19_0 = this;
                          stackOut_19_1 = -12521;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          if (mc.field_e[82]) {
                            stackOut_21_0 = this;
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = this.h(-9674);
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            stackIn_22_2 = stackOut_21_2;
                            break L9;
                          } else {
                            stackOut_20_0 = this;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = -1 + ((ul) this).field_Q;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            stackIn_22_2 = stackOut_20_2;
                            break L9;
                          }
                        }
                        this.b(stackIn_22_1, stackIn_22_2);
                        return true;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    ((ul) this).l((byte) 101);
                    return true;
                  }
                } else {
                  if (((ul) this).field_R != ((ul) this).field_Q) {
                    this.m((byte) -126);
                    return true;
                  } else {
                    if (((ul) this).field_Q < ((ul) this).field_B.length()) {
                      ((ul) this).field_R = 1 + ((ul) this).field_Q;
                      this.m((byte) -122);
                      return true;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            var5 = -114 % ((param1 - 47) / 43);
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((ul) this).field_n instanceof pj) {
            var8_int = ((pj) (Object) ((ul) this).field_n).a((byte) 108, param3, jh.field_R, param0, ld.field_l, (fj) this);
            this.b(-12521, 0 == (var8_int ^ -1) ? 0 : var8_int);
            var8 = ri.a(-3);
            ((ul) this).field_Z = -((ul) this).field_T + var8 < 250L ? true : false;
            if (!(!((ul) this).field_Z)) {
                ((ul) this).field_R = this.h(param2 + -9765);
                ((ul) this).field_Q = this.f(0);
                if ((((ul) this).field_Q ^ -1) < -1) {
                    if (!(32 != ((ul) this).field_B.charAt(((ul) this).field_Q + -1))) {
                        ((ul) this).field_Q = ((ul) this).field_Q - 1;
                    }
                }
                ((ul) this).field_V = ((ul) this).field_Q;
            }
            ((ul) this).field_T = var8;
            return true;
        }
        return false;
    }

    final static String k(int param0) {
        if (2 > we.field_c) {
            return fb.field_c;
        }
        if (null != o.field_f) {
            if (!(o.field_f.b(0))) {
                return hc.field_s;
            }
            return b.field_k;
        }
        if (!(wc.field_Wb.b(0))) {
            return fi.field_b;
        }
        if (!(wc.field_Wb.a("commonui", 0))) {
            return dl.field_a + " - " + wc.field_Wb.b(-8087, "commonui") + "%";
        }
        if (!(i.field_r.b(0))) {
            return pb.field_a;
        }
        if (!i.field_r.a("commonui", 0)) {
            return qf.field_d + " - " + i.field_r.b(param0 + -8087, "commonui") + "%";
        }
        if (!tf.field_k.b(param0)) {
            return nl.field_d;
        }
        if (!tf.field_k.a(25057)) {
            return bd.field_c + " - " + tf.field_k.c(-123) + "%";
        }
        return hm.field_W;
    }

    void k(byte param0) {
        if (param0 > -117) {
            ((ul) this).field_X = false;
        }
        if (!(!(((ul) this).field_t instanceof uj))) {
            ((uj) (Object) ((ul) this).field_t).a(32175, (ul) this);
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        pj var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.g(122);
        if (!(1 != ((ul) this).field_o)) {
            if (!(!(((ul) this).field_n instanceof pj))) {
                var5 = (pj) (Object) ((ul) this).field_n;
                var6 = var5.a((byte) 77, param3, jh.field_R, param2, ld.field_l, (fj) this);
                if (!(-1 == var6)) {
                    if (((ul) this).field_Z) {
                        if (((ul) this).field_V > var6) {
                            if (((ul) this).field_R < var6) {
                                var6 = ((ul) this).field_V;
                            }
                        }
                    }
                    ((ul) this).field_Q = var6;
                }
            }
            ((ul) this).field_Y = ri.a(-3);
        }
    }

    private final void h(byte param0) {
        if (param0 <= 23) {
            boolean discarded$0 = ((ul) this).a((fj) null, (byte) -24, 52, 'ﾬ');
        }
        String var2 = this.j(82);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(82)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        nn.field_t[param2].d(param0, param4);
        pn.field_a.c(param1, 2 + param0, 14 + param4, 16777215, -1);
        if (param3 != -4245) {
            String discarded$0 = ul.k(69);
        }
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (param0 != ((ul) this).field_S) {
            var3 = ((ul) this).field_S + -((ul) this).field_B.length();
            if (!(-1 > var3)) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (((ul) this).field_Q != ((ul) this).field_B.length()) {
            ((ul) this).field_B = ((ul) this).field_B.substring(0, ((ul) this).field_Q) + param1 + ((ul) this).field_B.substring(((ul) this).field_Q, ((ul) this).field_B.length());
        } else {
            ((ul) this).field_B = ((ul) this).field_B + param1;
        }
        ((ul) this).field_Q = ((ul) this).field_Q + param1.length();
        ((ul) this).field_R = ((ul) this).field_Q;
        ((ul) this).k((byte) -119);
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_P = null;
        field_U = null;
    }

    private final int h(int param0) {
        int var3 = Confined.field_J ? 1 : 0;
        if (0 == ((ul) this).field_Q) {
            return ((ul) this).field_Q;
        }
        int var2 = ((ul) this).field_Q + -1;
        if (param0 != -9674) {
            return 26;
        }
        while (var2 > 0) {
            // if_icmpeq L61
            var2--;
        }
        return var2;
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.m((byte) -122);
              var3 = 127 / ((param0 - 5) / 59);
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

    private final void i(byte param0) {
        if (param0 <= 117) {
            return;
        }
        if (!(!(((ul) this).field_t instanceof uj))) {
            ((uj) (Object) ((ul) this).field_t).a((ul) this, (byte) 83);
        }
    }

    final static he[] a(hb param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        he[] var4 = null;
        int var5 = 0;
        he var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        var2 = param0.g(8, 0);
        if (var2 <= 0) {
          var3 = param0.g(12, param1 ^ param1);
          var4 = new he[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (!sm.a(param1 + -31570, param0)) {
                var6 = param0.g(ic.a(var5 + -1, (byte) 68), 0);
                var4[var5] = var4[var6];
                var5++;
                continue L0;
              } else {
                var6_ref = new he();
                int discarded$216 = param0.g(24, 0);
                int discarded$217 = param0.g(24, param1 + -31662);
                var6_ref.field_a = param0.g(24, param1 + -31662);
                int discarded$218 = param0.g(9, 0);
                int discarded$219 = param0.g(12, 0);
                int discarded$220 = param0.g(12, 0);
                int discarded$221 = param0.g(12, 0);
                var4[var5] = var6_ref;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final String j(int param0) {
        if (param0 != 82) {
            return null;
        }
        int var2 = ((ul) this).field_R < ((ul) this).field_Q ? ((ul) this).field_R : ((ul) this).field_Q;
        int var3 = ((ul) this).field_Q <= ((ul) this).field_R ? ((ul) this).field_R : ((ul) this).field_Q;
        return ((ul) this).field_B.substring(var2, var3);
    }

    static {
    }
}
