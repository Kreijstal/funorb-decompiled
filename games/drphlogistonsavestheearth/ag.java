/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends ic {
    private int field_o;
    private int field_l;
    private int field_q;
    private int field_x;
    private int field_r;
    private int field_u;
    private int field_m;
    private int field_t;
    private int field_w;
    private boolean field_y;
    private int field_v;
    private int field_z;
    private int field_p;
    private int field_s;
    private int field_n;

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, ag param12) {
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
        param12.field_t = param12.field_t + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_x = param5 >> 2;
                param12.field_m = param6 >> 2;
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

    final synchronized void i(int param0) {
        param0 = param0 << 8;
        int var2 = ((vk) (Object) ((ag) this).field_i).field_i.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((ag) this).field_o = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, ag param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_x = param11.field_x - param11.field_s * param5;
            param11.field_m = param11.field_m - param11.field_z * param5;
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
                param11.field_x = param11.field_x + param11.field_s * param5;
                param11.field_m = param11.field_m + param11.field_z * param5;
                param11.field_t = param6;
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

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, ag param11, int param12, int param13) {
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

    final synchronized boolean g() {
        return ((ag) this).field_n != 0;
    }

    final static ag b(vk param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new ag(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ag param9) {
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
        param9.field_x = param9.field_x + param9.field_s * (param6 - param3);
        param9.field_m = param9.field_m + param9.field_z * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_t = param4 >> 2;
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

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = ag.a(param1, param2);
          var5 = ag.b(param1, param2);
          if (((ag) this).field_x == var4) {
            if (((ag) this).field_m == var5) {
              ((ag) this).field_n = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((ag) this).field_t;
                if (((ag) this).field_t - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((ag) this).field_t - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((ag) this).field_x <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((ag) this).field_x;
                  break L1;
                }
              }
              L2: {
                if (((ag) this).field_x - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((ag) this).field_x - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((ag) this).field_m <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((ag) this).field_m;
                  break L3;
                }
              }
              L4: {
                if (((ag) this).field_m - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((ag) this).field_m - var5;
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
              ((ag) this).field_n = param0;
              ((ag) this).field_l = param1;
              ((ag) this).field_q = param2;
              ((ag) this).field_w = (param1 - ((ag) this).field_t) / param0;
              ((ag) this).field_s = (var4 - ((ag) this).field_x) / param0;
              ((ag) this).field_z = (var5 - ((ag) this).field_m) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((ag) this).field_t;
              if (((ag) this).field_t - param1 <= var6) {
                break L6;
              } else {
                var6 = ((ag) this).field_t - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((ag) this).field_x <= var6) {
                break L7;
              } else {
                var6 = var4 - ((ag) this).field_x;
                break L7;
              }
            }
            L8: {
              if (((ag) this).field_x - var4 <= var6) {
                break L8;
              } else {
                var6 = ((ag) this).field_x - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((ag) this).field_m <= var6) {
                break L9;
              } else {
                var6 = var5 - ((ag) this).field_m;
                break L9;
              }
            }
            L10: {
              if (((ag) this).field_m - var5 <= var6) {
                break L10;
              } else {
                var6 = ((ag) this).field_m - var5;
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
            ((ag) this).field_n = param0;
            ((ag) this).field_l = param1;
            ((ag) this).field_q = param2;
            ((ag) this).field_w = (param1 - ((ag) this).field_t) / param0;
            ((ag) this).field_s = (var4 - ((ag) this).field_x) / param0;
            ((ag) this).field_z = (var5 - ((ag) this).field_m) / param0;
            return;
          }
        } else {
          this.d(param1, param2);
          return;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final static ag b(vk param0) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new ag(param0, (int)((long)param0.field_j * 256L * 100L / (long)(100 * id.field_d)), 6144);
          }
        } else {
          return null;
        }
    }

    final synchronized int j() {
        return ((ag) this).field_u < 0 ? -((ag) this).field_u : ((ag) this).field_u;
    }

    final synchronized boolean m() {
        return ((ag) this).field_o < 0 || ((ag) this).field_o >= ((vk) (Object) ((ag) this).field_i).field_i.length << 8;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, ag param11, int param12, int param13) {
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

    final synchronized void l(int param0) {
        this.d(((ag) this).e(), param0 << 6);
    }

    final synchronized int f() {
        return ((ag) this).field_o >> 8;
    }

    private final boolean l() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((ag) this).field_l;
          if (var1 != -2147483648) {
            var2 = ag.a(var1, ((ag) this).field_q);
            var3 = ag.b(var1, ((ag) this).field_q);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((ag) this).field_t != var1) {
            break L1;
          } else {
            if (((ag) this).field_x != var2) {
              break L1;
            } else {
              if (((ag) this).field_m == var3) {
                if (((ag) this).field_l == -2147483648) {
                  ((ag) this).field_l = 0;
                  ((ag) this).field_m = 0;
                  ((ag) this).field_x = 0;
                  ((ag) this).field_t = 0;
                  ((ag) this).a(-16175);
                  return true;
                } else {
                  this.k();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((ag) this).field_t >= var1) {
            if (((ag) this).field_t <= var1) {
              ((ag) this).field_w = 0;
              break L2;
            } else {
              ((ag) this).field_w = -1;
              ((ag) this).field_n = ((ag) this).field_t - var1;
              break L2;
            }
          } else {
            ((ag) this).field_w = 1;
            ((ag) this).field_n = var1 - ((ag) this).field_t;
            break L2;
          }
        }
        L3: {
          if (((ag) this).field_x >= var2) {
            if (((ag) this).field_x <= var2) {
              ((ag) this).field_s = 0;
              break L3;
            } else {
              L4: {
                ((ag) this).field_s = -1;
                if (((ag) this).field_n == 0) {
                  break L4;
                } else {
                  if (((ag) this).field_n <= ((ag) this).field_x - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((ag) this).field_n = ((ag) this).field_x - var2;
              break L3;
            }
          } else {
            L5: {
              ((ag) this).field_s = 1;
              if (((ag) this).field_n == 0) {
                break L5;
              } else {
                if (((ag) this).field_n <= var2 - ((ag) this).field_x) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((ag) this).field_n = var2 - ((ag) this).field_x;
            break L3;
          }
        }
        if (((ag) this).field_m < var3) {
          ((ag) this).field_z = 1;
          if (((ag) this).field_n != 0) {
            if (((ag) this).field_n > var3 - ((ag) this).field_m) {
              ((ag) this).field_n = var3 - ((ag) this).field_m;
              return false;
            } else {
              return false;
            }
          } else {
            ((ag) this).field_n = var3 - ((ag) this).field_m;
            return false;
          }
        } else {
          L6: {
            if (((ag) this).field_m <= var3) {
              ((ag) this).field_z = 0;
              break L6;
            } else {
              L7: {
                ((ag) this).field_z = -1;
                if (((ag) this).field_n == 0) {
                  break L7;
                } else {
                  if (((ag) this).field_n <= ((ag) this).field_m - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((ag) this).field_n = ((ag) this).field_m - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized void a(boolean param0) {
        ((ag) this).field_u = (((ag) this).field_u ^ ((ag) this).field_u >> 31) + (((ag) this).field_u >>> 31);
        if (param0) {
          ((ag) this).field_u = -((ag) this).field_u;
          return;
        } else {
          return;
        }
    }

    final synchronized void e(int param0) {
        this.d(param0, ((ag) this).h());
    }

    final static ag a(vk param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new ag(param0, (int)((long)param0.field_j * 256L * 100L / (long)(100 * id.field_d)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ag param9) {
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
        param9.field_x = param9.field_x + param9.field_s * (param6 - param3);
        param9.field_m = param9.field_m + param9.field_z * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_t = param4 >> 2;
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

    final int d() {
        if (((ag) this).field_l == 0) {
            if (((ag) this).field_n == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized int e() {
        return ((ag) this).field_l == -2147483648 ? 0 : ((ag) this).field_l;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, ag param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_t = param13.field_t - param13.field_w * param5;
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
                param13.field_t = param13.field_t + param13.field_w * param5;
                param13.field_x = param6;
                param13.field_m = param7;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((ag) this).field_n <= 0) {
            L1: {
              if (((ag) this).field_u != 256) {
                break L1;
              } else {
                if ((((ag) this).field_o & 255) != 0) {
                  break L1;
                } else {
                  if (id.field_f) {
                    return ag.a(0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, 0, param3, param2, (ag) this);
                  } else {
                    return ag.b(((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, 0, param3, param2, (ag) this);
                  }
                }
              }
            }
            if (id.field_f) {
              return ag.c(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, 0, param3, param2, (ag) this, ((ag) this).field_u, param4);
            } else {
              return ag.b(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, 0, param3, param2, (ag) this, ((ag) this).field_u, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((ag) this).field_n;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((ag) this).field_n = ((ag) this).field_n + param1;
                if (((ag) this).field_u != 256) {
                  break L4;
                } else {
                  if ((((ag) this).field_o & 255) != 0) {
                    break L4;
                  } else {
                    if (!id.field_f) {
                      param1 = ag.a(((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, ((ag) this).field_w, 0, var6, param2, (ag) this);
                      break L3;
                    } else {
                      param1 = ag.b(0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, ((ag) this).field_s, ((ag) this).field_z, 0, var6, param2, (ag) this);
                      break L3;
                    }
                  }
                }
              }
              if (!id.field_f) {
                param1 = ag.d(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, ((ag) this).field_w, 0, var6, param2, (ag) this, ((ag) this).field_u, param4);
                break L3;
              } else {
                param1 = ag.a(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, ((ag) this).field_s, ((ag) this).field_z, 0, var6, param2, (ag) this, ((ag) this).field_u, param4);
                break L3;
              }
            }
            ((ag) this).field_n = ((ag) this).field_n - param1;
            if (((ag) this).field_n == 0) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, ag param10) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, ag param10, int param11, int param12) {
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

    final synchronized void h(int param0) {
        if (((ag) this).field_u < 0) {
            ((ag) this).field_u = -param0;
        } else {
            ((ag) this).field_u = param0;
        }
    }

    final int b() {
        int var1 = ((ag) this).field_t * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((ag) this).field_r == 0) {
            var1 = var1 - var1 * ((ag) this).field_o / (((vk) (Object) ((ag) this).field_i).field_i.length << 8);
        } else {
            if (((ag) this).field_r >= 0) {
                var1 = var1 - var1 * ((ag) this).field_v / ((vk) (Object) ((ag) this).field_i).field_i.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, ag param12) {
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
        param12.field_t = param12.field_t + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_x = param5 >> 2;
                param12.field_m = param6 >> 2;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, ag param8) {
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, ag param10, int param11, int param12) {
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

    final synchronized void b(int[] param0, int param1, int param2) {
        vk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((ag) this).field_l != 0) {
            break L0;
          } else {
            if (((ag) this).field_n != 0) {
              break L0;
            } else {
              ((ag) this).d(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (vk) (Object) ((ag) this).field_i;
          var5 = ((ag) this).field_v << 8;
          var6 = ((ag) this).field_p << 8;
          var7 = var4.field_i.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((ag) this).field_r = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((ag) this).field_o >= 0) {
            break L2;
          } else {
            if (((ag) this).field_u <= 0) {
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              ((ag) this).field_o = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((ag) this).field_o < var7) {
            break L3;
          } else {
            if (((ag) this).field_u >= 0) {
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              ((ag) this).field_o = var7 - 1;
              break L3;
            }
          }
        }
        if (((ag) this).field_r >= 0) {
          L4: {
            if (((ag) this).field_r <= 0) {
              break L4;
            } else {
              if (!((ag) this).field_y) {
                if (((ag) this).field_u >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((ag) this).field_v]);
                    if (((ag) this).field_o >= var6) {
                      var10 = (((ag) this).field_o - var5) / var8;
                      if (var10 < ((ag) this).field_r) {
                        ((ag) this).field_o = ((ag) this).field_o - var8 * var10;
                        ((ag) this).field_r = ((ag) this).field_r - var10;
                        continue L5;
                      } else {
                        ((ag) this).field_o = ((ag) this).field_o - var8 * ((ag) this).field_r;
                        ((ag) this).field_r = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_p - 1]);
                    if (((ag) this).field_o < var5) {
                      var10 = (var6 - 1 - ((ag) this).field_o) / var8;
                      if (var10 < ((ag) this).field_r) {
                        ((ag) this).field_o = ((ag) this).field_o + var8 * var10;
                        ((ag) this).field_r = ((ag) this).field_r - var10;
                        continue L6;
                      } else {
                        ((ag) this).field_o = ((ag) this).field_o + var8 * ((ag) this).field_r;
                        ((ag) this).field_r = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((ag) this).field_u >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_v]);
                    if (((ag) this).field_o < var5) {
                      ((ag) this).field_o = var5 + var5 - 1 - ((ag) this).field_o;
                      ((ag) this).field_u = -((ag) this).field_u;
                      int fieldTemp$5 = ((ag) this).field_r - 1;
                      ((ag) this).field_r = ((ag) this).field_r - 1;
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((ag) this).field_p - 1]);
                  if (((ag) this).field_o >= var6) {
                    ((ag) this).field_o = var6 + var6 - 1 - ((ag) this).field_o;
                    ((ag) this).field_u = -((ag) this).field_u;
                    int fieldTemp$6 = ((ag) this).field_r - 1;
                    ((ag) this).field_r = ((ag) this).field_r - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_v]);
                      if (((ag) this).field_o < var5) {
                        ((ag) this).field_o = var5 + var5 - 1 - ((ag) this).field_o;
                        ((ag) this).field_u = -((ag) this).field_u;
                        int fieldTemp$7 = ((ag) this).field_r - 1;
                        ((ag) this).field_r = ((ag) this).field_r - 1;
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
          if (((ag) this).field_u < 0) {
            int discarded$8 = this.a(param0, var9, 0, param2, 0);
            if (((ag) this).field_o < 0) {
              ((ag) this).field_o = -1;
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.b(param0, var9, var7, param2, 0);
              if (((ag) this).field_o < var7) {
                break L9;
              } else {
                ((ag) this).field_o = var7;
                this.i();
                ((ag) this).a(-16175);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((ag) this).field_y) {
            if (((ag) this).field_u >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((ag) this).field_v]);
                if (((ag) this).field_o >= var6) {
                  ((ag) this).field_o = var5 + (((ag) this).field_o - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_p - 1]);
                if (((ag) this).field_o < var5) {
                  ((ag) this).field_o = var6 - 1 - (var6 - 1 - ((ag) this).field_o) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((ag) this).field_u >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_v]);
                if (((ag) this).field_o < var5) {
                  ((ag) this).field_o = var5 + var5 - 1 - ((ag) this).field_o;
                  ((ag) this).field_u = -((ag) this).field_u;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((ag) this).field_p - 1]);
              if (((ag) this).field_o >= var6) {
                ((ag) this).field_o = var6 + var6 - 1 - ((ag) this).field_o;
                ((ag) this).field_u = -((ag) this).field_u;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((ag) this).field_v]);
                if (((ag) this).field_o < var5) {
                  ((ag) this).field_o = var5 + var5 - 1 - ((ag) this).field_o;
                  ((ag) this).field_u = -((ag) this).field_u;
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

    final synchronized void k(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((ag) this).field_x == 0) {
            if (((ag) this).field_m == 0) {
              ((ag) this).field_n = 0;
              ((ag) this).field_l = 0;
              ((ag) this).field_t = 0;
              ((ag) this).a(-16175);
              return;
            } else {
              L0: {
                var2 = -((ag) this).field_t;
                if (((ag) this).field_t <= var2) {
                  break L0;
                } else {
                  var2 = ((ag) this).field_t;
                  break L0;
                }
              }
              L1: {
                if (-((ag) this).field_x <= var2) {
                  break L1;
                } else {
                  var2 = -((ag) this).field_x;
                  break L1;
                }
              }
              L2: {
                if (((ag) this).field_x <= var2) {
                  break L2;
                } else {
                  var2 = ((ag) this).field_x;
                  break L2;
                }
              }
              L3: {
                if (-((ag) this).field_m <= var2) {
                  break L3;
                } else {
                  var2 = -((ag) this).field_m;
                  break L3;
                }
              }
              L4: {
                if (((ag) this).field_m <= var2) {
                  break L4;
                } else {
                  var2 = ((ag) this).field_m;
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
              ((ag) this).field_n = param0;
              ((ag) this).field_l = -2147483648;
              ((ag) this).field_w = -((ag) this).field_t / param0;
              ((ag) this).field_s = -((ag) this).field_x / param0;
              ((ag) this).field_z = -((ag) this).field_m / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((ag) this).field_t;
              if (((ag) this).field_t <= var2) {
                break L6;
              } else {
                var2 = ((ag) this).field_t;
                break L6;
              }
            }
            L7: {
              if (-((ag) this).field_x <= var2) {
                break L7;
              } else {
                var2 = -((ag) this).field_x;
                break L7;
              }
            }
            L8: {
              if (((ag) this).field_x <= var2) {
                break L8;
              } else {
                var2 = ((ag) this).field_x;
                break L8;
              }
            }
            L9: {
              if (-((ag) this).field_m <= var2) {
                break L9;
              } else {
                var2 = -((ag) this).field_m;
                break L9;
              }
            }
            L10: {
              if (((ag) this).field_m <= var2) {
                break L10;
              } else {
                var2 = ((ag) this).field_m;
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
            ((ag) this).field_n = param0;
            ((ag) this).field_l = -2147483648;
            ((ag) this).field_w = -((ag) this).field_t / param0;
            ((ag) this).field_s = -((ag) this).field_x / param0;
            ((ag) this).field_z = -((ag) this).field_m / param0;
            return;
          }
        } else {
          ((ag) this).e(0);
          ((ag) this).a(-16175);
          return;
        }
    }

    final synchronized void c(int param0, int param1) {
        ((ag) this).field_v = param0;
        ((ag) this).field_p = param1;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, ag param10) {
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

    final synchronized void g(int param0) {
        int var2 = ((vk) (Object) ((ag) this).field_i).field_i.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((ag) this).field_o = param0;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, ag param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_x = param11.field_x - param11.field_s * param5;
            param11.field_m = param11.field_m - param11.field_z * param5;
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
                param11.field_x = param11.field_x + param11.field_s * param5;
                param11.field_m = param11.field_m + param11.field_z * param5;
                param11.field_t = param6;
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

    final synchronized void j(int param0) {
        this.d(param0 << 6, ((ag) this).h());
    }

    final synchronized void d(int param0) {
        vk var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((ag) this).field_n <= 0) {
            break L0;
          } else {
            if (param0 < ((ag) this).field_n) {
              ((ag) this).field_t = ((ag) this).field_t + ((ag) this).field_w * param0;
              ((ag) this).field_x = ((ag) this).field_x + ((ag) this).field_s * param0;
              ((ag) this).field_m = ((ag) this).field_m + ((ag) this).field_z * param0;
              ((ag) this).field_n = ((ag) this).field_n - param0;
              break L0;
            } else {
              L1: {
                if (((ag) this).field_l != -2147483648) {
                  break L1;
                } else {
                  ((ag) this).field_l = 0;
                  ((ag) this).field_m = 0;
                  ((ag) this).field_x = 0;
                  ((ag) this).field_t = 0;
                  ((ag) this).a(-16175);
                  param0 = ((ag) this).field_n;
                  break L1;
                }
              }
              ((ag) this).field_n = 0;
              this.k();
              break L0;
            }
          }
        }
        L2: {
          var2 = (vk) (Object) ((ag) this).field_i;
          var3 = ((ag) this).field_v << 8;
          var4 = ((ag) this).field_p << 8;
          var5 = var2.field_i.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((ag) this).field_r = 0;
            break L2;
          }
        }
        L3: {
          if (((ag) this).field_o >= 0) {
            break L3;
          } else {
            if (((ag) this).field_u <= 0) {
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              ((ag) this).field_o = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((ag) this).field_o < var5) {
            break L4;
          } else {
            if (((ag) this).field_u >= 0) {
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              ((ag) this).field_o = var5 - 1;
              break L4;
            }
          }
        }
        ((ag) this).field_o = ((ag) this).field_o + ((ag) this).field_u * param0;
        if (((ag) this).field_r >= 0) {
          L5: {
            if (((ag) this).field_r <= 0) {
              break L5;
            } else {
              if (!((ag) this).field_y) {
                L6: {
                  if (((ag) this).field_u >= 0) {
                    if (((ag) this).field_o >= var4) {
                      var7 = (((ag) this).field_o - var3) / var6;
                      if (var7 < ((ag) this).field_r) {
                        ((ag) this).field_o = ((ag) this).field_o - var6 * var7;
                        ((ag) this).field_r = ((ag) this).field_r - var7;
                        break L6;
                      } else {
                        ((ag) this).field_o = ((ag) this).field_o - var6 * ((ag) this).field_r;
                        ((ag) this).field_r = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((ag) this).field_o < var3) {
                      var7 = (var4 - 1 - ((ag) this).field_o) / var6;
                      if (var7 < ((ag) this).field_r) {
                        ((ag) this).field_o = ((ag) this).field_o + var6 * var7;
                        ((ag) this).field_r = ((ag) this).field_r - var7;
                        break L6;
                      } else {
                        ((ag) this).field_o = ((ag) this).field_o + var6 * ((ag) this).field_r;
                        ((ag) this).field_r = 0;
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
                  if (((ag) this).field_u >= 0) {
                    break L7;
                  } else {
                    if (((ag) this).field_o < var3) {
                      ((ag) this).field_o = var3 + var3 - 1 - ((ag) this).field_o;
                      ((ag) this).field_u = -((ag) this).field_u;
                      int fieldTemp$3 = ((ag) this).field_r - 1;
                      ((ag) this).field_r = ((ag) this).field_r - 1;
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
                  if (((ag) this).field_o >= var4) {
                    ((ag) this).field_o = var4 + var4 - 1 - ((ag) this).field_o;
                    ((ag) this).field_u = -((ag) this).field_u;
                    int fieldTemp$4 = ((ag) this).field_r - 1;
                    ((ag) this).field_r = ((ag) this).field_r - 1;
                    if (fieldTemp$4 != 0) {
                      if (((ag) this).field_o < var3) {
                        ((ag) this).field_o = var3 + var3 - 1 - ((ag) this).field_o;
                        ((ag) this).field_u = -((ag) this).field_u;
                        int fieldTemp$5 = ((ag) this).field_r - 1;
                        ((ag) this).field_r = ((ag) this).field_r - 1;
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
          if (((ag) this).field_u < 0) {
            if (((ag) this).field_o < 0) {
              ((ag) this).field_o = -1;
              this.i();
              ((ag) this).a(-16175);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((ag) this).field_o < var5) {
                break L9;
              } else {
                ((ag) this).field_o = var5;
                this.i();
                ((ag) this).a(-16175);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((ag) this).field_y) {
            if (((ag) this).field_u >= 0) {
              if (((ag) this).field_o < var4) {
                return;
              } else {
                ((ag) this).field_o = var3 + (((ag) this).field_o - var3) % var6;
                return;
              }
            } else {
              if (((ag) this).field_o < var3) {
                ((ag) this).field_o = var4 - 1 - (var4 - 1 - ((ag) this).field_o) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((ag) this).field_u >= 0) {
                break L10;
              } else {
                if (((ag) this).field_o < var3) {
                  ((ag) this).field_o = var3 + var3 - 1 - ((ag) this).field_o;
                  ((ag) this).field_u = -((ag) this).field_u;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((ag) this).field_o >= var4) {
                ((ag) this).field_o = var4 + var4 - 1 - ((ag) this).field_o;
                ((ag) this).field_u = -((ag) this).field_u;
                if (((ag) this).field_o < var3) {
                  ((ag) this).field_o = var3 + var3 - 1 - ((ag) this).field_o;
                  ((ag) this).field_u = -((ag) this).field_u;
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
        ((ag) this).field_r = param0;
    }

    final ic a() {
        return null;
    }

    private ag(vk param0, int param1, int param2) {
        ((ag) this).field_i = (me) (Object) param0;
        ((ag) this).field_v = param0.field_k;
        ((ag) this).field_p = param0.field_l;
        ((ag) this).field_y = param0.field_m;
        ((ag) this).field_u = param1;
        ((ag) this).field_l = param2;
        ((ag) this).field_q = 8192;
        ((ag) this).field_o = 0;
        this.k();
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, ag param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_t = param13.field_t - param13.field_w * param5;
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
                param13.field_t = param13.field_t + param13.field_w * param5;
                param13.field_x = param6;
                param13.field_m = param7;
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

    private final void i() {
        if (((ag) this).field_n != 0) {
            if (((ag) this).field_l == -2147483648) {
                ((ag) this).field_l = 0;
            }
            ((ag) this).field_n = 0;
            this.k();
            return;
        }
    }

    private final void k() {
        ((ag) this).field_t = ((ag) this).field_l;
        ((ag) this).field_x = ag.a(((ag) this).field_l, ((ag) this).field_q);
        ((ag) this).field_m = ag.b(((ag) this).field_l, ((ag) this).field_q);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, ag param8) {
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

    private final synchronized void d(int param0, int param1) {
        ((ag) this).field_l = param0;
        ((ag) this).field_q = param1;
        ((ag) this).field_n = 0;
        this.k();
    }

    final ic c() {
        return null;
    }

    final synchronized void e(int param0, int param1) {
        ((ag) this).a(param0, param1, ((ag) this).h());
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((ag) this).field_n <= 0) {
            L1: {
              if (((ag) this).field_u != -256) {
                break L1;
              } else {
                if ((((ag) this).field_o & 255) != 0) {
                  break L1;
                } else {
                  if (id.field_f) {
                    return ag.b(0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, 0, param3, param2, (ag) this);
                  } else {
                    return ag.a(((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, 0, param3, param2, (ag) this);
                  }
                }
              }
            }
            if (id.field_f) {
              return ag.b(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, 0, param3, param2, (ag) this, ((ag) this).field_u, param4);
            } else {
              return ag.a(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, 0, param3, param2, (ag) this, ((ag) this).field_u, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((ag) this).field_n;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((ag) this).field_n = ((ag) this).field_n + param1;
                if (((ag) this).field_u != -256) {
                  break L4;
                } else {
                  if ((((ag) this).field_o & 255) != 0) {
                    break L4;
                  } else {
                    if (!id.field_f) {
                      param1 = ag.b(((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, ((ag) this).field_w, 0, var6, param2, (ag) this);
                      break L3;
                    } else {
                      param1 = ag.a(0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, ((ag) this).field_s, ((ag) this).field_z, 0, var6, param2, (ag) this);
                      break L3;
                    }
                  }
                }
              }
              if (!id.field_f) {
                param1 = ag.a(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_t, ((ag) this).field_w, 0, var6, param2, (ag) this, ((ag) this).field_u, param4);
                break L3;
              } else {
                param1 = ag.b(0, 0, ((vk) (Object) ((ag) this).field_i).field_i, param0, ((ag) this).field_o, param1, ((ag) this).field_x, ((ag) this).field_m, ((ag) this).field_s, ((ag) this).field_z, 0, var6, param2, (ag) this, ((ag) this).field_u, param4);
                break L3;
              }
            }
            ((ag) this).field_n = ((ag) this).field_n - param1;
            if (((ag) this).field_n == 0) {
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

    final synchronized int h() {
        return ((ag) this).field_q < 0 ? -1 : ((ag) this).field_q;
    }

    final static ag a(vk param0, int param1, int param2) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new ag(param0, 256, param2 << 6);
          }
        } else {
          return null;
        }
    }

    private ag(vk param0, int param1, int param2, int param3) {
        ((ag) this).field_i = (me) (Object) param0;
        ((ag) this).field_v = param0.field_k;
        ((ag) this).field_p = param0.field_l;
        ((ag) this).field_y = param0.field_m;
        ((ag) this).field_u = param1;
        ((ag) this).field_l = param2;
        ((ag) this).field_q = param3;
        ((ag) this).field_o = 0;
        this.k();
    }
}
