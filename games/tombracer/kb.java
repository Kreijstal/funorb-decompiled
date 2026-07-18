/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends vg {
    int field_j;
    int field_l;
    long field_h;
    int[] field_o;
    private static String[] field_m;
    static float field_p;
    int field_f;
    int field_k;
    int field_n;
    int field_i;
    int field_g;

    final static ka a(int param0, boolean param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param3 == 2) {
          var5 = param4;
          if (0 != var5) {
            if (var5 != 1) {
              if (var5 == 2) {
                return ta.field_ub[param0];
              } else {
                if (var5 != 3) {
                  if (var5 != 4) {
                    if (5 == var5) {
                      return gca.field_g[param0];
                    } else {
                      if (var5 == 6) {
                        return mh.field_F[param0];
                      } else {
                        if (var5 != 7) {
                          if (var5 != 8) {
                            throw new IllegalArgumentException("Model category not recognised");
                          } else {
                            return hh.field_b[param0];
                          }
                        } else {
                          return koa.field_b[param0];
                        }
                      }
                    }
                  } else {
                    return jna.field_j[param0];
                  }
                } else {
                  return rl.field_t[param0];
                }
              }
            } else {
              return df.field_J[param0];
            }
          } else {
            return dia.a(param2, param0, param1, (byte) 124);
          }
        } else {
          boolean discarded$1 = kb.a(-126, -35, (byte) 96);
          var5 = param4;
          if (0 != var5) {
            if (var5 != 1) {
              if (var5 == 2) {
                return ta.field_ub[param0];
              } else {
                if (var5 != 3) {
                  if (var5 != 4) {
                    if (5 == var5) {
                      return gca.field_g[param0];
                    } else {
                      if (var5 == 6) {
                        return mh.field_F[param0];
                      } else {
                        if (var5 != 7) {
                          if (var5 != 8) {
                            throw new IllegalArgumentException("Model category not recognised");
                          } else {
                            return hh.field_b[param0];
                          }
                        } else {
                          return koa.field_b[param0];
                        }
                      }
                    }
                  } else {
                    return jna.field_j[param0];
                  }
                } else {
                  return rl.field_t[param0];
                }
              }
            } else {
              return df.field_J[param0];
            }
          } else {
            return dia.a(param2, param0, param1, (byte) 124);
          }
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 == 17) {
          if (-1 != (param1 & 2048)) {
            if (0 == (55 & param0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_m = null;
          if (-1 != (param1 & 2048)) {
            if (0 == (55 & param0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_m = null;
        int var1 = -64 % ((param0 - -32) / 32);
    }

    kb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((kb) this).field_j = param5;
            ((kb) this).field_n = param1;
            ((kb) this).field_k = param4;
            ((kb) this).field_i = param2;
            ((kb) this).field_g = param3;
            int fieldTemp$0 = uk.field_N;
            uk.field_N = uk.field_N + 1;
            ((kb) this).field_l = 65535 & fieldTemp$0;
            ((kb) this).field_o = param6;
            ((kb) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        gva.field_b.a(-63, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[4];
        field_m[2] = "Coin Bag";
        field_m[0] = "Key";
        field_m[3] = "Idol";
        field_m[1] = "Coin";
    }
}
