/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends je {
    private int field_w;
    private int field_t;
    private int field_q;
    private int field_u;
    private boolean field_o;
    private int field_k;
    private int field_n;
    private int field_l;
    private int field_p;
    private int field_m;
    private int field_x;
    private int field_y;
    private int field_r;
    private int field_v;
    private int field_s;

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
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
                ((li) param11).field_u = param4;
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

    final synchronized void a(int[] param0, int param1, int param2) {
        ib var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((li) this).field_m != 0) {
            break L0;
          } else {
            if (((li) this).field_x != 0) {
              break L0;
            } else {
              ((li) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (ib) ((li) this).field_i;
          var5 = ((li) this).field_r << 8;
          var6 = ((li) this).field_t << 8;
          var7 = ((ib) var4).field_h.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((li) this).field_l = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((li) this).field_u >= 0) {
            break L2;
          } else {
            if (((li) this).field_p <= 0) {
              this.f();
              ((li) this).c(103);
              return;
            } else {
              ((li) this).field_u = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((li) this).field_u < var7) {
            break L3;
          } else {
            if (((li) this).field_p >= 0) {
              this.f();
              ((li) this).c(126);
              return;
            } else {
              ((li) this).field_u = var7 - 1;
              break L3;
            }
          }
        }
        if (((li) this).field_l >= 0) {
          L4: {
            if (((li) this).field_l <= 0) {
              break L4;
            } else {
              if (!((li) this).field_o) {
                if (((li) this).field_p >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                    if (((li) this).field_u >= var6) {
                      var10 = (((li) this).field_u - var5) / var8;
                      if (var10 < ((li) this).field_l) {
                        ((li) this).field_u = ((li) this).field_u - var8 * var10;
                        ((li) this).field_l = ((li) this).field_l - var10;
                        continue L5;
                      } else {
                        ((li) this).field_u = ((li) this).field_u - var8 * ((li) this).field_l;
                        ((li) this).field_l = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_t - 1]);
                    if (((li) this).field_u < var5) {
                      var10 = (var6 - 1 - ((li) this).field_u) / var8;
                      if (var10 < ((li) this).field_l) {
                        ((li) this).field_u = ((li) this).field_u + var8 * var10;
                        ((li) this).field_l = ((li) this).field_l - var10;
                        continue L6;
                      } else {
                        ((li) this).field_u = ((li) this).field_u + var8 * ((li) this).field_l;
                        ((li) this).field_l = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((li) this).field_p >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                    if (((li) this).field_u < var5) {
                      ((li) this).field_u = var5 + var5 - 1 - ((li) this).field_u;
                      ((li) this).field_p = -((li) this).field_p;
                      ((li) this).field_l = ((li) this).field_l - 1;
                      if (((li) this).field_l - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) ((ib) var4).field_h[((li) this).field_t - 1]);
                  if (((li) this).field_u >= var6) {
                    ((li) this).field_u = var6 + var6 - 1 - ((li) this).field_u;
                    ((li) this).field_p = -((li) this).field_p;
                    ((li) this).field_l = ((li) this).field_l - 1;
                    if (((li) this).field_l - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                      if (((li) this).field_u < var5) {
                        ((li) this).field_u = var5 + var5 - 1 - ((li) this).field_u;
                        ((li) this).field_p = -((li) this).field_p;
                        ((li) this).field_l = ((li) this).field_l - 1;
                        if (((li) this).field_l - 1 != 0) {
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
          if (((li) this).field_p < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((li) this).field_u < 0) {
              ((li) this).field_u = -1;
              this.f();
              ((li) this).c(92);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((li) this).field_u < var7) {
                break L9;
              } else {
                ((li) this).field_u = var7;
                this.f();
                ((li) this).c(122);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((li) this).field_o) {
            if (((li) this).field_p >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                if (((li) this).field_u >= var6) {
                  ((li) this).field_u = var5 + (((li) this).field_u - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_t - 1]);
                if (((li) this).field_u < var5) {
                  ((li) this).field_u = var6 - 1 - (var6 - 1 - ((li) this).field_u) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((li) this).field_p >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                if (((li) this).field_u < var5) {
                  ((li) this).field_u = var5 + var5 - 1 - ((li) this).field_u;
                  ((li) this).field_p = -((li) this).field_p;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) ((ib) var4).field_h[((li) this).field_t - 1]);
              if (((li) this).field_u >= var6) {
                ((li) this).field_u = var6 + var6 - 1 - ((li) this).field_u;
                ((li) this).field_p = -((li) this).field_p;
                var9 = this.a(param0, var9, var5, param2, (int) ((ib) var4).field_h[((li) this).field_r]);
                if (((li) this).field_u < var5) {
                  ((li) this).field_u = var5 + var5 - 1 - ((li) this).field_u;
                  ((li) this).field_p = -((li) this).field_p;
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

    final synchronized int g() {
        return ((li) this).field_m == -2147483648 ? 0 : ((li) this).field_m;
    }

    final synchronized void a(boolean param0) {
        ((li) this).field_o = param0 ? true : false;
    }

    final synchronized void h(int param0) {
        param0 = param0 << 8;
        int var2 = ((ib) ((li) this).field_i).field_h.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((li) this).field_u = param0;
    }

    final je b() {
        return null;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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
                param10.field_u = param3 << 8;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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
        param8.field_u = param2 << 8;
        return param3;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        L0: {
          L1: {
            ((li) param11).field_v = ((li) param11).field_v - ((li) param11).field_s * param5;
            ((li) param11).field_w = ((li) param11).field_w - ((li) param11).field_y * param5;
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
                ((li) param11).field_v = ((li) param11).field_v + ((li) param11).field_s * param5;
                ((li) param11).field_w = ((li) param11).field_w + ((li) param11).field_y * param5;
                ((li) param11).field_q = param6;
                ((li) param11).field_u = param4;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, li param12) {
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
        ((li) param12).field_q = ((li) param12).field_q + ((li) param12).field_k * (param9 - param4);
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
                param12.field_u = param3 << 8;
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

    private final void f() {
        if (((li) this).field_x != 0) {
            if (((li) this).field_m == -2147483648) {
                ((li) this).field_m = 0;
            }
            ((li) this).field_x = 0;
            this.i();
            return;
        }
    }

    private final synchronized void a(int param0, int param1) {
        ((li) this).field_m = param0;
        ((li) this).field_n = param1;
        ((li) this).field_x = 0;
        this.i();
    }

    final synchronized void e(int param0) {
        ((li) this).field_l = param0;
    }

    final static li a(ib param0, int param1, int param2, int param3) {
        if (((ib) param0).field_h != null) {
          if (((ib) param0).field_h.length == 0) {
            return null;
          } else {
            return new li(param0, param1, param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
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
                ((li) param11).field_u = param4;
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

    final synchronized void f(int param0) {
        this.a(param0, this.h());
    }

    final je a() {
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((li) this).field_x <= 0) {
            L1: {
              if (((li) this).field_p != 256) {
                break L1;
              } else {
                if ((((li) this).field_u & 255) != 0) {
                  break L1;
                } else {
                  if (gd.field_q) {
                    return li.a(0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, 0, param3, param2, (li) this);
                  } else {
                    return li.b(((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, 0, param3, param2, (li) this);
                  }
                }
              }
            }
            if (gd.field_q) {
              return li.b(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, 0, param3, param2, (li) this, ((li) this).field_p, param4);
            } else {
              return li.a(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, 0, param3, param2, (li) this, ((li) this).field_p, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((li) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((li) this).field_x = ((li) this).field_x + param1;
                if (((li) this).field_p != 256) {
                  break L4;
                } else {
                  if ((((li) this).field_u & 255) != 0) {
                    break L4;
                  } else {
                    if (!gd.field_q) {
                      param1 = li.a(((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, ((li) this).field_k, 0, var6, param2, (li) this);
                      break L3;
                    } else {
                      param1 = li.a(0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, ((li) this).field_s, ((li) this).field_y, 0, var6, param2, (li) this);
                      break L3;
                    }
                  }
                }
              }
              if (!gd.field_q) {
                param1 = li.c(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, ((li) this).field_k, 0, var6, param2, (li) this, ((li) this).field_p, param4);
                break L3;
              } else {
                param1 = li.a(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, ((li) this).field_s, ((li) this).field_y, 0, var6, param2, (li) this, ((li) this).field_p, param4);
                break L3;
              }
            }
            ((li) this).field_x = ((li) this).field_x - param1;
            if (((li) this).field_x == 0) {
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

    private final void i() {
        ((li) this).field_q = ((li) this).field_m;
        ((li) this).field_v = li.b(((li) this).field_m, ((li) this).field_n);
        ((li) this).field_w = li.d(((li) this).field_m, ((li) this).field_n);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10, int param11, int param12) {
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
        ((li) param10).field_u = param4;
        return param5;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((li) this).field_x <= 0) {
            L1: {
              if (((li) this).field_p != -256) {
                break L1;
              } else {
                if ((((li) this).field_u & 255) != 0) {
                  break L1;
                } else {
                  if (gd.field_q) {
                    return li.b(0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, 0, param3, param2, (li) this);
                  } else {
                    return li.a(((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, 0, param3, param2, (li) this);
                  }
                }
              }
            }
            if (gd.field_q) {
              return li.d(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, 0, param3, param2, (li) this, ((li) this).field_p, param4);
            } else {
              return li.b(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, 0, param3, param2, (li) this, ((li) this).field_p, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((li) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((li) this).field_x = ((li) this).field_x + param1;
                if (((li) this).field_p != -256) {
                  break L4;
                } else {
                  if ((((li) this).field_u & 255) != 0) {
                    break L4;
                  } else {
                    if (!gd.field_q) {
                      param1 = li.b(((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, ((li) this).field_k, 0, var6, param2, (li) this);
                      break L3;
                    } else {
                      param1 = li.b(0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, ((li) this).field_s, ((li) this).field_y, 0, var6, param2, (li) this);
                      break L3;
                    }
                  }
                }
              }
              if (!gd.field_q) {
                param1 = li.a(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_q, ((li) this).field_k, 0, var6, param2, (li) this, ((li) this).field_p, param4);
                break L3;
              } else {
                param1 = li.b(0, 0, ((ib) ((li) this).field_i).field_h, param0, ((li) this).field_u, param1, ((li) this).field_v, ((li) this).field_w, ((li) this).field_s, ((li) this).field_y, 0, var6, param2, (li) this, ((li) this).field_p, param4);
                break L3;
              }
            }
            ((li) this).field_x = ((li) this).field_x - param1;
            if (((li) this).field_x == 0) {
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

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        L0: {
          L1: {
            ((li) param11).field_v = ((li) param11).field_v - ((li) param11).field_s * param5;
            ((li) param11).field_w = ((li) param11).field_w - ((li) param11).field_y * param5;
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
                ((li) param11).field_v = ((li) param11).field_v + ((li) param11).field_s * param5;
                ((li) param11).field_w = ((li) param11).field_w + ((li) param11).field_y * param5;
                ((li) param11).field_q = param6;
                ((li) param11).field_u = param4;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10, int param11, int param12) {
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
        ((li) param10).field_u = param4;
        return param5;
    }

    final synchronized void c(int param0, int param1) {
        ((li) this).field_r = param0;
        ((li) this).field_t = param1;
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((li) this).field_v == 0) {
            if (((li) this).field_w == 0) {
              ((li) this).field_x = 0;
              ((li) this).field_m = 0;
              ((li) this).field_q = 0;
              ((li) this).c(122);
              return;
            } else {
              L0: {
                var2 = -((li) this).field_q;
                if (((li) this).field_q <= var2) {
                  break L0;
                } else {
                  var2 = ((li) this).field_q;
                  break L0;
                }
              }
              L1: {
                if (-((li) this).field_v <= var2) {
                  break L1;
                } else {
                  var2 = -((li) this).field_v;
                  break L1;
                }
              }
              L2: {
                if (((li) this).field_v <= var2) {
                  break L2;
                } else {
                  var2 = ((li) this).field_v;
                  break L2;
                }
              }
              L3: {
                if (-((li) this).field_w <= var2) {
                  break L3;
                } else {
                  var2 = -((li) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((li) this).field_w <= var2) {
                  break L4;
                } else {
                  var2 = ((li) this).field_w;
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
              ((li) this).field_x = param0;
              ((li) this).field_m = -2147483648;
              ((li) this).field_k = -((li) this).field_q / param0;
              ((li) this).field_s = -((li) this).field_v / param0;
              ((li) this).field_y = -((li) this).field_w / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((li) this).field_q;
              if (((li) this).field_q <= var2) {
                break L6;
              } else {
                var2 = ((li) this).field_q;
                break L6;
              }
            }
            L7: {
              if (-((li) this).field_v <= var2) {
                break L7;
              } else {
                var2 = -((li) this).field_v;
                break L7;
              }
            }
            L8: {
              if (((li) this).field_v <= var2) {
                break L8;
              } else {
                var2 = ((li) this).field_v;
                break L8;
              }
            }
            L9: {
              if (-((li) this).field_w <= var2) {
                break L9;
              } else {
                var2 = -((li) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((li) this).field_w <= var2) {
                break L10;
              } else {
                var2 = ((li) this).field_w;
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
            ((li) this).field_x = param0;
            ((li) this).field_m = -2147483648;
            ((li) this).field_k = -((li) this).field_q / param0;
            ((li) this).field_s = -((li) this).field_v / param0;
            ((li) this).field_y = -((li) this).field_w / param0;
            return;
          }
        } else {
          ((li) this).f(0);
          ((li) this).c(127);
          return;
        }
    }

    final static li a(ib param0, int param1, int param2) {
        if (((ib) param0).field_h != null) {
          if (((ib) param0).field_h.length == 0) {
            return null;
          } else {
            return new li(param0, (int)((long)((ib) param0).field_l * 256L * (long)param1 / (long)(100 * gd.field_m)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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
        param8.field_u = param2 << 8;
        return param3;
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    private final boolean e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((li) this).field_m;
          if (var1 != -2147483648) {
            var2 = li.b(var1, ((li) this).field_n);
            var3 = li.d(var1, ((li) this).field_n);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((li) this).field_q != var1) {
            break L1;
          } else {
            if (((li) this).field_v != var2) {
              break L1;
            } else {
              if (((li) this).field_w == var3) {
                if (((li) this).field_m == -2147483648) {
                  ((li) this).field_m = 0;
                  ((li) this).field_w = 0;
                  ((li) this).field_v = 0;
                  ((li) this).field_q = 0;
                  ((li) this).c(91);
                  return true;
                } else {
                  this.i();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((li) this).field_q >= var1) {
            if (((li) this).field_q <= var1) {
              ((li) this).field_k = 0;
              break L2;
            } else {
              ((li) this).field_k = -1;
              ((li) this).field_x = ((li) this).field_q - var1;
              break L2;
            }
          } else {
            ((li) this).field_k = 1;
            ((li) this).field_x = var1 - ((li) this).field_q;
            break L2;
          }
        }
        L3: {
          if (((li) this).field_v >= var2) {
            if (((li) this).field_v <= var2) {
              ((li) this).field_s = 0;
              break L3;
            } else {
              L4: {
                ((li) this).field_s = -1;
                if (((li) this).field_x == 0) {
                  break L4;
                } else {
                  if (((li) this).field_x <= ((li) this).field_v - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((li) this).field_x = ((li) this).field_v - var2;
              break L3;
            }
          } else {
            L5: {
              ((li) this).field_s = 1;
              if (((li) this).field_x == 0) {
                break L5;
              } else {
                if (((li) this).field_x <= var2 - ((li) this).field_v) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((li) this).field_x = var2 - ((li) this).field_v;
            break L3;
          }
        }
        if (((li) this).field_w < var3) {
          ((li) this).field_y = 1;
          if (((li) this).field_x != 0) {
            if (((li) this).field_x > var3 - ((li) this).field_w) {
              ((li) this).field_x = var3 - ((li) this).field_w;
              return false;
            } else {
              return false;
            }
          } else {
            ((li) this).field_x = var3 - ((li) this).field_w;
            return false;
          }
        } else {
          L6: {
            if (((li) this).field_w <= var3) {
              ((li) this).field_y = 0;
              break L6;
            } else {
              L7: {
                ((li) this).field_y = -1;
                if (((li) this).field_x == 0) {
                  break L7;
                } else {
                  if (((li) this).field_x <= ((li) this).field_w - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((li) this).field_x = ((li) this).field_w - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        L0: {
          L1: {
            ((li) param13).field_q = ((li) param13).field_q - ((li) param13).field_k * param5;
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
                ((li) param13).field_q = ((li) param13).field_q + ((li) param13).field_k * param5;
                ((li) param13).field_v = param6;
                ((li) param13).field_w = param7;
                ((li) param13).field_u = param4;
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

    final synchronized void g(int param0) {
        this.a(param0 << 6, this.h());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        L0: {
          L1: {
            ((li) param13).field_q = ((li) param13).field_q - ((li) param13).field_k * param5;
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
                ((li) param13).field_q = ((li) param13).field_q + ((li) param13).field_k * param5;
                ((li) param13).field_v = param6;
                ((li) param13).field_w = param7;
                ((li) param13).field_u = param4;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, li param9) {
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
        ((li) param9).field_v = ((li) param9).field_v + ((li) param9).field_s * (param6 - param3);
        ((li) param9).field_w = ((li) param9).field_w + ((li) param9).field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_q = param4 >> 2;
                param9.field_u = param2 << 8;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, li param12) {
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
        ((li) param12).field_q = ((li) param12).field_q + ((li) param12).field_k * (param9 - param4);
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
                param12.field_u = param3 << 8;
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

    final int d() {
        int var1 = ((li) this).field_q * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((li) this).field_l == 0) {
            var1 = var1 - var1 * ((li) this).field_u / (((ib) ((li) this).field_i).field_h.length << 8);
        } else {
            if (((li) this).field_l >= 0) {
                var1 = var1 - var1 * ((li) this).field_r / ((ib) ((li) this).field_i).field_h.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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
                param10.field_u = param3 << 8;
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
        if (((li) this).field_m == 0) {
            if (((li) this).field_x == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final synchronized int h() {
        return ((li) this).field_n < 0 ? -1 : ((li) this).field_n;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, li param9) {
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
        ((li) param9).field_v = ((li) param9).field_v + ((li) param9).field_s * (param6 - param3);
        ((li) param9).field_w = ((li) param9).field_w + ((li) param9).field_y * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_q = param4 >> 2;
                param9.field_u = param2 << 8;
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

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = li.b(param1, param2);
          var5 = li.d(param1, param2);
          if (((li) this).field_v == var4) {
            if (((li) this).field_w == var5) {
              ((li) this).field_x = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((li) this).field_q;
                if (((li) this).field_q - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((li) this).field_q - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((li) this).field_v <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((li) this).field_v;
                  break L1;
                }
              }
              L2: {
                if (((li) this).field_v - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((li) this).field_v - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((li) this).field_w <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((li) this).field_w;
                  break L3;
                }
              }
              L4: {
                if (((li) this).field_w - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((li) this).field_w - var5;
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
              ((li) this).field_x = param0;
              ((li) this).field_m = param1;
              ((li) this).field_n = param2;
              ((li) this).field_k = (param1 - ((li) this).field_q) / param0;
              ((li) this).field_s = (var4 - ((li) this).field_v) / param0;
              ((li) this).field_y = (var5 - ((li) this).field_w) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((li) this).field_q;
              if (((li) this).field_q - param1 <= var6) {
                break L6;
              } else {
                var6 = ((li) this).field_q - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((li) this).field_v <= var6) {
                break L7;
              } else {
                var6 = var4 - ((li) this).field_v;
                break L7;
              }
            }
            L8: {
              if (((li) this).field_v - var4 <= var6) {
                break L8;
              } else {
                var6 = ((li) this).field_v - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((li) this).field_w <= var6) {
                break L9;
              } else {
                var6 = var5 - ((li) this).field_w;
                break L9;
              }
            }
            L10: {
              if (((li) this).field_w - var5 <= var6) {
                break L10;
              } else {
                var6 = ((li) this).field_w - var5;
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
            ((li) this).field_x = param0;
            ((li) this).field_m = param1;
            ((li) this).field_n = param2;
            ((li) this).field_k = (param1 - ((li) this).field_q) / param0;
            ((li) this).field_s = (var4 - ((li) this).field_v) / param0;
            ((li) this).field_y = (var5 - ((li) this).field_w) / param0;
            return;
          }
        } else {
          this.a(param1, param2);
          return;
        }
    }

    final synchronized void a(int param0) {
        ib var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((li) this).field_x <= 0) {
            break L0;
          } else {
            if (param0 < ((li) this).field_x) {
              ((li) this).field_q = ((li) this).field_q + ((li) this).field_k * param0;
              ((li) this).field_v = ((li) this).field_v + ((li) this).field_s * param0;
              ((li) this).field_w = ((li) this).field_w + ((li) this).field_y * param0;
              ((li) this).field_x = ((li) this).field_x - param0;
              break L0;
            } else {
              L1: {
                if (((li) this).field_m != -2147483648) {
                  break L1;
                } else {
                  ((li) this).field_m = 0;
                  ((li) this).field_w = 0;
                  ((li) this).field_v = 0;
                  ((li) this).field_q = 0;
                  ((li) this).c(83);
                  param0 = ((li) this).field_x;
                  break L1;
                }
              }
              ((li) this).field_x = 0;
              this.i();
              break L0;
            }
          }
        }
        L2: {
          var2 = (ib) ((li) this).field_i;
          var3 = ((li) this).field_r << 8;
          var4 = ((li) this).field_t << 8;
          var5 = ((ib) var2).field_h.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((li) this).field_l = 0;
            break L2;
          }
        }
        L3: {
          if (((li) this).field_u >= 0) {
            break L3;
          } else {
            if (((li) this).field_p <= 0) {
              this.f();
              ((li) this).c(93);
              return;
            } else {
              ((li) this).field_u = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((li) this).field_u < var5) {
            break L4;
          } else {
            if (((li) this).field_p >= 0) {
              this.f();
              ((li) this).c(113);
              return;
            } else {
              ((li) this).field_u = var5 - 1;
              break L4;
            }
          }
        }
        ((li) this).field_u = ((li) this).field_u + ((li) this).field_p * param0;
        if (((li) this).field_l >= 0) {
          L5: {
            if (((li) this).field_l <= 0) {
              break L5;
            } else {
              if (!((li) this).field_o) {
                L6: {
                  if (((li) this).field_p >= 0) {
                    if (((li) this).field_u >= var4) {
                      var7 = (((li) this).field_u - var3) / var6;
                      if (var7 < ((li) this).field_l) {
                        ((li) this).field_u = ((li) this).field_u - var6 * var7;
                        ((li) this).field_l = ((li) this).field_l - var7;
                        break L6;
                      } else {
                        ((li) this).field_u = ((li) this).field_u - var6 * ((li) this).field_l;
                        ((li) this).field_l = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((li) this).field_u < var3) {
                      var7 = (var4 - 1 - ((li) this).field_u) / var6;
                      if (var7 < ((li) this).field_l) {
                        ((li) this).field_u = ((li) this).field_u + var6 * var7;
                        ((li) this).field_l = ((li) this).field_l - var7;
                        break L6;
                      } else {
                        ((li) this).field_u = ((li) this).field_u + var6 * ((li) this).field_l;
                        ((li) this).field_l = 0;
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
                  if (((li) this).field_p >= 0) {
                    break L7;
                  } else {
                    if (((li) this).field_u < var3) {
                      ((li) this).field_u = var3 + var3 - 1 - ((li) this).field_u;
                      ((li) this).field_p = -((li) this).field_p;
                      ((li) this).field_l = ((li) this).field_l - 1;
                      if (((li) this).field_l - 1 != 0) {
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
                  if (((li) this).field_u >= var4) {
                    ((li) this).field_u = var4 + var4 - 1 - ((li) this).field_u;
                    ((li) this).field_p = -((li) this).field_p;
                    ((li) this).field_l = ((li) this).field_l - 1;
                    if (((li) this).field_l - 1 != 0) {
                      if (((li) this).field_u < var3) {
                        ((li) this).field_u = var3 + var3 - 1 - ((li) this).field_u;
                        ((li) this).field_p = -((li) this).field_p;
                        ((li) this).field_l = ((li) this).field_l - 1;
                        if (((li) this).field_l - 1 != 0) {
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
          if (((li) this).field_p < 0) {
            if (((li) this).field_u < 0) {
              ((li) this).field_u = -1;
              this.f();
              ((li) this).c(103);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((li) this).field_u < var5) {
                break L9;
              } else {
                ((li) this).field_u = var5;
                this.f();
                ((li) this).c(101);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((li) this).field_o) {
            if (((li) this).field_p >= 0) {
              if (((li) this).field_u < var4) {
                return;
              } else {
                ((li) this).field_u = var3 + (((li) this).field_u - var3) % var6;
                return;
              }
            } else {
              if (((li) this).field_u < var3) {
                ((li) this).field_u = var4 - 1 - (var4 - 1 - ((li) this).field_u) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((li) this).field_p >= 0) {
                break L10;
              } else {
                if (((li) this).field_u < var3) {
                  ((li) this).field_u = var3 + var3 - 1 - ((li) this).field_u;
                  ((li) this).field_p = -((li) this).field_p;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((li) this).field_u >= var4) {
                ((li) this).field_u = var4 + var4 - 1 - ((li) this).field_u;
                ((li) this).field_p = -((li) this).field_p;
                if (((li) this).field_u < var3) {
                  ((li) this).field_u = var3 + var3 - 1 - ((li) this).field_u;
                  ((li) this).field_p = -((li) this).field_p;
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

    final synchronized void i(int param0) {
        if (((li) this).field_p < 0) {
            ((li) this).field_p = -param0;
        } else {
            ((li) this).field_p = param0;
        }
    }

    private li(ib param0, int param1, int param2) {
        ((li) this).field_i = (ea) (Object) param0;
        ((li) this).field_r = ((ib) param0).field_j;
        ((li) this).field_t = ((ib) param0).field_k;
        ((li) this).field_o = ((ib) param0).field_i;
        ((li) this).field_p = param1;
        ((li) this).field_m = param2;
        ((li) this).field_n = 8192;
        ((li) this).field_u = 0;
        this.i();
    }

    private li(ib param0, int param1, int param2, int param3) {
        ((li) this).field_i = (ea) (Object) param0;
        ((li) this).field_r = ((ib) param0).field_j;
        ((li) this).field_t = ((ib) param0).field_k;
        ((li) this).field_o = ((ib) param0).field_i;
        ((li) this).field_p = param1;
        ((li) this).field_m = param2;
        ((li) this).field_n = param3;
        ((li) this).field_u = 0;
        this.i();
    }
}
