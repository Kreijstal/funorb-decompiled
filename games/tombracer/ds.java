/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    private int[] field_e;
    static jpa field_g;
    static String field_k;
    static String field_l;
    private int[] field_b;
    private boolean[] field_i;
    static int[] field_f;
    private int[] field_p;
    static qla field_n;
    private int[] field_a;
    private int[] field_c;
    private int[] field_m;
    private int[] field_j;
    private boolean[] field_d;
    private int[] field_h;
    private int[] field_o;

    final void b(int param0, int param1, int param2) {
        this.field_c[param0] = this.field_c[param0] + param2;
        if (param1 != 65408) {
            this.e(-108, -74);
        }
    }

    private final void f(int param0, int param1) {
        this.field_j[param1] = this.field_j[param1] + 1;
        int var3 = 125 % ((param0 - -38) / 60);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param2 == -4) {
          var4 = param0;
          if ((var4 ^ -1) == -8) {
            L0: {
              if (var5 == 0) {
                this.a(param1, 9266);
                if (var5 != 0) {
                  break L0;
                } else {
                  this.d(param1, -98);
                  return;
                }
              } else {
                if (5 == var4) {
                  break L0;
                } else {
                  if (-13 == (var4 ^ -1)) {
                    this.f(-112, param1);
                    if (var5 != 0) {
                      this.c(param1, -11);
                      this.b(-5, param1);
                      this.d(param1, -98);
                      return;
                    } else {
                      this.d(param1, -98);
                      return;
                    }
                  } else {
                    if (-11 != (var4 ^ -1)) {
                      if (15 == var4) {
                        this.c(param1, -11);
                        if (var5 == 0) {
                          this.d(param1, -98);
                          return;
                        } else {
                          this.b(-5, param1);
                          this.d(param1, -98);
                          return;
                        }
                      } else {
                        if ((var4 ^ -1) == -15) {
                          this.b(-5, param1);
                          this.d(param1, -98);
                          return;
                        } else {
                          if (-4 != (var4 ^ -1)) {
                            if ((var4 ^ -1) == -5) {
                              this.b(-5, param1);
                              this.d(param1, -98);
                              return;
                            } else {
                              this.d(param1, -98);
                              return;
                            }
                          } else {
                            if (var5 == 0) {
                              this.b(-5, param1);
                              this.d(param1, -98);
                              return;
                            } else {
                              if ((var4 ^ -1) != -5) {
                                this.d(param1, -98);
                                return;
                              } else {
                                this.b(-5, param1);
                                this.d(param1, -98);
                                return;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.c(param1, -11);
                      this.b(-5, param1);
                      this.d(param1, -98);
                      return;
                    }
                  }
                }
              }
            }
            this.e(-127, param1);
            if (var5 != 0) {
              this.f(-112, param1);
              this.c(param1, -11);
              this.b(-5, param1);
              this.d(param1, -98);
              return;
            } else {
              this.d(param1, -98);
              return;
            }
          } else {
            if (5 == var4) {
              this.e(-127, param1);
              if (var5 != 0) {
                this.f(-112, param1);
                this.c(param1, -11);
                this.b(-5, param1);
                this.d(param1, -98);
                return;
              } else {
                this.d(param1, -98);
                return;
              }
            } else {
              if (-13 == (var4 ^ -1)) {
                this.f(-112, param1);
                if (var5 != 0) {
                  this.c(param1, -11);
                  this.b(-5, param1);
                  this.d(param1, -98);
                  return;
                } else {
                  this.d(param1, -98);
                  return;
                }
              } else {
                if (-11 != (var4 ^ -1)) {
                  if (15 != var4) {
                    if ((var4 ^ -1) == -15) {
                      this.b(-5, param1);
                      this.d(param1, -98);
                      return;
                    } else {
                      if (-4 != (var4 ^ -1)) {
                        if ((var4 ^ -1) == -5) {
                          this.b(-5, param1);
                          this.d(param1, -98);
                          return;
                        } else {
                          this.d(param1, -98);
                          return;
                        }
                      } else {
                        if (var5 == 0) {
                          this.b(-5, param1);
                          this.d(param1, -98);
                          return;
                        } else {
                          if ((var4 ^ -1) != -5) {
                            this.d(param1, -98);
                            return;
                          } else {
                            this.b(-5, param1);
                            this.d(param1, -98);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    this.c(param1, -11);
                    if (var5 == 0) {
                      this.d(param1, -98);
                      return;
                    } else {
                      this.b(-5, param1);
                      this.d(param1, -98);
                      return;
                    }
                  }
                } else {
                  this.c(param1, -11);
                  if (var5 == 0) {
                    this.d(param1, -98);
                    return;
                  } else {
                    this.b(-5, param1);
                    this.d(param1, -98);
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
            return;
        }
        this.field_b[param0] = fh.a(this.field_b[param0], 1 << param1);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        var2 = 105 % ((param0 - -9) / 56);
        if (!lca.a(false)) {
          return;
        } else {
          L0: {
            if (param1) {
              bea.c(0, 0, bea.field_g, bea.field_a, 0, 192);
              break L0;
            } else {
              break L0;
            }
          }
          wu.field_a.b(-108, 0, 0);
          return;
        }
    }

    final void d(int param0, int param1, int param2) {
        this.field_e[param2] = this.field_e[param2] + param0;
        int var4 = 41 % ((param1 - -34) / 36);
    }

    private final void e(int param0, int param1) {
        this.field_h[param1] = this.field_h[param1] + 1;
        if (param0 != -127) {
            this.field_h = (int[]) null;
        }
    }

    final void a(byte param0) {
        if (param0 < 42) {
            this.c(-107, 24);
        }
    }

    private final void c(int param0, int param1) {
        this.field_a[param0] = this.field_a[param0] + 1;
        if (param1 != -11) {
            this.a(43, false);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_l = null;
        field_k = null;
        field_g = null;
        field_f = null;
        field_n = null;
    }

    private final void b(int param0, int param1) {
        this.field_m[param1] = this.field_m[param1] + 1;
        if (param0 != -5) {
            this.a(52, 52, false);
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 9266) {
            return;
        }
        this.field_p[param0] = this.field_p[param0] + 1;
    }

    final void a(int param0, byte param1, int param2) {
        this.field_o[param0] = fh.a(this.field_o[param0], 1 << param2);
        if (param1 != -52) {
            ds.a(false);
        }
    }

    private final void d(int param0, int param1) {
        int var3 = -47 % ((0 - param1) / 59);
        this.field_i[param0] = true;
    }

    final static int c(int param0, int param1, int param2) {
        param2 = (127 & param1) * param2 >> -403311897;
        if (param0 == -127) {
          if (2 <= param2) {
            if (-127 <= (param2 ^ -1)) {
              return (param1 & 65408) + param2;
            } else {
              L0: {
                param2 = 126;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  param2 = 2;
                  break L0;
                }
              }
              return (param1 & 65408) + param2;
            }
          } else {
            param2 = 2;
            return (param1 & 65408) + param2;
          }
        } else {
          field_n = (qla) null;
          if (2 <= param2) {
            if (-127 <= (param2 ^ -1)) {
              return (param1 & 65408) + param2;
            } else {
              L1: {
                param2 = 126;
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  param2 = 2;
                  break L1;
                }
              }
              return (param1 & 65408) + param2;
            }
          } else {
            param2 = 2;
            return (param1 & 65408) + param2;
          }
        }
    }

    ds(int param0) {
        this.field_j = new int[param0];
        this.field_e = new int[param0];
        this.field_p = new int[param0];
        this.field_b = new int[param0];
        this.field_m = new int[param0];
        this.field_h = new int[param0];
        this.field_d = new boolean[param0];
        this.field_i = new boolean[param0];
        this.field_a = new int[param0];
        this.field_c = new int[param0];
        this.field_o = new int[param0];
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          var3 = 0;
          L0: while (true) {
            if (this.field_d.length > var3) {
              if (var4 == 0) {
                L1: {
                  if (var3 == param0) {
                    break L1;
                  } else {
                    this.field_d[var3] = true;
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
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

    static {
        field_k = "+1 Idol";
        field_f = new int[8192];
        field_l = "Players: ";
    }
}
