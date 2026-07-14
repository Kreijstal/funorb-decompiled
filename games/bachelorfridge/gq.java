/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ana {
    private boolean field_v;
    private taa field_A;
    static int field_z;
    static String field_G;
    static boolean field_x;
    private int field_C;
    static kv field_E;
    private ct field_D;
    private int field_y;
    private int field_B;
    private int field_H;
    private int field_w;
    private ad field_F;

    public static void b(boolean param0) {
        field_G = null;
        field_E = null;
        if (param0) {
            gq.a(false, -86);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 19626) {
            return;
        }
        nw.a(false, param0, (byte) 85);
    }

    gq(gj param0, ct param1) {
        super(param0, (bca) (Object) param1);
        ((gq) this).field_v = false;
        ((gq) this).field_D = param1;
        bj var4 = (bj) (Object) ((gq) this).field_D.field_o.b((byte) 90);
        ((gq) this).field_F = var4.field_h.a(-27449, ((gq) this).field_q);
        ((gq) this).field_y = -((gq) this).field_F.field_s.field_x + var4.field_i;
        ((gq) this).field_w = var4.field_l - ((gq) this).field_F.field_s.field_J;
        ((gq) this).field_H = (int)Math.sqrt((double)((((gq) this).field_w * ((gq) this).field_w + ((gq) this).field_y * ((gq) this).field_y) * 100));
        ((gq) this).field_C = (int)Math.sqrt((double)(256 * (((gq) this).field_y * ((gq) this).field_y - -(((gq) this).field_w * ((gq) this).field_w))));
        ((gq) this).field_A = new taa(((gq) this).field_q, ((gq) this).field_F);
        ((gq) this).a(27799, (at) (Object) ((gq) this).field_A);
        ((gq) this).field_B = 25 + ((gq) this).field_H;
        ((gq) this).field_F.field_o = 0;
        ((gq) this).field_F.field_r = 0;
    }

    private final void e(byte param0) {
        if (param0 != 49) {
          return;
        } else {
          this.d(6);
          this.f((byte) 107);
          ((gq) this).field_F.field_o = 0;
          ((gq) this).field_F.field_k = 0;
          ((gq) this).field_F.field_r = 0;
          return;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((gq) this).field_A.a((byte) -106)) {
          return false;
        } else {
          if (((gq) this).field_H - -12 > ((gq) this).field_B) {
            if (!((gq) this).field_v) {
              ((gq) this).field_v = true;
              aba.a((byte) 89, 34);
              ((gq) this).field_B = ((gq) this).field_B - 1;
              if (-1 <= (((gq) this).field_B - 1 ^ -1)) {
                if (-25 > ((gq) this).field_B) {
                  return true;
                } else {
                  L0: {
                    if (((gq) this).field_B == 0) {
                      this.e((byte) 49);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return false;
                }
              } else {
                if (((gq) this).field_B >= ((gq) this).field_H) {
                  return false;
                } else {
                  L1: {
                    var2 = ((gq) this).field_H >> -595130527;
                    ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << -610594096) / ((gq) this).field_H;
                    ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                    if (var2 < -10 + ((gq) this).field_H) {
                      var2 = ((gq) this).field_H + -10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((gq) this).field_F.field_o = (((gq) this).field_y << -210274800) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                  ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                  var3 = 85 % ((71 - param0) / 47);
                  return false;
                }
              }
            } else {
              ((gq) this).field_B = ((gq) this).field_B - 1;
              if (-1 <= (((gq) this).field_B - 1 ^ -1)) {
                if (-25 > ((gq) this).field_B) {
                  return true;
                } else {
                  L2: {
                    if (((gq) this).field_B == 0) {
                      this.e((byte) 49);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return false;
                }
              } else {
                if (((gq) this).field_B >= ((gq) this).field_H) {
                  return false;
                } else {
                  L3: {
                    var2 = ((gq) this).field_H >> -595130527;
                    ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << -610594096) / ((gq) this).field_H;
                    ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                    if (var2 < -10 + ((gq) this).field_H) {
                      var2 = ((gq) this).field_H + -10;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((gq) this).field_F.field_o = (((gq) this).field_y << -210274800) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                  ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                  var3 = 85 % ((71 - param0) / 47);
                  return false;
                }
              }
            }
          } else {
            ((gq) this).field_B = ((gq) this).field_B - 1;
            if (-1 <= (((gq) this).field_B - 1 ^ -1)) {
              if (-25 <= ((gq) this).field_B) {
                if (((gq) this).field_B != 0) {
                  return false;
                } else {
                  this.e((byte) 49);
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (((gq) this).field_B >= ((gq) this).field_H) {
                return false;
              } else {
                L4: {
                  var2 = ((gq) this).field_H >> -595130527;
                  ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << -610594096) / ((gq) this).field_H;
                  ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                  if (var2 < -10 + ((gq) this).field_H) {
                    var2 = ((gq) this).field_H + -10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((gq) this).field_F.field_o = (((gq) this).field_y << -210274800) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                var3 = 85 % ((71 - param0) / 47);
                return false;
              }
            }
          }
        }
    }

    private final void d(int param0) {
        pp var3 = null;
        ad var4 = null;
        bj var5 = null;
        ad var6 = null;
        int var7 = 0;
        aga var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = ((gq) this).field_D.field_l.a(36, ((gq) this).field_q.field_h);
        if (var8.i(-114)) {
          return;
        } else {
          if (param0 != 6) {
            return;
          } else {
            var3 = (pp) (Object) ((gq) this).field_D.field_o.b((byte) 90);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                L1: {
                  var4 = var3.field_h.a(param0 ^ -27455, ((gq) this).field_q);
                  var4.b(-1, 6);
                  if (var3 instanceof bj) {
                    var5 = (bj) (Object) var3;
                    var6 = var5.field_h.a(-27449, ((gq) this).field_q);
                    ((gq) this).field_q.a(var5.field_i, var6, (byte) 48, var5.field_l);
                    break L1;
                  } else {
                    if (var3 instanceof iv) {
                      break L1;
                    } else {
                      var3.a(var8, ((gq) this).field_q.field_h, param0 ^ 10);
                      break L1;
                    }
                  }
                }
                var3 = (pp) (Object) ((gq) this).field_D.field_o.c(0);
                continue L0;
              }
            }
          }
        }
    }

    private final void f(byte param0) {
        aga var2 = null;
        pp var3 = null;
        ad var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((gq) this).field_D.field_l.a(70, ((gq) this).field_q.field_h);
        if (var2.i(-112)) {
          return;
        } else {
          if (param0 < 37) {
            return;
          } else {
            var3 = (pp) (Object) ((gq) this).field_D.field_o.b((byte) 90);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                L1: {
                  var4 = var3.field_h.a(-27449, ((gq) this).field_q);
                  var4.b(-1, 6);
                  if (var3 instanceof iv) {
                    var3.a(var2, ((gq) this).field_q.field_h, 12);
                    ((gq) this).a(27799, (at) (Object) new ek(((gq) this).field_q, var4, var3.field_f));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (pp) (Object) ((gq) this).field_D.field_o.c(0);
                continue L0;
              }
            }
          }
        }
    }

    static {
    }
}
