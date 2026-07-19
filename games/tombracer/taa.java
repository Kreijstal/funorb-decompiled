/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends vg {
    private int field_f;
    private int field_h;
    static nc field_g;

    final void a(uia param0, int param1) {
        try {
            if (param1 != 32654) {
                taa.a((byte) -36);
            }
            param0.i(this.field_h, 0);
            param0.i(this.field_f, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "taa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 16) {
            return -13;
        }
        return this.field_h;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if ((param2 ^ -1) == -11) {
                    break L3;
                  } else {
                    L4: {
                      if (param2 != 9) {
                        break L4;
                      } else {
                        param3 = param3 - (id.field_h[0].a() - -(id.field_h[0].a() / 2));
                        var4_int = 0;
                        L5: while (true) {
                          L6: {
                            if (-3 >= (var4_int ^ -1)) {
                              break L6;
                            } else {
                              var5 = var4_int + 10;
                              id.field_h[var5].a(param3, -(id.field_h[var5].c() >> -873154239) + param1);
                              param3 = param3 + id.field_h[var5].a();
                              var4_int++;
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param2 != 8) {
                        break L7;
                      } else {
                        param3 = param3 - (id.field_h[0].a() + id.field_h[0].a() / 2);
                        var4_int = 0;
                        L8: while (true) {
                          L9: {
                            if ((var4_int ^ -1) <= -3) {
                              break L9;
                            } else {
                              var5 = var4_int + 8;
                              id.field_h[var5].a(param3, -(id.field_h[var5].c() >> -1980345311) + param1);
                              param3 = param3 + id.field_h[var5].a();
                              var4_int++;
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L10: {
                      if ((param2 ^ -1) > -1) {
                        break L10;
                      } else {
                        if (7 < param2) {
                          break L10;
                        } else {
                          id.field_h[param2].a(-(id.field_h[param2].a() >> -1567654239) + param3, -(id.field_h[param2].c() >> 1548346849) + param1);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (-12 != (param2 ^ -1)) {
                      break L2;
                    } else {
                      id.field_h[16].a(-(id.field_h[16].a() >> -1331517311) + param3, -(id.field_h[16].c() >> -1132591743) + param1);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param3 = param3 - (id.field_h[0].a() * 2 - -(id.field_h[0].a() / 2));
                var4_int = 0;
                L11: while (true) {
                  if (-5 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    var5 = var4_int + 12;
                    id.field_h[var5].a(param3, param1 - (id.field_h[var5].c() >> -1496548831));
                    param3 = param3 + id.field_h[var5].a();
                    var4_int++;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        continue L11;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (param0 < -106) {
                break L1;
              } else {
                taa.a((byte) -56, 127, 63, -18);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "taa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    taa(int param0, int param1) {
        this.field_h = param0;
        this.field_f = param1;
    }

    final boolean b(int param0) {
        if (param0 == 1) {
          if (this.field_h != 0) {
            if (this.field_h == 1) {
              if (!wk.field_i[this.field_f]) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (di.field_f[this.field_f]) {
              if (this.field_h == 1) {
                if (wk.field_i[this.field_f]) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != -13939) {
            this.field_f = 74;
            return this.field_f;
        }
        return this.field_f;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 122 % ((69 - param0) / 39);
    }

    static {
        eqa discarded$0 = new eqa();
    }
}
