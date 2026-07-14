/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_b;
    private bb field_a;
    static tf field_f;
    private fa field_e;
    static int field_c;
    static boolean field_d;

    final fa a(byte param0) {
        fa var2 = ((nm) this).field_e;
        if (var2 == ((nm) this).field_a.field_f) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_a;
        if (param0 != -104) {
            return null;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            nm.c(44);
        }
        field_f = null;
    }

    final fa d(int param0) {
        fa var2 = ((nm) this).field_a.field_f.field_a;
        if (param0 != 0) {
            field_b = null;
        }
        if (((nm) this).field_a.field_f == var2) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_a;
        return var2;
    }

    final static void c(int param0) {
        uj var1 = null;
        eq var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = Pixelate.field_H ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$1 = nm.a((String) null, -43);
            break L0;
          }
        }
        var1 = (uj) (Object) i.field_n.c(1504642273);
        L1: while (true) {
          if (var1 == null) {
            var1_ref = (eq) (Object) nk.field_a.c(param0 ^ -1504642274);
            L2: while (true) {
              if (var1_ref == null) {
                var1 = (uj) (Object) wi.field_a.c(1504642273);
                L3: while (true) {
                  if (var1 == null) {
                    return;
                  } else {
                    L4: {
                      if (-1 <= (var1.field_Tb ^ -1)) {
                        break L4;
                      } else {
                        var1.field_Tb = var1.field_Tb - 1;
                        if (var1.field_Tb == 0) {
                          var1.field_Eb = 0;
                          if (!var1.b((byte) -116)) {
                            break L4;
                          } else {
                            var1.c(2779);
                            break L4;
                          }
                        } else {
                          var1 = (uj) (Object) wi.field_a.f(1504642273);
                          continue L3;
                        }
                      }
                    }
                    var1 = (uj) (Object) wi.field_a.f(1504642273);
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (-1 > var1_ref.field_Rb) {
                    var1_ref.field_Rb = var1_ref.field_Rb - 1;
                    if (-1 == var1_ref.field_Rb) {
                      var1_ref.field_Qb = 0;
                      if (!var1_ref.j(433)) {
                        break L5;
                      } else {
                        var1_ref.c(2779);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var1_ref = (eq) (Object) nk.field_a.f(1504642273);
                continue L2;
              }
            }
          } else {
            L6: {
              if (var1.field_Tb <= 0) {
                break L6;
              } else {
                var1.field_Tb = var1.field_Tb - 1;
                if (var1.field_Tb != 0) {
                  break L6;
                } else {
                  var1.field_Eb = 0;
                  if (var1.b((byte) 109)) {
                    var1.c(param0 ^ -2780);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            var1 = (uj) (Object) i.field_n.f(param0 ^ -1504642274);
            continue L1;
          }
        }
    }

    final fa b(byte param0, fa param1) {
        fa var3 = null;
        if (param1 == null) {
            var3 = ((nm) this).field_a.field_f.field_a;
        } else {
            var3 = param1;
        }
        if (((nm) this).field_a.field_f == var3) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var3.field_a;
        if (param0 >= -72) {
            return null;
        }
        return var3;
    }

    final static void b(boolean param0) {
        Object var2 = null;
        al.a("", -110, (String) null);
        if (!param0) {
            field_f = null;
        }
    }

    final fa e(int param0) {
        fa var2 = ((nm) this).field_e;
        if (!(((nm) this).field_a.field_f != var2)) {
            ((nm) this).field_e = null;
            return null;
        }
        if (param0 > -56) {
            return null;
        }
        ((nm) this).field_e = var2.field_h;
        return var2;
    }

    final fa a(byte param0, fa param1) {
        fa var3 = null;
        if (param1 == null) {
            var3 = ((nm) this).field_a.field_f.field_h;
        } else {
            var3 = param1;
        }
        if (!(var3 != ((nm) this).field_a.field_f)) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var3.field_h;
        if (param0 != -99) {
            Object var4 = null;
            fa discarded$0 = ((nm) this).b((byte) -11, (fa) null);
        }
        return var3;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 >= 18) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= param0.length()) {
              return false;
            } else {
              var3 = param0.charAt(var2);
              if (!tk.a(-66, (char) var3)) {
                if (!ti.a(57, (char) var3)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final fa b(int param0) {
        if (param0 != -1) {
            field_c = 52;
        }
        fa var2 = ((nm) this).field_a.field_f.field_h;
        if (var2 == ((nm) this).field_a.field_f) {
            ((nm) this).field_e = null;
            return null;
        }
        ((nm) this).field_e = var2.field_h;
        return var2;
    }

    final static void a(int param0) {
        if (fc.field_e == ti.field_t) {
            return;
        }
        if (!(!tk.a((byte) -104, fc.field_e))) {
            wo.b(126, fc.field_e).a(true);
        }
        fc.field_e = ti.field_t;
        if (og.field_l) {
            og.field_l = false;
            qo.field_r = null;
            ro.field_e = null;
        }
        ec.field_t = param0;
        if (!(!ce.field_a)) {
            wh.field_p = null;
            nj.field_h = new bb();
            go.field_k = 0;
            ce.field_a = false;
            de.field_n = 0;
        }
        if (!(!mi.field_o)) {
            ak.i(param0 ^ 0);
            kj.a(23949);
            bd.a((byte) -1);
            mi.field_o = false;
        }
    }

    nm(bb param0) {
        ((nm) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Clan";
        field_d = false;
        field_c = 0;
    }
}
