/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib {
    static String field_d;
    int field_a;
    int field_j;
    static rk field_k;
    private boolean field_n;
    int field_e;
    int field_l;
    int field_b;
    private boolean field_f;
    static oj field_c;
    int field_i;
    static String[] field_h;
    static String field_m;
    static volatile int field_g;

    void a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        var8 = stellarshard.field_B;
        if (param2 == 8) {
          if (!param5) {
            if (-2 == (param0 ^ -1)) {
              ((ib) this).a(424, param3);
              rl.field_b = oj.field_b;
              return;
            } else {
              ((ib) this).b(param3, -1);
              rl.field_b = oj.field_b;
              return;
            }
          } else {
            rl.field_b = rl.field_b - 1;
            if (0 >= rl.field_b) {
              if ((param0 ^ -1) != -2) {
                ((ib) this).b(param3, -1);
                rl.field_b = h.field_b;
                return;
              } else {
                ((ib) this).a(424, param3);
                rl.field_b = h.field_b;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    void a(byte param0) {
        int var4 = stellarshard.field_B;
        int var2 = 0;
        int var3 = ((ib) this).field_b;
        while (((ib) this).field_j > var2) {
            ((ib) this).a(((ib) this).field_l == var2 ? true : false, -9, var2, var3);
            var3 = var3 + ((ib) this).field_a;
            var2++;
        }
        if (param0 != 85) {
            ((ib) this).field_b = 82;
        }
    }

    int a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (param2 >= ((ib) this).field_e) {
          if (param2 < ((ib) this).field_i) {
            if (param1 >= ((ib) this).field_b) {
              if (param0 == 59) {
                var4 = (-((ib) this).field_b + param1) / ((ib) this).field_a;
                if (var4 >= ((ib) this).field_j) {
                  return -1;
                } else {
                  return var4;
                }
              } else {
                field_m = null;
                var4 = (-((ib) this).field_b + param1) / ((ib) this).field_a;
                if (var4 >= ((ib) this).field_j) {
                  return -1;
                } else {
                  return var4;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    abstract void a(int param0, int param1);

    abstract void b(int param0, int param1);

    abstract void a(boolean param0, int param1, int param2, int param3);

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_k = null;
        field_h = null;
        field_m = null;
        field_d = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        if (-1 == (gh.field_c ^ -1)) {
          L0: {
            if (0 == fb.field_n) {
              ((ib) this).field_f = false;
              if (!qc.field_a) {
                break L0;
              } else {
                var2 = ((ib) this).a((byte) 59, eb.field_a, ni.field_e);
                if (0 != (var2 ^ -1)) {
                  ((ib) this).field_l = var2;
                  ((ib) this).field_n = false;
                  if (!param0) {
                    ((ib) this).a(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((ib) this).field_n) {
                    break L0;
                  } else {
                    ((ib) this).field_l = var2;
                    ((ib) this).field_n = false;
                    if (!param0) {
                      ((ib) this).a(false);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              if (((ib) this).field_f) {
                var2 = ((ib) this).field_l;
                if ((var2 ^ -1) != 0) {
                  ((ib) this).a(fb.field_n, ni.field_e, (byte) 8, var2, -(var2 * ((ib) this).field_a) + (eb.field_a + -((ib) this).field_b), true);
                  break L0;
                } else {
                  if (param0) {
                    return;
                  } else {
                    ((ib) this).a(false);
                    return;
                  }
                }
              } else {
                ((ib) this).field_f = false;
                if (qc.field_a) {
                  var2 = ((ib) this).a((byte) 59, eb.field_a, ni.field_e);
                  if (0 != (var2 ^ -1)) {
                    ((ib) this).field_l = var2;
                    ((ib) this).field_n = false;
                    if (!param0) {
                      ((ib) this).a(false);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!((ib) this).field_n) {
                      ((ib) this).field_l = var2;
                      ((ib) this).field_n = false;
                      if (!param0) {
                        ((ib) this).a(false);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        ((ib) this).a(false);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!param0) {
                    ((ib) this).a(false);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0) {
            return;
          } else {
            ((ib) this).a(false);
            return;
          }
        } else {
          var2 = ((ib) this).a((byte) 59, oc.field_e, di.field_b);
          ((ib) this).field_l = var2;
          if (var2 == -1) {
            ((ib) this).field_f = false;
            if (!param0) {
              ((ib) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            ((ib) this).field_f = true;
            ((ib) this).a(gh.field_c, di.field_b, (byte) 8, var2, oc.field_e + -((ib) this).field_b + -(var2 * ((ib) this).field_a), false);
            if (!param0) {
              ((ib) this).a(false);
              return;
            } else {
              return;
            }
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    ib(int param0, int param1, int param2, int param3, int param4) {
        ((ib) this).field_n = true;
        ((ib) this).field_l = 0;
        ((ib) this).field_a = param4;
        ((ib) this).field_j = param0;
        ((ib) this).field_i = param2;
        ((ib) this).field_e = param1;
        ((ib) this).field_b = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Service unavailable";
        field_c = new oj();
        field_g = 0;
        field_m = "Type your email address again to make sure it's correct";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
