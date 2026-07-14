/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String[] field_d;
    static String field_a;
    static og field_b;
    static int[] field_e;
    private uf field_g;
    private jj field_c;
    static te field_f;

    final uf c(int param0) {
        uf var2 = ((k) this).field_g;
        if (param0 < 1) {
            return null;
        }
        if (!(var2 != ((k) this).field_c.field_a)) {
            ((k) this).field_g = null;
            return null;
        }
        ((k) this).field_g = var2.field_d;
        return var2;
    }

    final static void a(int param0, String param1, boolean param2) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          dj.field_d = false;
          if (!param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        fd.field_k = stackIn_3_0 != 0;
        if (null != nb.field_b) {
          if (nb.field_b.field_J) {
            L1: {
              if (-9 != (param0 ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (qi.field_b) {
                    param1 = em.field_b;
                    break L2;
                  } else {
                    param1 = bi.field_c;
                    break L2;
                  }
                }
                param0 = 2;
                mb.field_s.a(ol.field_Hb, -1);
                break L1;
              }
            }
            L3: {
              var3 = 1;
              if ((param0 ^ -1) != -11) {
                break L3;
              } else {
                cm.a((byte) 124);
                var3 = 0;
                break L3;
              }
            }
            L4: {
              if (var3 != 0) {
                L5: {
                  if (!dj.field_d) {
                    break L5;
                  } else {
                    param1 = ij.a(new String[1], -1, fd.field_q);
                    break L5;
                  }
                }
                L6: {
                  if (!ok.field_h) {
                    break L6;
                  } else {
                    param1 = ld.field_g;
                    break L6;
                  }
                }
                nb.field_b.a(true, param1, param0);
                break L4;
              } else {
                break L4;
              }
            }
            if (param0 != 256) {
              if (param0 != 10) {
                if (!qi.field_b) {
                  mb.field_s.g((byte) -107);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final uf a(byte param0, uf param1) {
        uf var4 = null;
        int var3 = 88 / ((-52 - param0) / 61);
        if (param1 == null) {
            var4 = ((k) this).field_c.field_a.field_d;
        } else {
            var4 = param1;
        }
        if (!(var4 != ((k) this).field_c.field_a)) {
            ((k) this).field_g = null;
            return null;
        }
        ((k) this).field_g = var4.field_d;
        return var4;
    }

    final static fd a(int param0) {
        if (qb.field_b != null) {
          if (param0 < 26) {
            field_a = null;
            return qb.field_b;
          } else {
            return qb.field_b;
          }
        } else {
          qb.field_b = new fd(ra.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, ra.field_l.field_s, -1, 2147483647, true);
          if (param0 >= 26) {
            return qb.field_b;
          } else {
            field_a = null;
            return qb.field_b;
          }
        }
    }

    final uf b(int param0) {
        uf var2 = null;
        var2 = ((k) this).field_c.field_a.field_a;
        if (var2 != ((k) this).field_c.field_a) {
          if (param0 <= 45) {
            field_b = null;
            ((k) this).field_g = var2.field_a;
            return var2;
          } else {
            ((k) this).field_g = var2.field_a;
            return var2;
          }
        } else {
          ((k) this).field_g = null;
          return null;
        }
    }

    final uf a(int param0, uf param1) {
        uf var3 = null;
        if (param0 >= 22) {
          L0: {
            if (param1 == null) {
              var3 = ((k) this).field_c.field_a.field_a;
              break L0;
            } else {
              var3 = param1;
              break L0;
            }
          }
          if (((k) this).field_c.field_a == var3) {
            ((k) this).field_g = null;
            return null;
          } else {
            ((k) this).field_g = var3.field_a;
            return var3;
          }
        } else {
          return null;
        }
    }

    final uf a(byte param0) {
        uf var2 = null;
        var2 = ((k) this).field_c.field_a.field_d;
        if (param0 == -13) {
          if (((k) this).field_c.field_a == var2) {
            ((k) this).field_g = null;
            return null;
          } else {
            ((k) this).field_g = var2.field_d;
            return var2;
          }
        } else {
          field_b = null;
          if (((k) this).field_c.field_a == var2) {
            ((k) this).field_g = null;
            return null;
          } else {
            ((k) this).field_g = var2.field_d;
            return var2;
          }
        }
    }

    k(jj param0) {
        ((k) this).field_c = param0;
    }

    final uf d(int param0) {
        uf var2 = null;
        if (param0 > -78) {
            field_a = null;
            var2 = ((k) this).field_g;
            if (!(var2 != ((k) this).field_c.field_a)) {
                ((k) this).field_g = null;
                return null;
            }
            ((k) this).field_g = var2.field_a;
            return var2;
        }
        var2 = ((k) this).field_g;
        if (!(var2 != ((k) this).field_c.field_a)) {
            ((k) this).field_g = null;
            return null;
        }
        ((k) this).field_g = var2.field_a;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Moving and shooting", "Your normal cursor is shown by this green box. If the box is over a staircase, an arrow will appear to denote which direction the stairs travel.", "By left clicking on the terrain, the movement cursor will appear with a number saying how much time it will take to move to this position. Click once more to confirm and your soldier will move.", "If the cursor is positioned over a controllable soldier, it will turn blue. Click to select the soldier.", "Moving the cursor over an enemy will change the cursor to a red targeting icon. Left clicking will make your soldier fire a shot at the target. If you select your gun from the console you will enter auto-fire mode allowing you to fire at any position on the landscape. This is useful for explosive weapons or if you cannot see your target.", "If a soldier is in ready mode, they will automatically crouch when next to cover such as a low wall or hedge. Enemy fire is likely to hit the cover and thus not injure your soldier. Remember that cover can be destroyed by explosives or powerful guns."};
        field_e = new int[8192];
        field_a = "MML-4";
        field_b = new og();
    }
}
