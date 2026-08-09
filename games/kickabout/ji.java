/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends hd {
    static int[] field_Db;
    private hd field_yb;
    private hd field_Ib;
    private int field_Gb;
    private boolean field_Cb;
    private hd field_zb;
    static int field_Hb;
    static String field_Eb;
    private hd field_Ab;
    private hd field_Bb;
    private hd field_Fb;

    final int a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = param1;
          var6 = this.field_zb.field_q + -this.field_yb.field_q;
          if (-1 <= (var6 ^ -1)) {
            break L0;
          } else {
            var7 = this.field_yb.field_s;
            var8 = param0 + -param3;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          }
        }
        if (param2) {
          L1: {
            if ((var5 ^ -1) <= -1) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
          if (-param3 + param0 >= var5) {
            return var5;
          } else {
            var5 = param0 + -param3;
            return var5;
          }
        } else {
          L2: {
            if (-param3 + param0 < var5) {
              var5 = -param3 + param0;
              break L2;
            } else {
              break L2;
            }
          }
          if ((var5 ^ -1) > -1) {
            var5 = 0;
            return var5;
          } else {
            return var5;
          }
        }
    }

    final boolean b(int param0) {
        if (this.field_Bb.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        } else {
          if (0 != this.field_Bb.field_qb) {
            L0: {
              if (this.field_Gb > 0) {
                this.field_Gb = this.field_Gb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Gb != 0) {
              if (param0 <= -47) {
                return false;
              } else {
                this.j(69);
                return false;
              }
            } else {
              this.field_Gb = 3;
              return true;
            }
          } else {
            if (param0 <= -47) {
              return false;
            } else {
              this.j(69);
              return false;
            }
          }
        }
    }

    final boolean h(int param0) {
        if (-1 == (this.field_Fb.field_sb ^ -1)) {
          if (this.field_Fb.field_qb != param0) {
            if (this.field_Gb <= 0) {
              if (this.field_Gb != 0) {
                return false;
              } else {
                this.field_Gb = 3;
                return true;
              }
            } else {
              this.field_Gb = this.field_Gb - 1;
              if (this.field_Gb == 0) {
                this.field_Gb = 3;
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          this.field_Gb = 20;
          return true;
        }
    }

    ji(long param0, ji param1, boolean param2) {
        this(param0, param1.field_Bb, param1.field_Fb, param1.field_Ab, param1.field_yb, param2);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!this.field_Cb) {
          this.c(param0, 2, param1, param3);
          if (param2 >= 13) {
            return;
          } else {
            field_Db = (int[]) null;
            return;
          }
        } else {
          this.a(true, param0, param3, param1);
          if (param2 >= 13) {
            return;
          } else {
            field_Db = (int[]) null;
            return;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (ns.field_a > 0) {
          if (qv.field_f) {
            on.g(0, 0, on.field_g, g.field_a.field_T);
            kk.field_j.a(77, param1);
            if (param0 > 10) {
              L0: {
                if (fj.field_a > 0) {
                  if (!td.field_b) {
                    break L0;
                  } else {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  }
                } else {
                  if (-1 <= (ee.field_b ^ -1)) {
                    break L0;
                  } else {
                    if (!td.field_b) {
                      return;
                    } else {
                      on.g(0, 0, on.field_g, g.field_a.field_T);
                      tn.field_f.a(125, param1);
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              L1: {
                field_Eb = (String) null;
                if (fj.field_a > 0) {
                  if (!td.field_b) {
                    break L1;
                  } else {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  }
                } else {
                  if (-1 <= (ee.field_b ^ -1)) {
                    break L1;
                  } else {
                    if (!td.field_b) {
                      return;
                    } else {
                      on.g(0, 0, on.field_g, g.field_a.field_T);
                      tn.field_f.a(125, param1);
                      return;
                    }
                  }
                }
              }
              return;
            }
          } else {
            if (param0 > 10) {
              if (fj.field_a > 0) {
                if (!td.field_b) {
                  return;
                } else {
                  on.g(0, 0, on.field_g, g.field_a.field_T);
                  tn.field_f.a(125, param1);
                  return;
                }
              } else {
                if (-1 > (ee.field_b ^ -1)) {
                  if (td.field_b) {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              field_Eb = (String) null;
              if (fj.field_a > 0) {
                if (td.field_b) {
                  on.g(0, 0, on.field_g, g.field_a.field_T);
                  tn.field_f.a(125, param1);
                  return;
                } else {
                  return;
                }
              } else {
                if (-1 > (ee.field_b ^ -1)) {
                  if (td.field_b) {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 <= 10) {
            field_Eb = (String) null;
            if (fj.field_a <= 0) {
              if (-1 > (ee.field_b ^ -1)) {
                if (!td.field_b) {
                  return;
                } else {
                  on.g(0, 0, on.field_g, g.field_a.field_T);
                  tn.field_f.a(125, param1);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (td.field_b) {
                on.g(0, 0, on.field_g, g.field_a.field_T);
                tn.field_f.a(125, param1);
                return;
              } else {
                return;
              }
            }
          } else {
            if (fj.field_a > 0) {
              if (td.field_b) {
                on.g(0, 0, on.field_g, g.field_a.field_T);
                tn.field_f.a(125, param1);
                return;
              } else {
                return;
              }
            } else {
              if (-1 > (ee.field_b ^ -1)) {
                L2: {
                  if (!td.field_b) {
                    break L2;
                  } else {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private ji(long param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        super(param0, (hd) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        hd var10 = null;
        hd var11 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((ji) (this)).field_Cb = stackIn_4_1 != 0;
            this.field_Bb = new hd(0L, param1);
            this.field_Fb = new hd(0L, param2);
            this.a((byte) -116, this.field_Bb);
            this.a((byte) -110, this.field_Fb);
            this.field_zb = new hd(0L, (hd) null);
            this.a((byte) -113, this.field_zb);
            this.field_Ab = new hd(0L, param3);
            this.field_Ib = new hd(0L, param3);
            this.field_Ib.field_ob = true;
            var10 = this.field_Ab;
            var11 = var10;
            var11.field_ob = true;
            this.field_zb.a((byte) -108, this.field_Ab);
            this.field_zb.a((byte) -116, this.field_Ib);
            this.field_yb = new hd(0L, param4);
            this.field_yb.field_Y = true;
            this.field_zb.a((byte) -117, this.field_yb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("ji.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_18_2 + ',' + param5 + ')');
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        hd var15;
        hd var16;
        hd var17;
        hd var18;
        hd var19;
        hd var20;
        hd stackIn_8_0 = null;
        hd stackIn_8_1 = null;
        hd stackIn_8_2 = null;
        hd stackIn_9_0 = null;
        hd stackIn_9_1 = null;
        hd stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        hd stackIn_18_0 = null;
        hd stackIn_18_1 = null;
        hd stackIn_18_2 = null;
        hd stackIn_19_0 = null;
        hd stackIn_19_1 = null;
        hd stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        hd stackIn_24_0 = null;
        hd stackIn_24_1 = null;
        hd stackIn_24_2 = null;
        hd stackIn_25_0 = null;
        hd stackIn_25_1 = null;
        hd stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        L0: {
          var14 = Kickabout.field_G;
          if (this.field_mb * 2 <= this.field_q) {
            var6 = this.field_q - this.field_mb;
            var5 = this.field_mb;
            break L0;
          } else {
            var6 = this.field_q / 2;
            var5 = this.field_q / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 < param2) {
          L1: {
            var8 = var8 * param3 / param2;
            if (this.field_mb > var8) {
              var8 = this.field_mb;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = param2 + -param3;
              var10 = var7 - var8;
              var11 = 0;
              if (0 >= var9) {
                break L2;
              } else {
                var11 = (var10 * param0 - -(var9 / 2)) / var9;
                break L2;
              }
            }
            L3: {
              var12 = var8 / param1 + var11;
              var15 = this.field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_q = var5;
              var15.field_mb = this.field_mb;
              var16 = this.field_Fb;
              var16.field_q = -var6 + this.field_q;
              var16.field_J = 0;
              var16.field_s = var6;
              var16.field_mb = this.field_mb;
              var17 = this.field_zb;
              var17.field_q = var7;
              var17.field_mb = this.field_mb;
              var17.field_J = 0;
              var17.field_s = var5;
              var18 = this.field_Ab;
              var18.field_J = 0;
              var18.field_q = var12;
              var18.field_mb = this.field_mb;
              var18.field_s = 0;
              var19 = this.field_Ib;
              var19.field_q = -var12 + var7;
              var19.field_s = var12;
              var19.field_mb = this.field_mb;
              var19.field_J = 0;
              var20 = this.field_yb;
              var20.field_mb = this.field_mb;
              var20.field_s = var11;
              var20.field_q = var8;
              var20.field_J = 0;
              stackIn_24_0 = this.field_Bb;

              stackIn_24_1 = this.field_Fb;

              stackIn_24_2 = this.field_zb;

              if (param3 >= param2) {
                stackIn_25_0 = (hd) ((Object) stackIn_24_0);
                stackIn_25_1 = (hd) ((Object) stackIn_24_1);
                stackIn_25_2 = (hd) ((Object) stackIn_24_2);
                stackIn_25_3 = 0;
                break L3;
              } else {
                stackIn_25_0 = (hd) ((Object) stackIn_24_0);
                stackIn_25_1 = (hd) ((Object) stackIn_24_1);
                stackIn_25_2 = (hd) ((Object) stackIn_24_2);
                stackIn_25_3 = 1;
                break L3;
              }
            }
            stackIn_25_2.field_lb = stackIn_25_3 != 0;
            stackIn_25_1.field_lb = stackIn_25_3 != 0;
            stackIn_25_0.field_lb = stackIn_25_3 != 0;
            return;
          } else {
            L4: {
              var8 = var7;
              var9 = param2 + -param3;
              var10 = var7 - var8;
              var11 = 0;
              if (0 >= var9) {
                break L4;
              } else {
                var11 = (var10 * param0 - -(var9 / 2)) / var9;
                break L4;
              }
            }
            L5: {
              var12 = var8 / param1 + var11;
              var15 = this.field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_q = var5;
              var15.field_mb = this.field_mb;
              var16 = this.field_Fb;
              var16.field_q = -var6 + this.field_q;
              var16.field_J = 0;
              var16.field_s = var6;
              var16.field_mb = this.field_mb;
              var17 = this.field_zb;
              var17.field_q = var7;
              var17.field_mb = this.field_mb;
              var17.field_J = 0;
              var17.field_s = var5;
              var18 = this.field_Ab;
              var18.field_J = 0;
              var18.field_q = var12;
              var18.field_mb = this.field_mb;
              var18.field_s = 0;
              var19 = this.field_Ib;
              var19.field_q = -var12 + var7;
              var19.field_s = var12;
              var19.field_mb = this.field_mb;
              var19.field_J = 0;
              var20 = this.field_yb;
              var20.field_mb = this.field_mb;
              var20.field_s = var11;
              var20.field_q = var8;
              var20.field_J = 0;
              stackIn_18_0 = this.field_Bb;

              stackIn_18_1 = this.field_Fb;

              stackIn_18_2 = this.field_zb;

              if (param3 >= param2) {
                stackIn_19_0 = (hd) ((Object) stackIn_18_0);
                stackIn_19_1 = (hd) ((Object) stackIn_18_1);
                stackIn_19_2 = (hd) ((Object) stackIn_18_2);
                stackIn_19_3 = 0;
                break L5;
              } else {
                stackIn_19_0 = (hd) ((Object) stackIn_18_0);
                stackIn_19_1 = (hd) ((Object) stackIn_18_1);
                stackIn_19_2 = (hd) ((Object) stackIn_18_2);
                stackIn_19_3 = 1;
                break L5;
              }
            }
            stackIn_19_2.field_lb = stackIn_19_3 != 0;
            stackIn_19_1.field_lb = stackIn_19_3 != 0;
            stackIn_19_0.field_lb = stackIn_19_3 != 0;
            return;
          }
        } else {
          L6: {
            var7 = 0;
            var9 = param2 + -param3;
            var10 = var7 - var8;
            var11 = 0;
            if (0 >= var9) {
              break L6;
            } else {
              var11 = (var10 * param0 - -(var9 / 2)) / var9;
              break L6;
            }
          }
          L7: {
            var12 = var8 / param1 + var11;
            var15 = this.field_Bb;
            var15.field_s = 0;
            var15.field_J = 0;
            var15.field_q = var5;
            var15.field_mb = this.field_mb;
            var16 = this.field_Fb;
            var16.field_q = -var6 + this.field_q;
            var16.field_J = 0;
            var16.field_s = var6;
            var16.field_mb = this.field_mb;
            var17 = this.field_zb;
            var17.field_q = var7;
            var17.field_mb = this.field_mb;
            var17.field_J = 0;
            var17.field_s = var5;
            var18 = this.field_Ab;
            var18.field_J = 0;
            var18.field_q = var12;
            var18.field_mb = this.field_mb;
            var18.field_s = 0;
            var19 = this.field_Ib;
            var19.field_q = -var12 + var7;
            var19.field_s = var12;
            var19.field_mb = this.field_mb;
            var19.field_J = 0;
            var20 = this.field_yb;
            var20.field_mb = this.field_mb;
            var20.field_s = var11;
            var20.field_q = var8;
            var20.field_J = 0;
            stackIn_8_0 = this.field_Bb;

            stackIn_8_1 = this.field_Fb;

            stackIn_8_2 = this.field_zb;

            if (param3 >= param2) {
              stackIn_9_0 = (hd) ((Object) stackIn_8_0);
              stackIn_9_1 = (hd) ((Object) stackIn_8_1);
              stackIn_9_2 = (hd) ((Object) stackIn_8_2);
              stackIn_9_3 = 0;
              break L7;
            } else {
              stackIn_9_0 = (hd) ((Object) stackIn_8_0);
              stackIn_9_1 = (hd) ((Object) stackIn_8_1);
              stackIn_9_2 = (hd) ((Object) stackIn_8_2);
              stackIn_9_3 = 1;
              break L7;
            }
          }
          stackIn_9_2.field_lb = stackIn_9_3 != 0;
          stackIn_9_1.field_lb = stackIn_9_3 != 0;
          stackIn_9_0.field_lb = stackIn_9_3 != 0;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -117) {
            ji.k(91);
            field_Db = null;
            field_Eb = null;
            return;
        }
        field_Db = null;
        field_Eb = null;
    }

    final boolean i(int param0) {
        if (this.field_Ib.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        } else {
          if (param0 < -47) {
            if (0 != this.field_Ib.field_qb) {
              if (this.field_Gb <= 0) {
                if (0 == this.field_Gb) {
                  if (n.field_m < this.field_yb.field_v + this.field_yb.field_T - (-this.field_yb.field_mb - this.field_yb.field_L)) {
                    return false;
                  } else {
                    this.field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Gb = this.field_Gb - 1;
                if (0 == this.field_Gb) {
                  if (n.field_m < this.field_yb.field_v + this.field_yb.field_T - (-this.field_yb.field_mb - this.field_yb.field_L)) {
                    return false;
                  } else {
                    this.field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            field_Hb = 113;
            if (0 != this.field_Ib.field_qb) {
              if (this.field_Gb > 0) {
                this.field_Gb = this.field_Gb - 1;
                if (0 == this.field_Gb) {
                  if (n.field_m < this.field_yb.field_v + this.field_yb.field_T - (-this.field_yb.field_mb - this.field_yb.field_L)) {
                    return false;
                  } else {
                    this.field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (0 == this.field_Gb) {
                  if (n.field_m < this.field_yb.field_v + this.field_yb.field_T - (-this.field_yb.field_mb - this.field_yb.field_L)) {
                    return false;
                  } else {
                    this.field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    ji(String param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        this(vb.a(0, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5);
    }

    final int a(int param0, boolean param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = -this.field_yb.field_mb + this.field_zb.field_mb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = this.field_yb.field_J;
            var8 = -param3 + param0;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        if (!param1) {
          L1: {
            if (-param3 + param0 >= var5) {
              break L1;
            } else {
              var5 = param0 - param3;
              break L1;
            }
          }
          L2: {
            if (0 <= var5) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
          if (param2 != -95) {
            this.c(29, 92, -42, -36);
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (0 > var5) {
              var5 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          if (var5 > -param3 + param0) {
            var5 = -param3 + param0;
            if (param2 == -95) {
              return var5;
            } else {
              this.c(29, 92, -42, -36);
              return var5;
            }
          } else {
            if (param2 != -95) {
              this.c(29, 92, -42, -36);
              return var5;
            } else {
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return 0 != this.field_yb.field_qb ? true : false;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        hd var15;
        hd var16;
        hd var17;
        hd var18;
        hd var19;
        hd var20;
        hd stackIn_13_0 = null;
        hd stackIn_13_1 = null;
        hd stackIn_13_2 = null;
        hd stackIn_14_0 = null;
        hd stackIn_14_1 = null;
        hd stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        hd stackIn_23_0 = null;
        hd stackIn_23_1 = null;
        hd stackIn_23_2 = null;
        hd stackIn_24_0 = null;
        hd stackIn_24_1 = null;
        hd stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        L0: {
          var14 = Kickabout.field_G;
          if (2 * this.field_q > this.field_mb) {
            var6 = this.field_mb / 2;
            var5 = this.field_mb / 2;
            break L0;
          } else {
            var6 = -this.field_q + this.field_mb;
            var5 = this.field_q;
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var6;
          var8 = var7;
          if (param3 <= param2) {
            var7 = 0;
            break L1;
          } else {
            L2: {
              var8 = param2 * var8 / param3;
              if (this.field_q > var8) {
                var8 = this.field_q;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 >= var8) {
              break L1;
            } else {
              L3: {
                var8 = var7;
                var9 = -param2 + param3;
                var10 = -var8 + var7;
                var11 = 0;
                if (0 >= var9) {
                  break L3;
                } else {
                  var11 = (param1 * var10 - -(var9 / 2)) / var9;
                  break L3;
                }
              }
              var12 = var11 - -(var8 / 2);
              var15 = this.field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_mb = var5;
              var15.field_q = this.field_q;
              var16 = this.field_Fb;
              var16.field_q = this.field_q;
              var16.field_J = var6;
              var16.field_mb = -var6 + this.field_mb;
              if (!param0) {
                return;
              } else {
                L4: {
                  var16.field_s = 0;
                  var17 = this.field_zb;
                  var17.field_mb = var7;
                  var17.field_J = var5;
                  var17.field_s = 0;
                  var17.field_q = this.field_q;
                  var18 = this.field_Ab;
                  var18.field_q = this.field_q;
                  var18.field_mb = var12;
                  var18.field_s = 0;
                  var18.field_J = 0;
                  var19 = this.field_Ib;
                  var19.field_mb = -var12 + var7;
                  var19.field_s = 0;
                  var19.field_q = this.field_q;
                  var19.field_J = var12;
                  var20 = this.field_yb;
                  var20.field_q = this.field_q;
                  stackIn_13_0 = this.field_Bb;

                  stackIn_13_1 = this.field_Fb;

                  stackIn_13_2 = this.field_zb;

                  if (param2 >= param3) {
                    stackIn_14_0 = (hd) ((Object) stackIn_13_0);
                    stackIn_14_1 = (hd) ((Object) stackIn_13_1);
                    stackIn_14_2 = (hd) ((Object) stackIn_13_2);
                    stackIn_14_3 = 0;
                    break L4;
                  } else {
                    stackIn_14_0 = (hd) ((Object) stackIn_13_0);
                    stackIn_14_1 = (hd) ((Object) stackIn_13_1);
                    stackIn_14_2 = (hd) ((Object) stackIn_13_2);
                    stackIn_14_3 = 1;
                    break L4;
                  }
                }
                stackIn_14_2.field_lb = stackIn_14_3 != 0;
                stackIn_14_1.field_lb = stackIn_14_3 != 0;
                stackIn_14_0.field_lb = stackIn_14_3 != 0;
                var20.field_J = var11;
                var20.field_mb = var8;
                var20.field_s = 0;
                return;
              }
            }
          }
        }
        L5: {
          var9 = -param2 + param3;
          var10 = -var8 + var7;
          var11 = 0;
          if (0 >= var9) {
            break L5;
          } else {
            var11 = (param1 * var10 - -(var9 / 2)) / var9;
            break L5;
          }
        }
        var12 = var11 - -(var8 / 2);
        var15 = this.field_Bb;
        var15.field_s = 0;
        var15.field_J = 0;
        var15.field_mb = var5;
        var15.field_q = this.field_q;
        var16 = this.field_Fb;
        var16.field_q = this.field_q;
        var16.field_J = var6;
        var16.field_mb = -var6 + this.field_mb;
        if (!param0) {
          return;
        } else {
          L6: {
            var16.field_s = 0;
            var17 = this.field_zb;
            var17.field_mb = var7;
            var17.field_J = var5;
            var17.field_s = 0;
            var17.field_q = this.field_q;
            var18 = this.field_Ab;
            var18.field_q = this.field_q;
            var18.field_mb = var12;
            var18.field_s = 0;
            var18.field_J = 0;
            var19 = this.field_Ib;
            var19.field_mb = -var12 + var7;
            var19.field_s = 0;
            var19.field_q = this.field_q;
            var19.field_J = var12;
            var20 = this.field_yb;
            var20.field_q = this.field_q;
            stackIn_23_0 = this.field_Bb;

            stackIn_23_1 = this.field_Fb;

            stackIn_23_2 = this.field_zb;

            if (param2 >= param3) {
              stackIn_24_0 = (hd) ((Object) stackIn_23_0);
              stackIn_24_1 = (hd) ((Object) stackIn_23_1);
              stackIn_24_2 = (hd) ((Object) stackIn_23_2);
              stackIn_24_3 = 0;
              break L6;
            } else {
              stackIn_24_0 = (hd) ((Object) stackIn_23_0);
              stackIn_24_1 = (hd) ((Object) stackIn_23_1);
              stackIn_24_2 = (hd) ((Object) stackIn_23_2);
              stackIn_24_3 = 1;
              break L6;
            }
          }
          stackIn_24_2.field_lb = stackIn_24_3 != 0;
          stackIn_24_1.field_lb = stackIn_24_3 != 0;
          stackIn_24_0.field_lb = stackIn_24_3 != 0;
          var20.field_J = var11;
          var20.field_mb = var8;
          var20.field_s = 0;
          return;
        }
    }

    final boolean c(boolean param0) {
        if (-1 != (this.field_Ab.field_sb ^ -1)) {
          this.field_Gb = 20;
          return true;
        } else {
          if (0 != this.field_Ab.field_qb) {
            if (-1 <= (this.field_Gb ^ -1)) {
              if (this.field_Gb != 0) {
                if (!param0) {
                  this.field_yb = (hd) null;
                  return false;
                } else {
                  return false;
                }
              } else {
                if (this.field_yb.field_v + this.field_yb.field_T <= n.field_m) {
                  if (!param0) {
                    this.field_yb = (hd) null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.field_Gb = 3;
                  return true;
                }
              }
            } else {
              this.field_Gb = this.field_Gb - 1;
              if (this.field_Gb == 0) {
                if (this.field_yb.field_v + this.field_yb.field_T > n.field_m) {
                  this.field_Gb = 3;
                  return true;
                } else {
                  if (!param0) {
                    this.field_yb = (hd) null;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                if (!param0) {
                  this.field_yb = (hd) null;
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0) {
              return false;
            } else {
              this.field_yb = (hd) null;
              return false;
            }
          }
        }
    }

    final static void k(int param0) {
        th.a((byte) -99);
        if (param0 != 0) {
            field_Eb = (String) null;
            pn.field_z.b(22997);
            return;
        }
        pn.field_z.b(22997);
    }

    static {
        field_Eb = "Reject <%0> from this game";
        field_Hb = -1;
    }
}
