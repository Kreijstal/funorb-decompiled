/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends we {
    private int field_x;
    private int field_v;
    private int field_u;
    private int field_t;
    private int field_D;
    private int field_F;
    private int field_C;
    private int field_E;
    private boolean field_z;
    private int field_y;
    private int field_A;
    private int field_w;
    private int field_G;
    private int field_s;
    private int field_B;

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, em param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_t = param11.field_t - param11.field_u * param5;
            param11.field_w = param11.field_w - param11.field_A * param5;
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
                param11.field_t = param11.field_t + param11.field_u * param5;
                param11.field_w = param11.field_w + param11.field_A * param5;
                param11.field_s = param6;
                param11.field_v = param4;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, em param11, int param12, int param13) {
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
                param11.field_v = param4;
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

    final synchronized void d(int param0) {
        sk var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((em) this).field_x <= 0) {
            break L0;
          } else {
            if (param0 < ((em) this).field_x) {
              ((em) this).field_s = ((em) this).field_s + ((em) this).field_C * param0;
              ((em) this).field_t = ((em) this).field_t + ((em) this).field_u * param0;
              ((em) this).field_w = ((em) this).field_w + ((em) this).field_A * param0;
              ((em) this).field_x = ((em) this).field_x - param0;
              break L0;
            } else {
              L1: {
                if (((em) this).field_G != -2147483648) {
                  break L1;
                } else {
                  ((em) this).field_G = 0;
                  ((em) this).field_w = 0;
                  ((em) this).field_t = 0;
                  ((em) this).field_s = 0;
                  ((em) this).b(4);
                  param0 = ((em) this).field_x;
                  break L1;
                }
              }
              ((em) this).field_x = 0;
              this.e();
              break L0;
            }
          }
        }
        L2: {
          var2 = (sk) (Object) ((em) this).field_r;
          var3 = ((em) this).field_y << 8;
          var4 = ((em) this).field_D << 8;
          var5 = var2.field_r.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((em) this).field_B = 0;
            break L2;
          }
        }
        L3: {
          if (((em) this).field_v >= 0) {
            break L3;
          } else {
            if (((em) this).field_E <= 0) {
              this.k();
              ((em) this).b(4);
              return;
            } else {
              ((em) this).field_v = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((em) this).field_v < var5) {
            break L4;
          } else {
            if (((em) this).field_E >= 0) {
              this.k();
              ((em) this).b(4);
              return;
            } else {
              ((em) this).field_v = var5 - 1;
              break L4;
            }
          }
        }
        ((em) this).field_v = ((em) this).field_v + ((em) this).field_E * param0;
        if (((em) this).field_B >= 0) {
          L5: {
            if (((em) this).field_B <= 0) {
              break L5;
            } else {
              if (!((em) this).field_z) {
                L6: {
                  if (((em) this).field_E >= 0) {
                    if (((em) this).field_v >= var4) {
                      var7 = (((em) this).field_v - var3) / var6;
                      if (var7 < ((em) this).field_B) {
                        ((em) this).field_v = ((em) this).field_v - var6 * var7;
                        ((em) this).field_B = ((em) this).field_B - var7;
                        break L6;
                      } else {
                        ((em) this).field_v = ((em) this).field_v - var6 * ((em) this).field_B;
                        ((em) this).field_B = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((em) this).field_v < var3) {
                      var7 = (var4 - 1 - ((em) this).field_v) / var6;
                      if (var7 < ((em) this).field_B) {
                        ((em) this).field_v = ((em) this).field_v + var6 * var7;
                        ((em) this).field_B = ((em) this).field_B - var7;
                        break L6;
                      } else {
                        ((em) this).field_v = ((em) this).field_v + var6 * ((em) this).field_B;
                        ((em) this).field_B = 0;
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
                  if (((em) this).field_E >= 0) {
                    break L7;
                  } else {
                    if (((em) this).field_v < var3) {
                      ((em) this).field_v = var3 + var3 - 1 - ((em) this).field_v;
                      ((em) this).field_E = -((em) this).field_E;
                      int fieldTemp$3 = ((em) this).field_B - 1;
                      ((em) this).field_B = ((em) this).field_B - 1;
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
                  if (((em) this).field_v >= var4) {
                    ((em) this).field_v = var4 + var4 - 1 - ((em) this).field_v;
                    ((em) this).field_E = -((em) this).field_E;
                    int fieldTemp$4 = ((em) this).field_B - 1;
                    ((em) this).field_B = ((em) this).field_B - 1;
                    if (fieldTemp$4 != 0) {
                      if (((em) this).field_v < var3) {
                        ((em) this).field_v = var3 + var3 - 1 - ((em) this).field_v;
                        ((em) this).field_E = -((em) this).field_E;
                        int fieldTemp$5 = ((em) this).field_B - 1;
                        ((em) this).field_B = ((em) this).field_B - 1;
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
          if (((em) this).field_E < 0) {
            if (((em) this).field_v < 0) {
              ((em) this).field_v = -1;
              this.k();
              ((em) this).b(4);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((em) this).field_v < var5) {
                break L9;
              } else {
                ((em) this).field_v = var5;
                this.k();
                ((em) this).b(4);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((em) this).field_z) {
            if (((em) this).field_E >= 0) {
              if (((em) this).field_v < var4) {
                return;
              } else {
                ((em) this).field_v = var3 + (((em) this).field_v - var3) % var6;
                return;
              }
            } else {
              if (((em) this).field_v < var3) {
                ((em) this).field_v = var4 - 1 - (var4 - 1 - ((em) this).field_v) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((em) this).field_E >= 0) {
                break L10;
              } else {
                if (((em) this).field_v < var3) {
                  ((em) this).field_v = var3 + var3 - 1 - ((em) this).field_v;
                  ((em) this).field_E = -((em) this).field_E;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((em) this).field_v >= var4) {
                ((em) this).field_v = var4 + var4 - 1 - ((em) this).field_v;
                ((em) this).field_E = -((em) this).field_E;
                if (((em) this).field_v < var3) {
                  ((em) this).field_v = var3 + var3 - 1 - ((em) this).field_v;
                  ((em) this).field_E = -((em) this).field_E;
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

    final synchronized int j() {
        return ((em) this).field_E < 0 ? -((em) this).field_E : ((em) this).field_E;
    }

    final we b() {
        return null;
    }

    final static em a(sk param0, int param1, int param2) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new em(param0, (int)((long)param0.field_p * 256L * 100L / (long)(100 * tb.field_g)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final void k() {
        if (((em) this).field_x != 0) {
            if (((em) this).field_G == -2147483648) {
                ((em) this).field_G = 0;
            }
            ((em) this).field_x = 0;
            this.e();
            return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, em param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, em param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_s = param13.field_s - param13.field_C * param5;
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
                param13.field_s = param13.field_s + param13.field_C * param5;
                param13.field_t = param6;
                param13.field_w = param7;
                param13.field_v = param4;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, em param9) {
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
        param9.field_t = param9.field_t + param9.field_u * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_A * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_s = param4 >> 2;
                param9.field_v = param2 << 8;
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

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = em.d(param1, param2);
          var5 = em.a(param1, param2);
          if (((em) this).field_t == var4) {
            if (((em) this).field_w == var5) {
              ((em) this).field_x = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((em) this).field_s;
                if (((em) this).field_s - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((em) this).field_s - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((em) this).field_t <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((em) this).field_t;
                  break L1;
                }
              }
              L2: {
                if (((em) this).field_t - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((em) this).field_t - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((em) this).field_w <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((em) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((em) this).field_w - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((em) this).field_w - var5;
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
              ((em) this).field_x = param0;
              ((em) this).field_G = param1;
              ((em) this).field_F = param2;
              ((em) this).field_C = (param1 - ((em) this).field_s) / param0;
              ((em) this).field_u = (var4 - ((em) this).field_t) / param0;
              ((em) this).field_A = (var5 - ((em) this).field_w) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((em) this).field_s;
              if (((em) this).field_s - param1 <= var6) {
                break L6;
              } else {
                var6 = ((em) this).field_s - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((em) this).field_t <= var6) {
                break L7;
              } else {
                var6 = var4 - ((em) this).field_t;
                break L7;
              }
            }
            L8: {
              if (((em) this).field_t - var4 <= var6) {
                break L8;
              } else {
                var6 = ((em) this).field_t - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((em) this).field_w <= var6) {
                break L9;
              } else {
                var6 = var5 - ((em) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((em) this).field_w - var5 <= var6) {
                break L10;
              } else {
                var6 = ((em) this).field_w - var5;
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
            ((em) this).field_x = param0;
            ((em) this).field_G = param1;
            ((em) this).field_F = param2;
            ((em) this).field_C = (param1 - ((em) this).field_s) / param0;
            ((em) this).field_u = (var4 - ((em) this).field_t) / param0;
            ((em) this).field_A = (var5 - ((em) this).field_w) / param0;
            return;
          }
        } else {
          this.c(param1, param2);
          return;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, em param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_s = param13.field_s - param13.field_C * param5;
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
                param13.field_s = param13.field_s + param13.field_C * param5;
                param13.field_t = param6;
                param13.field_w = param7;
                param13.field_v = param4;
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

    final synchronized void i(int param0) {
        int var2 = ((sk) (Object) ((em) this).field_r).field_r.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((em) this).field_v = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, em param11, int param12, int param13) {
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
                param11.field_v = param4;
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
          if (((em) this).field_x <= 0) {
            L1: {
              if (((em) this).field_E != -256) {
                break L1;
              } else {
                if ((((em) this).field_v & 255) != 0) {
                  break L1;
                } else {
                  if (tb.field_b) {
                    return em.b(0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, 0, param3, param2, (em) this);
                  } else {
                    return em.b(((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, 0, param3, param2, (em) this);
                  }
                }
              }
            }
            if (tb.field_b) {
              return em.a(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, 0, param3, param2, (em) this, ((em) this).field_E, param4);
            } else {
              return em.a(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, 0, param3, param2, (em) this, ((em) this).field_E, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((em) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((em) this).field_x = ((em) this).field_x + param1;
                if (((em) this).field_E != -256) {
                  break L4;
                } else {
                  if ((((em) this).field_v & 255) != 0) {
                    break L4;
                  } else {
                    if (!tb.field_b) {
                      param1 = em.b(((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, ((em) this).field_C, 0, var6, param2, (em) this);
                      break L3;
                    } else {
                      param1 = em.a(0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, ((em) this).field_u, ((em) this).field_A, 0, var6, param2, (em) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tb.field_b) {
                param1 = em.c(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, ((em) this).field_C, 0, var6, param2, (em) this, ((em) this).field_E, param4);
                break L3;
              } else {
                param1 = em.a(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, ((em) this).field_u, ((em) this).field_A, 0, var6, param2, (em) this, ((em) this).field_E, param4);
                break L3;
              }
            }
            ((em) this).field_x = ((em) this).field_x - param1;
            if (((em) this).field_x == 0) {
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

    final synchronized void a(int[] param0, int param1, int param2) {
        sk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((em) this).field_G != 0) {
            break L0;
          } else {
            if (((em) this).field_x != 0) {
              break L0;
            } else {
              ((em) this).d(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (sk) (Object) ((em) this).field_r;
          var5 = ((em) this).field_y << 8;
          var6 = ((em) this).field_D << 8;
          var7 = var4.field_r.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((em) this).field_B = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((em) this).field_v >= 0) {
            break L2;
          } else {
            if (((em) this).field_E <= 0) {
              this.k();
              ((em) this).b(4);
              return;
            } else {
              ((em) this).field_v = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((em) this).field_v < var7) {
            break L3;
          } else {
            if (((em) this).field_E >= 0) {
              this.k();
              ((em) this).b(4);
              return;
            } else {
              ((em) this).field_v = var7 - 1;
              break L3;
            }
          }
        }
        if (((em) this).field_B >= 0) {
          L4: {
            if (((em) this).field_B <= 0) {
              break L4;
            } else {
              if (!((em) this).field_z) {
                if (((em) this).field_E >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_r[((em) this).field_y]);
                    if (((em) this).field_v >= var6) {
                      var10 = (((em) this).field_v - var5) / var8;
                      if (var10 < ((em) this).field_B) {
                        ((em) this).field_v = ((em) this).field_v - var8 * var10;
                        ((em) this).field_B = ((em) this).field_B - var10;
                        continue L5;
                      } else {
                        ((em) this).field_v = ((em) this).field_v - var8 * ((em) this).field_B;
                        ((em) this).field_B = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_D - 1]);
                    if (((em) this).field_v < var5) {
                      var10 = (var6 - 1 - ((em) this).field_v) / var8;
                      if (var10 < ((em) this).field_B) {
                        ((em) this).field_v = ((em) this).field_v + var8 * var10;
                        ((em) this).field_B = ((em) this).field_B - var10;
                        continue L6;
                      } else {
                        ((em) this).field_v = ((em) this).field_v + var8 * ((em) this).field_B;
                        ((em) this).field_B = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((em) this).field_E >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_y]);
                    if (((em) this).field_v < var5) {
                      ((em) this).field_v = var5 + var5 - 1 - ((em) this).field_v;
                      ((em) this).field_E = -((em) this).field_E;
                      int fieldTemp$5 = ((em) this).field_B - 1;
                      ((em) this).field_B = ((em) this).field_B - 1;
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_r[((em) this).field_D - 1]);
                  if (((em) this).field_v >= var6) {
                    ((em) this).field_v = var6 + var6 - 1 - ((em) this).field_v;
                    ((em) this).field_E = -((em) this).field_E;
                    int fieldTemp$6 = ((em) this).field_B - 1;
                    ((em) this).field_B = ((em) this).field_B - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_y]);
                      if (((em) this).field_v < var5) {
                        ((em) this).field_v = var5 + var5 - 1 - ((em) this).field_v;
                        ((em) this).field_E = -((em) this).field_E;
                        int fieldTemp$7 = ((em) this).field_B - 1;
                        ((em) this).field_B = ((em) this).field_B - 1;
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
          if (((em) this).field_E < 0) {
            int discarded$8 = this.a(param0, var9, 0, param2, 0);
            if (((em) this).field_v < 0) {
              ((em) this).field_v = -1;
              this.k();
              ((em) this).b(4);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.b(param0, var9, var7, param2, 0);
              if (((em) this).field_v < var7) {
                break L9;
              } else {
                ((em) this).field_v = var7;
                this.k();
                ((em) this).b(4);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((em) this).field_z) {
            if (((em) this).field_E >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_r[((em) this).field_y]);
                if (((em) this).field_v >= var6) {
                  ((em) this).field_v = var5 + (((em) this).field_v - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_D - 1]);
                if (((em) this).field_v < var5) {
                  ((em) this).field_v = var6 - 1 - (var6 - 1 - ((em) this).field_v) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((em) this).field_E >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_y]);
                if (((em) this).field_v < var5) {
                  ((em) this).field_v = var5 + var5 - 1 - ((em) this).field_v;
                  ((em) this).field_E = -((em) this).field_E;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_r[((em) this).field_D - 1]);
              if (((em) this).field_v >= var6) {
                ((em) this).field_v = var6 + var6 - 1 - ((em) this).field_v;
                ((em) this).field_E = -((em) this).field_E;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_r[((em) this).field_y]);
                if (((em) this).field_v < var5) {
                  ((em) this).field_v = var5 + var5 - 1 - ((em) this).field_v;
                  ((em) this).field_E = -((em) this).field_E;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, em param10, int param11, int param12) {
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
                param10.field_v = param4;
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

    final synchronized int f() {
        return ((em) this).field_G == -2147483648 ? 0 : ((em) this).field_G;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, em param10) {
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

    final synchronized boolean l() {
        return ((em) this).field_x != 0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, em param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_t = param11.field_t - param11.field_u * param5;
            param11.field_w = param11.field_w - param11.field_A * param5;
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
                param11.field_t = param11.field_t + param11.field_u * param5;
                param11.field_w = param11.field_w + param11.field_A * param5;
                param11.field_s = param6;
                param11.field_v = param4;
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

    final synchronized void h(int param0) {
        ((em) this).field_B = param0;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, em param9) {
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
        param9.field_t = param9.field_t + param9.field_u * (param6 - param3);
        param9.field_w = param9.field_w + param9.field_A * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_s = param4 >> 2;
                param9.field_v = param2 << 8;
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

    private final boolean h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((em) this).field_G;
          if (var1 != -2147483648) {
            var2 = em.d(var1, ((em) this).field_F);
            var3 = em.a(var1, ((em) this).field_F);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((em) this).field_s != var1) {
            break L1;
          } else {
            if (((em) this).field_t != var2) {
              break L1;
            } else {
              if (((em) this).field_w == var3) {
                if (((em) this).field_G == -2147483648) {
                  ((em) this).field_G = 0;
                  ((em) this).field_w = 0;
                  ((em) this).field_t = 0;
                  ((em) this).field_s = 0;
                  ((em) this).b(4);
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
          if (((em) this).field_s >= var1) {
            if (((em) this).field_s <= var1) {
              ((em) this).field_C = 0;
              break L2;
            } else {
              ((em) this).field_C = -1;
              ((em) this).field_x = ((em) this).field_s - var1;
              break L2;
            }
          } else {
            ((em) this).field_C = 1;
            ((em) this).field_x = var1 - ((em) this).field_s;
            break L2;
          }
        }
        L3: {
          if (((em) this).field_t >= var2) {
            if (((em) this).field_t <= var2) {
              ((em) this).field_u = 0;
              break L3;
            } else {
              L4: {
                ((em) this).field_u = -1;
                if (((em) this).field_x == 0) {
                  break L4;
                } else {
                  if (((em) this).field_x <= ((em) this).field_t - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((em) this).field_x = ((em) this).field_t - var2;
              break L3;
            }
          } else {
            L5: {
              ((em) this).field_u = 1;
              if (((em) this).field_x == 0) {
                break L5;
              } else {
                if (((em) this).field_x <= var2 - ((em) this).field_t) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((em) this).field_x = var2 - ((em) this).field_t;
            break L3;
          }
        }
        if (((em) this).field_w < var3) {
          ((em) this).field_A = 1;
          if (((em) this).field_x != 0) {
            if (((em) this).field_x > var3 - ((em) this).field_w) {
              ((em) this).field_x = var3 - ((em) this).field_w;
              return false;
            } else {
              return false;
            }
          } else {
            ((em) this).field_x = var3 - ((em) this).field_w;
            return false;
          }
        } else {
          L6: {
            if (((em) this).field_w <= var3) {
              ((em) this).field_A = 0;
              break L6;
            } else {
              L7: {
                ((em) this).field_A = -1;
                if (((em) this).field_x == 0) {
                  break L7;
                } else {
                  if (((em) this).field_x <= ((em) this).field_w - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((em) this).field_x = ((em) this).field_w - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, em param8) {
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
        param8.field_v = param2 << 8;
        return param3;
    }

    final synchronized void a(boolean param0) {
        ((em) this).field_E = (((em) this).field_E ^ ((em) this).field_E >> 31) + (((em) this).field_E >>> 31);
        if (param0) {
          ((em) this).field_E = -((em) this).field_E;
          return;
        } else {
          return;
        }
    }

    final synchronized void g(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((em) this).field_t == 0) {
            if (((em) this).field_w == 0) {
              ((em) this).field_x = 0;
              ((em) this).field_G = 0;
              ((em) this).field_s = 0;
              ((em) this).b(4);
              return;
            } else {
              L0: {
                var2 = -((em) this).field_s;
                if (((em) this).field_s <= var2) {
                  break L0;
                } else {
                  var2 = ((em) this).field_s;
                  break L0;
                }
              }
              L1: {
                if (-((em) this).field_t <= var2) {
                  break L1;
                } else {
                  var2 = -((em) this).field_t;
                  break L1;
                }
              }
              L2: {
                if (((em) this).field_t <= var2) {
                  break L2;
                } else {
                  var2 = ((em) this).field_t;
                  break L2;
                }
              }
              L3: {
                if (-((em) this).field_w <= var2) {
                  break L3;
                } else {
                  var2 = -((em) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((em) this).field_w <= var2) {
                  break L4;
                } else {
                  var2 = ((em) this).field_w;
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
              ((em) this).field_x = param0;
              ((em) this).field_G = -2147483648;
              ((em) this).field_C = -((em) this).field_s / param0;
              ((em) this).field_u = -((em) this).field_t / param0;
              ((em) this).field_A = -((em) this).field_w / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((em) this).field_s;
              if (((em) this).field_s <= var2) {
                break L6;
              } else {
                var2 = ((em) this).field_s;
                break L6;
              }
            }
            L7: {
              if (-((em) this).field_t <= var2) {
                break L7;
              } else {
                var2 = -((em) this).field_t;
                break L7;
              }
            }
            L8: {
              if (((em) this).field_t <= var2) {
                break L8;
              } else {
                var2 = ((em) this).field_t;
                break L8;
              }
            }
            L9: {
              if (-((em) this).field_w <= var2) {
                break L9;
              } else {
                var2 = -((em) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((em) this).field_w <= var2) {
                break L10;
              } else {
                var2 = ((em) this).field_w;
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
            ((em) this).field_x = param0;
            ((em) this).field_G = -2147483648;
            ((em) this).field_C = -((em) this).field_s / param0;
            ((em) this).field_u = -((em) this).field_t / param0;
            ((em) this).field_A = -((em) this).field_w / param0;
            return;
          }
        } else {
          ((em) this).e(0);
          ((em) this).b(4);
          return;
        }
    }

    final int a() {
        if (((em) this).field_G == 0) {
            if (((em) this).field_x == 0) {
                return 0;
            }
        }
        return 1;
    }

    final we d() {
        return null;
    }

    private final void e() {
        ((em) this).field_s = ((em) this).field_G;
        ((em) this).field_t = em.d(((em) this).field_G, ((em) this).field_F);
        ((em) this).field_w = em.a(((em) this).field_G, ((em) this).field_F);
    }

    final synchronized int i() {
        return ((em) this).field_F < 0 ? -1 : ((em) this).field_F;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, em param12) {
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
        param12.field_s = param12.field_s + param12.field_C * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_t = param5 >> 2;
                param12.field_w = param6 >> 2;
                param12.field_v = param3 << 8;
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

    final int c() {
        int var1 = ((em) this).field_s * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((em) this).field_B == 0) {
            var1 = var1 - var1 * ((em) this).field_v / (((sk) (Object) ((em) this).field_r).field_r.length << 8);
        } else {
            if (((em) this).field_B >= 0) {
                var1 = var1 - var1 * ((em) this).field_y / ((sk) (Object) ((em) this).field_r).field_r.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, em param10) {
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

    final static em a(sk param0, int param1, int param2, int param3) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new em(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, em param10, int param11, int param12) {
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
                param10.field_v = param4;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((em) this).field_x <= 0) {
            L1: {
              if (((em) this).field_E != 256) {
                break L1;
              } else {
                if ((((em) this).field_v & 255) != 0) {
                  break L1;
                } else {
                  if (tb.field_b) {
                    return em.a(0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, 0, param3, param2, (em) this);
                  } else {
                    return em.a(((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, 0, param3, param2, (em) this);
                  }
                }
              }
            }
            if (tb.field_b) {
              return em.d(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, 0, param3, param2, (em) this, ((em) this).field_E, param4);
            } else {
              return em.b(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, 0, param3, param2, (em) this, ((em) this).field_E, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((em) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((em) this).field_x = ((em) this).field_x + param1;
                if (((em) this).field_E != 256) {
                  break L4;
                } else {
                  if ((((em) this).field_v & 255) != 0) {
                    break L4;
                  } else {
                    if (!tb.field_b) {
                      param1 = em.a(((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, ((em) this).field_C, 0, var6, param2, (em) this);
                      break L3;
                    } else {
                      param1 = em.b(0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, ((em) this).field_u, ((em) this).field_A, 0, var6, param2, (em) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tb.field_b) {
                param1 = em.b(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_s, ((em) this).field_C, 0, var6, param2, (em) this, ((em) this).field_E, param4);
                break L3;
              } else {
                param1 = em.b(0, 0, ((sk) (Object) ((em) this).field_r).field_r, param0, ((em) this).field_v, param1, ((em) this).field_t, ((em) this).field_w, ((em) this).field_u, ((em) this).field_A, 0, var6, param2, (em) this, ((em) this).field_E, param4);
                break L3;
              }
            }
            ((em) this).field_x = ((em) this).field_x - param1;
            if (((em) this).field_x == 0) {
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

    final synchronized void b(int param0, int param1) {
        ((em) this).a(param0, param1, ((em) this).i());
    }

    final synchronized void e(int param0) {
        this.c(param0, ((em) this).i());
    }

    final static em b(sk param0, int param1, int param2, int param3) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new em(param0, (int)((long)param0.field_p * 256L * 100L / (long)(100 * tb.field_g)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized boolean g() {
        return ((em) this).field_v < 0 || ((em) this).field_v >= ((sk) (Object) ((em) this).field_r).field_r.length << 8;
    }

    private final synchronized void c(int param0, int param1) {
        ((em) this).field_G = param0;
        ((em) this).field_F = param1;
        ((em) this).field_x = 0;
        this.e();
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private em(sk param0, int param1, int param2) {
        ((em) this).field_r = (md) (Object) param0;
        ((em) this).field_y = param0.field_q;
        ((em) this).field_D = param0.field_t;
        ((em) this).field_z = param0.field_s;
        ((em) this).field_E = param1;
        ((em) this).field_G = param2;
        ((em) this).field_F = 8192;
        ((em) this).field_v = 0;
        this.e();
    }

    final synchronized void f(int param0) {
        if (((em) this).field_E < 0) {
            ((em) this).field_E = -param0;
        } else {
            ((em) this).field_E = param0;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, em param12) {
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
        param12.field_s = param12.field_s + param12.field_C * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_t = param5 >> 2;
                param12.field_w = param6 >> 2;
                param12.field_v = param3 << 8;
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

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private em(sk param0, int param1, int param2, int param3) {
        ((em) this).field_r = (md) (Object) param0;
        ((em) this).field_y = param0.field_q;
        ((em) this).field_D = param0.field_t;
        ((em) this).field_z = param0.field_s;
        ((em) this).field_E = param1;
        ((em) this).field_G = param2;
        ((em) this).field_F = param3;
        ((em) this).field_v = 0;
        this.e();
    }
}
