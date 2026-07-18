/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends nm {
    private int field_p;
    private int field_v;
    private int field_w;
    private int field_o;
    private int field_r;
    private int field_B;
    private int field_t;
    private int field_z;
    private int field_q;
    private int field_A;
    private int field_s;
    private int field_u;
    private int field_x;
    private boolean field_n;
    private int field_y;

    final synchronized void h(int param0) {
        this.d(param0, ((na) this).l());
    }

    final synchronized void a(boolean param0) {
        ((na) this).field_s = (((na) this).field_s ^ ((na) this).field_s >> 31) + (((na) this).field_s >>> 31);
        if (param0) {
          ((na) this).field_s = -((na) this).field_s;
          return;
        } else {
          return;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, na param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_w * param5;
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
                param13.field_p = param13.field_p + param13.field_w * param5;
                param13.field_z = param6;
                param13.field_u = param7;
                param13.field_r = param4;
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

    final nm a() {
        return null;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, na param10) {
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
                param10.field_r = param3 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, na param10, int param11, int param12) {
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
                param10.field_r = param4;
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

    private final void i() {
        if (((na) this).field_B != 0) {
            if (((na) this).field_o == -2147483648) {
                ((na) this).field_o = 0;
            }
            ((na) this).field_B = 0;
            this.f();
            return;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, na param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_w * param5;
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
                param13.field_p = param13.field_p + param13.field_w * param5;
                param13.field_z = param6;
                param13.field_u = param7;
                param13.field_r = param4;
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

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final static na a(lm param0, int param1, int param2) {
        if (param0.field_m != null) {
          if (param0.field_m.length == 0) {
            return null;
          } else {
            return new na(param0, (int)((long)param0.field_n * 256L * 100L / (long)(100 * md.field_l)), 6144);
          }
        } else {
          return null;
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((na) this).field_z == 0) {
            if (((na) this).field_u == 0) {
              ((na) this).field_B = 0;
              ((na) this).field_o = 0;
              ((na) this).field_p = 0;
              ((na) this).c(-2193);
              return;
            } else {
              L0: {
                var2 = -((na) this).field_p;
                if (((na) this).field_p <= var2) {
                  break L0;
                } else {
                  var2 = ((na) this).field_p;
                  break L0;
                }
              }
              L1: {
                if (-((na) this).field_z <= var2) {
                  break L1;
                } else {
                  var2 = -((na) this).field_z;
                  break L1;
                }
              }
              L2: {
                if (((na) this).field_z <= var2) {
                  break L2;
                } else {
                  var2 = ((na) this).field_z;
                  break L2;
                }
              }
              L3: {
                if (-((na) this).field_u <= var2) {
                  break L3;
                } else {
                  var2 = -((na) this).field_u;
                  break L3;
                }
              }
              L4: {
                if (((na) this).field_u <= var2) {
                  break L4;
                } else {
                  var2 = ((na) this).field_u;
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
              ((na) this).field_B = param0;
              ((na) this).field_o = -2147483648;
              ((na) this).field_w = -((na) this).field_p / param0;
              ((na) this).field_x = -((na) this).field_z / param0;
              ((na) this).field_y = -((na) this).field_u / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((na) this).field_p;
              if (((na) this).field_p <= var2) {
                break L6;
              } else {
                var2 = ((na) this).field_p;
                break L6;
              }
            }
            L7: {
              if (-((na) this).field_z <= var2) {
                break L7;
              } else {
                var2 = -((na) this).field_z;
                break L7;
              }
            }
            L8: {
              if (((na) this).field_z <= var2) {
                break L8;
              } else {
                var2 = ((na) this).field_z;
                break L8;
              }
            }
            L9: {
              if (-((na) this).field_u <= var2) {
                break L9;
              } else {
                var2 = -((na) this).field_u;
                break L9;
              }
            }
            L10: {
              if (((na) this).field_u <= var2) {
                break L10;
              } else {
                var2 = ((na) this).field_u;
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
            ((na) this).field_B = param0;
            ((na) this).field_o = -2147483648;
            ((na) this).field_w = -((na) this).field_p / param0;
            ((na) this).field_x = -((na) this).field_z / param0;
            ((na) this).field_y = -((na) this).field_u / param0;
            return;
          }
        } else {
          ((na) this).h(0);
          ((na) this).c(-2193);
          return;
        }
    }

    final synchronized boolean h() {
        return ((na) this).field_r < 0 || ((na) this).field_r >= ((lm) (Object) ((na) this).field_l).field_m.length << 8;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((na) this).field_B <= 0) {
            L1: {
              if (((na) this).field_s != 256) {
                break L1;
              } else {
                if ((((na) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (md.field_q) {
                    return na.b(0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, 0, param3, param2, (na) this);
                  } else {
                    return na.a(((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, 0, param3, param2, (na) this);
                  }
                }
              }
            }
            if (md.field_q) {
              return na.d(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, 0, param3, param2, (na) this, ((na) this).field_s, param4);
            } else {
              return na.b(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, 0, param3, param2, (na) this, ((na) this).field_s, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((na) this).field_B;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((na) this).field_B = ((na) this).field_B + param1;
                if (((na) this).field_s != 256) {
                  break L4;
                } else {
                  if ((((na) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!md.field_q) {
                      param1 = na.a(((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, ((na) this).field_w, 0, var6, param2, (na) this);
                      break L3;
                    } else {
                      param1 = na.b(0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, ((na) this).field_x, ((na) this).field_y, 0, var6, param2, (na) this);
                      break L3;
                    }
                  }
                }
              }
              if (!md.field_q) {
                param1 = na.c(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, ((na) this).field_w, 0, var6, param2, (na) this, ((na) this).field_s, param4);
                break L3;
              } else {
                param1 = na.a(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, ((na) this).field_x, ((na) this).field_y, 0, var6, param2, (na) this, ((na) this).field_s, param4);
                break L3;
              }
            }
            ((na) this).field_B = ((na) this).field_B - param1;
            if (((na) this).field_B == 0) {
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

    private final synchronized void d(int param0, int param1) {
        ((na) this).field_o = param0;
        ((na) this).field_A = param1;
        ((na) this).field_B = 0;
        this.f();
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((na) this).field_B <= 0) {
            L1: {
              if (((na) this).field_s != -256) {
                break L1;
              } else {
                if ((((na) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (md.field_q) {
                    return na.a(0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, 0, param3, param2, (na) this);
                  } else {
                    return na.b(((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, 0, param3, param2, (na) this);
                  }
                }
              }
            }
            if (md.field_q) {
              return na.b(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, 0, param3, param2, (na) this, ((na) this).field_s, param4);
            } else {
              return na.a(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, 0, param3, param2, (na) this, ((na) this).field_s, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((na) this).field_B;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((na) this).field_B = ((na) this).field_B + param1;
                if (((na) this).field_s != -256) {
                  break L4;
                } else {
                  if ((((na) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!md.field_q) {
                      param1 = na.b(((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, ((na) this).field_w, 0, var6, param2, (na) this);
                      break L3;
                    } else {
                      param1 = na.a(0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, ((na) this).field_x, ((na) this).field_y, 0, var6, param2, (na) this);
                      break L3;
                    }
                  }
                }
              }
              if (!md.field_q) {
                param1 = na.a(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_p, ((na) this).field_w, 0, var6, param2, (na) this, ((na) this).field_s, param4);
                break L3;
              } else {
                param1 = na.b(0, 0, ((lm) (Object) ((na) this).field_l).field_m, param0, ((na) this).field_r, param1, ((na) this).field_z, ((na) this).field_u, ((na) this).field_x, ((na) this).field_y, 0, var6, param2, (na) this, ((na) this).field_s, param4);
                break L3;
              }
            }
            ((na) this).field_B = ((na) this).field_B - param1;
            if (((na) this).field_B == 0) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, na param10, int param11, int param12) {
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
                param10.field_r = param4;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, na param12) {
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
        param12.field_p = param12.field_p + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_z = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_r = param3 << 8;
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

    final synchronized int k() {
        return ((na) this).field_s < 0 ? -((na) this).field_s : ((na) this).field_s;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, na param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_z = param11.field_z - param11.field_x * param5;
            param11.field_u = param11.field_u - param11.field_y * param5;
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
                param11.field_z = param11.field_z + param11.field_x * param5;
                param11.field_u = param11.field_u + param11.field_y * param5;
                param11.field_p = param6;
                param11.field_r = param4;
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

    final synchronized int l() {
        return ((na) this).field_A < 0 ? -1 : ((na) this).field_A;
    }

    final synchronized void a(int param0) {
        lm var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((na) this).field_B <= 0) {
            break L0;
          } else {
            if (param0 < ((na) this).field_B) {
              ((na) this).field_p = ((na) this).field_p + ((na) this).field_w * param0;
              ((na) this).field_z = ((na) this).field_z + ((na) this).field_x * param0;
              ((na) this).field_u = ((na) this).field_u + ((na) this).field_y * param0;
              ((na) this).field_B = ((na) this).field_B - param0;
              break L0;
            } else {
              L1: {
                if (((na) this).field_o != -2147483648) {
                  break L1;
                } else {
                  ((na) this).field_o = 0;
                  ((na) this).field_u = 0;
                  ((na) this).field_z = 0;
                  ((na) this).field_p = 0;
                  ((na) this).c(-2193);
                  param0 = ((na) this).field_B;
                  break L1;
                }
              }
              ((na) this).field_B = 0;
              this.f();
              break L0;
            }
          }
        }
        L2: {
          var2 = (lm) (Object) ((na) this).field_l;
          var3 = ((na) this).field_t << 8;
          var4 = ((na) this).field_q << 8;
          var5 = var2.field_m.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((na) this).field_v = 0;
            break L2;
          }
        }
        L3: {
          if (((na) this).field_r >= 0) {
            break L3;
          } else {
            if (((na) this).field_s <= 0) {
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              ((na) this).field_r = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((na) this).field_r < var5) {
            break L4;
          } else {
            if (((na) this).field_s >= 0) {
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              ((na) this).field_r = var5 - 1;
              break L4;
            }
          }
        }
        ((na) this).field_r = ((na) this).field_r + ((na) this).field_s * param0;
        if (((na) this).field_v >= 0) {
          L5: {
            if (((na) this).field_v <= 0) {
              break L5;
            } else {
              if (!((na) this).field_n) {
                L6: {
                  if (((na) this).field_s >= 0) {
                    if (((na) this).field_r >= var4) {
                      var7 = (((na) this).field_r - var3) / var6;
                      if (var7 < ((na) this).field_v) {
                        ((na) this).field_r = ((na) this).field_r - var6 * var7;
                        ((na) this).field_v = ((na) this).field_v - var7;
                        break L6;
                      } else {
                        ((na) this).field_r = ((na) this).field_r - var6 * ((na) this).field_v;
                        ((na) this).field_v = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((na) this).field_r < var3) {
                      var7 = (var4 - 1 - ((na) this).field_r) / var6;
                      if (var7 < ((na) this).field_v) {
                        ((na) this).field_r = ((na) this).field_r + var6 * var7;
                        ((na) this).field_v = ((na) this).field_v - var7;
                        break L6;
                      } else {
                        ((na) this).field_r = ((na) this).field_r + var6 * ((na) this).field_v;
                        ((na) this).field_v = 0;
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
                  if (((na) this).field_s >= 0) {
                    break L7;
                  } else {
                    if (((na) this).field_r < var3) {
                      ((na) this).field_r = var3 + var3 - 1 - ((na) this).field_r;
                      ((na) this).field_s = -((na) this).field_s;
                      int fieldTemp$3 = ((na) this).field_v - 1;
                      ((na) this).field_v = ((na) this).field_v - 1;
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
                  if (((na) this).field_r >= var4) {
                    ((na) this).field_r = var4 + var4 - 1 - ((na) this).field_r;
                    ((na) this).field_s = -((na) this).field_s;
                    int fieldTemp$4 = ((na) this).field_v - 1;
                    ((na) this).field_v = ((na) this).field_v - 1;
                    if (fieldTemp$4 != 0) {
                      if (((na) this).field_r < var3) {
                        ((na) this).field_r = var3 + var3 - 1 - ((na) this).field_r;
                        ((na) this).field_s = -((na) this).field_s;
                        int fieldTemp$5 = ((na) this).field_v - 1;
                        ((na) this).field_v = ((na) this).field_v - 1;
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
          if (((na) this).field_s < 0) {
            if (((na) this).field_r < 0) {
              ((na) this).field_r = -1;
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((na) this).field_r < var5) {
                break L9;
              } else {
                ((na) this).field_r = var5;
                this.i();
                ((na) this).c(-2193);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((na) this).field_n) {
            if (((na) this).field_s >= 0) {
              if (((na) this).field_r < var4) {
                return;
              } else {
                ((na) this).field_r = var3 + (((na) this).field_r - var3) % var6;
                return;
              }
            } else {
              if (((na) this).field_r < var3) {
                ((na) this).field_r = var4 - 1 - (var4 - 1 - ((na) this).field_r) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((na) this).field_s >= 0) {
                break L10;
              } else {
                if (((na) this).field_r < var3) {
                  ((na) this).field_r = var3 + var3 - 1 - ((na) this).field_r;
                  ((na) this).field_s = -((na) this).field_s;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((na) this).field_r >= var4) {
                ((na) this).field_r = var4 + var4 - 1 - ((na) this).field_r;
                ((na) this).field_s = -((na) this).field_s;
                if (((na) this).field_r < var3) {
                  ((na) this).field_r = var3 + var3 - 1 - ((na) this).field_r;
                  ((na) this).field_s = -((na) this).field_s;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, na param9) {
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
        param9.field_z = param9.field_z + param9.field_x * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_r = param2 << 8;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, na param8) {
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
        param8.field_r = param2 << 8;
        return param3;
    }

    private final void f() {
        ((na) this).field_p = ((na) this).field_o;
        ((na) this).field_z = na.a(((na) this).field_o, ((na) this).field_A);
        ((na) this).field_u = na.c(((na) this).field_o, ((na) this).field_A);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, na param10) {
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
                param10.field_r = param3 << 8;
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

    final synchronized void a(int[] param0, int param1, int param2) {
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((na) this).field_o != 0) {
            break L0;
          } else {
            if (((na) this).field_B != 0) {
              break L0;
            } else {
              ((na) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (lm) (Object) ((na) this).field_l;
          var5 = ((na) this).field_t << 8;
          var6 = ((na) this).field_q << 8;
          var7 = var4.field_m.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((na) this).field_v = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((na) this).field_r >= 0) {
            break L2;
          } else {
            if (((na) this).field_s <= 0) {
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              ((na) this).field_r = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((na) this).field_r < var7) {
            break L3;
          } else {
            if (((na) this).field_s >= 0) {
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              ((na) this).field_r = var7 - 1;
              break L3;
            }
          }
        }
        if (((na) this).field_v >= 0) {
          L4: {
            if (((na) this).field_v <= 0) {
              break L4;
            } else {
              if (!((na) this).field_n) {
                if (((na) this).field_s >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_m[((na) this).field_t]);
                    if (((na) this).field_r >= var6) {
                      var10 = (((na) this).field_r - var5) / var8;
                      if (var10 < ((na) this).field_v) {
                        ((na) this).field_r = ((na) this).field_r - var8 * var10;
                        ((na) this).field_v = ((na) this).field_v - var10;
                        continue L5;
                      } else {
                        ((na) this).field_r = ((na) this).field_r - var8 * ((na) this).field_v;
                        ((na) this).field_v = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_q - 1]);
                    if (((na) this).field_r < var5) {
                      var10 = (var6 - 1 - ((na) this).field_r) / var8;
                      if (var10 < ((na) this).field_v) {
                        ((na) this).field_r = ((na) this).field_r + var8 * var10;
                        ((na) this).field_v = ((na) this).field_v - var10;
                        continue L6;
                      } else {
                        ((na) this).field_r = ((na) this).field_r + var8 * ((na) this).field_v;
                        ((na) this).field_v = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((na) this).field_s >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_t]);
                    if (((na) this).field_r < var5) {
                      ((na) this).field_r = var5 + var5 - 1 - ((na) this).field_r;
                      ((na) this).field_s = -((na) this).field_s;
                      int fieldTemp$5 = ((na) this).field_v - 1;
                      ((na) this).field_v = ((na) this).field_v - 1;
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_m[((na) this).field_q - 1]);
                  if (((na) this).field_r >= var6) {
                    ((na) this).field_r = var6 + var6 - 1 - ((na) this).field_r;
                    ((na) this).field_s = -((na) this).field_s;
                    int fieldTemp$6 = ((na) this).field_v - 1;
                    ((na) this).field_v = ((na) this).field_v - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_t]);
                      if (((na) this).field_r < var5) {
                        ((na) this).field_r = var5 + var5 - 1 - ((na) this).field_r;
                        ((na) this).field_s = -((na) this).field_s;
                        int fieldTemp$7 = ((na) this).field_v - 1;
                        ((na) this).field_v = ((na) this).field_v - 1;
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
          if (((na) this).field_s < 0) {
            int discarded$8 = this.b(param0, var9, 0, param2, 0);
            if (((na) this).field_r < 0) {
              ((na) this).field_r = -1;
              this.i();
              ((na) this).c(-2193);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.a(param0, var9, var7, param2, 0);
              if (((na) this).field_r < var7) {
                break L9;
              } else {
                ((na) this).field_r = var7;
                this.i();
                ((na) this).c(-2193);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((na) this).field_n) {
            if (((na) this).field_s >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_m[((na) this).field_t]);
                if (((na) this).field_r >= var6) {
                  ((na) this).field_r = var5 + (((na) this).field_r - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_q - 1]);
                if (((na) this).field_r < var5) {
                  ((na) this).field_r = var6 - 1 - (var6 - 1 - ((na) this).field_r) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((na) this).field_s >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_t]);
                if (((na) this).field_r < var5) {
                  ((na) this).field_r = var5 + var5 - 1 - ((na) this).field_r;
                  ((na) this).field_s = -((na) this).field_s;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_m[((na) this).field_q - 1]);
              if (((na) this).field_r >= var6) {
                ((na) this).field_r = var6 + var6 - 1 - ((na) this).field_r;
                ((na) this).field_s = -((na) this).field_s;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_m[((na) this).field_t]);
                if (((na) this).field_r < var5) {
                  ((na) this).field_r = var5 + var5 - 1 - ((na) this).field_r;
                  ((na) this).field_s = -((na) this).field_s;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, na param11, int param12, int param13) {
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
                param11.field_r = param4;
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

    private final boolean e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((na) this).field_o;
          if (var1 != -2147483648) {
            var2 = na.a(var1, ((na) this).field_A);
            var3 = na.c(var1, ((na) this).field_A);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((na) this).field_p != var1) {
            break L1;
          } else {
            if (((na) this).field_z != var2) {
              break L1;
            } else {
              if (((na) this).field_u == var3) {
                if (((na) this).field_o == -2147483648) {
                  ((na) this).field_o = 0;
                  ((na) this).field_u = 0;
                  ((na) this).field_z = 0;
                  ((na) this).field_p = 0;
                  ((na) this).c(-2193);
                  return true;
                } else {
                  this.f();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((na) this).field_p >= var1) {
            if (((na) this).field_p <= var1) {
              ((na) this).field_w = 0;
              break L2;
            } else {
              ((na) this).field_w = -1;
              ((na) this).field_B = ((na) this).field_p - var1;
              break L2;
            }
          } else {
            ((na) this).field_w = 1;
            ((na) this).field_B = var1 - ((na) this).field_p;
            break L2;
          }
        }
        L3: {
          if (((na) this).field_z >= var2) {
            if (((na) this).field_z <= var2) {
              ((na) this).field_x = 0;
              break L3;
            } else {
              L4: {
                ((na) this).field_x = -1;
                if (((na) this).field_B == 0) {
                  break L4;
                } else {
                  if (((na) this).field_B <= ((na) this).field_z - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((na) this).field_B = ((na) this).field_z - var2;
              break L3;
            }
          } else {
            L5: {
              ((na) this).field_x = 1;
              if (((na) this).field_B == 0) {
                break L5;
              } else {
                if (((na) this).field_B <= var2 - ((na) this).field_z) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((na) this).field_B = var2 - ((na) this).field_z;
            break L3;
          }
        }
        if (((na) this).field_u < var3) {
          ((na) this).field_y = 1;
          if (((na) this).field_B != 0) {
            if (((na) this).field_B > var3 - ((na) this).field_u) {
              ((na) this).field_B = var3 - ((na) this).field_u;
              return false;
            } else {
              return false;
            }
          } else {
            ((na) this).field_B = var3 - ((na) this).field_u;
            return false;
          }
        } else {
          L6: {
            if (((na) this).field_u <= var3) {
              ((na) this).field_y = 0;
              break L6;
            } else {
              L7: {
                ((na) this).field_y = -1;
                if (((na) this).field_B == 0) {
                  break L7;
                } else {
                  if (((na) this).field_B <= ((na) this).field_u - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((na) this).field_B = ((na) this).field_u - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized int j() {
        return ((na) this).field_o == -2147483648 ? 0 : ((na) this).field_o;
    }

    final synchronized void e(int param0) {
        int var2 = ((lm) (Object) ((na) this).field_l).field_m.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((na) this).field_r = param0;
    }

    final synchronized boolean g() {
        return ((na) this).field_B != 0;
    }

    final int c() {
        int var1 = ((na) this).field_p * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((na) this).field_v == 0) {
            var1 = var1 - var1 * ((na) this).field_r / (((lm) (Object) ((na) this).field_l).field_m.length << 8);
        } else {
            if (((na) this).field_v >= 0) {
                var1 = var1 - var1 * ((na) this).field_t / ((lm) (Object) ((na) this).field_l).field_m.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void b(int param0, int param1) {
        ((na) this).a(param0, param1, ((na) this).l());
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, na param9) {
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
        param9.field_z = param9.field_z + param9.field_x * (param6 - param3);
        param9.field_u = param9.field_u + param9.field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_r = param2 << 8;
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

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, na param12) {
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
        param12.field_p = param12.field_p + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_z = param5 >> 2;
                param12.field_u = param6 >> 2;
                param12.field_r = param3 << 8;
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

    final synchronized void f(int param0) {
        ((na) this).field_v = param0;
    }

    final nm b() {
        return null;
    }

    final int d() {
        if (((na) this).field_o == 0) {
            if (((na) this).field_B == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, na param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_z = param11.field_z - param11.field_x * param5;
            param11.field_u = param11.field_u - param11.field_y * param5;
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
                param11.field_z = param11.field_z + param11.field_x * param5;
                param11.field_u = param11.field_u + param11.field_y * param5;
                param11.field_p = param6;
                param11.field_r = param4;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, na param8) {
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
        param8.field_r = param2 << 8;
        return param3;
    }

    final synchronized void g(int param0) {
        if (((na) this).field_s < 0) {
            ((na) this).field_s = -param0;
        } else {
            ((na) this).field_s = param0;
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, na param11, int param12, int param13) {
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
                param11.field_r = param4;
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

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = na.a(param1, param2);
          var5 = na.c(param1, param2);
          if (((na) this).field_z == var4) {
            if (((na) this).field_u == var5) {
              ((na) this).field_B = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((na) this).field_p;
                if (((na) this).field_p - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((na) this).field_p - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((na) this).field_z <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((na) this).field_z;
                  break L1;
                }
              }
              L2: {
                if (((na) this).field_z - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((na) this).field_z - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((na) this).field_u <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((na) this).field_u;
                  break L3;
                }
              }
              L4: {
                if (((na) this).field_u - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((na) this).field_u - var5;
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
              ((na) this).field_B = param0;
              ((na) this).field_o = param1;
              ((na) this).field_A = param2;
              ((na) this).field_w = (param1 - ((na) this).field_p) / param0;
              ((na) this).field_x = (var4 - ((na) this).field_z) / param0;
              ((na) this).field_y = (var5 - ((na) this).field_u) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((na) this).field_p;
              if (((na) this).field_p - param1 <= var6) {
                break L6;
              } else {
                var6 = ((na) this).field_p - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((na) this).field_z <= var6) {
                break L7;
              } else {
                var6 = var4 - ((na) this).field_z;
                break L7;
              }
            }
            L8: {
              if (((na) this).field_z - var4 <= var6) {
                break L8;
              } else {
                var6 = ((na) this).field_z - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((na) this).field_u <= var6) {
                break L9;
              } else {
                var6 = var5 - ((na) this).field_u;
                break L9;
              }
            }
            L10: {
              if (((na) this).field_u - var5 <= var6) {
                break L10;
              } else {
                var6 = ((na) this).field_u - var5;
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
            ((na) this).field_B = param0;
            ((na) this).field_o = param1;
            ((na) this).field_A = param2;
            ((na) this).field_w = (param1 - ((na) this).field_p) / param0;
            ((na) this).field_x = (var4 - ((na) this).field_z) / param0;
            ((na) this).field_y = (var5 - ((na) this).field_u) / param0;
            return;
          }
        } else {
          this.d(param1, param2);
          return;
        }
    }

    final static na a(lm param0, int param1, int param2, int param3) {
        if (param0.field_m != null) {
          if (param0.field_m.length == 0) {
            return null;
          } else {
            return new na(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private na(lm param0, int param1, int param2) {
        ((na) this).field_l = (pb) (Object) param0;
        ((na) this).field_t = param0.field_k;
        ((na) this).field_q = param0.field_l;
        ((na) this).field_n = param0.field_o;
        ((na) this).field_s = param1;
        ((na) this).field_o = param2;
        ((na) this).field_A = 8192;
        ((na) this).field_r = 0;
        this.f();
    }

    private na(lm param0, int param1, int param2, int param3) {
        ((na) this).field_l = (pb) (Object) param0;
        ((na) this).field_t = param0.field_k;
        ((na) this).field_q = param0.field_l;
        ((na) this).field_n = param0.field_o;
        ((na) this).field_s = param1;
        ((na) this).field_o = param2;
        ((na) this).field_A = param3;
        ((na) this).field_r = 0;
        this.f();
    }
}
