/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su extends rf {
    private int field_r;
    private int field_u;
    private int field_p;
    private boolean field_m;
    private int field_o;
    private int field_i;
    private int field_q;
    private int field_j;
    private int field_s;
    private int field_k;
    private int field_t;
    private int field_l;
    private int field_w;
    private int field_v;
    private int field_n;

    final static su a(al param0, int param1, int param2, int param3) {
        if (((al) param0).field_g != null) {
          if (((al) param0).field_g.length == 0) {
            return null;
          } else {
            return new su(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, su param11, int param12, int param13) {
        L0: {
          L1: {
            ((su) param11).field_i = ((su) param11).field_i - ((su) param11).field_k * param5;
            ((su) param11).field_p = ((su) param11).field_p - ((su) param11).field_o * param5;
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
                ((su) param11).field_i = ((su) param11).field_i + ((su) param11).field_k * param5;
                ((su) param11).field_p = ((su) param11).field_p + ((su) param11).field_o * param5;
                ((su) param11).field_j = param6;
                ((su) param11).field_v = param4;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, su param11, int param12, int param13) {
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
                ((su) param11).field_v = param4;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, su param10, int param11, int param12) {
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
        ((su) param10).field_v = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, su param12) {
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
        ((su) param12).field_j = ((su) param12).field_j + ((su) param12).field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_i = param5 >> 2;
                param12.field_p = param6 >> 2;
                param12.field_v = param3 << 8;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, su param11, int param12, int param13) {
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
                ((su) param11).field_v = param4;
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

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final void k() {
        ((su) this).field_j = ((su) this).field_u;
        ((su) this).field_i = su.b(((su) this).field_u, ((su) this).field_q);
        ((su) this).field_p = su.c(((su) this).field_u, ((su) this).field_q);
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, su param9) {
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
        ((su) param9).field_i = ((su) param9).field_i + ((su) param9).field_k * (param6 - param3);
        ((su) param9).field_p = ((su) param9).field_p + ((su) param9).field_o * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_j = param4 >> 2;
                param9.field_v = param2 << 8;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, su param10) {
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
                param10.field_v = param3 << 8;
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

    final synchronized void h(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((su) this).field_i == 0) {
            if (((su) this).field_p == 0) {
              ((su) this).field_w = 0;
              ((su) this).field_u = 0;
              ((su) this).field_j = 0;
              ((su) this).c(-123);
              return;
            } else {
              L0: {
                var2 = -((su) this).field_j;
                if (((su) this).field_j <= var2) {
                  break L0;
                } else {
                  var2 = ((su) this).field_j;
                  break L0;
                }
              }
              L1: {
                if (-((su) this).field_i <= var2) {
                  break L1;
                } else {
                  var2 = -((su) this).field_i;
                  break L1;
                }
              }
              L2: {
                if (((su) this).field_i <= var2) {
                  break L2;
                } else {
                  var2 = ((su) this).field_i;
                  break L2;
                }
              }
              L3: {
                if (-((su) this).field_p <= var2) {
                  break L3;
                } else {
                  var2 = -((su) this).field_p;
                  break L3;
                }
              }
              L4: {
                if (((su) this).field_p <= var2) {
                  break L4;
                } else {
                  var2 = ((su) this).field_p;
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
              ((su) this).field_w = param0;
              ((su) this).field_u = -2147483648;
              ((su) this).field_l = -((su) this).field_j / param0;
              ((su) this).field_k = -((su) this).field_i / param0;
              ((su) this).field_o = -((su) this).field_p / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((su) this).field_j;
              if (((su) this).field_j <= var2) {
                break L6;
              } else {
                var2 = ((su) this).field_j;
                break L6;
              }
            }
            L7: {
              if (-((su) this).field_i <= var2) {
                break L7;
              } else {
                var2 = -((su) this).field_i;
                break L7;
              }
            }
            L8: {
              if (((su) this).field_i <= var2) {
                break L8;
              } else {
                var2 = ((su) this).field_i;
                break L8;
              }
            }
            L9: {
              if (-((su) this).field_p <= var2) {
                break L9;
              } else {
                var2 = -((su) this).field_p;
                break L9;
              }
            }
            L10: {
              if (((su) this).field_p <= var2) {
                break L10;
              } else {
                var2 = ((su) this).field_p;
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
            ((su) this).field_w = param0;
            ((su) this).field_u = -2147483648;
            ((su) this).field_l = -((su) this).field_j / param0;
            ((su) this).field_k = -((su) this).field_i / param0;
            ((su) this).field_o = -((su) this).field_p / param0;
            return;
          }
        } else {
          ((su) this).f(0);
          ((su) this).c(-123);
          return;
        }
    }

    private final void e() {
        if (((su) this).field_w != 0) {
            if (((su) this).field_u == -2147483648) {
                ((su) this).field_u = 0;
            }
            ((su) this).field_w = 0;
            this.k();
            return;
        }
    }

    final synchronized boolean j() {
        return ((su) this).field_w != 0;
    }

    final rf b() {
        return null;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = su.b(param1, param2);
          var5 = su.c(param1, param2);
          if (((su) this).field_i == var4) {
            if (((su) this).field_p == var5) {
              ((su) this).field_w = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((su) this).field_j;
                if (((su) this).field_j - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((su) this).field_j - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((su) this).field_i <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((su) this).field_i;
                  break L1;
                }
              }
              L2: {
                if (((su) this).field_i - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((su) this).field_i - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((su) this).field_p <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((su) this).field_p;
                  break L3;
                }
              }
              L4: {
                if (((su) this).field_p - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((su) this).field_p - var5;
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
              ((su) this).field_w = param0;
              ((su) this).field_u = param1;
              ((su) this).field_q = param2;
              ((su) this).field_l = (param1 - ((su) this).field_j) / param0;
              ((su) this).field_k = (var4 - ((su) this).field_i) / param0;
              ((su) this).field_o = (var5 - ((su) this).field_p) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((su) this).field_j;
              if (((su) this).field_j - param1 <= var6) {
                break L6;
              } else {
                var6 = ((su) this).field_j - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((su) this).field_i <= var6) {
                break L7;
              } else {
                var6 = var4 - ((su) this).field_i;
                break L7;
              }
            }
            L8: {
              if (((su) this).field_i - var4 <= var6) {
                break L8;
              } else {
                var6 = ((su) this).field_i - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((su) this).field_p <= var6) {
                break L9;
              } else {
                var6 = var5 - ((su) this).field_p;
                break L9;
              }
            }
            L10: {
              if (((su) this).field_p - var5 <= var6) {
                break L10;
              } else {
                var6 = ((su) this).field_p - var5;
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
            ((su) this).field_w = param0;
            ((su) this).field_u = param1;
            ((su) this).field_q = param2;
            ((su) this).field_l = (param1 - ((su) this).field_j) / param0;
            ((su) this).field_k = (var4 - ((su) this).field_i) / param0;
            ((su) this).field_o = (var5 - ((su) this).field_p) / param0;
            return;
          }
        } else {
          this.a(param1, param2);
          return;
        }
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((su) this).field_w <= 0) {
            L1: {
              if (((su) this).field_r != 256) {
                break L1;
              } else {
                if ((((su) this).field_v & 255) != 0) {
                  break L1;
                } else {
                  if (tk.field_r) {
                    return su.b(0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, 0, param3, param2, (su) this);
                  } else {
                    return su.a(((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, 0, param3, param2, (su) this);
                  }
                }
              }
            }
            if (tk.field_r) {
              return su.a(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, 0, param3, param2, (su) this, ((su) this).field_r, param4);
            } else {
              return su.a(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, 0, param3, param2, (su) this, ((su) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((su) this).field_w;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((su) this).field_w = ((su) this).field_w + param1;
                if (((su) this).field_r != 256) {
                  break L4;
                } else {
                  if ((((su) this).field_v & 255) != 0) {
                    break L4;
                  } else {
                    if (!tk.field_r) {
                      param1 = su.a(((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, ((su) this).field_l, 0, var6, param2, (su) this);
                      break L3;
                    } else {
                      param1 = su.a(0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, ((su) this).field_k, ((su) this).field_o, 0, var6, param2, (su) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tk.field_r) {
                param1 = su.c(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, ((su) this).field_l, 0, var6, param2, (su) this, ((su) this).field_r, param4);
                break L3;
              } else {
                param1 = su.b(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, ((su) this).field_k, ((su) this).field_o, 0, var6, param2, (su) this, ((su) this).field_r, param4);
                break L3;
              }
            }
            ((su) this).field_w = ((su) this).field_w - param1;
            if (((su) this).field_w == 0) {
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

    final synchronized void f(int param0) {
        this.a(param0, ((su) this).g());
    }

    final synchronized int l() {
        return ((su) this).field_r < 0 ? -((su) this).field_r : ((su) this).field_r;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, su param12) {
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
        ((su) param12).field_j = ((su) param12).field_j + ((su) param12).field_l * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_i = param5 >> 2;
                param12.field_p = param6 >> 2;
                param12.field_v = param3 << 8;
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

    private final boolean h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((su) this).field_u;
          if (var1 != -2147483648) {
            var2 = su.b(var1, ((su) this).field_q);
            var3 = su.c(var1, ((su) this).field_q);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((su) this).field_j != var1) {
            break L1;
          } else {
            if (((su) this).field_i != var2) {
              break L1;
            } else {
              if (((su) this).field_p == var3) {
                if (((su) this).field_u == -2147483648) {
                  ((su) this).field_u = 0;
                  ((su) this).field_p = 0;
                  ((su) this).field_i = 0;
                  ((su) this).field_j = 0;
                  ((su) this).c(-128);
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
          if (((su) this).field_j >= var1) {
            if (((su) this).field_j <= var1) {
              ((su) this).field_l = 0;
              break L2;
            } else {
              ((su) this).field_l = -1;
              ((su) this).field_w = ((su) this).field_j - var1;
              break L2;
            }
          } else {
            ((su) this).field_l = 1;
            ((su) this).field_w = var1 - ((su) this).field_j;
            break L2;
          }
        }
        L3: {
          if (((su) this).field_i >= var2) {
            if (((su) this).field_i <= var2) {
              ((su) this).field_k = 0;
              break L3;
            } else {
              L4: {
                ((su) this).field_k = -1;
                if (((su) this).field_w == 0) {
                  break L4;
                } else {
                  if (((su) this).field_w <= ((su) this).field_i - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((su) this).field_w = ((su) this).field_i - var2;
              break L3;
            }
          } else {
            L5: {
              ((su) this).field_k = 1;
              if (((su) this).field_w == 0) {
                break L5;
              } else {
                if (((su) this).field_w <= var2 - ((su) this).field_i) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((su) this).field_w = var2 - ((su) this).field_i;
            break L3;
          }
        }
        if (((su) this).field_p < var3) {
          ((su) this).field_o = 1;
          if (((su) this).field_w != 0) {
            if (((su) this).field_w > var3 - ((su) this).field_p) {
              ((su) this).field_w = var3 - ((su) this).field_p;
              return false;
            } else {
              return false;
            }
          } else {
            ((su) this).field_w = var3 - ((su) this).field_p;
            return false;
          }
        } else {
          L6: {
            if (((su) this).field_p <= var3) {
              ((su) this).field_o = 0;
              break L6;
            } else {
              L7: {
                ((su) this).field_o = -1;
                if (((su) this).field_w == 0) {
                  break L7;
                } else {
                  if (((su) this).field_w <= ((su) this).field_p - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((su) this).field_w = ((su) this).field_p - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized void a(int param0) {
        al var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((su) this).field_w <= 0) {
            break L0;
          } else {
            if (param0 < ((su) this).field_w) {
              ((su) this).field_j = ((su) this).field_j + ((su) this).field_l * param0;
              ((su) this).field_i = ((su) this).field_i + ((su) this).field_k * param0;
              ((su) this).field_p = ((su) this).field_p + ((su) this).field_o * param0;
              ((su) this).field_w = ((su) this).field_w - param0;
              break L0;
            } else {
              L1: {
                if (((su) this).field_u != -2147483648) {
                  break L1;
                } else {
                  ((su) this).field_u = 0;
                  ((su) this).field_p = 0;
                  ((su) this).field_i = 0;
                  ((su) this).field_j = 0;
                  ((su) this).c(-125);
                  param0 = ((su) this).field_w;
                  break L1;
                }
              }
              ((su) this).field_w = 0;
              this.k();
              break L0;
            }
          }
        }
        L2: {
          var2 = (al) ((su) this).field_f;
          var3 = ((su) this).field_s << 8;
          var4 = ((su) this).field_t << 8;
          var5 = ((al) var2).field_g.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((su) this).field_n = 0;
            break L2;
          }
        }
        L3: {
          if (((su) this).field_v >= 0) {
            break L3;
          } else {
            if (((su) this).field_r <= 0) {
              this.e();
              ((su) this).c(-126);
              return;
            } else {
              ((su) this).field_v = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((su) this).field_v < var5) {
            break L4;
          } else {
            if (((su) this).field_r >= 0) {
              this.e();
              ((su) this).c(-128);
              return;
            } else {
              ((su) this).field_v = var5 - 1;
              break L4;
            }
          }
        }
        ((su) this).field_v = ((su) this).field_v + ((su) this).field_r * param0;
        if (((su) this).field_n >= 0) {
          L5: {
            if (((su) this).field_n <= 0) {
              break L5;
            } else {
              if (!((su) this).field_m) {
                L6: {
                  if (((su) this).field_r >= 0) {
                    if (((su) this).field_v >= var4) {
                      var7 = (((su) this).field_v - var3) / var6;
                      if (var7 < ((su) this).field_n) {
                        ((su) this).field_v = ((su) this).field_v - var6 * var7;
                        ((su) this).field_n = ((su) this).field_n - var7;
                        break L6;
                      } else {
                        ((su) this).field_v = ((su) this).field_v - var6 * ((su) this).field_n;
                        ((su) this).field_n = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((su) this).field_v < var3) {
                      var7 = (var4 - 1 - ((su) this).field_v) / var6;
                      if (var7 < ((su) this).field_n) {
                        ((su) this).field_v = ((su) this).field_v + var6 * var7;
                        ((su) this).field_n = ((su) this).field_n - var7;
                        break L6;
                      } else {
                        ((su) this).field_v = ((su) this).field_v + var6 * ((su) this).field_n;
                        ((su) this).field_n = 0;
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
                  if (((su) this).field_r >= 0) {
                    break L7;
                  } else {
                    if (((su) this).field_v < var3) {
                      ((su) this).field_v = var3 + var3 - 1 - ((su) this).field_v;
                      ((su) this).field_r = -((su) this).field_r;
                      ((su) this).field_n = ((su) this).field_n - 1;
                      if (((su) this).field_n - 1 != 0) {
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
                  if (((su) this).field_v >= var4) {
                    ((su) this).field_v = var4 + var4 - 1 - ((su) this).field_v;
                    ((su) this).field_r = -((su) this).field_r;
                    ((su) this).field_n = ((su) this).field_n - 1;
                    if (((su) this).field_n - 1 != 0) {
                      if (((su) this).field_v < var3) {
                        ((su) this).field_v = var3 + var3 - 1 - ((su) this).field_v;
                        ((su) this).field_r = -((su) this).field_r;
                        ((su) this).field_n = ((su) this).field_n - 1;
                        if (((su) this).field_n - 1 != 0) {
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
          if (((su) this).field_r < 0) {
            if (((su) this).field_v < 0) {
              ((su) this).field_v = -1;
              this.e();
              ((su) this).c(-126);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((su) this).field_v < var5) {
                break L9;
              } else {
                ((su) this).field_v = var5;
                this.e();
                ((su) this).c(-128);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((su) this).field_m) {
            if (((su) this).field_r >= 0) {
              if (((su) this).field_v < var4) {
                return;
              } else {
                ((su) this).field_v = var3 + (((su) this).field_v - var3) % var6;
                return;
              }
            } else {
              if (((su) this).field_v < var3) {
                ((su) this).field_v = var4 - 1 - (var4 - 1 - ((su) this).field_v) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((su) this).field_r >= 0) {
                break L10;
              } else {
                if (((su) this).field_v < var3) {
                  ((su) this).field_v = var3 + var3 - 1 - ((su) this).field_v;
                  ((su) this).field_r = -((su) this).field_r;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((su) this).field_v >= var4) {
                ((su) this).field_v = var4 + var4 - 1 - ((su) this).field_v;
                ((su) this).field_r = -((su) this).field_r;
                if (((su) this).field_v < var3) {
                  ((su) this).field_v = var3 + var3 - 1 - ((su) this).field_v;
                  ((su) this).field_r = -((su) this).field_r;
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

    final synchronized int i() {
        return ((su) this).field_u == -2147483648 ? 0 : ((su) this).field_u;
    }

    final rf a() {
        return null;
    }

    final synchronized void e(int param0) {
        int var2 = ((al) ((su) this).field_f).field_g.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((su) this).field_v = param0;
    }

    private final synchronized void a(int param0, int param1) {
        ((su) this).field_u = param0;
        ((su) this).field_q = param1;
        ((su) this).field_w = 0;
        this.k();
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        al var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((su) this).field_u != 0) {
            break L0;
          } else {
            if (((su) this).field_w != 0) {
              break L0;
            } else {
              ((su) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (al) ((su) this).field_f;
          var5 = ((su) this).field_s << 8;
          var6 = ((su) this).field_t << 8;
          var7 = ((al) var4).field_g.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((su) this).field_n = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((su) this).field_v >= 0) {
            break L2;
          } else {
            if (((su) this).field_r <= 0) {
              this.e();
              ((su) this).c(-127);
              return;
            } else {
              ((su) this).field_v = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((su) this).field_v < var7) {
            break L3;
          } else {
            if (((su) this).field_r >= 0) {
              this.e();
              ((su) this).c(-125);
              return;
            } else {
              ((su) this).field_v = var7 - 1;
              break L3;
            }
          }
        }
        if (((su) this).field_n >= 0) {
          L4: {
            if (((su) this).field_n <= 0) {
              break L4;
            } else {
              if (!((su) this).field_m) {
                if (((su) this).field_r >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                    if (((su) this).field_v >= var6) {
                      var10 = (((su) this).field_v - var5) / var8;
                      if (var10 < ((su) this).field_n) {
                        ((su) this).field_v = ((su) this).field_v - var8 * var10;
                        ((su) this).field_n = ((su) this).field_n - var10;
                        continue L5;
                      } else {
                        ((su) this).field_v = ((su) this).field_v - var8 * ((su) this).field_n;
                        ((su) this).field_n = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_t - 1]);
                    if (((su) this).field_v < var5) {
                      var10 = (var6 - 1 - ((su) this).field_v) / var8;
                      if (var10 < ((su) this).field_n) {
                        ((su) this).field_v = ((su) this).field_v + var8 * var10;
                        ((su) this).field_n = ((su) this).field_n - var10;
                        continue L6;
                      } else {
                        ((su) this).field_v = ((su) this).field_v + var8 * ((su) this).field_n;
                        ((su) this).field_n = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((su) this).field_r >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                    if (((su) this).field_v < var5) {
                      ((su) this).field_v = var5 + var5 - 1 - ((su) this).field_v;
                      ((su) this).field_r = -((su) this).field_r;
                      ((su) this).field_n = ((su) this).field_n - 1;
                      if (((su) this).field_n - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) ((al) var4).field_g[((su) this).field_t - 1]);
                  if (((su) this).field_v >= var6) {
                    ((su) this).field_v = var6 + var6 - 1 - ((su) this).field_v;
                    ((su) this).field_r = -((su) this).field_r;
                    ((su) this).field_n = ((su) this).field_n - 1;
                    if (((su) this).field_n - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                      if (((su) this).field_v < var5) {
                        ((su) this).field_v = var5 + var5 - 1 - ((su) this).field_v;
                        ((su) this).field_r = -((su) this).field_r;
                        ((su) this).field_n = ((su) this).field_n - 1;
                        if (((su) this).field_n - 1 != 0) {
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
          if (((su) this).field_r < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((su) this).field_v < 0) {
              ((su) this).field_v = -1;
              this.e();
              ((su) this).c(-127);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((su) this).field_v < var7) {
                break L9;
              } else {
                ((su) this).field_v = var7;
                this.e();
                ((su) this).c(-123);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((su) this).field_m) {
            if (((su) this).field_r >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                if (((su) this).field_v >= var6) {
                  ((su) this).field_v = var5 + (((su) this).field_v - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_t - 1]);
                if (((su) this).field_v < var5) {
                  ((su) this).field_v = var6 - 1 - (var6 - 1 - ((su) this).field_v) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((su) this).field_r >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                if (((su) this).field_v < var5) {
                  ((su) this).field_v = var5 + var5 - 1 - ((su) this).field_v;
                  ((su) this).field_r = -((su) this).field_r;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) ((al) var4).field_g[((su) this).field_t - 1]);
              if (((su) this).field_v >= var6) {
                ((su) this).field_v = var6 + var6 - 1 - ((su) this).field_v;
                ((su) this).field_r = -((su) this).field_r;
                var9 = this.a(param0, var9, var5, param2, (int) ((al) var4).field_g[((su) this).field_s]);
                if (((su) this).field_v < var5) {
                  ((su) this).field_v = var5 + var5 - 1 - ((su) this).field_v;
                  ((su) this).field_r = -((su) this).field_r;
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

    final static su a(al param0, int param1, int param2) {
        if (((al) param0).field_g != null) {
          if (((al) param0).field_g.length == 0) {
            return null;
          } else {
            return new su(param0, (int)((long)((al) param0).field_i * 256L * (long)param1 / (long)(100 * tk.field_f)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void d(int param0) {
        ((su) this).field_n = param0;
    }

    final synchronized int g() {
        return ((su) this).field_q < 0 ? -1 : ((su) this).field_q;
    }

    final synchronized boolean f() {
        return ((su) this).field_v < 0 || ((su) this).field_v >= ((al) ((su) this).field_f).field_g.length << 8;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((su) this).field_w <= 0) {
            L1: {
              if (((su) this).field_r != -256) {
                break L1;
              } else {
                if ((((su) this).field_v & 255) != 0) {
                  break L1;
                } else {
                  if (tk.field_r) {
                    return su.a(0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, 0, param3, param2, (su) this);
                  } else {
                    return su.b(((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, 0, param3, param2, (su) this);
                  }
                }
              }
            }
            if (tk.field_r) {
              return su.b(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, 0, param3, param2, (su) this, ((su) this).field_r, param4);
            } else {
              return su.b(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, 0, param3, param2, (su) this, ((su) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((su) this).field_w;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((su) this).field_w = ((su) this).field_w + param1;
                if (((su) this).field_r != -256) {
                  break L4;
                } else {
                  if ((((su) this).field_v & 255) != 0) {
                    break L4;
                  } else {
                    if (!tk.field_r) {
                      param1 = su.b(((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, ((su) this).field_l, 0, var6, param2, (su) this);
                      break L3;
                    } else {
                      param1 = su.b(0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, ((su) this).field_k, ((su) this).field_o, 0, var6, param2, (su) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tk.field_r) {
                param1 = su.d(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_j, ((su) this).field_l, 0, var6, param2, (su) this, ((su) this).field_r, param4);
                break L3;
              } else {
                param1 = su.a(0, 0, ((al) ((su) this).field_f).field_g, param0, ((su) this).field_v, param1, ((su) this).field_i, ((su) this).field_p, ((su) this).field_k, ((su) this).field_o, 0, var6, param2, (su) this, ((su) this).field_r, param4);
                break L3;
              }
            }
            ((su) this).field_w = ((su) this).field_w - param1;
            if (((su) this).field_w == 0) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, su param10) {
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
                param10.field_v = param3 << 8;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, su param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, su param9) {
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
        ((su) param9).field_i = ((su) param9).field_i + ((su) param9).field_k * (param6 - param3);
        ((su) param9).field_p = ((su) param9).field_p + ((su) param9).field_o * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_j = param4 >> 2;
                param9.field_v = param2 << 8;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, su param10, int param11, int param12) {
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
        ((su) param10).field_v = param4;
        return param5;
    }

    final synchronized void d(int param0, int param1) {
        ((su) this).a(param0, param1, ((su) this).g());
    }

    final int c() {
        int var1 = ((su) this).field_j * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((su) this).field_n == 0) {
            var1 = var1 - var1 * ((su) this).field_v / (((al) ((su) this).field_f).field_g.length << 8);
        } else {
            if (((su) this).field_n >= 0) {
                var1 = var1 - var1 * ((su) this).field_s / ((al) ((su) this).field_f).field_g.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, su param13, int param14, int param15) {
        L0: {
          L1: {
            ((su) param13).field_j = ((su) param13).field_j - ((su) param13).field_l * param5;
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
                ((su) param13).field_j = ((su) param13).field_j + ((su) param13).field_l * param5;
                ((su) param13).field_i = param6;
                ((su) param13).field_p = param7;
                ((su) param13).field_v = param4;
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

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, su param11, int param12, int param13) {
        L0: {
          L1: {
            ((su) param11).field_i = ((su) param11).field_i - ((su) param11).field_k * param5;
            ((su) param11).field_p = ((su) param11).field_p - ((su) param11).field_o * param5;
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
                ((su) param11).field_i = ((su) param11).field_i + ((su) param11).field_k * param5;
                ((su) param11).field_p = ((su) param11).field_p + ((su) param11).field_o * param5;
                ((su) param11).field_j = param6;
                ((su) param11).field_v = param4;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, su param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, su param13, int param14, int param15) {
        L0: {
          L1: {
            ((su) param13).field_j = ((su) param13).field_j - ((su) param13).field_l * param5;
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
                ((su) param13).field_j = ((su) param13).field_j + ((su) param13).field_l * param5;
                ((su) param13).field_i = param6;
                ((su) param13).field_p = param7;
                ((su) param13).field_v = param4;
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

    final synchronized void a(boolean param0) {
        ((su) this).field_r = (((su) this).field_r ^ ((su) this).field_r >> 31) + (((su) this).field_r >>> 31);
        if (param0) {
          ((su) this).field_r = -((su) this).field_r;
          return;
        } else {
          return;
        }
    }

    final int d() {
        if (((su) this).field_u == 0) {
            if (((su) this).field_w == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized void g(int param0) {
        if (((su) this).field_r < 0) {
            ((su) this).field_r = -param0;
        } else {
            ((su) this).field_r = param0;
        }
    }

    private su(al param0, int param1, int param2) {
        ((su) this).field_f = (gs) (Object) param0;
        ((su) this).field_s = ((al) param0).field_h;
        ((su) this).field_t = ((al) param0).field_j;
        ((su) this).field_m = ((al) param0).field_f;
        ((su) this).field_r = param1;
        ((su) this).field_u = param2;
        ((su) this).field_q = 8192;
        ((su) this).field_v = 0;
        this.k();
    }

    private su(al param0, int param1, int param2, int param3) {
        ((su) this).field_f = (gs) (Object) param0;
        ((su) this).field_s = ((al) param0).field_h;
        ((su) this).field_t = ((al) param0).field_j;
        ((su) this).field_m = ((al) param0).field_f;
        ((su) this).field_r = param1;
        ((su) this).field_u = param2;
        ((su) this).field_q = param3;
        ((su) this).field_v = 0;
        this.k();
    }
}
