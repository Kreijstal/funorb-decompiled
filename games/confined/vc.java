/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends gf {
    private int field_x;
    private int field_q;
    private boolean field_v;
    private int field_D;
    private int field_r;
    private int field_A;
    private int field_C;
    private int field_y;
    private int field_t;
    private int field_s;
    private int field_z;
    private int field_B;
    private int field_w;
    private int field_E;
    private int field_u;

    final gf d() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_r = param11.field_r - param11.field_E * param5;
            param11.field_x = param11.field_x - param11.field_y * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12) / param12;
                  if (param5 + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param0 = param13;
            param1 = param12;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_r = param11.field_r + param11.field_E * param5;
                param11.field_x = param11.field_x + param11.field_y * param5;
                param11.field_C = param6;
                param11.field_t = param4;
                return param5;
              } else {
                int incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            int incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vc param12) {
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param11 - param3;
          if (param4 + param11 - param3 <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_C = param12.field_C + param12.field_z * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_r = param5 >> 2;
                param12.field_x = param6 >> 2;
                param12.field_t = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vc param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_C = param13.field_C - param13.field_z * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 - param4 + param14 - 257) / param14;
              if (param5 + (param12 - param4 + param14 - 257) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14 - 1) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_C = param13.field_C + param13.field_z * param5;
                param13.field_r = param6;
                param13.field_x = param7;
                param13.field_t = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    final synchronized void h(int param0) {
        this.c(param0 << 6, this.f());
    }

    final synchronized void d(int param0) {
        if (((vc) this).field_B < 0) {
            ((vc) this).field_B = -param0;
        } else {
            ((vc) this).field_B = param0;
        }
    }

    private final static int e(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vc param12) {
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param3 - (param11 - 1);
          if (param4 + param3 - (param11 - 1) <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_C = param12.field_C + param12.field_z * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_r = param5 >> 2;
                param12.field_x = param6 >> 2;
                param12.field_t = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private final synchronized void g(int param0) {
        this.c(0, this.f());
    }

    private final void e() {
        if (((vc) this).field_q != 0) {
            if (((vc) this).field_A == -2147483648) {
                ((vc) this).field_A = 0;
            }
            ((vc) this).field_q = 0;
            this.h();
            return;
        }
    }

    final int b() {
        int var1 = ((vc) this).field_C * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((vc) this).field_D == 0) {
            var1 = var1 - var1 * ((vc) this).field_t / (((bi) (Object) ((vc) this).field_n).field_o.length << 8);
        } else {
            if (((vc) this).field_D >= 0) {
                var1 = var1 - var1 * ((vc) this).field_u / ((bi) (Object) ((vc) this).field_n).field_o.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vc param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            int incrementValue$0 = param3;
            param3++;
            int incrementValue$1 = param2;
            param2++;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            int incrementValue$2 = param3;
            param3++;
            int incrementValue$3 = param2;
            param2++;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            int incrementValue$4 = param3;
            param3++;
            int incrementValue$5 = param2;
            param2++;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            int incrementValue$6 = param3;
            param3++;
            int incrementValue$7 = param2;
            param2++;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            int incrementValue$8 = param3;
            param3++;
            int incrementValue$9 = param2;
            param2++;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_t = param2 << 8;
        return param3;
    }

    private final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = vc.a(param1, param2);
          var5 = vc.e(param1, param2);
          if (((vc) this).field_r == var4) {
            if (((vc) this).field_x == var5) {
              ((vc) this).field_q = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((vc) this).field_C;
                if (((vc) this).field_C - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((vc) this).field_C - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((vc) this).field_r <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((vc) this).field_r;
                  break L1;
                }
              }
              L2: {
                if (((vc) this).field_r - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((vc) this).field_r - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((vc) this).field_x <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((vc) this).field_x;
                  break L3;
                }
              }
              L4: {
                if (((vc) this).field_x - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((vc) this).field_x - var5;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var6) {
                  break L5;
                } else {
                  param0 = var6;
                  break L5;
                }
              }
              ((vc) this).field_q = param0;
              ((vc) this).field_A = param1;
              ((vc) this).field_w = param2;
              ((vc) this).field_z = (param1 - ((vc) this).field_C) / param0;
              ((vc) this).field_E = (var4 - ((vc) this).field_r) / param0;
              ((vc) this).field_y = (var5 - ((vc) this).field_x) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((vc) this).field_C;
              if (((vc) this).field_C - param1 <= var6) {
                break L6;
              } else {
                var6 = ((vc) this).field_C - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((vc) this).field_r <= var6) {
                break L7;
              } else {
                var6 = var4 - ((vc) this).field_r;
                break L7;
              }
            }
            L8: {
              if (((vc) this).field_r - var4 <= var6) {
                break L8;
              } else {
                var6 = ((vc) this).field_r - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((vc) this).field_x <= var6) {
                break L9;
              } else {
                var6 = var5 - ((vc) this).field_x;
                break L9;
              }
            }
            L10: {
              if (((vc) this).field_x - var5 <= var6) {
                break L10;
              } else {
                var6 = ((vc) this).field_x - var5;
                break L10;
              }
            }
            L11: {
              if (param0 <= var6) {
                break L11;
              } else {
                param0 = var6;
                break L11;
              }
            }
            ((vc) this).field_q = param0;
            ((vc) this).field_A = param1;
            ((vc) this).field_w = param2;
            ((vc) this).field_z = (param1 - ((vc) this).field_C) / param0;
            ((vc) this).field_E = (var4 - ((vc) this).field_r) / param0;
            ((vc) this).field_y = (var5 - ((vc) this).field_x) / param0;
            return;
          }
        } else {
          this.c(param1, param2);
          return;
        }
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((vc) this).field_q <= 0) {
            L1: {
              if (((vc) this).field_B != -256) {
                break L1;
              } else {
                if ((((vc) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (dk.field_j) {
                    return vc.a(0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, 0, param3, param2, (vc) this);
                  } else {
                    return vc.a(((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, 0, param3, param2, (vc) this);
                  }
                }
              }
            }
            if (dk.field_j) {
              return vc.c(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, 0, param3, param2, (vc) this, ((vc) this).field_B, param4);
            } else {
              return vc.a(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, 0, param3, param2, (vc) this, ((vc) this).field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((vc) this).field_q;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((vc) this).field_q = ((vc) this).field_q + param1;
                if (((vc) this).field_B != -256) {
                  break L4;
                } else {
                  if ((((vc) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!dk.field_j) {
                      param1 = vc.a(((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, ((vc) this).field_z, 0, var6, param2, (vc) this);
                      break L3;
                    } else {
                      param1 = vc.a(0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, ((vc) this).field_E, ((vc) this).field_y, 0, var6, param2, (vc) this);
                      break L3;
                    }
                  }
                }
              }
              if (!dk.field_j) {
                param1 = vc.a(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, ((vc) this).field_z, 0, var6, param2, (vc) this, ((vc) this).field_B, param4);
                break L3;
              } else {
                param1 = vc.a(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, ((vc) this).field_E, ((vc) this).field_y, 0, var6, param2, (vc) this, ((vc) this).field_B, param4);
                break L3;
              }
            }
            ((vc) this).field_q = ((vc) this).field_q - param1;
            if (((vc) this).field_q == 0) {
              if (!this.g()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    final synchronized void d(int param0, int param1) {
        ((vc) this).field_u = param0;
        ((vc) this).field_s = param1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10, int param11, int param12) {
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 + 256 - param4 + param11) / param11;
              if (param5 + (param9 + 256 - param4 + param11) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11) / param11;
                  if (param5 + (param9 - param4 + param11) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param0 = param12;
            param1 = param11;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_t = param4;
                return param5;
              } else {
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            int incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    final synchronized void c(boolean param0) {
        ((vc) this).field_v = param0 ? true : false;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_t = param4;
                return param5 >> 1;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_t = param4;
                return param5 >> 1;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vc param9) {
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param8 - param2;
          if (param3 + param8 - param2 <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_r = param9.field_r + param9.field_E * (param6 - param3);
        param9.field_x = param9.field_x + param9.field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_C = param4 >> 2;
                param9.field_t = param2 << 8;
                return param3;
              } else {
                int incrementValue$10 = param3;
                param3++;
                int incrementValue$11 = param2;
                param2++;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            int incrementValue$12 = param3;
            param3++;
            int incrementValue$13 = param2;
            param2++;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            int incrementValue$14 = param3;
            param3++;
            int incrementValue$15 = param2;
            param2++;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            int incrementValue$16 = param3;
            param3++;
            int incrementValue$17 = param2;
            param2++;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            int incrementValue$18 = param3;
            param3++;
            int incrementValue$19 = param2;
            param2++;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((bi) (Object) ((vc) this).field_n).field_o.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((vc) this).field_t = param0;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10) {
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param9 - param3;
          if (param4 + param9 - param3 <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_t = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            int incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            int incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            int incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    private final boolean g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((vc) this).field_A;
          if (var1 != -2147483648) {
            var2 = vc.a(var1, ((vc) this).field_w);
            var3 = vc.e(var1, ((vc) this).field_w);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((vc) this).field_C != var1) {
            break L1;
          } else {
            if (((vc) this).field_r != var2) {
              break L1;
            } else {
              if (((vc) this).field_x == var3) {
                if (((vc) this).field_A == -2147483648) {
                  ((vc) this).field_A = 0;
                  ((vc) this).field_x = 0;
                  ((vc) this).field_r = 0;
                  ((vc) this).field_C = 0;
                  ((vc) this).a(true);
                  return true;
                } else {
                  this.h();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((vc) this).field_C >= var1) {
            if (((vc) this).field_C <= var1) {
              ((vc) this).field_z = 0;
              break L2;
            } else {
              ((vc) this).field_z = -1;
              ((vc) this).field_q = ((vc) this).field_C - var1;
              break L2;
            }
          } else {
            ((vc) this).field_z = 1;
            ((vc) this).field_q = var1 - ((vc) this).field_C;
            break L2;
          }
        }
        L3: {
          if (((vc) this).field_r >= var2) {
            if (((vc) this).field_r <= var2) {
              ((vc) this).field_E = 0;
              break L3;
            } else {
              L4: {
                ((vc) this).field_E = -1;
                if (((vc) this).field_q == 0) {
                  break L4;
                } else {
                  if (((vc) this).field_q <= ((vc) this).field_r - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((vc) this).field_q = ((vc) this).field_r - var2;
              break L3;
            }
          } else {
            L5: {
              ((vc) this).field_E = 1;
              if (((vc) this).field_q == 0) {
                break L5;
              } else {
                if (((vc) this).field_q <= var2 - ((vc) this).field_r) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((vc) this).field_q = var2 - ((vc) this).field_r;
            break L3;
          }
        }
        if (((vc) this).field_x < var3) {
          ((vc) this).field_y = 1;
          if (((vc) this).field_q != 0) {
            if (((vc) this).field_q > var3 - ((vc) this).field_x) {
              ((vc) this).field_q = var3 - ((vc) this).field_x;
              return false;
            } else {
              return false;
            }
          } else {
            ((vc) this).field_q = var3 - ((vc) this).field_x;
            return false;
          }
        } else {
          L6: {
            if (((vc) this).field_x <= var3) {
              ((vc) this).field_y = 0;
              break L6;
            } else {
              L7: {
                ((vc) this).field_y = -1;
                if (((vc) this).field_q == 0) {
                  break L7;
                } else {
                  if (((vc) this).field_q <= ((vc) this).field_x - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((vc) this).field_q = ((vc) this).field_x - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final int c() {
        if (((vc) this).field_A == 0) {
            if (((vc) this).field_q == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((vc) this).field_q <= 0) {
            L1: {
              if (((vc) this).field_B != 256) {
                break L1;
              } else {
                if ((((vc) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (dk.field_j) {
                    return vc.b(0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, 0, param3, param2, (vc) this);
                  } else {
                    return vc.b(((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, 0, param3, param2, (vc) this);
                  }
                }
              }
            }
            if (dk.field_j) {
              return vc.d(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, 0, param3, param2, (vc) this, ((vc) this).field_B, param4);
            } else {
              return vc.b(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, 0, param3, param2, (vc) this, ((vc) this).field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((vc) this).field_q;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((vc) this).field_q = ((vc) this).field_q + param1;
                if (((vc) this).field_B != 256) {
                  break L4;
                } else {
                  if ((((vc) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!dk.field_j) {
                      param1 = vc.b(((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, ((vc) this).field_z, 0, var6, param2, (vc) this);
                      break L3;
                    } else {
                      param1 = vc.b(0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, ((vc) this).field_E, ((vc) this).field_y, 0, var6, param2, (vc) this);
                      break L3;
                    }
                  }
                }
              }
              if (!dk.field_j) {
                param1 = vc.b(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_C, ((vc) this).field_z, 0, var6, param2, (vc) this, ((vc) this).field_B, param4);
                break L3;
              } else {
                param1 = vc.b(0, 0, ((bi) (Object) ((vc) this).field_n).field_o, param0, ((vc) this).field_t, param1, ((vc) this).field_r, ((vc) this).field_x, ((vc) this).field_E, ((vc) this).field_y, 0, var6, param2, (vc) this, ((vc) this).field_B, param4);
                break L3;
              }
            }
            ((vc) this).field_q = ((vc) this).field_q - param1;
            if (((vc) this).field_q == 0) {
              if (!this.g()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((vc) this).field_r == 0) {
            if (((vc) this).field_x == 0) {
              ((vc) this).field_q = 0;
              ((vc) this).field_A = 0;
              ((vc) this).field_C = 0;
              ((vc) this).a(true);
              return;
            } else {
              L0: {
                var2 = -((vc) this).field_C;
                if (((vc) this).field_C <= var2) {
                  break L0;
                } else {
                  var2 = ((vc) this).field_C;
                  break L0;
                }
              }
              L1: {
                if (-((vc) this).field_r <= var2) {
                  break L1;
                } else {
                  var2 = -((vc) this).field_r;
                  break L1;
                }
              }
              L2: {
                if (((vc) this).field_r <= var2) {
                  break L2;
                } else {
                  var2 = ((vc) this).field_r;
                  break L2;
                }
              }
              L3: {
                if (-((vc) this).field_x <= var2) {
                  break L3;
                } else {
                  var2 = -((vc) this).field_x;
                  break L3;
                }
              }
              L4: {
                if (((vc) this).field_x <= var2) {
                  break L4;
                } else {
                  var2 = ((vc) this).field_x;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var2) {
                  break L5;
                } else {
                  param0 = var2;
                  break L5;
                }
              }
              ((vc) this).field_q = param0;
              ((vc) this).field_A = -2147483648;
              ((vc) this).field_z = -((vc) this).field_C / param0;
              ((vc) this).field_E = -((vc) this).field_r / param0;
              ((vc) this).field_y = -((vc) this).field_x / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((vc) this).field_C;
              if (((vc) this).field_C <= var2) {
                break L6;
              } else {
                var2 = ((vc) this).field_C;
                break L6;
              }
            }
            L7: {
              if (-((vc) this).field_r <= var2) {
                break L7;
              } else {
                var2 = -((vc) this).field_r;
                break L7;
              }
            }
            L8: {
              if (((vc) this).field_r <= var2) {
                break L8;
              } else {
                var2 = ((vc) this).field_r;
                break L8;
              }
            }
            L9: {
              if (-((vc) this).field_x <= var2) {
                break L9;
              } else {
                var2 = -((vc) this).field_x;
                break L9;
              }
            }
            L10: {
              if (((vc) this).field_x <= var2) {
                break L10;
              } else {
                var2 = ((vc) this).field_x;
                break L10;
              }
            }
            L11: {
              if (param0 <= var2) {
                break L11;
              } else {
                param0 = var2;
                break L11;
              }
            }
            ((vc) this).field_q = param0;
            ((vc) this).field_A = -2147483648;
            ((vc) this).field_z = -((vc) this).field_C / param0;
            ((vc) this).field_E = -((vc) this).field_r / param0;
            ((vc) this).field_y = -((vc) this).field_x / param0;
            return;
          }
        } else {
          this.g(0);
          ((vc) this).a(true);
          return;
        }
    }

    private final synchronized void c(int param0, int param1) {
        ((vc) this).field_A = param0;
        ((vc) this).field_w = param1;
        ((vc) this).field_q = 0;
        this.h();
    }

    private final synchronized int f() {
        return ((vc) this).field_w < 0 ? -1 : ((vc) this).field_w;
    }

    final synchronized void b(boolean param0) {
        ((vc) this).field_B = (((vc) this).field_B ^ ((vc) this).field_B >> 31) + (((vc) this).field_B >>> 31);
        if (param0) {
          ((vc) this).field_B = -((vc) this).field_B;
          return;
        } else {
          return;
        }
    }

    final synchronized void b(int param0, int param1) {
        ((vc) this).field_A = param0 << 6;
        ((vc) this).field_w = param1 << 6;
        ((vc) this).field_q = 0;
        this.h();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10, int param11, int param12) {
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 - param4 + param11 - 257) / param11;
              if (param5 + (param9 - param4 + param11 - 257) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11 - 1) / param11;
                  if (param5 + (param9 - param4 + param11 - 1) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param1 = param12;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_t = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param11;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            int incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    final synchronized boolean i() {
        return ((vc) this).field_B < 0;
    }

    final static vc a(bi param0, int param1, int param2) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new vc(param0, param1, 0);
          }
        } else {
          return null;
        }
    }

    final static vc b(bi param0, int param1, int param2) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new vc(param0, (int)((long)param0.field_n * 256L * (long)param1 / (long)(100 * dk.field_k)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final void h() {
        ((vc) this).field_C = ((vc) this).field_A;
        ((vc) this).field_r = vc.a(((vc) this).field_A, ((vc) this).field_w);
        ((vc) this).field_x = vc.e(((vc) this).field_A, ((vc) this).field_w);
    }

    final synchronized void c(int param0) {
        ((vc) this).field_D = param0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        bi var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((vc) this).field_A != 0) {
            break L0;
          } else {
            if (((vc) this).field_q != 0) {
              break L0;
            } else {
              ((vc) this).b(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (bi) (Object) ((vc) this).field_n;
          var5 = ((vc) this).field_u << 8;
          var6 = ((vc) this).field_s << 8;
          var7 = var4.field_o.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((vc) this).field_D = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((vc) this).field_t >= 0) {
            break L2;
          } else {
            if (((vc) this).field_B <= 0) {
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              ((vc) this).field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((vc) this).field_t < var7) {
            break L3;
          } else {
            if (((vc) this).field_B >= 0) {
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              ((vc) this).field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (((vc) this).field_D >= 0) {
          L4: {
            if (((vc) this).field_D <= 0) {
              break L4;
            } else {
              if (!((vc) this).field_v) {
                if (((vc) this).field_B >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[((vc) this).field_u]);
                    if (((vc) this).field_t >= var6) {
                      var10 = (((vc) this).field_t - var5) / var8;
                      if (var10 < ((vc) this).field_D) {
                        ((vc) this).field_t = ((vc) this).field_t - var8 * var10;
                        ((vc) this).field_D = ((vc) this).field_D - var10;
                        continue L5;
                      } else {
                        ((vc) this).field_t = ((vc) this).field_t - var8 * ((vc) this).field_D;
                        ((vc) this).field_D = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_s - 1]);
                    if (((vc) this).field_t < var5) {
                      var10 = (var6 - 1 - ((vc) this).field_t) / var8;
                      if (var10 < ((vc) this).field_D) {
                        ((vc) this).field_t = ((vc) this).field_t + var8 * var10;
                        ((vc) this).field_D = ((vc) this).field_D - var10;
                        continue L6;
                      } else {
                        ((vc) this).field_t = ((vc) this).field_t + var8 * ((vc) this).field_D;
                        ((vc) this).field_D = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((vc) this).field_B >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_u]);
                    if (((vc) this).field_t < var5) {
                      ((vc) this).field_t = var5 + var5 - 1 - ((vc) this).field_t;
                      ((vc) this).field_B = -((vc) this).field_B;
                      int fieldTemp$5 = ((vc) this).field_D - 1;
                      ((vc) this).field_D = ((vc) this).field_D - 1;
                      if (fieldTemp$5 != 0) {
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[((vc) this).field_s - 1]);
                  if (((vc) this).field_t >= var6) {
                    ((vc) this).field_t = var6 + var6 - 1 - ((vc) this).field_t;
                    ((vc) this).field_B = -((vc) this).field_B;
                    int fieldTemp$6 = ((vc) this).field_D - 1;
                    ((vc) this).field_D = ((vc) this).field_D - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_u]);
                      if (((vc) this).field_t < var5) {
                        ((vc) this).field_t = var5 + var5 - 1 - ((vc) this).field_t;
                        ((vc) this).field_B = -((vc) this).field_B;
                        int fieldTemp$7 = ((vc) this).field_D - 1;
                        ((vc) this).field_D = ((vc) this).field_D - 1;
                        if (fieldTemp$7 != 0) {
                          continue L8;
                        } else {
                          break L4;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (((vc) this).field_B < 0) {
            int discarded$8 = this.b(param0, var9, 0, param2, 0);
            if (((vc) this).field_t < 0) {
              ((vc) this).field_t = -1;
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.a(param0, var9, var7, param2, 0);
              if (((vc) this).field_t < var7) {
                break L9;
              } else {
                ((vc) this).field_t = var7;
                this.e();
                ((vc) this).a(true);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((vc) this).field_v) {
            if (((vc) this).field_B >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[((vc) this).field_u]);
                if (((vc) this).field_t >= var6) {
                  ((vc) this).field_t = var5 + (((vc) this).field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_s - 1]);
                if (((vc) this).field_t < var5) {
                  ((vc) this).field_t = var6 - 1 - (var6 - 1 - ((vc) this).field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((vc) this).field_B >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_u]);
                if (((vc) this).field_t < var5) {
                  ((vc) this).field_t = var5 + var5 - 1 - ((vc) this).field_t;
                  ((vc) this).field_B = -((vc) this).field_B;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_o[((vc) this).field_s - 1]);
              if (((vc) this).field_t >= var6) {
                ((vc) this).field_t = var6 + var6 - 1 - ((vc) this).field_t;
                ((vc) this).field_B = -((vc) this).field_B;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_o[((vc) this).field_u]);
                if (((vc) this).field_t < var5) {
                  ((vc) this).field_t = var5 + var5 - 1 - ((vc) this).field_t;
                  ((vc) this).field_B = -((vc) this).field_B;
                  continue L13;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vc param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_r = param11.field_r - param11.field_E * param5;
            param11.field_x = param11.field_x - param11.field_y * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12 - 1) / param12;
                  if (param5 + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_r = param11.field_r + param11.field_E * param5;
                param11.field_x = param11.field_x + param11.field_y * param5;
                param11.field_C = param6;
                param11.field_t = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                int incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            int incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final static vc a(bi param0, int param1, int param2, int param3) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new vc(param0, param1, param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.b(param0, param1 << 6, param2 << 6);
    }

    final synchronized void b(int param0) {
        bi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((vc) this).field_q <= 0) {
            break L0;
          } else {
            if (param0 < ((vc) this).field_q) {
              ((vc) this).field_C = ((vc) this).field_C + ((vc) this).field_z * param0;
              ((vc) this).field_r = ((vc) this).field_r + ((vc) this).field_E * param0;
              ((vc) this).field_x = ((vc) this).field_x + ((vc) this).field_y * param0;
              ((vc) this).field_q = ((vc) this).field_q - param0;
              break L0;
            } else {
              L1: {
                if (((vc) this).field_A != -2147483648) {
                  break L1;
                } else {
                  ((vc) this).field_A = 0;
                  ((vc) this).field_x = 0;
                  ((vc) this).field_r = 0;
                  ((vc) this).field_C = 0;
                  ((vc) this).a(true);
                  param0 = ((vc) this).field_q;
                  break L1;
                }
              }
              ((vc) this).field_q = 0;
              this.h();
              break L0;
            }
          }
        }
        L2: {
          var2 = (bi) (Object) ((vc) this).field_n;
          var3 = ((vc) this).field_u << 8;
          var4 = ((vc) this).field_s << 8;
          var5 = var2.field_o.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((vc) this).field_D = 0;
            break L2;
          }
        }
        L3: {
          if (((vc) this).field_t >= 0) {
            break L3;
          } else {
            if (((vc) this).field_B <= 0) {
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              ((vc) this).field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((vc) this).field_t < var5) {
            break L4;
          } else {
            if (((vc) this).field_B >= 0) {
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              ((vc) this).field_t = var5 - 1;
              break L4;
            }
          }
        }
        ((vc) this).field_t = ((vc) this).field_t + ((vc) this).field_B * param0;
        if (((vc) this).field_D >= 0) {
          L5: {
            if (((vc) this).field_D <= 0) {
              break L5;
            } else {
              if (!((vc) this).field_v) {
                L6: {
                  if (((vc) this).field_B >= 0) {
                    if (((vc) this).field_t >= var4) {
                      var7 = (((vc) this).field_t - var3) / var6;
                      if (var7 < ((vc) this).field_D) {
                        ((vc) this).field_t = ((vc) this).field_t - var6 * var7;
                        ((vc) this).field_D = ((vc) this).field_D - var7;
                        break L6;
                      } else {
                        ((vc) this).field_t = ((vc) this).field_t - var6 * ((vc) this).field_D;
                        ((vc) this).field_D = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((vc) this).field_t < var3) {
                      var7 = (var4 - 1 - ((vc) this).field_t) / var6;
                      if (var7 < ((vc) this).field_D) {
                        ((vc) this).field_t = ((vc) this).field_t + var6 * var7;
                        ((vc) this).field_D = ((vc) this).field_D - var7;
                        break L6;
                      } else {
                        ((vc) this).field_t = ((vc) this).field_t + var6 * ((vc) this).field_D;
                        ((vc) this).field_D = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L7: {
                  if (((vc) this).field_B >= 0) {
                    break L7;
                  } else {
                    if (((vc) this).field_t < var3) {
                      ((vc) this).field_t = var3 + var3 - 1 - ((vc) this).field_t;
                      ((vc) this).field_B = -((vc) this).field_B;
                      int fieldTemp$3 = ((vc) this).field_D - 1;
                      ((vc) this).field_D = ((vc) this).field_D - 1;
                      if (fieldTemp$3 != 0) {
                        break L7;
                      } else {
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  if (((vc) this).field_t >= var4) {
                    ((vc) this).field_t = var4 + var4 - 1 - ((vc) this).field_t;
                    ((vc) this).field_B = -((vc) this).field_B;
                    int fieldTemp$4 = ((vc) this).field_D - 1;
                    ((vc) this).field_D = ((vc) this).field_D - 1;
                    if (fieldTemp$4 != 0) {
                      if (((vc) this).field_t < var3) {
                        ((vc) this).field_t = var3 + var3 - 1 - ((vc) this).field_t;
                        ((vc) this).field_B = -((vc) this).field_B;
                        int fieldTemp$5 = ((vc) this).field_D - 1;
                        ((vc) this).field_D = ((vc) this).field_D - 1;
                        if (fieldTemp$5 != 0) {
                          continue L8;
                        } else {
                          break L5;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (((vc) this).field_B < 0) {
            if (((vc) this).field_t < 0) {
              ((vc) this).field_t = -1;
              this.e();
              ((vc) this).a(true);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((vc) this).field_t < var5) {
                break L9;
              } else {
                ((vc) this).field_t = var5;
                this.e();
                ((vc) this).a(true);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((vc) this).field_v) {
            if (((vc) this).field_B >= 0) {
              if (((vc) this).field_t < var4) {
                return;
              } else {
                ((vc) this).field_t = var3 + (((vc) this).field_t - var3) % var6;
                return;
              }
            } else {
              if (((vc) this).field_t < var3) {
                ((vc) this).field_t = var4 - 1 - (var4 - 1 - ((vc) this).field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((vc) this).field_B >= 0) {
                break L10;
              } else {
                if (((vc) this).field_t < var3) {
                  ((vc) this).field_t = var3 + var3 - 1 - ((vc) this).field_t;
                  ((vc) this).field_B = -((vc) this).field_B;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((vc) this).field_t >= var4) {
                ((vc) this).field_t = var4 + var4 - 1 - ((vc) this).field_t;
                ((vc) this).field_B = -((vc) this).field_B;
                if (((vc) this).field_t < var3) {
                  ((vc) this).field_t = var3 + var3 - 1 - ((vc) this).field_t;
                  ((vc) this).field_B = -((vc) this).field_B;
                  continue L11;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vc param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            int incrementValue$0 = param3;
            param3++;
            int incrementValue$1 = param2;
            param2--;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            int incrementValue$2 = param3;
            param3++;
            int incrementValue$3 = param2;
            param2--;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            int incrementValue$4 = param3;
            param3++;
            int incrementValue$5 = param2;
            param2--;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            int incrementValue$6 = param3;
            param3++;
            int incrementValue$7 = param2;
            param2--;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            int incrementValue$8 = param3;
            param3++;
            int incrementValue$9 = param2;
            param2--;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_t = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vc param10) {
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param3 - (param9 - 1);
          if (param4 + param3 - (param9 - 1) <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_t = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            int incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            int incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            int incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    final gf a() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vc param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_C = param13.field_C - param13.field_z * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 + 256 - param4 + param14) / param14;
              if (param5 + (param12 + 256 - param4 + param14) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_C = param13.field_C + param13.field_z * param5;
                param13.field_r = param6;
                param13.field_x = param7;
                param13.field_t = param4;
                return param5;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vc param9) {
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param2 - (param8 - 1);
          if (param3 + param2 - (param8 - 1) <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_r = param9.field_r + param9.field_E * (param6 - param3);
        param9.field_x = param9.field_x + param9.field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_C = param4 >> 2;
                param9.field_t = param2 << 8;
                return param3;
              } else {
                int incrementValue$10 = param3;
                param3++;
                int incrementValue$11 = param2;
                param2--;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            int incrementValue$12 = param3;
            param3++;
            int incrementValue$13 = param2;
            param2--;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            int incrementValue$14 = param3;
            param3++;
            int incrementValue$15 = param2;
            param2--;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            int incrementValue$16 = param3;
            param3++;
            int incrementValue$17 = param2;
            param2--;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            int incrementValue$18 = param3;
            param3++;
            int incrementValue$19 = param2;
            param2--;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    private vc(bi param0, int param1, int param2) {
        ((vc) this).field_n = (ob) (Object) param0;
        ((vc) this).field_u = param0.field_p;
        ((vc) this).field_s = param0.field_r;
        ((vc) this).field_v = param0.field_q;
        ((vc) this).field_B = param1;
        ((vc) this).field_A = param2;
        ((vc) this).field_w = 8192;
        ((vc) this).field_t = 0;
        this.h();
    }

    private vc(bi param0, int param1, int param2, int param3) {
        ((vc) this).field_n = (ob) (Object) param0;
        ((vc) this).field_u = param0.field_p;
        ((vc) this).field_s = param0.field_r;
        ((vc) this).field_v = param0.field_q;
        ((vc) this).field_B = param1;
        ((vc) this).field_A = param2;
        ((vc) this).field_w = param3;
        ((vc) this).field_t = 0;
        this.h();
    }
}
