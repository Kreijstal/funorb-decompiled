/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dea {
    static mb field_a;
    private float field_d;
    static boolean field_c;
    private float field_b;
    private boolean field_f;
    private float field_e;

    final void d(int param0) {
        if (param0 != 31990) {
            return;
        }
        ((dea) this).field_b = ((dea) this).field_e;
        ((dea) this).field_d = 0.0f;
    }

    final static String a(int param0, byte param1) {
        String var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var2 = param0 * 20;
        int var3 = var2 / 10;
        int var4 = var2 / 1000;
        int var5 = var4 / 60;
        var3 = var3 % 100;
        var4 = var4 % 60;
        if (10 > var5) {
            var6 = "0" + var5;
        } else {
            var6 = "" + var5;
        }
        String var8 = var6 + ":";
        var6 = var8;
        var6 = var8;
        if (var4 < 10) {
            var6 = var8 + "0" + var4;
        } else {
            var6 = var8 + var4;
        }
        String var9 = var6 + ".";
        if (10 > var3) {
            var6 = var9 + "0" + var3;
        } else {
            var6 = var9 + var3;
        }
        return var6;
    }

    final boolean b(int param0) {
        float var2 = 0.0f;
        var2 = ((dea) this).field_e - ((dea) this).field_b;
        if (param0 == 20) {
          if (((dea) this).field_d * ((dea) this).field_d > var2 * var2) {
            if (0.10000000149011612f <= ((dea) this).field_d * ((dea) this).field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = true;
          if (((dea) this).field_d * ((dea) this).field_d > var2 * var2) {
            if (0.10000000149011612f <= ((dea) this).field_d * ((dea) this).field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, boolean param1, boolean param2) {
        float var4 = 0.0f;
        if (param0 <= -109) {
          L0: {
            var4 = (float)koa.b(0) / 500.0f;
            ((dea) this).field_d = ((dea) this).field_d + var4 * var4;
            ((dea) this).field_b = ((dea) this).field_b + ((dea) this).field_d;
            if (!param1) {
              break L0;
            } else {
              if (!param2) {
                break L0;
              } else {
                ((dea) this).field_d = 0.0f;
                ((dea) this).field_b = ((dea) this).field_e;
                if (((dea) this).field_b > ((dea) this).field_e) {
                  if (!param2) {
                    if (((dea) this).field_f) {
                      ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                      ((dea) this).field_b = ((dea) this).field_e;
                      return;
                    } else {
                      vb discarded$5 = paa.c(141);
                      ((dea) this).field_f = true;
                      ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                      ((dea) this).field_b = ((dea) this).field_e;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (((dea) this).field_b > ((dea) this).field_e) {
            if (!param2) {
              if (((dea) this).field_f) {
                ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                ((dea) this).field_b = ((dea) this).field_e;
                return;
              } else {
                vb discarded$6 = paa.c(141);
                ((dea) this).field_f = true;
                ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                ((dea) this).field_b = ((dea) this).field_e;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((dea) this).c(-29);
          var4 = (float)koa.b(0) / 500.0f;
          ((dea) this).field_d = ((dea) this).field_d + var4 * var4;
          ((dea) this).field_b = ((dea) this).field_b + ((dea) this).field_d;
          if (param1) {
            if (param2) {
              ((dea) this).field_d = 0.0f;
              ((dea) this).field_b = ((dea) this).field_e;
              if (((dea) this).field_b > ((dea) this).field_e) {
                if (!param2) {
                  if (((dea) this).field_f) {
                    ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                    ((dea) this).field_b = ((dea) this).field_e;
                    return;
                  } else {
                    vb discarded$7 = paa.c(141);
                    ((dea) this).field_f = true;
                    ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                    ((dea) this).field_b = ((dea) this).field_e;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((dea) this).field_b > ((dea) this).field_e) {
                if (!param2) {
                  if (((dea) this).field_f) {
                    ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                    ((dea) this).field_b = ((dea) this).field_e;
                    return;
                  } else {
                    vb discarded$8 = paa.c(141);
                    ((dea) this).field_f = true;
                    ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                    ((dea) this).field_b = ((dea) this).field_e;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((dea) this).field_b > ((dea) this).field_e) {
              if (!param2) {
                if (((dea) this).field_f) {
                  ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                  ((dea) this).field_b = ((dea) this).field_e;
                  return;
                } else {
                  vb discarded$9 = paa.c(141);
                  ((dea) this).field_f = true;
                  ((dea) this).field_d = -((dea) this).field_d / 8.0f;
                  ((dea) this).field_b = ((dea) this).field_e;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void c(int param0) {
        ((dea) this).field_f = false;
        ((dea) this).field_d = 0.0f;
        if (param0 > -47) {
          return;
        } else {
          ((dea) this).field_b = ((dea) this).field_e - (float)koa.b(0) - (float)Math.abs((int)(Math.random() * (double)koa.b(0)));
          return;
        }
    }

    final static void a(int param0) {
        if (!(oba.field_e == null)) {
            oba.field_e.a((byte) 105);
            oba.field_e = null;
        }
    }

    final int e(int param0) {
        int var2 = -25 % ((param0 - -41) / 39);
        return (int)((dea) this).field_b;
    }

    public dea() {
        this(0);
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    dea(int param0) {
        ((dea) this).field_e = (float)param0;
        ((dea) this).c(-125);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
    }
}
