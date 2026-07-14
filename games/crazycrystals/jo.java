/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends pn implements Cloneable {
    static am field_p;
    private int field_n;
    private int field_m;
    static int field_o;

    final void c(boolean param0, boolean param1) {
        Object var4 = null;
        if (param0) {
          if (param1) {
            return;
          } else {
            fn.field_j = fn.field_j - ob.field_l;
            wd.field_j = wd.field_j + 1;
            gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] + 1;
            return;
          }
        } else {
          var4 = null;
          dl[] discarded$5 = jo.a(false, -77, (db) null, -90);
          if (param1) {
            return;
          } else {
            fn.field_j = fn.field_j - ob.field_l;
            wd.field_j = wd.field_j + 1;
            gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] + 1;
            return;
          }
        }
    }

    final static dl[] a(boolean param0, int param1, db param2, int param3) {
        if (!gm.a(param2, param3, param0, param1)) {
            return null;
        }
        return mn.c(0);
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        Object var9 = null;
        if (param0 != -21) {
          var9 = null;
          boolean discarded$2 = ((jo) this).a((byte) -96, (f[][]) null, 127, -74, -22, (fq) null, -77);
          return true;
        } else {
          return true;
        }
    }

    jo(f param0, int param1) {
        super(param0);
        ((jo) this).field_m = 0;
        ((jo) this).field_n = param1;
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return null;
        }
        return (f) this;
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_p = null;
            return 12;
        }
        return 12;
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        ((jo) this).field_m = ((jo) this).field_m + 1;
        if (param1 != 0) {
          return;
        } else {
          L0: {
            if (vp.field_i[((jo) this).field_n].length <= ((jo) this).field_m) {
              ((jo) this).field_m = 0;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        int var9 = 0;
        fq var12 = null;
        fq var13 = null;
        Object var16 = null;
        fq var16_ref = null;
        fq var17 = null;
        Object var18 = null;
        Object var20 = null;
        fq var20_ref = null;
        fq var21 = null;
        Object var22 = null;
        fq var22_ref = null;
        fq var23 = null;
        Object var24 = null;
        var16 = null;
        var18 = null;
        var20 = null;
        var22 = null;
        var24 = null;
        var9 = CrazyCrystals.field_B;
        wd.field_j = wd.field_j - 1;
        mb.field_g = mb.field_g - ob.field_l;
        if (vh.field_a) {
          if (1 == uo.field_o) {
            if (param5 + param2 == 6 - -w.field_f) {
              if (9 + ia.field_i == param3 - -param0) {
                L0: {
                  va.field_c = 1;
                  we.field_h = we.field_h + -16;
                  b.field_a = b.field_a + -8;
                  if (param4 <= -87) {
                    break L0;
                  } else {
                    jo.f(-96);
                    break L0;
                  }
                }
                L1: {
                  fp.field_a = fp.field_a + -16;
                  je.field_j = je.field_j + -8;
                  ob.field_l = ob.field_l - 1;
                  fn.field_j = fn.field_j + wd.field_j;
                  sc.field_i[((jo) this).field_n].a(128, 12 * (param5 - -param2), 12 * (param3 - -param0), 0, (byte) -111);
                  gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] - 1;
                  var20_ref = (fq) (Object) param1;
                  var21 = var20_ref;
                  if (null != ab.field_D) {
                    break L1;
                  } else {
                    L2: {
                      q.field_a[var20_ref.field_u].field_e[((jo) this).field_n] = q.field_a[var20_ref.field_u].field_e[((jo) this).field_n] + 1;
                      if (tm.field_e > jm.field_b) {
                        rl.field_h = 1 << var21.field_u;
                        jm.field_b = tm.field_e;
                        break L2;
                      } else {
                        rl.field_h = rl.field_h | 1 << var21.field_u;
                        break L2;
                      }
                    }
                    if (-1 == (((jo) this).field_n ^ -1)) {
                      fn.field_j = fn.field_j + 60;
                      mb.field_g = mb.field_g + 50;
                      break L1;
                    } else {
                      fn.field_j = fn.field_j + 800;
                      mb.field_g = mb.field_g + 700;
                      break L1;
                    }
                  }
                }
                ((jo) this).field_l.a(1 << var21.field_u, true, tm.field_e);
                return ((jo) this).field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
              } else {
                L3: {
                  we.field_h = we.field_h + -16;
                  b.field_a = b.field_a + -8;
                  if (param4 <= -87) {
                    break L3;
                  } else {
                    jo.f(-96);
                    break L3;
                  }
                }
                L4: {
                  fp.field_a = fp.field_a + -16;
                  je.field_j = je.field_j + -8;
                  ob.field_l = ob.field_l - 1;
                  fn.field_j = fn.field_j + wd.field_j;
                  sc.field_i[((jo) this).field_n].a(128, 12 * (param5 - -param2), 12 * (param3 - -param0), 0, (byte) -111);
                  gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] - 1;
                  var22_ref = (fq) (Object) param1;
                  var23 = var22_ref;
                  if (null != ab.field_D) {
                    break L4;
                  } else {
                    L5: {
                      q.field_a[var22_ref.field_u].field_e[((jo) this).field_n] = q.field_a[var22_ref.field_u].field_e[((jo) this).field_n] + 1;
                      if (tm.field_e > jm.field_b) {
                        rl.field_h = 1 << var23.field_u;
                        jm.field_b = tm.field_e;
                        break L5;
                      } else {
                        rl.field_h = rl.field_h | 1 << var23.field_u;
                        break L5;
                      }
                    }
                    if (-1 == (((jo) this).field_n ^ -1)) {
                      fn.field_j = fn.field_j + 60;
                      mb.field_g = mb.field_g + 50;
                      break L4;
                    } else {
                      fn.field_j = fn.field_j + 800;
                      mb.field_g = mb.field_g + 700;
                      break L4;
                    }
                  }
                }
                ((jo) this).field_l.a(1 << var23.field_u, true, tm.field_e);
                return ((jo) this).field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
              }
            } else {
              L6: {
                we.field_h = we.field_h + -16;
                b.field_a = b.field_a + -8;
                if (param4 <= -87) {
                  break L6;
                } else {
                  jo.f(-96);
                  break L6;
                }
              }
              L7: {
                fp.field_a = fp.field_a + -16;
                je.field_j = je.field_j + -8;
                ob.field_l = ob.field_l - 1;
                fn.field_j = fn.field_j + wd.field_j;
                sc.field_i[((jo) this).field_n].a(128, 12 * (param5 - -param2), 12 * (param3 - -param0), 0, (byte) -111);
                gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] - 1;
                var22_ref = (fq) (Object) param1;
                var23 = var22_ref;
                if (null != ab.field_D) {
                  break L7;
                } else {
                  L8: {
                    q.field_a[var22_ref.field_u].field_e[((jo) this).field_n] = q.field_a[var22_ref.field_u].field_e[((jo) this).field_n] + 1;
                    if (tm.field_e > jm.field_b) {
                      rl.field_h = 1 << var23.field_u;
                      jm.field_b = tm.field_e;
                      break L8;
                    } else {
                      rl.field_h = rl.field_h | 1 << var23.field_u;
                      break L8;
                    }
                  }
                  if (-1 == (((jo) this).field_n ^ -1)) {
                    fn.field_j = fn.field_j + 60;
                    mb.field_g = mb.field_g + 50;
                    break L7;
                  } else {
                    fn.field_j = fn.field_j + 800;
                    mb.field_g = mb.field_g + 700;
                    break L7;
                  }
                }
              }
              ((jo) this).field_l.a(1 << var23.field_u, true, tm.field_e);
              return ((jo) this).field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
            }
          } else {
            L9: {
              we.field_h = we.field_h + -16;
              b.field_a = b.field_a + -8;
              if (param4 <= -87) {
                break L9;
              } else {
                jo.f(-96);
                break L9;
              }
            }
            L10: {
              fp.field_a = fp.field_a + -16;
              je.field_j = je.field_j + -8;
              ob.field_l = ob.field_l - 1;
              fn.field_j = fn.field_j + wd.field_j;
              sc.field_i[((jo) this).field_n].a(128, 12 * (param5 - -param2), 12 * (param3 - -param0), 0, (byte) -111);
              gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] - 1;
              var16_ref = (fq) (Object) param1;
              var17 = var16_ref;
              if (null != ab.field_D) {
                break L10;
              } else {
                L11: {
                  q.field_a[var16_ref.field_u].field_e[((jo) this).field_n] = q.field_a[var16_ref.field_u].field_e[((jo) this).field_n] + 1;
                  if (tm.field_e > jm.field_b) {
                    rl.field_h = 1 << var17.field_u;
                    jm.field_b = tm.field_e;
                    break L11;
                  } else {
                    rl.field_h = rl.field_h | 1 << var17.field_u;
                    break L11;
                  }
                }
                if (-1 == (((jo) this).field_n ^ -1)) {
                  fn.field_j = fn.field_j + 60;
                  mb.field_g = mb.field_g + 50;
                  break L10;
                } else {
                  fn.field_j = fn.field_j + 800;
                  mb.field_g = mb.field_g + 700;
                  break L10;
                }
              }
            }
            ((jo) this).field_l.a(1 << var17.field_u, true, tm.field_e);
            return ((jo) this).field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
          }
        } else {
          L12: {
            we.field_h = we.field_h + -16;
            b.field_a = b.field_a + -8;
            if (param4 <= -87) {
              break L12;
            } else {
              jo.f(-96);
              break L12;
            }
          }
          L13: {
            fp.field_a = fp.field_a + -16;
            je.field_j = je.field_j + -8;
            ob.field_l = ob.field_l - 1;
            fn.field_j = fn.field_j + wd.field_j;
            sc.field_i[((jo) this).field_n].a(128, 12 * (param5 - -param2), 12 * (param3 - -param0), 0, (byte) -111);
            gm.field_c[((jo) this).field_n] = gm.field_c[((jo) this).field_n] - 1;
            var12 = (fq) (Object) param1;
            var13 = var12;
            if (null != ab.field_D) {
              break L13;
            } else {
              L14: {
                q.field_a[var12.field_u].field_e[((jo) this).field_n] = q.field_a[var12.field_u].field_e[((jo) this).field_n] + 1;
                if (tm.field_e > jm.field_b) {
                  rl.field_h = 1 << var13.field_u;
                  jm.field_b = tm.field_e;
                  break L14;
                } else {
                  rl.field_h = rl.field_h | 1 << var13.field_u;
                  break L14;
                }
              }
              if (-1 == (((jo) this).field_n ^ -1)) {
                fn.field_j = fn.field_j + 60;
                mb.field_g = mb.field_g + 50;
                break L13;
              } else {
                fn.field_j = fn.field_j + 800;
                mb.field_g = mb.field_g + 700;
                break L13;
              }
            }
          }
          ((jo) this).field_l.a(1 << var13.field_u, true, tm.field_e);
          return ((jo) this).field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
        }
    }

    public static void f(int param0) {
        field_p = null;
        if (param0 != 6) {
            field_p = null;
        }
    }

    final int d(byte param0) {
        if (param0 >= -40) {
            int discarded$0 = ((jo) this).a(true, true);
            return -2;
        }
        return -2;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        var7 = 61 % ((param0 - 74) / 41);
        if (-25 == (param1 ^ -1)) {
          if (24 != param2) {
            vp.field_i[((jo) this).field_n][((jo) this).field_m].b(param4, -param2 + param5, 2 * param1, param2 * 3);
            return;
          } else {
            vp.field_i[((jo) this).field_n][((jo) this).field_m].a(param4, -param2 + param5);
            return;
          }
        } else {
          vp.field_i[((jo) this).field_n][((jo) this).field_m].b(param4, -param2 + param5, 2 * param1, param2 * 3);
          return;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 <= 92) {
            ((jo) this).field_m = -82;
        }
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          field_o = -68;
          return ng.a(cj.field_y, param1, (f) (Object) new jo((f) (Object) new kp(-1), ((jo) this).field_n), (byte) -83, fa.field_k);
        } else {
          return ng.a(cj.field_y, param1, (f) (Object) new jo((f) (Object) new kp(-1), ((jo) this).field_n), (byte) -83, fa.field_k);
        }
    }

    static {
    }
}
