/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_a;
    static mc field_g;
    private int field_e;
    private ik field_c;
    static int field_d;
    private int field_b;
    private ii field_f;

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        if (param0 < -77) {
          L0: {
            if ((param2 ^ -1) > -3) {
              break L0;
            } else {
              if ((param2 ^ -1) < -37) {
                break L0;
              } else {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param1.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    if (var5 != 0) {
                      return var6;
                    } else {
                      throw new NumberFormatException();
                    }
                  } else {
                    L2: {
                      var9 = param1.charAt(var8);
                      if (var8 == 0) {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param3) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        } else {
                          var4 = 1;
                          var8++;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (57 >= var9) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 > 90) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (param2 <= var9) {
                      throw new NumberFormatException();
                    } else {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var6 * param2 + var9;
                      if (var6 == var10 / param2) {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      } else {
                        throw new NumberFormatException();
                      }
                    }
                  }
                }
              }
            }
          }
          throw new IllegalArgumentException("" + param2);
        } else {
          return -36;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        pe var6 = null;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (((v) this).field_b < param0) {
            throw new IllegalStateException();
        }
        this.a((byte) -6, param3);
        ((v) this).field_e = ((v) this).field_e - param0;
        while (0 > ((v) this).field_e) {
            var6 = (pe) (Object) ((v) this).field_c.a((byte) -115);
            this.a(var6, (byte) 126);
        }
        tk var6_ref = new tk(param1, param0);
        ((v) this).field_f.a(-858993458, param3, (gg) (Object) var6_ref);
        ((v) this).field_c.a(-114, (ec) (Object) var6_ref);
        ((pe) (Object) var6_ref).field_l = 0L;
        if (param2 < 126) {
            ((v) this).field_f = null;
        }
    }

    private final void a(pe param0, byte param1) {
        int var3 = -7 / ((68 - param1) / 53);
        if (param0 != null) {
            param0.c(10);
            param0.a(97);
            ((v) this).field_e = ((v) this).field_e + param0.field_o;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 > -79) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(8, 1);
        var2.c(-126, param0);
    }

    private final void a(byte param0, long param1) {
        int var4 = -115 / ((-83 - param0) / 41);
        pe var5 = (pe) (Object) ((v) this).field_f.a(param1, -85);
        this.a(var5, (byte) -95);
    }

    final Object a(int param0, long param1) {
        tk var6 = null;
        pe var7 = (pe) (Object) ((v) this).field_f.a(param1, param0 ^ -90);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.h(31476);
        if (var5 == null) {
            var7.c(10);
            var7.a(97);
            ((v) this).field_e = ((v) this).field_e + var7.field_o;
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        if (!var7.g(param0 ^ 113)) {
            ((v) this).field_c.a(-109, (ec) (Object) var7);
            var7.field_l = 0L;
        } else {
            var6 = new tk(var5, var7.field_o);
            ((v) this).field_f.a(-858993458, var7.field_g, (gg) (Object) var6);
            ((v) this).field_c.a(param0 + -110, (ec) (Object) var6);
            ((pe) (Object) var6).field_l = 0L;
            var7.c(10);
            var7.a(97);
        }
        return var5;
    }

    final static void a(int param0, String param1, o param2) {
        qk.field_n = param1;
        va.field_g = param2;
        if (param0 != -98) {
            field_g = null;
        }
    }

    final void a(int param0, Object param1, long param2) {
        if (param0 < 67) {
            Object var6 = null;
            v.a(-25, (String) null, (o) null);
        }
        this.a(1, param1, 127, param2);
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
