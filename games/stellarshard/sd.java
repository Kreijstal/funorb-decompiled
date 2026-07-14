/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private double field_a;
    private int field_e;
    static int field_d;
    private double field_g;
    private double field_h;
    static boolean field_i;
    static int field_b;
    private int field_c;
    private double field_f;

    final static wb a(byte param0, String param1) {
        int var5 = 0;
        String var6 = null;
        wb var7 = null;
        int var8 = stellarshard.field_B;
        int var2 = param1.length();
        if (!(-1 != (var2 ^ -1))) {
            return uj.field_d;
        }
        if (!(255 >= var2)) {
            return bg.field_a;
        }
        String[] var3 = qj.a('.', param1, 10287);
        if (-3 < (var3.length ^ -1)) {
            return uj.field_d;
        }
        String[] var4 = var3;
        if (param0 != -96) {
            Object var9 = null;
            sd.a((pb) null, (byte) 119, (String) null);
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ag.a(-1, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return eb.a(var3[-1 + var3.length], param0 ^ -30);
    }

    private final void a(byte param0) {
        if (param0 != 107) {
            return;
        }
        ((sd) this).field_h = ((sd) this).field_h + ((sd) this).field_g;
        ((sd) this).field_f = ((sd) this).field_f + ((sd) this).field_a;
    }

    final sd a(int param0) {
        L0: {
          this.a((byte) 107);
          ((sd) this).field_a = ((sd) this).field_a - 0.1;
          if (((sd) this).field_h >= 64.0) {
            break L0;
          } else {
            ((sd) this).field_g = ((sd) this).field_g + 0.1;
            break L0;
          }
        }
        if (param0 == 0) {
          L1: {
            if (64.0 < ((sd) this).field_h) {
              ((sd) this).field_g = ((sd) this).field_g - 0.1;
              break L1;
            } else {
              break L1;
            }
          }
          ((sd) this).field_g = ((sd) this).field_g * 0.99999;
          hk.field_p = hk.field_p - 1;
          lg.field_f = lg.field_f + 1;
          if (s.field_i) {
            if (((sd) this).field_h >= -384.0) {
              if (((sd) this).field_h > 384.0) {
                if (0 < ((sd) this).field_e) {
                  qb.field_k = qb.field_k + ((sd) this).field_e;
                  te.field_c = te.field_c + ((sd) this).field_e;
                  return null;
                } else {
                  return null;
                }
              } else {
                if (((sd) this).field_f < -304.0) {
                  L2: {
                    if (-1 > (((sd) this).field_e ^ -1)) {
                      te.field_c = te.field_c + ((sd) this).field_e;
                      cl.field_a = cl.field_a - ((sd) this).field_e;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return null;
                } else {
                  if (304.0 < ((sd) this).field_f) {
                    if (-1 > (((sd) this).field_e ^ -1)) {
                      te.field_c = te.field_c + ((sd) this).field_e;
                      qb.field_k = qb.field_k + ((sd) this).field_e;
                      return null;
                    } else {
                      return null;
                    }
                  } else {
                    return (sd) this;
                  }
                }
              }
            } else {
              L3: {
                if ((((sd) this).field_e ^ -1) < -1) {
                  cl.field_a = cl.field_a - ((sd) this).field_e;
                  te.field_c = te.field_c + ((sd) this).field_e;
                  break L3;
                } else {
                  break L3;
                }
              }
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        L0: {
          var2 = (int)(((sd) this).field_h + 320.0);
          var3 = (int)(((sd) this).field_f + 240.0);
          if (-1 <= (((sd) this).field_e ^ -1)) {
            L1: {
              var4 = ei.field_A;
              if ((((sd) this).field_e ^ -1) == 0) {
                var4 = gf.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2 != ((sd) this).field_e) {
                break L2;
              } else {
                var4 = ka.field_l;
                break L2;
              }
            }
            L3: {
              if ((((sd) this).field_e ^ -1) != 2) {
                break L3;
              } else {
                var4 = he.field_l;
                break L3;
              }
            }
            L4: {
              if (((sd) this).field_e != 3) {
                break L4;
              } else {
                var4 = td.field_e;
                break L4;
              }
            }
            L5: {
              if (4 != ((sd) this).field_e) {
                break L5;
              } else {
                var4 = nl.field_f;
                break L5;
              }
            }
            L6: {
              if (((sd) this).field_e == -6) {
                var4 = qh.field_h;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (6 != (((sd) this).field_e ^ -1)) {
                break L7;
              } else {
                var4 = we.field_e;
                break L7;
              }
            }
            L8: {
              if (((sd) this).field_e != -8) {
                break L8;
              } else {
                var4 = pe.field_a;
                break L8;
              }
            }
            L9: {
              if (((sd) this).field_e != 8) {
                break L9;
              } else {
                var4 = te.field_b;
                break L9;
              }
            }
            L10: {
              if (9 != ((sd) this).field_e) {
                break L10;
              } else {
                var4 = ha.field_x;
                break L10;
              }
            }
            L11: {
              if (10 != (((sd) this).field_e ^ -1)) {
                break L11;
              } else {
                var4 = fc.field_c;
                break L11;
              }
            }
            L12: {
              if (((sd) this).field_e == -12) {
                var4 = wg.field_e;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (-13 != ((sd) this).field_e) {
                break L13;
              } else {
                var4 = nb.field_O;
                break L13;
              }
            }
            L14: {
              if (((sd) this).field_e != -14) {
                break L14;
              } else {
                var4 = ja.field_k;
                break L14;
              }
            }
            L15: {
              if (14 == (((sd) this).field_e ^ -1)) {
                var4 = rd.field_b;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-16 == ((sd) this).field_e) {
                var4 = Integer.toString(ml.field_h);
                break L16;
              } else {
                break L16;
              }
            }
            qj.field_a.c(var4, var2 + -1, var3, 0, -1);
            qj.field_a.c(var4, 1 + var2, var3, 0, -1);
            qj.field_a.c(var4, var2, var3 - 1, 0, -1);
            qj.field_a.c(var4, var2, 1 + var3, 0, -1);
            qj.field_a.c(var4, var2, var3, ((sd) this).field_c, -1);
            break L0;
          } else {
            qj.field_a.c("" + ((sd) this).field_e, -1 + var2, var3, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2 + 1, var3, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3 - 1, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3 + 1, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3, ((sd) this).field_c, -1);
            break L0;
          }
        }
        L17: {
          if (param0) {
            break L17;
          } else {
            ((sd) this).field_f = -0.5996134405584707;
            break L17;
          }
        }
    }

    final static void a(pb param0, byte param1, String param2) {
        ve.field_a = param0;
        be.field_f = param2;
        if (param1 != 60) {
            Object var4 = null;
            wb discarded$0 = sd.a((byte) 87, (String) null);
        }
    }

    sd(int param0, qe param1, int param2) {
        ((sd) this).field_f = param1.field_l;
        ((sd) this).field_h = param1.field_a;
        ((sd) this).field_g = param1.field_d;
        ((sd) this).field_a = param1.field_k;
        ((sd) this).field_c = param2;
        ((sd) this).field_e = param0;
    }

    static {
    }
}
