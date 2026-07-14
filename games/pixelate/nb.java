/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nb implements Iterator {
    static String field_a;
    private lm field_e;
    static int[] field_c;
    private pg field_d;
    private lm field_f;
    static String field_b;

    public final Object next() {
        lm var1 = ((nb) this).field_f;
        if (var1 == ((nb) this).field_d.field_a) {
            ((nb) this).field_f = null;
            var1 = null;
        } else {
            ((nb) this).field_f = var1.field_p;
        }
        ((nb) this).field_e = var1;
        return (Object) (Object) var1;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 121 / ((-48 - param0) / 51);
    }

    final static void a(int param0, int param1, int param2, sb param3) {
        Object var5 = null;
        v.field_d = param1;
        if (param2 != 7) {
          var5 = null;
          nb.a(-44, 85, 83, (sb) null);
          nl.field_c = param3;
          ao.field_d = param0;
          return;
        } else {
          nl.field_c = param3;
          ao.field_d = param0;
          return;
        }
    }

    public final boolean hasNext() {
        return ((nb) this).field_d.field_a != ((nb) this).field_f;
    }

    public final void remove() {
        if (((nb) this).field_e == null) {
            throw new IllegalStateException();
        }
        ((nb) this).field_e.e(17);
        ((nb) this).field_e = null;
    }

    final static void a(int param0, tf[] param1, byte param2) {
        String var4 = null;
        int var5 = 0;
        tf[] var6 = null;
        tf[] var7 = null;
        String var8 = null;
        tf[] var9 = null;
        tf[] var10 = null;
        String var11 = null;
        tf[] var12 = null;
        tf[] var13 = null;
        String var14 = null;
        tf[] var15 = null;
        tf[] var16 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param2 != -53) {
          field_b = null;
          if (null == kb.field_L) {
            kb.field_L = rk.field_e;
            var15 = new tf[]{param1[0], param1[1]};
            var6 = var15;
            var16 = var6;
            var14 = wc.field_m[param0];
            if (-1 != (param0 ^ -1)) {
              if (1 != param0) {
                if (-3 != param0) {
                  if (-4 != param0) {
                    if ((param0 ^ -1) != -5) {
                      if (param0 != 5) {
                        if ((param0 ^ -1) != -7) {
                          if (param0 != 7) {
                            return;
                          } else {
                            rj.field_C[param0] = (jj) (Object) new wc(var14, var16);
                            return;
                          }
                        } else {
                          rj.field_C[param0] = (jj) (Object) new bm(var14, var16);
                          return;
                        }
                      } else {
                        rj.field_C[param0] = (jj) (Object) new da(var14, var16);
                        return;
                      }
                    } else {
                      rj.field_C[param0] = (jj) (Object) new se(var14, var16);
                      return;
                    }
                  } else {
                    rj.field_C[param0] = (jj) (Object) new lk(var14, var16);
                    return;
                  }
                } else {
                  rj.field_C[param0] = (jj) (Object) new ci(var14, var16);
                  return;
                }
              } else {
                rj.field_C[param0] = (jj) (Object) new qi(var14, var16);
                return;
              }
            } else {
              rj.field_C[param0] = (jj) (Object) new ql(var14, var15);
              return;
            }
          } else {
            var12 = new tf[]{param1[0], param1[1]};
            var6 = var12;
            var13 = var6;
            var7 = var13;
            var11 = wc.field_m[param0];
            var4 = var11;
            if (-1 != (param0 ^ -1)) {
              if (1 != param0) {
                if (-3 != param0) {
                  if (-4 != param0) {
                    if ((param0 ^ -1) != -5) {
                      if (param0 != 5) {
                        if ((param0 ^ -1) != -7) {
                          if (param0 == 7) {
                            rj.field_C[param0] = (jj) (Object) new wc(var11, var13);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          rj.field_C[param0] = (jj) (Object) new bm(var11, var13);
                          return;
                        }
                      } else {
                        rj.field_C[param0] = (jj) (Object) new da(var11, var13);
                        return;
                      }
                    } else {
                      rj.field_C[param0] = (jj) (Object) new se(var11, var13);
                      return;
                    }
                  } else {
                    rj.field_C[param0] = (jj) (Object) new lk(var11, var13);
                    return;
                  }
                } else {
                  rj.field_C[param0] = (jj) (Object) new ci(var11, var13);
                  return;
                }
              } else {
                rj.field_C[param0] = (jj) (Object) new qi(var11, var13);
                return;
              }
            } else {
              rj.field_C[param0] = (jj) (Object) new ql(var11, var12);
              return;
            }
          }
        } else {
          L0: {
            if (null != kb.field_L) {
              break L0;
            } else {
              kb.field_L = rk.field_e;
              break L0;
            }
          }
          var9 = new tf[]{param1[0], param1[1]};
          var6 = var9;
          var10 = var6;
          var7 = var10;
          var8 = wc.field_m[param0];
          var4 = var8;
          if (-1 != (param0 ^ -1)) {
            if (1 != param0) {
              if (-3 != param0) {
                if (-4 != param0) {
                  if ((param0 ^ -1) != -5) {
                    if (param0 != 5) {
                      if ((param0 ^ -1) != -7) {
                        if (param0 == 7) {
                          rj.field_C[param0] = (jj) (Object) new wc(var8, var10);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        rj.field_C[param0] = (jj) (Object) new bm(var8, var10);
                        return;
                      }
                    } else {
                      rj.field_C[param0] = (jj) (Object) new da(var8, var10);
                      return;
                    }
                  } else {
                    rj.field_C[param0] = (jj) (Object) new se(var8, var10);
                    return;
                  }
                } else {
                  rj.field_C[param0] = (jj) (Object) new lk(var8, var10);
                  return;
                }
              } else {
                rj.field_C[param0] = (jj) (Object) new ci(var8, var10);
                return;
              }
            } else {
              rj.field_C[param0] = (jj) (Object) new qi(var8, var10);
              return;
            }
          } else {
            rj.field_C[param0] = (jj) (Object) new ql(var8, var9);
            return;
          }
        }
    }

    nb(pg param0) {
        ((nb) this).field_e = null;
        ((nb) this).field_d = param0;
        ((nb) this).field_f = ((nb) this).field_d.field_a.field_p;
        ((nb) this).field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
    }
}
