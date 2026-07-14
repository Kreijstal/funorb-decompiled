/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    String field_a;
    float field_c;
    static boolean field_e;
    private int field_f;
    private rh[] field_h;
    static boolean field_g;
    private int field_d;
    private int field_b;

    final static String a(String param0, int param1, char param2, String param3) {
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
        var11 = SolKnight.field_L ? 1 : 0;
        var4 = param3.length();
        if (param1 == -30614) {
          var5 = param0.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param3.indexOf((int) param2, var8_int);
              if (0 <= var8_int) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param3.indexOf((int) param2, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$12 = var13.append(param3.substring(var9, var10));
                    var9 = var10 - -1;
                    StringBuilder discarded$13 = var13.append(param0);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = var13.append(param3.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param3.indexOf((int) param2, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$15 = var12.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$16 = var12.append(param0);
                continue L2;
              } else {
                StringBuilder discarded$17 = var12.append(param3.substring(var9));
                return var12.toString();
              }
            }
          }
        } else {
          field_e = true;
          var5 = param0.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param3.indexOf((int) param2, var8_int);
              if (0 <= var8_int) {
                var6 = var6 + var7;
                var8_int++;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param3.indexOf((int) param2, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$18 = var8.append(param3.substring(var9, var10));
                    var9 = var10 - -1;
                    StringBuilder discarded$19 = var8.append(param0);
                    continue L4;
                  } else {
                    StringBuilder discarded$20 = var8.append(param3.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param3.indexOf((int) param2, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$21 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$22 = var8.append(param0);
                continue L5;
              } else {
                StringBuilder discarded$23 = var8.append(param3.substring(var9));
                return var8.toString();
              }
            }
          }
        }
    }

    final boolean a(byte param0) {
        rh var2 = null;
        int var3 = 0;
        rh var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          if (((ml) this).field_b <= ((ml) this).field_d) {
            if (param0 < 108) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((ml) this).field_h[((ml) this).field_d];
            var2 = var4;
            if (var4.field_d.c((byte) -121)) {
              L1: {
                if (0 > var4.field_c) {
                  break L1;
                } else {
                  if (var4.field_d.a(var4.field_c, -1)) {
                    break L1;
                  } else {
                    this.a(var2, var4.field_d.b((byte) 99, var4.field_c), 76);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_a) {
                  break L2;
                } else {
                  if (!var4.field_d.a(2, var4.field_a)) {
                    this.a(var2, var4.field_d.d(-1, var4.field_a), 72);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_c >= 0) {
                  break L3;
                } else {
                  if (var4.field_a != null) {
                    break L3;
                  } else {
                    if (null == var4.field_h) {
                      break L3;
                    } else {
                      if (var4.field_d.b(true)) {
                        break L3;
                      } else {
                        this.a(var2, var4.field_d.b((byte) -66), 82);
                        return false;
                      }
                    }
                  }
                }
              }
              ((ml) this).field_d = ((ml) this).field_d + 1;
              continue L0;
            } else {
              this.a(var4, 0, 84);
              return false;
            }
          }
        }
    }

    private final void a(rh param0, int param1, int param2) {
        float var4 = 0.0f;
        var4 = (float)(((ml) this).field_d - -1) + (float)param1 / 100.0f;
        ((ml) this).field_c = var4 * (float)((ml) this).field_f / (float)(((ml) this).field_b + 1);
        if (0 == param1) {
          ((ml) this).field_a = param0.field_b;
          if (param2 >= 26) {
            return;
          } else {
            field_g = true;
            return;
          }
        } else {
          ((ml) this).field_a = param0.field_h + " - " + param1 + "%";
          if (param2 >= 26) {
            return;
          } else {
            field_g = true;
            return;
          }
        }
    }

    final static cf[] a(int param0, jd param1) {
        int var2 = 0;
        int var3 = 0;
        cf[] var4 = null;
        int var5 = 0;
        cf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = param1.d((byte) 48, 8);
        if (var2 <= 0) {
          if (param0 != 22795) {
            return null;
          } else {
            var3 = param1.d((byte) 48, 12);
            var4 = new cf[var3];
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (wa.a(param1, (byte) -121)) {
                  var6 = new cf();
                  int discarded$6 = param1.d((byte) 48, 24);
                  int discarded$7 = param1.d((byte) 48, 24);
                  var6.field_a = param1.d((byte) 48, 24);
                  int discarded$8 = param1.d((byte) 48, 9);
                  int discarded$9 = param1.d((byte) 48, 12);
                  int discarded$10 = param1.d((byte) 48, 12);
                  int discarded$11 = param1.d((byte) 48, 12);
                  var4[var5] = var6;
                  var5++;
                  continue L0;
                } else {
                  var6_int = param1.d((byte) 48, ac.a(var5 + -1, 125));
                  var4[var5] = var4[var6_int];
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}
