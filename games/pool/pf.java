/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private int field_h;
    private boolean field_i;
    private int field_g;
    private int field_d;
    static of field_c;
    dd[] field_j;
    private int field_f;
    dd field_b;
    private int field_l;
    static hj field_e;
    static int field_k;
    static String field_a;

    final void a(int param0, pf param1) {
        try {
            param1.field_d = this.field_d;
            if (param0 != 288) {
                pf.b(85, -110);
            }
            param1.field_i = this.field_i;
            param1.field_l = this.field_l;
            param1.field_f = this.field_f;
            param1.field_j = this.field_j;
            param1.field_h = this.field_h;
            param1.field_g = this.field_g;
            param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "pf.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static float b(int param0, int param1) {
        if (param0 <= 125) {
            pf.b(3, -70);
            return de.a(-1, 16, param1);
        }
        return de.a(-1, 16, param1);
    }

    final pf b(boolean param0, int param1) {
        this.field_h = param1;
        if (!param0) {
            return (pf) null;
        }
        return (pf) (this);
    }

    final pf a(int param0, int param1) {
        this.field_g = param0;
        if (param1 != -1) {
            return (pf) null;
        }
        return (pf) (this);
    }

    final static void a(int param0, int param1, int param2, lr param3, String param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param4);
              var6 = param3.field_w + param3.field_L;
              var7 = pa.field_H;
              if (6 + var7 - -var5_int <= qh.field_l) {
                break L1;
              } else {
                var7 = -var5_int + qh.field_l - 6;
                break L1;
              }
            }
            L2: {
              var8 = 32 + (-param3.field_L + pm.field_p);
              if (qh.field_f < var8 + var6 - -6) {
                var8 = -6 + -var6 + qh.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            qh.b(var7, var8, var5_int - -6, var6 + 6, param1);
            qh.f(1 + var7, var8 - -1, var5_int + param2, 4 + var6, param0);
            param3.d(param4, var7 - -3, param3.field_L + (var8 - -3), param1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        if (param0) {
          nr.field_bb = false;
          var2 = 110 % ((74 - param1) / 32);
          if (param0) {
            if ((hb.field_a ^ -1) < -1) {
              hb.field_a = hb.field_a - 1;
              return;
            } else {
              if (uf.field_z > 0) {
                uf.field_z = uf.field_z - 1;
                return;
              } else {
                if (0 < nj.field_b) {
                  nj.field_b = nj.field_b - 1;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (em.field_L != null) {
              if ((hb.field_a ^ -1) >= -1) {
                if (uf.field_z > 0) {
                  uf.field_z = uf.field_z - 1;
                  return;
                } else {
                  if (ir.field_h <= nj.field_b) {
                    return;
                  } else {
                    L0: {
                      if (nj.field_b == 0) {
                        db.a(27194, false);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    nj.field_b = nj.field_b + 1;
                    return;
                  }
                }
              } else {
                hb.field_a = hb.field_a - 1;
                return;
              }
            } else {
              if (tp.field_e != null) {
                if ((hb.field_a ^ -1) >= -1) {
                  if (-1 <= (nj.field_b ^ -1)) {
                    if (uf.field_z < ir.field_h) {
                      if (uf.field_z == 0) {
                        db.a(27194, true);
                        uf.field_z = uf.field_z + 1;
                        return;
                      } else {
                        uf.field_z = uf.field_z + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nj.field_b = nj.field_b - 1;
                    return;
                  }
                } else {
                  hb.field_a = hb.field_a - 1;
                  return;
                }
              } else {
                nr.field_bb = false;
                if (0 >= uf.field_z) {
                  if ((nj.field_b ^ -1) >= -1) {
                    if (hb.field_a >= ir.field_h) {
                      return;
                    } else {
                      L1: {
                        if (-1 == (hb.field_a ^ -1)) {
                          cn.a(-128);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      hb.field_a = hb.field_a + 1;
                      return;
                    }
                  } else {
                    nj.field_b = nj.field_b - 1;
                    return;
                  }
                } else {
                  uf.field_z = uf.field_z - 1;
                  return;
                }
              }
            }
          }
        } else {
          if (em.field_L == null) {
            nr.field_bb = false;
            var2 = 110 % ((74 - param1) / 32);
            if (param0) {
              if ((hb.field_a ^ -1) >= -1) {
                if (uf.field_z <= 0) {
                  if (0 < nj.field_b) {
                    nj.field_b = nj.field_b - 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  uf.field_z = uf.field_z - 1;
                  return;
                }
              } else {
                hb.field_a = hb.field_a - 1;
                return;
              }
            } else {
              if (em.field_L != null) {
                if ((hb.field_a ^ -1) >= -1) {
                  if (uf.field_z <= 0) {
                    if (ir.field_h > nj.field_b) {
                      L2: {
                        if (nj.field_b == 0) {
                          db.a(27194, false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      nj.field_b = nj.field_b + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    uf.field_z = uf.field_z - 1;
                    return;
                  }
                } else {
                  hb.field_a = hb.field_a - 1;
                  return;
                }
              } else {
                if (tp.field_e != null) {
                  if ((hb.field_a ^ -1) >= -1) {
                    if (-1 <= (nj.field_b ^ -1)) {
                      if (uf.field_z < ir.field_h) {
                        if (uf.field_z == 0) {
                          db.a(27194, true);
                          uf.field_z = uf.field_z + 1;
                          return;
                        } else {
                          uf.field_z = uf.field_z + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      nj.field_b = nj.field_b - 1;
                      return;
                    }
                  } else {
                    hb.field_a = hb.field_a - 1;
                    return;
                  }
                } else {
                  nr.field_bb = false;
                  if (0 < uf.field_z) {
                    uf.field_z = uf.field_z - 1;
                    return;
                  } else {
                    L3: {
                      if ((nj.field_b ^ -1) < -1) {
                        nj.field_b = nj.field_b - 1;
                        break L3;
                      } else {
                        if (hb.field_a < ir.field_h) {
                          L4: {
                            if (-1 == (hb.field_a ^ -1)) {
                              cn.a(-128);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          hb.field_a = hb.field_a + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            L5: {
              var2 = 110 % ((74 - param1) / 32);
              if (em.field_L != null) {
                if ((hb.field_a ^ -1) >= -1) {
                  if (uf.field_z <= 0) {
                    if (ir.field_h > nj.field_b) {
                      L6: {
                        if (nj.field_b == 0) {
                          db.a(27194, false);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      nj.field_b = nj.field_b + 1;
                      break L5;
                    } else {
                      return;
                    }
                  } else {
                    uf.field_z = uf.field_z - 1;
                    return;
                  }
                } else {
                  hb.field_a = hb.field_a - 1;
                  return;
                }
              } else {
                if (tp.field_e != null) {
                  if ((hb.field_a ^ -1) >= -1) {
                    if (-1 <= (nj.field_b ^ -1)) {
                      if (uf.field_z < ir.field_h) {
                        if (uf.field_z == 0) {
                          db.a(27194, true);
                          uf.field_z = uf.field_z + 1;
                          break L5;
                        } else {
                          uf.field_z = uf.field_z + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      nj.field_b = nj.field_b - 1;
                      break L5;
                    }
                  } else {
                    hb.field_a = hb.field_a - 1;
                    break L5;
                  }
                } else {
                  nr.field_bb = false;
                  if (0 < uf.field_z) {
                    uf.field_z = uf.field_z - 1;
                    break L5;
                  } else {
                    if ((nj.field_b ^ -1) < -1) {
                      nj.field_b = nj.field_b - 1;
                      break L5;
                    } else {
                      if (hb.field_a < ir.field_h) {
                        L7: {
                          if (-1 == (hb.field_a ^ -1)) {
                            cn.a(-128);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        hb.field_a = hb.field_a + 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0) {
        this.field_f = 0;
        this.field_d = 256;
        this.field_g = 0;
        int var2 = -73 / ((param0 - -15) / 36);
        this.field_h = -1;
        this.field_b = null;
        this.field_j = null;
        this.field_l = 0;
    }

    final void a(lg param0, int param1, pf param2, int param3, ei param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_i) {
                break L1;
              } else {
                param2.a(param1, param5, param4, param0, 117);
                param2.a(23);
                break L1;
              }
            }
            L2: {
              if (this.field_l >= -1) {
                param2.field_l = this.field_l;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 < -95) {
                break L3;
              } else {
                pf.b(-95, 89);
                break L3;
              }
            }
            L4: {
              if ((this.field_h ^ -1) > 0) {
                break L4;
              } else {
                param2.field_h = this.field_h;
                break L4;
              }
            }
            L5: {
              if (null == this.field_j) {
                break L5;
              } else {
                param2.field_j = this.field_j;
                break L5;
              }
            }
            L6: {
              if (2147483647 != (this.field_f ^ -1)) {
                param2.field_f = this.field_f;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null == this.field_b) {
                break L7;
              } else {
                param2.field_b = this.field_b;
                break L7;
              }
            }
            L8: {
              if (-2147483648 == this.field_g) {
                break L8;
              } else {
                param2.field_g = this.field_g;
                break L8;
              }
            }
            L9: {
              if (-2147483648 != this.field_d) {
                param2.field_d = this.field_d;
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("pf.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ',' + param5 + ')');
        }
    }

    final pf a(dd[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 54) {
                break L1;
              } else {
                this.field_l = -118;
                break L1;
              }
            }
            this.field_j = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pf.O(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (pf) (this);
    }

    final pf c(int param0, int param1) {
        this.field_l = param0;
        if (param1 <= 3) {
            field_e = (hj) null;
            return (pf) (this);
        }
        return (pf) (this);
    }

    final static dd a(String param0, byte param1, String param2, di param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.b(param0, -1);
              if (param1 > 29) {
                break L1;
              } else {
                field_e = (hj) null;
                break L1;
              }
            }
            var5 = param3.a(var4_int, 0, param2);
            stackIn_3_0 = vh.a(var4_int, param3, -55, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pf.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final pf a(int param0, byte param1) {
        if (param1 != 90) {
            this.field_j = (dd[]) null;
            this.field_f = param0;
            return (pf) (this);
        }
        this.field_f = param0;
        return (pf) (this);
    }

    final static void a(boolean param0) {
        rg.field_p = param0 ? true : false;
        hn.field_b = 0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 7) {
            return;
        }
        field_a = null;
    }

    final pf a(int param0, boolean param1) {
        if (param0 != -15359) {
            return (pf) null;
        }
        this.field_i = param1 ? true : false;
        return (pf) (this);
    }

    pf() {
        this.field_h = -2;
        this.field_j = null;
        this.field_g = -2147483648;
        this.field_d = -2147483648;
        this.field_b = null;
        this.field_f = -2147483648;
        this.field_i = false;
        this.field_l = -2;
    }

    final void a(int param0, int param1, ei param2, lg param3, int param4) {
        lr stackIn_20_0 = null;
        String stackIn_20_1 = null;
        lr stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              nj.a(this.field_j, (byte) -112, param2.field_l, param1 + param2.field_C, param0 + param2.field_D, param2.field_y);
              if (null == this.field_b) {
                break L1;
              } else {
                L2: {
                  var6_int = param2.field_C + param1 + this.field_g;
                  if ((param3.field_m ^ -1) == -2) {
                    var6_int = var6_int + (param2.field_l - this.field_b.field_w) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = param0 + (param2.field_D + this.field_f);
                  if (-2 != (param3.field_p ^ -1)) {
                    break L3;
                  } else {
                    var7 = var7 + (param2.field_y - this.field_b.field_y) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (2 != param3.field_m) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param2.field_l + -this.field_b.field_w);
                    break L4;
                  }
                }
                L5: {
                  if (2 == param3.field_p) {
                    var7 = var7 + (-this.field_b.field_y + param2.field_y);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_b.c(var6_int, var7);
                break L1;
              }
            }
            L6: {
              var6 = param3.c(-1, param2);
              if (param4 > 96) {
                break L6;
              } else {
                this.field_h = 108;
                break L6;
              }
            }
            L7: {
              L8: {
                if (var6 == null) {
                  break L8;
                } else {
                  if (param3.field_a == null) {
                    break L8;
                  } else {
                    if (-1 >= (this.field_l ^ -1)) {
                      L9: {
                        stackIn_20_0 = param3.field_a;

                        stackIn_20_1 = (String) (var6);

                        if (2147483647 != (this.field_g ^ -1)) {
                          stackIn_21_0 = (lr) ((Object) stackIn_20_0);
                          stackIn_21_1 = (String) ((Object) stackIn_20_1);
                          stackIn_21_2 = this.field_g;
                          break L9;
                        } else {
                          stackIn_21_0 = (lr) ((Object) stackIn_20_0);
                          stackIn_21_1 = (String) ((Object) stackIn_20_1);
                          stackIn_21_2 = 0;
                          break L9;
                        }
                      }
                      L10: {




                        stackIn_23_2 = stackIn_21_2 + param3.field_i + (param2.field_C + param1);

                        stackIn_23_3 = param3.field_f + param2.field_D + param0;

                        if (-2147483648 != this.field_f) {
                          stackIn_21_0 = (lr) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);
                          stackIn_24_2 = stackIn_23_2;
                          stackIn_24_3 = stackIn_23_3;
                          stackIn_24_4 = this.field_f;
                          break L10;
                        } else {
                          stackIn_21_0 = (lr) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);
                          stackIn_24_2 = stackIn_23_2;
                          stackIn_24_3 = stackIn_23_3;
                          stackIn_24_4 = 0;
                          break L10;
                        }
                      }
                      L11: {






                        stackIn_26_3 = stackIn_24_3 - -stackIn_24_4;

                        stackIn_26_4 = -param3.field_i + (param2.field_l + -param3.field_g);

                        stackIn_26_5 = -param3.field_j + param2.field_y + -param3.field_f;

                        stackIn_26_6 = this.field_l;

                        stackIn_26_7 = this.field_h;

                        if (2147483647 != (this.field_d ^ -1)) {
                          stackIn_21_0 = (lr) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);

                          stackIn_27_3 = stackIn_26_3;
                          stackIn_27_4 = stackIn_26_4;
                          stackIn_27_5 = stackIn_26_5;
                          stackIn_27_6 = stackIn_26_6;
                          stackIn_27_7 = stackIn_26_7;
                          stackIn_27_8 = this.field_d;
                          break L11;
                        } else {
                          stackIn_21_0 = (lr) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);

                          stackIn_27_3 = stackIn_26_3;
                          stackIn_27_4 = stackIn_26_4;
                          stackIn_27_5 = stackIn_26_5;
                          stackIn_27_6 = stackIn_26_6;
                          stackIn_27_7 = stackIn_26_7;
                          stackIn_27_8 = 256;
                          break L11;
                        }
                      }
                      ((lr) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_m, param3.field_p, param3.field_b);
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              break L7;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6_ref);

            stackIn_31_1 = new StringBuilder().append("pf.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L13;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    static {
        field_e = new hj(11, 0, 1, 2);
        field_a = "Nine-ball";
    }
}
