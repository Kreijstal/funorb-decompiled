/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jf extends oa {
    static String field_W;
    static int field_hb;
    static String field_cb;
    static int field_ib;
    private boolean field_jb;
    private boolean field_ab;
    static String field_eb;
    private int field_lb;
    private int field_X;
    private int field_fb;
    private int field_bb;
    static String field_db;
    static int field_Z;
    static wk field_kb;
    static String field_gb;
    private long field_V;
    private long field_Y;

    private final String j(int param0) {
        int var2 = ((jf) this).field_fb <= ((jf) this).field_bb ? ((jf) this).field_fb : ((jf) this).field_bb;
        if (param0 <= 9) {
            return null;
        }
        int var3 = ((jf) this).field_bb >= ((jf) this).field_fb ? ((jf) this).field_bb : ((jf) this).field_fb;
        return ((jf) this).field_y.substring(var2, var3);
    }

    private final void a(int param0, int param1) {
        ((jf) this).field_fb = param0;
        if (!(fc.field_e[81])) {
            ((jf) this).field_bb = ((jf) this).field_fb;
        }
        int var3 = 24 / ((param1 - -31) / 55);
    }

    private final void l(int param0) {
        if (param0 != 67) {
            return;
        }
        if (!(!(((jf) this).field_A instanceof fd))) {
            ((fd) (Object) ((jf) this).field_A).a(true, (jf) this);
        }
    }

    final static void n() {
        Object var2 = null;
        nc.a(kf.field_o, (String) null, -80);
    }

    private final void h() {
        this.f((byte) -93);
        this.h((byte) 121);
    }

    jf(String param0, tn param1, int param2) {
        super(param0, param1);
        ((jf) this).field_X = -1;
        ((jf) this).field_V = 0L;
        ((jf) this).field_jb = false;
        try {
            ((jf) this).field_lb = param2;
            ((jf) this).field_p = ad.field_j.field_c;
            ((jf) this).a(param0, 29597, true);
            ((jf) this).field_ab = true;
            ((jf) this).field_Y = mm.a(-122);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(boolean param0) {
        field_kb = null;
        field_gb = null;
        field_eb = null;
        field_cb = null;
        if (!param0) {
            jf.d(false);
        }
        field_W = null;
        field_db = null;
    }

    private final void g() {
        try {
            int var2_int = 0;
            Exception var2 = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_int = 8;
                var3 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.h((byte) 127);
                int discarded$1 = 1;
                this.a(var3);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        eg var8 = null;
        long var6 = 0L;
        if (param1 >= -99) {
            this.l(-2);
        }
        if (((jf) this).field_p != null) {
            if (!(param3 != 0)) {
                ((jf) this).field_p.a(param2, (lh) this, (byte) -30, ((jf) this).field_K, param0);
                if (!(!(((jf) this).field_p instanceof eg))) {
                    var8 = (eg) (Object) ((jf) this).field_p;
                    if (((jf) this).field_bb != ((jf) this).field_fb) {
                        var8.a(param0, param2, false, ((jf) this).field_bb, (lh) this, ((jf) this).field_fb);
                    }
                    var6 = mm.a(-127);
                    if (!((var6 - ((jf) this).field_Y) % 1000L >= 500L)) {
                        var8.a((lh) this, ((jf) this).field_fb, param0, param2, (byte) 80);
                    }
                }
            }
        }
    }

    private final void a(String param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (-1 != ((jf) this).field_lb) {
                var3_int = ((jf) this).field_lb + -((jf) this).field_y.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((jf) this).field_fb == ((jf) this).field_y.length()) {
                ((jf) this).field_y = ((jf) this).field_y + param0;
                break L2;
              } else {
                ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_fb) + param0 + ((jf) this).field_y.substring(((jf) this).field_fb, ((jf) this).field_y.length());
                break L2;
              }
            }
            ((jf) this).field_fb = ((jf) this).field_fb + param0.length();
            ((jf) this).field_bb = ((jf) this).field_fb;
            ((jf) this).k(110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("jf.HB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + true + ')');
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        eg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 88, param2, param3);
              int discarded$2 = 1;
              this.e();
              if (((jf) this).field_w == 1) {
                L2: {
                  if (((jf) this).field_p instanceof eg) {
                    var5 = (eg) (Object) ((jf) this).field_p;
                    var6 = var5.a(param0, oh.field_f, (lh) this, (byte) 115, param3, pi.field_c);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((jf) this).field_jb) {
                          break L3;
                        } else {
                          if (((jf) this).field_X <= var6) {
                            break L3;
                          } else {
                            if (var6 > ((jf) this).field_bb) {
                              var6 = ((jf) this).field_X;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((jf) this).field_fb = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((jf) this).field_Y = mm.a(42);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("jf.H(").append(param0).append(',').append(112).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    private final void f(byte param0) {
        if (param0 >= -74) {
            jf.d(true);
        }
        String var2 = this.j(49);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(62)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static void c() {
        eb.a(0, jk.field_h, an.field_a, bd.field_f, od.field_g);
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = ((jf) this).field_y.length();
        if (((jf) this).field_fb != var2) {
          if (param0 < -118) {
            var3 = ((jf) this).field_fb - -1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (((jf) this).field_y.charAt(-1 + var3) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return 71;
          }
        } else {
          return ((jf) this).field_fb;
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_78_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_62_0 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        try {
          L0: {
            L1: {
              ((jf) this).field_Y = mm.a(-59);
              if (60 == param2) {
                break L1;
              } else {
                if (62 == param2) {
                  break L1;
                } else {
                  if (param0 == 30373) {
                    L2: {
                      if (32 > param2) {
                        break L2;
                      } else {
                        if (126 >= param2) {
                          L3: {
                            if (((jf) this).field_bb != ((jf) this).field_fb) {
                              this.h((byte) 117);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (((jf) this).field_lb == -1) {
                                break L5;
                              } else {
                                if (~((jf) this).field_y.length() <= ~((jf) this).field_lb) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (~((jf) this).field_fb > ~((jf) this).field_y.length()) {
                                ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_fb) + param2 + ((jf) this).field_y.substring(((jf) this).field_fb, ((jf) this).field_y.length());
                                ((jf) this).field_fb = ((jf) this).field_fb + 1;
                                ((jf) this).field_bb = ((jf) this).field_fb;
                                break L6;
                              } else {
                                ((jf) this).field_y = ((jf) this).field_y + param2;
                                int dupTemp$4 = ((jf) this).field_y.length();
                                ((jf) this).field_fb = dupTemp$4;
                                ((jf) this).field_bb = dupTemp$4;
                                break L6;
                              }
                            }
                            ((jf) this).k(-119);
                            break L4;
                          }
                          stackOut_78_0 = 1;
                          stackIn_79_0 = stackOut_78_0;
                          return stackIn_79_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if (param1 == 85) {
                        if (((jf) this).field_fb == ((jf) this).field_bb) {
                          if (0 < ((jf) this).field_fb) {
                            ((jf) this).field_bb = -1 + ((jf) this).field_fb;
                            this.h((byte) 127);
                            stackOut_66_0 = 1;
                            stackIn_67_0 = stackOut_66_0;
                            return stackIn_67_0 != 0;
                          } else {
                            break L7;
                          }
                        } else {
                          this.h((byte) 125);
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0 != 0;
                        }
                      } else {
                        if (param1 != 101) {
                          if (param1 != 13) {
                            if (param1 != 96) {
                              if (97 == param1) {
                                if (((jf) this).field_fb >= ((jf) this).field_y.length()) {
                                  break L7;
                                } else {
                                  L8: {
                                    stackOut_56_0 = this;
                                    stackIn_58_0 = stackOut_56_0;
                                    stackIn_57_0 = stackOut_56_0;
                                    if (fc.field_e[82]) {
                                      stackOut_58_0 = this;
                                      stackOut_58_1 = this.g(param0 ^ -30419);
                                      stackIn_59_0 = stackOut_58_0;
                                      stackIn_59_1 = stackOut_58_1;
                                      break L8;
                                    } else {
                                      stackOut_57_0 = this;
                                      stackOut_57_1 = 1 + ((jf) this).field_fb;
                                      stackIn_59_0 = stackOut_57_0;
                                      stackIn_59_1 = stackOut_57_1;
                                      break L8;
                                    }
                                  }
                                  this.a(stackIn_59_1, -105);
                                  stackOut_59_0 = 1;
                                  stackIn_60_0 = stackOut_59_0;
                                  return stackIn_60_0 != 0;
                                }
                              } else {
                                if (param1 != 102) {
                                  if (param1 != 103) {
                                    if (param1 != 84) {
                                      L9: {
                                        if (!fc.field_e[82]) {
                                          break L9;
                                        } else {
                                          if (param1 == 65) {
                                            int discarded$5 = 97;
                                            this.h();
                                            stackOut_53_0 = 1;
                                            stackIn_54_0 = stackOut_53_0;
                                            return stackIn_54_0 != 0;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (!fc.field_e[82]) {
                                          break L10;
                                        } else {
                                          if (param1 != 66) {
                                            break L10;
                                          } else {
                                            this.f((byte) -113);
                                            stackOut_46_0 = 1;
                                            stackIn_47_0 = stackOut_46_0;
                                            return stackIn_47_0 != 0;
                                          }
                                        }
                                      }
                                      if (!fc.field_e[82]) {
                                        break L7;
                                      } else {
                                        if (67 == param1) {
                                          int discarded$6 = 107;
                                          this.g();
                                          stackOut_51_0 = 1;
                                          stackIn_52_0 = stackOut_51_0;
                                          return stackIn_52_0 != 0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    } else {
                                      this.l(param0 + -30306);
                                      stackOut_39_0 = 1;
                                      stackIn_40_0 = stackOut_39_0;
                                      return stackIn_40_0 != 0;
                                    }
                                  } else {
                                    this.a(((jf) this).field_y.length(), 52);
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    return stackIn_37_0 != 0;
                                  }
                                } else {
                                  this.a(0, param0 + -30327);
                                  stackOut_33_0 = 1;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0 != 0;
                                }
                              }
                            } else {
                              if (((jf) this).field_fb > 0) {
                                L11: {
                                  stackOut_26_0 = this;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_27_0 = stackOut_26_0;
                                  if (!fc.field_e[82]) {
                                    stackOut_28_0 = this;
                                    stackOut_28_1 = -1 + ((jf) this).field_fb;
                                    stackIn_29_0 = stackOut_28_0;
                                    stackIn_29_1 = stackOut_28_1;
                                    break L11;
                                  } else {
                                    int discarded$7 = 0;
                                    stackOut_27_0 = this;
                                    stackOut_27_1 = this.m();
                                    stackIn_29_0 = stackOut_27_0;
                                    stackIn_29_1 = stackOut_27_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_29_1, -95);
                                stackOut_29_0 = 1;
                                stackIn_30_0 = stackOut_29_0;
                                return stackIn_30_0 != 0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            ((jf) this).i(-8521);
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          }
                        } else {
                          if (~((jf) this).field_fb == ~((jf) this).field_bb) {
                            if (((jf) this).field_fb < ((jf) this).field_y.length()) {
                              ((jf) this).field_bb = ((jf) this).field_fb + 1;
                              this.h((byte) 110);
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              return false;
                            }
                          } else {
                            this.h((byte) 114);
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          }
                        }
                      }
                    }
                    stackOut_80_0 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    break L0;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var5;
            stackOut_82_1 = new StringBuilder().append("jf.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param3 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L12;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + ')');
        }
        return stackIn_81_0 != 0;
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 < 109) {
            return;
        }
        if (((jf) this).field_fb != ((jf) this).field_bb) {
            var2 = ((jf) this).field_fb <= ((jf) this).field_bb ? ((jf) this).field_fb : ((jf) this).field_bb;
            var3 = ((jf) this).field_fb <= ((jf) this).field_bb ? ((jf) this).field_bb : ((jf) this).field_fb;
            ((jf) this).field_bb = var2;
            ((jf) this).field_fb = var2;
            ((jf) this).field_y = ((jf) this).field_y.substring(0, var2) + ((jf) this).field_y.substring(var3, ((jf) this).field_y.length());
            ((jf) this).k(-125);
        }
    }

    private final int m() {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (0 != ((jf) this).field_fb) {
          var2 = -1 + ((jf) this).field_fb;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((jf) this).field_y.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return ((jf) this).field_fb;
        }
    }

    void k(int param0) {
        int var2 = -78 / ((-37 - param0) / 43);
        if (((jf) this).field_A instanceof fd) {
            ((fd) (Object) ((jf) this).field_A).a((jf) this, (byte) 89);
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 29597) {
                break L1;
              } else {
                ((jf) this).field_fb = -23;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                break L2;
              } else {
                param0 = "";
                break L2;
              }
            }
            L3: {
              ((jf) this).field_y = param0;
              var4_int = param0.length();
              if (((jf) this).field_lb == -1) {
                break L3;
              } else {
                if (((jf) this).field_lb < var4_int) {
                  ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_lb);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$2 = ((jf) this).field_y.length();
              ((jf) this).field_bb = dupTemp$2;
              ((jf) this).field_fb = dupTemp$2;
              if (param2) {
                break L4;
              } else {
                ((jf) this).k(122);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("jf.EB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              if (((jf) this).field_p instanceof eg) {
                L1: {
                  var8_int = ((eg) (Object) ((jf) this).field_p).a(param2, oh.field_f, (lh) this, (byte) 115, param4, pi.field_c);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8_int != -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = var8_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, 62);
                  var8_long = mm.a(107);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-((jf) this).field_V + var8_long >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((jf) this).field_jb = stackIn_9_1 != 0;
                  if (((jf) this).field_jb) {
                    L4: {
                      int discarded$1 = 0;
                      ((jf) this).field_bb = this.m();
                      ((jf) this).field_fb = this.g(-122);
                      if (0 >= ((jf) this).field_fb) {
                        break L4;
                      } else {
                        if (((jf) this).field_y.charAt(-1 + ((jf) this).field_fb) == 32) {
                          ((jf) this).field_fb = ((jf) this).field_fb - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((jf) this).field_X = ((jf) this).field_fb;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((jf) this).field_V = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("jf.I(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void i(int param0) {
        if (param0 != -8521) {
            return;
        }
        ((jf) this).field_bb = 0;
        ((jf) this).field_fb = 0;
        ((jf) this).field_y = "";
        ((jf) this).k(-127);
    }

    private final void e() {
        da var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        eg var9 = null;
        var8 = SteelSentinels.field_G;
        if (((jf) this).field_ab) {
          if (!(((jf) this).field_p instanceof eg)) {
            return;
          } else {
            var9 = (eg) (Object) ((jf) this).field_p;
            var3 = var9.b(-1, (lh) this);
            var4 = var3.b((byte) -100);
            var5 = var9.a(5546, (lh) this);
            var6 = var9.a(118) >> 1;
            if (-var6 + var5 <= var4) {
              L0: {
                var7 = ((jf) this).field_u - -var3.a(1, ((jf) this).field_fb);
                if (-var6 + var5 < var7) {
                  ((jf) this).field_u = ((jf) this).field_u + -var6 + (var5 + -var7);
                  break L0;
                } else {
                  if (var6 <= var7) {
                    break L0;
                  } else {
                    ((jf) this).field_u = -var7 - (-var6 - ((jf) this).field_u);
                    break L0;
                  }
                }
              }
              L1: {
                if (((jf) this).field_u <= 0) {
                  if (((jf) this).field_u >= -var5 + var6) {
                    break L1;
                  } else {
                    ((jf) this).field_u = var6 + -var5;
                    break L1;
                  }
                } else {
                  ((jf) this).field_u = 0;
                  break L1;
                }
              }
              return;
            } else {
              ((jf) this).field_u = 0;
              ((jf) this).field_F = 0;
              return;
            }
          }
        } else {
          ((jf) this).field_u = 0;
          ((jf) this).field_F = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Wave: <%0>";
        field_hb = 64;
        field_eb = "F";
        field_cb = "Close";
        field_db = "You can spectate this game";
        field_Z = 2;
        field_gb = "The game options are not all set.";
    }
}
