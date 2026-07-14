/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hj {
    private int field_r;
    private int field_w;
    private int field_o;
    private int field_s;
    private int field_z;
    private int field_v;
    private int field_p;
    private int field_y;
    private int field_u;
    private int field_C;
    private int field_q;
    private boolean field_t;
    private int field_A;
    private int field_x;
    private int field_B;

    private final void j() {
        if (((mf) this).field_y != 0) {
            if (((mf) this).field_w == -2147483648) {
                ((mf) this).field_w = 0;
            }
            ((mf) this).field_y = 0;
            this.f();
            return;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, mf param10) {
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

    final synchronized int i() {
        return ((mf) this).field_z < 0 ? -1 : ((mf) this).field_z;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = mf.d(param1, param2);
          var5 = mf.c(param1, param2);
          if (((mf) this).field_A == var4) {
            if (((mf) this).field_p == var5) {
              ((mf) this).field_y = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((mf) this).field_o;
                if (((mf) this).field_o - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((mf) this).field_o - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((mf) this).field_A <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((mf) this).field_A;
                  break L1;
                }
              }
              L2: {
                if (((mf) this).field_A - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((mf) this).field_A - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((mf) this).field_p <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((mf) this).field_p;
                  break L3;
                }
              }
              L4: {
                if (((mf) this).field_p - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((mf) this).field_p - var5;
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
              ((mf) this).field_y = param0;
              ((mf) this).field_w = param1;
              ((mf) this).field_z = param2;
              ((mf) this).field_v = (param1 - ((mf) this).field_o) / param0;
              ((mf) this).field_x = (var4 - ((mf) this).field_A) / param0;
              ((mf) this).field_u = (var5 - ((mf) this).field_p) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((mf) this).field_o;
              if (((mf) this).field_o - param1 <= var6) {
                break L6;
              } else {
                var6 = ((mf) this).field_o - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((mf) this).field_A <= var6) {
                break L7;
              } else {
                var6 = var4 - ((mf) this).field_A;
                break L7;
              }
            }
            L8: {
              if (((mf) this).field_A - var4 <= var6) {
                break L8;
              } else {
                var6 = ((mf) this).field_A - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((mf) this).field_p <= var6) {
                break L9;
              } else {
                var6 = var5 - ((mf) this).field_p;
                break L9;
              }
            }
            L10: {
              if (((mf) this).field_p - var5 <= var6) {
                break L10;
              } else {
                var6 = ((mf) this).field_p - var5;
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
            ((mf) this).field_y = param0;
            ((mf) this).field_w = param1;
            ((mf) this).field_z = param2;
            ((mf) this).field_v = (param1 - ((mf) this).field_o) / param0;
            ((mf) this).field_x = (var4 - ((mf) this).field_A) / param0;
            ((mf) this).field_u = (var5 - ((mf) this).field_p) / param0;
            return;
          }
        } else {
          this.a(param1, param2);
          return;
        }
    }

    final synchronized void c(boolean param0) {
        ((mf) this).field_B = (((mf) this).field_B ^ ((mf) this).field_B >> 31) + (((mf) this).field_B >>> 31);
        if (param0) {
          ((mf) this).field_B = -((mf) this).field_B;
          return;
        } else {
          return;
        }
    }

    final synchronized void f(int param0) {
        this.a(param0, ((mf) this).i());
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, mf param10, int param11, int param12) {
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
        param10.field_r = param4;
        return param5;
    }

    final static mf a(qp param0, int param1, int param2, int param3) {
        if (param0.field_p != null) {
          if (param0.field_p.length == 0) {
            return null;
          } else {
            return new mf(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, mf param10) {
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mf param12) {
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
        param12.field_o = param12.field_o + param12.field_v * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_A = param5 >> 2;
                param12.field_p = param6 >> 2;
                param12.field_r = param3 << 8;
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
        ((mf) this).field_o = ((mf) this).field_w;
        ((mf) this).field_A = mf.d(((mf) this).field_w, ((mf) this).field_z);
        ((mf) this).field_p = mf.c(((mf) this).field_w, ((mf) this).field_z);
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mf param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_A = param11.field_A - param11.field_x * param5;
            param11.field_p = param11.field_p - param11.field_u * param5;
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
                param11.field_A = param11.field_A + param11.field_x * param5;
                param11.field_p = param11.field_p + param11.field_u * param5;
                param11.field_o = param6;
                param11.field_r = param4;
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

    final synchronized void b(int[] param0, int param1, int param2) {
        qp var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((mf) this).field_w != 0) {
            break L0;
          } else {
            if (((mf) this).field_y != 0) {
              break L0;
            } else {
              ((mf) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (qp) (Object) ((mf) this).field_l;
          var5 = ((mf) this).field_C << 8;
          var6 = ((mf) this).field_s << 8;
          var7 = var4.field_p.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((mf) this).field_q = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((mf) this).field_r >= 0) {
            break L2;
          } else {
            if (((mf) this).field_B <= 0) {
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              ((mf) this).field_r = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((mf) this).field_r < var7) {
            break L3;
          } else {
            if (((mf) this).field_B >= 0) {
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              ((mf) this).field_r = var7 - 1;
              break L3;
            }
          }
        }
        if (((mf) this).field_q >= 0) {
          L4: {
            if (((mf) this).field_q <= 0) {
              break L4;
            } else {
              if (!((mf) this).field_t) {
                if (((mf) this).field_B >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_p[((mf) this).field_C]);
                    if (((mf) this).field_r >= var6) {
                      var10 = (((mf) this).field_r - var5) / var8;
                      if (var10 < ((mf) this).field_q) {
                        ((mf) this).field_r = ((mf) this).field_r - var8 * var10;
                        ((mf) this).field_q = ((mf) this).field_q - var10;
                        continue L5;
                      } else {
                        ((mf) this).field_r = ((mf) this).field_r - var8 * ((mf) this).field_q;
                        ((mf) this).field_q = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_s - 1]);
                    if (((mf) this).field_r < var5) {
                      var10 = (var6 - 1 - ((mf) this).field_r) / var8;
                      if (var10 < ((mf) this).field_q) {
                        ((mf) this).field_r = ((mf) this).field_r + var8 * var10;
                        ((mf) this).field_q = ((mf) this).field_q - var10;
                        continue L6;
                      } else {
                        ((mf) this).field_r = ((mf) this).field_r + var8 * ((mf) this).field_q;
                        ((mf) this).field_q = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((mf) this).field_B >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_C]);
                    if (((mf) this).field_r < var5) {
                      ((mf) this).field_r = var5 + var5 - 1 - ((mf) this).field_r;
                      ((mf) this).field_B = -((mf) this).field_B;
                      ((mf) this).field_q = ((mf) this).field_q - 1;
                      if (((mf) this).field_q - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_p[((mf) this).field_s - 1]);
                  if (((mf) this).field_r >= var6) {
                    ((mf) this).field_r = var6 + var6 - 1 - ((mf) this).field_r;
                    ((mf) this).field_B = -((mf) this).field_B;
                    ((mf) this).field_q = ((mf) this).field_q - 1;
                    if (((mf) this).field_q - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_C]);
                      if (((mf) this).field_r < var5) {
                        ((mf) this).field_r = var5 + var5 - 1 - ((mf) this).field_r;
                        ((mf) this).field_B = -((mf) this).field_B;
                        ((mf) this).field_q = ((mf) this).field_q - 1;
                        if (((mf) this).field_q - 1 != 0) {
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
          if (((mf) this).field_B < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((mf) this).field_r < 0) {
              ((mf) this).field_r = -1;
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((mf) this).field_r < var7) {
                break L9;
              } else {
                ((mf) this).field_r = var7;
                this.j();
                ((mf) this).b(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((mf) this).field_t) {
            if (((mf) this).field_B >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_p[((mf) this).field_C]);
                if (((mf) this).field_r >= var6) {
                  ((mf) this).field_r = var5 + (((mf) this).field_r - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_s - 1]);
                if (((mf) this).field_r < var5) {
                  ((mf) this).field_r = var6 - 1 - (var6 - 1 - ((mf) this).field_r) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((mf) this).field_B >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_C]);
                if (((mf) this).field_r < var5) {
                  ((mf) this).field_r = var5 + var5 - 1 - ((mf) this).field_r;
                  ((mf) this).field_B = -((mf) this).field_B;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_p[((mf) this).field_s - 1]);
              if (((mf) this).field_r >= var6) {
                ((mf) this).field_r = var6 + var6 - 1 - ((mf) this).field_r;
                ((mf) this).field_B = -((mf) this).field_B;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_p[((mf) this).field_C]);
                if (((mf) this).field_r < var5) {
                  ((mf) this).field_r = var5 + var5 - 1 - ((mf) this).field_r;
                  ((mf) this).field_B = -((mf) this).field_B;
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

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mf param11, int param12, int param13) {
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

    final synchronized void c(int param0) {
        ((mf) this).field_q = param0;
    }

    final synchronized int g() {
        return ((mf) this).field_w == -2147483648 ? 0 : ((mf) this).field_w;
    }

    final int d() {
        if (((mf) this).field_w == 0) {
            if (((mf) this).field_y == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized void b(int param0, int param1) {
        ((mf) this).a(param0, param1, ((mf) this).i());
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, mf param9) {
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
        param9.field_A = param9.field_A + param9.field_x * (param6 - param3);
        param9.field_p = param9.field_p + param9.field_u * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_o = param4 >> 2;
                param9.field_r = param2 << 8;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mf param12) {
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
        param12.field_o = param12.field_o + param12.field_v * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_A = param5 >> 2;
                param12.field_p = param6 >> 2;
                param12.field_r = param3 << 8;
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

    final hj a() {
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((mf) this).field_y <= 0) {
            L1: {
              if (((mf) this).field_B != 256) {
                break L1;
              } else {
                if ((((mf) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (du.field_o) {
                    return mf.a(0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, 0, param3, param2, (mf) this);
                  } else {
                    return mf.b(((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, 0, param3, param2, (mf) this);
                  }
                }
              }
            }
            if (du.field_o) {
              return mf.a(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, 0, param3, param2, (mf) this, ((mf) this).field_B, param4);
            } else {
              return mf.b(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, 0, param3, param2, (mf) this, ((mf) this).field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((mf) this).field_y;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((mf) this).field_y = ((mf) this).field_y + param1;
                if (((mf) this).field_B != 256) {
                  break L4;
                } else {
                  if ((((mf) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!du.field_o) {
                      param1 = mf.b(((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, ((mf) this).field_v, 0, var6, param2, (mf) this);
                      break L3;
                    } else {
                      param1 = mf.b(0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, ((mf) this).field_x, ((mf) this).field_u, 0, var6, param2, (mf) this);
                      break L3;
                    }
                  }
                }
              }
              if (!du.field_o) {
                param1 = mf.b(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, ((mf) this).field_v, 0, var6, param2, (mf) this, ((mf) this).field_B, param4);
                break L3;
              } else {
                param1 = mf.a(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, ((mf) this).field_x, ((mf) this).field_u, 0, var6, param2, (mf) this, ((mf) this).field_B, param4);
                break L3;
              }
            }
            ((mf) this).field_y = ((mf) this).field_y - param1;
            if (((mf) this).field_y == 0) {
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mf param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_A = param11.field_A - param11.field_x * param5;
            param11.field_p = param11.field_p - param11.field_u * param5;
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
                param11.field_A = param11.field_A + param11.field_x * param5;
                param11.field_p = param11.field_p + param11.field_u * param5;
                param11.field_o = param6;
                param11.field_r = param4;
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

    final hj c() {
        return null;
    }

    final synchronized void e(int param0) {
        if (((mf) this).field_B < 0) {
            ((mf) this).field_B = -param0;
        } else {
            ((mf) this).field_B = param0;
        }
    }

    final synchronized void a(int param0) {
        qp var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((mf) this).field_y <= 0) {
            break L0;
          } else {
            if (param0 < ((mf) this).field_y) {
              ((mf) this).field_o = ((mf) this).field_o + ((mf) this).field_v * param0;
              ((mf) this).field_A = ((mf) this).field_A + ((mf) this).field_x * param0;
              ((mf) this).field_p = ((mf) this).field_p + ((mf) this).field_u * param0;
              ((mf) this).field_y = ((mf) this).field_y - param0;
              break L0;
            } else {
              L1: {
                if (((mf) this).field_w != -2147483648) {
                  break L1;
                } else {
                  ((mf) this).field_w = 0;
                  ((mf) this).field_p = 0;
                  ((mf) this).field_A = 0;
                  ((mf) this).field_o = 0;
                  ((mf) this).b(false);
                  param0 = ((mf) this).field_y;
                  break L1;
                }
              }
              ((mf) this).field_y = 0;
              this.f();
              break L0;
            }
          }
        }
        L2: {
          var2 = (qp) (Object) ((mf) this).field_l;
          var3 = ((mf) this).field_C << 8;
          var4 = ((mf) this).field_s << 8;
          var5 = var2.field_p.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((mf) this).field_q = 0;
            break L2;
          }
        }
        L3: {
          if (((mf) this).field_r >= 0) {
            break L3;
          } else {
            if (((mf) this).field_B <= 0) {
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              ((mf) this).field_r = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((mf) this).field_r < var5) {
            break L4;
          } else {
            if (((mf) this).field_B >= 0) {
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              ((mf) this).field_r = var5 - 1;
              break L4;
            }
          }
        }
        ((mf) this).field_r = ((mf) this).field_r + ((mf) this).field_B * param0;
        if (((mf) this).field_q >= 0) {
          L5: {
            if (((mf) this).field_q <= 0) {
              break L5;
            } else {
              if (!((mf) this).field_t) {
                L6: {
                  if (((mf) this).field_B >= 0) {
                    if (((mf) this).field_r >= var4) {
                      var7 = (((mf) this).field_r - var3) / var6;
                      if (var7 < ((mf) this).field_q) {
                        ((mf) this).field_r = ((mf) this).field_r - var6 * var7;
                        ((mf) this).field_q = ((mf) this).field_q - var7;
                        break L6;
                      } else {
                        ((mf) this).field_r = ((mf) this).field_r - var6 * ((mf) this).field_q;
                        ((mf) this).field_q = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((mf) this).field_r < var3) {
                      var7 = (var4 - 1 - ((mf) this).field_r) / var6;
                      if (var7 < ((mf) this).field_q) {
                        ((mf) this).field_r = ((mf) this).field_r + var6 * var7;
                        ((mf) this).field_q = ((mf) this).field_q - var7;
                        break L6;
                      } else {
                        ((mf) this).field_r = ((mf) this).field_r + var6 * ((mf) this).field_q;
                        ((mf) this).field_q = 0;
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
                  if (((mf) this).field_B >= 0) {
                    break L7;
                  } else {
                    if (((mf) this).field_r < var3) {
                      ((mf) this).field_r = var3 + var3 - 1 - ((mf) this).field_r;
                      ((mf) this).field_B = -((mf) this).field_B;
                      ((mf) this).field_q = ((mf) this).field_q - 1;
                      if (((mf) this).field_q - 1 != 0) {
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
                  if (((mf) this).field_r >= var4) {
                    ((mf) this).field_r = var4 + var4 - 1 - ((mf) this).field_r;
                    ((mf) this).field_B = -((mf) this).field_B;
                    ((mf) this).field_q = ((mf) this).field_q - 1;
                    if (((mf) this).field_q - 1 != 0) {
                      if (((mf) this).field_r < var3) {
                        ((mf) this).field_r = var3 + var3 - 1 - ((mf) this).field_r;
                        ((mf) this).field_B = -((mf) this).field_B;
                        ((mf) this).field_q = ((mf) this).field_q - 1;
                        if (((mf) this).field_q - 1 != 0) {
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
          if (((mf) this).field_B < 0) {
            if (((mf) this).field_r < 0) {
              ((mf) this).field_r = -1;
              this.j();
              ((mf) this).b(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((mf) this).field_r < var5) {
                break L9;
              } else {
                ((mf) this).field_r = var5;
                this.j();
                ((mf) this).b(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((mf) this).field_t) {
            if (((mf) this).field_B >= 0) {
              if (((mf) this).field_r < var4) {
                return;
              } else {
                ((mf) this).field_r = var3 + (((mf) this).field_r - var3) % var6;
                return;
              }
            } else {
              if (((mf) this).field_r < var3) {
                ((mf) this).field_r = var4 - 1 - (var4 - 1 - ((mf) this).field_r) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((mf) this).field_B >= 0) {
                break L10;
              } else {
                if (((mf) this).field_r < var3) {
                  ((mf) this).field_r = var3 + var3 - 1 - ((mf) this).field_r;
                  ((mf) this).field_B = -((mf) this).field_B;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((mf) this).field_r >= var4) {
                ((mf) this).field_r = var4 + var4 - 1 - ((mf) this).field_r;
                ((mf) this).field_B = -((mf) this).field_B;
                if (((mf) this).field_r < var3) {
                  ((mf) this).field_r = var3 + var3 - 1 - ((mf) this).field_r;
                  ((mf) this).field_B = -((mf) this).field_B;
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

    final synchronized void d(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((mf) this).field_A == 0) {
            if (((mf) this).field_p == 0) {
              ((mf) this).field_y = 0;
              ((mf) this).field_w = 0;
              ((mf) this).field_o = 0;
              ((mf) this).b(false);
              return;
            } else {
              L0: {
                var2 = -((mf) this).field_o;
                if (((mf) this).field_o <= var2) {
                  break L0;
                } else {
                  var2 = ((mf) this).field_o;
                  break L0;
                }
              }
              L1: {
                if (-((mf) this).field_A <= var2) {
                  break L1;
                } else {
                  var2 = -((mf) this).field_A;
                  break L1;
                }
              }
              L2: {
                if (((mf) this).field_A <= var2) {
                  break L2;
                } else {
                  var2 = ((mf) this).field_A;
                  break L2;
                }
              }
              L3: {
                if (-((mf) this).field_p <= var2) {
                  break L3;
                } else {
                  var2 = -((mf) this).field_p;
                  break L3;
                }
              }
              L4: {
                if (((mf) this).field_p <= var2) {
                  break L4;
                } else {
                  var2 = ((mf) this).field_p;
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
              ((mf) this).field_y = param0;
              ((mf) this).field_w = -2147483648;
              ((mf) this).field_v = -((mf) this).field_o / param0;
              ((mf) this).field_x = -((mf) this).field_A / param0;
              ((mf) this).field_u = -((mf) this).field_p / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((mf) this).field_o;
              if (((mf) this).field_o <= var2) {
                break L6;
              } else {
                var2 = ((mf) this).field_o;
                break L6;
              }
            }
            L7: {
              if (-((mf) this).field_A <= var2) {
                break L7;
              } else {
                var2 = -((mf) this).field_A;
                break L7;
              }
            }
            L8: {
              if (((mf) this).field_A <= var2) {
                break L8;
              } else {
                var2 = ((mf) this).field_A;
                break L8;
              }
            }
            L9: {
              if (-((mf) this).field_p <= var2) {
                break L9;
              } else {
                var2 = -((mf) this).field_p;
                break L9;
              }
            }
            L10: {
              if (((mf) this).field_p <= var2) {
                break L10;
              } else {
                var2 = ((mf) this).field_p;
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
            ((mf) this).field_y = param0;
            ((mf) this).field_w = -2147483648;
            ((mf) this).field_v = -((mf) this).field_o / param0;
            ((mf) this).field_x = -((mf) this).field_A / param0;
            ((mf) this).field_u = -((mf) this).field_p / param0;
            return;
          }
        } else {
          ((mf) this).f(0);
          ((mf) this).b(false);
          return;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, mf param9) {
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
        param9.field_A = param9.field_A + param9.field_x * (param6 - param3);
        param9.field_p = param9.field_p + param9.field_u * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_o = param4 >> 2;
                param9.field_r = param2 << 8;
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

    private final synchronized void a(int param0, int param1) {
        ((mf) this).field_w = param0;
        ((mf) this).field_z = param1;
        ((mf) this).field_y = 0;
        this.f();
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((mf) this).field_y <= 0) {
            L1: {
              if (((mf) this).field_B != -256) {
                break L1;
              } else {
                if ((((mf) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (du.field_o) {
                    return mf.b(0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, 0, param3, param2, (mf) this);
                  } else {
                    return mf.a(((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, 0, param3, param2, (mf) this);
                  }
                }
              }
            }
            if (du.field_o) {
              return mf.c(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, 0, param3, param2, (mf) this, ((mf) this).field_B, param4);
            } else {
              return mf.a(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, 0, param3, param2, (mf) this, ((mf) this).field_B, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((mf) this).field_y;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((mf) this).field_y = ((mf) this).field_y + param1;
                if (((mf) this).field_B != -256) {
                  break L4;
                } else {
                  if ((((mf) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!du.field_o) {
                      param1 = mf.a(((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, ((mf) this).field_v, 0, var6, param2, (mf) this);
                      break L3;
                    } else {
                      param1 = mf.a(0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, ((mf) this).field_x, ((mf) this).field_u, 0, var6, param2, (mf) this);
                      break L3;
                    }
                  }
                }
              }
              if (!du.field_o) {
                param1 = mf.d(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_o, ((mf) this).field_v, 0, var6, param2, (mf) this, ((mf) this).field_B, param4);
                break L3;
              } else {
                param1 = mf.b(0, 0, ((qp) (Object) ((mf) this).field_l).field_p, param0, ((mf) this).field_r, param1, ((mf) this).field_A, ((mf) this).field_p, ((mf) this).field_x, ((mf) this).field_u, 0, var6, param2, (mf) this, ((mf) this).field_B, param4);
                break L3;
              }
            }
            ((mf) this).field_y = ((mf) this).field_y - param1;
            if (((mf) this).field_y == 0) {
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, mf param8) {
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
        param8.field_r = param2 << 8;
        return param3;
    }

    final synchronized void g(int param0) {
        int var2 = ((qp) (Object) ((mf) this).field_l).field_p.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((mf) this).field_r = param0;
    }

    final synchronized boolean k() {
        return ((mf) this).field_y != 0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, mf param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_o = param13.field_o - param13.field_v * param5;
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
                param13.field_o = param13.field_o + param13.field_v * param5;
                param13.field_A = param6;
                param13.field_p = param7;
                param13.field_r = param4;
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

    final static mf a(qp param0, int param1, int param2) {
        if (param0.field_p != null) {
          if (param0.field_p.length == 0) {
            return null;
          } else {
            return new mf(param0, (int)((long)param0.field_n * 256L * (long)param1 / (long)(100 * du.field_k)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final int b() {
        int var1 = ((mf) this).field_o * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((mf) this).field_q == 0) {
            var1 = var1 - var1 * ((mf) this).field_r / (((qp) (Object) ((mf) this).field_l).field_p.length << 8);
        } else {
            if (((mf) this).field_q >= 0) {
                var1 = var1 - var1 * ((mf) this).field_C / ((qp) (Object) ((mf) this).field_l).field_p.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized int e() {
        return ((mf) this).field_B < 0 ? -((mf) this).field_B : ((mf) this).field_B;
    }

    final synchronized boolean h() {
        return ((mf) this).field_r < 0 || ((mf) this).field_r >= ((qp) (Object) ((mf) this).field_l).field_p.length << 8;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, mf param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_o = param13.field_o - param13.field_v * param5;
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
                param13.field_o = param13.field_o + param13.field_v * param5;
                param13.field_A = param6;
                param13.field_p = param7;
                param13.field_r = param4;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, mf param8) {
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
        param8.field_r = param2 << 8;
        return param3;
    }

    private final boolean l() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((mf) this).field_w;
          if (var1 != -2147483648) {
            var2 = mf.d(var1, ((mf) this).field_z);
            var3 = mf.c(var1, ((mf) this).field_z);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((mf) this).field_o != var1) {
            break L1;
          } else {
            if (((mf) this).field_A != var2) {
              break L1;
            } else {
              if (((mf) this).field_p == var3) {
                if (((mf) this).field_w == -2147483648) {
                  ((mf) this).field_w = 0;
                  ((mf) this).field_p = 0;
                  ((mf) this).field_A = 0;
                  ((mf) this).field_o = 0;
                  ((mf) this).b(false);
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
          if (((mf) this).field_o >= var1) {
            if (((mf) this).field_o <= var1) {
              ((mf) this).field_v = 0;
              break L2;
            } else {
              ((mf) this).field_v = -1;
              ((mf) this).field_y = ((mf) this).field_o - var1;
              break L2;
            }
          } else {
            ((mf) this).field_v = 1;
            ((mf) this).field_y = var1 - ((mf) this).field_o;
            break L2;
          }
        }
        L3: {
          if (((mf) this).field_A >= var2) {
            if (((mf) this).field_A <= var2) {
              ((mf) this).field_x = 0;
              break L3;
            } else {
              L4: {
                ((mf) this).field_x = -1;
                if (((mf) this).field_y == 0) {
                  break L4;
                } else {
                  if (((mf) this).field_y <= ((mf) this).field_A - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((mf) this).field_y = ((mf) this).field_A - var2;
              break L3;
            }
          } else {
            L5: {
              ((mf) this).field_x = 1;
              if (((mf) this).field_y == 0) {
                break L5;
              } else {
                if (((mf) this).field_y <= var2 - ((mf) this).field_A) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((mf) this).field_y = var2 - ((mf) this).field_A;
            break L3;
          }
        }
        if (((mf) this).field_p < var3) {
          ((mf) this).field_u = 1;
          if (((mf) this).field_y != 0) {
            if (((mf) this).field_y > var3 - ((mf) this).field_p) {
              ((mf) this).field_y = var3 - ((mf) this).field_p;
              return false;
            } else {
              return false;
            }
          } else {
            ((mf) this).field_y = var3 - ((mf) this).field_p;
            return false;
          }
        } else {
          L6: {
            if (((mf) this).field_p <= var3) {
              ((mf) this).field_u = 0;
              break L6;
            } else {
              L7: {
                ((mf) this).field_u = -1;
                if (((mf) this).field_y == 0) {
                  break L7;
                } else {
                  if (((mf) this).field_y <= ((mf) this).field_p - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((mf) this).field_y = ((mf) this).field_p - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mf param11, int param12, int param13) {
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

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, mf param10, int param11, int param12) {
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
        param10.field_r = param4;
        return param5;
    }

    private mf(qp param0, int param1, int param2) {
        ((mf) this).field_l = (rr) (Object) param0;
        ((mf) this).field_C = param0.field_l;
        ((mf) this).field_s = param0.field_o;
        ((mf) this).field_t = param0.field_m;
        ((mf) this).field_B = param1;
        ((mf) this).field_w = param2;
        ((mf) this).field_z = 8192;
        ((mf) this).field_r = 0;
        this.f();
    }

    private mf(qp param0, int param1, int param2, int param3) {
        ((mf) this).field_l = (rr) (Object) param0;
        ((mf) this).field_C = param0.field_l;
        ((mf) this).field_s = param0.field_o;
        ((mf) this).field_t = param0.field_m;
        ((mf) this).field_B = param1;
        ((mf) this).field_w = param2;
        ((mf) this).field_z = param3;
        ((mf) this).field_r = 0;
        this.f();
    }
}
