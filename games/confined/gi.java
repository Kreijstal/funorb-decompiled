/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    private oi field_cb;
    static fi field_bb;
    static String field_fb;
    static String field_hb;
    private double field_gb;
    static byte[] field_db;
    static bi field_eb;

    final static vk a(m param0, byte param1, mi param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vk stackIn_2_0 = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2.a(-51, param4);
            var6 = param2.a(var5_int, param3, param1 ^ 126);
            if (param1 == -65) {
              stackIn_4_0 = te.a((byte) -89, var6, param2, var5_int, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("gi.RA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    gi(hn param0, dj param1) {
        super(param0, param1, 0.5, 0.02, 64.0, pm.field_x);
        this.field_cb = new oi((pm) (this));
        try {
            kj.a(lf.field_i, 96, param1);
            this.field_gb = 64.0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, byte param1) {
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        try {
            var13 = new double[12];
            var12 = var13;
            var11 = var12;
            double[] var3 = var11;
            this.field_ab.a((byte) 47, var13);
            var4 = var13[9];
            var6 = var13[10];
            this.field_cb.field_t = -(this.field_C * var4) + this.field_E;
            var8 = var13[11];
            int var10 = -127 / ((-2 - param1) / 62);
            this.field_cb.field_o = -(var6 * this.field_C) + this.field_t;
            this.field_cb.field_v = -var8;
            this.field_cb.field_p = -(this.field_C * var8) + this.field_D;
            this.field_cb.field_w = true;
            this.field_cb.field_m = -var4;
            this.field_cb.field_x = -var6;
            this.field_cb.field_u = 50.0;
            param0.a((rk) (this.field_cb), (byte) 123);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gi.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -5) {
                break L1;
              } else {
                field_fb = (String) null;
                break L1;
              }
            }
            if (this.field_N) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var17 = new double[12];
                var16 = var17;
                var15 = var16;
                var7 = var15;
                this.field_ab.a((byte) 43, var17);
                var8 = var17[9];
                var10 = var17[10];
                var12 = var17[11];
                if (param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              L3: {
                var14 = stackIn_8_0;
                if (var14 == 0) {
                  break L3;
                } else {
                  this.a(u.field_T, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
                  break L3;
                }
              }
              pa.a(-(this.field_C * var8) + this.field_E, 0.5 * this.field_C, (byte) -11, 256, -(this.field_C * var12) + this.field_D, -(this.field_C * var10) + this.field_t, wb.field_a, param1, param3);
              if (var14 != 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.a(u.field_T, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("gi.QA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void m(int param0) {
        field_db = null;
        field_fb = null;
        field_bb = null;
        field_hb = null;
        field_eb = null;
        if (param0 != -11008) {
            String var2 = (String) null;
            gi.a((m) null, (byte) 3, (mi) null, (String) null, (String) null);
        }
    }

    final void g(int param0) {
        int var3;
        gk var5;
        gk var6;
        this.field_A.field_P = false;
        this.field_z = true;
        if (param0 == 26402) {
          L0: {
            this.field_A.field_L = 100;
            this.field_A.field_r = this.field_t;
            this.field_A.field_s = this.field_E;
            this.field_A.field_H = 0.6;
            this.field_A.field_E = this.field_D;
            this.field_A.field_A = 0.5;
            var6 = new gk(this.field_A, (pm) null, vf.field_n, 0, false);
            var6.field_w = 4.0;
            var6.field_m = 255;
            this.field_A.field_n = var6;
            var3 = this.field_A.field_J.field_o;
            if (-1 <= (this.field_A.field_x.field_t ^ -1)) {
              break L0;
            } else {
              if (this.field_A.field_x.field_r[this.field_A.field_x.field_t] <= this.field_D) {
                break L0;
              } else {
                L1: {
                  var3--;
                  if ((var3 ^ -1) > -5) {
                    break L1;
                  } else {
                    if ((var3 ^ -1) < -21) {
                      break L1;
                    } else {
                      if (0 == (var3 & 3)) {
                        di.a(-30867, 240, 15);
                        return;
                      } else {
                        if (var3 != 23) {
                          return;
                        } else {
                          di.a(-30867, 240, 15);
                          return;
                        }
                      }
                    }
                  }
                }
                if (var3 != 23) {
                  return;
                } else {
                  di.a(-30867, 240, 15);
                  return;
                }
              }
            }
          }
          L2: {
            if ((var3 ^ -1) > -5) {
              break L2;
            } else {
              if ((var3 ^ -1) < -21) {
                break L2;
              } else {
                if (0 == (var3 & 3)) {
                  di.a(-30867, 240, 15);
                  return;
                } else {
                  if (var3 != 23) {
                    return;
                  } else {
                    di.a(-30867, 240, 15);
                    return;
                  }
                }
              }
            }
          }
          if (var3 != 23) {
            return;
          } else {
            di.a(-30867, 240, 15);
            return;
          }
        } else {
          field_fb = (String) null;
          this.field_A.field_L = 100;
          this.field_A.field_r = this.field_t;
          this.field_A.field_s = this.field_E;
          this.field_A.field_H = 0.6;
          this.field_A.field_E = this.field_D;
          this.field_A.field_A = 0.5;
          var5 = new gk(this.field_A, (pm) null, vf.field_n, 0, false);
          var5.field_w = 4.0;
          var5.field_m = 255;
          this.field_A.field_n = var5;
          var3 = this.field_A.field_J.field_o;
          if (-1 > (this.field_A.field_x.field_t ^ -1)) {
            if (this.field_A.field_x.field_r[this.field_A.field_x.field_t] > this.field_D) {
              L3: {
                var3--;
                if ((var3 ^ -1) > -5) {
                  break L3;
                } else {
                  if ((var3 ^ -1) < -21) {
                    break L3;
                  } else {
                    if (0 == (var3 & 3)) {
                      di.a(-30867, 240, 15);
                      return;
                    } else {
                      if (var3 != 23) {
                        return;
                      } else {
                        di.a(-30867, 240, 15);
                        return;
                      }
                    }
                  }
                }
              }
              if (var3 != 23) {
                return;
              } else {
                di.a(-30867, 240, 15);
                return;
              }
            } else {
              L4: {
                if ((var3 ^ -1) > -5) {
                  break L4;
                } else {
                  if ((var3 ^ -1) < -21) {
                    break L4;
                  } else {
                    if (0 != (var3 & 3)) {
                      L5: {
                        if (var3 != 23) {
                          break L5;
                        } else {
                          di.a(-30867, 240, 15);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      di.a(-30867, 240, 15);
                      return;
                    }
                  }
                }
              }
              if (var3 == 23) {
                di.a(-30867, 240, 15);
                return;
              } else {
                return;
              }
            }
          } else {
            L6: {
              if ((var3 ^ -1) > -5) {
                break L6;
              } else {
                if ((var3 ^ -1) < -21) {
                  break L6;
                } else {
                  if (0 != (var3 & 3)) {
                    break L6;
                  } else {
                    di.a(-30867, 240, 15);
                    return;
                  }
                }
              }
            }
            if (var3 == 23) {
              di.a(-30867, 240, 15);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void b(boolean param0, ee param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != this.field_Y) {
                break L1;
              } else {
                L2: {
                  if (param1.field_z) {
                    break L2;
                  } else {
                    if ((this.field_S ^ -1) >= -1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_S = this.field_S + 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L3: {
              this.field_gb = param1.a(14170, true, this.field_gb);
              if (!param0) {
                break L3;
              } else {
                field_hb = (String) null;
                break L3;
              }
            }
            if (0.00001 <= this.field_gb) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(param1, 0.0, -123);
              param1.a(14170, false, this.field_X);
              this.d(10797);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("gi.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static mi a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        if (!param2) {
            return (mi) null;
        }
        return we.a(param0, false, (byte) -125, param4, param3, param1);
    }

    static {
        field_bb = new fi();
        field_hb = "You already have 4 nuclear missiles";
        field_fb = "Continue";
        field_db = new byte[520];
    }
}
