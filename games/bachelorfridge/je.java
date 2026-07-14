/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends tda {
    private int field_r;
    private int field_w;
    private int field_p;
    private int field_s;
    private int field_o;
    private boolean field_l;
    private int field_n;
    private int field_x;
    private int field_j;
    private int field_m;
    private int field_u;
    private int field_k;
    private int field_q;
    private int field_t;
    private int field_v;

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized int i() {
        return ((je) this).field_v < 0 ? -1 : ((je) this).field_v;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, je param11, int param12, int param13) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, je param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    final synchronized int g() {
        return ((je) this).field_j == -2147483648 ? 0 : ((je) this).field_j;
    }

    private final boolean l() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((je) this).field_j;
          if (var1 != -2147483648) {
            var2 = je.d(var1, ((je) this).field_v);
            var3 = je.c(var1, ((je) this).field_v);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((je) this).field_p != var1) {
            break L1;
          } else {
            if (((je) this).field_w != var2) {
              break L1;
            } else {
              if (((je) this).field_u == var3) {
                if (((je) this).field_j == -2147483648) {
                  ((je) this).field_j = 0;
                  ((je) this).field_u = 0;
                  ((je) this).field_w = 0;
                  ((je) this).field_p = 0;
                  ((je) this).a(false);
                  return true;
                } else {
                  this.j();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((je) this).field_p >= var1) {
            if (((je) this).field_p <= var1) {
              ((je) this).field_q = 0;
              break L2;
            } else {
              ((je) this).field_q = -1;
              ((je) this).field_n = ((je) this).field_p - var1;
              break L2;
            }
          } else {
            ((je) this).field_q = 1;
            ((je) this).field_n = var1 - ((je) this).field_p;
            break L2;
          }
        }
        L3: {
          if (((je) this).field_w >= var2) {
            if (((je) this).field_w <= var2) {
              ((je) this).field_x = 0;
              break L3;
            } else {
              L4: {
                ((je) this).field_x = -1;
                if (((je) this).field_n == 0) {
                  break L4;
                } else {
                  if (((je) this).field_n <= ((je) this).field_w - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((je) this).field_n = ((je) this).field_w - var2;
              break L3;
            }
          } else {
            L5: {
              ((je) this).field_x = 1;
              if (((je) this).field_n == 0) {
                break L5;
              } else {
                if (((je) this).field_n <= var2 - ((je) this).field_w) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((je) this).field_n = var2 - ((je) this).field_w;
            break L3;
          }
        }
        if (((je) this).field_u < var3) {
          ((je) this).field_r = 1;
          if (((je) this).field_n != 0) {
            if (((je) this).field_n > var3 - ((je) this).field_u) {
              ((je) this).field_n = var3 - ((je) this).field_u;
              return false;
            } else {
              return false;
            }
          } else {
            ((je) this).field_n = var3 - ((je) this).field_u;
            return false;
          }
        } else {
          L6: {
            if (((je) this).field_u <= var3) {
              ((je) this).field_r = 0;
              break L6;
            } else {
              L7: {
                ((je) this).field_r = -1;
                if (((je) this).field_n == 0) {
                  break L7;
                } else {
                  if (((je) this).field_n <= ((je) this).field_u - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((je) this).field_n = ((je) this).field_u - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, je param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_w = param11.field_w - param11.field_x * param5;
            param11.field_u = param11.field_u - param11.field_r * param5;
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
                param11.field_w = param11.field_w + param11.field_x * param5;
                param11.field_u = param11.field_u + param11.field_r * param5;
                param11.field_p = param6;
                param11.field_t = param4;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, je param12) {
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
        param12.field_p = param12.field_p + param12.field_q * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_w = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_t = param3 << 8;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, je param10) {
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

    final int c() {
        int var1 = ((je) this).field_p * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((je) this).field_s == 0) {
            var1 = var1 - var1 * ((je) this).field_t / (((be) (Object) ((je) this).field_h).field_i.length << 8);
        } else {
            if (((je) this).field_s >= 0) {
                var1 = var1 - var1 * ((je) this).field_k / ((be) (Object) ((je) this).field_h).field_i.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, je param10) {
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, je param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_w = param11.field_w - param11.field_x * param5;
            param11.field_u = param11.field_u - param11.field_r * param5;
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
                param11.field_w = param11.field_w + param11.field_x * param5;
                param11.field_u = param11.field_u + param11.field_r * param5;
                param11.field_p = param6;
                param11.field_t = param4;
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

    private final void k() {
        if (((je) this).field_n != 0) {
            if (((je) this).field_j == -2147483648) {
                ((je) this).field_j = 0;
            }
            ((je) this).field_n = 0;
            this.j();
            return;
        }
    }

    final static je a(be param0, int param1, int param2) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new je(param0, param1, param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, je param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    final synchronized boolean e() {
        return ((je) this).field_n != 0;
    }

    final synchronized boolean h() {
        return ((je) this).field_t < 0 || ((je) this).field_t >= ((be) (Object) ((je) this).field_h).field_i.length << 8;
    }

    final synchronized void d(int param0) {
        ((je) this).field_s = param0;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final static je b(be param0, int param1, int param2) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new je(param0, (int)((long)param0.field_h * 256L * (long)param1 / (long)(100 * pb.field_j)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void b(boolean param0) {
        ((je) this).field_m = (((je) this).field_m ^ ((je) this).field_m >> 31) + (((je) this).field_m >>> 31);
        if (param0) {
          ((je) this).field_m = -((je) this).field_m;
          return;
        } else {
          return;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, je param10, int param11, int param12) {
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
        param10.field_t = param4;
        return param5;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((je) this).field_n <= 0) {
            L1: {
              if (((je) this).field_m != 256) {
                break L1;
              } else {
                if ((((je) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (pb.field_q) {
                    return je.b(0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, 0, param3, param2, (je) this);
                  } else {
                    return je.a(((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, 0, param3, param2, (je) this);
                  }
                }
              }
            }
            if (pb.field_q) {
              return je.a(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, 0, param3, param2, (je) this, ((je) this).field_m, param4);
            } else {
              return je.b(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, 0, param3, param2, (je) this, ((je) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((je) this).field_n;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((je) this).field_n = ((je) this).field_n + param1;
                if (((je) this).field_m != 256) {
                  break L4;
                } else {
                  if ((((je) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!pb.field_q) {
                      param1 = je.a(((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, ((je) this).field_q, 0, var6, param2, (je) this);
                      break L3;
                    } else {
                      param1 = je.b(0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, ((je) this).field_x, ((je) this).field_r, 0, var6, param2, (je) this);
                      break L3;
                    }
                  }
                }
              }
              if (!pb.field_q) {
                param1 = je.d(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, ((je) this).field_q, 0, var6, param2, (je) this, ((je) this).field_m, param4);
                break L3;
              } else {
                param1 = je.b(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, ((je) this).field_x, ((je) this).field_r, 0, var6, param2, (je) this, ((je) this).field_m, param4);
                break L3;
              }
            }
            ((je) this).field_n = ((je) this).field_n - param1;
            if (((je) this).field_n == 0) {
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

    final synchronized void a(int param0) {
        be var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((je) this).field_n <= 0) {
            break L0;
          } else {
            if (param0 < ((je) this).field_n) {
              ((je) this).field_p = ((je) this).field_p + ((je) this).field_q * param0;
              ((je) this).field_w = ((je) this).field_w + ((je) this).field_x * param0;
              ((je) this).field_u = ((je) this).field_u + ((je) this).field_r * param0;
              ((je) this).field_n = ((je) this).field_n - param0;
              break L0;
            } else {
              L1: {
                if (((je) this).field_j != -2147483648) {
                  break L1;
                } else {
                  ((je) this).field_j = 0;
                  ((je) this).field_u = 0;
                  ((je) this).field_w = 0;
                  ((je) this).field_p = 0;
                  ((je) this).a(false);
                  param0 = ((je) this).field_n;
                  break L1;
                }
              }
              ((je) this).field_n = 0;
              this.j();
              break L0;
            }
          }
        }
        L2: {
          var2 = (be) (Object) ((je) this).field_h;
          var3 = ((je) this).field_k << 8;
          var4 = ((je) this).field_o << 8;
          var5 = var2.field_i.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((je) this).field_s = 0;
            break L2;
          }
        }
        L3: {
          if (((je) this).field_t >= 0) {
            break L3;
          } else {
            if (((je) this).field_m <= 0) {
              this.k();
              ((je) this).a(false);
              return;
            } else {
              ((je) this).field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((je) this).field_t < var5) {
            break L4;
          } else {
            if (((je) this).field_m >= 0) {
              this.k();
              ((je) this).a(false);
              return;
            } else {
              ((je) this).field_t = var5 - 1;
              break L4;
            }
          }
        }
        ((je) this).field_t = ((je) this).field_t + ((je) this).field_m * param0;
        if (((je) this).field_s >= 0) {
          L5: {
            if (((je) this).field_s <= 0) {
              break L5;
            } else {
              if (!((je) this).field_l) {
                L6: {
                  if (((je) this).field_m >= 0) {
                    if (((je) this).field_t >= var4) {
                      var7 = (((je) this).field_t - var3) / var6;
                      if (var7 < ((je) this).field_s) {
                        ((je) this).field_t = ((je) this).field_t - var6 * var7;
                        ((je) this).field_s = ((je) this).field_s - var7;
                        break L6;
                      } else {
                        ((je) this).field_t = ((je) this).field_t - var6 * ((je) this).field_s;
                        ((je) this).field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((je) this).field_t < var3) {
                      var7 = (var4 - 1 - ((je) this).field_t) / var6;
                      if (var7 < ((je) this).field_s) {
                        ((je) this).field_t = ((je) this).field_t + var6 * var7;
                        ((je) this).field_s = ((je) this).field_s - var7;
                        break L6;
                      } else {
                        ((je) this).field_t = ((je) this).field_t + var6 * ((je) this).field_s;
                        ((je) this).field_s = 0;
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
                  if (((je) this).field_m >= 0) {
                    break L7;
                  } else {
                    if (((je) this).field_t < var3) {
                      ((je) this).field_t = var3 + var3 - 1 - ((je) this).field_t;
                      ((je) this).field_m = -((je) this).field_m;
                      ((je) this).field_s = ((je) this).field_s - 1;
                      if (((je) this).field_s - 1 != 0) {
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
                  if (((je) this).field_t >= var4) {
                    ((je) this).field_t = var4 + var4 - 1 - ((je) this).field_t;
                    ((je) this).field_m = -((je) this).field_m;
                    ((je) this).field_s = ((je) this).field_s - 1;
                    if (((je) this).field_s - 1 != 0) {
                      if (((je) this).field_t < var3) {
                        ((je) this).field_t = var3 + var3 - 1 - ((je) this).field_t;
                        ((je) this).field_m = -((je) this).field_m;
                        ((je) this).field_s = ((je) this).field_s - 1;
                        if (((je) this).field_s - 1 != 0) {
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
          if (((je) this).field_m < 0) {
            if (((je) this).field_t < 0) {
              ((je) this).field_t = -1;
              this.k();
              ((je) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((je) this).field_t < var5) {
                break L9;
              } else {
                ((je) this).field_t = var5;
                this.k();
                ((je) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((je) this).field_l) {
            if (((je) this).field_m >= 0) {
              if (((je) this).field_t < var4) {
                return;
              } else {
                ((je) this).field_t = var3 + (((je) this).field_t - var3) % var6;
                return;
              }
            } else {
              if (((je) this).field_t < var3) {
                ((je) this).field_t = var4 - 1 - (var4 - 1 - ((je) this).field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((je) this).field_m >= 0) {
                break L10;
              } else {
                if (((je) this).field_t < var3) {
                  ((je) this).field_t = var3 + var3 - 1 - ((je) this).field_t;
                  ((je) this).field_m = -((je) this).field_m;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((je) this).field_t >= var4) {
                ((je) this).field_t = var4 + var4 - 1 - ((je) this).field_t;
                ((je) this).field_m = -((je) this).field_m;
                if (((je) this).field_t < var3) {
                  ((je) this).field_t = var3 + var3 - 1 - ((je) this).field_t;
                  ((je) this).field_m = -((je) this).field_m;
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

    final synchronized void f(int param0) {
        this.b(param0, ((je) this).i());
    }

    final int d() {
        if (((je) this).field_j == 0) {
            if (((je) this).field_n == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, je param11, int param12, int param13) {
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

    final synchronized void b(int param0) {
        int var2 = ((be) (Object) ((je) this).field_h).field_i.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((je) this).field_t = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, je param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_q * param5;
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
                param13.field_p = param13.field_p + param13.field_q * param5;
                param13.field_w = param6;
                param13.field_u = param7;
                param13.field_t = param4;
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

    final synchronized void c(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((je) this).field_w == 0) {
            if (((je) this).field_u == 0) {
              ((je) this).field_n = 0;
              ((je) this).field_j = 0;
              ((je) this).field_p = 0;
              ((je) this).a(false);
              return;
            } else {
              L0: {
                var2 = -((je) this).field_p;
                if (((je) this).field_p <= var2) {
                  break L0;
                } else {
                  var2 = ((je) this).field_p;
                  break L0;
                }
              }
              L1: {
                if (-((je) this).field_w <= var2) {
                  break L1;
                } else {
                  var2 = -((je) this).field_w;
                  break L1;
                }
              }
              L2: {
                if (((je) this).field_w <= var2) {
                  break L2;
                } else {
                  var2 = ((je) this).field_w;
                  break L2;
                }
              }
              L3: {
                if (-((je) this).field_u <= var2) {
                  break L3;
                } else {
                  var2 = -((je) this).field_u;
                  break L3;
                }
              }
              L4: {
                if (((je) this).field_u <= var2) {
                  break L4;
                } else {
                  var2 = ((je) this).field_u;
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
              ((je) this).field_n = param0;
              ((je) this).field_j = -2147483648;
              ((je) this).field_q = -((je) this).field_p / param0;
              ((je) this).field_x = -((je) this).field_w / param0;
              ((je) this).field_r = -((je) this).field_u / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((je) this).field_p;
              if (((je) this).field_p <= var2) {
                break L6;
              } else {
                var2 = ((je) this).field_p;
                break L6;
              }
            }
            L7: {
              if (-((je) this).field_w <= var2) {
                break L7;
              } else {
                var2 = -((je) this).field_w;
                break L7;
              }
            }
            L8: {
              if (((je) this).field_w <= var2) {
                break L8;
              } else {
                var2 = ((je) this).field_w;
                break L8;
              }
            }
            L9: {
              if (-((je) this).field_u <= var2) {
                break L9;
              } else {
                var2 = -((je) this).field_u;
                break L9;
              }
            }
            L10: {
              if (((je) this).field_u <= var2) {
                break L10;
              } else {
                var2 = ((je) this).field_u;
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
            ((je) this).field_n = param0;
            ((je) this).field_j = -2147483648;
            ((je) this).field_q = -((je) this).field_p / param0;
            ((je) this).field_x = -((je) this).field_w / param0;
            ((je) this).field_r = -((je) this).field_u / param0;
            return;
          }
        } else {
          ((je) this).f(0);
          ((je) this).a(false);
          return;
        }
    }

    final synchronized int f() {
        return ((je) this).field_m < 0 ? -((je) this).field_m : ((je) this).field_m;
    }

    private final synchronized void b(int param0, int param1) {
        ((je) this).field_j = param0;
        ((je) this).field_v = param1;
        ((je) this).field_n = 0;
        this.j();
    }

    final synchronized void a(int param0, int param1) {
        ((je) this).a(param0, param1, ((je) this).i());
    }

    final tda b() {
        return null;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, je param10, int param11, int param12) {
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
        param10.field_t = param4;
        return param5;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, je param9) {
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
        param9.field_w = param9.field_w + param9.field_x * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_r * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_t = param2 << 8;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, je param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_q * param5;
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
                param13.field_p = param13.field_p + param13.field_q * param5;
                param13.field_w = param6;
                param13.field_u = param7;
                param13.field_t = param4;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, je param12) {
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
        param12.field_p = param12.field_p + param12.field_q * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_w = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_t = param3 << 8;
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

    final synchronized void a(int[] param0, int param1, int param2) {
        be var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((je) this).field_j != 0) {
            break L0;
          } else {
            if (((je) this).field_n != 0) {
              break L0;
            } else {
              ((je) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (be) (Object) ((je) this).field_h;
          var5 = ((je) this).field_k << 8;
          var6 = ((je) this).field_o << 8;
          var7 = var4.field_i.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((je) this).field_s = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((je) this).field_t >= 0) {
            break L2;
          } else {
            if (((je) this).field_m <= 0) {
              this.k();
              ((je) this).a(false);
              return;
            } else {
              ((je) this).field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((je) this).field_t < var7) {
            break L3;
          } else {
            if (((je) this).field_m >= 0) {
              this.k();
              ((je) this).a(false);
              return;
            } else {
              ((je) this).field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (((je) this).field_s >= 0) {
          L4: {
            if (((je) this).field_s <= 0) {
              break L4;
            } else {
              if (!((je) this).field_l) {
                if (((je) this).field_m >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((je) this).field_k]);
                    if (((je) this).field_t >= var6) {
                      var10 = (((je) this).field_t - var5) / var8;
                      if (var10 < ((je) this).field_s) {
                        ((je) this).field_t = ((je) this).field_t - var8 * var10;
                        ((je) this).field_s = ((je) this).field_s - var10;
                        continue L5;
                      } else {
                        ((je) this).field_t = ((je) this).field_t - var8 * ((je) this).field_s;
                        ((je) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_o - 1]);
                    if (((je) this).field_t < var5) {
                      var10 = (var6 - 1 - ((je) this).field_t) / var8;
                      if (var10 < ((je) this).field_s) {
                        ((je) this).field_t = ((je) this).field_t + var8 * var10;
                        ((je) this).field_s = ((je) this).field_s - var10;
                        continue L6;
                      } else {
                        ((je) this).field_t = ((je) this).field_t + var8 * ((je) this).field_s;
                        ((je) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((je) this).field_m >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_k]);
                    if (((je) this).field_t < var5) {
                      ((je) this).field_t = var5 + var5 - 1 - ((je) this).field_t;
                      ((je) this).field_m = -((je) this).field_m;
                      ((je) this).field_s = ((je) this).field_s - 1;
                      if (((je) this).field_s - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((je) this).field_o - 1]);
                  if (((je) this).field_t >= var6) {
                    ((je) this).field_t = var6 + var6 - 1 - ((je) this).field_t;
                    ((je) this).field_m = -((je) this).field_m;
                    ((je) this).field_s = ((je) this).field_s - 1;
                    if (((je) this).field_s - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_k]);
                      if (((je) this).field_t < var5) {
                        ((je) this).field_t = var5 + var5 - 1 - ((je) this).field_t;
                        ((je) this).field_m = -((je) this).field_m;
                        ((je) this).field_s = ((je) this).field_s - 1;
                        if (((je) this).field_s - 1 != 0) {
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
          if (((je) this).field_m < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((je) this).field_t < 0) {
              ((je) this).field_t = -1;
              this.k();
              ((je) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((je) this).field_t < var7) {
                break L9;
              } else {
                ((je) this).field_t = var7;
                this.k();
                ((je) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((je) this).field_l) {
            if (((je) this).field_m >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((je) this).field_k]);
                if (((je) this).field_t >= var6) {
                  ((je) this).field_t = var5 + (((je) this).field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_o - 1]);
                if (((je) this).field_t < var5) {
                  ((je) this).field_t = var6 - 1 - (var6 - 1 - ((je) this).field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((je) this).field_m >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_k]);
                if (((je) this).field_t < var5) {
                  ((je) this).field_t = var5 + var5 - 1 - ((je) this).field_t;
                  ((je) this).field_m = -((je) this).field_m;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((je) this).field_o - 1]);
              if (((je) this).field_t >= var6) {
                ((je) this).field_t = var6 + var6 - 1 - ((je) this).field_t;
                ((je) this).field_m = -((je) this).field_m;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((je) this).field_k]);
                if (((je) this).field_t < var5) {
                  ((je) this).field_t = var5 + var5 - 1 - ((je) this).field_t;
                  ((je) this).field_m = -((je) this).field_m;
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

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((je) this).field_n <= 0) {
            L1: {
              if (((je) this).field_m != -256) {
                break L1;
              } else {
                if ((((je) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (pb.field_q) {
                    return je.a(0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, 0, param3, param2, (je) this);
                  } else {
                    return je.b(((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, 0, param3, param2, (je) this);
                  }
                }
              }
            }
            if (pb.field_q) {
              return je.b(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, 0, param3, param2, (je) this, ((je) this).field_m, param4);
            } else {
              return je.a(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, 0, param3, param2, (je) this, ((je) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((je) this).field_n;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((je) this).field_n = ((je) this).field_n + param1;
                if (((je) this).field_m != -256) {
                  break L4;
                } else {
                  if ((((je) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!pb.field_q) {
                      param1 = je.b(((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, ((je) this).field_q, 0, var6, param2, (je) this);
                      break L3;
                    } else {
                      param1 = je.a(0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, ((je) this).field_x, ((je) this).field_r, 0, var6, param2, (je) this);
                      break L3;
                    }
                  }
                }
              }
              if (!pb.field_q) {
                param1 = je.c(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_p, ((je) this).field_q, 0, var6, param2, (je) this, ((je) this).field_m, param4);
                break L3;
              } else {
                param1 = je.a(0, 0, ((be) (Object) ((je) this).field_h).field_i, param0, ((je) this).field_t, param1, ((je) this).field_w, ((je) this).field_u, ((je) this).field_x, ((je) this).field_r, 0, var6, param2, (je) this, ((je) this).field_m, param4);
                break L3;
              }
            }
            ((je) this).field_n = ((je) this).field_n - param1;
            if (((je) this).field_n == 0) {
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

    final static je a(be param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new je(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized void e(int param0) {
        if (((je) this).field_m < 0) {
            ((je) this).field_m = -param0;
        } else {
            ((je) this).field_m = param0;
        }
    }

    final tda a() {
        return null;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = je.d(param1, param2);
          var5 = je.c(param1, param2);
          if (((je) this).field_w == var4) {
            if (((je) this).field_u == var5) {
              ((je) this).field_n = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((je) this).field_p;
                if (((je) this).field_p - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((je) this).field_p - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((je) this).field_w <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((je) this).field_w;
                  break L1;
                }
              }
              L2: {
                if (((je) this).field_w - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((je) this).field_w - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((je) this).field_u <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((je) this).field_u;
                  break L3;
                }
              }
              L4: {
                if (((je) this).field_u - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((je) this).field_u - var5;
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
              ((je) this).field_n = param0;
              ((je) this).field_j = param1;
              ((je) this).field_v = param2;
              ((je) this).field_q = (param1 - ((je) this).field_p) / param0;
              ((je) this).field_x = (var4 - ((je) this).field_w) / param0;
              ((je) this).field_r = (var5 - ((je) this).field_u) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((je) this).field_p;
              if (((je) this).field_p - param1 <= var6) {
                break L6;
              } else {
                var6 = ((je) this).field_p - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((je) this).field_w <= var6) {
                break L7;
              } else {
                var6 = var4 - ((je) this).field_w;
                break L7;
              }
            }
            L8: {
              if (((je) this).field_w - var4 <= var6) {
                break L8;
              } else {
                var6 = ((je) this).field_w - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((je) this).field_u <= var6) {
                break L9;
              } else {
                var6 = var5 - ((je) this).field_u;
                break L9;
              }
            }
            L10: {
              if (((je) this).field_u - var5 <= var6) {
                break L10;
              } else {
                var6 = ((je) this).field_u - var5;
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
            ((je) this).field_n = param0;
            ((je) this).field_j = param1;
            ((je) this).field_v = param2;
            ((je) this).field_q = (param1 - ((je) this).field_p) / param0;
            ((je) this).field_x = (var4 - ((je) this).field_w) / param0;
            ((je) this).field_r = (var5 - ((je) this).field_u) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    private final void j() {
        ((je) this).field_p = ((je) this).field_j;
        ((je) this).field_w = je.d(((je) this).field_j, ((je) this).field_v);
        ((je) this).field_u = je.c(((je) this).field_j, ((je) this).field_v);
    }

    private je(be param0, int param1, int param2) {
        ((je) this).field_h = (lj) (Object) param0;
        ((je) this).field_k = param0.field_g;
        ((je) this).field_o = param0.field_j;
        ((je) this).field_l = param0.field_k;
        ((je) this).field_m = param1;
        ((je) this).field_j = param2;
        ((je) this).field_v = 8192;
        ((je) this).field_t = 0;
        this.j();
    }

    private je(be param0, int param1, int param2, int param3) {
        ((je) this).field_h = (lj) (Object) param0;
        ((je) this).field_k = param0.field_g;
        ((je) this).field_o = param0.field_j;
        ((je) this).field_l = param0.field_k;
        ((je) this).field_m = param1;
        ((je) this).field_j = param2;
        ((je) this).field_v = param3;
        ((je) this).field_t = 0;
        this.j();
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, je param9) {
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
        param9.field_w = param9.field_w + param9.field_x * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_r * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_t = param2 << 8;
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
}
