/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends rva implements tsa {
    int field_C;
    private int field_y;
    static String field_K;
    private boolean field_J;
    int field_O;
    private int field_B;
    private int field_I;
    static String field_E;
    private rj field_D;
    private rj field_F;
    private vp field_N;
    private rj field_z;
    private boolean field_P;
    private boolean field_x;
    private rj field_H;
    private int field_G;
    private rj field_L;
    int field_M;
    private int field_A;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 44) {
                break L1;
              } else {
                this.field_J = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3 != 1) {
                  break L3;
                } else {
                  if (!this.field_x) {
                    break L3;
                  } else {
                    L4: {
                      if (!this.field_P) {
                        break L4;
                      } else {
                        if (param2 != this.field_F) {
                          break L4;
                        } else {
                          this.a(this.field_O - this.field_M, (byte) -91);
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (!this.field_P) {
                        break L5;
                      } else {
                        if (param2 == this.field_H) {
                          this.a(this.field_M + this.field_O, (byte) -94);
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (!this.field_J) {
                        break L6;
                      } else {
                        if (this.field_L != param2) {
                          break L6;
                        } else {
                          this.b(13328, -this.field_A + this.field_C);
                          break L2;
                        }
                      }
                    }
                    if (!this.field_J) {
                      break L3;
                    } else {
                      if (this.field_z == param2) {
                        this.b(13328, this.field_A + this.field_C);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("jo.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0) {
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (this.field_L == null) {
            this.field_D.field_i = 0;
            break L0;
          } else {
            this.field_L.field_i = 0;
            this.field_L.field_n = this.field_p + -this.field_L.field_p >> -1916107615;
            this.field_D.field_i = this.field_L.field_i + this.field_L.field_m;
            break L0;
          }
        }
        L1: {
          if (this.field_z == null) {
            this.field_D.field_m = this.field_m + -this.field_D.field_i;
            break L1;
          } else {
            this.field_z.field_i = this.field_m + -this.field_z.field_m;
            this.field_z.field_n = -this.field_z.field_p + this.field_p >> 1001194177;
            this.field_D.field_m = -this.field_z.field_m + (this.field_m - this.field_D.field_i);
            break L1;
          }
        }
        L2: {
          this.h((byte) -125);
          if (this.field_F != null) {
            this.field_F.field_i = -this.field_F.field_m + this.field_m >> -1349481183;
            this.field_F.field_n = 0;
            this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
            break L2;
          } else {
            this.field_D.field_n = 0;
            break L2;
          }
        }
        if (param0 == 88) {
          L3: {
            if (null != this.field_H) {
              this.field_H.field_n = -this.field_H.field_p + this.field_p;
              this.field_H.field_i = -this.field_H.field_m + this.field_m >> -1482613119;
              this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
              break L3;
            } else {
              this.field_D.field_p = this.field_p + -this.field_D.field_n;
              break L3;
            }
          }
          L4: {
            this.e(param0 + -214);
            if (!this.field_P) {
              this.field_N.field_n = 0;
              this.field_N.field_p = this.field_D.field_p;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_J) {
              break L5;
            } else {
              this.field_N.field_i = 0;
              this.field_N.field_m = this.field_D.field_m;
              break L5;
            }
          }
          this.field_N.c((byte) 121);
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        rj stackIn_3_0 = null;
        rj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        rj stackIn_11_0 = null;
        rj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        rj stackIn_17_0 = null;
        rj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        rj stackIn_23_0 = null;
        rj stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        L0: {
          L1: {
            stackIn_3_0 = this.field_D;

            if (param1) {
              break L1;
            } else {


              if (!this.field_P) {
                stackIn_5_0 = (rj) ((Object) stackIn_3_0);
                stackIn_5_1 = 0;
                break L0;
              } else {
                stackIn_3_0 = (rj) ((Object) stackIn_3_0);
                break L1;
              }
            }
          }
          stackIn_5_0 = (rj) ((Object) stackIn_3_0);
          stackIn_5_1 = 1;
          break L0;
        }
        stackIn_5_0.field_y = stackIn_5_1 != 0;
        if (param0 < -80) {
          L2: {
            if (!(this.field_N.field_x instanceof rj)) {
              break L2;
            } else {
              L3: {
                L4: {
                  stackIn_11_0 = (rj) ((Object) this.field_N.field_x);

                  if (param1) {
                    break L4;
                  } else {


                    if (!this.field_P) {
                      stackIn_13_0 = (rj) ((Object) stackIn_11_0);
                      stackIn_13_1 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = (rj) ((Object) stackIn_11_0);
                      break L4;
                    }
                  }
                }
                stackIn_13_0 = (rj) ((Object) stackIn_11_0);
                stackIn_13_1 = 1;
                break L3;
              }
              stackIn_13_0.field_y = stackIn_13_1 != 0;
              break L2;
            }
          }
          L5: {
            if (this.field_L == null) {
              break L5;
            } else {
              L6: {
                stackIn_17_0 = this.field_L;

                if (!param1) {
                  stackIn_18_0 = (rj) ((Object) stackIn_17_0);
                  stackIn_18_1 = 0;
                  break L6;
                } else {
                  stackIn_18_0 = (rj) ((Object) stackIn_17_0);
                  stackIn_18_1 = 1;
                  break L6;
                }
              }
              stackIn_18_0.field_y = stackIn_18_1 != 0;
              break L5;
            }
          }
          L7: {
            if (this.field_z != null) {
              L8: {
                stackIn_23_0 = this.field_z;

                if (!param1) {
                  stackIn_24_0 = (rj) ((Object) stackIn_23_0);
                  stackIn_24_1 = 0;
                  break L8;
                } else {
                  stackIn_24_0 = (rj) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L8;
                }
              }
              stackIn_24_0.field_y = stackIn_24_1 != 0;
              break L7;
            } else {
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0 ^ 22876, param1);
        if (param0 != 13328) {
            return;
        }
        if (!(!(this.field_h instanceof tua))) {
            ((tua) ((Object) this.field_h)).a(9776, (jo) (this), this.field_C, this.field_O);
        }
    }

    public static void g(byte param0) {
        if (param0 >= -86) {
            return;
        }
        field_E = null;
        field_K = null;
    }

    private final void h(byte param0) {
        if (param0 > -30) {
            return;
        }
        int var2 = this.field_L == null ? this.field_D.field_i : this.field_L.field_m + this.field_L.field_i;
        int var3 = null != this.field_z ? -this.field_N.field_m + this.field_z.field_i : this.field_D.field_m + (this.field_D.field_i - this.field_N.field_m);
        this.field_N.field_i = var2 + ((var3 - var2) * this.field_C >> 2118902000);
    }

    private final void a(int param0, byte param1) {
        this.c(16, param0);
        if (param1 >= -90) {
            this.field_A = 107;
        }
        if (this.field_h instanceof tua) {
            ((tua) ((Object) this.field_h)).a(9776, (jo) (this), this.field_O, this.field_O);
        }
    }

    final static void a(jea param0, int param1, jea param2, jea param3, jea param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
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
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == oea.field_i) {
              L1: {
                ni.field_c = false;
                if (!fua.field_g) {
                  if (ok.field_s) {
                    var5 = rsa.field_z;
                    break L1;
                  } else {
                    var5 = wn.field_n;
                    break L1;
                  }
                } else {
                  var5 = kia.field_a;
                  break L1;
                }
              }
              var7 = (String) null;
              dqa.a(var5, 0, (String) null, sva.field_d, 127);
              pq.field_g.field_N = sva.field_d - (sva.field_d >> -1435144575 & 8355711) + ((bn.field_t.field_N & 16711422) >> -1980545055);
              pq.field_g.field_ab = (8355711 & bn.field_t.field_ab >> -1789710879) + (-((sva.field_d & 16711423) >> -615129791) + sva.field_d);
              pq.field_g.field_gb = ((16711423 & bn.field_t.field_gb) >> -67066655) + (sva.field_d - (sva.field_d >> 2119614145 & 8355711));
              rma.field_b = mka.field_b;
              oea.field_i = pq.field_g;
              wi.field_s = new jea((long)param1, param4);
              lra.field_e = new jea(0L, param0);
              ep.field_r = new jea(0L, (jea) null);
              dh.field_e = new jea(0L, param3);
              pq.field_g = new jea(0L, param2);
              pq.field_g.field_H = lpa.field_s;
              dh.field_e.b(-123, pq.field_g);
              mka.field_b = new jea(0L, rma.field_b);
              dh.field_e.b(-128, mka.field_b);
              lra.field_d = new jea(0L, bn.field_t, fw.field_a);
              qpa.field_b = new jea(0L, bn.field_t);
              wi.field_s.b(param1 ^ -122, lra.field_e);
              wi.field_s.b(-123, ep.field_r);
              ep.field_r.b(-123, dh.field_e);
              ep.field_r.b(-126, lra.field_d);
              ep.field_r.b(-125, qpa.field_b);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("jo.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1 ^ 0, param2, param3);
                if (!(this.field_N.field_x instanceof rj)) {
                  break L2;
                } else {
                  if (!((rj) ((Object) this.field_N.field_x)).field_y) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_N.field_s == 1) {
                L3: {
                  if (!this.field_J) {
                    this.h((byte) -101);
                    break L3;
                  } else {
                    var5_int = this.field_C;
                    this.d(-66);
                    if (this.field_C == var5_int) {
                      break L3;
                    } else {
                      if (!(this.field_h instanceof tua)) {
                        break L3;
                      } else {
                        ((tua) ((Object) this.field_h)).a(this.field_C, (jo) (this), true, this.field_C);
                        break L3;
                      }
                    }
                  }
                }
                if (!this.field_P) {
                  this.e(-125);
                  break L1;
                } else {
                  var5_int = this.field_O;
                  this.f(param1 + -2031616);
                  if (this.field_O == var5_int) {
                    break L1;
                  } else {
                    if (this.field_h instanceof tua) {
                      ((tua) ((Object) this.field_h)).a(this.field_C, (jo) (this), true, this.field_O);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!this.field_D.field_y) {
                break L4;
              } else {
                if ((this.field_D.field_x ^ -1) == -2) {
                  if (this.field_P) {
                    if (!this.field_J) {
                      if (sta.field_B <= (this.field_N.field_p >> -372084575) + (this.field_N.field_n + param3)) {
                        this.a(this.field_O - this.field_B, (byte) -91);
                        break L4;
                      } else {
                        this.a(this.field_O + this.field_B, (byte) -109);
                        break L4;
                      }
                    } else {
                      var5_int = -(this.field_N.field_m >> -1375942303) - (this.field_N.field_i - -this.field_i - jba.field_j - -param0);
                      var6 = sta.field_B - param3 - this.field_n - ((this.field_N.field_p >> -1545721567) + this.field_N.field_n);
                      if (Math.abs(var6) <= Math.abs(var5_int)) {
                        if ((var5_int ^ -1) >= -1) {
                          this.b(13328, this.field_C + -this.field_y);
                          break L4;
                        } else {
                          this.b(13328, this.field_y + this.field_C);
                          break L4;
                        }
                      } else {
                        if (0 >= var6) {
                          this.a(-this.field_B + this.field_O, (byte) -113);
                          break L4;
                        } else {
                          this.a(this.field_O - -this.field_B, (byte) -102);
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (this.field_J) {
                      if ((this.field_N.field_m >> -999252223) + param0 + this.field_N.field_i < jba.field_j) {
                        this.b(param1 ^ 2110480, this.field_y + this.field_C);
                        break L4;
                      } else {
                        this.b(param1 + -2083824, this.field_C - this.field_y);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 == 2097152) {
                break L5;
              } else {
                this.field_L = (rj) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var5);

            stackIn_43_1 = new StringBuilder().append("jo.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L6;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ')');
        }
    }

    jo(int param0, int param1, int param2, int param3, isa param4, isa param5, isa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        vp dupTemp$0 = null;
        rj dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_O = 32768;
        this.field_y = 8192;
        this.field_I = 0;
        this.field_C = 32768;
        this.field_x = true;
        this.field_B = 8192;
        this.field_M = 1024;
        this.field_G = 0;
        this.field_A = 1024;
        try {
          L0: {
            L1: {
              this.field_w = new ae[6];
              dupTemp$0 = new vp(param0, param1, param7, param8, (isa) null, (qc) null, new rj(0, 0, param7, param8, param6, (qc) null), false, false);
              this.field_N = dupTemp$0;
              this.field_w[0] = (ae) ((Object) dupTemp$0);
              dupTemp$1 = new rj(param0, param1, param7, param8, param5, (qc) null);
              this.field_D = dupTemp$1;
              this.field_w[1] = (ae) ((Object) dupTemp$1);
              this.field_G = param10;
              stackIn_3_0 = this;

              if (!param12) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((jo) (this)).field_P = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param11) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            ((jo) (this)).field_J = stackIn_7_1 != 0;
            this.field_I = param9;
            this.a(27980, param13);
            this.c(16, param14);
            this.a((byte) -31, param2, param3, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var16);

            stackIn_11_1 = new StringBuilder().append("jo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void f(int param0) {
        if (param0 != 65536) {
            return;
        }
        int var2 = null != this.field_F ? this.field_F.field_n + this.field_F.field_p : this.field_D.field_n;
        int var3 = this.field_H != null ? this.field_H.field_n - this.field_N.field_p : -this.field_N.field_p + this.field_D.field_p + this.field_D.field_n;
        this.c(16, var2 >= var3 ? 0 : (-var2 + this.field_N.field_n << -1027416880) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) > -1) {
            this.field_C = 0;
        } else {
            if (-65537 <= (param1 ^ -1)) {
                this.field_C = param1;
            } else {
                this.field_C = 65536;
            }
        }
        this.h((byte) -110);
        if (param0 != 27980) {
            this.field_D = (rj) null;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_x) {
                  break L1;
                } else {
                  if (this.field_N.b((byte) -34)) {
                    if (param2 != 98) {
                      if (param2 != 99) {
                        if (param2 == 96) {
                          this.b(13328, this.field_C + -this.field_A);
                          stackIn_41_0 = 1;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        } else {
                          if (97 == param2) {
                            this.b(13328, this.field_C - -this.field_A);
                            stackIn_39_0 = 1;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if (104 == param2) {
                              this.a(this.field_O + -this.c(1553449360), (byte) -99);
                              stackIn_37_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (105 == param2) {
                                this.a(this.field_O + this.c(1553449360), (byte) -127);
                                stackIn_35_0 = 1;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                if (102 == param2) {
                                  L2: {
                                    if (!this.field_P) {
                                      break L2;
                                    } else {
                                      if (!oj.field_tb[82]) {
                                        break L2;
                                      } else {
                                        this.a(0, (byte) -105);
                                        stackIn_29_0 = 1;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (this.field_J) {
                                    this.b(13328, 0);
                                    stackIn_33_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (param2 != 103) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_P) {
                                        break L3;
                                      } else {
                                        if (!oj.field_tb[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -123);
                                          stackIn_22_0 = 1;
                                          decompiledRegionSelector0 = 3;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!this.field_J) {
                                      break L1;
                                    } else {
                                      this.b(13328, 65536);
                                      stackIn_25_0 = 1;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.a(this.field_O - -this.field_M, (byte) -111);
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      this.a(this.field_O + -this.field_M, (byte) -123);
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return false;
                  }
                }
              }
              stackIn_43_0 = 0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5);

            stackIn_46_1 = new StringBuilder().append("jo.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L4;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_33_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_35_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_37_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_39_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_41_0 != 0;
                            } else {
                              return stackIn_43_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (param1 < param2) {
            var4 = param1 * this.field_D.field_m / param2;
            if (!(var4 >= this.field_I)) {
                var4 = this.field_I;
            }
            this.field_N.a((byte) -31, var4, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
            this.b(-122, true);
        } else {
            this.field_N.a((byte) -31, this.field_D.field_m, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
            this.b(-82, false);
        }
        if (param0 >= -81) {
            this.field_z = (rj) null;
        }
        this.h((byte) -110);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != -1789710879) {
            this.c(-65, -82, -68);
        }
        if (param1 >= param0) {
            this.field_N.a((byte) -31, this.field_N.field_m, this.field_D.field_p, this.field_N.field_i, this.field_N.field_n);
            this.a(1, false);
        } else {
            var4 = param1 * this.field_D.field_p / param0;
            if (!(this.field_G <= var4)) {
                var4 = this.field_G;
            }
            this.field_N.a((byte) -31, this.field_N.field_m, var4, this.field_N.field_i, this.field_N.field_n);
            this.a(1, true);
        }
        this.e(param2 ^ 1789710944);
    }

    private final void a(int param0, boolean param1) {
        rj stackIn_5_0 = null;
        rj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        rj stackIn_12_0 = null;
        rj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        rj stackIn_19_0 = null;
        rj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rj stackIn_24_0 = null;
        rj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            this.d(64);
            break L0;
          }
        }
        L1: {
          L2: {
            stackIn_5_0 = this.field_D;

            if (param1) {
              break L2;
            } else {


              if (!this.field_J) {
                stackIn_7_0 = (rj) ((Object) stackIn_5_0);
                stackIn_7_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = (rj) ((Object) stackIn_5_0);
                break L2;
              }
            }
          }
          stackIn_7_0 = (rj) ((Object) stackIn_5_0);
          stackIn_7_1 = 1;
          break L1;
        }
        L3: {
          stackIn_7_0.field_y = stackIn_7_1 != 0;
          if (this.field_N.field_x instanceof rj) {
            L4: {
              L5: {
                stackIn_12_0 = (rj) ((Object) this.field_N.field_x);

                if (param1) {
                  break L5;
                } else {


                  if (!this.field_J) {
                    stackIn_14_0 = (rj) ((Object) stackIn_12_0);
                    stackIn_14_1 = 0;
                    break L4;
                  } else {
                    stackIn_12_0 = (rj) ((Object) stackIn_12_0);
                    break L5;
                  }
                }
              }
              stackIn_14_0 = (rj) ((Object) stackIn_12_0);
              stackIn_14_1 = 1;
              break L4;
            }
            stackIn_14_0.field_y = stackIn_14_1 != 0;
            break L3;
          } else {
            break L3;
          }
        }
        L6: {
          if (null != this.field_F) {
            L7: {
              stackIn_19_0 = this.field_F;

              if (!param1) {
                stackIn_20_0 = (rj) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = (rj) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L7;
              }
            }
            stackIn_20_0.field_y = stackIn_20_1 != 0;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          if (this.field_H == null) {
            break L8;
          } else {
            L9: {
              stackIn_24_0 = this.field_H;

              if (!param1) {
                stackIn_25_0 = (rj) ((Object) stackIn_24_0);
                stackIn_25_1 = 0;
                break L9;
              } else {
                stackIn_25_0 = (rj) ((Object) stackIn_24_0);
                stackIn_25_1 = 1;
                break L9;
              }
            }
            stackIn_25_0.field_y = stackIn_25_1 != 0;
            break L8;
          }
        }
    }

    private final void e(int param0) {
        int var2 = this.field_F != null ? this.field_F.field_n + this.field_F.field_p : this.field_D.field_n;
        if (param0 >= -122) {
            this.c(127, -127, -34);
        }
        int var3 = null != this.field_H ? -this.field_N.field_p + this.field_H.field_n : this.field_D.field_p + (this.field_D.field_n + -this.field_N.field_p);
        this.field_N.field_n = ((var3 + -var2) * this.field_O >> -649866768) + var2;
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!wqa.r((byte) -98))) {
            param1 = false;
        }
        sa.a(param1, (byte) 88);
        dla.b(23713);
        if (!param0) {
            jo.g((byte) 92);
        }
    }

    private final int c(int param0) {
        if (param0 != 1553449360) {
            return 79;
        }
        return (this.field_N.field_p << 1553449360) / this.field_D.field_p;
    }

    final boolean a(ae param0, boolean param1) {
        vp var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = (ae) null;
                this.a('', (ae) null, -82, true);
                break L1;
              }
            }
            L2: {
              var3 = this.field_N;
              if (var3 == null) {
                break L2;
              } else {
                if (!((ae) ((Object) var3)).a(param0, false)) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jo.S(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void d(int param0) {
        int var2 = this.field_L != null ? this.field_L.field_m + this.field_L.field_i : this.field_D.field_i;
        int var4 = 26 % ((param0 - 22) / 59);
        int var3 = null != this.field_z ? -this.field_N.field_m + this.field_z.field_i : -this.field_N.field_m + this.field_D.field_i + this.field_D.field_m;
        this.a(27980, var2 < var3 ? (-var2 + this.field_N.field_i << -411069264) / (var3 - var2) : 0);
    }

    final void c(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) > -1) {
            this.field_O = 0;
        } else {
            if (65536 < param1) {
                this.field_O = 65536;
            } else {
                this.field_O = param1;
            }
        }
        if (param0 != 16) {
            return;
        }
        this.e(param0 ^ -111);
    }

    final static an a(kh param0, boolean param1) {
        an stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 44, 8);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_E = (String) null;
                  break L1;
                }
              }
              L2: {
                var3 = uha.a(5907, param0) ? 1 : 0;
                var4 = uha.a(5907, param0) ? 1 : 0;
                var5 = new an();
                var5.field_I = (short)param0.b((byte) 44, 16);
                var5.field_l = me.a((byte) 76, 16, param0, var5.field_l);
                var5.field_h = me.a((byte) 88, 16, param0, var5.field_h);
                var5.field_t = me.a((byte) 73, 16, param0, var5.field_t);
                var5.field_u = (short)param0.b((byte) 44, 16);
                var5.field_B = me.a((byte) 102, 16, param0, var5.field_B);
                var5.field_w = me.a((byte) 98, 16, param0, var5.field_w);
                var5.field_f = me.a((byte) 94, 16, param0, var5.field_f);
                if (var3 != 0) {
                  var5.field_A = (short)param0.b((byte) 44, 16);
                  var5.field_k = me.a((byte) 96, 16, param0, var5.field_k);
                  var5.field_c = me.a((byte) 89, 16, param0, var5.field_c);
                  var5.field_r = me.a((byte) 91, 16, param0, var5.field_r);
                  var5.field_C = me.a((byte) 73, 16, param0, var5.field_C);
                  var5.field_s = me.a((byte) 111, 16, param0, var5.field_s);
                  var5.field_y = me.a((byte) 101, 16, param0, var5.field_y);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  param0.b((byte) 44, 16);
                  var5.field_H = me.a((byte) 76, 16, param0, var5.field_H);
                  var5.field_e = me.a((byte) 73, 16, param0, var5.field_e);
                  var5.field_d = me.a((byte) 105, 16, param0, var5.field_d);
                  var5.field_N = me.a((byte) 101, 16, param0, var5.field_N);
                  var5.field_D = me.a((byte) 100, 16, param0, var5.field_D);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (uha.a(5907, param0)) {
                  var5.field_M = me.a((byte) 74, 16, param0, var5.field_M);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!uha.a(5907, param0)) {
                  break L5;
                } else {
                  var5.field_q = goa.a(16, -4854, param0, var5.field_q);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_q.length) {
                      if (var6 != 0) {
                        var5.field_K = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_q = null;
                        break L5;
                      }
                    } else {
                      L7: {
                        if ((var5.field_q[var7] & 255) > var6) {
                          var6 = var5.field_q[var7] & 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_27_0 = (an) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("jo.O(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    static {
        field_K = "Account created successfully!";
    }
}
