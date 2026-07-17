/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fga extends f {
    private int field_p;
    private int field_s;
    private int field_h;
    private int field_j;
    private int field_n;
    private int field_m;
    private int field_i;
    private int field_t;
    private boolean field_o;
    private int field_v;
    private int field_l;
    private int field_q;
    private int field_u;
    private int field_r;
    private int field_k;

    final static fga b(gd param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new fga(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, fga param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_m * param5;
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
                param13.field_u = param13.field_u + param13.field_m * param5;
                param13.field_l = param6;
                param13.field_v = param7;
                param13.field_i = param4;
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

    final synchronized int h() {
        return ((fga) this).field_k < 0 ? -1 : ((fga) this).field_k;
    }

    final synchronized void d(int param0) {
        ((fga) this).field_r = param0;
    }

    final synchronized void c(int param0) {
        int var2 = ((gd) (Object) ((fga) this).field_g).field_i.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((fga) this).field_i = param0;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void a(int param0) {
        gd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((fga) this).field_p <= 0) {
            break L0;
          } else {
            if (param0 < ((fga) this).field_p) {
              ((fga) this).field_u = ((fga) this).field_u + ((fga) this).field_m * param0;
              ((fga) this).field_l = ((fga) this).field_l + ((fga) this).field_h * param0;
              ((fga) this).field_v = ((fga) this).field_v + ((fga) this).field_t * param0;
              ((fga) this).field_p = ((fga) this).field_p - param0;
              break L0;
            } else {
              L1: {
                if (((fga) this).field_q != -2147483648) {
                  break L1;
                } else {
                  ((fga) this).field_q = 0;
                  ((fga) this).field_v = 0;
                  ((fga) this).field_l = 0;
                  ((fga) this).field_u = 0;
                  ((fga) this).b(-3846);
                  param0 = ((fga) this).field_p;
                  break L1;
                }
              }
              ((fga) this).field_p = 0;
              this.e();
              break L0;
            }
          }
        }
        L2: {
          var2 = (gd) (Object) ((fga) this).field_g;
          var3 = ((fga) this).field_n << 8;
          var4 = ((fga) this).field_s << 8;
          var5 = var2.field_i.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((fga) this).field_r = 0;
            break L2;
          }
        }
        L3: {
          if (((fga) this).field_i >= 0) {
            break L3;
          } else {
            if (((fga) this).field_j <= 0) {
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              ((fga) this).field_i = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((fga) this).field_i < var5) {
            break L4;
          } else {
            if (((fga) this).field_j >= 0) {
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              ((fga) this).field_i = var5 - 1;
              break L4;
            }
          }
        }
        ((fga) this).field_i = ((fga) this).field_i + ((fga) this).field_j * param0;
        if (((fga) this).field_r >= 0) {
          L5: {
            if (((fga) this).field_r <= 0) {
              break L5;
            } else {
              if (!((fga) this).field_o) {
                L6: {
                  if (((fga) this).field_j >= 0) {
                    if (((fga) this).field_i >= var4) {
                      var7 = (((fga) this).field_i - var3) / var6;
                      if (var7 < ((fga) this).field_r) {
                        ((fga) this).field_i = ((fga) this).field_i - var6 * var7;
                        ((fga) this).field_r = ((fga) this).field_r - var7;
                        break L6;
                      } else {
                        ((fga) this).field_i = ((fga) this).field_i - var6 * ((fga) this).field_r;
                        ((fga) this).field_r = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((fga) this).field_i < var3) {
                      var7 = (var4 - 1 - ((fga) this).field_i) / var6;
                      if (var7 < ((fga) this).field_r) {
                        ((fga) this).field_i = ((fga) this).field_i + var6 * var7;
                        ((fga) this).field_r = ((fga) this).field_r - var7;
                        break L6;
                      } else {
                        ((fga) this).field_i = ((fga) this).field_i + var6 * ((fga) this).field_r;
                        ((fga) this).field_r = 0;
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
                  if (((fga) this).field_j >= 0) {
                    break L7;
                  } else {
                    if (((fga) this).field_i < var3) {
                      ((fga) this).field_i = var3 + var3 - 1 - ((fga) this).field_i;
                      ((fga) this).field_j = -((fga) this).field_j;
                      int fieldTemp$3 = ((fga) this).field_r - 1;
                      ((fga) this).field_r = ((fga) this).field_r - 1;
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
                  if (((fga) this).field_i >= var4) {
                    ((fga) this).field_i = var4 + var4 - 1 - ((fga) this).field_i;
                    ((fga) this).field_j = -((fga) this).field_j;
                    int fieldTemp$4 = ((fga) this).field_r - 1;
                    ((fga) this).field_r = ((fga) this).field_r - 1;
                    if (fieldTemp$4 != 0) {
                      if (((fga) this).field_i < var3) {
                        ((fga) this).field_i = var3 + var3 - 1 - ((fga) this).field_i;
                        ((fga) this).field_j = -((fga) this).field_j;
                        int fieldTemp$5 = ((fga) this).field_r - 1;
                        ((fga) this).field_r = ((fga) this).field_r - 1;
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
          if (((fga) this).field_j < 0) {
            if (((fga) this).field_i < 0) {
              ((fga) this).field_i = -1;
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((fga) this).field_i < var5) {
                break L9;
              } else {
                ((fga) this).field_i = var5;
                this.l();
                ((fga) this).b(-3846);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((fga) this).field_o) {
            if (((fga) this).field_j >= 0) {
              if (((fga) this).field_i < var4) {
                return;
              } else {
                ((fga) this).field_i = var3 + (((fga) this).field_i - var3) % var6;
                return;
              }
            } else {
              if (((fga) this).field_i < var3) {
                ((fga) this).field_i = var4 - 1 - (var4 - 1 - ((fga) this).field_i) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((fga) this).field_j >= 0) {
                break L10;
              } else {
                if (((fga) this).field_i < var3) {
                  ((fga) this).field_i = var3 + var3 - 1 - ((fga) this).field_i;
                  ((fga) this).field_j = -((fga) this).field_j;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((fga) this).field_i >= var4) {
                ((fga) this).field_i = var4 + var4 - 1 - ((fga) this).field_i;
                ((fga) this).field_j = -((fga) this).field_j;
                if (((fga) this).field_i < var3) {
                  ((fga) this).field_i = var3 + var3 - 1 - ((fga) this).field_i;
                  ((fga) this).field_j = -((fga) this).field_j;
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

    private final void l() {
        if (((fga) this).field_p != 0) {
            if (((fga) this).field_q == -2147483648) {
                ((fga) this).field_q = 0;
            }
            ((fga) this).field_p = 0;
            this.e();
            return;
        }
    }

    final f a() {
        return null;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fga param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_l = param11.field_l - param11.field_h * param5;
            param11.field_v = param11.field_v - param11.field_t * param5;
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
                param11.field_l = param11.field_l + param11.field_h * param5;
                param11.field_v = param11.field_v + param11.field_t * param5;
                param11.field_u = param6;
                param11.field_i = param4;
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

    final synchronized void d(int param0, int param1) {
        ((fga) this).a(param0, param1, ((fga) this).h());
    }

    final synchronized void c(int param0, int param1) {
        ((fga) this).field_q = param0;
        ((fga) this).field_k = param1;
        ((fga) this).field_p = 0;
        this.e();
    }

    final static fga a(gd param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new fga(param0, (int)((long)param0.field_f * 256L * 100L / (long)(100 * vka.field_s)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, fga param8) {
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
        param8.field_i = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, fga param10, int param11, int param12) {
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
                param10.field_i = param4;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fga param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_l = param11.field_l - param11.field_h * param5;
            param11.field_v = param11.field_v - param11.field_t * param5;
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
                param11.field_l = param11.field_l + param11.field_h * param5;
                param11.field_v = param11.field_v + param11.field_t * param5;
                param11.field_u = param6;
                param11.field_i = param4;
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

    final int d() {
        if (((fga) this).field_q == 0) {
            if (((fga) this).field_p == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final void e() {
        ((fga) this).field_u = ((fga) this).field_q;
        ((fga) this).field_l = fga.b(((fga) this).field_q, ((fga) this).field_k);
        ((fga) this).field_v = fga.a(((fga) this).field_q, ((fga) this).field_k);
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((fga) this).field_l == 0) {
            if (((fga) this).field_v == 0) {
              ((fga) this).field_p = 0;
              ((fga) this).field_q = 0;
              ((fga) this).field_u = 0;
              ((fga) this).b(-3846);
              return;
            } else {
              L0: {
                var2 = -((fga) this).field_u;
                if (((fga) this).field_u <= var2) {
                  break L0;
                } else {
                  var2 = ((fga) this).field_u;
                  break L0;
                }
              }
              L1: {
                if (-((fga) this).field_l <= var2) {
                  break L1;
                } else {
                  var2 = -((fga) this).field_l;
                  break L1;
                }
              }
              L2: {
                if (((fga) this).field_l <= var2) {
                  break L2;
                } else {
                  var2 = ((fga) this).field_l;
                  break L2;
                }
              }
              L3: {
                if (-((fga) this).field_v <= var2) {
                  break L3;
                } else {
                  var2 = -((fga) this).field_v;
                  break L3;
                }
              }
              L4: {
                if (((fga) this).field_v <= var2) {
                  break L4;
                } else {
                  var2 = ((fga) this).field_v;
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
              ((fga) this).field_p = param0;
              ((fga) this).field_q = -2147483648;
              ((fga) this).field_m = -((fga) this).field_u / param0;
              ((fga) this).field_h = -((fga) this).field_l / param0;
              ((fga) this).field_t = -((fga) this).field_v / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((fga) this).field_u;
              if (((fga) this).field_u <= var2) {
                break L6;
              } else {
                var2 = ((fga) this).field_u;
                break L6;
              }
            }
            L7: {
              if (-((fga) this).field_l <= var2) {
                break L7;
              } else {
                var2 = -((fga) this).field_l;
                break L7;
              }
            }
            L8: {
              if (((fga) this).field_l <= var2) {
                break L8;
              } else {
                var2 = ((fga) this).field_l;
                break L8;
              }
            }
            L9: {
              if (-((fga) this).field_v <= var2) {
                break L9;
              } else {
                var2 = -((fga) this).field_v;
                break L9;
              }
            }
            L10: {
              if (((fga) this).field_v <= var2) {
                break L10;
              } else {
                var2 = ((fga) this).field_v;
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
            ((fga) this).field_p = param0;
            ((fga) this).field_q = -2147483648;
            ((fga) this).field_m = -((fga) this).field_u / param0;
            ((fga) this).field_h = -((fga) this).field_l / param0;
            ((fga) this).field_t = -((fga) this).field_v / param0;
            return;
          }
        } else {
          ((fga) this).e(0);
          ((fga) this).b(-3846);
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, fga param9) {
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
        param9.field_l = param9.field_l + param9.field_h * (param6 - param3);
        param9.field_v = param9.field_v + param9.field_t * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_i = param2 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, fga param10, int param11, int param12) {
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
                param10.field_i = param4;
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
          if (((fga) this).field_p <= 0) {
            L1: {
              if (((fga) this).field_j != 256) {
                break L1;
              } else {
                if ((((fga) this).field_i & 255) != 0) {
                  break L1;
                } else {
                  if (vka.field_r) {
                    return fga.b(0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, 0, param3, param2, (fga) this);
                  } else {
                    return fga.b(((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, 0, param3, param2, (fga) this);
                  }
                }
              }
            }
            if (vka.field_r) {
              return fga.c(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, 0, param3, param2, (fga) this, ((fga) this).field_j, param4);
            } else {
              return fga.b(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, 0, param3, param2, (fga) this, ((fga) this).field_j, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((fga) this).field_p;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((fga) this).field_p = ((fga) this).field_p + param1;
                if (((fga) this).field_j != 256) {
                  break L4;
                } else {
                  if ((((fga) this).field_i & 255) != 0) {
                    break L4;
                  } else {
                    if (!vka.field_r) {
                      param1 = fga.b(((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, ((fga) this).field_m, 0, var6, param2, (fga) this);
                      break L3;
                    } else {
                      param1 = fga.a(0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, ((fga) this).field_h, ((fga) this).field_t, 0, var6, param2, (fga) this);
                      break L3;
                    }
                  }
                }
              }
              if (!vka.field_r) {
                param1 = fga.b(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, ((fga) this).field_m, 0, var6, param2, (fga) this, ((fga) this).field_j, param4);
                break L3;
              } else {
                param1 = fga.b(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, ((fga) this).field_h, ((fga) this).field_t, 0, var6, param2, (fga) this, ((fga) this).field_j, param4);
                break L3;
              }
            }
            ((fga) this).field_p = ((fga) this).field_p - param1;
            if (((fga) this).field_p == 0) {
              if (!this.j()) {
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, fga param9) {
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
        param9.field_l = param9.field_l + param9.field_h * (param6 - param3);
        param9.field_v = param9.field_v + param9.field_t * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_i = param2 << 8;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, fga param12) {
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
        param12.field_u = param12.field_u + param12.field_m * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_l = param5 >> 2;
                param12.field_v = param6 >> 2;
                param12.field_i = param3 << 8;
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
        return ((fga) this).field_i < 0 || ((fga) this).field_i >= ((gd) (Object) ((fga) this).field_g).field_i.length << 8;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fga param11, int param12, int param13) {
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
                param11.field_i = param4;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, fga param10) {
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
                param10.field_i = param3 << 8;
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

    final synchronized int f() {
        return ((fga) this).field_q == -2147483648 ? 0 : ((fga) this).field_q;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, fga param10) {
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
                param10.field_i = param3 << 8;
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
        gd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((fga) this).field_q != 0) {
            break L0;
          } else {
            if (((fga) this).field_p != 0) {
              break L0;
            } else {
              ((fga) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (gd) (Object) ((fga) this).field_g;
          var5 = ((fga) this).field_n << 8;
          var6 = ((fga) this).field_s << 8;
          var7 = var4.field_i.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((fga) this).field_r = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((fga) this).field_i >= 0) {
            break L2;
          } else {
            if (((fga) this).field_j <= 0) {
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              ((fga) this).field_i = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((fga) this).field_i < var7) {
            break L3;
          } else {
            if (((fga) this).field_j >= 0) {
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              ((fga) this).field_i = var7 - 1;
              break L3;
            }
          }
        }
        if (((fga) this).field_r >= 0) {
          L4: {
            if (((fga) this).field_r <= 0) {
              break L4;
            } else {
              if (!((fga) this).field_o) {
                if (((fga) this).field_j >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((fga) this).field_n]);
                    if (((fga) this).field_i >= var6) {
                      var10 = (((fga) this).field_i - var5) / var8;
                      if (var10 < ((fga) this).field_r) {
                        ((fga) this).field_i = ((fga) this).field_i - var8 * var10;
                        ((fga) this).field_r = ((fga) this).field_r - var10;
                        continue L5;
                      } else {
                        ((fga) this).field_i = ((fga) this).field_i - var8 * ((fga) this).field_r;
                        ((fga) this).field_r = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_s - 1]);
                    if (((fga) this).field_i < var5) {
                      var10 = (var6 - 1 - ((fga) this).field_i) / var8;
                      if (var10 < ((fga) this).field_r) {
                        ((fga) this).field_i = ((fga) this).field_i + var8 * var10;
                        ((fga) this).field_r = ((fga) this).field_r - var10;
                        continue L6;
                      } else {
                        ((fga) this).field_i = ((fga) this).field_i + var8 * ((fga) this).field_r;
                        ((fga) this).field_r = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((fga) this).field_j >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_n]);
                    if (((fga) this).field_i < var5) {
                      ((fga) this).field_i = var5 + var5 - 1 - ((fga) this).field_i;
                      ((fga) this).field_j = -((fga) this).field_j;
                      int fieldTemp$5 = ((fga) this).field_r - 1;
                      ((fga) this).field_r = ((fga) this).field_r - 1;
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((fga) this).field_s - 1]);
                  if (((fga) this).field_i >= var6) {
                    ((fga) this).field_i = var6 + var6 - 1 - ((fga) this).field_i;
                    ((fga) this).field_j = -((fga) this).field_j;
                    int fieldTemp$6 = ((fga) this).field_r - 1;
                    ((fga) this).field_r = ((fga) this).field_r - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_n]);
                      if (((fga) this).field_i < var5) {
                        ((fga) this).field_i = var5 + var5 - 1 - ((fga) this).field_i;
                        ((fga) this).field_j = -((fga) this).field_j;
                        int fieldTemp$7 = ((fga) this).field_r - 1;
                        ((fga) this).field_r = ((fga) this).field_r - 1;
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
          if (((fga) this).field_j < 0) {
            int discarded$8 = this.a(param0, var9, 0, param2, 0);
            if (((fga) this).field_i < 0) {
              ((fga) this).field_i = -1;
              this.l();
              ((fga) this).b(-3846);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.b(param0, var9, var7, param2, 0);
              if (((fga) this).field_i < var7) {
                break L9;
              } else {
                ((fga) this).field_i = var7;
                this.l();
                ((fga) this).b(-3846);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((fga) this).field_o) {
            if (((fga) this).field_j >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((fga) this).field_n]);
                if (((fga) this).field_i >= var6) {
                  ((fga) this).field_i = var5 + (((fga) this).field_i - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_s - 1]);
                if (((fga) this).field_i < var5) {
                  ((fga) this).field_i = var6 - 1 - (var6 - 1 - ((fga) this).field_i) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((fga) this).field_j >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_n]);
                if (((fga) this).field_i < var5) {
                  ((fga) this).field_i = var5 + var5 - 1 - ((fga) this).field_i;
                  ((fga) this).field_j = -((fga) this).field_j;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_i[((fga) this).field_s - 1]);
              if (((fga) this).field_i >= var6) {
                ((fga) this).field_i = var6 + var6 - 1 - ((fga) this).field_i;
                ((fga) this).field_j = -((fga) this).field_j;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_i[((fga) this).field_n]);
                if (((fga) this).field_i < var5) {
                  ((fga) this).field_i = var5 + var5 - 1 - ((fga) this).field_i;
                  ((fga) this).field_j = -((fga) this).field_j;
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

    final int b() {
        int var1 = ((fga) this).field_u * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((fga) this).field_r == 0) {
            var1 = var1 - var1 * ((fga) this).field_i / (((gd) (Object) ((fga) this).field_g).field_i.length << 8);
        } else {
            if (((fga) this).field_r >= 0) {
                var1 = var1 - var1 * ((fga) this).field_n / ((gd) (Object) ((fga) this).field_g).field_i.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final boolean j() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((fga) this).field_q;
          if (var1 != -2147483648) {
            var2 = fga.b(var1, ((fga) this).field_k);
            var3 = fga.a(var1, ((fga) this).field_k);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((fga) this).field_u != var1) {
            break L1;
          } else {
            if (((fga) this).field_l != var2) {
              break L1;
            } else {
              if (((fga) this).field_v == var3) {
                if (((fga) this).field_q == -2147483648) {
                  ((fga) this).field_q = 0;
                  ((fga) this).field_v = 0;
                  ((fga) this).field_l = 0;
                  ((fga) this).field_u = 0;
                  ((fga) this).b(-3846);
                  return true;
                } else {
                  this.e();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((fga) this).field_u >= var1) {
            if (((fga) this).field_u <= var1) {
              ((fga) this).field_m = 0;
              break L2;
            } else {
              ((fga) this).field_m = -1;
              ((fga) this).field_p = ((fga) this).field_u - var1;
              break L2;
            }
          } else {
            ((fga) this).field_m = 1;
            ((fga) this).field_p = var1 - ((fga) this).field_u;
            break L2;
          }
        }
        L3: {
          if (((fga) this).field_l >= var2) {
            if (((fga) this).field_l <= var2) {
              ((fga) this).field_h = 0;
              break L3;
            } else {
              L4: {
                ((fga) this).field_h = -1;
                if (((fga) this).field_p == 0) {
                  break L4;
                } else {
                  if (((fga) this).field_p <= ((fga) this).field_l - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((fga) this).field_p = ((fga) this).field_l - var2;
              break L3;
            }
          } else {
            L5: {
              ((fga) this).field_h = 1;
              if (((fga) this).field_p == 0) {
                break L5;
              } else {
                if (((fga) this).field_p <= var2 - ((fga) this).field_l) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((fga) this).field_p = var2 - ((fga) this).field_l;
            break L3;
          }
        }
        if (((fga) this).field_v < var3) {
          ((fga) this).field_t = 1;
          if (((fga) this).field_p != 0) {
            if (((fga) this).field_p > var3 - ((fga) this).field_v) {
              ((fga) this).field_p = var3 - ((fga) this).field_v;
              return false;
            } else {
              return false;
            }
          } else {
            ((fga) this).field_p = var3 - ((fga) this).field_v;
            return false;
          }
        } else {
          L6: {
            if (((fga) this).field_v <= var3) {
              ((fga) this).field_t = 0;
              break L6;
            } else {
              L7: {
                ((fga) this).field_t = -1;
                if (((fga) this).field_p == 0) {
                  break L7;
                } else {
                  if (((fga) this).field_p <= ((fga) this).field_v - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((fga) this).field_p = ((fga) this).field_v - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final static fga a(gd param0) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new fga(param0, (int)((long)param0.field_f * 256L * 100L / (long)(100 * vka.field_s)), 6144);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = fga.b(param1, param2);
          var5 = fga.a(param1, param2);
          if (((fga) this).field_l == var4) {
            if (((fga) this).field_v == var5) {
              ((fga) this).field_p = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((fga) this).field_u;
                if (((fga) this).field_u - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((fga) this).field_u - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((fga) this).field_l <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((fga) this).field_l;
                  break L1;
                }
              }
              L2: {
                if (((fga) this).field_l - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((fga) this).field_l - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((fga) this).field_v <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((fga) this).field_v;
                  break L3;
                }
              }
              L4: {
                if (((fga) this).field_v - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((fga) this).field_v - var5;
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
              ((fga) this).field_p = param0;
              ((fga) this).field_q = param1;
              ((fga) this).field_k = param2;
              ((fga) this).field_m = (param1 - ((fga) this).field_u) / param0;
              ((fga) this).field_h = (var4 - ((fga) this).field_l) / param0;
              ((fga) this).field_t = (var5 - ((fga) this).field_v) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((fga) this).field_u;
              if (((fga) this).field_u - param1 <= var6) {
                break L6;
              } else {
                var6 = ((fga) this).field_u - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((fga) this).field_l <= var6) {
                break L7;
              } else {
                var6 = var4 - ((fga) this).field_l;
                break L7;
              }
            }
            L8: {
              if (((fga) this).field_l - var4 <= var6) {
                break L8;
              } else {
                var6 = ((fga) this).field_l - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((fga) this).field_v <= var6) {
                break L9;
              } else {
                var6 = var5 - ((fga) this).field_v;
                break L9;
              }
            }
            L10: {
              if (((fga) this).field_v - var5 <= var6) {
                break L10;
              } else {
                var6 = ((fga) this).field_v - var5;
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
            ((fga) this).field_p = param0;
            ((fga) this).field_q = param1;
            ((fga) this).field_k = param2;
            ((fga) this).field_m = (param1 - ((fga) this).field_u) / param0;
            ((fga) this).field_h = (var4 - ((fga) this).field_l) / param0;
            ((fga) this).field_t = (var5 - ((fga) this).field_v) / param0;
            return;
          }
        } else {
          ((fga) this).c(param1, param2);
          return;
        }
    }

    final f c() {
        return null;
    }

    final synchronized int k() {
        return ((fga) this).field_j < 0 ? -((fga) this).field_j : ((fga) this).field_j;
    }

    final synchronized void a(boolean param0) {
        ((fga) this).field_j = (((fga) this).field_j ^ ((fga) this).field_j >> 31) + (((fga) this).field_j >>> 31);
        if (param0) {
          ((fga) this).field_j = -((fga) this).field_j;
          return;
        } else {
          return;
        }
    }

    final synchronized void e(int param0) {
        ((fga) this).c(param0, ((fga) this).h());
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, fga param11, int param12, int param13) {
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
                param11.field_i = param4;
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

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((fga) this).field_p <= 0) {
            L1: {
              if (((fga) this).field_j != -256) {
                break L1;
              } else {
                if ((((fga) this).field_i & 255) != 0) {
                  break L1;
                } else {
                  if (vka.field_r) {
                    return fga.a(0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, 0, param3, param2, (fga) this);
                  } else {
                    return fga.a(((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, 0, param3, param2, (fga) this);
                  }
                }
              }
            }
            if (vka.field_r) {
              return fga.a(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, 0, param3, param2, (fga) this, ((fga) this).field_j, param4);
            } else {
              return fga.a(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, 0, param3, param2, (fga) this, ((fga) this).field_j, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((fga) this).field_p;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((fga) this).field_p = ((fga) this).field_p + param1;
                if (((fga) this).field_j != -256) {
                  break L4;
                } else {
                  if ((((fga) this).field_i & 255) != 0) {
                    break L4;
                  } else {
                    if (!vka.field_r) {
                      param1 = fga.a(((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, ((fga) this).field_m, 0, var6, param2, (fga) this);
                      break L3;
                    } else {
                      param1 = fga.b(0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, ((fga) this).field_h, ((fga) this).field_t, 0, var6, param2, (fga) this);
                      break L3;
                    }
                  }
                }
              }
              if (!vka.field_r) {
                param1 = fga.d(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_u, ((fga) this).field_m, 0, var6, param2, (fga) this, ((fga) this).field_j, param4);
                break L3;
              } else {
                param1 = fga.a(0, 0, ((gd) (Object) ((fga) this).field_g).field_i, param0, ((fga) this).field_i, param1, ((fga) this).field_l, ((fga) this).field_v, ((fga) this).field_h, ((fga) this).field_t, 0, var6, param2, (fga) this, ((fga) this).field_j, param4);
                break L3;
              }
            }
            ((fga) this).field_p = ((fga) this).field_p - param1;
            if (((fga) this).field_p == 0) {
              if (!this.j()) {
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

    private fga(gd param0, int param1, int param2) {
        ((fga) this).field_g = (dl) (Object) param0;
        ((fga) this).field_n = param0.field_g;
        ((fga) this).field_s = param0.field_h;
        ((fga) this).field_o = param0.field_e;
        ((fga) this).field_j = param1;
        ((fga) this).field_q = param2;
        ((fga) this).field_k = 8192;
        ((fga) this).field_i = 0;
        this.e();
    }

    final synchronized boolean g() {
        return ((fga) this).field_p != 0;
    }

    final synchronized void g(int param0) {
        if (((fga) this).field_j < 0) {
            ((fga) this).field_j = -param0;
        } else {
            ((fga) this).field_j = param0;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, fga param12) {
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
        param12.field_u = param12.field_u + param12.field_m * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_l = param5 >> 2;
                param12.field_v = param6 >> 2;
                param12.field_i = param3 << 8;
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

    private fga(gd param0, int param1, int param2, int param3) {
        ((fga) this).field_g = (dl) (Object) param0;
        ((fga) this).field_n = param0.field_g;
        ((fga) this).field_s = param0.field_h;
        ((fga) this).field_o = param0.field_e;
        ((fga) this).field_j = param1;
        ((fga) this).field_q = param2;
        ((fga) this).field_k = param3;
        ((fga) this).field_i = 0;
        this.e();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, fga param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_m * param5;
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
                param13.field_u = param13.field_u + param13.field_m * param5;
                param13.field_l = param6;
                param13.field_v = param7;
                param13.field_i = param4;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, fga param8) {
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
        param8.field_i = param2 << 8;
        return param3;
    }
}
