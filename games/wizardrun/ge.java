/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ge {
    private int field_l;
    private int field_e;
    static int field_j;
    int field_a;
    private int field_c;
    static int[] field_n;
    static int field_f;
    static int field_b;
    private int field_h;
    private boolean field_g;
    private boolean field_m;
    static String field_k;
    static String field_i;
    private int field_d;

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param1 == 81) {
          if (vk.field_r != 96) {
            if (97 != vk.field_r) {
              if (vk.field_r != 84) {
                if (vk.field_r == 83) {
                  ((ge) this).b(-128, param0);
                  return;
                } else {
                  return;
                }
              } else {
                ((ge) this).b(-128, param0);
                return;
              }
            } else {
              ((ge) this).a(param0, false);
              return;
            }
          } else {
            ((ge) this).a(param1 + -87, param0);
            return;
          }
        } else {
          ((ge) this).b(-42, -78);
          if (vk.field_r != 96) {
            if (97 != vk.field_r) {
              if (vk.field_r != 84) {
                if (vk.field_r != 83) {
                  return;
                } else {
                  ((ge) this).b(-128, param0);
                  return;
                }
              } else {
                ((ge) this).b(-128, param0);
                return;
              }
            } else {
              ((ge) this).a(param0, false);
              return;
            }
          } else {
            ((ge) this).a(param1 + -87, param0);
            return;
          }
        }
    }

    void c(int param0) {
        int var4 = wizardrun.field_H;
        int var2 = 0;
        int var3 = ((ge) this).field_d;
        while (((ge) this).field_e > var2) {
            ((ge) this).a(var3, ((ge) this).field_a == var2 ? true : false, var2, (byte) -120);
            var3 = var3 + ((ge) this).field_c;
            var2++;
        }
    }

    abstract void b(int param0, int param1);

    abstract void a(int param0, boolean param1);

    final void b(int param0) {
        int var3 = 0;
        var3 = wizardrun.field_H;
        if (param0 == 0) {
          if (!((ge) this).field_m) {
            if (vk.field_r == 98) {
              if (((ge) this).field_a > 0) {
                ((ge) this).field_a = ((ge) this).field_a - 1;
                ((ge) this).field_g = true;
                return;
              } else {
                ((ge) this).field_a = ((ge) this).field_e;
                ((ge) this).field_a = ((ge) this).field_a - 1;
                ((ge) this).field_g = true;
                return;
              }
            } else {
              if (vk.field_r == 99) {
                ((ge) this).field_a = ((ge) this).field_a + 1;
                if (((ge) this).field_a < ((ge) this).field_e) {
                  ((ge) this).field_g = true;
                  return;
                } else {
                  ((ge) this).field_a = 0;
                  ((ge) this).field_g = true;
                  return;
                }
              } else {
                if (((ge) this).field_a < 0) {
                  return;
                } else {
                  this.a(((ge) this).field_a, (byte) 81);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.a(123, (byte) -33);
          if (!((ge) this).field_m) {
            if (vk.field_r == 98) {
              if (((ge) this).field_a > 0) {
                ((ge) this).field_a = ((ge) this).field_a - 1;
                ((ge) this).field_g = true;
                return;
              } else {
                ((ge) this).field_a = ((ge) this).field_e;
                ((ge) this).field_a = ((ge) this).field_a - 1;
                ((ge) this).field_g = true;
                return;
              }
            } else {
              if (vk.field_r == 99) {
                ((ge) this).field_a = ((ge) this).field_a + 1;
                if (((ge) this).field_a < ((ge) this).field_e) {
                  ((ge) this).field_g = true;
                  return;
                } else {
                  ((ge) this).field_a = 0;
                  ((ge) this).field_g = true;
                  return;
                }
              } else {
                if (((ge) this).field_a >= 0) {
                  this.a(((ge) this).field_a, (byte) 81);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    abstract void a(int param0, int param1);

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        if (param0 == -2) {
          if (w.field_c != 0) {
            var2 = this.a(tf.field_e, param0 + -57, dh.field_b);
            ((ge) this).field_a = var2;
            if (var2 == -1) {
              ((ge) this).field_m = false;
              return;
            } else {
              ((ge) this).field_m = true;
              ((ge) this).a(tf.field_e, var2, -(((ge) this).field_c * var2) + dh.field_b + -((ge) this).field_d, w.field_c, false, false);
              return;
            }
          } else {
            if (sh.field_c != 0) {
              if (((ge) this).field_m) {
                var2 = ((ge) this).field_a;
                if (var2 != -1) {
                  ((ge) this).a(pg.field_n, var2, -((ge) this).field_d + (fi.field_B + -(((ge) this).field_c * var2)), sh.field_c, true, false);
                  return;
                } else {
                  return;
                }
              } else {
                ((ge) this).field_m = false;
                if (ih.field_a) {
                  var2 = this.a(pg.field_n, -77, fi.field_B);
                  if (-1 == var2) {
                    if (((ge) this).field_g) {
                      return;
                    } else {
                      ((ge) this).field_g = false;
                      ((ge) this).field_a = var2;
                      return;
                    }
                  } else {
                    ((ge) this).field_g = false;
                    ((ge) this).field_a = var2;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((ge) this).field_m = false;
              if (ih.field_a) {
                var2 = this.a(pg.field_n, -77, fi.field_B);
                if (-1 == var2) {
                  if (!((ge) this).field_g) {
                    ((ge) this).field_g = false;
                    ((ge) this).field_a = var2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((ge) this).field_g = false;
                  ((ge) this).field_a = var2;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        int var8 = 0;
        var8 = wizardrun.field_H;
        if (!param4) {
          if (param3 == 1) {
            ((ge) this).b(-125, param1);
            ie.field_j = jl.field_r;
            if (param5) {
              ((ge) this).a(-72, -13, 38, -1, true, true);
              return;
            } else {
              return;
            }
          } else {
            ((ge) this).a(-6, param1);
            ie.field_j = jl.field_r;
            if (param5) {
              ((ge) this).a(-72, -13, 38, -1, true, true);
              return;
            } else {
              return;
            }
          }
        } else {
          ie.field_j = ie.field_j - 1;
          if (0 >= ie.field_j) {
            if (param3 == 1) {
              ((ge) this).b(-127, param1);
              ie.field_j = mk.field_b;
              if (!param5) {
                return;
              } else {
                ((ge) this).a(-72, -13, 38, -1, true, true);
                return;
              }
            } else {
              ((ge) this).a(-6, param1);
              ie.field_j = mk.field_b;
              if (!param5) {
                return;
              } else {
                ((ge) this).a(-72, -13, 38, -1, true, true);
                return;
              }
            }
          } else {
            if (param5) {
              ((ge) this).a(-72, -13, 38, -1, true, true);
              return;
            } else {
              return;
            }
          }
        }
    }

    abstract void a(int param0, boolean param1, int param2, byte param3);

    public static void a(boolean param0) {
        field_i = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            ge.a(false);
        }
    }

    ge(int param0, int param1, int param2, int param3, int param4) {
        ((ge) this).field_a = 0;
        ((ge) this).field_g = true;
        ((ge) this).field_d = param3;
        ((ge) this).field_e = param0;
        ((ge) this).field_h = param2;
        ((ge) this).field_c = param4;
        ((ge) this).field_l = param1;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 >= ((ge) this).field_l) {
          if (param0 < ((ge) this).field_h) {
            if (((ge) this).field_d > param2) {
              return -1;
            } else {
              var4 = (-((ge) this).field_d + param2) / ((ge) this).field_c;
              if (var4 < ((ge) this).field_e) {
                if (param1 > -52) {
                  field_n = null;
                  return var4;
                } else {
                  return var4;
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_n = new int[128];
        field_i = "Loading sound effects";
        field_k = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
