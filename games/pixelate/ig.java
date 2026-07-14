/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static tc field_d;
    static io field_e;
    static String field_c;
    static tf[][] field_a;
    static fm field_b;

    final static String a(int param0, char param1) {
        if (param0 < 123) {
            return null;
        }
        return String.valueOf(param1);
    }

    final static id a(int param0, String param1) {
        if (param0 == 200) {
          if (qo.field_n != rj.field_F) {
            if (qo.field_n == h.field_N) {
              if (!param1.equals((Object) (Object) uh.field_m)) {
                qo.field_n = rj.field_F;
                uh.field_m = param1;
                jc.field_f = null;
                return null;
              } else {
                qo.field_n = wm.field_a;
                return jc.field_f;
              }
            } else {
              qo.field_n = rj.field_F;
              uh.field_m = param1;
              jc.field_f = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_b = null;
          if (qo.field_n != rj.field_F) {
            if (qo.field_n == h.field_N) {
              if (!param1.equals((Object) (Object) uh.field_m)) {
                qo.field_n = rj.field_F;
                uh.field_m = param1;
                jc.field_f = null;
                return null;
              } else {
                qo.field_n = wm.field_a;
                return jc.field_f;
              }
            } else {
              qo.field_n = rj.field_F;
              uh.field_m = param1;
              jc.field_f = null;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 113 % ((-66 - param0) / 54);
        field_e = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        cm var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        to.field_t.b();
        ib.field_h.b();
        var1 = -121 % ((param0 - 54) / 39);
        e.field_a = e.field_a - 1;
        if (e.field_a == 0) {
          e.field_a = 200;
          var2 = (cm) (Object) bo.field_d.c(1504642273);
          L0: while (true) {
            if (var2 == null) {
              if (rg.field_b != null) {
                var2 = (cm) (Object) rg.field_b.c(1504642273);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (var2.field_k.b(0)) {
                        break L2;
                      } else {
                        var2.c(2779);
                        break L2;
                      }
                    }
                    var2 = (cm) (Object) rg.field_b.f(1504642273);
                    continue L1;
                  } else {
                    L3: {
                      if (null == to.field_q) {
                        break L3;
                      } else {
                        if (to.field_q.a((byte) -123)) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L4: {
                  if (null == to.field_q) {
                    break L4;
                  } else {
                    if (to.field_q.a((byte) -123)) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                return;
              }
            } else {
              L5: {
                if (!var2.field_k.b(0)) {
                  var2.c(2779);
                  break L5;
                } else {
                  break L5;
                }
              }
              var2 = (cm) (Object) bo.field_d.f(1504642273);
              continue L0;
            }
          }
        } else {
          L6: {
            if (null == to.field_q) {
              break L6;
            } else {
              if (to.field_q.a((byte) -123)) {
                break L6;
              } else {
                break L6;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OK";
        field_e = new io("email");
    }
}
