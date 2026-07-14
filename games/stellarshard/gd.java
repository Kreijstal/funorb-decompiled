/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends kd {
    private int field_z;
    private int field_B;
    private int field_t;
    private int field_w;
    private int field_r;
    private int field_v;
    private int field_x;
    private boolean field_y;
    private int field_p;
    private int field_u;
    private int field_s;
    private int field_C;
    private int field_q;
    private int field_o;
    private int field_A;

    final synchronized void f(int param0) {
        if (((gd) this).field_C < 0) {
            ((gd) this).field_C = -param0;
        } else {
            ((gd) this).field_C = param0;
        }
    }

    final synchronized void h(int param0) {
        param0 = param0 << 8;
        int var2 = ((ud) (Object) ((gd) this).field_l).field_n.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((gd) this).field_x = param0;
    }

    final kd d() {
        return null;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, gd param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_A * param5;
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
                param13.field_u = param13.field_u + param13.field_A * param5;
                param13.field_s = param6;
                param13.field_z = param7;
                param13.field_x = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((gd) this).field_r <= 0) {
            L1: {
              if (((gd) this).field_C != -256) {
                break L1;
              } else {
                if ((((gd) this).field_x & 255) != 0) {
                  break L1;
                } else {
                  if (ba.field_d) {
                    return gd.a(0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, 0, param3, param2, (gd) this);
                  } else {
                    return gd.b(((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, 0, param3, param2, (gd) this);
                  }
                }
              }
            }
            if (ba.field_d) {
              return gd.b(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, 0, param3, param2, (gd) this, ((gd) this).field_C, param4);
            } else {
              return gd.a(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, 0, param3, param2, (gd) this, ((gd) this).field_C, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((gd) this).field_r;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((gd) this).field_r = ((gd) this).field_r + param1;
                if (((gd) this).field_C != -256) {
                  break L4;
                } else {
                  if ((((gd) this).field_x & 255) != 0) {
                    break L4;
                  } else {
                    if (!ba.field_d) {
                      param1 = gd.a(((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, ((gd) this).field_A, 0, var6, param2, (gd) this);
                      break L3;
                    } else {
                      param1 = gd.b(0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, ((gd) this).field_q, ((gd) this).field_p, 0, var6, param2, (gd) this);
                      break L3;
                    }
                  }
                }
              }
              if (!ba.field_d) {
                param1 = gd.a(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, ((gd) this).field_A, 0, var6, param2, (gd) this, ((gd) this).field_C, param4);
                break L3;
              } else {
                param1 = gd.a(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, ((gd) this).field_q, ((gd) this).field_p, 0, var6, param2, (gd) this, ((gd) this).field_C, param4);
                break L3;
              }
            }
            ((gd) this).field_r = ((gd) this).field_r - param1;
            if (((gd) this).field_r == 0) {
              if (!this.e()) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, gd param10) {
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
                param10.field_x = param3 << 8;
                return param4 >> 1;
              } else {
                param3++;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                continue L2;
              }
            }
          } else {
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            continue L1;
          }
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, gd param10) {
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
                param10.field_x = param3 << 8;
                return param4 >> 1;
              } else {
                param3--;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                continue L2;
              }
            }
          } else {
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            continue L1;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, gd param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_q * param5;
            param11.field_z = param11.field_z - param11.field_p * param5;
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
                param11.field_s = param11.field_s + param11.field_q * param5;
                param11.field_z = param11.field_z + param11.field_p * param5;
                param11.field_u = param6;
                param11.field_x = param4;
                return param5;
              } else {
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final static gd a(ud param0, int param1, int param2, int param3) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new gd(param0, param1, param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    final int b() {
        if (((gd) this).field_o == 0) {
            if (((gd) this).field_r == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, gd param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param8.field_x = param2 << 8;
        return param3;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, gd param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_q * param5;
            param11.field_z = param11.field_z - param11.field_p * param5;
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
                param11.field_s = param11.field_s + param11.field_q * param5;
                param11.field_z = param11.field_z + param11.field_p * param5;
                param11.field_u = param6;
                param11.field_x = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final synchronized void d(int param0) {
        this.e(param0, this.h());
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, gd param11, int param12, int param13) {
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
                param11.field_x = param4;
                return param5 >> 1;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final int a() {
        int var1 = ((gd) this).field_u * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((gd) this).field_w == 0) {
            var1 = var1 - var1 * ((gd) this).field_x / (((ud) (Object) ((gd) this).field_l).field_n.length << 8);
        } else {
            if (((gd) this).field_w >= 0) {
                var1 = var1 - var1 * ((gd) this).field_B / ((ud) (Object) ((gd) this).field_l).field_n.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    private final void g() {
        ((gd) this).field_u = ((gd) this).field_o;
        ((gd) this).field_s = gd.a(((gd) this).field_o, ((gd) this).field_t);
        ((gd) this).field_z = gd.c(((gd) this).field_o, ((gd) this).field_t);
    }

    final kd c() {
        return null;
    }

    private final boolean e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((gd) this).field_o;
          if (var1 != -2147483648) {
            var2 = gd.a(var1, ((gd) this).field_t);
            var3 = gd.c(var1, ((gd) this).field_t);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((gd) this).field_u != var1) {
            break L1;
          } else {
            if (((gd) this).field_s != var2) {
              break L1;
            } else {
              if (((gd) this).field_z == var3) {
                if (((gd) this).field_o == -2147483648) {
                  ((gd) this).field_o = 0;
                  ((gd) this).field_z = 0;
                  ((gd) this).field_s = 0;
                  ((gd) this).field_u = 0;
                  ((gd) this).c(20);
                  return true;
                } else {
                  this.g();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((gd) this).field_u >= var1) {
            if (((gd) this).field_u <= var1) {
              ((gd) this).field_A = 0;
              break L2;
            } else {
              ((gd) this).field_A = -1;
              ((gd) this).field_r = ((gd) this).field_u - var1;
              break L2;
            }
          } else {
            ((gd) this).field_A = 1;
            ((gd) this).field_r = var1 - ((gd) this).field_u;
            break L2;
          }
        }
        L3: {
          if (((gd) this).field_s >= var2) {
            if (((gd) this).field_s <= var2) {
              ((gd) this).field_q = 0;
              break L3;
            } else {
              L4: {
                ((gd) this).field_q = -1;
                if (((gd) this).field_r == 0) {
                  break L4;
                } else {
                  if (((gd) this).field_r <= ((gd) this).field_s - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((gd) this).field_r = ((gd) this).field_s - var2;
              break L3;
            }
          } else {
            L5: {
              ((gd) this).field_q = 1;
              if (((gd) this).field_r == 0) {
                break L5;
              } else {
                if (((gd) this).field_r <= var2 - ((gd) this).field_s) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((gd) this).field_r = var2 - ((gd) this).field_s;
            break L3;
          }
        }
        if (((gd) this).field_z < var3) {
          ((gd) this).field_p = 1;
          if (((gd) this).field_r != 0) {
            if (((gd) this).field_r > var3 - ((gd) this).field_z) {
              ((gd) this).field_r = var3 - ((gd) this).field_z;
              return false;
            } else {
              return false;
            }
          } else {
            ((gd) this).field_r = var3 - ((gd) this).field_z;
            return false;
          }
        } else {
          L6: {
            if (((gd) this).field_z <= var3) {
              ((gd) this).field_p = 0;
              break L6;
            } else {
              L7: {
                ((gd) this).field_p = -1;
                if (((gd) this).field_r == 0) {
                  break L7;
                } else {
                  if (((gd) this).field_r <= ((gd) this).field_z - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((gd) this).field_r = ((gd) this).field_z - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, gd param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param8.field_x = param2 << 8;
        return param3;
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized void a(boolean param0) {
        ((gd) this).field_y = param0 ? true : false;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, gd param9) {
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
        param9.field_s = param9.field_s + param9.field_q * (param6 - param3);
        param9.field_z = param9.field_z + param9.field_p * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_x = param2 << 8;
                return param3;
              } else {
                param3++;
                param2++;
                param1[param3] = param1[param3] + param0[param2] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    private final synchronized int h() {
        return ((gd) this).field_t < 0 ? -1 : ((gd) this).field_t;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, gd param10, int param11, int param12) {
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 257) / param11;
            // if_icmple L38
        }
        param7 = param8;
        while (param5 < param7) {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 1) / param11;
            // if_icmple L133
        }
        param7 = param8;
        param1 = param12;
        while (param5 < param7) {
            param0 = param2[param4 >> 8];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        param10.field_x = param4;
        return param5;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, gd param9) {
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
        param9.field_s = param9.field_s + param9.field_q * (param6 - param3);
        param9.field_z = param9.field_z + param9.field_p * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_x = param2 << 8;
                return param3;
              } else {
                param3++;
                param2--;
                param1[param3] = param1[param3] + param0[param2] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final static gd a(ud param0, int param1, int param2) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new gd(param0, (int)((long)param0.field_m * 256L * (long)param1 / (long)(100 * ba.field_m)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final void f() {
        if (((gd) this).field_r != 0) {
            if (((gd) this).field_o == -2147483648) {
                ((gd) this).field_o = 0;
            }
            ((gd) this).field_r = 0;
            this.g();
            return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        ud var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((gd) this).field_o != 0) {
            break L0;
          } else {
            if (((gd) this).field_r != 0) {
              break L0;
            } else {
              ((gd) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (ud) (Object) ((gd) this).field_l;
          var5 = ((gd) this).field_B << 8;
          var6 = ((gd) this).field_v << 8;
          var7 = var4.field_n.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((gd) this).field_w = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((gd) this).field_x >= 0) {
            break L2;
          } else {
            if (((gd) this).field_C <= 0) {
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              ((gd) this).field_x = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((gd) this).field_x < var7) {
            break L3;
          } else {
            if (((gd) this).field_C >= 0) {
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              ((gd) this).field_x = var7 - 1;
              break L3;
            }
          }
        }
        if (((gd) this).field_w >= 0) {
          L4: {
            if (((gd) this).field_w <= 0) {
              break L4;
            } else {
              if (!((gd) this).field_y) {
                if (((gd) this).field_C >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((gd) this).field_B]);
                    if (((gd) this).field_x >= var6) {
                      var10 = (((gd) this).field_x - var5) / var8;
                      if (var10 < ((gd) this).field_w) {
                        ((gd) this).field_x = ((gd) this).field_x - var8 * var10;
                        ((gd) this).field_w = ((gd) this).field_w - var10;
                        continue L5;
                      } else {
                        ((gd) this).field_x = ((gd) this).field_x - var8 * ((gd) this).field_w;
                        ((gd) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_v - 1]);
                    if (((gd) this).field_x < var5) {
                      var10 = (var6 - 1 - ((gd) this).field_x) / var8;
                      if (var10 < ((gd) this).field_w) {
                        ((gd) this).field_x = ((gd) this).field_x + var8 * var10;
                        ((gd) this).field_w = ((gd) this).field_w - var10;
                        continue L6;
                      } else {
                        ((gd) this).field_x = ((gd) this).field_x + var8 * ((gd) this).field_w;
                        ((gd) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((gd) this).field_C >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_B]);
                    if (((gd) this).field_x < var5) {
                      ((gd) this).field_x = var5 + var5 - 1 - ((gd) this).field_x;
                      ((gd) this).field_C = -((gd) this).field_C;
                      ((gd) this).field_w = ((gd) this).field_w - 1;
                      if (((gd) this).field_w - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((gd) this).field_v - 1]);
                  if (((gd) this).field_x >= var6) {
                    ((gd) this).field_x = var6 + var6 - 1 - ((gd) this).field_x;
                    ((gd) this).field_C = -((gd) this).field_C;
                    ((gd) this).field_w = ((gd) this).field_w - 1;
                    if (((gd) this).field_w - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_B]);
                      if (((gd) this).field_x < var5) {
                        ((gd) this).field_x = var5 + var5 - 1 - ((gd) this).field_x;
                        ((gd) this).field_C = -((gd) this).field_C;
                        ((gd) this).field_w = ((gd) this).field_w - 1;
                        if (((gd) this).field_w - 1 != 0) {
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
          if (((gd) this).field_C < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((gd) this).field_x < 0) {
              ((gd) this).field_x = -1;
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((gd) this).field_x < var7) {
                break L9;
              } else {
                ((gd) this).field_x = var7;
                this.f();
                ((gd) this).c(20);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((gd) this).field_y) {
            if (((gd) this).field_C >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((gd) this).field_B]);
                if (((gd) this).field_x >= var6) {
                  ((gd) this).field_x = var5 + (((gd) this).field_x - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_v - 1]);
                if (((gd) this).field_x < var5) {
                  ((gd) this).field_x = var6 - 1 - (var6 - 1 - ((gd) this).field_x) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((gd) this).field_C >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_B]);
                if (((gd) this).field_x < var5) {
                  ((gd) this).field_x = var5 + var5 - 1 - ((gd) this).field_x;
                  ((gd) this).field_C = -((gd) this).field_C;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((gd) this).field_v - 1]);
              if (((gd) this).field_x >= var6) {
                ((gd) this).field_x = var6 + var6 - 1 - ((gd) this).field_x;
                ((gd) this).field_C = -((gd) this).field_C;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((gd) this).field_B]);
                if (((gd) this).field_x < var5) {
                  ((gd) this).field_x = var5 + var5 - 1 - ((gd) this).field_x;
                  ((gd) this).field_C = -((gd) this).field_C;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, gd param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_A * param5;
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
                param13.field_u = param13.field_u + param13.field_A * param5;
                param13.field_s = param6;
                param13.field_z = param7;
                param13.field_x = param4;
                return param5;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = gd.a(param1, param2);
          var5 = gd.c(param1, param2);
          if (((gd) this).field_s == var4) {
            if (((gd) this).field_z == var5) {
              ((gd) this).field_r = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((gd) this).field_u;
                if (((gd) this).field_u - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((gd) this).field_u - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((gd) this).field_s <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((gd) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((gd) this).field_s - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((gd) this).field_s - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((gd) this).field_z <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((gd) this).field_z;
                  break L3;
                }
              }
              L4: {
                if (((gd) this).field_z - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((gd) this).field_z - var5;
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
              ((gd) this).field_r = param0;
              ((gd) this).field_o = param1;
              ((gd) this).field_t = param2;
              ((gd) this).field_A = (param1 - ((gd) this).field_u) / param0;
              ((gd) this).field_q = (var4 - ((gd) this).field_s) / param0;
              ((gd) this).field_p = (var5 - ((gd) this).field_z) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((gd) this).field_u;
              if (((gd) this).field_u - param1 <= var6) {
                break L6;
              } else {
                var6 = ((gd) this).field_u - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((gd) this).field_s <= var6) {
                break L7;
              } else {
                var6 = var4 - ((gd) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((gd) this).field_s - var4 <= var6) {
                break L8;
              } else {
                var6 = ((gd) this).field_s - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((gd) this).field_z <= var6) {
                break L9;
              } else {
                var6 = var5 - ((gd) this).field_z;
                break L9;
              }
            }
            L10: {
              if (((gd) this).field_z - var5 <= var6) {
                break L10;
              } else {
                var6 = ((gd) this).field_z - var5;
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
            ((gd) this).field_r = param0;
            ((gd) this).field_o = param1;
            ((gd) this).field_t = param2;
            ((gd) this).field_A = (param1 - ((gd) this).field_u) / param0;
            ((gd) this).field_q = (var4 - ((gd) this).field_s) / param0;
            ((gd) this).field_p = (var5 - ((gd) this).field_z) / param0;
            return;
          }
        } else {
          this.e(param1, param2);
          return;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, gd param11, int param12, int param13) {
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
                param11.field_x = param4;
                return param5 >> 1;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final synchronized void a(int param0) {
        ud var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((gd) this).field_r <= 0) {
            break L0;
          } else {
            if (param0 < ((gd) this).field_r) {
              ((gd) this).field_u = ((gd) this).field_u + ((gd) this).field_A * param0;
              ((gd) this).field_s = ((gd) this).field_s + ((gd) this).field_q * param0;
              ((gd) this).field_z = ((gd) this).field_z + ((gd) this).field_p * param0;
              ((gd) this).field_r = ((gd) this).field_r - param0;
              break L0;
            } else {
              L1: {
                if (((gd) this).field_o != -2147483648) {
                  break L1;
                } else {
                  ((gd) this).field_o = 0;
                  ((gd) this).field_z = 0;
                  ((gd) this).field_s = 0;
                  ((gd) this).field_u = 0;
                  ((gd) this).c(20);
                  param0 = ((gd) this).field_r;
                  break L1;
                }
              }
              ((gd) this).field_r = 0;
              this.g();
              break L0;
            }
          }
        }
        L2: {
          var2 = (ud) (Object) ((gd) this).field_l;
          var3 = ((gd) this).field_B << 8;
          var4 = ((gd) this).field_v << 8;
          var5 = var2.field_n.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((gd) this).field_w = 0;
            break L2;
          }
        }
        L3: {
          if (((gd) this).field_x >= 0) {
            break L3;
          } else {
            if (((gd) this).field_C <= 0) {
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              ((gd) this).field_x = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((gd) this).field_x < var5) {
            break L4;
          } else {
            if (((gd) this).field_C >= 0) {
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              ((gd) this).field_x = var5 - 1;
              break L4;
            }
          }
        }
        ((gd) this).field_x = ((gd) this).field_x + ((gd) this).field_C * param0;
        if (((gd) this).field_w >= 0) {
          L5: {
            if (((gd) this).field_w <= 0) {
              break L5;
            } else {
              if (!((gd) this).field_y) {
                L6: {
                  if (((gd) this).field_C >= 0) {
                    if (((gd) this).field_x >= var4) {
                      var7 = (((gd) this).field_x - var3) / var6;
                      if (var7 < ((gd) this).field_w) {
                        ((gd) this).field_x = ((gd) this).field_x - var6 * var7;
                        ((gd) this).field_w = ((gd) this).field_w - var7;
                        break L6;
                      } else {
                        ((gd) this).field_x = ((gd) this).field_x - var6 * ((gd) this).field_w;
                        ((gd) this).field_w = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((gd) this).field_x < var3) {
                      var7 = (var4 - 1 - ((gd) this).field_x) / var6;
                      if (var7 < ((gd) this).field_w) {
                        ((gd) this).field_x = ((gd) this).field_x + var6 * var7;
                        ((gd) this).field_w = ((gd) this).field_w - var7;
                        break L6;
                      } else {
                        ((gd) this).field_x = ((gd) this).field_x + var6 * ((gd) this).field_w;
                        ((gd) this).field_w = 0;
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
                  if (((gd) this).field_C >= 0) {
                    break L7;
                  } else {
                    if (((gd) this).field_x < var3) {
                      ((gd) this).field_x = var3 + var3 - 1 - ((gd) this).field_x;
                      ((gd) this).field_C = -((gd) this).field_C;
                      ((gd) this).field_w = ((gd) this).field_w - 1;
                      if (((gd) this).field_w - 1 != 0) {
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
                  if (((gd) this).field_x >= var4) {
                    ((gd) this).field_x = var4 + var4 - 1 - ((gd) this).field_x;
                    ((gd) this).field_C = -((gd) this).field_C;
                    ((gd) this).field_w = ((gd) this).field_w - 1;
                    if (((gd) this).field_w - 1 != 0) {
                      if (((gd) this).field_x < var3) {
                        ((gd) this).field_x = var3 + var3 - 1 - ((gd) this).field_x;
                        ((gd) this).field_C = -((gd) this).field_C;
                        ((gd) this).field_w = ((gd) this).field_w - 1;
                        if (((gd) this).field_w - 1 != 0) {
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
          if (((gd) this).field_C < 0) {
            if (((gd) this).field_x < 0) {
              ((gd) this).field_x = -1;
              this.f();
              ((gd) this).c(20);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((gd) this).field_x < var5) {
                break L9;
              } else {
                ((gd) this).field_x = var5;
                this.f();
                ((gd) this).c(20);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((gd) this).field_y) {
            if (((gd) this).field_C >= 0) {
              if (((gd) this).field_x < var4) {
                return;
              } else {
                ((gd) this).field_x = var3 + (((gd) this).field_x - var3) % var6;
                return;
              }
            } else {
              if (((gd) this).field_x < var3) {
                ((gd) this).field_x = var4 - 1 - (var4 - 1 - ((gd) this).field_x) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((gd) this).field_C >= 0) {
                break L10;
              } else {
                if (((gd) this).field_x < var3) {
                  ((gd) this).field_x = var3 + var3 - 1 - ((gd) this).field_x;
                  ((gd) this).field_C = -((gd) this).field_C;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((gd) this).field_x >= var4) {
                ((gd) this).field_x = var4 + var4 - 1 - ((gd) this).field_x;
                ((gd) this).field_C = -((gd) this).field_C;
                if (((gd) this).field_x < var3) {
                  ((gd) this).field_x = var3 + var3 - 1 - ((gd) this).field_x;
                  ((gd) this).field_C = -((gd) this).field_C;
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

    final synchronized void b(int param0, int param1) {
        this.a(param0, param1 << 6, this.h());
    }

    final synchronized void d(int param0, int param1) {
        ((gd) this).field_B = param0;
        ((gd) this).field_v = param1;
    }

    private final synchronized void e(int param0, int param1) {
        ((gd) this).field_o = param0;
        ((gd) this).field_t = param1;
        ((gd) this).field_r = 0;
        this.g();
    }

    final synchronized void e(int param0) {
        ((gd) this).field_w = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, gd param10, int param11, int param12) {
        if (param11 != 0) {
            param7 = param5 + (param9 + 256 - param4 + param11) / param11;
            // if_icmple L38
        }
        param7 = param8;
        while (param5 < param7) {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11) / param11;
            // if_icmple L131
        }
        param7 = param8;
        param0 = param12;
        param1 = param11;
        while (param5 < param7) {
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param1;
        }
        param10.field_x = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, gd param12) {
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
        param12.field_u = param12.field_u + param12.field_A * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_z = param6 >> 2;
                param12.field_x = param3 << 8;
                return param4 >> 1;
              } else {
                param3++;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param5 = param5 + param7;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((gd) this).field_r <= 0) {
            L1: {
              if (((gd) this).field_C != 256) {
                break L1;
              } else {
                if ((((gd) this).field_x & 255) != 0) {
                  break L1;
                } else {
                  if (ba.field_d) {
                    return gd.b(0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, 0, param3, param2, (gd) this);
                  } else {
                    return gd.a(((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, 0, param3, param2, (gd) this);
                  }
                }
              }
            }
            if (ba.field_d) {
              return gd.d(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, 0, param3, param2, (gd) this, ((gd) this).field_C, param4);
            } else {
              return gd.b(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, 0, param3, param2, (gd) this, ((gd) this).field_C, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((gd) this).field_r;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((gd) this).field_r = ((gd) this).field_r + param1;
                if (((gd) this).field_C != 256) {
                  break L4;
                } else {
                  if ((((gd) this).field_x & 255) != 0) {
                    break L4;
                  } else {
                    if (!ba.field_d) {
                      param1 = gd.b(((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, ((gd) this).field_A, 0, var6, param2, (gd) this);
                      break L3;
                    } else {
                      param1 = gd.a(0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, ((gd) this).field_q, ((gd) this).field_p, 0, var6, param2, (gd) this);
                      break L3;
                    }
                  }
                }
              }
              if (!ba.field_d) {
                param1 = gd.c(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_u, ((gd) this).field_A, 0, var6, param2, (gd) this, ((gd) this).field_C, param4);
                break L3;
              } else {
                param1 = gd.b(0, 0, ((ud) (Object) ((gd) this).field_l).field_n, param0, ((gd) this).field_x, param1, ((gd) this).field_s, ((gd) this).field_z, ((gd) this).field_q, ((gd) this).field_p, 0, var6, param2, (gd) this, ((gd) this).field_C, param4);
                break L3;
              }
            }
            ((gd) this).field_r = ((gd) this).field_r - param1;
            if (((gd) this).field_r == 0) {
              if (!this.e()) {
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
        int var2 = 0;
        if (param0 != 0) {
          if (((gd) this).field_s == 0) {
            if (((gd) this).field_z == 0) {
              ((gd) this).field_r = 0;
              ((gd) this).field_o = 0;
              ((gd) this).field_u = 0;
              ((gd) this).c(20);
              return;
            } else {
              L0: {
                var2 = -((gd) this).field_u;
                if (((gd) this).field_u <= var2) {
                  break L0;
                } else {
                  var2 = ((gd) this).field_u;
                  break L0;
                }
              }
              L1: {
                if (-((gd) this).field_s <= var2) {
                  break L1;
                } else {
                  var2 = -((gd) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((gd) this).field_s <= var2) {
                  break L2;
                } else {
                  var2 = ((gd) this).field_s;
                  break L2;
                }
              }
              L3: {
                if (-((gd) this).field_z <= var2) {
                  break L3;
                } else {
                  var2 = -((gd) this).field_z;
                  break L3;
                }
              }
              L4: {
                if (((gd) this).field_z <= var2) {
                  break L4;
                } else {
                  var2 = ((gd) this).field_z;
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
              ((gd) this).field_r = param0;
              ((gd) this).field_o = -2147483648;
              ((gd) this).field_A = -((gd) this).field_u / param0;
              ((gd) this).field_q = -((gd) this).field_s / param0;
              ((gd) this).field_p = -((gd) this).field_z / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((gd) this).field_u;
              if (((gd) this).field_u <= var2) {
                break L6;
              } else {
                var2 = ((gd) this).field_u;
                break L6;
              }
            }
            L7: {
              if (-((gd) this).field_s <= var2) {
                break L7;
              } else {
                var2 = -((gd) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((gd) this).field_s <= var2) {
                break L8;
              } else {
                var2 = ((gd) this).field_s;
                break L8;
              }
            }
            L9: {
              if (-((gd) this).field_z <= var2) {
                break L9;
              } else {
                var2 = -((gd) this).field_z;
                break L9;
              }
            }
            L10: {
              if (((gd) this).field_z <= var2) {
                break L10;
              } else {
                var2 = ((gd) this).field_z;
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
            ((gd) this).field_r = param0;
            ((gd) this).field_o = -2147483648;
            ((gd) this).field_A = -((gd) this).field_u / param0;
            ((gd) this).field_q = -((gd) this).field_s / param0;
            ((gd) this).field_p = -((gd) this).field_z / param0;
            return;
          }
        } else {
          this.d(0);
          ((gd) this).c(20);
          return;
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, gd param12) {
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
        param12.field_u = param12.field_u + param12.field_A * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_z = param6 >> 2;
                param12.field_x = param3 << 8;
                return param4 >> 1;
              } else {
                param3--;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param5 = param5 + param7;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private gd(ud param0, int param1, int param2) {
        ((gd) this).field_l = (gb) (Object) param0;
        ((gd) this).field_B = param0.field_l;
        ((gd) this).field_v = param0.field_p;
        ((gd) this).field_y = param0.field_o;
        ((gd) this).field_C = param1;
        ((gd) this).field_o = param2;
        ((gd) this).field_t = 8192;
        ((gd) this).field_x = 0;
        this.g();
    }

    private gd(ud param0, int param1, int param2, int param3) {
        ((gd) this).field_l = (gb) (Object) param0;
        ((gd) this).field_B = param0.field_l;
        ((gd) this).field_v = param0.field_p;
        ((gd) this).field_y = param0.field_o;
        ((gd) this).field_C = param1;
        ((gd) this).field_o = param2;
        ((gd) this).field_t = param3;
        ((gd) this).field_x = 0;
        this.g();
    }
}
