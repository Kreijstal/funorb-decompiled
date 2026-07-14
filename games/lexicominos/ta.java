/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private ng field_a;
    static String field_b;
    static int field_g;
    static String field_d;
    private kd field_c;
    static long field_f;
    static long field_e;

    final kd b(int param0) {
        kd var2 = null;
        var2 = ((ta) this).field_a.field_b.field_c;
        if (((ta) this).field_a.field_b == var2) {
          ((ta) this).field_c = null;
          return null;
        } else {
          if (param0 != 0) {
            kd discarded$2 = ((ta) this).b(91);
            ((ta) this).field_c = var2.field_c;
            return var2;
          } else {
            ((ta) this).field_c = var2.field_c;
            return var2;
          }
        }
    }

    final kd a(kd param0, byte param1) {
        kd var3 = null;
        L0: {
          if (param0 != null) {
            var3 = param0;
            break L0;
          } else {
            var3 = ((ta) this).field_a.field_b.field_f;
            break L0;
          }
        }
        if (var3 == ((ta) this).field_a.field_b) {
          ((ta) this).field_c = null;
          return null;
        } else {
          if (param1 > -126) {
            kd discarded$2 = ((ta) this).e(-9);
            ((ta) this).field_c = var3.field_f;
            return var3;
          } else {
            ((ta) this).field_c = var3.field_f;
            return var3;
          }
        }
    }

    final kd e(int param0) {
        kd var2 = null;
        var2 = ((ta) this).field_c;
        if (param0 == 31842) {
          if (var2 == ((ta) this).field_a.field_b) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final kd c(int param0) {
        kd var2 = ((ta) this).field_c;
        if (param0 >= -49) {
            return null;
        }
        if (!(((ta) this).field_a.field_b != var2)) {
            ((ta) this).field_c = null;
            return null;
        }
        ((ta) this).field_c = var2.field_f;
        return var2;
    }

    final static mb a(int param0, String param1) {
        if (param0 == 250) {
          if (ca.field_i != ee.field_c) {
            if (c.field_o == ee.field_c) {
              if (!param1.equals((Object) (Object) ef.field_b)) {
                ef.field_b = param1;
                n.field_k = null;
                ee.field_c = ca.field_i;
                return null;
              } else {
                ee.field_c = c.field_m;
                return n.field_k;
              }
            } else {
              ef.field_b = param1;
              n.field_k = null;
              ee.field_c = ca.field_i;
              return null;
            }
          } else {
            return null;
          }
        } else {
          ta.f(34);
          if (ca.field_i != ee.field_c) {
            if (c.field_o == ee.field_c) {
              if (!param1.equals((Object) (Object) ef.field_b)) {
                ef.field_b = param1;
                n.field_k = null;
                ee.field_c = ca.field_i;
                return null;
              } else {
                ee.field_c = c.field_m;
                return n.field_k;
              }
            } else {
              ef.field_b = param1;
              n.field_k = null;
              ee.field_c = ca.field_i;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final kd a(int param0) {
        kd var2 = null;
        if (param0 == 250) {
          var2 = ((ta) this).field_a.field_b.field_f;
          if (((ta) this).field_a.field_b == var2) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_f;
            return var2;
          }
        } else {
          ((ta) this).field_a = null;
          var2 = ((ta) this).field_a.field_b.field_f;
          if (((ta) this).field_a.field_b == var2) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_f;
            return var2;
          }
        }
    }

    final static void d(int param0) {
        if (mc.field_k != -tf.field_c + 0) {
          if (250 - tf.field_c == mc.field_k) {
            mc.field_k = mc.field_k + 1;
            if (param0 >= -30) {
              field_e = 88L;
              return;
            } else {
              return;
            }
          } else {
            mc.field_k = mc.field_k + 1;
            if (param0 >= -30) {
              field_e = 88L;
              return;
            } else {
              return;
            }
          }
        } else {
          mc.field_k = mc.field_k + 1;
          if (param0 >= -30) {
            field_e = 88L;
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        fk.field_e = param0;
        int var3 = 21 % ((param1 - 14) / 53);
        ch.field_e = param2;
    }

    ta(ng param0) {
        ((ta) this).field_a = param0;
    }

    public static void f(int param0) {
        if (param0 != 0) {
            ta.a(123, 24, 83);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final kd a(kd param0, int param1) {
        kd var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((ta) this).field_a.field_b.field_c;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (var3 != ((ta) this).field_a.field_b) {
          ((ta) this).field_c = var3.field_c;
          if (param1 < 126) {
            ((ta) this).field_c = null;
            return var3;
          } else {
            return var3;
          }
        } else {
          ((ta) this).field_c = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please wait...";
    }
}
