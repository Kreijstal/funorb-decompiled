/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends rqa {
    static int[] field_o;

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (!wgb.field_g) {
          return;
        } else {
          mmb.field_d = new aja[hwa.field_r.length];
          var1 = 0;
          if (param0 <= -8) {
            L0: {
              if (mmb.field_d.length <= var1) {
                break L0;
              } else {
                L1: {
                  if (null != hwa.field_r[var1]) {
                    mmb.field_d[var1] = og.field_r.a(hwa.field_r[var1], false);
                    break L1;
                  } else {
                    var1++;
                    break L1;
                  }
                }
                var1++;
                var1++;
                var1++;
                break L0;
              }
            }
            mmb.field_d[30] = wba.a((byte) -62, og.field_r, oaa.field_j);
            nkb.a(false, "Finished building sprites");
            return;
          } else {
            L2: {
              field_o = null;
              if (mmb.field_d.length <= var1) {
                break L2;
              } else {
                L3: {
                  if (null != hwa.field_r[var1]) {
                    mmb.field_d[var1] = og.field_r.a(hwa.field_r[var1], false);
                    break L3;
                  } else {
                    var1++;
                    break L3;
                  }
                }
                var1++;
                var1++;
                var1++;
                break L2;
              }
            }
            mmb.field_d[30] = wba.a((byte) -62, og.field_r, oaa.field_j);
            nkb.a(false, "Finished building sprites");
            return;
          }
        }
    }

    ah(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 == 233) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(233, 62, param0[0].a(15));
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (0 < hcb.field_o) {
          if (null == efb.field_b) {
            L0: {
              psb.field_b = ob.a(0, bm.field_o, 640, 480, 0, 0);
              if (psb.field_b != null) {
                var2 = 2;
                qa.a((byte) 77, (java.awt.Canvas) (Object) psb.field_b);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            if (param0 == 2) {
              if (null != efb.field_b) {
                return;
              } else {
                L1: {
                  if (vbb.field_p) {
                    wha.a(2, param1, var2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            L2: {
              psb.field_b = efb.field_b.a((byte) 124);
              mb.h(2, 117);
              if (psb.field_b != null) {
                var2 = 2;
                qa.a((byte) 77, (java.awt.Canvas) (Object) psb.field_b);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (param0 == 2) {
              if (null != efb.field_b) {
                return;
              } else {
                L3: {
                  if (vbb.field_p) {
                    wha.a(2, param1, var2);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (fda.e((byte) 120)) {
            var2 = 0;
            if (param0 == 2) {
              if (null != efb.field_b) {
                return;
              } else {
                L4: {
                  if (vbb.field_p) {
                    wha.a(2, param1, var2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            var2 = 1;
            if (param0 == 2) {
              if (null != efb.field_b) {
                return;
              } else {
                L5: {
                  if (vbb.field_p) {
                    wha.a(2, param1, var2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
    }
}
