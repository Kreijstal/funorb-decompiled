/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    int field_b;
    double field_c;
    static String field_k;
    double field_h;
    static uf field_e;
    int field_d;
    private int field_g;
    double field_j;
    static tg[] field_a;
    static String[] field_f;
    static String field_i;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Bounce.field_N;
          var4 = ((dg) this).field_d;
          if (var4 == 0) {
            if (((dg) this).field_b != 0) {
              kc.field_c.a((int)((double)param1 + ((dg) this).field_c - 64.0), (int)((dg) this).field_h - od.field_f.field_s * (((dg) this).field_b + 2));
              var4 = param1 + (int)((dg) this).field_c;
              var5_int = -(od.field_f.field_s * (2 + ((dg) this).field_b)) + (16 + ((int)((dg) this).field_h + 16));
              var5_int -= 64;
              var6 = od.field_f.b(hf.field_c);
              var7 = od.field_f.field_s;
              ii.a(var4, hf.field_c, var5_int, 16744512, param0 + 7);
              ve.a(8 + (var7 + 16), var5_int + -27, ig.field_d, (byte) -82, 8 + (var6 + 8), -8 + var4 + -(var6 / 2));
              break L0;
            } else {
              kc.field_c.a((int)((double)param1 + ((dg) this).field_c - 64.0), (int)((dg) this).field_h);
              break L0;
            }
          } else {
            if (var4 != 1) {
              if (var4 != -3) {
                L1: {
                  if (var4 != -4) {
                    if (-5 == var4) {
                      break L1;
                    } else {
                      if (5 == var4) {
                        L2: {
                          if ((((dg) this).field_b ^ -1) != -3) {
                            break L2;
                          } else {
                            L3: {
                              var3 = ((dg) this).field_g * 4 / 256;
                              nk.field_h[var3].a((int)(-64.0 + (((dg) this).field_c + (double)param1)), (int)((dg) this).field_h);
                              var3 = ((dg) this).field_g * 16 / 256 % 20;
                              if ((var3 ^ -1) < -2) {
                                var3 = 0;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            nl.field_d[var3].a((int)((double)param1 + ((dg) this).field_c - 64.0), -16 + (int)((dg) this).field_h);
                            break L2;
                          }
                        }
                        L4: {
                          if (((dg) this).field_b != 0) {
                            break L4;
                          } else {
                            var3 = 3 * ((dg) this).field_g / 256;
                            wb.field_e[var3].a((int)(((dg) this).field_c + (double)param1 - 64.0), (int)((dg) this).field_h);
                            break L4;
                          }
                        }
                        if ((((dg) this).field_b ^ -1) != -2) {
                          break L0;
                        } else {
                          var3 = ((dg) this).field_g * 3 / 256;
                          bd.field_j[var3].a((int)(((dg) this).field_c + (double)param1 - 64.0), (int)((dg) this).field_h);
                          break L0;
                        }
                      } else {
                        if (-7 == var4) {
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var3 = ((dg) this).field_b * 6 / 256;
                if (4 == ((dg) this).field_d) {
                  fd.field_n[var3].a((int)(-64.0 + (((dg) this).field_c + (double)param1)), (int)((dg) this).field_h);
                  break L0;
                } else {
                  fd.field_n[var3].d((int)((double)param1 + ((dg) this).field_c - 64.0), (int)((dg) this).field_h);
                  break L0;
                }
              } else {
                L5: {
                  if (((dg) this).field_b < 16) {
                    q.field_F.d((int)(-64.0 + (((dg) this).field_c + (double)param1)), (int)((dg) this).field_h, -(((dg) this).field_b * 16) + 256);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (!vh.a(0, (byte) 88)) {
                  break L0;
                } else {
                  var4 = 0;
                  L6: while (true) {
                    if (2 <= var4) {
                      break L0;
                    } else {
                      var5 = 3.14 * (double)var4 + (0.05 * ((dg) this).field_h + ((dg) this).field_c);
                      var7 = (int)(Math.abs(((dg) this).field_h) / 10.0 + (double)var4) % 4;
                      var8 = 16 + ((dg) this).field_b;
                      uk.field_f[var7].a((int)(((dg) this).field_c + (double)param1 + Math.sin(var5) * (double)(4 * var8) - (double)(uk.field_f[var7].field_t / 2)), (int)(((dg) this).field_h + Math.cos((double)(1 + var4) * var5) * (double)var8 - (double)(4 * ((dg) this).field_b)));
                      var4++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              if (0 >= ((dg) this).field_b) {
                re.field_a.a((int)(-64.0 + ((double)param1 + ((dg) this).field_c)), -re.field_a.field_q + (int)((dg) this).field_h + a.field_f.field_q);
                break L0;
              } else {
                a.field_f.a((int)(-64.0 + (((dg) this).field_c + (double)param1)), (int)((dg) this).field_h);
                break L0;
              }
            }
          }
        }
        L7: {
          if (param0 == 1) {
            break L7;
          } else {
            ((dg) this).a(87, 11);
            break L7;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_k = null;
        field_a = null;
        if (param0 != 64) {
            return;
        }
        field_e = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Bounce.field_N;
          var2 = ((dg) this).field_d;
          if (var2 != 0) {
            if (1 != var2) {
              if ((var2 ^ -1) == -3) {
                ((dg) this).field_j = ((dg) this).field_h;
                if (-1 >= ((dg) this).field_b) {
                  break L0;
                } else {
                  L1: {
                    if (16 >= ((dg) this).field_b) {
                      break L1;
                    } else {
                      ((dg) this).field_j = 580.0;
                      break L1;
                    }
                  }
                  ((dg) this).field_b = ((dg) this).field_b + 1;
                  break L0;
                }
              } else {
                if (3 != var2) {
                  if (4 != var2) {
                    if (5 == var2) {
                      ((dg) this).field_j = ((dg) this).field_h;
                      ((dg) this).field_g = ((dg) this).field_g + 10;
                      if (-257 >= (((dg) this).field_g ^ -1)) {
                        ((dg) this).field_g = ((dg) this).field_g - 256;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      if (var2 == -7) {
                        ((dg) this).field_j = ((dg) this).field_h;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    ((dg) this).field_j = ((dg) this).field_h;
                    ((dg) this).field_b = ((dg) this).field_b + 10;
                    if (((dg) this).field_b < 256) {
                      break L0;
                    } else {
                      ((dg) this).field_b = ((dg) this).field_b - 256;
                      break L0;
                    }
                  }
                } else {
                  ((dg) this).field_j = ((dg) this).field_h;
                  ((dg) this).field_b = ((dg) this).field_b + 10;
                  if (((dg) this).field_b >= 256) {
                    ((dg) this).field_b = ((dg) this).field_b - 256;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((dg) this).field_j = (double)(-re.field_a.field_q) + ((double)a.field_f.field_q + ((dg) this).field_h);
              if (0 >= ((dg) this).field_b) {
                break L0;
              } else {
                ((dg) this).field_b = ((dg) this).field_b + 1;
                ((dg) this).field_j = (double)(-re.field_a.field_q) + (((dg) this).field_h + (double)a.field_f.field_q);
                if (-25 < ((dg) this).field_b) {
                  break L0;
                } else {
                  ((dg) this).field_b = 0;
                  break L0;
                }
              }
            }
          } else {
            ((dg) this).field_j = ((dg) this).field_h;
            if (-1 >= ((dg) this).field_b) {
              break L0;
            } else {
              ((dg) this).field_j = ((dg) this).field_j - (double)((2 + ((dg) this).field_b) * od.field_f.field_s);
              break L0;
            }
          }
        }
        L2: {
          if (param0 == -64) {
            break L2;
          } else {
            field_e = null;
            break L2;
          }
        }
    }

    final static void b(int param0) {
        hf.field_b = false;
        if (param0 != 16) {
            field_a = null;
        }
        int discarded$0 = jc.field_g.d((byte) -72);
    }

    final void a(int param0, int param1, double param2) {
        ((dg) this).field_c = param2;
        ((dg) this).field_h = 32.0 * Math.random() + 480.0;
        ((dg) this).field_d = param1;
        ((dg) this).field_b = 0;
        ((dg) this).field_j = ((dg) this).field_h;
        ((dg) this).field_g = 0;
        if (!(((dg) this).field_d != 5)) {
            ((dg) this).field_b = (int)(Math.random() * 3.0);
        }
        if (param0 <= 23) {
            ((dg) this).field_j = -0.44957444926435286;
        }
    }

    dg() {
        ((dg) this).field_d = 0;
        ((dg) this).field_c = 0.0;
        ((dg) this).field_b = 0;
        ((dg) this).field_h = 0.0;
        ((dg) this).field_j = 0.0;
    }

    final static String a(int param0, char param1, int param2) {
        int var5 = Bounce.field_N;
        char[] var3 = new char[param0];
        int var4 = 0;
        if (param2 != -13810) {
            dg.b(32);
        }
        while (var4 < param0) {
            var3[var4] = param1;
            var4++;
        }
        return new String(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Error connecting to server. Please try using a different server.";
        field_e = new uf();
        field_f = new String[]{"By rating", "By win percentage"};
        field_i = "Player names can be up to 12 letters, numbers and underscores";
    }
}
