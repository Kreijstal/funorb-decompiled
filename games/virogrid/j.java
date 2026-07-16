/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j implements Iterator {
    static float field_i;
    private l field_f;
    static int field_e;
    private l field_d;
    static boolean field_g;
    private int field_c;
    static mg[] field_k;
    static e field_h;
    static int field_l;
    static int field_b;
    static String field_a;
    private gk field_j;

    public static void b(int param0) {
        field_k = null;
        int var1 = 97 % ((-32 - param0) / 44);
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (((j) this).field_j.field_h[((j) this).field_c + -1] == ((j) this).field_d) {
          L0: while (true) {
            if (((j) this).field_c < ((j) this).field_j.field_a) {
              int fieldTemp$1 = ((j) this).field_c;
              ((j) this).field_c = ((j) this).field_c + 1;
              if (((j) this).field_j.field_h[fieldTemp$1].field_f == ((j) this).field_j.field_h[-1 + ((j) this).field_c]) {
                ((j) this).field_d = ((j) this).field_j.field_h[-1 + ((j) this).field_c];
                if (var2 == 0) {
                  continue L0;
                } else {
                  return false;
                }
              } else {
                ((j) this).field_d = ((j) this).field_j.field_h[((j) this).field_c + -1].field_f;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        int var2 = 0;
        l var3 = null;
        l var4 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        if (((j) this).field_d == ((j) this).field_j.field_h[-1 + ((j) this).field_c]) {
          L0: while (true) {
            if (((j) this).field_c < ((j) this).field_j.field_a) {
              int fieldTemp$1 = ((j) this).field_c;
              ((j) this).field_c = ((j) this).field_c + 1;
              var3 = ((j) this).field_j.field_h[fieldTemp$1].field_f;
              if (var3 != ((j) this).field_j.field_h[((j) this).field_c + -1]) {
                ((j) this).field_d = var3.field_f;
                ((j) this).field_f = var3;
                return (Object) (Object) var3;
              } else {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((j) this).field_d;
          ((j) this).field_d = var4.field_f;
          ((j) this).field_f = var4;
          return (Object) (Object) var4;
        }
    }

    final static gh a(int param0, String param1) {
        CharSequence var7 = null;
        String var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (null == oa.field_h) {
            return null;
        }
        if (param1 == null) {
            return null;
        }
        if (0 == param1.length()) {
            return null;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        String var2 = c.a(var6, true);
        if (var2 == null) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        gh var3 = (gh) (Object) oa.field_h.a((long)var2.hashCode(), (byte) 82);
        do {
            if (var3 == null) {
                return null;
            }
            var7 = (CharSequence) (Object) var3.field_Hb;
            var4 = c.a(var7, true);
            if (var4.equals((Object) (Object) var2)) {
                return var3;
            }
            var3 = (gh) (Object) oa.field_h.c(48);
        } while (var5 == 0);
        return null;
    }

    private final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((j) this).field_d = ((j) this).field_j.field_h[0].field_f;
        ((j) this).field_c = 1;
        ((j) this).field_f = null;
    }

    final static void a(boolean param0, int param1) {
        vc.a(false, param0, -16113);
        if (param1 <= -124) {
            return;
        }
        j.a(true, 95);
    }

    final static hh a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = param0.length();
        if (var2 == 0) {
          return a.field_H;
        } else {
          if (-65 <= (var2 ^ -1)) {
            if (param0.charAt(0) == 34) {
              if (-35 != (param0.charAt(-1 + var2) ^ -1)) {
                return jj.field_f;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    L1: {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                          break L2;
                        } else {
                          L3: {
                            if (var3 != 0) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              break L3;
                            } else {
                              stackOut_15_0 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_17_0;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (34 != var5) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return jj.field_f;
                          }
                        }
                      }
                      var3 = 0;
                      break L1;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = param1;
              L5: while (true) {
                if ((var2 ^ -1) < (var4 ^ -1)) {
                  L6: {
                    L7: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        break L7;
                      } else {
                        L8: {
                          if ((var4 ^ -1) == -1) {
                            break L8;
                          } else {
                            if ((-1 + var2 ^ -1) == (var4 ^ -1)) {
                              break L8;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        return jj.field_f;
                      }
                    }
                    if (0 != (nf.field_b.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      break L6;
                    } else {
                      return jj.field_f;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L5;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return cb.field_a;
          }
        }
    }

    public final void remove() {
        if (!(null != ((j) this).field_f)) {
            throw new IllegalStateException();
        }
        ((j) this).field_f.a(false);
        ((j) this).field_f = null;
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            j.a(true, -78);
            if ((dj.field_n ^ -1) > -21) {
                return true;
            }
            if (!me.b(9)) {
                return true;
            }
            if (-1 <= (mf.field_h ^ -1)) {
                return false;
            }
            if (md.a(11265)) {
                return false;
            }
            return true;
        }
        if ((dj.field_n ^ -1) > -21) {
            return true;
        }
        if (!me.b(9)) {
            return true;
        }
        if (-1 <= (mf.field_h ^ -1)) {
            return false;
        }
        if (md.a(11265)) {
            return false;
        }
        return true;
    }

    j(gk param0) {
        ((j) this).field_f = null;
        ((j) this).field_j = param0;
        this.a(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_a = "Rankings";
    }
}
