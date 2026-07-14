/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends tj {
    private int field_w;
    private int field_r;
    private boolean field_p;
    private int field_m;
    private int field_u;
    private int field_y;
    private int field_z;
    private int field_v;
    private int field_o;
    private int field_x;
    private int field_t;
    private int field_q;
    private int field_s;
    private int field_n;
    private int field_l;

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, b param10, int param11, int param12) {
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
        param10.field_n = param4;
        return param5;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, b param11, int param12, int param13) {
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
                param11.field_n = param4;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, b param10) {
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
                param10.field_n = param3 << 8;
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

    final synchronized int e() {
        return ((b) this).field_x < 0 ? -((b) this).field_x : ((b) this).field_x;
    }

    final synchronized boolean m() {
        return ((b) this).field_t != 0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, b param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_v = param11.field_v - param11.field_y * param5;
            param11.field_w = param11.field_w - param11.field_q * param5;
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
                param11.field_v = param11.field_v + param11.field_y * param5;
                param11.field_w = param11.field_w + param11.field_q * param5;
                param11.field_z = param6;
                param11.field_n = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, b param10, int param11, int param12) {
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
        param10.field_n = param4;
        return param5;
    }

    final synchronized void e(int param0) {
        int var2 = ((jb) (Object) ((b) this).field_j).field_k.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((b) this).field_n = param0;
    }

    final int a() {
        int var1 = ((b) this).field_z * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((b) this).field_s == 0) {
            var1 = var1 - var1 * ((b) this).field_n / (((jb) (Object) ((b) this).field_j).field_k.length << 8);
        } else {
            if (((b) this).field_s >= 0) {
                var1 = var1 - var1 * ((b) this).field_u / ((jb) (Object) ((b) this).field_j).field_k.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((b) this).field_t <= 0) {
            L1: {
              if (((b) this).field_x != -256) {
                break L1;
              } else {
                if ((((b) this).field_n & 255) != 0) {
                  break L1;
                } else {
                  if (ug.field_b) {
                    return b.b(0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, 0, param3, param2, (b) this);
                  } else {
                    return b.b(((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, 0, param3, param2, (b) this);
                  }
                }
              }
            }
            if (ug.field_b) {
              return b.d(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, 0, param3, param2, (b) this, ((b) this).field_x, param4);
            } else {
              return b.b(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, 0, param3, param2, (b) this, ((b) this).field_x, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((b) this).field_t;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((b) this).field_t = ((b) this).field_t + param1;
                if (((b) this).field_x != -256) {
                  break L4;
                } else {
                  if ((((b) this).field_n & 255) != 0) {
                    break L4;
                  } else {
                    if (!ug.field_b) {
                      param1 = b.a(((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, ((b) this).field_l, 0, var6, param2, (b) this);
                      break L3;
                    } else {
                      param1 = b.a(0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, ((b) this).field_y, ((b) this).field_q, 0, var6, param2, (b) this);
                      break L3;
                    }
                  }
                }
              }
              if (!ug.field_b) {
                param1 = b.b(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, ((b) this).field_l, 0, var6, param2, (b) this, ((b) this).field_x, param4);
                break L3;
              } else {
                param1 = b.b(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, ((b) this).field_y, ((b) this).field_q, 0, var6, param2, (b) this, ((b) this).field_x, param4);
                break L3;
              }
            }
            ((b) this).field_t = ((b) this).field_t - param1;
            if (((b) this).field_t == 0) {
              if (!this.l()) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, b param8) {
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
        param8.field_n = param2 << 8;
        return param3;
    }

    final synchronized void d(int param0) {
        ((b) this).field_s = param0;
    }

    private final void h() {
        if (((b) this).field_t != 0) {
            if (((b) this).field_r == -2147483648) {
                ((b) this).field_r = 0;
            }
            ((b) this).field_t = 0;
            this.g();
            return;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, b param10) {
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
                param10.field_n = param3 << 8;
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

    final tj d() {
        return null;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, b param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_z = param13.field_z - param13.field_l * param5;
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
                param13.field_z = param13.field_z + param13.field_l * param5;
                param13.field_v = param6;
                param13.field_w = param7;
                param13.field_n = param4;
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

    private final synchronized void b(int param0, int param1) {
        ((b) this).field_r = param0;
        ((b) this).field_o = param1;
        ((b) this).field_t = 0;
        this.g();
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, b param9) {
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
        param9.field_v = param9.field_v + param9.field_y * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_z = param4 >> 2;
                param9.field_n = param2 << 8;
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

    final synchronized int k() {
        return ((b) this).field_r == -2147483648 ? 0 : ((b) this).field_r + 32 >> 6;
    }

    private final void g() {
        ((b) this).field_z = ((b) this).field_r;
        ((b) this).field_v = b.a(((b) this).field_r, ((b) this).field_o);
        ((b) this).field_w = b.c(((b) this).field_r, ((b) this).field_o);
    }

    private final boolean l() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((b) this).field_r;
          if (var1 != -2147483648) {
            var2 = b.a(var1, ((b) this).field_o);
            var3 = b.c(var1, ((b) this).field_o);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((b) this).field_z != var1) {
            break L1;
          } else {
            if (((b) this).field_v != var2) {
              break L1;
            } else {
              if (((b) this).field_w == var3) {
                if (((b) this).field_r == -2147483648) {
                  ((b) this).field_r = 0;
                  ((b) this).field_w = 0;
                  ((b) this).field_v = 0;
                  ((b) this).field_z = 0;
                  ((b) this).b(107);
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
          if (((b) this).field_z >= var1) {
            if (((b) this).field_z <= var1) {
              ((b) this).field_l = 0;
              break L2;
            } else {
              ((b) this).field_l = -1;
              ((b) this).field_t = ((b) this).field_z - var1;
              break L2;
            }
          } else {
            ((b) this).field_l = 1;
            ((b) this).field_t = var1 - ((b) this).field_z;
            break L2;
          }
        }
        L3: {
          if (((b) this).field_v >= var2) {
            if (((b) this).field_v <= var2) {
              ((b) this).field_y = 0;
              break L3;
            } else {
              L4: {
                ((b) this).field_y = -1;
                if (((b) this).field_t == 0) {
                  break L4;
                } else {
                  if (((b) this).field_t <= ((b) this).field_v - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((b) this).field_t = ((b) this).field_v - var2;
              break L3;
            }
          } else {
            L5: {
              ((b) this).field_y = 1;
              if (((b) this).field_t == 0) {
                break L5;
              } else {
                if (((b) this).field_t <= var2 - ((b) this).field_v) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((b) this).field_t = var2 - ((b) this).field_v;
            break L3;
          }
        }
        if (((b) this).field_w < var3) {
          ((b) this).field_q = 1;
          if (((b) this).field_t != 0) {
            if (((b) this).field_t > var3 - ((b) this).field_w) {
              ((b) this).field_t = var3 - ((b) this).field_w;
              return false;
            } else {
              return false;
            }
          } else {
            ((b) this).field_t = var3 - ((b) this).field_w;
            return false;
          }
        } else {
          L6: {
            if (((b) this).field_w <= var3) {
              ((b) this).field_q = 0;
              break L6;
            } else {
              L7: {
                ((b) this).field_q = -1;
                if (((b) this).field_t == 0) {
                  break L7;
                } else {
                  if (((b) this).field_t <= ((b) this).field_w - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((b) this).field_t = ((b) this).field_w - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized void d(int param0, int param1) {
        ((b) this).a(param0, param1, ((b) this).f());
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = b.a(param1, param2);
          var5 = b.c(param1, param2);
          if (((b) this).field_v == var4) {
            if (((b) this).field_w == var5) {
              ((b) this).field_t = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((b) this).field_z;
                if (((b) this).field_z - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((b) this).field_z - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((b) this).field_v <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((b) this).field_v;
                  break L1;
                }
              }
              L2: {
                if (((b) this).field_v - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((b) this).field_v - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((b) this).field_w <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((b) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((b) this).field_w - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((b) this).field_w - var5;
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
              ((b) this).field_t = param0;
              ((b) this).field_r = param1;
              ((b) this).field_o = param2;
              ((b) this).field_l = (param1 - ((b) this).field_z) / param0;
              ((b) this).field_y = (var4 - ((b) this).field_v) / param0;
              ((b) this).field_q = (var5 - ((b) this).field_w) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((b) this).field_z;
              if (((b) this).field_z - param1 <= var6) {
                break L6;
              } else {
                var6 = ((b) this).field_z - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((b) this).field_v <= var6) {
                break L7;
              } else {
                var6 = var4 - ((b) this).field_v;
                break L7;
              }
            }
            L8: {
              if (((b) this).field_v - var4 <= var6) {
                break L8;
              } else {
                var6 = ((b) this).field_v - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((b) this).field_w <= var6) {
                break L9;
              } else {
                var6 = var5 - ((b) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((b) this).field_w - var5 <= var6) {
                break L10;
              } else {
                var6 = ((b) this).field_w - var5;
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
            ((b) this).field_t = param0;
            ((b) this).field_r = param1;
            ((b) this).field_o = param2;
            ((b) this).field_l = (param1 - ((b) this).field_z) / param0;
            ((b) this).field_y = (var4 - ((b) this).field_v) / param0;
            ((b) this).field_q = (var5 - ((b) this).field_w) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, b param11, int param12, int param13) {
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
                param11.field_n = param4;
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

    final tj b() {
        return null;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, b param12) {
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
        param12.field_z = param12.field_z + param12.field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_v = param5 >> 2;
                param12.field_w = param6 >> 2;
                param12.field_n = param3 << 8;
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

    final synchronized void a(boolean param0) {
        ((b) this).field_x = (((b) this).field_x ^ ((b) this).field_x >> 31) + (((b) this).field_x >>> 31);
        if (param0) {
          ((b) this).field_x = -((b) this).field_x;
          return;
        } else {
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, b param9) {
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
        param9.field_v = param9.field_v + param9.field_y * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_z = param4 >> 2;
                param9.field_n = param2 << 8;
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

    final static b a(jb param0, int param1, int param2, int param3) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new b(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized void f(int param0) {
        this.b(param0, ((b) this).f());
    }

    final synchronized void c(int param0) {
        jb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((b) this).field_t <= 0) {
            break L0;
          } else {
            if (param0 < ((b) this).field_t) {
              ((b) this).field_z = ((b) this).field_z + ((b) this).field_l * param0;
              ((b) this).field_v = ((b) this).field_v + ((b) this).field_y * param0;
              ((b) this).field_w = ((b) this).field_w + ((b) this).field_q * param0;
              ((b) this).field_t = ((b) this).field_t - param0;
              break L0;
            } else {
              L1: {
                if (((b) this).field_r != -2147483648) {
                  break L1;
                } else {
                  ((b) this).field_r = 0;
                  ((b) this).field_w = 0;
                  ((b) this).field_v = 0;
                  ((b) this).field_z = 0;
                  ((b) this).b(-113);
                  param0 = ((b) this).field_t;
                  break L1;
                }
              }
              ((b) this).field_t = 0;
              this.g();
              break L0;
            }
          }
        }
        L2: {
          var2 = (jb) (Object) ((b) this).field_j;
          var3 = ((b) this).field_u << 8;
          var4 = ((b) this).field_m << 8;
          var5 = var2.field_k.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((b) this).field_s = 0;
            break L2;
          }
        }
        L3: {
          if (((b) this).field_n >= 0) {
            break L3;
          } else {
            if (((b) this).field_x <= 0) {
              this.h();
              ((b) this).b(108);
              return;
            } else {
              ((b) this).field_n = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((b) this).field_n < var5) {
            break L4;
          } else {
            if (((b) this).field_x >= 0) {
              this.h();
              ((b) this).b(-22);
              return;
            } else {
              ((b) this).field_n = var5 - 1;
              break L4;
            }
          }
        }
        ((b) this).field_n = ((b) this).field_n + ((b) this).field_x * param0;
        if (((b) this).field_s >= 0) {
          L5: {
            if (((b) this).field_s <= 0) {
              break L5;
            } else {
              if (!((b) this).field_p) {
                L6: {
                  if (((b) this).field_x >= 0) {
                    if (((b) this).field_n >= var4) {
                      var7 = (((b) this).field_n - var3) / var6;
                      if (var7 < ((b) this).field_s) {
                        ((b) this).field_n = ((b) this).field_n - var6 * var7;
                        ((b) this).field_s = ((b) this).field_s - var7;
                        break L6;
                      } else {
                        ((b) this).field_n = ((b) this).field_n - var6 * ((b) this).field_s;
                        ((b) this).field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((b) this).field_n < var3) {
                      var7 = (var4 - 1 - ((b) this).field_n) / var6;
                      if (var7 < ((b) this).field_s) {
                        ((b) this).field_n = ((b) this).field_n + var6 * var7;
                        ((b) this).field_s = ((b) this).field_s - var7;
                        break L6;
                      } else {
                        ((b) this).field_n = ((b) this).field_n + var6 * ((b) this).field_s;
                        ((b) this).field_s = 0;
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
                  if (((b) this).field_x >= 0) {
                    break L7;
                  } else {
                    if (((b) this).field_n < var3) {
                      ((b) this).field_n = var3 + var3 - 1 - ((b) this).field_n;
                      ((b) this).field_x = -((b) this).field_x;
                      ((b) this).field_s = ((b) this).field_s - 1;
                      if (((b) this).field_s - 1 != 0) {
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
                  if (((b) this).field_n >= var4) {
                    ((b) this).field_n = var4 + var4 - 1 - ((b) this).field_n;
                    ((b) this).field_x = -((b) this).field_x;
                    ((b) this).field_s = ((b) this).field_s - 1;
                    if (((b) this).field_s - 1 != 0) {
                      if (((b) this).field_n < var3) {
                        ((b) this).field_n = var3 + var3 - 1 - ((b) this).field_n;
                        ((b) this).field_x = -((b) this).field_x;
                        ((b) this).field_s = ((b) this).field_s - 1;
                        if (((b) this).field_s - 1 != 0) {
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
          if (((b) this).field_x < 0) {
            if (((b) this).field_n < 0) {
              ((b) this).field_n = -1;
              this.h();
              ((b) this).b(-65);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((b) this).field_n < var5) {
                break L9;
              } else {
                ((b) this).field_n = var5;
                this.h();
                ((b) this).b(11);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((b) this).field_p) {
            if (((b) this).field_x >= 0) {
              if (((b) this).field_n < var4) {
                return;
              } else {
                ((b) this).field_n = var3 + (((b) this).field_n - var3) % var6;
                return;
              }
            } else {
              if (((b) this).field_n < var3) {
                ((b) this).field_n = var4 - 1 - (var4 - 1 - ((b) this).field_n) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((b) this).field_x >= 0) {
                break L10;
              } else {
                if (((b) this).field_n < var3) {
                  ((b) this).field_n = var3 + var3 - 1 - ((b) this).field_n;
                  ((b) this).field_x = -((b) this).field_x;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((b) this).field_n >= var4) {
                ((b) this).field_n = var4 + var4 - 1 - ((b) this).field_n;
                ((b) this).field_x = -((b) this).field_x;
                if (((b) this).field_n < var3) {
                  ((b) this).field_n = var3 + var3 - 1 - ((b) this).field_n;
                  ((b) this).field_x = -((b) this).field_x;
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

    final synchronized int f() {
        return ((b) this).field_o < 0 ? -1 : ((b) this).field_o;
    }

    final synchronized void i(int param0) {
        if (((b) this).field_x < 0) {
            ((b) this).field_x = -param0;
        } else {
            ((b) this).field_x = param0;
        }
    }

    final synchronized int i() {
        return ((b) this).field_r == -2147483648 ? 0 : ((b) this).field_r;
    }

    final synchronized void h(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((b) this).field_v == 0) {
            if (((b) this).field_w == 0) {
              ((b) this).field_t = 0;
              ((b) this).field_r = 0;
              ((b) this).field_z = 0;
              ((b) this).b(112);
              return;
            } else {
              L0: {
                var2 = -((b) this).field_z;
                if (((b) this).field_z <= var2) {
                  break L0;
                } else {
                  var2 = ((b) this).field_z;
                  break L0;
                }
              }
              L1: {
                if (-((b) this).field_v <= var2) {
                  break L1;
                } else {
                  var2 = -((b) this).field_v;
                  break L1;
                }
              }
              L2: {
                if (((b) this).field_v <= var2) {
                  break L2;
                } else {
                  var2 = ((b) this).field_v;
                  break L2;
                }
              }
              L3: {
                if (-((b) this).field_w <= var2) {
                  break L3;
                } else {
                  var2 = -((b) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((b) this).field_w <= var2) {
                  break L4;
                } else {
                  var2 = ((b) this).field_w;
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
              ((b) this).field_t = param0;
              ((b) this).field_r = -2147483648;
              ((b) this).field_l = -((b) this).field_z / param0;
              ((b) this).field_y = -((b) this).field_v / param0;
              ((b) this).field_q = -((b) this).field_w / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((b) this).field_z;
              if (((b) this).field_z <= var2) {
                break L6;
              } else {
                var2 = ((b) this).field_z;
                break L6;
              }
            }
            L7: {
              if (-((b) this).field_v <= var2) {
                break L7;
              } else {
                var2 = -((b) this).field_v;
                break L7;
              }
            }
            L8: {
              if (((b) this).field_v <= var2) {
                break L8;
              } else {
                var2 = ((b) this).field_v;
                break L8;
              }
            }
            L9: {
              if (-((b) this).field_w <= var2) {
                break L9;
              } else {
                var2 = -((b) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((b) this).field_w <= var2) {
                break L10;
              } else {
                var2 = ((b) this).field_w;
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
            ((b) this).field_t = param0;
            ((b) this).field_r = -2147483648;
            ((b) this).field_l = -((b) this).field_z / param0;
            ((b) this).field_y = -((b) this).field_v / param0;
            ((b) this).field_q = -((b) this).field_w / param0;
            return;
          }
        } else {
          ((b) this).f(0);
          ((b) this).b(123);
          return;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final static b a(jb param0, int param1, int param2) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new b(param0, (int)((long)param0.field_j * 256L * (long)param1 / (long)(100 * ug.field_g)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void g(int param0) {
        this.b(param0 << 6, ((b) this).f());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, b param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_z = param13.field_z - param13.field_l * param5;
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
                param13.field_z = param13.field_z + param13.field_l * param5;
                param13.field_v = param6;
                param13.field_w = param7;
                param13.field_n = param4;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, b param8) {
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
        param8.field_n = param2 << 8;
        return param3;
    }

    final synchronized boolean j() {
        return ((b) this).field_n < 0 || ((b) this).field_n >= ((jb) (Object) ((b) this).field_j).field_k.length << 8;
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private b(jb param0, int param1, int param2) {
        ((b) this).field_j = (ef) (Object) param0;
        ((b) this).field_u = param0.field_l;
        ((b) this).field_m = param0.field_i;
        ((b) this).field_p = param0.field_m;
        ((b) this).field_x = param1;
        ((b) this).field_r = param2;
        ((b) this).field_o = 8192;
        ((b) this).field_n = 0;
        this.g();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, b param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_v = param11.field_v - param11.field_y * param5;
            param11.field_w = param11.field_w - param11.field_q * param5;
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
                param11.field_v = param11.field_v + param11.field_y * param5;
                param11.field_w = param11.field_w + param11.field_q * param5;
                param11.field_z = param6;
                param11.field_n = param4;
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

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((b) this).field_t <= 0) {
            L1: {
              if (((b) this).field_x != 256) {
                break L1;
              } else {
                if ((((b) this).field_n & 255) != 0) {
                  break L1;
                } else {
                  if (ug.field_b) {
                    return b.a(0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, 0, param3, param2, (b) this);
                  } else {
                    return b.a(((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, 0, param3, param2, (b) this);
                  }
                }
              }
            }
            if (ug.field_b) {
              return b.c(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, 0, param3, param2, (b) this, ((b) this).field_x, param4);
            } else {
              return b.a(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, 0, param3, param2, (b) this, ((b) this).field_x, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((b) this).field_t;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((b) this).field_t = ((b) this).field_t + param1;
                if (((b) this).field_x != 256) {
                  break L4;
                } else {
                  if ((((b) this).field_n & 255) != 0) {
                    break L4;
                  } else {
                    if (!ug.field_b) {
                      param1 = b.b(((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, ((b) this).field_l, 0, var6, param2, (b) this);
                      break L3;
                    } else {
                      param1 = b.b(0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, ((b) this).field_y, ((b) this).field_q, 0, var6, param2, (b) this);
                      break L3;
                    }
                  }
                }
              }
              if (!ug.field_b) {
                param1 = b.a(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_z, ((b) this).field_l, 0, var6, param2, (b) this, ((b) this).field_x, param4);
                break L3;
              } else {
                param1 = b.a(0, 0, ((jb) (Object) ((b) this).field_j).field_k, param0, ((b) this).field_n, param1, ((b) this).field_v, ((b) this).field_w, ((b) this).field_y, ((b) this).field_q, 0, var6, param2, (b) this, ((b) this).field_x, param4);
                break L3;
              }
            }
            ((b) this).field_t = ((b) this).field_t - param1;
            if (((b) this).field_t == 0) {
              if (!this.l()) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, b param12) {
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
        param12.field_z = param12.field_z + param12.field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_v = param5 >> 2;
                param12.field_w = param6 >> 2;
                param12.field_n = param3 << 8;
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

    final int c() {
        if (((b) this).field_r == 0) {
            if (((b) this).field_t == 0) {
                return 0;
            }
        }
        return 1;
    }

    private b(jb param0, int param1, int param2, int param3) {
        ((b) this).field_j = (ef) (Object) param0;
        ((b) this).field_u = param0.field_l;
        ((b) this).field_m = param0.field_i;
        ((b) this).field_p = param0.field_m;
        ((b) this).field_x = param1;
        ((b) this).field_r = param2;
        ((b) this).field_o = param3;
        ((b) this).field_n = 0;
        this.g();
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        jb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((b) this).field_r != 0) {
            break L0;
          } else {
            if (((b) this).field_t != 0) {
              break L0;
            } else {
              ((b) this).c(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (jb) (Object) ((b) this).field_j;
          var5 = ((b) this).field_u << 8;
          var6 = ((b) this).field_m << 8;
          var7 = var4.field_k.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((b) this).field_s = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((b) this).field_n >= 0) {
            break L2;
          } else {
            if (((b) this).field_x <= 0) {
              this.h();
              ((b) this).b(-77);
              return;
            } else {
              ((b) this).field_n = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((b) this).field_n < var7) {
            break L3;
          } else {
            if (((b) this).field_x >= 0) {
              this.h();
              ((b) this).b(127);
              return;
            } else {
              ((b) this).field_n = var7 - 1;
              break L3;
            }
          }
        }
        if (((b) this).field_s >= 0) {
          L4: {
            if (((b) this).field_s <= 0) {
              break L4;
            } else {
              if (!((b) this).field_p) {
                if (((b) this).field_x >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((b) this).field_u]);
                    if (((b) this).field_n >= var6) {
                      var10 = (((b) this).field_n - var5) / var8;
                      if (var10 < ((b) this).field_s) {
                        ((b) this).field_n = ((b) this).field_n - var8 * var10;
                        ((b) this).field_s = ((b) this).field_s - var10;
                        continue L5;
                      } else {
                        ((b) this).field_n = ((b) this).field_n - var8 * ((b) this).field_s;
                        ((b) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_m - 1]);
                    if (((b) this).field_n < var5) {
                      var10 = (var6 - 1 - ((b) this).field_n) / var8;
                      if (var10 < ((b) this).field_s) {
                        ((b) this).field_n = ((b) this).field_n + var8 * var10;
                        ((b) this).field_s = ((b) this).field_s - var10;
                        continue L6;
                      } else {
                        ((b) this).field_n = ((b) this).field_n + var8 * ((b) this).field_s;
                        ((b) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((b) this).field_x >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_u]);
                    if (((b) this).field_n < var5) {
                      ((b) this).field_n = var5 + var5 - 1 - ((b) this).field_n;
                      ((b) this).field_x = -((b) this).field_x;
                      ((b) this).field_s = ((b) this).field_s - 1;
                      if (((b) this).field_s - 1 != 0) {
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((b) this).field_m - 1]);
                  if (((b) this).field_n >= var6) {
                    ((b) this).field_n = var6 + var6 - 1 - ((b) this).field_n;
                    ((b) this).field_x = -((b) this).field_x;
                    ((b) this).field_s = ((b) this).field_s - 1;
                    if (((b) this).field_s - 1 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_u]);
                      if (((b) this).field_n < var5) {
                        ((b) this).field_n = var5 + var5 - 1 - ((b) this).field_n;
                        ((b) this).field_x = -((b) this).field_x;
                        ((b) this).field_s = ((b) this).field_s - 1;
                        if (((b) this).field_s - 1 != 0) {
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
          if (((b) this).field_x < 0) {
            int discarded$2 = this.b(param0, var9, 0, param2, 0);
            if (((b) this).field_n < 0) {
              ((b) this).field_n = -1;
              this.h();
              ((b) this).b(106);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.a(param0, var9, var7, param2, 0);
              if (((b) this).field_n < var7) {
                break L9;
              } else {
                ((b) this).field_n = var7;
                this.h();
                ((b) this).b(-72);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((b) this).field_p) {
            if (((b) this).field_x >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((b) this).field_u]);
                if (((b) this).field_n >= var6) {
                  ((b) this).field_n = var5 + (((b) this).field_n - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_m - 1]);
                if (((b) this).field_n < var5) {
                  ((b) this).field_n = var6 - 1 - (var6 - 1 - ((b) this).field_n) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((b) this).field_x >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_u]);
                if (((b) this).field_n < var5) {
                  ((b) this).field_n = var5 + var5 - 1 - ((b) this).field_n;
                  ((b) this).field_x = -((b) this).field_x;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((b) this).field_m - 1]);
              if (((b) this).field_n >= var6) {
                ((b) this).field_n = var6 + var6 - 1 - ((b) this).field_n;
                ((b) this).field_x = -((b) this).field_x;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((b) this).field_u]);
                if (((b) this).field_n < var5) {
                  ((b) this).field_n = var5 + var5 - 1 - ((b) this).field_n;
                  ((b) this).field_x = -((b) this).field_x;
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
}
