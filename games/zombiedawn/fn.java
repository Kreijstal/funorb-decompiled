/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends sp {
    private int field_x;
    private int field_l;
    private int field_s;
    private int field_u;
    private int field_n;
    private int field_y;
    private int field_o;
    private int field_p;
    private int field_z;
    private boolean field_r;
    private int field_w;
    private int field_q;
    private int field_v;
    private int field_m;
    private int field_t;

    final synchronized int g() {
        return ((fn) this).field_v < 0 ? -1 : ((fn) this).field_v;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fn param11, int param12, int param13) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, fn param8) {
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

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final void e() {
        if (((fn) this).field_l != 0) {
            if (((fn) this).field_o == -2147483648) {
                ((fn) this).field_o = 0;
            }
            ((fn) this).field_l = 0;
            this.i();
            return;
        }
    }

    private final synchronized void d(int param0, int param1) {
        ((fn) this).field_o = param0;
        ((fn) this).field_v = param1;
        ((fn) this).field_l = 0;
        this.i();
    }

    final synchronized int m() {
        return ((fn) this).field_m < 0 ? -((fn) this).field_m : ((fn) this).field_m;
    }

    final sp d() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, fn param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_y = param13.field_y - param13.field_w * param5;
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
                param13.field_y = param13.field_y + param13.field_w * param5;
                param13.field_u = param6;
                param13.field_n = param7;
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

    private final boolean h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((fn) this).field_o;
          if (var1 != -2147483648) {
            var2 = fn.a(var1, ((fn) this).field_v);
            var3 = fn.c(var1, ((fn) this).field_v);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((fn) this).field_y != var1) {
            break L1;
          } else {
            if (((fn) this).field_u != var2) {
              break L1;
            } else {
              if (((fn) this).field_n == var3) {
                if (((fn) this).field_o == -2147483648) {
                  ((fn) this).field_o = 0;
                  ((fn) this).field_n = 0;
                  ((fn) this).field_u = 0;
                  ((fn) this).field_y = 0;
                  ((fn) this).b(-27598);
                  return true;
                } else {
                  this.i();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((fn) this).field_y >= var1) {
            if (((fn) this).field_y <= var1) {
              ((fn) this).field_w = 0;
              break L2;
            } else {
              ((fn) this).field_w = -1;
              ((fn) this).field_l = ((fn) this).field_y - var1;
              break L2;
            }
          } else {
            ((fn) this).field_w = 1;
            ((fn) this).field_l = var1 - ((fn) this).field_y;
            break L2;
          }
        }
        L3: {
          if (((fn) this).field_u >= var2) {
            if (((fn) this).field_u <= var2) {
              ((fn) this).field_z = 0;
              break L3;
            } else {
              L4: {
                ((fn) this).field_z = -1;
                if (((fn) this).field_l == 0) {
                  break L4;
                } else {
                  if (((fn) this).field_l <= ((fn) this).field_u - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((fn) this).field_l = ((fn) this).field_u - var2;
              break L3;
            }
          } else {
            L5: {
              ((fn) this).field_z = 1;
              if (((fn) this).field_l == 0) {
                break L5;
              } else {
                if (((fn) this).field_l <= var2 - ((fn) this).field_u) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((fn) this).field_l = var2 - ((fn) this).field_u;
            break L3;
          }
        }
        if (((fn) this).field_n < var3) {
          ((fn) this).field_q = 1;
          if (((fn) this).field_l != 0) {
            if (((fn) this).field_l > var3 - ((fn) this).field_n) {
              ((fn) this).field_l = var3 - ((fn) this).field_n;
              return false;
            } else {
              return false;
            }
          } else {
            ((fn) this).field_l = var3 - ((fn) this).field_n;
            return false;
          }
        } else {
          L6: {
            if (((fn) this).field_n <= var3) {
              ((fn) this).field_q = 0;
              break L6;
            } else {
              L7: {
                ((fn) this).field_q = -1;
                if (((fn) this).field_l == 0) {
                  break L7;
                } else {
                  if (((fn) this).field_l <= ((fn) this).field_n - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((fn) this).field_l = ((fn) this).field_n - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, fn param9) {
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
        param9.field_u = param9.field_u + param9.field_z * (param6 - param3);
        param9.field_n = param9.field_n + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_y = param4 >> 2;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, fn param10) {
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

    final synchronized boolean f() {
        return ((fn) this).field_l != 0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fn param11, int param12, int param13) {
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

    final synchronized void a(boolean param0) {
        ((fn) this).field_m = (((fn) this).field_m ^ ((fn) this).field_m >> 31) + (((fn) this).field_m >>> 31);
        if (param0) {
          ((fn) this).field_m = -((fn) this).field_m;
          return;
        } else {
          return;
        }
    }

    final synchronized boolean l() {
        return ((fn) this).field_t < 0 || ((fn) this).field_t >= ((gi) (Object) ((fn) this).field_h).field_l.length << 8;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, fn param9) {
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
        param9.field_u = param9.field_u + param9.field_z * (param6 - param3);
        param9.field_n = param9.field_n + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_y = param4 >> 2;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fn param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_u = param11.field_u - param11.field_z * param5;
            param11.field_n = param11.field_n - param11.field_q * param5;
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
                param11.field_u = param11.field_u + param11.field_z * param5;
                param11.field_n = param11.field_n + param11.field_q * param5;
                param11.field_y = param6;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, fn param12) {
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
        param12.field_y = param12.field_y + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_u = param5 >> 2;
                param12.field_n = param6 >> 2;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, fn param10, int param11, int param12) {
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

    final synchronized int k() {
        return ((fn) this).field_o == -2147483648 ? 0 : ((fn) this).field_o;
    }

    final sp c() {
        return null;
    }

    final synchronized void d(int param0) {
        int var2 = ((gi) (Object) ((fn) this).field_h).field_l.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((fn) this).field_t = param0;
    }

    final int a() {
        if (((fn) this).field_o == 0) {
            if (((fn) this).field_l == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, fn param10, int param11, int param12) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, fn param12) {
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
        param12.field_y = param12.field_y + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_u = param5 >> 2;
                param12.field_n = param6 >> 2;
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

    final synchronized void e(int param0) {
        ((fn) this).field_s = param0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, fn param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_y = param13.field_y - param13.field_w * param5;
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
                param13.field_y = param13.field_y + param13.field_w * param5;
                param13.field_u = param6;
                param13.field_n = param7;
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

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((fn) this).field_l <= 0) {
            L1: {
              if (((fn) this).field_m != -256) {
                break L1;
              } else {
                if ((((fn) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (qf.field_l) {
                    return fn.a(0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, 0, param3, param2, (fn) this);
                  } else {
                    return fn.a(((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, 0, param3, param2, (fn) this);
                  }
                }
              }
            }
            if (qf.field_l) {
              return fn.b(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, 0, param3, param2, (fn) this, ((fn) this).field_m, param4);
            } else {
              return fn.b(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, 0, param3, param2, (fn) this, ((fn) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((fn) this).field_l;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((fn) this).field_l = ((fn) this).field_l + param1;
                if (((fn) this).field_m != -256) {
                  break L4;
                } else {
                  if ((((fn) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!qf.field_l) {
                      param1 = fn.b(((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, ((fn) this).field_w, 0, var6, param2, (fn) this);
                      break L3;
                    } else {
                      param1 = fn.b(0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, ((fn) this).field_z, ((fn) this).field_q, 0, var6, param2, (fn) this);
                      break L3;
                    }
                  }
                }
              }
              if (!qf.field_l) {
                param1 = fn.d(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, ((fn) this).field_w, 0, var6, param2, (fn) this, ((fn) this).field_m, param4);
                break L3;
              } else {
                param1 = fn.b(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, ((fn) this).field_z, ((fn) this).field_q, 0, var6, param2, (fn) this, ((fn) this).field_m, param4);
                break L3;
              }
            }
            ((fn) this).field_l = ((fn) this).field_l - param1;
            if (((fn) this).field_l == 0) {
              if (!this.h()) {
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

    final synchronized void a(int param0) {
        gi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((fn) this).field_l <= 0) {
            break L0;
          } else {
            if (param0 < ((fn) this).field_l) {
              ((fn) this).field_y = ((fn) this).field_y + ((fn) this).field_w * param0;
              ((fn) this).field_u = ((fn) this).field_u + ((fn) this).field_z * param0;
              ((fn) this).field_n = ((fn) this).field_n + ((fn) this).field_q * param0;
              ((fn) this).field_l = ((fn) this).field_l - param0;
              break L0;
            } else {
              L1: {
                if (((fn) this).field_o != -2147483648) {
                  break L1;
                } else {
                  ((fn) this).field_o = 0;
                  ((fn) this).field_n = 0;
                  ((fn) this).field_u = 0;
                  ((fn) this).field_y = 0;
                  ((fn) this).b(-27598);
                  param0 = ((fn) this).field_l;
                  break L1;
                }
              }
              ((fn) this).field_l = 0;
              this.i();
              break L0;
            }
          }
        }
        L2: {
          var2 = (gi) (Object) ((fn) this).field_h;
          var3 = ((fn) this).field_x << 8;
          var4 = ((fn) this).field_p << 8;
          var5 = var2.field_l.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((fn) this).field_s = 0;
            break L2;
          }
        }
        L3: {
          if (((fn) this).field_t >= 0) {
            break L3;
          } else {
            if (((fn) this).field_m <= 0) {
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              ((fn) this).field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((fn) this).field_t < var5) {
            break L4;
          } else {
            if (((fn) this).field_m >= 0) {
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              ((fn) this).field_t = var5 - 1;
              break L4;
            }
          }
        }
        ((fn) this).field_t = ((fn) this).field_t + ((fn) this).field_m * param0;
        if (((fn) this).field_s >= 0) {
          L5: {
            if (((fn) this).field_s <= 0) {
              break L5;
            } else {
              if (!((fn) this).field_r) {
                L6: {
                  if (((fn) this).field_m >= 0) {
                    if (((fn) this).field_t >= var4) {
                      var7 = (((fn) this).field_t - var3) / var6;
                      if (var7 < ((fn) this).field_s) {
                        ((fn) this).field_t = ((fn) this).field_t - var6 * var7;
                        ((fn) this).field_s = ((fn) this).field_s - var7;
                        break L6;
                      } else {
                        ((fn) this).field_t = ((fn) this).field_t - var6 * ((fn) this).field_s;
                        ((fn) this).field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((fn) this).field_t < var3) {
                      var7 = (var4 - 1 - ((fn) this).field_t) / var6;
                      if (var7 < ((fn) this).field_s) {
                        ((fn) this).field_t = ((fn) this).field_t + var6 * var7;
                        ((fn) this).field_s = ((fn) this).field_s - var7;
                        break L6;
                      } else {
                        ((fn) this).field_t = ((fn) this).field_t + var6 * ((fn) this).field_s;
                        ((fn) this).field_s = 0;
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
                  if (((fn) this).field_m >= 0) {
                    break L7;
                  } else {
                    if (((fn) this).field_t < var3) {
                      ((fn) this).field_t = var3 + var3 - 1 - ((fn) this).field_t;
                      ((fn) this).field_m = -((fn) this).field_m;
                      int fieldTemp$3 = ((fn) this).field_s - 1;
                      ((fn) this).field_s = ((fn) this).field_s - 1;
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
                  if (((fn) this).field_t >= var4) {
                    ((fn) this).field_t = var4 + var4 - 1 - ((fn) this).field_t;
                    ((fn) this).field_m = -((fn) this).field_m;
                    int fieldTemp$4 = ((fn) this).field_s - 1;
                    ((fn) this).field_s = ((fn) this).field_s - 1;
                    if (fieldTemp$4 != 0) {
                      if (((fn) this).field_t < var3) {
                        ((fn) this).field_t = var3 + var3 - 1 - ((fn) this).field_t;
                        ((fn) this).field_m = -((fn) this).field_m;
                        int fieldTemp$5 = ((fn) this).field_s - 1;
                        ((fn) this).field_s = ((fn) this).field_s - 1;
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
          if (((fn) this).field_m < 0) {
            if (((fn) this).field_t < 0) {
              ((fn) this).field_t = -1;
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((fn) this).field_t < var5) {
                break L9;
              } else {
                ((fn) this).field_t = var5;
                this.e();
                ((fn) this).b(-27598);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((fn) this).field_r) {
            if (((fn) this).field_m >= 0) {
              if (((fn) this).field_t < var4) {
                return;
              } else {
                ((fn) this).field_t = var3 + (((fn) this).field_t - var3) % var6;
                return;
              }
            } else {
              if (((fn) this).field_t < var3) {
                ((fn) this).field_t = var4 - 1 - (var4 - 1 - ((fn) this).field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((fn) this).field_m >= 0) {
                break L10;
              } else {
                if (((fn) this).field_t < var3) {
                  ((fn) this).field_t = var3 + var3 - 1 - ((fn) this).field_t;
                  ((fn) this).field_m = -((fn) this).field_m;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((fn) this).field_t >= var4) {
                ((fn) this).field_t = var4 + var4 - 1 - ((fn) this).field_t;
                ((fn) this).field_m = -((fn) this).field_m;
                if (((fn) this).field_t < var3) {
                  ((fn) this).field_t = var3 + var3 - 1 - ((fn) this).field_t;
                  ((fn) this).field_m = -((fn) this).field_m;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, fn param10) {
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, fn param8) {
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

    final static fn a(gi param0, int param1, int param2, int param3) {
        if (param0.field_l != null) {
          if (param0.field_l.length == 0) {
            return null;
          } else {
            return new fn(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final void i() {
        ((fn) this).field_y = ((fn) this).field_o;
        ((fn) this).field_u = fn.a(((fn) this).field_o, ((fn) this).field_v);
        ((fn) this).field_n = fn.c(((fn) this).field_o, ((fn) this).field_v);
    }

    final synchronized void b(int param0, int param1) {
        ((fn) this).a(param0, param1, ((fn) this).g());
    }

    final static fn a(gi param0, int param1, int param2) {
        if (param0.field_l != null) {
          if (param0.field_l.length == 0) {
            return null;
          } else {
            return new fn(param0, (int)((long)param0.field_m * 256L * (long)param1 / (long)(100 * qf.field_p)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        gi var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((fn) this).field_o != 0) {
            break L0;
          } else {
            if (((fn) this).field_l != 0) {
              break L0;
            } else {
              ((fn) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (gi) (Object) ((fn) this).field_h;
          var5 = ((fn) this).field_x << 8;
          var6 = ((fn) this).field_p << 8;
          var7 = var4.field_l.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((fn) this).field_s = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((fn) this).field_t >= 0) {
            break L2;
          } else {
            if (((fn) this).field_m <= 0) {
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              ((fn) this).field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((fn) this).field_t < var7) {
            break L3;
          } else {
            if (((fn) this).field_m >= 0) {
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              ((fn) this).field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (((fn) this).field_s >= 0) {
          L4: {
            if (((fn) this).field_s <= 0) {
              break L4;
            } else {
              if (!((fn) this).field_r) {
                if (((fn) this).field_m >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_l[((fn) this).field_x]);
                    if (((fn) this).field_t >= var6) {
                      var10 = (((fn) this).field_t - var5) / var8;
                      if (var10 < ((fn) this).field_s) {
                        ((fn) this).field_t = ((fn) this).field_t - var8 * var10;
                        ((fn) this).field_s = ((fn) this).field_s - var10;
                        continue L5;
                      } else {
                        ((fn) this).field_t = ((fn) this).field_t - var8 * ((fn) this).field_s;
                        ((fn) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_p - 1]);
                    if (((fn) this).field_t < var5) {
                      var10 = (var6 - 1 - ((fn) this).field_t) / var8;
                      if (var10 < ((fn) this).field_s) {
                        ((fn) this).field_t = ((fn) this).field_t + var8 * var10;
                        ((fn) this).field_s = ((fn) this).field_s - var10;
                        continue L6;
                      } else {
                        ((fn) this).field_t = ((fn) this).field_t + var8 * ((fn) this).field_s;
                        ((fn) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((fn) this).field_m >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_x]);
                    if (((fn) this).field_t < var5) {
                      ((fn) this).field_t = var5 + var5 - 1 - ((fn) this).field_t;
                      ((fn) this).field_m = -((fn) this).field_m;
                      int fieldTemp$5 = ((fn) this).field_s - 1;
                      ((fn) this).field_s = ((fn) this).field_s - 1;
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_l[((fn) this).field_p - 1]);
                  if (((fn) this).field_t >= var6) {
                    ((fn) this).field_t = var6 + var6 - 1 - ((fn) this).field_t;
                    ((fn) this).field_m = -((fn) this).field_m;
                    int fieldTemp$6 = ((fn) this).field_s - 1;
                    ((fn) this).field_s = ((fn) this).field_s - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_x]);
                      if (((fn) this).field_t < var5) {
                        ((fn) this).field_t = var5 + var5 - 1 - ((fn) this).field_t;
                        ((fn) this).field_m = -((fn) this).field_m;
                        int fieldTemp$7 = ((fn) this).field_s - 1;
                        ((fn) this).field_s = ((fn) this).field_s - 1;
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
          if (((fn) this).field_m < 0) {
            int discarded$8 = this.a(param0, var9, 0, param2, 0);
            if (((fn) this).field_t < 0) {
              ((fn) this).field_t = -1;
              this.e();
              ((fn) this).b(-27598);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.b(param0, var9, var7, param2, 0);
              if (((fn) this).field_t < var7) {
                break L9;
              } else {
                ((fn) this).field_t = var7;
                this.e();
                ((fn) this).b(-27598);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((fn) this).field_r) {
            if (((fn) this).field_m >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_l[((fn) this).field_x]);
                if (((fn) this).field_t >= var6) {
                  ((fn) this).field_t = var5 + (((fn) this).field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_p - 1]);
                if (((fn) this).field_t < var5) {
                  ((fn) this).field_t = var6 - 1 - (var6 - 1 - ((fn) this).field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((fn) this).field_m >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_x]);
                if (((fn) this).field_t < var5) {
                  ((fn) this).field_t = var5 + var5 - 1 - ((fn) this).field_t;
                  ((fn) this).field_m = -((fn) this).field_m;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_l[((fn) this).field_p - 1]);
              if (((fn) this).field_t >= var6) {
                ((fn) this).field_t = var6 + var6 - 1 - ((fn) this).field_t;
                ((fn) this).field_m = -((fn) this).field_m;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_l[((fn) this).field_x]);
                if (((fn) this).field_t < var5) {
                  ((fn) this).field_t = var5 + var5 - 1 - ((fn) this).field_t;
                  ((fn) this).field_m = -((fn) this).field_m;
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

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final int b() {
        int var1 = ((fn) this).field_y * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((fn) this).field_s == 0) {
            var1 = var1 - var1 * ((fn) this).field_t / (((gi) (Object) ((fn) this).field_h).field_l.length << 8);
        } else {
            if (((fn) this).field_s >= 0) {
                var1 = var1 - var1 * ((fn) this).field_x / ((gi) (Object) ((fn) this).field_h).field_l.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized int j() {
        return ((fn) this).field_o == -2147483648 ? 0 : ((fn) this).field_o + 32 >> 6;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = fn.a(param1, param2);
          var5 = fn.c(param1, param2);
          if (((fn) this).field_u == var4) {
            if (((fn) this).field_n == var5) {
              ((fn) this).field_l = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((fn) this).field_y;
                if (((fn) this).field_y - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((fn) this).field_y - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((fn) this).field_u <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((fn) this).field_u;
                  break L1;
                }
              }
              L2: {
                if (((fn) this).field_u - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((fn) this).field_u - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((fn) this).field_n <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((fn) this).field_n;
                  break L3;
                }
              }
              L4: {
                if (((fn) this).field_n - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((fn) this).field_n - var5;
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
              ((fn) this).field_l = param0;
              ((fn) this).field_o = param1;
              ((fn) this).field_v = param2;
              ((fn) this).field_w = (param1 - ((fn) this).field_y) / param0;
              ((fn) this).field_z = (var4 - ((fn) this).field_u) / param0;
              ((fn) this).field_q = (var5 - ((fn) this).field_n) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((fn) this).field_y;
              if (((fn) this).field_y - param1 <= var6) {
                break L6;
              } else {
                var6 = ((fn) this).field_y - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((fn) this).field_u <= var6) {
                break L7;
              } else {
                var6 = var4 - ((fn) this).field_u;
                break L7;
              }
            }
            L8: {
              if (((fn) this).field_u - var4 <= var6) {
                break L8;
              } else {
                var6 = ((fn) this).field_u - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((fn) this).field_n <= var6) {
                break L9;
              } else {
                var6 = var5 - ((fn) this).field_n;
                break L9;
              }
            }
            L10: {
              if (((fn) this).field_n - var5 <= var6) {
                break L10;
              } else {
                var6 = ((fn) this).field_n - var5;
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
            ((fn) this).field_l = param0;
            ((fn) this).field_o = param1;
            ((fn) this).field_v = param2;
            ((fn) this).field_w = (param1 - ((fn) this).field_y) / param0;
            ((fn) this).field_z = (var4 - ((fn) this).field_u) / param0;
            ((fn) this).field_q = (var5 - ((fn) this).field_n) / param0;
            return;
          }
        } else {
          this.d(param1, param2);
          return;
        }
    }

    final synchronized void i(int param0) {
        param0 = param0 << 8;
        int var2 = ((gi) (Object) ((fn) this).field_h).field_l.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((fn) this).field_t = param0;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((fn) this).field_l <= 0) {
            L1: {
              if (((fn) this).field_m != 256) {
                break L1;
              } else {
                if ((((fn) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (qf.field_l) {
                    return fn.b(0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, 0, param3, param2, (fn) this);
                  } else {
                    return fn.b(((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, 0, param3, param2, (fn) this);
                  }
                }
              }
            }
            if (qf.field_l) {
              return fn.a(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, 0, param3, param2, (fn) this, ((fn) this).field_m, param4);
            } else {
              return fn.a(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, 0, param3, param2, (fn) this, ((fn) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((fn) this).field_l;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((fn) this).field_l = ((fn) this).field_l + param1;
                if (((fn) this).field_m != 256) {
                  break L4;
                } else {
                  if ((((fn) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!qf.field_l) {
                      param1 = fn.a(((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, ((fn) this).field_w, 0, var6, param2, (fn) this);
                      break L3;
                    } else {
                      param1 = fn.a(0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, ((fn) this).field_z, ((fn) this).field_q, 0, var6, param2, (fn) this);
                      break L3;
                    }
                  }
                }
              }
              if (!qf.field_l) {
                param1 = fn.c(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_y, ((fn) this).field_w, 0, var6, param2, (fn) this, ((fn) this).field_m, param4);
                break L3;
              } else {
                param1 = fn.a(0, 0, ((gi) (Object) ((fn) this).field_h).field_l, param0, ((fn) this).field_t, param1, ((fn) this).field_u, ((fn) this).field_n, ((fn) this).field_z, ((fn) this).field_q, 0, var6, param2, (fn) this, ((fn) this).field_m, param4);
                break L3;
              }
            }
            ((fn) this).field_l = ((fn) this).field_l - param1;
            if (((fn) this).field_l == 0) {
              if (!this.h()) {
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

    final synchronized void g(int param0) {
        this.d(param0, ((fn) this).g());
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fn param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_u = param11.field_u - param11.field_z * param5;
            param11.field_n = param11.field_n - param11.field_q * param5;
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
                param11.field_u = param11.field_u + param11.field_z * param5;
                param11.field_n = param11.field_n + param11.field_q * param5;
                param11.field_y = param6;
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

    final synchronized void c(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((fn) this).field_u == 0) {
            if (((fn) this).field_n == 0) {
              ((fn) this).field_l = 0;
              ((fn) this).field_o = 0;
              ((fn) this).field_y = 0;
              ((fn) this).b(-27598);
              return;
            } else {
              L0: {
                var2 = -((fn) this).field_y;
                if (((fn) this).field_y <= var2) {
                  break L0;
                } else {
                  var2 = ((fn) this).field_y;
                  break L0;
                }
              }
              L1: {
                if (-((fn) this).field_u <= var2) {
                  break L1;
                } else {
                  var2 = -((fn) this).field_u;
                  break L1;
                }
              }
              L2: {
                if (((fn) this).field_u <= var2) {
                  break L2;
                } else {
                  var2 = ((fn) this).field_u;
                  break L2;
                }
              }
              L3: {
                if (-((fn) this).field_n <= var2) {
                  break L3;
                } else {
                  var2 = -((fn) this).field_n;
                  break L3;
                }
              }
              L4: {
                if (((fn) this).field_n <= var2) {
                  break L4;
                } else {
                  var2 = ((fn) this).field_n;
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
              ((fn) this).field_l = param0;
              ((fn) this).field_o = -2147483648;
              ((fn) this).field_w = -((fn) this).field_y / param0;
              ((fn) this).field_z = -((fn) this).field_u / param0;
              ((fn) this).field_q = -((fn) this).field_n / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((fn) this).field_y;
              if (((fn) this).field_y <= var2) {
                break L6;
              } else {
                var2 = ((fn) this).field_y;
                break L6;
              }
            }
            L7: {
              if (-((fn) this).field_u <= var2) {
                break L7;
              } else {
                var2 = -((fn) this).field_u;
                break L7;
              }
            }
            L8: {
              if (((fn) this).field_u <= var2) {
                break L8;
              } else {
                var2 = ((fn) this).field_u;
                break L8;
              }
            }
            L9: {
              if (-((fn) this).field_n <= var2) {
                break L9;
              } else {
                var2 = -((fn) this).field_n;
                break L9;
              }
            }
            L10: {
              if (((fn) this).field_n <= var2) {
                break L10;
              } else {
                var2 = ((fn) this).field_n;
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
            ((fn) this).field_l = param0;
            ((fn) this).field_o = -2147483648;
            ((fn) this).field_w = -((fn) this).field_y / param0;
            ((fn) this).field_z = -((fn) this).field_u / param0;
            ((fn) this).field_q = -((fn) this).field_n / param0;
            return;
          }
        } else {
          ((fn) this).g(0);
          ((fn) this).b(-27598);
          return;
        }
    }

    final synchronized void f(int param0) {
        if (((fn) this).field_m < 0) {
            ((fn) this).field_m = -param0;
        } else {
            ((fn) this).field_m = param0;
        }
    }

    private fn(gi param0, int param1, int param2) {
        ((fn) this).field_h = (ik) (Object) param0;
        ((fn) this).field_x = param0.field_i;
        ((fn) this).field_p = param0.field_k;
        ((fn) this).field_r = param0.field_j;
        ((fn) this).field_m = param1;
        ((fn) this).field_o = param2;
        ((fn) this).field_v = 8192;
        ((fn) this).field_t = 0;
        this.i();
    }

    final synchronized void h(int param0) {
        this.d(param0 << 6, ((fn) this).g());
    }

    private fn(gi param0, int param1, int param2, int param3) {
        ((fn) this).field_h = (ik) (Object) param0;
        ((fn) this).field_x = param0.field_i;
        ((fn) this).field_p = param0.field_k;
        ((fn) this).field_r = param0.field_j;
        ((fn) this).field_m = param1;
        ((fn) this).field_o = param2;
        ((fn) this).field_v = param3;
        ((fn) this).field_t = 0;
        this.i();
    }
}
