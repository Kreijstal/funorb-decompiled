/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    private fa field_f;
    private fa field_i;
    private fa[] field_g;
    static String field_d;
    static sb field_c;
    private int field_e;
    static String field_h;
    private int field_a;
    static String field_b;

    final fa a(int param0, long param1) {
        fa var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != -25484) {
            Object var7 = null;
            byte[] discarded$0 = nl.a((pc) null, (byte[]) null, -80, 17);
        }
        fa var4 = ((nl) this).field_g[(int)(param1 & (long)(((nl) this).field_a + -1))];
        ((nl) this).field_i = var4.field_a;
        while (var4 != ((nl) this).field_i) {
            if ((((nl) this).field_i.field_e ^ -1L) == (param1 ^ -1L)) {
                var5 = ((nl) this).field_i;
                ((nl) this).field_i = ((nl) this).field_i.field_a;
                return var5;
            }
            ((nl) this).field_i = ((nl) this).field_i.field_a;
        }
        ((nl) this).field_i = null;
        return null;
    }

    final fa a(byte param0) {
        if (param0 > -95) {
            return null;
        }
        ((nl) this).field_e = 0;
        return ((nl) this).a(54);
    }

    final static void a(boolean param0, int param1) {
        nd.field_b = param0 ? new wo(ch.field_H, an.field_a) : new wo(fb.field_Gb, vd.field_a);
        ff.field_h = new ak(0L, (ak) null);
        if (param1 >= -68) {
            nl.b(-102);
        }
        ff.field_h.a((ak) (Object) nd.field_b.field_g, (byte) 26);
        ff.field_h.a(gk.field_kb, (byte) 26);
        ra.field_e = new ak(0L, cm.field_o);
        kh.field_a = new ak(0L, (ak) null);
        ra.field_e.a(ih.field_g, (byte) 26);
        ra.field_e.a(kh.field_a, (byte) 26);
        kh.field_a.a(oc.field_O, (byte) 26);
        kh.field_a.a(hb.field_eb, (byte) 26);
        hn.a((byte) 32, param0);
    }

    final static byte[] a(pc param0, byte[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (param3 >= 59) {
            break L0;
          } else {
            var9 = null;
            byte[] discarded$2 = nl.a((pc) null, (byte[]) null, 62, -90);
            break L0;
          }
        }
        var4 = param0.c(param2, (byte) -34);
        if (var4 != 0) {
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (var4 == param1.length) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param1 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param0.c(3, (byte) -34);
            var6 = (byte)param0.c(8, (byte) -34);
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)(param0.c(var5, (byte) -34) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final void a(long param0, int param1, fa param2) {
        if (param1 <= 120) {
            fa discarded$0 = ((nl) this).a(-40);
        }
        if (!(param2.field_h == null)) {
            param2.c(2779);
        }
        fa var5 = ((nl) this).field_g[(int)(param0 & (long)(-1 + ((nl) this).field_a))];
        param2.field_h = var5.field_h;
        param2.field_a = var5;
        param2.field_h.field_a = param2;
        param2.field_e = param0;
        param2.field_a.field_h = param2;
    }

    final static void a(int param0, boolean param1) {
        rd.a(param1, -17130, false);
        if (param0 != 0) {
            nl.a(-72, false);
        }
    }

    final static int a(boolean param0) {
        if (hf.field_q >= 2) {
          L0: {
            if (wo.field_d == 0) {
              if (!wk.field_j.b(-3)) {
                return 20;
              } else {
                if (wk.field_j.a("commonui", -1)) {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (qo.field_u.b(-3)) {
                        if (!qo.field_u.a((byte) 92)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (null != hn.field_e) {
                  if (hn.field_e.b(-3)) {
                    if (!hn.field_e.b(127, "")) {
                      return 29;
                    } else {
                      if (hn.field_e.a("", -1)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!wk.field_j.b(-3)) {
                return 43;
              } else {
                if (!wk.field_j.a("commonui", -1)) {
                  return 57;
                } else {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (!qo.field_u.b(-3)) {
                        return 82;
                      } else {
                        if (!qo.field_u.a((byte) 92)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              }
            }
          }
          if (!param0) {
            return 100;
          } else {
            return 35;
          }
        } else {
          return 0;
        }
    }

    nl(int param0) {
        int var2 = 0;
        fa var3 = null;
        ((nl) this).field_e = 0;
        ((nl) this).field_g = new fa[param0];
        ((nl) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new fa();
            ((nl) this).field_g[var2] = new fa();
            var3.field_h = var3;
            var3.field_a = var3;
        }
    }

    final fa a(int param0) {
        fa var2_ref = null;
        int var2 = 0;
        int var3 = 0;
        fa var4 = null;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (-1 <= (((nl) this).field_e ^ -1)) {
            break L0;
          } else {
            if (((nl) this).field_g[-1 + ((nl) this).field_e] != ((nl) this).field_f) {
              var2_ref = ((nl) this).field_f;
              ((nl) this).field_f = var2_ref.field_a;
              return var2_ref;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((nl) this).field_a <= ((nl) this).field_e) {
            var2 = -114 / ((-79 - param0) / 36);
            return null;
          } else {
            ((nl) this).field_e = ((nl) this).field_e + 1;
            var4 = ((nl) this).field_g[((nl) this).field_e].field_a;
            var2_ref = var4;
            if (var4 == ((nl) this).field_g[-1 + ((nl) this).field_e]) {
              continue L1;
            } else {
              ((nl) this).field_f = var2_ref.field_a;
              return var2_ref;
            }
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_c = null;
        int var1 = -16 / ((-56 - param0) / 32);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Asking to join <%0>'s game...";
        field_d = "Auto-respond to <%0>";
        field_b = "This game option is only available to members.";
    }
}
