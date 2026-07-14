/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends q {
    static boolean field_k;
    static String field_j;
    static boolean field_i;

    final static void h(int param0) {
        sj.a(k.c(108), (byte) 110);
        if (param0 >= -24) {
            field_k = true;
        }
    }

    final lh a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (param0 == -257) {
          var6 = (CharSequence) (Object) param1;
          if (f.b((byte) -123, var6)) {
            var7 = (CharSequence) (Object) param1;
            var3 = ol.a(false, var7);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return si.field_m;
              } else {
                return kk.field_w;
              }
            } else {
              return si.field_m;
            }
          } else {
            return si.field_m;
          }
        } else {
          field_k = false;
          var4 = (CharSequence) (Object) param1;
          if (f.b((byte) -123, var4)) {
            var5 = (CharSequence) (Object) param1;
            var3 = ol.a(false, var5);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return si.field_m;
              } else {
                return kk.field_w;
              }
            } else {
              return si.field_m;
            }
          } else {
            return si.field_m;
          }
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -11) {
            field_j = null;
        }
    }

    final String b(int param0, String param1) {
        if (((cf) this).a(-257, param1) == si.field_m) {
            return sl.field_i;
        }
        if (param0 == 422) {
            return null;
        }
        return null;
    }

    final static qi a(int param0, int param1) {
        qi var2 = new qi();
        k.field_e.a(-49, (hf) (Object) var2);
        int var3 = -104 / ((-51 - param1) / 44);
        re.b(-78, param0);
        return var2;
    }

    final static void d(byte param0) {
        Object var1 = null;
        me var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = Geoblox.field_C;
        if (param0 >= 8) {
          var1_ref = (me) (Object) md.field_a.g(0);
          L0: while (true) {
            if (var1_ref == null) {
              return;
            } else {
              L1: {
                if (var1_ref.field_k < 1.0f) {
                  var1_ref.field_k = var1_ref.field_k + (0.03999999910593033f * var1_ref.field_k + 0.00004999999873689376f);
                  break L1;
                } else {
                  if ((var1_ref.field_h ^ -1) != -2) {
                    el.field_o.a(var1_ref.field_f, -73);
                    ue.field_f.a(-35, (hf) (Object) var1_ref);
                    break L1;
                  } else {
                    el.field_o.a((byte) 127, var1_ref.field_f);
                    ue.field_f.a(-35, (hf) (Object) var1_ref);
                    break L1;
                  }
                }
              }
              var1_ref = (me) (Object) md.field_a.d(1);
              continue L0;
            }
          }
        } else {
          boolean discarded$1 = cf.c((byte) 121);
          var1_ref = (me) (Object) md.field_a.g(0);
          L2: while (true) {
            if (var1_ref == null) {
              return;
            } else {
              L3: {
                if (var1_ref.field_k < 1.0f) {
                  var1_ref.field_k = var1_ref.field_k + (0.03999999910593033f * var1_ref.field_k + 0.00004999999873689376f);
                  break L3;
                } else {
                  if ((var1_ref.field_h ^ -1) != -2) {
                    el.field_o.a(var1_ref.field_f, -73);
                    ue.field_f.a(-35, (hf) (Object) var1_ref);
                    break L3;
                  } else {
                    el.field_o.a((byte) 127, var1_ref.field_f);
                    ue.field_f.a(-35, (hf) (Object) var1_ref);
                    break L3;
                  }
                }
              }
              var1_ref = (me) (Object) md.field_a.d(1);
              continue L2;
            }
          }
        }
    }

    final static boolean c(byte param0) {
        eg var1 = null;
        int var2 = 0;
        int var3 = 0;
        eg var4 = null;
        var3 = Geoblox.field_C;
        if (param0 == -114) {
          var4 = (eg) (Object) sl.field_k.g(0);
          var1 = var4;
          if (var1 != null) {
            var2 = 0;
            L0: while (true) {
              if (var1.field_f > var2) {
                L1: {
                  if (null != var4.field_n[var2]) {
                    if (var4.field_n[var2].field_a != 0) {
                      break L1;
                    } else {
                      return false;
                    }
                  } else {
                    break L1;
                  }
                }
                if (var4.field_i[var2] == null) {
                  var2++;
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  if (var4.field_i[var2].field_a == 0) {
                    return false;
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    cf(dj param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Restart tutorial";
    }
}
