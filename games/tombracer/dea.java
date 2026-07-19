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
        this.field_b = this.field_e;
        this.field_d = 0.0f;
    }

    final static String a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = param0 * 20;
        var3 = var2 / 10;
        var4 = var2 / 1000;
        var5 = var4 / 60;
        var3 = var3 % 100;
        if (param1 != -8) {
          return (String) null;
        } else {
          L0: {
            L1: {
              var4 = var4 % 60;
              if (10 <= var5) {
                break L1;
              } else {
                var6 = "0" + var5;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = "" + var5;
            break L0;
          }
          L2: {
            L3: {
              var8 = var6 + ":";
              var6 = var8;
              var6 = var8;
              var6 = var8;
              if (-11 >= (var4 ^ -1)) {
                break L3;
              } else {
                var6 = var8 + "0" + var4;
                if (var7 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = var6 + var4;
            break L2;
          }
          L4: {
            L5: {
              var9 = var6 + ".";
              var6 = var9;
              var6 = var9;
              var6 = var9;
              if (10 <= var3) {
                break L5;
              } else {
                var6 = var9 + "0" + var3;
                if (var7 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var6 = var6 + var3;
            break L4;
          }
          return var6;
        }
    }

    final boolean b(int param0) {
        float var2 = 0.0f;
        var2 = this.field_e - this.field_b;
        if (param0 == 20) {
          if (this.field_d * this.field_d > var2 * var2) {
            if (0.10000000149011612f <= this.field_d * this.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = true;
          if (this.field_d * this.field_d > var2 * var2) {
            if (0.10000000149011612f <= this.field_d * this.field_d) {
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
        vb discarded$5 = null;
        vb discarded$6 = null;
        vb discarded$7 = null;
        vb discarded$8 = null;
        vb discarded$9 = null;
        float var4 = 0.0f;
        if (param0 <= -109) {
          L0: {
            var4 = (float)koa.b(0) / 500.0f;
            this.field_d = this.field_d + var4 * var4;
            this.field_b = this.field_b + this.field_d;
            if (!param1) {
              break L0;
            } else {
              if (!param2) {
                break L0;
              } else {
                this.field_d = 0.0f;
                this.field_b = this.field_e;
                if (this.field_b > this.field_e) {
                  if (!param2) {
                    if (this.field_f) {
                      this.field_d = -this.field_d / 8.0f;
                      this.field_b = this.field_e;
                      return;
                    } else {
                      discarded$5 = paa.c(141);
                      this.field_f = true;
                      this.field_d = -this.field_d / 8.0f;
                      this.field_b = this.field_e;
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
          if (this.field_b > this.field_e) {
            if (!param2) {
              if (this.field_f) {
                this.field_d = -this.field_d / 8.0f;
                this.field_b = this.field_e;
                return;
              } else {
                discarded$6 = paa.c(141);
                this.field_f = true;
                this.field_d = -this.field_d / 8.0f;
                this.field_b = this.field_e;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.c(-29);
          var4 = (float)koa.b(0) / 500.0f;
          this.field_d = this.field_d + var4 * var4;
          this.field_b = this.field_b + this.field_d;
          if (param1) {
            if (param2) {
              this.field_d = 0.0f;
              this.field_b = this.field_e;
              if (this.field_b > this.field_e) {
                if (!param2) {
                  if (this.field_f) {
                    this.field_d = -this.field_d / 8.0f;
                    this.field_b = this.field_e;
                    return;
                  } else {
                    discarded$7 = paa.c(141);
                    this.field_f = true;
                    this.field_d = -this.field_d / 8.0f;
                    this.field_b = this.field_e;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (this.field_b > this.field_e) {
                if (!param2) {
                  if (this.field_f) {
                    this.field_d = -this.field_d / 8.0f;
                    this.field_b = this.field_e;
                    return;
                  } else {
                    discarded$8 = paa.c(141);
                    this.field_f = true;
                    this.field_d = -this.field_d / 8.0f;
                    this.field_b = this.field_e;
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
            if (this.field_b > this.field_e) {
              if (!param2) {
                if (this.field_f) {
                  this.field_d = -this.field_d / 8.0f;
                  this.field_b = this.field_e;
                  return;
                } else {
                  discarded$9 = paa.c(141);
                  this.field_f = true;
                  this.field_d = -this.field_d / 8.0f;
                  this.field_b = this.field_e;
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
        this.field_f = false;
        this.field_d = 0.0f;
        if (param0 > -47) {
          return;
        } else {
          this.field_b = this.field_e - (float)koa.b(0) - (float)Math.abs((int)(Math.random() * (double)koa.b(0)));
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 60) {
          L0: {
            field_a = (mb) null;
            if (oba.field_e != null) {
              oba.field_e.a((byte) 105);
              oba.field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (oba.field_e != null) {
              oba.field_e.a((byte) 105);
              oba.field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int e(int param0) {
        int var2 = -25 % ((param0 - -41) / 39);
        return (int)this.field_b;
    }

    public dea() {
        this(0);
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = (mb) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    dea(int param0) {
        this.field_e = (float)param0;
        this.c(-125);
    }

    static {
        field_c = true;
    }
}
