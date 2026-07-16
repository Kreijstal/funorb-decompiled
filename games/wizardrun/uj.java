/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends k {
    private boolean field_s;
    private int field_o;
    private int field_q;
    private int field_p;
    private int field_m;
    private int field_u;
    private int field_w;
    private int field_y;
    private int field_x;
    private int field_t;
    private int field_n;
    private int field_v;
    private int field_A;
    private int field_r;
    private int field_z;

    final synchronized void g(int param0) {
        int var2 = ((je) (Object) ((uj) this).field_k).field_k.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((uj) this).field_o = param0;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10) {
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
                param10.field_o = param3 << 8;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_A = param11.field_A - param11.field_t * param5;
            param11.field_v = param11.field_v - param11.field_x * param5;
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
                param11.field_A = param11.field_A + param11.field_t * param5;
                param11.field_v = param11.field_v + param11.field_x * param5;
                param11.field_q = param6;
                param11.field_o = param4;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10, int param11, int param12) {
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
                param10.field_o = param4;
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

    final synchronized void f(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((uj) this).field_A == 0) {
            if (((uj) this).field_v == 0) {
              ((uj) this).field_z = 0;
              ((uj) this).field_n = 0;
              ((uj) this).field_q = 0;
              ((uj) this).a(false);
              return;
            } else {
              L0: {
                var2 = -((uj) this).field_q;
                if (((uj) this).field_q <= var2) {
                  break L0;
                } else {
                  var2 = ((uj) this).field_q;
                  break L0;
                }
              }
              L1: {
                if (-((uj) this).field_A <= var2) {
                  break L1;
                } else {
                  var2 = -((uj) this).field_A;
                  break L1;
                }
              }
              L2: {
                if (((uj) this).field_A <= var2) {
                  break L2;
                } else {
                  var2 = ((uj) this).field_A;
                  break L2;
                }
              }
              L3: {
                if (-((uj) this).field_v <= var2) {
                  break L3;
                } else {
                  var2 = -((uj) this).field_v;
                  break L3;
                }
              }
              L4: {
                if (((uj) this).field_v <= var2) {
                  break L4;
                } else {
                  var2 = ((uj) this).field_v;
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
              ((uj) this).field_z = param0;
              ((uj) this).field_n = -2147483648;
              ((uj) this).field_r = -((uj) this).field_q / param0;
              ((uj) this).field_t = -((uj) this).field_A / param0;
              ((uj) this).field_x = -((uj) this).field_v / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((uj) this).field_q;
              if (((uj) this).field_q <= var2) {
                break L6;
              } else {
                var2 = ((uj) this).field_q;
                break L6;
              }
            }
            L7: {
              if (-((uj) this).field_A <= var2) {
                break L7;
              } else {
                var2 = -((uj) this).field_A;
                break L7;
              }
            }
            L8: {
              if (((uj) this).field_A <= var2) {
                break L8;
              } else {
                var2 = ((uj) this).field_A;
                break L8;
              }
            }
            L9: {
              if (-((uj) this).field_v <= var2) {
                break L9;
              } else {
                var2 = -((uj) this).field_v;
                break L9;
              }
            }
            L10: {
              if (((uj) this).field_v <= var2) {
                break L10;
              } else {
                var2 = ((uj) this).field_v;
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
            ((uj) this).field_z = param0;
            ((uj) this).field_n = -2147483648;
            ((uj) this).field_r = -((uj) this).field_q / param0;
            ((uj) this).field_t = -((uj) this).field_A / param0;
            ((uj) this).field_x = -((uj) this).field_v / param0;
            return;
          }
        } else {
          this.c(0);
          ((uj) this).a(false);
          return;
        }
    }

    final int d() {
        if (((uj) this).field_n == 0) {
            if (((uj) this).field_z == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
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
        param8.field_o = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_A = param11.field_A - param11.field_t * param5;
            param11.field_v = param11.field_v - param11.field_x * param5;
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
                param11.field_A = param11.field_A + param11.field_t * param5;
                param11.field_v = param11.field_v + param11.field_x * param5;
                param11.field_q = param6;
                param11.field_o = param4;
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

    final k a() {
        return null;
    }

    private final synchronized void c(int param0) {
        this.a(param0, ((uj) this).j());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, uj param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_q = param13.field_q - param13.field_r * param5;
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
                param13.field_q = param13.field_q + param13.field_r * param5;
                param13.field_A = param6;
                param13.field_v = param7;
                param13.field_o = param4;
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

    private final void l() {
        ((uj) this).field_q = ((uj) this).field_n;
        ((uj) this).field_A = uj.d(((uj) this).field_n, ((uj) this).field_p);
        ((uj) this).field_v = uj.b(((uj) this).field_n, ((uj) this).field_p);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, uj param9) {
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
        param9.field_A = param9.field_A + param9.field_t * (param6 - param3);
        param9.field_v = param9.field_v + param9.field_x * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_q = param4 >> 2;
                param9.field_o = param2 << 8;
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

    final synchronized int h() {
        return ((uj) this).field_m < 0 ? -((uj) this).field_m : ((uj) this).field_m;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
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
                param11.field_o = param4;
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

    final static uj a(je param0, int param1, int param2, int param3) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new uj(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        je var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((uj) this).field_n != 0) {
            break L0;
          } else {
            if (((uj) this).field_z != 0) {
              break L0;
            } else {
              ((uj) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (je) (Object) ((uj) this).field_k;
          var5 = ((uj) this).field_y << 8;
          var6 = ((uj) this).field_u << 8;
          var7 = var4.field_k.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((uj) this).field_w = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((uj) this).field_o >= 0) {
            break L2;
          } else {
            if (((uj) this).field_m <= 0) {
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              ((uj) this).field_o = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((uj) this).field_o < var7) {
            break L3;
          } else {
            if (((uj) this).field_m >= 0) {
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              ((uj) this).field_o = var7 - 1;
              break L3;
            }
          }
        }
        if (((uj) this).field_w >= 0) {
          L4: {
            if (((uj) this).field_w <= 0) {
              break L4;
            } else {
              if (!((uj) this).field_s) {
                if (((uj) this).field_m >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((uj) this).field_y]);
                    if (((uj) this).field_o >= var6) {
                      var10 = (((uj) this).field_o - var5) / var8;
                      if (var10 < ((uj) this).field_w) {
                        ((uj) this).field_o = ((uj) this).field_o - var8 * var10;
                        ((uj) this).field_w = ((uj) this).field_w - var10;
                        continue L5;
                      } else {
                        ((uj) this).field_o = ((uj) this).field_o - var8 * ((uj) this).field_w;
                        ((uj) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_u - 1]);
                    if (((uj) this).field_o < var5) {
                      var10 = (var6 - 1 - ((uj) this).field_o) / var8;
                      if (var10 < ((uj) this).field_w) {
                        ((uj) this).field_o = ((uj) this).field_o + var8 * var10;
                        ((uj) this).field_w = ((uj) this).field_w - var10;
                        continue L6;
                      } else {
                        ((uj) this).field_o = ((uj) this).field_o + var8 * ((uj) this).field_w;
                        ((uj) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((uj) this).field_m >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_y]);
                    if (((uj) this).field_o < var5) {
                      ((uj) this).field_o = var5 + var5 - 1 - ((uj) this).field_o;
                      ((uj) this).field_m = -((uj) this).field_m;
                      int fieldTemp$5 = ((uj) this).field_w - 1;
                      ((uj) this).field_w = ((uj) this).field_w - 1;
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((uj) this).field_u - 1]);
                  if (((uj) this).field_o >= var6) {
                    ((uj) this).field_o = var6 + var6 - 1 - ((uj) this).field_o;
                    ((uj) this).field_m = -((uj) this).field_m;
                    int fieldTemp$6 = ((uj) this).field_w - 1;
                    ((uj) this).field_w = ((uj) this).field_w - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_y]);
                      if (((uj) this).field_o < var5) {
                        ((uj) this).field_o = var5 + var5 - 1 - ((uj) this).field_o;
                        ((uj) this).field_m = -((uj) this).field_m;
                        int fieldTemp$7 = ((uj) this).field_w - 1;
                        ((uj) this).field_w = ((uj) this).field_w - 1;
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
          if (((uj) this).field_m < 0) {
            int discarded$8 = this.b(param0, var9, 0, param2, 0);
            if (((uj) this).field_o < 0) {
              ((uj) this).field_o = -1;
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.a(param0, var9, var7, param2, 0);
              if (((uj) this).field_o < var7) {
                break L9;
              } else {
                ((uj) this).field_o = var7;
                this.k();
                ((uj) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((uj) this).field_s) {
            if (((uj) this).field_m >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((uj) this).field_y]);
                if (((uj) this).field_o >= var6) {
                  ((uj) this).field_o = var5 + (((uj) this).field_o - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_u - 1]);
                if (((uj) this).field_o < var5) {
                  ((uj) this).field_o = var6 - 1 - (var6 - 1 - ((uj) this).field_o) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((uj) this).field_m >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_y]);
                if (((uj) this).field_o < var5) {
                  ((uj) this).field_o = var5 + var5 - 1 - ((uj) this).field_o;
                  ((uj) this).field_m = -((uj) this).field_m;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_k[((uj) this).field_u - 1]);
              if (((uj) this).field_o >= var6) {
                ((uj) this).field_o = var6 + var6 - 1 - ((uj) this).field_o;
                ((uj) this).field_m = -((uj) this).field_m;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_k[((uj) this).field_y]);
                if (((uj) this).field_o < var5) {
                  ((uj) this).field_o = var5 + var5 - 1 - ((uj) this).field_o;
                  ((uj) this).field_m = -((uj) this).field_m;
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
          if (((uj) this).field_z <= 0) {
            L1: {
              if (((uj) this).field_m != 256) {
                break L1;
              } else {
                if ((((uj) this).field_o & 255) != 0) {
                  break L1;
                } else {
                  if (c.field_r) {
                    return uj.a(0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, 0, param3, param2, (uj) this);
                  } else {
                    return uj.b(((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, 0, param3, param2, (uj) this);
                  }
                }
              }
            }
            if (c.field_r) {
              return uj.a(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, 0, param3, param2, (uj) this, ((uj) this).field_m, param4);
            } else {
              return uj.a(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, 0, param3, param2, (uj) this, ((uj) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((uj) this).field_z;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((uj) this).field_z = ((uj) this).field_z + param1;
                if (((uj) this).field_m != 256) {
                  break L4;
                } else {
                  if ((((uj) this).field_o & 255) != 0) {
                    break L4;
                  } else {
                    if (!c.field_r) {
                      param1 = uj.a(((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, ((uj) this).field_r, 0, var6, param2, (uj) this);
                      break L3;
                    } else {
                      param1 = uj.b(0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, ((uj) this).field_t, ((uj) this).field_x, 0, var6, param2, (uj) this);
                      break L3;
                    }
                  }
                }
              }
              if (!c.field_r) {
                param1 = uj.d(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, ((uj) this).field_r, 0, var6, param2, (uj) this, ((uj) this).field_m, param4);
                break L3;
              } else {
                param1 = uj.a(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, ((uj) this).field_t, ((uj) this).field_x, 0, var6, param2, (uj) this, ((uj) this).field_m, param4);
                break L3;
              }
            }
            ((uj) this).field_z = ((uj) this).field_z - param1;
            if (((uj) this).field_z == 0) {
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

    final synchronized void e(int param0) {
        ((uj) this).field_w = param0;
    }

    final static uj a(je param0, int param1, int param2) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new uj(param0, (int)((long)param0.field_m * 256L * (long)param1 / (long)(100 * c.field_l)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized int f() {
        return ((uj) this).field_n == -2147483648 ? 0 : ((uj) this).field_n;
    }

    final synchronized void b(boolean param0) {
        ((uj) this).field_m = (((uj) this).field_m ^ ((uj) this).field_m >> 31) + (((uj) this).field_m >>> 31);
        if (param0) {
          ((uj) this).field_m = -((uj) this).field_m;
          return;
        } else {
          return;
        }
    }

    final synchronized void c(int param0, int param1) {
        ((uj) this).a(param0, param1, ((uj) this).j());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10, int param11, int param12) {
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
                param10.field_o = param4;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((uj) this).field_z <= 0) {
            L1: {
              if (((uj) this).field_m != -256) {
                break L1;
              } else {
                if ((((uj) this).field_o & 255) != 0) {
                  break L1;
                } else {
                  if (c.field_r) {
                    return uj.b(0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, 0, param3, param2, (uj) this);
                  } else {
                    return uj.a(((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, 0, param3, param2, (uj) this);
                  }
                }
              }
            }
            if (c.field_r) {
              return uj.c(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, 0, param3, param2, (uj) this, ((uj) this).field_m, param4);
            } else {
              return uj.b(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, 0, param3, param2, (uj) this, ((uj) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((uj) this).field_z;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((uj) this).field_z = ((uj) this).field_z + param1;
                if (((uj) this).field_m != -256) {
                  break L4;
                } else {
                  if ((((uj) this).field_o & 255) != 0) {
                    break L4;
                  } else {
                    if (!c.field_r) {
                      param1 = uj.b(((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, ((uj) this).field_r, 0, var6, param2, (uj) this);
                      break L3;
                    } else {
                      param1 = uj.a(0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, ((uj) this).field_t, ((uj) this).field_x, 0, var6, param2, (uj) this);
                      break L3;
                    }
                  }
                }
              }
              if (!c.field_r) {
                param1 = uj.b(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_q, ((uj) this).field_r, 0, var6, param2, (uj) this, ((uj) this).field_m, param4);
                break L3;
              } else {
                param1 = uj.b(0, 0, ((je) (Object) ((uj) this).field_k).field_k, param0, ((uj) this).field_o, param1, ((uj) this).field_A, ((uj) this).field_v, ((uj) this).field_t, ((uj) this).field_x, 0, var6, param2, (uj) this, ((uj) this).field_m, param4);
                break L3;
              }
            }
            ((uj) this).field_z = ((uj) this).field_z - param1;
            if (((uj) this).field_z == 0) {
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

    final synchronized void a(int param0) {
        je var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((uj) this).field_z <= 0) {
            break L0;
          } else {
            if (param0 < ((uj) this).field_z) {
              ((uj) this).field_q = ((uj) this).field_q + ((uj) this).field_r * param0;
              ((uj) this).field_A = ((uj) this).field_A + ((uj) this).field_t * param0;
              ((uj) this).field_v = ((uj) this).field_v + ((uj) this).field_x * param0;
              ((uj) this).field_z = ((uj) this).field_z - param0;
              break L0;
            } else {
              L1: {
                if (((uj) this).field_n != -2147483648) {
                  break L1;
                } else {
                  ((uj) this).field_n = 0;
                  ((uj) this).field_v = 0;
                  ((uj) this).field_A = 0;
                  ((uj) this).field_q = 0;
                  ((uj) this).a(false);
                  param0 = ((uj) this).field_z;
                  break L1;
                }
              }
              ((uj) this).field_z = 0;
              this.l();
              break L0;
            }
          }
        }
        L2: {
          var2 = (je) (Object) ((uj) this).field_k;
          var3 = ((uj) this).field_y << 8;
          var4 = ((uj) this).field_u << 8;
          var5 = var2.field_k.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((uj) this).field_w = 0;
            break L2;
          }
        }
        L3: {
          if (((uj) this).field_o >= 0) {
            break L3;
          } else {
            if (((uj) this).field_m <= 0) {
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              ((uj) this).field_o = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((uj) this).field_o < var5) {
            break L4;
          } else {
            if (((uj) this).field_m >= 0) {
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              ((uj) this).field_o = var5 - 1;
              break L4;
            }
          }
        }
        ((uj) this).field_o = ((uj) this).field_o + ((uj) this).field_m * param0;
        if (((uj) this).field_w >= 0) {
          L5: {
            if (((uj) this).field_w <= 0) {
              break L5;
            } else {
              if (!((uj) this).field_s) {
                L6: {
                  if (((uj) this).field_m >= 0) {
                    if (((uj) this).field_o >= var4) {
                      var7 = (((uj) this).field_o - var3) / var6;
                      if (var7 < ((uj) this).field_w) {
                        ((uj) this).field_o = ((uj) this).field_o - var6 * var7;
                        ((uj) this).field_w = ((uj) this).field_w - var7;
                        break L6;
                      } else {
                        ((uj) this).field_o = ((uj) this).field_o - var6 * ((uj) this).field_w;
                        ((uj) this).field_w = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((uj) this).field_o < var3) {
                      var7 = (var4 - 1 - ((uj) this).field_o) / var6;
                      if (var7 < ((uj) this).field_w) {
                        ((uj) this).field_o = ((uj) this).field_o + var6 * var7;
                        ((uj) this).field_w = ((uj) this).field_w - var7;
                        break L6;
                      } else {
                        ((uj) this).field_o = ((uj) this).field_o + var6 * ((uj) this).field_w;
                        ((uj) this).field_w = 0;
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
                  if (((uj) this).field_m >= 0) {
                    break L7;
                  } else {
                    if (((uj) this).field_o < var3) {
                      ((uj) this).field_o = var3 + var3 - 1 - ((uj) this).field_o;
                      ((uj) this).field_m = -((uj) this).field_m;
                      int fieldTemp$3 = ((uj) this).field_w - 1;
                      ((uj) this).field_w = ((uj) this).field_w - 1;
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
                  if (((uj) this).field_o >= var4) {
                    ((uj) this).field_o = var4 + var4 - 1 - ((uj) this).field_o;
                    ((uj) this).field_m = -((uj) this).field_m;
                    int fieldTemp$4 = ((uj) this).field_w - 1;
                    ((uj) this).field_w = ((uj) this).field_w - 1;
                    if (fieldTemp$4 != 0) {
                      if (((uj) this).field_o < var3) {
                        ((uj) this).field_o = var3 + var3 - 1 - ((uj) this).field_o;
                        ((uj) this).field_m = -((uj) this).field_m;
                        int fieldTemp$5 = ((uj) this).field_w - 1;
                        ((uj) this).field_w = ((uj) this).field_w - 1;
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
          if (((uj) this).field_m < 0) {
            if (((uj) this).field_o < 0) {
              ((uj) this).field_o = -1;
              this.k();
              ((uj) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((uj) this).field_o < var5) {
                break L9;
              } else {
                ((uj) this).field_o = var5;
                this.k();
                ((uj) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((uj) this).field_s) {
            if (((uj) this).field_m >= 0) {
              if (((uj) this).field_o < var4) {
                return;
              } else {
                ((uj) this).field_o = var3 + (((uj) this).field_o - var3) % var6;
                return;
              }
            } else {
              if (((uj) this).field_o < var3) {
                ((uj) this).field_o = var4 - 1 - (var4 - 1 - ((uj) this).field_o) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((uj) this).field_m >= 0) {
                break L10;
              } else {
                if (((uj) this).field_o < var3) {
                  ((uj) this).field_o = var3 + var3 - 1 - ((uj) this).field_o;
                  ((uj) this).field_m = -((uj) this).field_m;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((uj) this).field_o >= var4) {
                ((uj) this).field_o = var4 + var4 - 1 - ((uj) this).field_o;
                ((uj) this).field_m = -((uj) this).field_m;
                if (((uj) this).field_o < var3) {
                  ((uj) this).field_o = var3 + var3 - 1 - ((uj) this).field_o;
                  ((uj) this).field_m = -((uj) this).field_m;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, uj param9) {
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
        param9.field_A = param9.field_A + param9.field_t * (param6 - param3);
        param9.field_v = param9.field_v + param9.field_x * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_q = param4 >> 2;
                param9.field_o = param2 << 8;
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

    private final synchronized void a(int param0, int param1) {
        ((uj) this).field_n = param0;
        ((uj) this).field_p = param1;
        ((uj) this).field_z = 0;
        this.l();
    }

    final k c() {
        return null;
    }

    private final boolean e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((uj) this).field_n;
          if (var1 != -2147483648) {
            var2 = uj.d(var1, ((uj) this).field_p);
            var3 = uj.b(var1, ((uj) this).field_p);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((uj) this).field_q != var1) {
            break L1;
          } else {
            if (((uj) this).field_A != var2) {
              break L1;
            } else {
              if (((uj) this).field_v == var3) {
                if (((uj) this).field_n == -2147483648) {
                  ((uj) this).field_n = 0;
                  ((uj) this).field_v = 0;
                  ((uj) this).field_A = 0;
                  ((uj) this).field_q = 0;
                  ((uj) this).a(false);
                  return true;
                } else {
                  this.l();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((uj) this).field_q >= var1) {
            if (((uj) this).field_q <= var1) {
              ((uj) this).field_r = 0;
              break L2;
            } else {
              ((uj) this).field_r = -1;
              ((uj) this).field_z = ((uj) this).field_q - var1;
              break L2;
            }
          } else {
            ((uj) this).field_r = 1;
            ((uj) this).field_z = var1 - ((uj) this).field_q;
            break L2;
          }
        }
        L3: {
          if (((uj) this).field_A >= var2) {
            if (((uj) this).field_A <= var2) {
              ((uj) this).field_t = 0;
              break L3;
            } else {
              L4: {
                ((uj) this).field_t = -1;
                if (((uj) this).field_z == 0) {
                  break L4;
                } else {
                  if (((uj) this).field_z <= ((uj) this).field_A - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((uj) this).field_z = ((uj) this).field_A - var2;
              break L3;
            }
          } else {
            L5: {
              ((uj) this).field_t = 1;
              if (((uj) this).field_z == 0) {
                break L5;
              } else {
                if (((uj) this).field_z <= var2 - ((uj) this).field_A) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((uj) this).field_z = var2 - ((uj) this).field_A;
            break L3;
          }
        }
        if (((uj) this).field_v < var3) {
          ((uj) this).field_x = 1;
          if (((uj) this).field_z != 0) {
            if (((uj) this).field_z > var3 - ((uj) this).field_v) {
              ((uj) this).field_z = var3 - ((uj) this).field_v;
              return false;
            } else {
              return false;
            }
          } else {
            ((uj) this).field_z = var3 - ((uj) this).field_v;
            return false;
          }
        } else {
          L6: {
            if (((uj) this).field_v <= var3) {
              ((uj) this).field_x = 0;
              break L6;
            } else {
              L7: {
                ((uj) this).field_x = -1;
                if (((uj) this).field_z == 0) {
                  break L7;
                } else {
                  if (((uj) this).field_z <= ((uj) this).field_v - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((uj) this).field_z = ((uj) this).field_v - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, uj param10) {
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
                param10.field_o = param3 << 8;
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

    final int b() {
        int var1 = ((uj) this).field_q * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((uj) this).field_w == 0) {
            var1 = var1 - var1 * ((uj) this).field_o / (((je) (Object) ((uj) this).field_k).field_k.length << 8);
        } else {
            if (((uj) this).field_w >= 0) {
                var1 = var1 - var1 * ((uj) this).field_y / ((je) (Object) ((uj) this).field_k).field_k.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, uj param12) {
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
        param12.field_q = param12.field_q + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_A = param5 >> 2;
                param12.field_v = param6 >> 2;
                param12.field_o = param3 << 8;
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

    final synchronized boolean i() {
        return ((uj) this).field_z != 0;
    }

    final synchronized int j() {
        return ((uj) this).field_p < 0 ? -1 : ((uj) this).field_p;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = uj.d(param1, param2);
          var5 = uj.b(param1, param2);
          if (((uj) this).field_A == var4) {
            if (((uj) this).field_v == var5) {
              ((uj) this).field_z = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((uj) this).field_q;
                if (((uj) this).field_q - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((uj) this).field_q - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((uj) this).field_A <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((uj) this).field_A;
                  break L1;
                }
              }
              L2: {
                if (((uj) this).field_A - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((uj) this).field_A - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((uj) this).field_v <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((uj) this).field_v;
                  break L3;
                }
              }
              L4: {
                if (((uj) this).field_v - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((uj) this).field_v - var5;
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
              ((uj) this).field_z = param0;
              ((uj) this).field_n = param1;
              ((uj) this).field_p = param2;
              ((uj) this).field_r = (param1 - ((uj) this).field_q) / param0;
              ((uj) this).field_t = (var4 - ((uj) this).field_A) / param0;
              ((uj) this).field_x = (var5 - ((uj) this).field_v) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((uj) this).field_q;
              if (((uj) this).field_q - param1 <= var6) {
                break L6;
              } else {
                var6 = ((uj) this).field_q - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((uj) this).field_A <= var6) {
                break L7;
              } else {
                var6 = var4 - ((uj) this).field_A;
                break L7;
              }
            }
            L8: {
              if (((uj) this).field_A - var4 <= var6) {
                break L8;
              } else {
                var6 = ((uj) this).field_A - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((uj) this).field_v <= var6) {
                break L9;
              } else {
                var6 = var5 - ((uj) this).field_v;
                break L9;
              }
            }
            L10: {
              if (((uj) this).field_v - var5 <= var6) {
                break L10;
              } else {
                var6 = ((uj) this).field_v - var5;
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
            ((uj) this).field_z = param0;
            ((uj) this).field_n = param1;
            ((uj) this).field_p = param2;
            ((uj) this).field_r = (param1 - ((uj) this).field_q) / param0;
            ((uj) this).field_t = (var4 - ((uj) this).field_A) / param0;
            ((uj) this).field_x = (var5 - ((uj) this).field_v) / param0;
            return;
          }
        } else {
          this.a(param1, param2);
          return;
        }
    }

    final synchronized void d(int param0) {
        if (((uj) this).field_m < 0) {
            ((uj) this).field_m = -param0;
        } else {
            ((uj) this).field_m = param0;
        }
    }

    final synchronized boolean g() {
        return ((uj) this).field_o < 0 || ((uj) this).field_o >= ((je) (Object) ((uj) this).field_k).field_k.length << 8;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, uj param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_q = param13.field_q - param13.field_r * param5;
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
                param13.field_q = param13.field_q + param13.field_r * param5;
                param13.field_A = param6;
                param13.field_v = param7;
                param13.field_o = param4;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
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
        param8.field_o = param2 << 8;
        return param3;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, uj param12) {
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
        param12.field_q = param12.field_q + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_A = param5 >> 2;
                param12.field_v = param6 >> 2;
                param12.field_o = param3 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, uj param11, int param12, int param13) {
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
                param11.field_o = param4;
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

    private final void k() {
        if (((uj) this).field_z != 0) {
            if (((uj) this).field_n == -2147483648) {
                ((uj) this).field_n = 0;
            }
            ((uj) this).field_z = 0;
            this.l();
            return;
        }
    }

    private uj(je param0, int param1, int param2) {
        ((uj) this).field_k = (kf) (Object) param0;
        ((uj) this).field_y = param0.field_n;
        ((uj) this).field_u = param0.field_l;
        ((uj) this).field_s = param0.field_j;
        ((uj) this).field_m = param1;
        ((uj) this).field_n = param2;
        ((uj) this).field_p = 8192;
        ((uj) this).field_o = 0;
        this.l();
    }

    private uj(je param0, int param1, int param2, int param3) {
        ((uj) this).field_k = (kf) (Object) param0;
        ((uj) this).field_y = param0.field_n;
        ((uj) this).field_u = param0.field_l;
        ((uj) this).field_s = param0.field_j;
        ((uj) this).field_m = param1;
        ((uj) this).field_n = param2;
        ((uj) this).field_p = param3;
        ((uj) this).field_o = 0;
        this.l();
    }
}
