/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private int field_a;
    private lh[] field_f;
    float field_g;
    String field_d;
    private int field_c;
    static String field_b;
    static int field_e;
    private int field_h;

    public static void b(int param0) {
        int var1 = -89 % ((param0 - 27) / 45);
        field_b = null;
    }

    private final void a(int param0, lh param1, int param2) {
        float var4 = 0.0f;
        if (param0 >= -126) {
            Object var5 = null;
            this.a(91, (lh) null, 26);
            var4 = (float)(1 + ((gi) this).field_a) + (float)param2 / 100.0f;
            ((gi) this).field_g = var4 * (float)((gi) this).field_c / (float)(((gi) this).field_h - -1);
            if (-1 == (param2 ^ -1)) {
                ((gi) this).field_d = param1.field_b;
            } else {
                ((gi) this).field_d = param1.field_d + " - " + param2 + "%";
                return;
            }
            return;
        }
        var4 = (float)(1 + ((gi) this).field_a) + (float)param2 / 100.0f;
        ((gi) this).field_g = var4 * (float)((gi) this).field_c / (float)(((gi) this).field_h - -1);
        if (-1 == (param2 ^ -1)) {
            ((gi) this).field_d = param1.field_b;
        } else {
            ((gi) this).field_d = param1.field_d + " - " + param2 + "%";
            return;
        }
    }

    final boolean a(int param0) {
        lh var2 = null;
        int var3 = 0;
        lh var4 = null;
        lh var5 = null;
        lh var6 = null;
        var3 = Bounce.field_N;
        if (param0 != 0) {
          boolean discarded$1 = ((gi) this).a(10);
          L0: while (true) {
            if (((gi) this).field_a < ((gi) this).field_h) {
              var6 = ((gi) this).field_f[((gi) this).field_a];
              var4 = var6;
              var2 = var4;
              if (var6.field_c.c(44)) {
                L1: {
                  if (0 > var6.field_a) {
                    break L1;
                  } else {
                    if (var6.field_c.d(var6.field_a, 84)) {
                      break L1;
                    } else {
                      this.a(-128, var2, var6.field_c.a(var6.field_a, 0));
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_e) {
                    break L2;
                  } else {
                    if (!var6.field_c.b(var6.field_e, false)) {
                      this.a(-127, var2, var6.field_c.b(var6.field_e, (byte) -100));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_a ^ -1)) {
                    break L3;
                  } else {
                    if (var6.field_e != null) {
                      break L3;
                    } else {
                      if (var6.field_d == null) {
                        break L3;
                      } else {
                        if (var6.field_c.a((byte) -73)) {
                          break L3;
                        } else {
                          this.a(-128, var2, var6.field_c.a(100));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((gi) this).field_a = ((gi) this).field_a + 1;
                continue L0;
              } else {
                this.a(-127, var6, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((gi) this).field_a < ((gi) this).field_h) {
              var5 = ((gi) this).field_f[((gi) this).field_a];
              var4 = var5;
              var2 = var4;
              if (var5.field_c.c(44)) {
                L5: {
                  if (0 > var5.field_a) {
                    break L5;
                  } else {
                    if (var5.field_c.d(var5.field_a, 84)) {
                      break L5;
                    } else {
                      this.a(-128, var2, var5.field_c.a(var5.field_a, 0));
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_e) {
                    break L6;
                  } else {
                    if (!var5.field_c.b(var5.field_e, false)) {
                      this.a(-127, var2, var5.field_c.b(var5.field_e, (byte) -100));
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_a ^ -1)) {
                    break L7;
                  } else {
                    if (var5.field_e != null) {
                      break L7;
                    } else {
                      if (var5.field_d == null) {
                        break L7;
                      } else {
                        if (var5.field_c.a((byte) -73)) {
                          break L7;
                        } else {
                          this.a(-128, var2, var5.field_c.a(100));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((gi) this).field_a = ((gi) this).field_a + 1;
                continue L4;
              } else {
                this.a(-127, var5, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static o a(byte[] param0, int param1) {
        int var2 = 0;
        o var3 = null;
        if (param0 == null) {
          return null;
        } else {
          var2 = -90 % ((param1 - -48) / 34);
          var3 = new o(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, he.field_k, ph.field_c);
          vb.a((byte) 122);
          return var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        var8 = 115 % ((param0 - -65) / 38);
        if (param2 > param1) {
          if (param4 <= param2) {
            if (param4 <= param1) {
              kg.a(param6, param1, param4, param2, param7, na.field_d, param5, 118, param3);
              return;
            } else {
              kg.a(param3, param4, param1, param2, param7, na.field_d, param5, 111, param6);
              return;
            }
          } else {
            kg.a(param7, param2, param1, param4, param3, na.field_d, param5, 92, param6);
            return;
          }
        } else {
          if (param4 <= param1) {
            if (param4 <= param2) {
              kg.a(param7, param2, param4, param1, param6, na.field_d, param5, 126, param3);
              return;
            } else {
              kg.a(param3, param4, param2, param1, param6, na.field_d, param5, 105, param7);
              return;
            }
          } else {
            kg.a(param6, param1, param2, param4, param3, na.field_d, param5, 97, param7);
            return;
          }
        }
    }

    private gi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 480;
    }
}
