/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_h;
    private he field_d;
    static String field_f;
    static long field_a;
    static bk field_b;
    private he field_c;
    static int field_e;
    static String field_g;

    final he b(byte param0) {
        he var2 = ((cd) this).field_c;
        if (param0 != -122) {
            return null;
        }
        if (!(((cd) this).field_d != var2)) {
            ((cd) this).field_c = null;
            return null;
        }
        ((cd) this).field_c = var2.field_h;
        return var2;
    }

    final static void a(kc[] param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        if (param0 != null) {
          if (-1 <= (param1 ^ -1)) {
            return;
          } else {
            var5 = param0[0].field_l;
            var6 = param0[2].field_l;
            var7 = param0[1].field_l;
            param0[0].d(param3, param4);
            param0[2].d(param1 + param3 + -var6, param4);
            vj.a(sg.field_c);
            vj.f(var5 + param3, param4, -var6 + param1 + param3, param4 - -param0[1].field_k);
            if (param2 != -94) {
              return;
            } else {
              var8 = var5 + param3;
              var9 = -var6 + param3 - -param1;
              param3 = var8;
              L0: while (true) {
                if (var9 <= param3) {
                  vj.b(sg.field_c);
                  return;
                } else {
                  param0[1].d(param3, param4);
                  param3 = param3 + var7;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        int var2 = 0;
        he var3 = null;
        int var4 = 0;
        var4 = Main.field_T;
        var2 = 0;
        var3 = ((cd) this).field_d.field_h;
        if (param0 == 1) {
          L0: while (true) {
            if (((cd) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L0;
            }
          }
        } else {
          field_h = 96;
          L1: while (true) {
            if (((cd) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Main.field_T;
        if (param0 >= param2) {
          if (param1 > param0) {
            w.a(vj.field_j, param6, param0, param5, true, param4, param7, param2, param1);
            if (param3 == -1) {
              return;
            } else {
              field_f = null;
              return;
            }
          } else {
            if (param1 > param2) {
              w.a(vj.field_j, param6, param1, param5, true, param7, param4, param2, param0);
              if (param3 == -1) {
                return;
              } else {
                field_f = null;
                return;
              }
            } else {
              w.a(vj.field_j, param6, param2, param7, true, param5, param4, param1, param0);
              if (param3 == -1) {
                return;
              } else {
                field_f = null;
                return;
              }
            }
          }
        } else {
          if (param2 < param1) {
            w.a(vj.field_j, param6, param2, param4, true, param5, param7, param0, param1);
            if (param3 == -1) {
              return;
            } else {
              field_f = null;
              return;
            }
          } else {
            if (param0 >= param1) {
              w.a(vj.field_j, param6, param0, param7, true, param4, param5, param1, param2);
              if (param3 == -1) {
                return;
              } else {
                field_f = null;
                return;
              }
            } else {
              w.a(vj.field_j, param6, param1, param4, true, param7, param5, param0, param2);
              if (param3 == -1) {
                return;
              } else {
                field_f = null;
                return;
              }
            }
          }
        }
    }

    final he a(int param0) {
        he var2 = null;
        int var3 = 0;
        var2 = ((cd) this).field_d.field_h;
        if (((cd) this).field_d == var2) {
          return null;
        } else {
          var2.d(12);
          var3 = -95 % ((param0 - 87) / 34);
          return var2;
        }
    }

    final he c(byte param0) {
        he var2 = null;
        if (param0 <= -96) {
          var2 = ((cd) this).field_d.field_h;
          if (var2 == ((cd) this).field_d) {
            ((cd) this).field_c = null;
            return null;
          } else {
            ((cd) this).field_c = var2.field_h;
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, he param1) {
        L0: {
          if (null != param1.field_i) {
            param1.d(12);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_i = ((cd) this).field_d.field_i;
        if (param0 >= -62) {
          return;
        } else {
          param1.field_h = ((cd) this).field_d;
          param1.field_i.field_h = param1;
          param1.field_h.field_i = param1;
          return;
        }
    }

    public cd() {
        ((cd) this).field_d = new he();
        ((cd) this).field_d.field_i = ((cd) this).field_d;
        ((cd) this).field_d.field_h = ((cd) this).field_d;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 46 % ((-45 - param0) / 58);
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "FPS:";
    }
}
