/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    vm field_i;
    private int field_b;
    static int field_g;
    int field_l;
    int field_d;
    String field_k;
    int field_h;
    private boolean field_e;
    private int field_c;
    int field_m;
    int field_a;
    private int field_f;
    static bd field_j;

    public static void b(int param0) {
        field_j = null;
        if (param0 != 2) {
            Object var2 = null;
            String discarded$0 = v.a(-74, 'ￋ', (String) null, (String) null);
        }
    }

    v(String param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3);
        ((v) this).field_f = param4;
    }

    private final boolean d(int param0) {
        int var2 = -48 / ((79 - param0) / 42);
        return ((v) this).field_f == ul.field_L ? true : false;
    }

    v(String param0, int param1, int param2) {
        this(param0, param1, param2, 200);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        int var2 = 0;
        ea.a(1, (java.awt.Component) (Object) param1);
        var2 = 111 / ((param0 - -52) / 39);
        te.a((java.awt.Component) (Object) param1, -100);
        if (null != h.field_b) {
          h.field_b.a(0, (java.awt.Component) (Object) param1);
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != 32669) {
            field_g = 7;
            if (this.d(123)) {
                boolean discarded$0 = ((v) this).a((byte) -69);
                return true;
            }
            return false;
        }
        if (!(!this.d(123))) {
            boolean discarded$1 = ((v) this).a((byte) -69);
            return true;
        }
        return false;
    }

    private final void c(int param0) {
        if (param0 != 16) {
            return;
        }
        int var2 = ((v) this).field_i.b(((v) this).field_k, ((v) this).field_m, ((v) this).field_b);
        ((v) this).field_h = var2;
    }

    v(String param0, int param1, int param2, int param3, int param4, boolean param5) {
        this(param0, param1, param2, param3);
        ((v) this).field_e = param5 ? true : false;
        ((v) this).field_f = param4;
    }

    final static String a(int param0, char param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        var4 = param3.length();
        if (param0 == -18214) {
          var5 = param2.length();
          var6 = var4;
          var7 = -1 + var5;
          if (0 == var7) {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L0: while (true) {
              var10 = param3.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$12 = var12.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$13 = var12.append(param2);
                continue L0;
              } else {
                StringBuilder discarded$14 = var12.append(param3.substring(var9));
                return var12.toString();
              }
            }
          } else {
            var8_int = 0;
            L1: while (true) {
              var8_int = param3.indexOf((int) param1, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L1;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L2: while (true) {
                  var10 = param3.indexOf((int) param1, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$15 = var13.append(param3.substring(var9, var10));
                    var9 = var10 - -1;
                    StringBuilder discarded$16 = var13.append(param2);
                    continue L2;
                  } else {
                    StringBuilder discarded$17 = var13.append(param3.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          }
        } else {
          field_j = null;
          var5 = param2.length();
          var6 = var4;
          var7 = -1 + var5;
          if (0 == var7) {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param3.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$18 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$19 = var8.append(param2);
                continue L3;
              } else {
                StringBuilder discarded$20 = var8.append(param3.substring(var9));
                return var8.toString();
              }
            }
          } else {
            var8_int = 0;
            L4: while (true) {
              var8_int = param3.indexOf((int) param1, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L4;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L5: while (true) {
                  var10 = param3.indexOf((int) param1, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$21 = var8.append(param3.substring(var9, var10));
                    var9 = var10 - -1;
                    StringBuilder discarded$22 = var8.append(param2);
                    continue L5;
                  } else {
                    StringBuilder discarded$23 = var8.append(param3.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          }
        }
    }

    final void e(int param0) {
        if (param0 >= -104) {
            return;
        }
        if (((v) this).field_a != 1) {
            return;
        }
        if (((v) this).a((byte) -61)) {
            return;
        }
        ((v) this).field_a = 2;
    }

    v(String param0, int param1, int param2, int param3, boolean param4) {
        this(param0, param1, param2, param3);
        ((v) this).field_e = param4 ? true : false;
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var2 = -uj.field_p.field_e + ((v) this).field_l;
          var3 = ((v) this).field_d - uj.field_p.field_g;
          if (param0 <= -48) {
            break L0;
          } else {
            boolean discarded$6 = ((v) this).a(65);
            break L0;
          }
        }
        var4 = ((v) this).field_m;
        var5 = ((v) this).field_h;
        var6 = 1;
        if (0 <= var2 + (var4 - -8)) {
          if (640 >= var2 + -8) {
            if (8 + (var5 + var3) >= 0) {
              if ((-8 + var3 ^ -1) >= -481) {
                L1: {
                  if (var6 != 0) {
                    ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                    int discarded$7 = ((v) this).field_i.a(((v) this).field_k, var2, -6 + var3, var4, var5, ((v) this).field_c, -1, 0, 1, ((v) this).field_b);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((v) this).field_e) {
                  nh.field_P.b((byte) -61);
                  return var6 != 0;
                } else {
                  return var6 != 0;
                }
              } else {
                L2: {
                  var6 = 0;
                  if (var6 != 0) {
                    ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                    int discarded$8 = ((v) this).field_i.a(((v) this).field_k, var2, -6 + var3, var4, var5, ((v) this).field_c, -1, 0, 1, ((v) this).field_b);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((v) this).field_e) {
                  nh.field_P.b((byte) -61);
                  return var6 != 0;
                } else {
                  return var6 != 0;
                }
              }
            } else {
              L3: {
                var6 = 0;
                if (var6 != 0) {
                  ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                  int discarded$9 = ((v) this).field_i.a(((v) this).field_k, var2, -6 + var3, var4, var5, ((v) this).field_c, -1, 0, 1, ((v) this).field_b);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((v) this).field_e) {
                nh.field_P.b((byte) -61);
                return var6 != 0;
              } else {
                return var6 != 0;
              }
            }
          } else {
            L4: {
              var6 = 0;
              if (var6 != 0) {
                ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                int discarded$10 = ((v) this).field_i.a(((v) this).field_k, var2, -6 + var3, var4, var5, ((v) this).field_c, -1, 0, 1, ((v) this).field_b);
                break L4;
              } else {
                break L4;
              }
            }
            if (((v) this).field_e) {
              nh.field_P.b((byte) -61);
              return var6 != 0;
            } else {
              return var6 != 0;
            }
          }
        } else {
          L5: {
            var6 = 0;
            if (var6 != 0) {
              ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
              int discarded$11 = ((v) this).field_i.a(((v) this).field_k, var2, -6 + var3, var4, var5, ((v) this).field_c, -1, 0, 1, ((v) this).field_b);
              break L5;
            } else {
              break L5;
            }
          }
          if (((v) this).field_e) {
            nh.field_P.b((byte) -61);
            return var6 != 0;
          } else {
            return var6 != 0;
          }
        }
    }

    v(String param0, int param1, int param2, int param3) {
        ((v) this).field_e = false;
        ((v) this).field_c = 16776960;
        ((v) this).field_b = 15;
        ((v) this).field_i = (vm) (Object) al.field_Z;
        ((v) this).field_a = 0;
        ((v) this).field_m = param3;
        ((v) this).field_k = param0;
        ((v) this).field_l = param1 - ((v) this).field_m / 2;
        ((v) this).field_d = param2;
        if (null != ((v) this).field_k) {
            ((v) this).field_k = ((v) this).field_k.toUpperCase();
            this.c(16);
        }
    }

    static {
    }
}
