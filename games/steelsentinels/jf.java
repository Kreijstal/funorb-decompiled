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

    final static void n(int param0) {
        Object var2 = null;
        nc.a(kf.field_o, (String) null, -80);
        if (param0 != 0) {
            jf.d(true);
        }
    }

    private final void h(int param0) {
        this.f((byte) -93);
        if (param0 != 97) {
            field_db = null;
        }
        this.h((byte) 121);
    }

    jf(String param0, tn param1, int param2) {
        super(param0, param1);
        ((jf) this).field_X = -1;
        ((jf) this).field_V = 0L;
        ((jf) this).field_jb = false;
        ((jf) this).field_lb = param2;
        ((jf) this).field_p = ad.field_j.field_c;
        ((jf) this).a(param0, 29597, true);
        ((jf) this).field_ab = true;
        ((jf) this).field_Y = mm.a(-122);
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

    private final void g(byte param0) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              var2_int = 24 / ((param0 - -70) / 45);
              var3 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.h((byte) 127);
              this.a(var3, true);
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
        eg var8 = null;
        long var6 = 0L;
        if (param1 >= -99) {
            this.l(-2);
        }
        if (((jf) this).field_p != null) {
            if (!(-1 != (param3 ^ -1))) {
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

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (!(-1 == ((jf) this).field_lb)) {
            var3 = ((jf) this).field_lb + -((jf) this).field_y.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((jf) this).field_fb != ((jf) this).field_y.length()) {
            ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_fb) + param0 + ((jf) this).field_y.substring(((jf) this).field_fb, ((jf) this).field_y.length());
        } else {
            ((jf) this).field_y = ((jf) this).field_y + param0;
        }
        ((jf) this).field_fb = ((jf) this).field_fb + param0.length();
        if (!param1) {
            ((jf) this).a(-72, (byte) -73, 73, 72);
        }
        ((jf) this).field_bb = ((jf) this).field_fb;
        ((jf) this).k(110);
    }

    void a(int param0, int param1, lh param2, int param3) {
        eg var7 = null;
        int var6 = 0;
        super.a(param0, 88, param2, param3);
        this.e(true);
        if (!(-2 != (((jf) this).field_w ^ -1))) {
            if (!(!(((jf) this).field_p instanceof eg))) {
                var7 = (eg) (Object) ((jf) this).field_p;
                var6 = var7.a(param0, oh.field_f, (lh) this, (byte) 115, param3, pi.field_c);
                if (var6 != -1) {
                    if (((jf) this).field_jb) {
                        if (((jf) this).field_X > var6) {
                            if (!(var6 <= ((jf) this).field_bb)) {
                                var6 = ((jf) this).field_X;
                            }
                        }
                    }
                    ((jf) this).field_fb = var6;
                }
            }
            ((jf) this).field_Y = mm.a(42);
        }
        if (param1 < 56) {
            this.g((byte) -9);
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

    final static void c(boolean param0) {
        eb.a(0, jk.field_h, an.field_a, bd.field_f, od.field_g);
        if (!param0) {
            field_kb = null;
        }
    }

    private final int g(int param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var2 = ((jf) this).field_y.length();
        if (((jf) this).field_fb == var2) {
            return ((jf) this).field_fb;
        }
        if (param0 >= -118) {
            return 71;
        }
        for (var3 = ((jf) this).field_fb - -1; var3 < var2; var3++) {
            // if_icmpeq L68
        }
        return var3;
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          ((jf) this).field_Y = mm.a(-59);
          if (60 == param2) {
            break L0;
          } else {
            if (62 == param2) {
              break L0;
            } else {
              if (param0 == 30373) {
                L1: {
                  if (32 > param2) {
                    break L1;
                  } else {
                    if (126 >= param2) {
                      L2: {
                        if (((jf) this).field_bb != ((jf) this).field_fb) {
                          this.h((byte) 117);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((jf) this).field_lb == -1) {
                            break L4;
                          } else {
                            if (((jf) this).field_y.length() >= ((jf) this).field_lb) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((jf) this).field_fb < ((jf) this).field_y.length()) {
                            ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_fb) + param2 + ((jf) this).field_y.substring(((jf) this).field_fb, ((jf) this).field_y.length());
                            ((jf) this).field_fb = ((jf) this).field_fb + 1;
                            ((jf) this).field_bb = ((jf) this).field_fb;
                            break L5;
                          } else {
                            ((jf) this).field_y = ((jf) this).field_y + param2;
                            ((jf) this).field_fb = ((jf) this).field_y.length();
                            ((jf) this).field_bb = ((jf) this).field_y.length();
                            break L5;
                          }
                        }
                        ((jf) this).k(-119);
                        break L3;
                      }
                      return true;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (-86 == param1) {
                    if (((jf) this).field_fb == ((jf) this).field_bb) {
                      if (0 < ((jf) this).field_fb) {
                        ((jf) this).field_bb = -1 + ((jf) this).field_fb;
                        this.h((byte) 127);
                        return true;
                      } else {
                        break L6;
                      }
                    } else {
                      this.h((byte) 125);
                      return true;
                    }
                  } else {
                    if (-102 != param1) {
                      if (param1 != 13) {
                        if (-97 != param1) {
                          if (97 == param1) {
                            if (((jf) this).field_fb >= ((jf) this).field_y.length()) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_44_0 = this;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (fc.field_e[82]) {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = this.g(param0 ^ -30419);
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  break L7;
                                } else {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = 1 + ((jf) this).field_fb;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_47_1, -105);
                              return true;
                            }
                          } else {
                            if (-103 != (param1 ^ -1)) {
                              if (param1 != 103) {
                                if (param1 != 84) {
                                  L8: {
                                    if (!fc.field_e[82]) {
                                      break L8;
                                    } else {
                                      if (param1 == 65) {
                                        this.h(97);
                                        return true;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!fc.field_e[82]) {
                                      break L9;
                                    } else {
                                      if ((param1 ^ -1) != -67) {
                                        break L9;
                                      } else {
                                        this.f((byte) -113);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!fc.field_e[82]) {
                                    break L6;
                                  } else {
                                    if (67 == param1) {
                                      this.g((byte) 107);
                                      return true;
                                    } else {
                                      break L6;
                                    }
                                  }
                                } else {
                                  this.l(param0 + -30306);
                                  return true;
                                }
                              } else {
                                this.a(((jf) this).field_y.length(), 52);
                                return true;
                              }
                            } else {
                              this.a(0, param0 + -30327);
                              return true;
                            }
                          }
                        } else {
                          if (-1 < ((jf) this).field_fb) {
                            L10: {
                              stackOut_21_0 = this;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (!fc.field_e[82]) {
                                stackOut_23_0 = this;
                                stackOut_23_1 = -1 + ((jf) this).field_fb;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                break L10;
                              } else {
                                stackOut_22_0 = this;
                                stackOut_22_1 = this.m(0);
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_24_1 = stackOut_22_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_24_1, -95);
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        ((jf) this).i(-8521);
                        return true;
                      }
                    } else {
                      if (((jf) this).field_fb == ((jf) this).field_bb) {
                        if (((jf) this).field_fb < ((jf) this).field_y.length()) {
                          ((jf) this).field_bb = ((jf) this).field_fb + 1;
                          this.h((byte) 110);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        this.h((byte) 114);
                        return true;
                      }
                    }
                  }
                }
                return false;
              } else {
                return true;
              }
            }
          }
        }
        return false;
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

    private final int m(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        if (param0 == ((jf) this).field_fb) {
            return ((jf) this).field_fb;
        }
        for (var2 = -1 + ((jf) this).field_fb; (var2 ^ -1) < -1; var2--) {
            // if_icmpeq L52
        }
        return var2;
    }

    void k(int param0) {
        int var2 = -78 / ((-37 - param0) / 43);
        if (((jf) this).field_A instanceof fd) {
            ((fd) (Object) ((jf) this).field_A).a((jf) this, (byte) 89);
        }
    }

    final void a(String param0, int param1, boolean param2) {
        if (param1 != 29597) {
            ((jf) this).field_fb = -23;
        }
        if (param0 == null) {
            param0 = "";
        }
        ((jf) this).field_y = param0;
        int var4 = param0.length();
        if (0 != (((jf) this).field_lb ^ -1)) {
            if (!(((jf) this).field_lb >= var4)) {
                ((jf) this).field_y = ((jf) this).field_y.substring(0, ((jf) this).field_lb);
            }
        }
        ((jf) this).field_bb = ((jf) this).field_y.length();
        ((jf) this).field_fb = ((jf) this).field_y.length();
        if (!param2) {
            ((jf) this).k(122);
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (!(((jf) this).field_p instanceof eg)) {
                return false;
            }
            var8_int = ((eg) (Object) ((jf) this).field_p).a(param2, oh.field_f, (lh) this, (byte) 115, param4, pi.field_c);
            this.a((var8_int ^ -1) == 0 ? 0 : var8_int, 62);
            var8 = mm.a(107);
            ((jf) this).field_jb = -251L < (-((jf) this).field_V + var8 ^ -1L) ? true : false;
            if (!(!((jf) this).field_jb)) {
                ((jf) this).field_bb = this.m(0);
                ((jf) this).field_fb = this.g(-122);
                if (0 < ((jf) this).field_fb) {
                    if (!(((jf) this).field_y.charAt(-1 + ((jf) this).field_fb) != 32)) {
                        ((jf) this).field_fb = ((jf) this).field_fb - 1;
                    }
                }
                ((jf) this).field_X = ((jf) this).field_fb;
            }
            ((jf) this).field_V = var8;
            return true;
        }
        return false;
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

    private final void e(boolean param0) {
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
            var6 = var9.a(118) >> 2102225089;
            if (-var6 + var5 <= var4) {
              var7 = ((jf) this).field_u - -var3.a(1, ((jf) this).field_fb);
              if (param0) {
                L0: {
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
                  if ((((jf) this).field_u ^ -1) >= -1) {
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
                return;
              }
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
