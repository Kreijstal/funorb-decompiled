/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aga {
    private int field_g;
    private int field_h;
    private int field_i;
    private short[] field_b;
    static String field_a;
    private int field_e;
    ob field_c;
    private int field_f;
    int field_d;

    private final void b(byte param0) {
        int var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          var2 = this.field_d;
          if (2 != var2) {
            if ((var2 ^ -1) == -4) {
              this.field_f = 1;
              this.field_h = 2048;
              this.field_g = 0;
              this.field_i = 4096;
              break L0;
            } else {
              if ((var2 ^ -1) == -5) {
                this.field_h = 2048;
                this.field_g = 0;
                this.field_f = 4;
                this.field_i = 2048;
                break L0;
              } else {
                if (5 == var2) {
                  this.field_f = 4;
                  this.field_h = 2048;
                  this.field_i = 8192;
                  this.field_g = 0;
                  break L0;
                } else {
                  if ((var2 ^ -1) != -13) {
                    if (-14 != (var2 ^ -1)) {
                      if (-11 == (var2 ^ -1)) {
                        this.field_h = 512;
                        this.field_i = 2048;
                        this.field_g = 1536;
                        this.field_f = 3;
                        break L0;
                      } else {
                        if ((var2 ^ -1) != -12) {
                          if (6 == var2) {
                            this.field_g = 1280;
                            this.field_i = 2048;
                            this.field_h = 768;
                            this.field_f = 3;
                            break L0;
                          } else {
                            if (-8 != (var2 ^ -1)) {
                              if (-9 != (var2 ^ -1)) {
                                if (9 != var2) {
                                  if (14 == var2) {
                                    this.field_i = 2048;
                                    this.field_g = 1280;
                                    this.field_h = 768;
                                    this.field_f = 1;
                                    break L0;
                                  } else {
                                    if (15 != var2) {
                                      if (16 == var2) {
                                        this.field_h = 256;
                                        this.field_g = 1792;
                                        this.field_f = 1;
                                        this.field_i = 8192;
                                        break L0;
                                      } else {
                                        this.field_h = 2048;
                                        this.field_i = 2048;
                                        this.field_f = 0;
                                        this.field_g = 0;
                                        break L0;
                                      }
                                    } else {
                                      this.field_f = 1;
                                      this.field_h = 512;
                                      this.field_i = 4096;
                                      this.field_g = 1536;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.field_g = 1024;
                                  this.field_h = 1024;
                                  this.field_i = 4096;
                                  this.field_f = 3;
                                  break L0;
                                }
                              } else {
                                this.field_f = 3;
                                this.field_g = 1024;
                                this.field_h = 1024;
                                this.field_i = 2048;
                                break L0;
                              }
                            } else {
                              this.field_f = 3;
                              this.field_h = 768;
                              this.field_i = 4096;
                              this.field_g = 1280;
                              break L0;
                            }
                          }
                        } else {
                          this.field_f = 3;
                          this.field_g = 1536;
                          this.field_h = 512;
                          this.field_i = 4096;
                          break L0;
                        }
                      }
                    } else {
                      this.field_i = 8192;
                      this.field_h = 2048;
                      this.field_g = 0;
                      this.field_f = 2;
                      break L0;
                    }
                  } else {
                    this.field_g = 0;
                    this.field_i = 2048;
                    this.field_f = 2;
                    this.field_h = 2048;
                    break L0;
                  }
                }
              }
            }
          } else {
            this.field_i = 2048;
            this.field_g = 0;
            this.field_h = 2048;
            this.field_f = 1;
            break L0;
          }
        }
        L1: {
          if (param0 == 87) {
            break L1;
          } else {
            this.b((byte) -61);
            break L1;
          }
        }
    }

    private final void a(int param0, int param1, ha param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_c = param2.a(param5, param1, param0, param3, param6, 1.0f);
            if (param4 != 512) {
                aga.a(-83);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aga.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int stackIn_18_0 = 0;
        int var4;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == -1814184927) {
            break L0;
          } else {
            field_a = (String) null;
            break L0;
          }
        }
        L1: {
          if (param0) {
            var4 = 2048;
            break L1;
          } else {
            var5 = 2047 & param1 * this.field_i / 50 + this.field_e;
            var6 = this.field_f;
            if (var6 != 1) {
              if (-4 == (var6 ^ -1)) {
                var4 = ooa.field_e[var5] >> -1814184927;
                break L1;
              } else {
                if (4 != var6) {
                  if (-3 == (var6 ^ -1)) {
                    var4 = var5;
                    break L1;
                  } else {
                    if (5 == var6) {
                      L2: {
                        if ((var5 ^ -1) <= -1025) {
                          stackIn_18_0 = 2048 + -var5;
                          break L2;
                        } else {
                          stackIn_18_0 = var5;
                          break L2;
                        }
                      }
                      var4 = stackIn_18_0 << -1365349471;
                      break L1;
                    } else {
                      var4 = 2048;
                      break L1;
                    }
                  }
                } else {
                  var4 = var5 >> -611924438 << -822238229;
                  break L1;
                }
              }
            } else {
              var4 = 1024 - -(qu.field_b[var5 << -2069246749] >> -1696208892);
              break L1;
            }
          }
        }
        this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
    }

    public static void a(byte param0) {
        if (param0 != -113) {
            aga.a(111);
        }
        field_a = null;
    }

    final static nl[] a(int param0) {
        if (param0 != -1025) {
            field_a = (String) null;
        }
        return new nl[]{vw.field_a, ub.field_d, npa.field_f};
    }

    final static g a(boolean param0, int param1) {
        qg[] var2;
        int var3;
        qg var4;
        g[] var5;
        int var6;
        g var7;
        int var8;
        qg[] var9;
        var8 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var9 = cm.field_a;
          var2 = var9;
          var3 = 0;
          L0: while (true) {
            if (var9.length > var3) {
              var4 = var9[var3];
              var5 = var4.field_c;
              var6 = 0;
              L1: while (true) {
                if (var5.length <= var6) {
                  var3++;
                  continue L0;
                } else {
                  var7 = var5[var6];
                  if ((param1 ^ -1) != (var7.field_a ^ -1)) {
                    var6++;
                    continue L1;
                  } else {
                    return var7;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (g) null;
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 != -42) {
            this.a(32, (byte) 21);
        }
        this.field_d = param0;
        this.b((byte) 87);
    }

    aga(ha param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        try {
            if (ooa.field_e == null) {
                pd.b(2);
            }
            this.a(param4, param3, param0, param6, 512, param2, param5);
            var9_int = (-ri.field_q + 2 * param6 >> cn.field_b) + 1;
            this.field_b = new short[var9_int];
            for (var10 = 0; var10 < this.field_b.length; var10++) {
                this.field_b[var10] = (short)var9_int;
            }
            this.a(param7, (byte) -42);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_a = "You have 1 unread message!";
    }
}
