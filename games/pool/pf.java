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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.field_d = this.field_d;
              if (param0 == 288) {
                break L1;
              } else {
                pf.b(85, -110);
                break L1;
              }
            }
            param1.field_i = this.field_i;
            param1.field_l = this.field_l;
            param1.field_f = this.field_f;
            param1.field_j = this.field_j;
            param1.field_h = this.field_h;
            param1.field_g = this.field_g;
            param1.field_b = this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("pf.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static float b(int param0, int param1) {
        RuntimeException var2 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 125) {
                break L1;
              } else {
                pf.b(3, -70);
                break L1;
              }
            }
            stackIn_3_0 = de.a(-1, 16, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "pf.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final pf b(boolean param0, int param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_h = param1;
            if (param0) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pf) (this);
        }
    }

    final pf a(int param0, int param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_g = param0;
            if (param1 == -1) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pf) (this);
        }
    }

    final static void a(int param0, int param1, int param2, lr param3, String param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  if (em.field_L != null) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              nr.field_bb = false;
              break L1;
            }
            var2_int = 110 % ((74 - param1) / 32);
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
              L3: {
                if (em.field_L != null) {
                  if ((hb.field_a ^ -1) < -1) {
                    hb.field_a = hb.field_a - 1;
                    return;
                  } else {
                    if (uf.field_z > 0) {
                      uf.field_z = uf.field_z - 1;
                      return;
                    } else {
                      if (ir.field_h <= nj.field_b) {
                        break L3;
                      } else {
                        L4: {
                          if (nj.field_b == 0) {
                            db.a(27194, false);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        nj.field_b = nj.field_b + 1;
                        return;
                      }
                    }
                  }
                } else {
                  if (tp.field_e != null) {
                    if ((hb.field_a ^ -1) >= -1) {
                      if (-1 <= (nj.field_b ^ -1)) {
                        if (uf.field_z >= ir.field_h) {
                          break L3;
                        } else {
                          L5: {
                            if (uf.field_z != 0) {
                              break L5;
                            } else {
                              db.a(27194, true);
                              break L5;
                            }
                          }
                          uf.field_z = uf.field_z + 1;
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
                      if ((nj.field_b ^ -1) < -1) {
                        nj.field_b = nj.field_b - 1;
                        return;
                      } else {
                        if (hb.field_a < ir.field_h) {
                          L6: {
                            if (-1 == (hb.field_a ^ -1)) {
                              cn.a(-128);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          hb.field_a = hb.field_a + 1;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "pf.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        try {
            this.field_f = 0;
            this.field_d = 256;
            this.field_g = 0;
            int var2_int = -73 / ((param0 - -15) / 36);
            this.field_h = -1;
            this.field_b = null;
            this.field_j = null;
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ')');
        }
    }

    final void a(lg param0, int param1, pf param2, int param3, ei param4, int param5) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
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
            if (-2147483648 != this.field_d) {
              param2.field_d = this.field_d;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("pf.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);

            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);

            stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param5 + ')');
        }
    }

    final pf a(dd[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pf.O(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return (pf) (this);
    }

    final pf c(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_l = param0;
              if (param1 > 3) {
                break L1;
              } else {
                field_e = (hj) null;
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.C(" + param0 + ',' + param1 + ')');
        }
        return (pf) (this);
    }

    final static dd a(String param0, byte param1, String param2, di param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("pf.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final pf a(int param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 90) {
                break L1;
              } else {
                this.field_j = (dd[]) null;
                break L1;
              }
            }
            this.field_f = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.L(" + param0 + ',' + param1 + ')');
        }
        return (pf) (this);
    }

    final static void a(boolean param0) {
        try {
            rg.field_p = param0;
            hn.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "pf.I(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 7) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "pf.G(" + param0 + ')');
        }
    }

    final pf a(int param0, boolean param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -15359) {
              L1: {
                stackIn_5_0 = this;

                if (!param1) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              ((pf) (this)).field_i = stackIn_6_1 != 0;
              stackIn_7_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pf) (this);
        }
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
        lr stackIn_25_0 = null;
        String stackIn_25_1 = null;
        lr stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        lr stackIn_29_0;
        String stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        lr stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        lr stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_33_4;
        int stackIn_33_5;
        int stackIn_33_6;
        int stackIn_33_7;
        lr stackIn_34_0;
        String stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_34_6;
        int stackIn_34_7;
        int stackIn_34_8;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
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
              if (var6 == null) {
                break L7;
              } else {
                if (param3.field_a == null) {
                  break L7;
                } else {
                  if (-1 >= (this.field_l ^ -1)) {
                    L8: {
                      stackIn_25_0 = param3.field_a;

                      stackIn_25_1 = (String) (var6);

                      if (2147483647 != (this.field_g ^ -1)) {
                        stackIn_26_0 = (lr) ((Object) stackIn_25_0);
                        stackIn_26_1 = (String) ((Object) stackIn_25_1);
                        stackIn_26_2 = this.field_g;
                        break L8;
                      } else {
                        stackIn_26_0 = (lr) ((Object) stackIn_25_0);
                        stackIn_26_1 = (String) ((Object) stackIn_25_1);
                        stackIn_26_2 = 0;
                        break L8;
                      }
                    }
                    L9: {
                      stackIn_29_0 = (lr) ((Object) stackIn_26_0);

                      stackIn_29_1 = (String) ((Object) stackIn_26_1);

                      stackIn_29_2 = stackIn_26_2 + param3.field_i + (param2.field_C + param1);

                      stackIn_29_3 = param3.field_f + param2.field_D + param0;

                      if (-2147483648 != this.field_f) {
                        stackIn_30_0 = (lr) ((Object) stackIn_29_0);
                        stackIn_30_1 = (String) ((Object) stackIn_29_1);
                        stackIn_30_2 = stackIn_29_2;
                        stackIn_30_3 = stackIn_29_3;
                        stackIn_30_4 = this.field_f;
                        break L9;
                      } else {
                        stackIn_30_0 = (lr) ((Object) stackIn_26_0);
                        stackIn_30_1 = (String) ((Object) stackIn_26_1);
                        stackIn_30_2 = stackIn_29_2;
                        stackIn_30_3 = stackIn_29_3;
                        stackIn_30_4 = 0;
                        break L9;
                      }
                    }
                    L10: {
                      stackIn_33_0 = (lr) ((Object) stackIn_30_0);

                      stackIn_33_1 = (String) ((Object) stackIn_30_1);

                      stackIn_33_2 = stackIn_30_2;

                      stackIn_33_3 = stackIn_30_3 - -stackIn_30_4;

                      stackIn_33_4 = -param3.field_i + (param2.field_l + -param3.field_g);

                      stackIn_33_5 = -param3.field_j + param2.field_y + -param3.field_f;

                      stackIn_33_6 = this.field_l;

                      stackIn_33_7 = this.field_h;

                      if (2147483647 != (this.field_d ^ -1)) {
                        stackIn_34_0 = (lr) ((Object) stackIn_33_0);
                        stackIn_34_1 = (String) ((Object) stackIn_33_1);
                        stackIn_34_2 = stackIn_33_2;
                        stackIn_34_3 = stackIn_33_3;
                        stackIn_34_4 = stackIn_33_4;
                        stackIn_34_5 = stackIn_33_5;
                        stackIn_34_6 = stackIn_33_6;
                        stackIn_34_7 = stackIn_33_7;
                        stackIn_34_8 = this.field_d;
                        break L10;
                      } else {
                        stackIn_34_0 = (lr) ((Object) stackIn_30_0);
                        stackIn_34_1 = (String) ((Object) stackIn_30_1);
                        stackIn_34_2 = stackIn_30_2;
                        stackIn_34_3 = stackIn_33_3;
                        stackIn_34_4 = stackIn_33_4;
                        stackIn_34_5 = stackIn_33_5;
                        stackIn_34_6 = stackIn_33_6;
                        stackIn_34_7 = stackIn_33_7;
                        stackIn_34_8 = 256;
                        break L10;
                      }
                    }
                    ((lr) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_34_7, stackIn_34_8, param3.field_m, param3.field_p, param3.field_b);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("pf.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          L12: {
            stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);

            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param3 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L12;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param4 + ')');
        }
    }

    static {
        field_e = new hj(11, 0, 1, 2);
        field_a = "Nine-ball";
    }
}
