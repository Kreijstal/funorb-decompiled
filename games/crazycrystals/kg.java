/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends od {
    private int field_v;
    private int field_p;
    private int field_o;
    private int field_w;
    private int field_l;
    private int field_k;
    private int field_s;
    private int field_x;
    private int field_q;
    private int field_r;
    private int field_t;
    private int field_m;
    private int field_u;
    private int field_j;
    private boolean field_n;

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((kg) this).field_v <= 0) {
            L1: {
              if (((kg) this).field_m != -256) {
                break L1;
              } else {
                if ((((kg) this).field_p & 255) != 0) {
                  break L1;
                } else {
                  if (id.field_o) {
                    return kg.a(0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, 0, param3, param2, (kg) this);
                  } else {
                    return kg.a(((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, 0, param3, param2, (kg) this);
                  }
                }
              }
            }
            if (id.field_o) {
              return kg.a(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, 0, param3, param2, (kg) this, ((kg) this).field_m, param4);
            } else {
              return kg.a(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, 0, param3, param2, (kg) this, ((kg) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((kg) this).field_v;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((kg) this).field_v = ((kg) this).field_v + param1;
                if (((kg) this).field_m != -256) {
                  break L4;
                } else {
                  if ((((kg) this).field_p & 255) != 0) {
                    break L4;
                  } else {
                    if (!id.field_o) {
                      param1 = kg.a(((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, ((kg) this).field_j, 0, var6, param2, (kg) this);
                      break L3;
                    } else {
                      param1 = kg.b(0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, ((kg) this).field_t, ((kg) this).field_r, 0, var6, param2, (kg) this);
                      break L3;
                    }
                  }
                }
              }
              if (!id.field_o) {
                param1 = kg.d(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, ((kg) this).field_j, 0, var6, param2, (kg) this, ((kg) this).field_m, param4);
                break L3;
              } else {
                param1 = kg.a(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, ((kg) this).field_t, ((kg) this).field_r, 0, var6, param2, (kg) this, ((kg) this).field_m, param4);
                break L3;
              }
            }
            ((kg) this).field_v = ((kg) this).field_v - param1;
            if (((kg) this).field_v == 0) {
              if (!this.g()) {
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, kg param10, int param11, int param12) {
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
        param10.field_p = param4;
        return param5;
    }

    final synchronized void h(int param0) {
        if (((kg) this).field_m < 0) {
            ((kg) this).field_m = -param0;
        } else {
            ((kg) this).field_m = param0;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        ko var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((kg) this).field_o != 0) {
            break L0;
          } else {
            if (((kg) this).field_v != 0) {
              break L0;
            } else {
              ((kg) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (ko) (Object) ((kg) this).field_h;
          var5 = ((kg) this).field_l << 8;
          var6 = ((kg) this).field_x << 8;
          var7 = var4.field_k.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((kg) this).field_w = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((kg) this).field_p >= 0) {
            break L2;
          } else {
            if (((kg) this).field_m <= 0) {
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              ((kg) this).field_p = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((kg) this).field_p < var7) {
            break L3;
          } else {
            if (((kg) this).field_m >= 0) {
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              ((kg) this).field_p = var7 - 1;
              break L3;
            }
          }
        }
        if (((kg) this).field_w >= 0) {
          L4: {
            if (((kg) this).field_w <= 0) {
              break L4;
            } else {
              if (!((kg) this).field_n) {
                if (((kg) this).field_m >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[((kg) this).field_l]);
                    if (((kg) this).field_p >= var6) {
                      var10 = (((kg) this).field_p - var5) / var8;
                      if (var10 < ((kg) this).field_w) {
                        ((kg) this).field_p = ((kg) this).field_p - var8 * var10;
                        ((kg) this).field_w = ((kg) this).field_w - var10;
                        continue L5;
                      } else {
                        ((kg) this).field_p = ((kg) this).field_p - var8 * ((kg) this).field_w;
                        ((kg) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_x - 1]);
                    if (((kg) this).field_p < var5) {
                      var10 = (var6 - 1 - ((kg) this).field_p) / var8;
                      if (var10 < ((kg) this).field_w) {
                        ((kg) this).field_p = ((kg) this).field_p + var8 * var10;
                        ((kg) this).field_w = ((kg) this).field_w - var10;
                        continue L6;
                      } else {
                        ((kg) this).field_p = ((kg) this).field_p + var8 * ((kg) this).field_w;
                        ((kg) this).field_w = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((kg) this).field_m >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_l]);
                    if (((kg) this).field_p < var5) {
                      ((kg) this).field_p = var5 + var5 - 1 - ((kg) this).field_p;
                      ((kg) this).field_m = -((kg) this).field_m;
                      ((kg) this).field_w = ((kg) this).field_w - 1;
                      if (((kg) this).field_w - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[((kg) this).field_x - 1]);
                  if (((kg) this).field_p >= var6) {
                    ((kg) this).field_p = var6 + var6 - 1 - ((kg) this).field_p;
                    ((kg) this).field_m = -((kg) this).field_m;
                    ((kg) this).field_w = ((kg) this).field_w - 1;
                    if (((kg) this).field_w - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_l]);
                      if (((kg) this).field_p < var5) {
                        ((kg) this).field_p = var5 + var5 - 1 - ((kg) this).field_p;
                        ((kg) this).field_m = -((kg) this).field_m;
                        ((kg) this).field_w = ((kg) this).field_w - 1;
                        if (((kg) this).field_w - 1 != 0) {
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
          if (((kg) this).field_m < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((kg) this).field_p < 0) {
              ((kg) this).field_p = -1;
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((kg) this).field_p < var7) {
                break L9;
              } else {
                ((kg) this).field_p = var7;
                this.i();
                ((kg) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((kg) this).field_n) {
            if (((kg) this).field_m >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[((kg) this).field_l]);
                if (((kg) this).field_p >= var6) {
                  ((kg) this).field_p = var5 + (((kg) this).field_p - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_x - 1]);
                if (((kg) this).field_p < var5) {
                  ((kg) this).field_p = var6 - 1 - (var6 - 1 - ((kg) this).field_p) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((kg) this).field_m >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_l]);
                if (((kg) this).field_p < var5) {
                  ((kg) this).field_p = var5 + var5 - 1 - ((kg) this).field_p;
                  ((kg) this).field_m = -((kg) this).field_m;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_k[((kg) this).field_x - 1]);
              if (((kg) this).field_p >= var6) {
                ((kg) this).field_p = var6 + var6 - 1 - ((kg) this).field_p;
                ((kg) this).field_m = -((kg) this).field_m;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_k[((kg) this).field_l]);
                if (((kg) this).field_p < var5) {
                  ((kg) this).field_p = var5 + var5 - 1 - ((kg) this).field_p;
                  ((kg) this).field_m = -((kg) this).field_m;
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

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, kg param10) {
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
                param10.field_p = param3 << 8;
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

    final synchronized boolean e() {
        return ((kg) this).field_v != 0;
    }

    final static kg a(ko param0, int param1, int param2) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new kg(param0, (int)((long)param0.field_j * 256L * (long)param1 / (long)(100 * id.field_m)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, kg param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_s = param13.field_s - param13.field_j * param5;
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
                param13.field_s = param13.field_s + param13.field_j * param5;
                param13.field_u = param6;
                param13.field_q = param7;
                param13.field_p = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kg param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_u = param11.field_u - param11.field_t * param5;
            param11.field_q = param11.field_q - param11.field_r * param5;
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
                param11.field_u = param11.field_u + param11.field_t * param5;
                param11.field_q = param11.field_q + param11.field_r * param5;
                param11.field_s = param6;
                param11.field_p = param4;
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((kg) this).field_v <= 0) {
            L1: {
              if (((kg) this).field_m != 256) {
                break L1;
              } else {
                if ((((kg) this).field_p & 255) != 0) {
                  break L1;
                } else {
                  if (id.field_o) {
                    return kg.b(0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, 0, param3, param2, (kg) this);
                  } else {
                    return kg.b(((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, 0, param3, param2, (kg) this);
                  }
                }
              }
            }
            if (id.field_o) {
              return kg.c(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, 0, param3, param2, (kg) this, ((kg) this).field_m, param4);
            } else {
              return kg.b(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, 0, param3, param2, (kg) this, ((kg) this).field_m, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((kg) this).field_v;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((kg) this).field_v = ((kg) this).field_v + param1;
                if (((kg) this).field_m != 256) {
                  break L4;
                } else {
                  if ((((kg) this).field_p & 255) != 0) {
                    break L4;
                  } else {
                    if (!id.field_o) {
                      param1 = kg.b(((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, ((kg) this).field_j, 0, var6, param2, (kg) this);
                      break L3;
                    } else {
                      param1 = kg.a(0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, ((kg) this).field_t, ((kg) this).field_r, 0, var6, param2, (kg) this);
                      break L3;
                    }
                  }
                }
              }
              if (!id.field_o) {
                param1 = kg.b(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_s, ((kg) this).field_j, 0, var6, param2, (kg) this, ((kg) this).field_m, param4);
                break L3;
              } else {
                param1 = kg.b(0, 0, ((ko) (Object) ((kg) this).field_h).field_k, param0, ((kg) this).field_p, param1, ((kg) this).field_u, ((kg) this).field_q, ((kg) this).field_t, ((kg) this).field_r, 0, var6, param2, (kg) this, ((kg) this).field_m, param4);
                break L3;
              }
            }
            ((kg) this).field_v = ((kg) this).field_v - param1;
            if (((kg) this).field_v == 0) {
              if (!this.g()) {
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

    final static kg a(ko param0, int param1, int param2, int param3) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new kg(param0, (int)((long)param0.field_j * 256L * (long)param1 / (long)(100 * id.field_m)), param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized int k() {
        return ((kg) this).field_k < 0 ? -1 : ((kg) this).field_k;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, kg param12) {
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
        param12.field_s = param12.field_s + param12.field_j * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_u = param5 >> 2;
                param12.field_q = param6 >> 2;
                param12.field_p = param3 << 8;
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

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, kg param9) {
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
        param9.field_u = param9.field_u + param9.field_t * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_r * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_s = param4 >> 2;
                param9.field_p = param2 << 8;
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

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kg param11, int param12, int param13) {
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
                param11.field_p = param4;
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

    final synchronized void b(int param0, int param1) {
        ((kg) this).a(param0, param1, ((kg) this).k());
    }

    final od a() {
        return null;
    }

    final synchronized void c(int param0, int param1) {
        ((kg) this).field_o = param0;
        ((kg) this).field_k = param1;
        ((kg) this).field_v = 0;
        this.l();
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kg param11, int param12, int param13) {
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
                param11.field_p = param4;
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

    final synchronized void g(int param0) {
        int var2 = ((ko) (Object) ((kg) this).field_h).field_k.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((kg) this).field_p = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = kg.d(param1, param2);
          var5 = kg.a(param1, param2);
          if (((kg) this).field_u == var4) {
            if (((kg) this).field_q == var5) {
              ((kg) this).field_v = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((kg) this).field_s;
                if (((kg) this).field_s - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((kg) this).field_s - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((kg) this).field_u <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((kg) this).field_u;
                  break L1;
                }
              }
              L2: {
                if (((kg) this).field_u - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((kg) this).field_u - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((kg) this).field_q <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((kg) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((kg) this).field_q - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((kg) this).field_q - var5;
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
              ((kg) this).field_v = param0;
              ((kg) this).field_o = param1;
              ((kg) this).field_k = param2;
              ((kg) this).field_j = (param1 - ((kg) this).field_s) / param0;
              ((kg) this).field_t = (var4 - ((kg) this).field_u) / param0;
              ((kg) this).field_r = (var5 - ((kg) this).field_q) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((kg) this).field_s;
              if (((kg) this).field_s - param1 <= var6) {
                break L6;
              } else {
                var6 = ((kg) this).field_s - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((kg) this).field_u <= var6) {
                break L7;
              } else {
                var6 = var4 - ((kg) this).field_u;
                break L7;
              }
            }
            L8: {
              if (((kg) this).field_u - var4 <= var6) {
                break L8;
              } else {
                var6 = ((kg) this).field_u - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((kg) this).field_q <= var6) {
                break L9;
              } else {
                var6 = var5 - ((kg) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((kg) this).field_q - var5 <= var6) {
                break L10;
              } else {
                var6 = ((kg) this).field_q - var5;
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
            ((kg) this).field_v = param0;
            ((kg) this).field_o = param1;
            ((kg) this).field_k = param2;
            ((kg) this).field_j = (param1 - ((kg) this).field_s) / param0;
            ((kg) this).field_t = (var4 - ((kg) this).field_u) / param0;
            ((kg) this).field_r = (var5 - ((kg) this).field_q) / param0;
            return;
          }
        } else {
          ((kg) this).c(param1, param2);
          return;
        }
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final int b() {
        int var1 = ((kg) this).field_s * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((kg) this).field_w == 0) {
            var1 = var1 - var1 * ((kg) this).field_p / (((ko) (Object) ((kg) this).field_h).field_k.length << 8);
        } else {
            if (((kg) this).field_w >= 0) {
                var1 = var1 - var1 * ((kg) this).field_l / ((ko) (Object) ((kg) this).field_h).field_k.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final int c() {
        if (((kg) this).field_o == 0) {
            if (((kg) this).field_v == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, kg param12) {
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
        param12.field_s = param12.field_s + param12.field_j * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_u = param5 >> 2;
                param12.field_q = param6 >> 2;
                param12.field_p = param3 << 8;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kg param8) {
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
        param8.field_p = param2 << 8;
        return param3;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kg param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_u = param11.field_u - param11.field_t * param5;
            param11.field_q = param11.field_q - param11.field_r * param5;
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
                param11.field_u = param11.field_u + param11.field_t * param5;
                param11.field_q = param11.field_q + param11.field_r * param5;
                param11.field_s = param6;
                param11.field_p = param4;
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

    private final static int d(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized void b(boolean param0) {
        ((kg) this).field_m = (((kg) this).field_m ^ ((kg) this).field_m >> 31) + (((kg) this).field_m >>> 31);
        if (param0) {
          ((kg) this).field_m = -((kg) this).field_m;
          return;
        } else {
          return;
        }
    }

    final synchronized int j() {
        return ((kg) this).field_o == -2147483648 ? 0 : ((kg) this).field_o;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kg param8) {
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
        param8.field_p = param2 << 8;
        return param3;
    }

    private final synchronized void e(int param0) {
        ((kg) this).c(param0, ((kg) this).k());
    }

    private final void i() {
        if (((kg) this).field_v != 0) {
            if (((kg) this).field_o == -2147483648) {
                ((kg) this).field_o = 0;
            }
            ((kg) this).field_v = 0;
            this.l();
            return;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, kg param10, int param11, int param12) {
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
        param10.field_p = param4;
        return param5;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, kg param10) {
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
                param10.field_p = param3 << 8;
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

    final static kg b(ko param0, int param1, int param2, int param3) {
        if (param0.field_k != null) {
          if (param0.field_k.length == 0) {
            return null;
          } else {
            return new kg(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized boolean h() {
        return ((kg) this).field_p < 0 || ((kg) this).field_p >= ((ko) (Object) ((kg) this).field_h).field_k.length << 8;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, kg param9) {
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
        param9.field_u = param9.field_u + param9.field_t * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_r * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_s = param4 >> 2;
                param9.field_p = param2 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, kg param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_s = param13.field_s - param13.field_j * param5;
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
                param13.field_s = param13.field_s + param13.field_j * param5;
                param13.field_u = param6;
                param13.field_q = param7;
                param13.field_p = param4;
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

    final synchronized void d(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((kg) this).field_u == 0) {
            if (((kg) this).field_q == 0) {
              ((kg) this).field_v = 0;
              ((kg) this).field_o = 0;
              ((kg) this).field_s = 0;
              ((kg) this).a(false);
              return;
            } else {
              L0: {
                var2 = -((kg) this).field_s;
                if (((kg) this).field_s <= var2) {
                  break L0;
                } else {
                  var2 = ((kg) this).field_s;
                  break L0;
                }
              }
              L1: {
                if (-((kg) this).field_u <= var2) {
                  break L1;
                } else {
                  var2 = -((kg) this).field_u;
                  break L1;
                }
              }
              L2: {
                if (((kg) this).field_u <= var2) {
                  break L2;
                } else {
                  var2 = ((kg) this).field_u;
                  break L2;
                }
              }
              L3: {
                if (-((kg) this).field_q <= var2) {
                  break L3;
                } else {
                  var2 = -((kg) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((kg) this).field_q <= var2) {
                  break L4;
                } else {
                  var2 = ((kg) this).field_q;
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
              ((kg) this).field_v = param0;
              ((kg) this).field_o = -2147483648;
              ((kg) this).field_j = -((kg) this).field_s / param0;
              ((kg) this).field_t = -((kg) this).field_u / param0;
              ((kg) this).field_r = -((kg) this).field_q / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((kg) this).field_s;
              if (((kg) this).field_s <= var2) {
                break L6;
              } else {
                var2 = ((kg) this).field_s;
                break L6;
              }
            }
            L7: {
              if (-((kg) this).field_u <= var2) {
                break L7;
              } else {
                var2 = -((kg) this).field_u;
                break L7;
              }
            }
            L8: {
              if (((kg) this).field_u <= var2) {
                break L8;
              } else {
                var2 = ((kg) this).field_u;
                break L8;
              }
            }
            L9: {
              if (-((kg) this).field_q <= var2) {
                break L9;
              } else {
                var2 = -((kg) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((kg) this).field_q <= var2) {
                break L10;
              } else {
                var2 = ((kg) this).field_q;
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
            ((kg) this).field_v = param0;
            ((kg) this).field_o = -2147483648;
            ((kg) this).field_j = -((kg) this).field_s / param0;
            ((kg) this).field_t = -((kg) this).field_u / param0;
            ((kg) this).field_r = -((kg) this).field_q / param0;
            return;
          }
        } else {
          this.e(0);
          ((kg) this).a(false);
          return;
        }
    }

    final synchronized void f(int param0) {
        ((kg) this).field_w = param0;
    }

    private final boolean g() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((kg) this).field_o;
          if (var1 != -2147483648) {
            var2 = kg.d(var1, ((kg) this).field_k);
            var3 = kg.a(var1, ((kg) this).field_k);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((kg) this).field_s != var1) {
            break L1;
          } else {
            if (((kg) this).field_u != var2) {
              break L1;
            } else {
              if (((kg) this).field_q == var3) {
                if (((kg) this).field_o == -2147483648) {
                  ((kg) this).field_o = 0;
                  ((kg) this).field_q = 0;
                  ((kg) this).field_u = 0;
                  ((kg) this).field_s = 0;
                  ((kg) this).a(false);
                  return true;
                } else {
                  this.l();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((kg) this).field_s >= var1) {
            if (((kg) this).field_s <= var1) {
              ((kg) this).field_j = 0;
              break L2;
            } else {
              ((kg) this).field_j = -1;
              ((kg) this).field_v = ((kg) this).field_s - var1;
              break L2;
            }
          } else {
            ((kg) this).field_j = 1;
            ((kg) this).field_v = var1 - ((kg) this).field_s;
            break L2;
          }
        }
        L3: {
          if (((kg) this).field_u >= var2) {
            if (((kg) this).field_u <= var2) {
              ((kg) this).field_t = 0;
              break L3;
            } else {
              L4: {
                ((kg) this).field_t = -1;
                if (((kg) this).field_v == 0) {
                  break L4;
                } else {
                  if (((kg) this).field_v <= ((kg) this).field_u - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((kg) this).field_v = ((kg) this).field_u - var2;
              break L3;
            }
          } else {
            L5: {
              ((kg) this).field_t = 1;
              if (((kg) this).field_v == 0) {
                break L5;
              } else {
                if (((kg) this).field_v <= var2 - ((kg) this).field_u) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((kg) this).field_v = var2 - ((kg) this).field_u;
            break L3;
          }
        }
        if (((kg) this).field_q < var3) {
          ((kg) this).field_r = 1;
          if (((kg) this).field_v != 0) {
            if (((kg) this).field_v > var3 - ((kg) this).field_q) {
              ((kg) this).field_v = var3 - ((kg) this).field_q;
              return false;
            } else {
              return false;
            }
          } else {
            ((kg) this).field_v = var3 - ((kg) this).field_q;
            return false;
          }
        } else {
          L6: {
            if (((kg) this).field_q <= var3) {
              ((kg) this).field_r = 0;
              break L6;
            } else {
              L7: {
                ((kg) this).field_r = -1;
                if (((kg) this).field_v == 0) {
                  break L7;
                } else {
                  if (((kg) this).field_v <= ((kg) this).field_q - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((kg) this).field_v = ((kg) this).field_q - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized void a(int param0) {
        ko var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((kg) this).field_v <= 0) {
            break L0;
          } else {
            if (param0 < ((kg) this).field_v) {
              ((kg) this).field_s = ((kg) this).field_s + ((kg) this).field_j * param0;
              ((kg) this).field_u = ((kg) this).field_u + ((kg) this).field_t * param0;
              ((kg) this).field_q = ((kg) this).field_q + ((kg) this).field_r * param0;
              ((kg) this).field_v = ((kg) this).field_v - param0;
              break L0;
            } else {
              L1: {
                if (((kg) this).field_o != -2147483648) {
                  break L1;
                } else {
                  ((kg) this).field_o = 0;
                  ((kg) this).field_q = 0;
                  ((kg) this).field_u = 0;
                  ((kg) this).field_s = 0;
                  ((kg) this).a(false);
                  param0 = ((kg) this).field_v;
                  break L1;
                }
              }
              ((kg) this).field_v = 0;
              this.l();
              break L0;
            }
          }
        }
        L2: {
          var2 = (ko) (Object) ((kg) this).field_h;
          var3 = ((kg) this).field_l << 8;
          var4 = ((kg) this).field_x << 8;
          var5 = var2.field_k.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((kg) this).field_w = 0;
            break L2;
          }
        }
        L3: {
          if (((kg) this).field_p >= 0) {
            break L3;
          } else {
            if (((kg) this).field_m <= 0) {
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              ((kg) this).field_p = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((kg) this).field_p < var5) {
            break L4;
          } else {
            if (((kg) this).field_m >= 0) {
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              ((kg) this).field_p = var5 - 1;
              break L4;
            }
          }
        }
        ((kg) this).field_p = ((kg) this).field_p + ((kg) this).field_m * param0;
        if (((kg) this).field_w >= 0) {
          L5: {
            if (((kg) this).field_w <= 0) {
              break L5;
            } else {
              if (!((kg) this).field_n) {
                L6: {
                  if (((kg) this).field_m >= 0) {
                    if (((kg) this).field_p >= var4) {
                      var7 = (((kg) this).field_p - var3) / var6;
                      if (var7 < ((kg) this).field_w) {
                        ((kg) this).field_p = ((kg) this).field_p - var6 * var7;
                        ((kg) this).field_w = ((kg) this).field_w - var7;
                        break L6;
                      } else {
                        ((kg) this).field_p = ((kg) this).field_p - var6 * ((kg) this).field_w;
                        ((kg) this).field_w = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((kg) this).field_p < var3) {
                      var7 = (var4 - 1 - ((kg) this).field_p) / var6;
                      if (var7 < ((kg) this).field_w) {
                        ((kg) this).field_p = ((kg) this).field_p + var6 * var7;
                        ((kg) this).field_w = ((kg) this).field_w - var7;
                        break L6;
                      } else {
                        ((kg) this).field_p = ((kg) this).field_p + var6 * ((kg) this).field_w;
                        ((kg) this).field_w = 0;
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
                  if (((kg) this).field_m >= 0) {
                    break L7;
                  } else {
                    if (((kg) this).field_p < var3) {
                      ((kg) this).field_p = var3 + var3 - 1 - ((kg) this).field_p;
                      ((kg) this).field_m = -((kg) this).field_m;
                      ((kg) this).field_w = ((kg) this).field_w - 1;
                      if (((kg) this).field_w - 1 != 0) {
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
                  if (((kg) this).field_p >= var4) {
                    ((kg) this).field_p = var4 + var4 - 1 - ((kg) this).field_p;
                    ((kg) this).field_m = -((kg) this).field_m;
                    ((kg) this).field_w = ((kg) this).field_w - 1;
                    if (((kg) this).field_w - 1 != 0) {
                      if (((kg) this).field_p < var3) {
                        ((kg) this).field_p = var3 + var3 - 1 - ((kg) this).field_p;
                        ((kg) this).field_m = -((kg) this).field_m;
                        ((kg) this).field_w = ((kg) this).field_w - 1;
                        if (((kg) this).field_w - 1 != 0) {
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
          if (((kg) this).field_m < 0) {
            if (((kg) this).field_p < 0) {
              ((kg) this).field_p = -1;
              this.i();
              ((kg) this).a(false);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((kg) this).field_p < var5) {
                break L9;
              } else {
                ((kg) this).field_p = var5;
                this.i();
                ((kg) this).a(false);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((kg) this).field_n) {
            if (((kg) this).field_m >= 0) {
              if (((kg) this).field_p < var4) {
                return;
              } else {
                ((kg) this).field_p = var3 + (((kg) this).field_p - var3) % var6;
                return;
              }
            } else {
              if (((kg) this).field_p < var3) {
                ((kg) this).field_p = var4 - 1 - (var4 - 1 - ((kg) this).field_p) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((kg) this).field_m >= 0) {
                break L10;
              } else {
                if (((kg) this).field_p < var3) {
                  ((kg) this).field_p = var3 + var3 - 1 - ((kg) this).field_p;
                  ((kg) this).field_m = -((kg) this).field_m;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((kg) this).field_p >= var4) {
                ((kg) this).field_p = var4 + var4 - 1 - ((kg) this).field_p;
                ((kg) this).field_m = -((kg) this).field_m;
                if (((kg) this).field_p < var3) {
                  ((kg) this).field_p = var3 + var3 - 1 - ((kg) this).field_p;
                  ((kg) this).field_m = -((kg) this).field_m;
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

    final od d() {
        return null;
    }

    final synchronized int f() {
        return ((kg) this).field_m < 0 ? -((kg) this).field_m : ((kg) this).field_m;
    }

    private final void l() {
        ((kg) this).field_s = ((kg) this).field_o;
        ((kg) this).field_u = kg.d(((kg) this).field_o, ((kg) this).field_k);
        ((kg) this).field_q = kg.a(((kg) this).field_o, ((kg) this).field_k);
    }

    private kg(ko param0, int param1, int param2) {
        ((kg) this).field_h = (cg) (Object) param0;
        ((kg) this).field_l = param0.field_g;
        ((kg) this).field_x = param0.field_h;
        ((kg) this).field_n = param0.field_i;
        ((kg) this).field_m = param1;
        ((kg) this).field_o = param2;
        ((kg) this).field_k = 8192;
        ((kg) this).field_p = 0;
        this.l();
    }

    private kg(ko param0, int param1, int param2, int param3) {
        ((kg) this).field_h = (cg) (Object) param0;
        ((kg) this).field_l = param0.field_g;
        ((kg) this).field_x = param0.field_h;
        ((kg) this).field_n = param0.field_i;
        ((kg) this).field_m = param1;
        ((kg) this).field_o = param2;
        ((kg) this).field_k = param3;
        ((kg) this).field_p = 0;
        this.l();
    }
}
