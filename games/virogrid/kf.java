/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    private wb field_h;
    private wb field_i;
    static int field_e;
    static int[] field_j;
    static il field_c;
    private long field_d;
    private int field_b;
    static km field_g;
    private wb[] field_f;
    private int field_a;

    final wb b(int param0) {
        wb var2 = null;
        int var3 = 0;
        wb var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == -1) {
          L0: {
            if (0 >= ((kf) this).field_b) {
              break L0;
            } else {
              if (((kf) this).field_h == ((kf) this).field_f[((kf) this).field_b + -1]) {
                break L0;
              } else {
                var2 = ((kf) this).field_h;
                ((kf) this).field_h = var2.field_h;
                return var2;
              }
            }
          }
          L1: while (true) {
            if (((kf) this).field_b < ((kf) this).field_a) {
              int fieldTemp$3 = ((kf) this).field_b;
              ((kf) this).field_b = ((kf) this).field_b + 1;
              var4 = ((kf) this).field_f[fieldTemp$3].field_h;
              var2 = var4;
              if (var4 != ((kf) this).field_f[((kf) this).field_b + -1]) {
                ((kf) this).field_h = var2.field_h;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          kf.a(-101, -32);
          if (0 < ((kf) this).field_b) {
            if (((kf) this).field_h == ((kf) this).field_f[((kf) this).field_b + -1]) {
              L2: while (true) {
                if (((kf) this).field_b < ((kf) this).field_a) {
                  int fieldTemp$4 = ((kf) this).field_b;
                  ((kf) this).field_b = ((kf) this).field_b + 1;
                  var4 = ((kf) this).field_f[fieldTemp$4].field_h;
                  var2 = var4;
                  if (var4 != ((kf) this).field_f[((kf) this).field_b + -1]) {
                    ((kf) this).field_h = var2.field_h;
                    return var2;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var2 = ((kf) this).field_h;
              ((kf) this).field_h = var2.field_h;
              return var2;
            }
          } else {
            L3: while (true) {
              if (((kf) this).field_b < ((kf) this).field_a) {
                int fieldTemp$5 = ((kf) this).field_b;
                ((kf) this).field_b = ((kf) this).field_b + 1;
                var4 = ((kf) this).field_f[fieldTemp$5].field_h;
                var2 = var4;
                if (var4 != ((kf) this).field_f[((kf) this).field_b + -1]) {
                  ((kf) this).field_h = var2.field_h;
                  return var2;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -1) {
            return;
        }
        el.field_r = param0;
    }

    final wb a(boolean param0) {
        ((kf) this).field_b = 0;
        if (!param0) {
            return null;
        }
        return ((kf) this).b(-1);
    }

    public static void a(int param0) {
        if (param0 != -1) {
          kf.a(12);
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        }
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, boolean param5) {
        int var7 = 0;
        hg stackIn_2_0 = null;
        hg stackIn_3_0 = null;
        hg stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hg stackOut_1_0 = null;
        hg stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hg stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gk.field_g.g(param0, 8);
        gk.field_g.field_l = gk.field_g.field_l + 1;
        if (param3 < 4) {
          return;
        } else {
          L0: {
            var7 = gk.field_g.field_l;
            gk.field_g.a((byte) -66, param2);
            gk.field_g.a(param4, (byte) -119);
            gk.field_g.a(param1, 55);
            stackOut_1_0 = gk.field_g;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param5) {
              stackOut_3_0 = (hg) (Object) stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (hg) (Object) stackIn_2_0;
              stackOut_2_1 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((hg) (Object) stackIn_4_0).a(stackIn_4_1, 125);
          gk.field_g.b(-var7 + gk.field_g.field_l, -1);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wg param4, wg param5) {
        ng.field_P = param1;
        hd.field_e = param3;
        ma.field_h = param5;
        tg.field_D = param4;
        dj.field_e = param2;
        if (param0 == 0) {
            return;
        }
        boolean discarded$0 = kf.a((byte) -53);
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 0) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_e = -105;
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final wb c(int param0) {
        wb var2 = null;
        wb var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (((kf) this).field_i != null) {
          var2 = ((kf) this).field_f[(int)(((kf) this).field_d & (long)(-1 + ((kf) this).field_a))];
          L0: while (true) {
            if (var2 == ((kf) this).field_i) {
              if (param0 != 48) {
                return null;
              } else {
                ((kf) this).field_i = null;
                return null;
              }
            } else {
              if ((((kf) this).field_d ^ -1L) == (((kf) this).field_i.field_j ^ -1L)) {
                var3 = ((kf) this).field_i;
                ((kf) this).field_i = ((kf) this).field_i.field_h;
                return var3;
              } else {
                ((kf) this).field_i = ((kf) this).field_i.field_h;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final wb a(long param0, byte param1) {
        wb var4 = null;
        int var5_int = 0;
        wb var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        ((kf) this).field_d = param0;
        var4 = ((kf) this).field_f[(int)((long)(((kf) this).field_a + -1) & param0)];
        ((kf) this).field_i = var4.field_h;
        L0: while (true) {
          if (((kf) this).field_i != var4) {
            if (((kf) this).field_i.field_j != param0) {
              ((kf) this).field_i = ((kf) this).field_i.field_h;
              continue L0;
            } else {
              var5 = ((kf) this).field_i;
              ((kf) this).field_i = ((kf) this).field_i.field_h;
              return var5;
            }
          } else {
            var5_int = 59 / ((43 - param1) / 33);
            ((kf) this).field_i = null;
            return null;
          }
        }
    }

    final void a(long param0, wb param1, int param2) {
        wb var5 = null;
        L0: {
          if (null != param1.field_k) {
            param1.c(92);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((kf) this).field_f[(int)((long)(((kf) this).field_a + -1) & param0)];
        param1.field_h = var5;
        param1.field_k = var5.field_k;
        param1.field_k.field_h = param1;
        param1.field_h.field_k = param1;
        if (param2 != 30804) {
          return;
        } else {
          param1.field_j = param0;
          return;
        }
    }

    final static boolean a(byte param0) {
        bf var1 = null;
        int var2 = 0;
        int var3 = 0;
        bf var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        var4 = (bf) (Object) l.field_c.a((byte) -66);
        var1 = var4;
        if (var1 != null) {
          if (param0 == -74) {
            var2 = 0;
            L0: while (true) {
              if (var1.field_n > var2) {
                L1: {
                  if (var4.field_q[var2] == null) {
                    break L1;
                  } else {
                    if (var4.field_q[var2].field_a != 0) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                if (var4.field_r[var2] != null) {
                  if (0 == var4.field_r[var2].field_a) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            boolean discarded$5 = kf.a((byte) -15);
            var2 = 0;
            L2: while (true) {
              if (var1.field_n > var2) {
                L3: {
                  if (var4.field_q[var2] == null) {
                    break L3;
                  } else {
                    if (var4.field_q[var2].field_a != 0) {
                      break L3;
                    } else {
                      return false;
                    }
                  }
                }
                if (var4.field_r[var2] != null) {
                  if (0 == var4.field_r[var2].field_a) {
                    return false;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L2;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    kf(int param0) {
        int var2 = 0;
        wb var3 = null;
        ((kf) this).field_b = 0;
        ((kf) this).field_f = new wb[param0];
        ((kf) this).field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            wb dupTemp$2 = new wb();
            var3 = dupTemp$2;
            ((kf) this).field_f[var2] = dupTemp$2;
            var3.field_h = var3;
            var3.field_k = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
