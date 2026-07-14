/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends fh {
    private boolean field_l;
    private int field_w;
    private int field_i;
    private int field_k;
    private int field_n;
    private int field_o;
    private int field_t;
    private int field_u;
    private int field_q;
    private int field_m;
    private int field_p;
    private int field_j;
    private int field_v;
    private int field_s;
    private int field_r;

    final synchronized void a(int param0) {
        td var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((li) this).field_o <= 0) {
            break L0;
          } else {
            if (param0 < ((li) this).field_o) {
              ((li) this).field_p = ((li) this).field_p + ((li) this).field_u * param0;
              ((li) this).field_j = ((li) this).field_j + ((li) this).field_k * param0;
              ((li) this).field_r = ((li) this).field_r + ((li) this).field_w * param0;
              ((li) this).field_o = ((li) this).field_o - param0;
              break L0;
            } else {
              L1: {
                if (((li) this).field_i != -2147483648) {
                  break L1;
                } else {
                  ((li) this).field_i = 0;
                  ((li) this).field_r = 0;
                  ((li) this).field_j = 0;
                  ((li) this).field_p = 0;
                  ((li) this).c(-19822);
                  param0 = ((li) this).field_o;
                  break L1;
                }
              }
              ((li) this).field_o = 0;
              this.e();
              break L0;
            }
          }
        }
        L2: {
          var2 = (td) (Object) ((li) this).field_e;
          var3 = ((li) this).field_s << 8;
          var4 = ((li) this).field_n << 8;
          var5 = var2.field_j.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((li) this).field_m = 0;
            break L2;
          }
        }
        L3: {
          if (((li) this).field_q >= 0) {
            break L3;
          } else {
            if (((li) this).field_v <= 0) {
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              ((li) this).field_q = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((li) this).field_q < var5) {
            break L4;
          } else {
            if (((li) this).field_v >= 0) {
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              ((li) this).field_q = var5 - 1;
              break L4;
            }
          }
        }
        ((li) this).field_q = ((li) this).field_q + ((li) this).field_v * param0;
        if (((li) this).field_m >= 0) {
          L5: {
            if (((li) this).field_m <= 0) {
              break L5;
            } else {
              if (!((li) this).field_l) {
                L6: {
                  if (((li) this).field_v >= 0) {
                    if (((li) this).field_q >= var4) {
                      var7 = (((li) this).field_q - var3) / var6;
                      if (var7 < ((li) this).field_m) {
                        ((li) this).field_q = ((li) this).field_q - var6 * var7;
                        ((li) this).field_m = ((li) this).field_m - var7;
                        break L6;
                      } else {
                        ((li) this).field_q = ((li) this).field_q - var6 * ((li) this).field_m;
                        ((li) this).field_m = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((li) this).field_q < var3) {
                      var7 = (var4 - 1 - ((li) this).field_q) / var6;
                      if (var7 < ((li) this).field_m) {
                        ((li) this).field_q = ((li) this).field_q + var6 * var7;
                        ((li) this).field_m = ((li) this).field_m - var7;
                        break L6;
                      } else {
                        ((li) this).field_q = ((li) this).field_q + var6 * ((li) this).field_m;
                        ((li) this).field_m = 0;
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
                  if (((li) this).field_v >= 0) {
                    break L7;
                  } else {
                    if (((li) this).field_q < var3) {
                      ((li) this).field_q = var3 + var3 - 1 - ((li) this).field_q;
                      ((li) this).field_v = -((li) this).field_v;
                      ((li) this).field_m = ((li) this).field_m - 1;
                      if (((li) this).field_m - 1 != 0) {
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
                  if (((li) this).field_q >= var4) {
                    ((li) this).field_q = var4 + var4 - 1 - ((li) this).field_q;
                    ((li) this).field_v = -((li) this).field_v;
                    ((li) this).field_m = ((li) this).field_m - 1;
                    if (((li) this).field_m - 1 != 0) {
                      if (((li) this).field_q < var3) {
                        ((li) this).field_q = var3 + var3 - 1 - ((li) this).field_q;
                        ((li) this).field_v = -((li) this).field_v;
                        ((li) this).field_m = ((li) this).field_m - 1;
                        if (((li) this).field_m - 1 != 0) {
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
          if (((li) this).field_v < 0) {
            if (((li) this).field_q < 0) {
              ((li) this).field_q = -1;
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((li) this).field_q < var5) {
                break L9;
              } else {
                ((li) this).field_q = var5;
                this.j();
                ((li) this).c(-19822);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((li) this).field_l) {
            if (((li) this).field_v >= 0) {
              if (((li) this).field_q < var4) {
                return;
              } else {
                ((li) this).field_q = var3 + (((li) this).field_q - var3) % var6;
                return;
              }
            } else {
              if (((li) this).field_q < var3) {
                ((li) this).field_q = var4 - 1 - (var4 - 1 - ((li) this).field_q) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((li) this).field_v >= 0) {
                break L10;
              } else {
                if (((li) this).field_q < var3) {
                  ((li) this).field_q = var3 + var3 - 1 - ((li) this).field_q;
                  ((li) this).field_v = -((li) this).field_v;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((li) this).field_q >= var4) {
                ((li) this).field_q = var4 + var4 - 1 - ((li) this).field_q;
                ((li) this).field_v = -((li) this).field_v;
                if (((li) this).field_q < var3) {
                  ((li) this).field_q = var3 + var3 - 1 - ((li) this).field_q;
                  ((li) this).field_v = -((li) this).field_v;
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

    final synchronized void b(int[] param0, int param1, int param2) {
        td var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((li) this).field_i != 0) {
            break L0;
          } else {
            if (((li) this).field_o != 0) {
              break L0;
            } else {
              ((li) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (td) (Object) ((li) this).field_e;
          var5 = ((li) this).field_s << 8;
          var6 = ((li) this).field_n << 8;
          var7 = var4.field_j.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((li) this).field_m = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((li) this).field_q >= 0) {
            break L2;
          } else {
            if (((li) this).field_v <= 0) {
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              ((li) this).field_q = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((li) this).field_q < var7) {
            break L3;
          } else {
            if (((li) this).field_v >= 0) {
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              ((li) this).field_q = var7 - 1;
              break L3;
            }
          }
        }
        if (((li) this).field_m >= 0) {
          L4: {
            if (((li) this).field_m <= 0) {
              break L4;
            } else {
              if (!((li) this).field_l) {
                if (((li) this).field_v >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[((li) this).field_s]);
                    if (((li) this).field_q >= var6) {
                      var10 = (((li) this).field_q - var5) / var8;
                      if (var10 < ((li) this).field_m) {
                        ((li) this).field_q = ((li) this).field_q - var8 * var10;
                        ((li) this).field_m = ((li) this).field_m - var10;
                        continue L5;
                      } else {
                        ((li) this).field_q = ((li) this).field_q - var8 * ((li) this).field_m;
                        ((li) this).field_m = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_n - 1]);
                    if (((li) this).field_q < var5) {
                      var10 = (var6 - 1 - ((li) this).field_q) / var8;
                      if (var10 < ((li) this).field_m) {
                        ((li) this).field_q = ((li) this).field_q + var8 * var10;
                        ((li) this).field_m = ((li) this).field_m - var10;
                        continue L6;
                      } else {
                        ((li) this).field_q = ((li) this).field_q + var8 * ((li) this).field_m;
                        ((li) this).field_m = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((li) this).field_v >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_s]);
                    if (((li) this).field_q < var5) {
                      ((li) this).field_q = var5 + var5 - 1 - ((li) this).field_q;
                      ((li) this).field_v = -((li) this).field_v;
                      ((li) this).field_m = ((li) this).field_m - 1;
                      if (((li) this).field_m - 1 != 0) {
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[((li) this).field_n - 1]);
                  if (((li) this).field_q >= var6) {
                    ((li) this).field_q = var6 + var6 - 1 - ((li) this).field_q;
                    ((li) this).field_v = -((li) this).field_v;
                    ((li) this).field_m = ((li) this).field_m - 1;
                    if (((li) this).field_m - 1 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_s]);
                      if (((li) this).field_q < var5) {
                        ((li) this).field_q = var5 + var5 - 1 - ((li) this).field_q;
                        ((li) this).field_v = -((li) this).field_v;
                        ((li) this).field_m = ((li) this).field_m - 1;
                        if (((li) this).field_m - 1 != 0) {
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
          if (((li) this).field_v < 0) {
            int discarded$2 = this.b(param0, var9, 0, param2, 0);
            if (((li) this).field_q < 0) {
              ((li) this).field_q = -1;
              this.j();
              ((li) this).c(-19822);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.a(param0, var9, var7, param2, 0);
              if (((li) this).field_q < var7) {
                break L9;
              } else {
                ((li) this).field_q = var7;
                this.j();
                ((li) this).c(-19822);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((li) this).field_l) {
            if (((li) this).field_v >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[((li) this).field_s]);
                if (((li) this).field_q >= var6) {
                  ((li) this).field_q = var5 + (((li) this).field_q - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_n - 1]);
                if (((li) this).field_q < var5) {
                  ((li) this).field_q = var6 - 1 - (var6 - 1 - ((li) this).field_q) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((li) this).field_v >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_s]);
                if (((li) this).field_q < var5) {
                  ((li) this).field_q = var5 + var5 - 1 - ((li) this).field_q;
                  ((li) this).field_v = -((li) this).field_v;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_j[((li) this).field_n - 1]);
              if (((li) this).field_q >= var6) {
                ((li) this).field_q = var6 + var6 - 1 - ((li) this).field_q;
                ((li) this).field_v = -((li) this).field_v;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_j[((li) this).field_s]);
                if (((li) this).field_q < var5) {
                  ((li) this).field_q = var5 + var5 - 1 - ((li) this).field_q;
                  ((li) this).field_v = -((li) this).field_v;
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

    final synchronized void c(int param0, int param1) {
        ((li) this).field_s = param0;
        ((li) this).field_n = param1;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
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
        param9.field_j = param9.field_j + param9.field_k * (param6 - param3);
        param9.field_r = param9.field_r + param9.field_w * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_q = param2 << 8;
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

    final static li a(td param0, int param1, int param2) {
        if (param0.field_j != null) {
          if (param0.field_j.length == 0) {
            return null;
          } else {
            return new li(param0, (int)((long)param0.field_f * 256L * (long)param1 / (long)(100 * va.field_i)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((li) this).field_j == 0) {
            if (((li) this).field_r == 0) {
              ((li) this).field_o = 0;
              ((li) this).field_i = 0;
              ((li) this).field_p = 0;
              ((li) this).c(-19822);
              return;
            } else {
              L0: {
                var2 = -((li) this).field_p;
                if (((li) this).field_p <= var2) {
                  break L0;
                } else {
                  var2 = ((li) this).field_p;
                  break L0;
                }
              }
              L1: {
                if (-((li) this).field_j <= var2) {
                  break L1;
                } else {
                  var2 = -((li) this).field_j;
                  break L1;
                }
              }
              L2: {
                if (((li) this).field_j <= var2) {
                  break L2;
                } else {
                  var2 = ((li) this).field_j;
                  break L2;
                }
              }
              L3: {
                if (-((li) this).field_r <= var2) {
                  break L3;
                } else {
                  var2 = -((li) this).field_r;
                  break L3;
                }
              }
              L4: {
                if (((li) this).field_r <= var2) {
                  break L4;
                } else {
                  var2 = ((li) this).field_r;
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
              ((li) this).field_o = param0;
              ((li) this).field_i = -2147483648;
              ((li) this).field_u = -((li) this).field_p / param0;
              ((li) this).field_k = -((li) this).field_j / param0;
              ((li) this).field_w = -((li) this).field_r / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((li) this).field_p;
              if (((li) this).field_p <= var2) {
                break L6;
              } else {
                var2 = ((li) this).field_p;
                break L6;
              }
            }
            L7: {
              if (-((li) this).field_j <= var2) {
                break L7;
              } else {
                var2 = -((li) this).field_j;
                break L7;
              }
            }
            L8: {
              if (((li) this).field_j <= var2) {
                break L8;
              } else {
                var2 = ((li) this).field_j;
                break L8;
              }
            }
            L9: {
              if (-((li) this).field_r <= var2) {
                break L9;
              } else {
                var2 = -((li) this).field_r;
                break L9;
              }
            }
            L10: {
              if (((li) this).field_r <= var2) {
                break L10;
              } else {
                var2 = ((li) this).field_r;
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
            ((li) this).field_o = param0;
            ((li) this).field_i = -2147483648;
            ((li) this).field_u = -((li) this).field_p / param0;
            ((li) this).field_k = -((li) this).field_j / param0;
            ((li) this).field_w = -((li) this).field_r / param0;
            return;
          }
        } else {
          ((li) this).g(0);
          ((li) this).c(-19822);
          return;
        }
    }

    final int d() {
        if (((li) this).field_i == 0) {
            if (((li) this).field_o == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((li) this).field_o <= 0) {
            L1: {
              if (((li) this).field_v != 256) {
                break L1;
              } else {
                if ((((li) this).field_q & 255) != 0) {
                  break L1;
                } else {
                  if (va.field_n) {
                    return li.b(0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, 0, param3, param2, (li) this);
                  } else {
                    return li.a(((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, 0, param3, param2, (li) this);
                  }
                }
              }
            }
            if (va.field_n) {
              return li.b(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, 0, param3, param2, (li) this, ((li) this).field_v, param4);
            } else {
              return li.a(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, 0, param3, param2, (li) this, ((li) this).field_v, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((li) this).field_o;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((li) this).field_o = ((li) this).field_o + param1;
                if (((li) this).field_v != 256) {
                  break L4;
                } else {
                  if ((((li) this).field_q & 255) != 0) {
                    break L4;
                  } else {
                    if (!va.field_n) {
                      param1 = li.a(((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, ((li) this).field_u, 0, var6, param2, (li) this);
                      break L3;
                    } else {
                      param1 = li.a(0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, ((li) this).field_k, ((li) this).field_w, 0, var6, param2, (li) this);
                      break L3;
                    }
                  }
                }
              }
              if (!va.field_n) {
                param1 = li.a(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, ((li) this).field_u, 0, var6, param2, (li) this, ((li) this).field_v, param4);
                break L3;
              } else {
                param1 = li.b(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, ((li) this).field_k, ((li) this).field_w, 0, var6, param2, (li) this, ((li) this).field_v, param4);
                break L3;
              }
            }
            ((li) this).field_o = ((li) this).field_o - param1;
            if (((li) this).field_o == 0) {
              if (!this.i()) {
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
        param10.field_q = param4;
        return param5;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_j = param11.field_j - param11.field_k * param5;
            param11.field_r = param11.field_r - param11.field_w * param5;
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
                param11.field_j = param11.field_j + param11.field_k * param5;
                param11.field_r = param11.field_r + param11.field_w * param5;
                param11.field_p = param6;
                param11.field_q = param4;
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

    final synchronized int f() {
        return ((li) this).field_i == -2147483648 ? 0 : ((li) this).field_i;
    }

    final static li a(td param0, int param1, int param2, int param3) {
        if (param0.field_j != null) {
          if (param0.field_j.length == 0) {
            return null;
          } else {
            return new li(param0, param1, param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(boolean param0) {
        ((li) this).field_l = param0 ? true : false;
    }

    private final void j() {
        if (((li) this).field_o != 0) {
            if (((li) this).field_i == -2147483648) {
                ((li) this).field_i = 0;
            }
            ((li) this).field_o = 0;
            this.e();
            return;
        }
    }

    final synchronized boolean h() {
        return ((li) this).field_q < 0 || ((li) this).field_q >= ((td) (Object) ((li) this).field_e).field_j.length << 8;
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
        param10.field_q = param4;
        return param5;
    }

    final synchronized void i(int param0) {
        if (((li) this).field_v < 0) {
            ((li) this).field_v = -param0;
        } else {
            ((li) this).field_v = param0;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param1 << 6, param2 << 6);
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_u * param5;
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
                param13.field_p = param13.field_p + param13.field_u * param5;
                param13.field_j = param6;
                param13.field_r = param7;
                param13.field_q = param4;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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
                param10.field_q = param3 << 8;
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

    private final void e() {
        ((li) this).field_p = ((li) this).field_i;
        ((li) this).field_j = li.a(((li) this).field_i, ((li) this).field_t);
        ((li) this).field_r = li.d(((li) this).field_i, ((li) this).field_t);
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, li param10) {
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
                param10.field_q = param3 << 8;
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

    final synchronized void e(int param0) {
        param0 = param0 << 8;
        int var2 = ((td) (Object) ((li) this).field_e).field_j.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((li) this).field_q = param0;
    }

    private final boolean i() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((li) this).field_i;
          if (var1 != -2147483648) {
            var2 = li.a(var1, ((li) this).field_t);
            var3 = li.d(var1, ((li) this).field_t);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((li) this).field_p != var1) {
            break L1;
          } else {
            if (((li) this).field_j != var2) {
              break L1;
            } else {
              if (((li) this).field_r == var3) {
                if (((li) this).field_i == -2147483648) {
                  ((li) this).field_i = 0;
                  ((li) this).field_r = 0;
                  ((li) this).field_j = 0;
                  ((li) this).field_p = 0;
                  ((li) this).c(-19822);
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
          if (((li) this).field_p >= var1) {
            if (((li) this).field_p <= var1) {
              ((li) this).field_u = 0;
              break L2;
            } else {
              ((li) this).field_u = -1;
              ((li) this).field_o = ((li) this).field_p - var1;
              break L2;
            }
          } else {
            ((li) this).field_u = 1;
            ((li) this).field_o = var1 - ((li) this).field_p;
            break L2;
          }
        }
        L3: {
          if (((li) this).field_j >= var2) {
            if (((li) this).field_j <= var2) {
              ((li) this).field_k = 0;
              break L3;
            } else {
              L4: {
                ((li) this).field_k = -1;
                if (((li) this).field_o == 0) {
                  break L4;
                } else {
                  if (((li) this).field_o <= ((li) this).field_j - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((li) this).field_o = ((li) this).field_j - var2;
              break L3;
            }
          } else {
            L5: {
              ((li) this).field_k = 1;
              if (((li) this).field_o == 0) {
                break L5;
              } else {
                if (((li) this).field_o <= var2 - ((li) this).field_j) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((li) this).field_o = var2 - ((li) this).field_j;
            break L3;
          }
        }
        if (((li) this).field_r < var3) {
          ((li) this).field_w = 1;
          if (((li) this).field_o != 0) {
            if (((li) this).field_o > var3 - ((li) this).field_r) {
              ((li) this).field_o = var3 - ((li) this).field_r;
              return false;
            } else {
              return false;
            }
          } else {
            ((li) this).field_o = var3 - ((li) this).field_r;
            return false;
          }
        } else {
          L6: {
            if (((li) this).field_r <= var3) {
              ((li) this).field_w = 0;
              break L6;
            } else {
              L7: {
                ((li) this).field_w = -1;
                if (((li) this).field_o == 0) {
                  break L7;
                } else {
                  if (((li) this).field_o <= ((li) this).field_r - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((li) this).field_o = ((li) this).field_r - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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
        param8.field_q = param2 << 8;
        return param3;
    }

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
                param11.field_q = param4;
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

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, li param8) {
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
        param8.field_q = param2 << 8;
        return param3;
    }

    private final synchronized int g() {
        return ((li) this).field_t < 0 ? -1 : ((li) this).field_t;
    }

    final int c() {
        int var1 = ((li) this).field_p * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((li) this).field_m == 0) {
            var1 = var1 - var1 * ((li) this).field_q / (((td) (Object) ((li) this).field_e).field_j.length << 8);
        } else {
            if (((li) this).field_m >= 0) {
                var1 = var1 - var1 * ((li) this).field_s / ((td) (Object) ((li) this).field_e).field_j.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final fh b() {
        return null;
    }

    final synchronized void g(int param0) {
        this.b(param0, this.g());
    }

    private final synchronized void b(int param0, int param1) {
        ((li) this).field_i = param0;
        ((li) this).field_t = param1;
        ((li) this).field_o = 0;
        this.e();
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
        param9.field_j = param9.field_j + param9.field_k * (param6 - param3);
        param9.field_r = param9.field_r + param9.field_w * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_p = param4 >> 2;
                param9.field_q = param2 << 8;
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
        param12.field_p = param12.field_p + param12.field_u * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_j = param5 >> 2;
                param12.field_r = param6 >> 2;
                param12.field_q = param3 << 8;
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
                param11.field_q = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, li param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_p = param13.field_p - param13.field_u * param5;
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
                param13.field_p = param13.field_p + param13.field_u * param5;
                param13.field_j = param6;
                param13.field_r = param7;
                param13.field_q = param4;
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

    final synchronized void h(int param0) {
        ((li) this).field_m = param0;
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, li param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_j = param11.field_j - param11.field_k * param5;
            param11.field_r = param11.field_r - param11.field_w * param5;
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
                param11.field_j = param11.field_j + param11.field_k * param5;
                param11.field_r = param11.field_r + param11.field_w * param5;
                param11.field_p = param6;
                param11.field_q = param4;
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

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = li.a(param1, param2);
          var5 = li.d(param1, param2);
          if (((li) this).field_j == var4) {
            if (((li) this).field_r == var5) {
              ((li) this).field_o = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((li) this).field_p;
                if (((li) this).field_p - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((li) this).field_p - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((li) this).field_j <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((li) this).field_j;
                  break L1;
                }
              }
              L2: {
                if (((li) this).field_j - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((li) this).field_j - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((li) this).field_r <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((li) this).field_r;
                  break L3;
                }
              }
              L4: {
                if (((li) this).field_r - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((li) this).field_r - var5;
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
              ((li) this).field_o = param0;
              ((li) this).field_i = param1;
              ((li) this).field_t = param2;
              ((li) this).field_u = (param1 - ((li) this).field_p) / param0;
              ((li) this).field_k = (var4 - ((li) this).field_j) / param0;
              ((li) this).field_w = (var5 - ((li) this).field_r) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((li) this).field_p;
              if (((li) this).field_p - param1 <= var6) {
                break L6;
              } else {
                var6 = ((li) this).field_p - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((li) this).field_j <= var6) {
                break L7;
              } else {
                var6 = var4 - ((li) this).field_j;
                break L7;
              }
            }
            L8: {
              if (((li) this).field_j - var4 <= var6) {
                break L8;
              } else {
                var6 = ((li) this).field_j - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((li) this).field_r <= var6) {
                break L9;
              } else {
                var6 = var5 - ((li) this).field_r;
                break L9;
              }
            }
            L10: {
              if (((li) this).field_r - var5 <= var6) {
                break L10;
              } else {
                var6 = ((li) this).field_r - var5;
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
            ((li) this).field_o = param0;
            ((li) this).field_i = param1;
            ((li) this).field_t = param2;
            ((li) this).field_u = (param1 - ((li) this).field_p) / param0;
            ((li) this).field_k = (var4 - ((li) this).field_j) / param0;
            ((li) this).field_w = (var5 - ((li) this).field_r) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    final fh a() {
        return null;
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
        param12.field_p = param12.field_p + param12.field_u * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_j = param5 >> 2;
                param12.field_r = param6 >> 2;
                param12.field_q = param3 << 8;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((li) this).field_o <= 0) {
            L1: {
              if (((li) this).field_v != -256) {
                break L1;
              } else {
                if ((((li) this).field_q & 255) != 0) {
                  break L1;
                } else {
                  if (va.field_n) {
                    return li.a(0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, 0, param3, param2, (li) this);
                  } else {
                    return li.b(((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, 0, param3, param2, (li) this);
                  }
                }
              }
            }
            if (va.field_n) {
              return li.d(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, 0, param3, param2, (li) this, ((li) this).field_v, param4);
            } else {
              return li.b(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, 0, param3, param2, (li) this, ((li) this).field_v, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((li) this).field_o;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((li) this).field_o = ((li) this).field_o + param1;
                if (((li) this).field_v != -256) {
                  break L4;
                } else {
                  if ((((li) this).field_q & 255) != 0) {
                    break L4;
                  } else {
                    if (!va.field_n) {
                      param1 = li.b(((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, ((li) this).field_u, 0, var6, param2, (li) this);
                      break L3;
                    } else {
                      param1 = li.b(0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, ((li) this).field_k, ((li) this).field_w, 0, var6, param2, (li) this);
                      break L3;
                    }
                  }
                }
              }
              if (!va.field_n) {
                param1 = li.c(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_p, ((li) this).field_u, 0, var6, param2, (li) this, ((li) this).field_v, param4);
                break L3;
              } else {
                param1 = li.a(0, 0, ((td) (Object) ((li) this).field_e).field_j, param0, ((li) this).field_q, param1, ((li) this).field_j, ((li) this).field_r, ((li) this).field_k, ((li) this).field_w, 0, var6, param2, (li) this, ((li) this).field_v, param4);
                break L3;
              }
            }
            ((li) this).field_o = ((li) this).field_o - param1;
            if (((li) this).field_o == 0) {
              if (!this.i()) {
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

    private li(td param0, int param1, int param2) {
        ((li) this).field_e = (jl) (Object) param0;
        ((li) this).field_s = param0.field_i;
        ((li) this).field_n = param0.field_g;
        ((li) this).field_l = param0.field_h;
        ((li) this).field_v = param1;
        ((li) this).field_i = param2;
        ((li) this).field_t = 8192;
        ((li) this).field_q = 0;
        this.e();
    }

    private li(td param0, int param1, int param2, int param3) {
        ((li) this).field_e = (jl) (Object) param0;
        ((li) this).field_s = param0.field_i;
        ((li) this).field_n = param0.field_g;
        ((li) this).field_l = param0.field_h;
        ((li) this).field_v = param1;
        ((li) this).field_i = param2;
        ((li) this).field_t = param3;
        ((li) this).field_q = 0;
        this.e();
    }
}
