/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends wf {
    private int field_r;
    private int field_u;
    private int field_s;
    private int field_n;
    private int field_v;
    private int field_y;
    private int field_l;
    private boolean field_p;
    private int field_q;
    private int field_k;
    private int field_x;
    private int field_t;
    private int field_o;
    private int field_m;
    private int field_w;

    final int b() {
        if (((pi) this).field_v == 0) {
            if (((pi) this).field_l == 0) {
                return 0;
            }
        }
        return 1;
    }

    final int a() {
        int var1 = ((pi) this).field_y * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((pi) this).field_o == 0) {
            var1 = var1 - var1 * ((pi) this).field_u / (((ue) (Object) ((pi) this).field_j).field_h.length << 8);
        } else {
            if (((pi) this).field_o >= 0) {
                var1 = var1 - var1 * ((pi) this).field_m / ((ue) (Object) ((pi) this).field_j).field_h.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        ue var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((pi) this).field_v != 0) {
            break L0;
          } else {
            if (((pi) this).field_l != 0) {
              break L0;
            } else {
              ((pi) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (ue) (Object) ((pi) this).field_j;
          var5 = ((pi) this).field_m << 8;
          var6 = ((pi) this).field_n << 8;
          var7 = var4.field_h.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((pi) this).field_o = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((pi) this).field_u >= 0) {
            break L2;
          } else {
            if (((pi) this).field_t <= 0) {
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              ((pi) this).field_u = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((pi) this).field_u < var7) {
            break L3;
          } else {
            if (((pi) this).field_t >= 0) {
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              ((pi) this).field_u = var7 - 1;
              break L3;
            }
          }
        }
        if (((pi) this).field_o >= 0) {
          L4: {
            if (((pi) this).field_o <= 0) {
              break L4;
            } else {
              if (!((pi) this).field_p) {
                if (((pi) this).field_t >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[((pi) this).field_m]);
                    if (((pi) this).field_u >= var6) {
                      var10 = (((pi) this).field_u - var5) / var8;
                      if (var10 < ((pi) this).field_o) {
                        ((pi) this).field_u = ((pi) this).field_u - var8 * var10;
                        ((pi) this).field_o = ((pi) this).field_o - var10;
                        continue L5;
                      } else {
                        ((pi) this).field_u = ((pi) this).field_u - var8 * ((pi) this).field_o;
                        ((pi) this).field_o = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_n - 1]);
                    if (((pi) this).field_u < var5) {
                      var10 = (var6 - 1 - ((pi) this).field_u) / var8;
                      if (var10 < ((pi) this).field_o) {
                        ((pi) this).field_u = ((pi) this).field_u + var8 * var10;
                        ((pi) this).field_o = ((pi) this).field_o - var10;
                        continue L6;
                      } else {
                        ((pi) this).field_u = ((pi) this).field_u + var8 * ((pi) this).field_o;
                        ((pi) this).field_o = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((pi) this).field_t >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_m]);
                    if (((pi) this).field_u < var5) {
                      ((pi) this).field_u = var5 + var5 - 1 - ((pi) this).field_u;
                      ((pi) this).field_t = -((pi) this).field_t;
                      ((pi) this).field_o = ((pi) this).field_o - 1;
                      if (((pi) this).field_o - 1 != 0) {
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[((pi) this).field_n - 1]);
                  if (((pi) this).field_u >= var6) {
                    ((pi) this).field_u = var6 + var6 - 1 - ((pi) this).field_u;
                    ((pi) this).field_t = -((pi) this).field_t;
                    ((pi) this).field_o = ((pi) this).field_o - 1;
                    if (((pi) this).field_o - 1 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_m]);
                      if (((pi) this).field_u < var5) {
                        ((pi) this).field_u = var5 + var5 - 1 - ((pi) this).field_u;
                        ((pi) this).field_t = -((pi) this).field_t;
                        ((pi) this).field_o = ((pi) this).field_o - 1;
                        if (((pi) this).field_o - 1 != 0) {
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
          if (((pi) this).field_t < 0) {
            int discarded$2 = this.b(param0, var9, 0, param2, 0);
            if (((pi) this).field_u < 0) {
              ((pi) this).field_u = -1;
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.a(param0, var9, var7, param2, 0);
              if (((pi) this).field_u < var7) {
                break L9;
              } else {
                ((pi) this).field_u = var7;
                this.f();
                ((pi) this).c(2);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((pi) this).field_p) {
            if (((pi) this).field_t >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[((pi) this).field_m]);
                if (((pi) this).field_u >= var6) {
                  ((pi) this).field_u = var5 + (((pi) this).field_u - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_n - 1]);
                if (((pi) this).field_u < var5) {
                  ((pi) this).field_u = var6 - 1 - (var6 - 1 - ((pi) this).field_u) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((pi) this).field_t >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_m]);
                if (((pi) this).field_u < var5) {
                  ((pi) this).field_u = var5 + var5 - 1 - ((pi) this).field_u;
                  ((pi) this).field_t = -((pi) this).field_t;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_h[((pi) this).field_n - 1]);
              if (((pi) this).field_u >= var6) {
                ((pi) this).field_u = var6 + var6 - 1 - ((pi) this).field_u;
                ((pi) this).field_t = -((pi) this).field_t;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_h[((pi) this).field_m]);
                if (((pi) this).field_u < var5) {
                  ((pi) this).field_u = var5 + var5 - 1 - ((pi) this).field_u;
                  ((pi) this).field_t = -((pi) this).field_t;
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

    final wf c() {
        return null;
    }

    final synchronized void a(int param0) {
        ue var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((pi) this).field_l <= 0) {
            break L0;
          } else {
            if (param0 < ((pi) this).field_l) {
              ((pi) this).field_y = ((pi) this).field_y + ((pi) this).field_r * param0;
              ((pi) this).field_w = ((pi) this).field_w + ((pi) this).field_k * param0;
              ((pi) this).field_q = ((pi) this).field_q + ((pi) this).field_s * param0;
              ((pi) this).field_l = ((pi) this).field_l - param0;
              break L0;
            } else {
              L1: {
                if (((pi) this).field_v != -2147483648) {
                  break L1;
                } else {
                  ((pi) this).field_v = 0;
                  ((pi) this).field_q = 0;
                  ((pi) this).field_w = 0;
                  ((pi) this).field_y = 0;
                  ((pi) this).c(2);
                  param0 = ((pi) this).field_l;
                  break L1;
                }
              }
              ((pi) this).field_l = 0;
              this.i();
              break L0;
            }
          }
        }
        L2: {
          var2 = (ue) (Object) ((pi) this).field_j;
          var3 = ((pi) this).field_m << 8;
          var4 = ((pi) this).field_n << 8;
          var5 = var2.field_h.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((pi) this).field_o = 0;
            break L2;
          }
        }
        L3: {
          if (((pi) this).field_u >= 0) {
            break L3;
          } else {
            if (((pi) this).field_t <= 0) {
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              ((pi) this).field_u = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((pi) this).field_u < var5) {
            break L4;
          } else {
            if (((pi) this).field_t >= 0) {
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              ((pi) this).field_u = var5 - 1;
              break L4;
            }
          }
        }
        ((pi) this).field_u = ((pi) this).field_u + ((pi) this).field_t * param0;
        if (((pi) this).field_o >= 0) {
          L5: {
            if (((pi) this).field_o <= 0) {
              break L5;
            } else {
              if (!((pi) this).field_p) {
                L6: {
                  if (((pi) this).field_t >= 0) {
                    if (((pi) this).field_u >= var4) {
                      var7 = (((pi) this).field_u - var3) / var6;
                      if (var7 < ((pi) this).field_o) {
                        ((pi) this).field_u = ((pi) this).field_u - var6 * var7;
                        ((pi) this).field_o = ((pi) this).field_o - var7;
                        break L6;
                      } else {
                        ((pi) this).field_u = ((pi) this).field_u - var6 * ((pi) this).field_o;
                        ((pi) this).field_o = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((pi) this).field_u < var3) {
                      var7 = (var4 - 1 - ((pi) this).field_u) / var6;
                      if (var7 < ((pi) this).field_o) {
                        ((pi) this).field_u = ((pi) this).field_u + var6 * var7;
                        ((pi) this).field_o = ((pi) this).field_o - var7;
                        break L6;
                      } else {
                        ((pi) this).field_u = ((pi) this).field_u + var6 * ((pi) this).field_o;
                        ((pi) this).field_o = 0;
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
                  if (((pi) this).field_t >= 0) {
                    break L7;
                  } else {
                    if (((pi) this).field_u < var3) {
                      ((pi) this).field_u = var3 + var3 - 1 - ((pi) this).field_u;
                      ((pi) this).field_t = -((pi) this).field_t;
                      ((pi) this).field_o = ((pi) this).field_o - 1;
                      if (((pi) this).field_o - 1 != 0) {
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
                  if (((pi) this).field_u >= var4) {
                    ((pi) this).field_u = var4 + var4 - 1 - ((pi) this).field_u;
                    ((pi) this).field_t = -((pi) this).field_t;
                    ((pi) this).field_o = ((pi) this).field_o - 1;
                    if (((pi) this).field_o - 1 != 0) {
                      if (((pi) this).field_u < var3) {
                        ((pi) this).field_u = var3 + var3 - 1 - ((pi) this).field_u;
                        ((pi) this).field_t = -((pi) this).field_t;
                        ((pi) this).field_o = ((pi) this).field_o - 1;
                        if (((pi) this).field_o - 1 != 0) {
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
          if (((pi) this).field_t < 0) {
            if (((pi) this).field_u < 0) {
              ((pi) this).field_u = -1;
              this.f();
              ((pi) this).c(2);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((pi) this).field_u < var5) {
                break L9;
              } else {
                ((pi) this).field_u = var5;
                this.f();
                ((pi) this).c(2);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((pi) this).field_p) {
            if (((pi) this).field_t >= 0) {
              if (((pi) this).field_u < var4) {
                return;
              } else {
                ((pi) this).field_u = var3 + (((pi) this).field_u - var3) % var6;
                return;
              }
            } else {
              if (((pi) this).field_u < var3) {
                ((pi) this).field_u = var4 - 1 - (var4 - 1 - ((pi) this).field_u) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((pi) this).field_t >= 0) {
                break L10;
              } else {
                if (((pi) this).field_u < var3) {
                  ((pi) this).field_u = var3 + var3 - 1 - ((pi) this).field_u;
                  ((pi) this).field_t = -((pi) this).field_t;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((pi) this).field_u >= var4) {
                ((pi) this).field_u = var4 + var4 - 1 - ((pi) this).field_u;
                ((pi) this).field_t = -((pi) this).field_t;
                if (((pi) this).field_u < var3) {
                  ((pi) this).field_u = var3 + var3 - 1 - ((pi) this).field_u;
                  ((pi) this).field_t = -((pi) this).field_t;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, pi param10, int param11, int param12) {
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
                param10.field_u = param4;
                return param5;
              } else {
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    final synchronized int j() {
        return ((pi) this).field_t < 0 ? -((pi) this).field_t : ((pi) this).field_t;
    }

    final synchronized void i(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((pi) this).field_w == 0) {
            if (((pi) this).field_q == 0) {
              ((pi) this).field_l = 0;
              ((pi) this).field_v = 0;
              ((pi) this).field_y = 0;
              ((pi) this).c(2);
              return;
            } else {
              L0: {
                var2 = -((pi) this).field_y;
                if (((pi) this).field_y <= var2) {
                  break L0;
                } else {
                  var2 = ((pi) this).field_y;
                  break L0;
                }
              }
              L1: {
                if (-((pi) this).field_w <= var2) {
                  break L1;
                } else {
                  var2 = -((pi) this).field_w;
                  break L1;
                }
              }
              L2: {
                if (((pi) this).field_w <= var2) {
                  break L2;
                } else {
                  var2 = ((pi) this).field_w;
                  break L2;
                }
              }
              L3: {
                if (-((pi) this).field_q <= var2) {
                  break L3;
                } else {
                  var2 = -((pi) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((pi) this).field_q <= var2) {
                  break L4;
                } else {
                  var2 = ((pi) this).field_q;
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
              ((pi) this).field_l = param0;
              ((pi) this).field_v = -2147483648;
              ((pi) this).field_r = -((pi) this).field_y / param0;
              ((pi) this).field_k = -((pi) this).field_w / param0;
              ((pi) this).field_s = -((pi) this).field_q / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((pi) this).field_y;
              if (((pi) this).field_y <= var2) {
                break L6;
              } else {
                var2 = ((pi) this).field_y;
                break L6;
              }
            }
            L7: {
              if (-((pi) this).field_w <= var2) {
                break L7;
              } else {
                var2 = -((pi) this).field_w;
                break L7;
              }
            }
            L8: {
              if (((pi) this).field_w <= var2) {
                break L8;
              } else {
                var2 = ((pi) this).field_w;
                break L8;
              }
            }
            L9: {
              if (-((pi) this).field_q <= var2) {
                break L9;
              } else {
                var2 = -((pi) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((pi) this).field_q <= var2) {
                break L10;
              } else {
                var2 = ((pi) this).field_q;
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
            ((pi) this).field_l = param0;
            ((pi) this).field_v = -2147483648;
            ((pi) this).field_r = -((pi) this).field_y / param0;
            ((pi) this).field_k = -((pi) this).field_w / param0;
            ((pi) this).field_s = -((pi) this).field_q / param0;
            return;
          }
        } else {
          this.h(0);
          ((pi) this).c(2);
          return;
        }
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((pi) this).field_l <= 0) {
            L1: {
              if (((pi) this).field_t != -256) {
                break L1;
              } else {
                if ((((pi) this).field_u & 255) != 0) {
                  break L1;
                } else {
                  if (e.field_s) {
                    return pi.b(0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, 0, param3, param2, (pi) this);
                  } else {
                    return pi.b(((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, 0, param3, param2, (pi) this);
                  }
                }
              }
            }
            if (e.field_s) {
              return pi.a(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, 0, param3, param2, (pi) this, ((pi) this).field_t, param4);
            } else {
              return pi.a(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, 0, param3, param2, (pi) this, ((pi) this).field_t, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((pi) this).field_l;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((pi) this).field_l = ((pi) this).field_l + param1;
                if (((pi) this).field_t != -256) {
                  break L4;
                } else {
                  if ((((pi) this).field_u & 255) != 0) {
                    break L4;
                  } else {
                    if (!e.field_s) {
                      param1 = pi.b(((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, ((pi) this).field_r, 0, var6, param2, (pi) this);
                      break L3;
                    } else {
                      param1 = pi.b(0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, ((pi) this).field_k, ((pi) this).field_s, 0, var6, param2, (pi) this);
                      break L3;
                    }
                  }
                }
              }
              if (!e.field_s) {
                param1 = pi.b(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, ((pi) this).field_r, 0, var6, param2, (pi) this, ((pi) this).field_t, param4);
                break L3;
              } else {
                param1 = pi.a(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, ((pi) this).field_k, ((pi) this).field_s, 0, var6, param2, (pi) this, ((pi) this).field_t, param4);
                break L3;
              }
            }
            ((pi) this).field_l = ((pi) this).field_l - param1;
            if (((pi) this).field_l == 0) {
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

    final synchronized boolean k() {
        return ((pi) this).field_l != 0;
    }

    final synchronized boolean e() {
        return ((pi) this).field_u < 0 || ((pi) this).field_u >= ((ue) (Object) ((pi) this).field_j).field_h.length << 8;
    }

    private final boolean l() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((pi) this).field_v;
          if (var1 != -2147483648) {
            var2 = pi.a(var1, ((pi) this).field_x);
            var3 = pi.b(var1, ((pi) this).field_x);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((pi) this).field_y != var1) {
            break L1;
          } else {
            if (((pi) this).field_w != var2) {
              break L1;
            } else {
              if (((pi) this).field_q == var3) {
                if (((pi) this).field_v == -2147483648) {
                  ((pi) this).field_v = 0;
                  ((pi) this).field_q = 0;
                  ((pi) this).field_w = 0;
                  ((pi) this).field_y = 0;
                  ((pi) this).c(2);
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
          if (((pi) this).field_y >= var1) {
            if (((pi) this).field_y <= var1) {
              ((pi) this).field_r = 0;
              break L2;
            } else {
              ((pi) this).field_r = -1;
              ((pi) this).field_l = ((pi) this).field_y - var1;
              break L2;
            }
          } else {
            ((pi) this).field_r = 1;
            ((pi) this).field_l = var1 - ((pi) this).field_y;
            break L2;
          }
        }
        L3: {
          if (((pi) this).field_w >= var2) {
            if (((pi) this).field_w <= var2) {
              ((pi) this).field_k = 0;
              break L3;
            } else {
              L4: {
                ((pi) this).field_k = -1;
                if (((pi) this).field_l == 0) {
                  break L4;
                } else {
                  if (((pi) this).field_l <= ((pi) this).field_w - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((pi) this).field_l = ((pi) this).field_w - var2;
              break L3;
            }
          } else {
            L5: {
              ((pi) this).field_k = 1;
              if (((pi) this).field_l == 0) {
                break L5;
              } else {
                if (((pi) this).field_l <= var2 - ((pi) this).field_w) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((pi) this).field_l = var2 - ((pi) this).field_w;
            break L3;
          }
        }
        if (((pi) this).field_q < var3) {
          ((pi) this).field_s = 1;
          if (((pi) this).field_l != 0) {
            if (((pi) this).field_l > var3 - ((pi) this).field_q) {
              ((pi) this).field_l = var3 - ((pi) this).field_q;
              return false;
            } else {
              return false;
            }
          } else {
            ((pi) this).field_l = var3 - ((pi) this).field_q;
            return false;
          }
        } else {
          L6: {
            if (((pi) this).field_q <= var3) {
              ((pi) this).field_s = 0;
              break L6;
            } else {
              L7: {
                ((pi) this).field_s = -1;
                if (((pi) this).field_l == 0) {
                  break L7;
                } else {
                  if (((pi) this).field_l <= ((pi) this).field_q - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((pi) this).field_l = ((pi) this).field_q - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final synchronized void h(int param0) {
        this.e(param0, ((pi) this).h());
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = pi.a(param1, param2);
          var5 = pi.b(param1, param2);
          if (((pi) this).field_w == var4) {
            if (((pi) this).field_q == var5) {
              ((pi) this).field_l = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((pi) this).field_y;
                if (((pi) this).field_y - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((pi) this).field_y - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((pi) this).field_w <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((pi) this).field_w;
                  break L1;
                }
              }
              L2: {
                if (((pi) this).field_w - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((pi) this).field_w - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((pi) this).field_q <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((pi) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((pi) this).field_q - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((pi) this).field_q - var5;
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
              ((pi) this).field_l = param0;
              ((pi) this).field_v = param1;
              ((pi) this).field_x = param2;
              ((pi) this).field_r = (param1 - ((pi) this).field_y) / param0;
              ((pi) this).field_k = (var4 - ((pi) this).field_w) / param0;
              ((pi) this).field_s = (var5 - ((pi) this).field_q) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((pi) this).field_y;
              if (((pi) this).field_y - param1 <= var6) {
                break L6;
              } else {
                var6 = ((pi) this).field_y - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((pi) this).field_w <= var6) {
                break L7;
              } else {
                var6 = var4 - ((pi) this).field_w;
                break L7;
              }
            }
            L8: {
              if (((pi) this).field_w - var4 <= var6) {
                break L8;
              } else {
                var6 = ((pi) this).field_w - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((pi) this).field_q <= var6) {
                break L9;
              } else {
                var6 = var5 - ((pi) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((pi) this).field_q - var5 <= var6) {
                break L10;
              } else {
                var6 = ((pi) this).field_q - var5;
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
            ((pi) this).field_l = param0;
            ((pi) this).field_v = param1;
            ((pi) this).field_x = param2;
            ((pi) this).field_r = (param1 - ((pi) this).field_y) / param0;
            ((pi) this).field_k = (var4 - ((pi) this).field_w) / param0;
            ((pi) this).field_s = (var5 - ((pi) this).field_q) / param0;
            return;
          }
        } else {
          this.e(param1, param2);
          return;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pi param11, int param12, int param13) {
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
                param11.field_u = param4;
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

    final synchronized int g() {
        return ((pi) this).field_v == -2147483648 ? 0 : ((pi) this).field_v;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((pi) this).field_l <= 0) {
            L1: {
              if (((pi) this).field_t != 256) {
                break L1;
              } else {
                if ((((pi) this).field_u & 255) != 0) {
                  break L1;
                } else {
                  if (e.field_s) {
                    return pi.a(0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, 0, param3, param2, (pi) this);
                  } else {
                    return pi.a(((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, 0, param3, param2, (pi) this);
                  }
                }
              }
            }
            if (e.field_s) {
              return pi.d(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, 0, param3, param2, (pi) this, ((pi) this).field_t, param4);
            } else {
              return pi.b(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, 0, param3, param2, (pi) this, ((pi) this).field_t, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((pi) this).field_l;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((pi) this).field_l = ((pi) this).field_l + param1;
                if (((pi) this).field_t != 256) {
                  break L4;
                } else {
                  if ((((pi) this).field_u & 255) != 0) {
                    break L4;
                  } else {
                    if (!e.field_s) {
                      param1 = pi.a(((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, ((pi) this).field_r, 0, var6, param2, (pi) this);
                      break L3;
                    } else {
                      param1 = pi.a(0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, ((pi) this).field_k, ((pi) this).field_s, 0, var6, param2, (pi) this);
                      break L3;
                    }
                  }
                }
              }
              if (!e.field_s) {
                param1 = pi.c(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_y, ((pi) this).field_r, 0, var6, param2, (pi) this, ((pi) this).field_t, param4);
                break L3;
              } else {
                param1 = pi.b(0, 0, ((ue) (Object) ((pi) this).field_j).field_h, param0, ((pi) this).field_u, param1, ((pi) this).field_w, ((pi) this).field_q, ((pi) this).field_k, ((pi) this).field_s, 0, var6, param2, (pi) this, ((pi) this).field_t, param4);
                break L3;
              }
            }
            ((pi) this).field_l = ((pi) this).field_l - param1;
            if (((pi) this).field_l == 0) {
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, pi param8) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, pi param10) {
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, pi param12) {
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
        param12.field_y = param12.field_y + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_w = param5 >> 2;
                param12.field_q = param6 >> 2;
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

    final synchronized void d(int param0, int param1) {
        ((pi) this).a(param0, param1, ((pi) this).h());
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pi param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_w = param11.field_w - param11.field_k * param5;
            param11.field_q = param11.field_q - param11.field_s * param5;
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
                param11.field_w = param11.field_w + param11.field_k * param5;
                param11.field_q = param11.field_q + param11.field_s * param5;
                param11.field_y = param6;
                param11.field_u = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, pi param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_y = param13.field_y - param13.field_r * param5;
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
                param13.field_y = param13.field_y + param13.field_r * param5;
                param13.field_w = param6;
                param13.field_q = param7;
                param13.field_u = param4;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pi param11, int param12, int param13) {
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
                param11.field_u = param4;
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

    final static pi a(ue param0, int param1, int param2, int param3) {
        if (param0.field_h != null) {
          if (param0.field_h.length == 0) {
            return null;
          } else {
            return new pi(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void g(int param0) {
        int var2 = ((ue) (Object) ((pi) this).field_j).field_h.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((pi) this).field_u = param0;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, pi param10) {
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

    private final void f() {
        if (((pi) this).field_l != 0) {
            if (((pi) this).field_v == -2147483648) {
                ((pi) this).field_v = 0;
            }
            ((pi) this).field_l = 0;
            this.i();
            return;
        }
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, pi param8) {
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

    final synchronized void f(int param0) {
        ((pi) this).field_o = param0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, pi param10, int param11, int param12) {
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
                param10.field_u = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param11;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, pi param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_y = param13.field_y - param13.field_r * param5;
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
                param13.field_y = param13.field_y + param13.field_r * param5;
                param13.field_w = param6;
                param13.field_q = param7;
                param13.field_u = param4;
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

    private final synchronized void e(int param0, int param1) {
        ((pi) this).field_v = param0;
        ((pi) this).field_x = param1;
        ((pi) this).field_l = 0;
        this.i();
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, pi param12) {
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
        param12.field_y = param12.field_y + param12.field_r * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_w = param5 >> 2;
                param12.field_q = param6 >> 2;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, pi param9) {
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
        param9.field_w = param9.field_w + param9.field_k * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_s * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_y = param4 >> 2;
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

    private final void i() {
        ((pi) this).field_y = ((pi) this).field_v;
        ((pi) this).field_w = pi.a(((pi) this).field_v, ((pi) this).field_x);
        ((pi) this).field_q = pi.b(((pi) this).field_v, ((pi) this).field_x);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, pi param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_w = param11.field_w - param11.field_k * param5;
            param11.field_q = param11.field_q - param11.field_s * param5;
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
                param11.field_w = param11.field_w + param11.field_k * param5;
                param11.field_q = param11.field_q + param11.field_s * param5;
                param11.field_y = param6;
                param11.field_u = param4;
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

    final synchronized void e(int param0) {
        if (((pi) this).field_t < 0) {
            ((pi) this).field_t = -param0;
        } else {
            ((pi) this).field_t = param0;
        }
    }

    final synchronized void d(int param0) {
        param0 = param0 << 8;
        int var2 = ((ue) (Object) ((pi) this).field_j).field_h.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((pi) this).field_u = param0;
    }

    final synchronized void a(boolean param0) {
        ((pi) this).field_t = (((pi) this).field_t ^ ((pi) this).field_t >> 31) + (((pi) this).field_t >>> 31);
        if (param0) {
          ((pi) this).field_t = -((pi) this).field_t;
          return;
        } else {
          return;
        }
    }

    final synchronized void c(int param0, int param1) {
        ((pi) this).a(param0, param1 << 6, ((pi) this).h());
    }

    final wf d() {
        return null;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, pi param9) {
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
        param9.field_w = param9.field_w + param9.field_k * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_s * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_y = param4 >> 2;
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

    final synchronized int h() {
        return ((pi) this).field_x < 0 ? -1 : ((pi) this).field_x;
    }

    final static pi a(ue param0, int param1, int param2) {
        if (param0.field_h != null) {
          if (param0.field_h.length == 0) {
            return null;
          } else {
            return new pi(param0, (int)((long)param0.field_k * 256L * (long)param1 / (long)(100 * e.field_r)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private pi(ue param0, int param1, int param2) {
        ((pi) this).field_j = (ic) (Object) param0;
        ((pi) this).field_m = param0.field_i;
        ((pi) this).field_n = param0.field_l;
        ((pi) this).field_p = param0.field_j;
        ((pi) this).field_t = param1;
        ((pi) this).field_v = param2;
        ((pi) this).field_x = 8192;
        ((pi) this).field_u = 0;
        this.i();
    }

    private pi(ue param0, int param1, int param2, int param3) {
        ((pi) this).field_j = (ic) (Object) param0;
        ((pi) this).field_m = param0.field_i;
        ((pi) this).field_n = param0.field_l;
        ((pi) this).field_p = param0.field_j;
        ((pi) this).field_t = param1;
        ((pi) this).field_v = param2;
        ((pi) this).field_x = param3;
        ((pi) this).field_u = 0;
        this.i();
    }
}
