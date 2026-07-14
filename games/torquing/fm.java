/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends hn implements ng {
    private lg field_C;
    static int field_E;
    private lg field_D;
    private lg field_B;
    static la field_F;

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 61 / ((param3 - -33) / 57);
        if (super.a(param0, param1, param2, -94)) {
            return true;
        }
        if (!(-99 != (param0 ^ -1))) {
            return ((fm) this).a((byte) -91, param1);
        }
        if (99 == param0) {
            return ((fm) this).b(param1, -9928);
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + ((fm) this).field_w;
        int var6 = param2 + ((fm) this).field_k;
        if (param1 > -7) {
            field_E = 119;
        }
        int discarded$0 = dg.field_e.a(jl.field_U, 20 + var5, var6 + 20, -40 + ((fm) this).field_p, -50 + ((fm) this).field_o, 16777215, -1, 1, 0, dg.field_e.field_x);
        super.a(param0, (byte) -112, param2, param3);
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Torquing.field_u;
        var3 = param0;
        var4 = param2.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = Torquing.field_u;
          if (param0 == 32) {
            break L0;
          } else {
            field_E = -78;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 >= param1) {
              break L2;
            } else {
              if (param1 < 128) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param1 < 160) {
              if (param1 == 0) {
                break L3;
              } else {
                var6 = ef.field_c;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              if (param1 <= 255) {
                break L1;
              } else {
                if (param1 == 0) {
                  break L3;
                } else {
                  var6 = ef.field_c;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L3;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        eo.field_a = param3;
        vo.field_g = param2;
        if (param1 != -78) {
            return;
        }
        jk.a(ii.field_m, (byte) -79, param0);
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var7 = Torquing.field_u;
        if (param0 > -85) {
            return;
        }
        if (((fm) this).field_D == param1) {
            og.a(9);
        } else {
            if (param1 == ((fm) this).field_C) {
                m.a(11);
            } else {
                if (!(((fm) this).field_B != param1)) {
                    eh.c((byte) 90);
                }
            }
        }
    }

    public fm() {
        super(0, 0, 476, 225, (el) null);
        ((fm) this).field_C = new lg(qh.field_e, (ca) null);
        ((fm) this).field_D = new lg(cm.field_k, (ca) null);
        ((fm) this).field_B = new lg(ha.field_c, (ca) null);
        rf var1 = new rf();
        ((fm) this).field_C.field_q = (el) (Object) var1;
        ((fm) this).field_D.field_q = (el) (Object) var1;
        ((fm) this).field_B.field_q = (el) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -616223903;
        ((fm) this).field_D.a((byte) -52, ((fm) this).field_p + -var3 >> 1024822977, -var2 + (-48 + ((fm) this).field_o), 30, var4);
        ((fm) this).field_B.a((byte) 126, (((fm) this).field_p + -var3 >> -1566153567) + var4 - -var2, -var2 + (-48 + ((fm) this).field_o), 30, var4);
        ((fm) this).field_C.a((byte) 124, -var3 + ((fm) this).field_p >> -740390367, -78 + ((fm) this).field_o + -(var2 * 2), 30, var3);
        ((fm) this).field_D.field_t = (ca) this;
        ((fm) this).field_C.field_t = (ca) this;
        ((fm) this).field_B.field_t = (ca) this;
        ((fm) this).field_C.field_n = um.field_q;
        ((fm) this).field_B.field_n = ll.field_m;
        ((fm) this).a((gm) (Object) ((fm) this).field_D, -6938);
        ((fm) this).a((gm) (Object) ((fm) this).field_C, -6938);
        ((fm) this).a((gm) (Object) ((fm) this).field_B, -6938);
    }

    public static void h(int param0) {
        if (param0 >= -11) {
            boolean discarded$0 = fm.a((byte) -83, 'K');
        }
        field_F = null;
    }

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        int var2 = param1.charAt(0);
        for (var3 = 1; param1.length() > var3; var3++) {
            if (var2 != param1.charAt(var3)) {
                return false;
            }
        }
        if (param0 > -66) {
            field_F = null;
            return true;
        }
        return true;
    }

    static {
    }
}
