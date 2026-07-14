/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends kd {
    private int field_x;
    private int field_t;
    private int field_A;
    private int field_C;
    private int field_r;
    private int field_z;
    private boolean field_y;
    private int field_u;
    private int field_s;
    private int field_w;
    private int field_D;
    private int field_p;
    private int field_B;
    private int field_v;
    private int field_q;

    final synchronized int n() {
        return ((nb) this).field_B < 0 ? -1 : ((nb) this).field_B + 32 >> 6;
    }

    private final void h() {
        ((nb) this).field_v = ((nb) this).field_x;
        ((nb) this).field_r = nb.a(((nb) this).field_x, ((nb) this).field_B);
        ((nb) this).field_s = nb.e(((nb) this).field_x, ((nb) this).field_B);
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nb param11, int param12, int param13) {
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nb param11, int param12, int param13) {
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

    final synchronized void e(int param0) {
        ((nb) this).field_p = param0;
    }

    final int d() {
        if (((nb) this).field_x == 0) {
            if (((nb) this).field_A == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized void a(boolean param0) {
        ((nb) this).field_w = (((nb) this).field_w ^ ((nb) this).field_w >> 31) + (((nb) this).field_w >>> 31);
        if (param0) {
          ((nb) this).field_w = -((nb) this).field_w;
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        jg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((nb) this).field_x != 0) {
            break L0;
          } else {
            if (((nb) this).field_A != 0) {
              break L0;
            } else {
              ((nb) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (jg) (Object) ((nb) this).field_n;
          var5 = ((nb) this).field_C << 8;
          var6 = ((nb) this).field_z << 8;
          var7 = var4.field_n.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((nb) this).field_p = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((nb) this).field_t >= 0) {
            break L2;
          } else {
            if (((nb) this).field_w <= 0) {
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              ((nb) this).field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((nb) this).field_t < var7) {
            break L3;
          } else {
            if (((nb) this).field_w >= 0) {
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              ((nb) this).field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (((nb) this).field_p >= 0) {
          L4: {
            if (((nb) this).field_p <= 0) {
              break L4;
            } else {
              if (!((nb) this).field_y) {
                if (((nb) this).field_w >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((nb) this).field_C]);
                    if (((nb) this).field_t >= var6) {
                      var10 = (((nb) this).field_t - var5) / var8;
                      if (var10 < ((nb) this).field_p) {
                        ((nb) this).field_t = ((nb) this).field_t - var8 * var10;
                        ((nb) this).field_p = ((nb) this).field_p - var10;
                        continue L5;
                      } else {
                        ((nb) this).field_t = ((nb) this).field_t - var8 * ((nb) this).field_p;
                        ((nb) this).field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_z - 1]);
                    if (((nb) this).field_t < var5) {
                      var10 = (var6 - 1 - ((nb) this).field_t) / var8;
                      if (var10 < ((nb) this).field_p) {
                        ((nb) this).field_t = ((nb) this).field_t + var8 * var10;
                        ((nb) this).field_p = ((nb) this).field_p - var10;
                        continue L6;
                      } else {
                        ((nb) this).field_t = ((nb) this).field_t + var8 * ((nb) this).field_p;
                        ((nb) this).field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((nb) this).field_w >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_C]);
                    if (((nb) this).field_t < var5) {
                      ((nb) this).field_t = var5 + var5 - 1 - ((nb) this).field_t;
                      ((nb) this).field_w = -((nb) this).field_w;
                      ((nb) this).field_p = ((nb) this).field_p - 1;
                      if (((nb) this).field_p - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((nb) this).field_z - 1]);
                  if (((nb) this).field_t >= var6) {
                    ((nb) this).field_t = var6 + var6 - 1 - ((nb) this).field_t;
                    ((nb) this).field_w = -((nb) this).field_w;
                    ((nb) this).field_p = ((nb) this).field_p - 1;
                    if (((nb) this).field_p - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_C]);
                      if (((nb) this).field_t < var5) {
                        ((nb) this).field_t = var5 + var5 - 1 - ((nb) this).field_t;
                        ((nb) this).field_w = -((nb) this).field_w;
                        ((nb) this).field_p = ((nb) this).field_p - 1;
                        if (((nb) this).field_p - 1 != 0) {
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
          if (((nb) this).field_w < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((nb) this).field_t < 0) {
              ((nb) this).field_t = -1;
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((nb) this).field_t < var7) {
                break L9;
              } else {
                ((nb) this).field_t = var7;
                this.k();
                ((nb) this).a((byte) -117);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((nb) this).field_y) {
            if (((nb) this).field_w >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((nb) this).field_C]);
                if (((nb) this).field_t >= var6) {
                  ((nb) this).field_t = var5 + (((nb) this).field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_z - 1]);
                if (((nb) this).field_t < var5) {
                  ((nb) this).field_t = var6 - 1 - (var6 - 1 - ((nb) this).field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((nb) this).field_w >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_C]);
                if (((nb) this).field_t < var5) {
                  ((nb) this).field_t = var5 + var5 - 1 - ((nb) this).field_t;
                  ((nb) this).field_w = -((nb) this).field_w;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_n[((nb) this).field_z - 1]);
              if (((nb) this).field_t >= var6) {
                ((nb) this).field_t = var6 + var6 - 1 - ((nb) this).field_t;
                ((nb) this).field_w = -((nb) this).field_w;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_n[((nb) this).field_C]);
                if (((nb) this).field_t < var5) {
                  ((nb) this).field_t = var5 + var5 - 1 - ((nb) this).field_t;
                  ((nb) this).field_w = -((nb) this).field_w;
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

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, nb param8) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, nb param10, int param11, int param12) {
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

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = nb.a(param1, param2);
          var5 = nb.e(param1, param2);
          if (((nb) this).field_r == var4) {
            if (((nb) this).field_s == var5) {
              ((nb) this).field_A = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((nb) this).field_v;
                if (((nb) this).field_v - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((nb) this).field_v - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((nb) this).field_r <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((nb) this).field_r;
                  break L1;
                }
              }
              L2: {
                if (((nb) this).field_r - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((nb) this).field_r - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((nb) this).field_s <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((nb) this).field_s;
                  break L3;
                }
              }
              L4: {
                if (((nb) this).field_s - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((nb) this).field_s - var5;
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
              ((nb) this).field_A = param0;
              ((nb) this).field_x = param1;
              ((nb) this).field_B = param2;
              ((nb) this).field_D = (param1 - ((nb) this).field_v) / param0;
              ((nb) this).field_u = (var4 - ((nb) this).field_r) / param0;
              ((nb) this).field_q = (var5 - ((nb) this).field_s) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((nb) this).field_v;
              if (((nb) this).field_v - param1 <= var6) {
                break L6;
              } else {
                var6 = ((nb) this).field_v - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((nb) this).field_r <= var6) {
                break L7;
              } else {
                var6 = var4 - ((nb) this).field_r;
                break L7;
              }
            }
            L8: {
              if (((nb) this).field_r - var4 <= var6) {
                break L8;
              } else {
                var6 = ((nb) this).field_r - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((nb) this).field_s <= var6) {
                break L9;
              } else {
                var6 = var5 - ((nb) this).field_s;
                break L9;
              }
            }
            L10: {
              if (((nb) this).field_s - var5 <= var6) {
                break L10;
              } else {
                var6 = ((nb) this).field_s - var5;
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
            ((nb) this).field_A = param0;
            ((nb) this).field_x = param1;
            ((nb) this).field_B = param2;
            ((nb) this).field_D = (param1 - ((nb) this).field_v) / param0;
            ((nb) this).field_u = (var4 - ((nb) this).field_r) / param0;
            ((nb) this).field_q = (var5 - ((nb) this).field_s) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, nb param10) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, nb param8) {
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

    final synchronized void f(int param0) {
        if (((nb) this).field_w < 0) {
            ((nb) this).field_w = -param0;
        } else {
            ((nb) this).field_w = param0;
        }
    }

    final synchronized void g(int param0) {
        int var2 = ((jg) (Object) ((nb) this).field_n).field_n.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((nb) this).field_t = param0;
    }

    final synchronized boolean g() {
        return ((nb) this).field_A != 0;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nb param12) {
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
        param12.field_v = param12.field_v + param12.field_D * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_r = param5 >> 2;
                param12.field_s = param6 >> 2;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nb param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_r = param11.field_r - param11.field_u * param5;
            param11.field_s = param11.field_s - param11.field_q * param5;
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
                param11.field_r = param11.field_r + param11.field_u * param5;
                param11.field_s = param11.field_s + param11.field_q * param5;
                param11.field_v = param6;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, nb param9) {
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
        param9.field_r = param9.field_r + param9.field_u * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_v = param4 >> 2;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nb param12) {
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
        param12.field_v = param12.field_v + param12.field_D * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_r = param5 >> 2;
                param12.field_s = param6 >> 2;
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

    final synchronized void c(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((nb) this).field_r == 0) {
            if (((nb) this).field_s == 0) {
              ((nb) this).field_A = 0;
              ((nb) this).field_x = 0;
              ((nb) this).field_v = 0;
              ((nb) this).a((byte) -117);
              return;
            } else {
              L0: {
                var2 = -((nb) this).field_v;
                if (((nb) this).field_v <= var2) {
                  break L0;
                } else {
                  var2 = ((nb) this).field_v;
                  break L0;
                }
              }
              L1: {
                if (-((nb) this).field_r <= var2) {
                  break L1;
                } else {
                  var2 = -((nb) this).field_r;
                  break L1;
                }
              }
              L2: {
                if (((nb) this).field_r <= var2) {
                  break L2;
                } else {
                  var2 = ((nb) this).field_r;
                  break L2;
                }
              }
              L3: {
                if (-((nb) this).field_s <= var2) {
                  break L3;
                } else {
                  var2 = -((nb) this).field_s;
                  break L3;
                }
              }
              L4: {
                if (((nb) this).field_s <= var2) {
                  break L4;
                } else {
                  var2 = ((nb) this).field_s;
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
              ((nb) this).field_A = param0;
              ((nb) this).field_x = -2147483648;
              ((nb) this).field_D = -((nb) this).field_v / param0;
              ((nb) this).field_u = -((nb) this).field_r / param0;
              ((nb) this).field_q = -((nb) this).field_s / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((nb) this).field_v;
              if (((nb) this).field_v <= var2) {
                break L6;
              } else {
                var2 = ((nb) this).field_v;
                break L6;
              }
            }
            L7: {
              if (-((nb) this).field_r <= var2) {
                break L7;
              } else {
                var2 = -((nb) this).field_r;
                break L7;
              }
            }
            L8: {
              if (((nb) this).field_r <= var2) {
                break L8;
              } else {
                var2 = ((nb) this).field_r;
                break L8;
              }
            }
            L9: {
              if (-((nb) this).field_s <= var2) {
                break L9;
              } else {
                var2 = -((nb) this).field_s;
                break L9;
              }
            }
            L10: {
              if (((nb) this).field_s <= var2) {
                break L10;
              } else {
                var2 = ((nb) this).field_s;
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
            ((nb) this).field_A = param0;
            ((nb) this).field_x = -2147483648;
            ((nb) this).field_D = -((nb) this).field_v / param0;
            ((nb) this).field_u = -((nb) this).field_r / param0;
            ((nb) this).field_q = -((nb) this).field_s / param0;
            return;
          }
        } else {
          ((nb) this).d(0);
          ((nb) this).a((byte) -117);
          return;
        }
    }

    final synchronized void a(int param0) {
        jg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((nb) this).field_A <= 0) {
            break L0;
          } else {
            if (param0 < ((nb) this).field_A) {
              ((nb) this).field_v = ((nb) this).field_v + ((nb) this).field_D * param0;
              ((nb) this).field_r = ((nb) this).field_r + ((nb) this).field_u * param0;
              ((nb) this).field_s = ((nb) this).field_s + ((nb) this).field_q * param0;
              ((nb) this).field_A = ((nb) this).field_A - param0;
              break L0;
            } else {
              L1: {
                if (((nb) this).field_x != -2147483648) {
                  break L1;
                } else {
                  ((nb) this).field_x = 0;
                  ((nb) this).field_s = 0;
                  ((nb) this).field_r = 0;
                  ((nb) this).field_v = 0;
                  ((nb) this).a((byte) -117);
                  param0 = ((nb) this).field_A;
                  break L1;
                }
              }
              ((nb) this).field_A = 0;
              this.h();
              break L0;
            }
          }
        }
        L2: {
          var2 = (jg) (Object) ((nb) this).field_n;
          var3 = ((nb) this).field_C << 8;
          var4 = ((nb) this).field_z << 8;
          var5 = var2.field_n.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((nb) this).field_p = 0;
            break L2;
          }
        }
        L3: {
          if (((nb) this).field_t >= 0) {
            break L3;
          } else {
            if (((nb) this).field_w <= 0) {
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              ((nb) this).field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((nb) this).field_t < var5) {
            break L4;
          } else {
            if (((nb) this).field_w >= 0) {
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              ((nb) this).field_t = var5 - 1;
              break L4;
            }
          }
        }
        ((nb) this).field_t = ((nb) this).field_t + ((nb) this).field_w * param0;
        if (((nb) this).field_p >= 0) {
          L5: {
            if (((nb) this).field_p <= 0) {
              break L5;
            } else {
              if (!((nb) this).field_y) {
                L6: {
                  if (((nb) this).field_w >= 0) {
                    if (((nb) this).field_t >= var4) {
                      var7 = (((nb) this).field_t - var3) / var6;
                      if (var7 < ((nb) this).field_p) {
                        ((nb) this).field_t = ((nb) this).field_t - var6 * var7;
                        ((nb) this).field_p = ((nb) this).field_p - var7;
                        break L6;
                      } else {
                        ((nb) this).field_t = ((nb) this).field_t - var6 * ((nb) this).field_p;
                        ((nb) this).field_p = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((nb) this).field_t < var3) {
                      var7 = (var4 - 1 - ((nb) this).field_t) / var6;
                      if (var7 < ((nb) this).field_p) {
                        ((nb) this).field_t = ((nb) this).field_t + var6 * var7;
                        ((nb) this).field_p = ((nb) this).field_p - var7;
                        break L6;
                      } else {
                        ((nb) this).field_t = ((nb) this).field_t + var6 * ((nb) this).field_p;
                        ((nb) this).field_p = 0;
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
                  if (((nb) this).field_w >= 0) {
                    break L7;
                  } else {
                    if (((nb) this).field_t < var3) {
                      ((nb) this).field_t = var3 + var3 - 1 - ((nb) this).field_t;
                      ((nb) this).field_w = -((nb) this).field_w;
                      ((nb) this).field_p = ((nb) this).field_p - 1;
                      if (((nb) this).field_p - 1 != 0) {
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
                  if (((nb) this).field_t >= var4) {
                    ((nb) this).field_t = var4 + var4 - 1 - ((nb) this).field_t;
                    ((nb) this).field_w = -((nb) this).field_w;
                    ((nb) this).field_p = ((nb) this).field_p - 1;
                    if (((nb) this).field_p - 1 != 0) {
                      if (((nb) this).field_t < var3) {
                        ((nb) this).field_t = var3 + var3 - 1 - ((nb) this).field_t;
                        ((nb) this).field_w = -((nb) this).field_w;
                        ((nb) this).field_p = ((nb) this).field_p - 1;
                        if (((nb) this).field_p - 1 != 0) {
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
          if (((nb) this).field_w < 0) {
            if (((nb) this).field_t < 0) {
              ((nb) this).field_t = -1;
              this.k();
              ((nb) this).a((byte) -117);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((nb) this).field_t < var5) {
                break L9;
              } else {
                ((nb) this).field_t = var5;
                this.k();
                ((nb) this).a((byte) -117);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((nb) this).field_y) {
            if (((nb) this).field_w >= 0) {
              if (((nb) this).field_t < var4) {
                return;
              } else {
                ((nb) this).field_t = var3 + (((nb) this).field_t - var3) % var6;
                return;
              }
            } else {
              if (((nb) this).field_t < var3) {
                ((nb) this).field_t = var4 - 1 - (var4 - 1 - ((nb) this).field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((nb) this).field_w >= 0) {
                break L10;
              } else {
                if (((nb) this).field_t < var3) {
                  ((nb) this).field_t = var3 + var3 - 1 - ((nb) this).field_t;
                  ((nb) this).field_w = -((nb) this).field_w;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((nb) this).field_t >= var4) {
                ((nb) this).field_t = var4 + var4 - 1 - ((nb) this).field_t;
                ((nb) this).field_w = -((nb) this).field_w;
                if (((nb) this).field_t < var3) {
                  ((nb) this).field_t = var3 + var3 - 1 - ((nb) this).field_t;
                  ((nb) this).field_w = -((nb) this).field_w;
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

    final synchronized int m() {
        return ((nb) this).field_w < 0 ? -((nb) this).field_w : ((nb) this).field_w;
    }

    final synchronized void d(int param0) {
        this.b(param0, ((nb) this).f());
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, nb param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_v = param13.field_v - param13.field_D * param5;
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
                param13.field_v = param13.field_v + param13.field_D * param5;
                param13.field_r = param6;
                param13.field_s = param7;
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

    private final boolean e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((nb) this).field_x;
          if (var1 != -2147483648) {
            var2 = nb.a(var1, ((nb) this).field_B);
            var3 = nb.e(var1, ((nb) this).field_B);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((nb) this).field_v != var1) {
            break L1;
          } else {
            if (((nb) this).field_r != var2) {
              break L1;
            } else {
              if (((nb) this).field_s == var3) {
                if (((nb) this).field_x == -2147483648) {
                  ((nb) this).field_x = 0;
                  ((nb) this).field_s = 0;
                  ((nb) this).field_r = 0;
                  ((nb) this).field_v = 0;
                  ((nb) this).a((byte) -117);
                  return true;
                } else {
                  this.h();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((nb) this).field_v >= var1) {
            if (((nb) this).field_v <= var1) {
              ((nb) this).field_D = 0;
              break L2;
            } else {
              ((nb) this).field_D = -1;
              ((nb) this).field_A = ((nb) this).field_v - var1;
              break L2;
            }
          } else {
            ((nb) this).field_D = 1;
            ((nb) this).field_A = var1 - ((nb) this).field_v;
            break L2;
          }
        }
        L3: {
          if (((nb) this).field_r >= var2) {
            if (((nb) this).field_r <= var2) {
              ((nb) this).field_u = 0;
              break L3;
            } else {
              L4: {
                ((nb) this).field_u = -1;
                if (((nb) this).field_A == 0) {
                  break L4;
                } else {
                  if (((nb) this).field_A <= ((nb) this).field_r - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((nb) this).field_A = ((nb) this).field_r - var2;
              break L3;
            }
          } else {
            L5: {
              ((nb) this).field_u = 1;
              if (((nb) this).field_A == 0) {
                break L5;
              } else {
                if (((nb) this).field_A <= var2 - ((nb) this).field_r) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((nb) this).field_A = var2 - ((nb) this).field_r;
            break L3;
          }
        }
        if (((nb) this).field_s < var3) {
          ((nb) this).field_q = 1;
          if (((nb) this).field_A != 0) {
            if (((nb) this).field_A > var3 - ((nb) this).field_s) {
              ((nb) this).field_A = var3 - ((nb) this).field_s;
              return false;
            } else {
              return false;
            }
          } else {
            ((nb) this).field_A = var3 - ((nb) this).field_s;
            return false;
          }
        } else {
          L6: {
            if (((nb) this).field_s <= var3) {
              ((nb) this).field_q = 0;
              break L6;
            } else {
              L7: {
                ((nb) this).field_q = -1;
                if (((nb) this).field_A == 0) {
                  break L7;
                } else {
                  if (((nb) this).field_A <= ((nb) this).field_s - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((nb) this).field_A = ((nb) this).field_s - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized int l() {
        return ((nb) this).field_x == -2147483648 ? 0 : ((nb) this).field_x + 32 >> 6;
    }

    final static nb a(jg param0, int param1, int param2, int param3) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new nb(param0, (int)((long)param0.field_p * 256L * (long)param1 / (long)(100 * bp.field_h)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    final static nb c(jg param0, int param1, int param2, int param3) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new nb(param0, (int)((long)param0.field_p * 256L * (long)param1 / (long)(100 * bp.field_h)), param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, nb param10) {
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

    final synchronized int j() {
        return ((nb) this).field_x == -2147483648 ? 0 : ((nb) this).field_x;
    }

    private final void k() {
        if (((nb) this).field_A != 0) {
            if (((nb) this).field_x == -2147483648) {
                ((nb) this).field_x = 0;
            }
            ((nb) this).field_A = 0;
            this.h();
            return;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, nb param10, int param11, int param12) {
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

    final synchronized int f() {
        return ((nb) this).field_B < 0 ? -1 : ((nb) this).field_B;
    }

    private final synchronized void b(int param0, int param1) {
        ((nb) this).field_x = param0;
        ((nb) this).field_B = param1;
        ((nb) this).field_A = 0;
        this.h();
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nb param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_r = param11.field_r - param11.field_u * param5;
            param11.field_s = param11.field_s - param11.field_q * param5;
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
                param11.field_r = param11.field_r + param11.field_u * param5;
                param11.field_s = param11.field_s + param11.field_q * param5;
                param11.field_v = param6;
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

    final int c() {
        int var1 = ((nb) this).field_v * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((nb) this).field_p == 0) {
            var1 = var1 - var1 * ((nb) this).field_t / (((jg) (Object) ((nb) this).field_n).field_n.length << 8);
        } else {
            if (((nb) this).field_p >= 0) {
                var1 = var1 - var1 * ((nb) this).field_C / ((jg) (Object) ((nb) this).field_n).field_n.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final kd a() {
        return null;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((nb) this).field_A <= 0) {
            L1: {
              if (((nb) this).field_w != -256) {
                break L1;
              } else {
                if ((((nb) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (bp.field_r) {
                    return nb.a(0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, 0, param3, param2, (nb) this);
                  } else {
                    return nb.b(((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, 0, param3, param2, (nb) this);
                  }
                }
              }
            }
            if (bp.field_r) {
              return nb.a(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, 0, param3, param2, (nb) this, ((nb) this).field_w, param4);
            } else {
              return nb.b(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, 0, param3, param2, (nb) this, ((nb) this).field_w, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((nb) this).field_A;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((nb) this).field_A = ((nb) this).field_A + param1;
                if (((nb) this).field_w != -256) {
                  break L4;
                } else {
                  if ((((nb) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!bp.field_r) {
                      param1 = nb.a(((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, ((nb) this).field_D, 0, var6, param2, (nb) this);
                      break L3;
                    } else {
                      param1 = nb.a(0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, ((nb) this).field_u, ((nb) this).field_q, 0, var6, param2, (nb) this);
                      break L3;
                    }
                  }
                }
              }
              if (!bp.field_r) {
                param1 = nb.b(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, ((nb) this).field_D, 0, var6, param2, (nb) this, ((nb) this).field_w, param4);
                break L3;
              } else {
                param1 = nb.b(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, ((nb) this).field_u, ((nb) this).field_q, 0, var6, param2, (nb) this, ((nb) this).field_w, param4);
                break L3;
              }
            }
            ((nb) this).field_A = ((nb) this).field_A - param1;
            if (((nb) this).field_A == 0) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, nb param9) {
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
        param9.field_r = param9.field_r + param9.field_u * (param6 - param3);
        param9.field_s = param9.field_s + param9.field_q * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_v = param4 >> 2;
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

    private final static int e(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, nb param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_v = param13.field_v - param13.field_D * param5;
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
                param13.field_v = param13.field_v + param13.field_D * param5;
                param13.field_r = param6;
                param13.field_s = param7;
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

    final static nb a(jg param0, int param1, int param2) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new nb(param0, param1, param2 << 6);
          }
        } else {
          return null;
        }
    }

    final static nb b(jg param0, int param1, int param2) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new nb(param0, (int)((long)param0.field_p * 256L * (long)param1 / (long)(100 * bp.field_h)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final static nb b(jg param0, int param1, int param2, int param3) {
        if (param0.field_n != null) {
          if (param0.field_n.length == 0) {
            return null;
          } else {
            return new nb(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((nb) this).field_A <= 0) {
            L1: {
              if (((nb) this).field_w != 256) {
                break L1;
              } else {
                if ((((nb) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (bp.field_r) {
                    return nb.b(0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, 0, param3, param2, (nb) this);
                  } else {
                    return nb.a(((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, 0, param3, param2, (nb) this);
                  }
                }
              }
            }
            if (bp.field_r) {
              return nb.c(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, 0, param3, param2, (nb) this, ((nb) this).field_w, param4);
            } else {
              return nb.a(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, 0, param3, param2, (nb) this, ((nb) this).field_w, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((nb) this).field_A;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((nb) this).field_A = ((nb) this).field_A + param1;
                if (((nb) this).field_w != 256) {
                  break L4;
                } else {
                  if ((((nb) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!bp.field_r) {
                      param1 = nb.b(((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, ((nb) this).field_D, 0, var6, param2, (nb) this);
                      break L3;
                    } else {
                      param1 = nb.b(0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, ((nb) this).field_u, ((nb) this).field_q, 0, var6, param2, (nb) this);
                      break L3;
                    }
                  }
                }
              }
              if (!bp.field_r) {
                param1 = nb.d(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_v, ((nb) this).field_D, 0, var6, param2, (nb) this, ((nb) this).field_w, param4);
                break L3;
              } else {
                param1 = nb.a(0, 0, ((jg) (Object) ((nb) this).field_n).field_n, param0, ((nb) this).field_t, param1, ((nb) this).field_r, ((nb) this).field_s, ((nb) this).field_u, ((nb) this).field_q, 0, var6, param2, (nb) this, ((nb) this).field_w, param4);
                break L3;
              }
            }
            ((nb) this).field_A = ((nb) this).field_A - param1;
            if (((nb) this).field_A == 0) {
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

    final synchronized boolean i() {
        return ((nb) this).field_t < 0 || ((nb) this).field_t >= ((jg) (Object) ((nb) this).field_n).field_n.length << 8;
    }

    final kd b() {
        return null;
    }

    final synchronized void d(int param0, int param1) {
        ((nb) this).a(param0, param1 << 6, ((nb) this).f());
    }

    final synchronized void c(int param0, int param1) {
        ((nb) this).a(param0, param1, ((nb) this).f());
    }

    private nb(jg param0, int param1, int param2) {
        ((nb) this).field_n = (qm) (Object) param0;
        ((nb) this).field_C = param0.field_m;
        ((nb) this).field_z = param0.field_q;
        ((nb) this).field_y = param0.field_o;
        ((nb) this).field_w = param1;
        ((nb) this).field_x = param2;
        ((nb) this).field_B = 8192;
        ((nb) this).field_t = 0;
        this.h();
    }

    private nb(jg param0, int param1, int param2, int param3) {
        ((nb) this).field_n = (qm) (Object) param0;
        ((nb) this).field_C = param0.field_m;
        ((nb) this).field_z = param0.field_q;
        ((nb) this).field_y = param0.field_o;
        ((nb) this).field_w = param1;
        ((nb) this).field_x = param2;
        ((nb) this).field_B = param3;
        ((nb) this).field_t = 0;
        this.h();
    }
}
