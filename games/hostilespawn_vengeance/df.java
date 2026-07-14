/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static bd[] field_g;
    private boolean field_h;
    static bd field_a;
    private int[] field_i;
    static String field_e;
    static int field_c;
    private int field_d;
    static bd field_j;
    private int field_f;

    final int b(int param0) {
        if (param0 != -25) {
            ((df) this).field_f = 98;
        }
        return 1 + ((df) this).field_f;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            df.a(-32);
            break L0;
          }
        }
        var3 = ((df) this).field_i.length;
        L1: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((df) this).field_h) {
              var3 = var3 + ((df) this).field_d;
              continue L1;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((df) this).field_d;
                continue L1;
              } else {
                var3 = 1;
                continue L1;
              }
            }
          }
        }
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            int discarded$0 = this.b(49, 5);
        }
        this.a(-80, 1 + ((df) this).field_f, param1);
    }

    final void a(int param0, byte param1) {
        L0: {
          if (param0 < 0) {
            break L0;
          } else {
            if (param0 > ((df) this).field_f) {
              break L0;
            } else {
              if (param1 != 35) {
                return;
              } else {
                L1: {
                  if (((df) this).field_f == param0) {
                    break L1;
                  } else {
                    kf.a(((df) this).field_i, param0 + 1, ((df) this).field_i, param0, ((df) this).field_f + -param0);
                    break L1;
                  }
                }
                ((df) this).field_f = ((df) this).field_f - 1;
                return;
              }
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param1 <= ((df) this).field_f) {
            break L0;
          } else {
            ((df) this).field_f = param1;
            break L0;
          }
        }
        if (param0 > -76) {
          return;
        } else {
          L1: {
            if (((df) this).field_i.length <= param1) {
              this.a(true, param1);
              break L1;
            } else {
              break L1;
            }
          }
          ((df) this).field_i[param1] = param2;
          return;
        }
    }

    final int a(int param0, int param1) {
        if (((df) this).field_f < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != -2262) {
            return -78;
          } else {
            return ((df) this).field_i[param0];
          }
        }
    }

    final static void a(int param0, oj param1, oc param2, oc param3, int param4, int param5, double param6, oj param7, oc param8, double param9) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        oj var19 = null;
        int var20 = 0;
        L0: {
          var20 = HostileSpawn.field_I ? 1 : 0;
          if (param1.field_i == param0) {
            param1.field_G = 1;
            break L0;
          } else {
            param1.field_G = 2;
            break L0;
          }
        }
        L1: {
          var13 = (int)((-param1.field_l.field_a + ((double)param4 + param9 - (double)param8.field_g)) * 24.0);
          var12 = (int)(24.0 * (-param1.field_l.field_f + (param6 + (double)param5 - (double)param8.field_e)));
          var14 = 0;
          if (var12 < -24) {
            break L1;
          } else {
            if (var12 < -25) {
              break L1;
            } else {
              if (23 > var13) {
                break L1;
              } else {
                if (24 > var13) {
                  param7.field_z = 4;
                  if (!pl.field_l) {
                    if ((eh.field_g ^ -1) >= -1) {
                      break L1;
                    } else {
                      ci.a(1, 46);
                      if (1 != uj.field_l) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    pl.field_l = false;
                    param1.field_I = 0;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (param1.field_i != 25) {
            L3: {
              if (-1 <= param1.field_F) {
                break L3;
              } else {
                var14 = 1;
                break L3;
              }
            }
            if (-251 >= param1.field_F) {
              break L2;
            } else {
              var14 = 5;
              break L2;
            }
          } else {
            var14 = 2;
            break L2;
          }
        }
        L4: {
          if (0 != param1.field_F) {
            break L4;
          } else {
            if (-4 == (param1.field_i ^ -1)) {
              param1.field_G = 0;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (param1.field_F < -2) {
            param1.field_F = param1.field_F - 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-1 != param1.field_h) {
            break L6;
          } else {
            param2.a((byte) 46, param3);
            param2.b(param8, 24161);
            param1.a(225, param2.a(param0 ^ 25127), 3);
            break L6;
          }
        }
        L7: {
          if (1 == param1.field_h) {
            param1.a(225, param1.field_c + 10.0, 4);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (param1.field_h != 2) {
            break L8;
          } else {
            param1.a(param0 + 222, param1.field_c - 10.0, 4);
            break L8;
          }
        }
        L9: {
          param1.field_e = param1.field_e - 1;
          if (param1.field_e >= 0) {
            break L9;
          } else {
            L10: {
              if (-4 == (param1.field_h ^ -1)) {
                param1.field_h = (int)(3.0 * Math.random());
                break L10;
              } else {
                param1.field_h = 3;
                break L10;
              }
            }
            if (3 != param1.field_i) {
              L11: {
                param1.field_e = (int)(5.0 * (50.0 * Math.random()));
                var15 = param8.field_e;
                var16 = param8.field_g;
                var17 = 0;
                var18 = 1;
                if (el.field_j <= var18) {
                  break L11;
                } else {
                  var19 = mm.field_m[var18];
                  if (4 != var19.field_i) {
                    break L11;
                  } else {
                    if (var15 != var19.field_j.field_e) {
                      break L11;
                    } else {
                      if (var19.field_j.field_g != var16) {
                        break L11;
                      } else {
                        var17 = 1;
                        break L11;
                      }
                    }
                  }
                }
              }
              if (var17 == 0) {
                param1.field_v = param1.field_v - 1;
                if ((param1.field_v - 1 ^ -1) > -1) {
                  break L9;
                } else {
                  mm.field_m[el.field_j] = new oj(param8, 4, rl.field_c);
                  el.field_j = el.field_j + 1;
                  break L9;
                }
              } else {
                break L9;
              }
            } else {
              param1.field_e = (int)(Math.random() * 25.0);
              break L9;
            }
          }
        }
        L12: {
          li.field_r = param1.a(var14, param0 ^ 0, ln.field_a);
          if (!li.field_r[0]) {
            break L12;
          } else {
            if (!li.field_r[1]) {
              break L12;
            } else {
              if (param1.field_h == 0) {
                param1.field_e = (int)(Math.random() * 10.0);
                param1.field_h = (int)(1.0 + 2.0 * Math.random());
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L13: {
          if (-4 == (param1.field_i ^ -1)) {
            param1.field_p = param1.field_p + 1;
            if (2 >= param1.field_p) {
              break L13;
            } else {
              param1.field_z = param1.field_z + 1;
              param1.field_p = 0;
              if (bf.field_f[1].length > param1.field_z) {
                break L13;
              } else {
                param1.field_z = 0;
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L14: {
          if (param1.field_I > 0) {
            break L14;
          } else {
            param1.c((byte) 44);
            bn.a(3, param1);
            break L14;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var4 = new int[this.b(0, param1)];
        int[] var3 = var4;
        kf.a(((df) this).field_i, 0, var4, 0, ((df) this).field_i.length);
        if (!param0) {
            int discarded$0 = this.b(-28, 87);
        }
        ((df) this).field_i = var4;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 44) {
            field_g = null;
        }
        field_g = null;
        field_a = null;
        field_j = null;
        field_e = null;
    }

    private df() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Moves the marine in relation to the mouse.<br><br><col=ffffff>PRESS THE TAB KEY TO SWITCH KEY LAYOUTS.</col>";
        field_c = 0;
        field_b = "Moves the marine in relation to the map.";
    }
}
