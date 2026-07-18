/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static int field_c;
    private int field_e;
    private int field_a;
    static boolean field_j;
    private boolean field_k;
    private int field_h;
    int field_f;
    private int field_d;
    static int[] field_i;
    int field_g;
    static String field_b;
    private int field_l;

    final boolean d(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < 0) {
          L0: {
            L1: {
              if (((sf) this).field_d != 0) {
                break L1;
              } else {
                if (((sf) this).field_a == 84) {
                  break L1;
                } else {
                  if (((sf) this).field_a != 83) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final boolean e(byte param0) {
        if (param0 > -25) {
            return true;
        }
        return 97 == ((sf) this).field_a ? true : false;
    }

    final static o b(int param0) {
        int var4_int = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        int var1 = sa.field_l[0] * uj.field_b[0];
        byte[] var2 = jc.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ig.field_H[fi.a(255, (int) var2[var4_int])];
        }
        o var4 = new o(kl.field_a, we.field_e, ph.field_h[param0], qf.field_d[0], sa.field_l[0], uj.field_b[0], var3);
        og.a((byte) -97);
        return var4;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -9;
        field_i = null;
    }

    final static Boolean d(int param0) {
        Boolean var1 = n.field_b;
        n.field_b = null;
        return var1;
    }

    final void a(int param0, boolean param1) {
        L0: {
          ((sf) this).field_d = 0;
          ((sf) this).field_e = 0;
          ((sf) this).field_a = 0;
          if (((sf) this).field_l != 0) {
            break L0;
          } else {
            if (el.field_n != 96) {
              break L0;
            } else {
              L1: {
                if (0 < ((sf) this).field_f) {
                  break L1;
                } else {
                  ((sf) this).field_f = ((sf) this).field_g;
                  break L1;
                }
              }
              ((sf) this).field_f = ((sf) this).field_f - 1;
              ((sf) this).field_k = false;
              break L0;
            }
          }
        }
        L2: {
          if (0 == ((sf) this).field_l) {
            ((sf) this).field_a = el.field_n;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((sf) this).field_l != 0) {
            break L3;
          } else {
            if (97 == el.field_n) {
              ((sf) this).field_f = ((sf) this).field_f + 1;
              ((sf) this).field_k = false;
              if (((sf) this).field_g > ((sf) this).field_f) {
                break L3;
              } else {
                ((sf) this).field_f = 0;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (((sf) this).field_l != 0) {
            break L4;
          } else {
            L5: {
              if (el.field_n == 98) {
                break L5;
              } else {
                if (el.field_n == 99) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (((sf) this).field_f < 0) {
                ((sf) this).field_f = param0;
                break L6;
              } else {
                break L6;
              }
            }
            ((sf) this).field_k = false;
            break L4;
          }
        }
        L7: {
          if (!param1) {
            break L7;
          } else {
            ((sf) this).field_a = -114;
            break L7;
          }
        }
    }

    final static void b(boolean param0) {
        L0: {
          L1: {
            if (10 == fj.field_i) {
              break L1;
            } else {
              if (!rd.b(6144)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          jd.n(-110);
          fj.field_i = 11;
          break L0;
        }
        ib.field_o = true;
    }

    final void a(boolean param0) {
        ((sf) this).field_e = 0;
        ((sf) this).field_d = 0;
        ((sf) this).field_a = 0;
        if (0 == ((sf) this).field_l) {
            if (el.field_n == 98) {
                if (0 >= ((sf) this).field_f) {
                    ((sf) this).field_f = ((sf) this).field_g;
                }
                ((sf) this).field_k = false;
                ((sf) this).field_f = ((sf) this).field_f - 1;
            }
        }
        if (((sf) this).field_l == 0) {
            ((sf) this).field_a = el.field_n;
        }
        if (0 == ((sf) this).field_l) {
            if (el.field_n == 99) {
                ((sf) this).field_f = ((sf) this).field_f + 1;
                ((sf) this).field_k = false;
                if (!(((sf) this).field_f < ((sf) this).field_g)) {
                    ((sf) this).field_f = 0;
                }
            }
        }
        if (!param0) {
            ((sf) this).field_l = 75;
        }
    }

    final void a(int param0, int param1, int param2) {
        L0: {
          if (param0 <= -114) {
            break L0;
          } else {
            o discarded$1 = sf.b(54);
            break L0;
          }
        }
        if (~param1 <= ~((sf) this).field_g) {
          throw new IllegalArgumentException();
        } else {
          if (param2 >= ((sf) this).field_g) {
            throw new IllegalArgumentException();
          } else {
            L1: {
              ((sf) this).field_d = 0;
              ((sf) this).field_a = 0;
              ((sf) this).field_e = 0;
              if (hg.field_F == 0) {
                break L1;
              } else {
                ((sf) this).field_e = hg.field_F;
                ((sf) this).field_d = hg.field_F;
                ((sf) this).field_f = param2;
                ((sf) this).field_k = true;
                ((sf) this).field_h = qa.field_k;
                ((sf) this).field_l = hg.field_F;
                break L1;
              }
            }
            L2: {
              if (((sf) this).field_l == 0) {
                break L2;
              } else {
                if (wb.field_c == 0) {
                  break L2;
                } else {
                  L3: {
                    if (0 >= ((sf) this).field_h) {
                      ((sf) this).field_h = dh.field_i;
                      ((sf) this).field_e = ((sf) this).field_l;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((sf) this).field_h = ((sf) this).field_h - 1;
                  break L2;
                }
              }
            }
            L4: {
              if (0 != hg.field_F) {
                break L4;
              } else {
                if (wb.field_c != 0) {
                  break L4;
                } else {
                  ((sf) this).field_l = 0;
                  break L4;
                }
              }
            }
            L5: {
              if (((sf) this).field_l != 0) {
                break L5;
              } else {
                L6: {
                  if (((sf) this).field_k) {
                    break L6;
                  } else {
                    if (ne.field_d) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param1 < 0) {
                  if (!((sf) this).field_k) {
                    break L5;
                  } else {
                    ((sf) this).field_f = -1;
                    break L5;
                  }
                } else {
                  L7: {
                    if (~param1 == ~((sf) this).field_f) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((sf) this).field_f = param1;
                  ((sf) this).field_k = true;
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 <= 46) {
            return false;
        }
        return 0 != ((sf) this).field_l ? true : false;
    }

    final void a(byte param0, int param1) {
        if (param0 != 111) {
            boolean discarded$0 = ((sf) this).c(-3);
        }
        if (((sf) this).field_l == 0) {
            ((sf) this).field_f = param1;
            ((sf) this).field_k = false;
        }
    }

    final void b(byte param0) {
        int var2 = 57 / ((param0 - 45) / 60);
        ((sf) this).field_e = 0;
        ((sf) this).field_a = 0;
        ((sf) this).field_d = 0;
        if (!(((sf) this).field_l != 0)) {
            ((sf) this).field_a = el.field_n;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((sf) this).field_l = 0;
        ((sf) this).field_k = param0 ? true : false;
        if (param3 < 119) {
            return;
        }
        if (!((sf) this).field_k) {
            ((sf) this).field_f = param1;
        } else {
            ((sf) this).field_f = param2;
        }
    }

    final boolean f(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((sf) this).field_e = 92;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sf) this).field_e != 0) {
              break L2;
            } else {
              if (((sf) this).field_a == 84) {
                break L2;
              } else {
                if (((sf) this).field_a != 83) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean e(int param0) {
        if (param0 != 12542) {
            ((sf) this).field_h = -69;
        }
        return 103 == ((sf) this).field_a ? true : false;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        vg.field_I[kg.field_c] = param2;
        pd.field_e[kg.field_c] = kg.field_c;
        qg.field_c[kg.field_c] = param0;
        if (param0 > be.field_I) {
            dc.field_o = param0;
        }
        if (bb.field_G > param0) {
            bi.field_e = param0;
        }
        eh.field_a[kg.field_c] = param5;
        ld.field_M[kg.field_c] = param4;
        ma.field_n[kg.field_c] = param3;
        int var6 = param3 + (param4 + param5);
        int var7 = 0 != var6 ? param5 * 1000 / var6 : 0;
        l.field_a[kg.field_c] = var7;
        kg.field_c = kg.field_c + 1;
        if (!(dc.field_o >= var7)) {
            dc.field_o = var7;
        }
        if (bi.field_e > var7) {
            bi.field_e = var7;
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            ((sf) this).field_a = 110;
        }
        return 96 == ((sf) this).field_a ? true : false;
    }

    final boolean c(byte param0) {
        if (param0 != 11) {
            return true;
        }
        return 102 == ((sf) this).field_a ? true : false;
    }

    sf(int param0) {
        ((sf) this).field_k = false;
        ((sf) this).field_f = 0;
        ((sf) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_j = true;
    }
}
