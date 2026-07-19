/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends me {
    static int[][] field_k;
    static int[][] field_m;
    static int[][] field_q;
    private int field_n;
    static int[][] field_s;
    private int field_t;
    private int field_j;
    static int[][] field_u;
    private int field_l;
    static String[][] field_o;
    static int[][] field_p;
    static int[][] field_r;

    final static String a(byte param0, char param1) {
        int var2 = -36 % ((-5 - param0) / 36);
        return String.valueOf(param1);
    }

    final void a(byte param0) {
        fla discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_t == 0) {
          if (null != rba.field_a) {
            if (null == rba.field_a.field_g) {
              this.field_t = this.field_t + 1;
              if (param0 < -107) {
                var2 = aq.field_a[0].c();
                var3 = 60;
                var3 = var2 * (var3 / var2);
                if ((this.field_t ^ -1) > -21) {
                  this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                  if (this.field_l <= koa.b(0) + 10) {
                    return;
                  } else {
                    this.field_h = true;
                    this.p(94);
                    return;
                  }
                } else {
                  L0: {
                    if (this.field_t < 100) {
                      this.field_l = -10 + (koa.b(0) - var3 / 2);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                        if (this.field_l > koa.b(0) + 10) {
                          this.field_h = true;
                          this.p(94);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      this.field_l = this.field_l + 10;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        this.field_l = -10 + (koa.b(0) - var3 / 2);
                        this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                        if (this.field_l > koa.b(0) + 10) {
                          this.field_h = true;
                          this.p(94);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_l <= koa.b(0) + 10) {
                    return;
                  } else {
                    this.field_h = true;
                    this.p(94);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              discarded$1 = rba.field_a.field_g[rba.field_a.l(92)].a(new fm(93, 0, 0, 0), -58);
              this.field_t = this.field_t + 1;
              if (param0 < -107) {
                L1: {
                  var2 = aq.field_a[0].c();
                  var3 = 60;
                  var3 = var2 * (var3 / var2);
                  if ((this.field_t ^ -1) > -21) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (this.field_t < 100) {
                          break L3;
                        } else {
                          this.field_l = this.field_l + 10;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_l = -10 + (koa.b(0) - var3 / 2);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                    if (this.field_l > koa.b(0) + 10) {
                      this.field_h = true;
                      this.p(94);
                      return;
                    } else {
                      return;
                    }
                  }
                }
                L4: {
                  this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                  if (this.field_l <= koa.b(0) + 10) {
                    break L4;
                  } else {
                    this.field_h = true;
                    this.p(94);
                    break L4;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            this.field_t = this.field_t + 1;
            if (param0 < -107) {
              var2 = aq.field_a[0].c();
              var3 = 60;
              var3 = var2 * (var3 / var2);
              if ((this.field_t ^ -1) <= -21) {
                L5: {
                  if (this.field_t < 100) {
                    this.field_l = -10 + (koa.b(0) - var3 / 2);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      L6: {
                        this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                        if (this.field_l <= koa.b(0) + 10) {
                          break L6;
                        } else {
                          this.field_h = true;
                          this.p(94);
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    this.field_l = this.field_l + 10;
                    if (var4 == 0) {
                      break L5;
                    } else {
                      this.field_l = -10 + (koa.b(0) - var3 / 2);
                      this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                      L7: {
                        if (this.field_l <= koa.b(0) + 10) {
                          break L7;
                        } else {
                          this.field_h = true;
                          this.p(94);
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_l > koa.b(0) + 10) {
                  this.field_h = true;
                  this.p(94);
                  return;
                } else {
                  return;
                }
              } else {
                L8: {
                  this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                  if (this.field_l <= koa.b(0) + 10) {
                    break L8;
                  } else {
                    this.field_h = true;
                    this.p(94);
                    break L8;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_t = this.field_t + 1;
          if (param0 < -107) {
            var2 = aq.field_a[0].c();
            var3 = 60;
            var3 = var2 * (var3 / var2);
            if ((this.field_t ^ -1) <= -21) {
              L9: {
                if (this.field_t < 100) {
                  this.field_l = -10 + (koa.b(0) - var3 / 2);
                  if (var4 == 0) {
                    break L9;
                  } else {
                    L10: {
                      this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                      if (this.field_l <= koa.b(0) + 10) {
                        break L10;
                      } else {
                        this.field_h = true;
                        this.p(94);
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  this.field_l = this.field_l + 10;
                  if (var4 == 0) {
                    break L9;
                  } else {
                    this.field_l = -10 + (koa.b(0) - var3 / 2);
                    this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                    L11: {
                      if (this.field_l <= koa.b(0) + 10) {
                        break L11;
                      } else {
                        this.field_h = true;
                        this.p(94);
                        break L11;
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_l > koa.b(0) + 10) {
                this.field_h = true;
                this.p(94);
                return;
              } else {
                return;
              }
            } else {
              L12: {
                this.field_l = koa.b(0) + -10 + -(this.field_t * (var3 / 2) / 20);
                if (this.field_l <= koa.b(0) + 10) {
                  break L12;
                } else {
                  this.field_h = true;
                  this.p(94);
                  break L12;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final void b(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        String var18 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var2 = 300;
        var3 = 60;
        var4 = aq.field_a[0].a();
        var2 = var4 * (var2 / var4);
        var5 = aq.field_a[0].c();
        var3 = var3 / var5 * var5;
        var6 = this.field_j;
        var7 = -(var3 / 2) + this.field_l;
        var8 = 10;
        if (param0 <= -13) {
          var9 = 10;
          var10 = 10;
          var11 = -var9 + -var8 + var2;
          var12 = var3 + -(var10 * 2);
          var13 = -var8 + (-var9 + -24 + var11);
          var18 = lq.field_p[this.field_n].toUpperCase();
          var15 = ds.field_n.a(var18, (byte) -117);
          L0: while (true) {
            if (var15 > var13) {
              var13 = var13 + var4;
              var11 = var11 + var4;
              var2 = var2 + var4;
              if (var16 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              qa.a(var3, var2, (byte) 70, var6, aq.field_a, var7);
              discarded$2 = be.a(var18, 1, eda.field_f, 16777215, 30, var12, 1, var10 + var7, var6 - -30 - -(2 * var8), -1, (byte) 60, var13);
              lva.field_m[this.field_n].a(var8 + var6, var7 - -((-32 + var3) / 2), 32, 32);
              return;
            }
          }
        } else {
          field_o = (String[][]) null;
          var9 = 10;
          var10 = 10;
          var11 = -var9 + -var8 + var2;
          var12 = var3 + -(var10 * 2);
          var13 = -var8 + (-var9 + -24 + var11);
          var17 = lq.field_p[this.field_n].toUpperCase();
          var14 = var17;
          var15 = ds.field_n.a(var17, (byte) -117);
          L1: while (true) {
            if (var15 > var13) {
              var13 = var13 + var4;
              var11 = var11 + var4;
              var2 = var2 + var4;
              if (var16 != 0) {
                return;
              } else {
                continue L1;
              }
            } else {
              qa.a(var3, var2, (byte) 70, var6, aq.field_a, var7);
              discarded$3 = be.a(var17, 1, eda.field_f, 16777215, 30, var12, 1, var10 + var7, var6 - -30 - -(2 * var8), -1, (byte) 60, var13);
              lva.field_m[this.field_n].a(var8 + var6, var7 - -((-32 + var3) / 2), 32, 32);
              return;
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (!lf.a(param0, param1, 128)) {
            return false;
        }
        if (!(bqa.a(540800, param1, param0) | (-1 == (param1 & param2 ^ -1) ? true : false) | go.d(param0, param1, 26205))) {
            return true;
        }
        return (((8192 & param1) != 0 ? true : false) | kaa.a(param0, param1, false) | rg.e(param0, param2 ^ -36949, param1)) & (0 == (55 & param0) ? true : false);
    }

    final static void a(String param0, long param1, byte param2) {
        RuntimeException runtimeException = null;
        CharSequence var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              wp.field_a = param0;
              bta.field_q = 2;
              var5 = (CharSequence) ((Object) param0);
              mn.field_n = jd.a(1, var5);
              ica.field_b = param1;
              ni.field_c = true;
              if (param2 > 108) {
                break L1;
              } else {
                no.b(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("no.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        String discarded$0 = null;
        field_o = (String[][]) null;
        field_r = (int[][]) null;
        field_u = (int[][]) null;
        field_m = (int[][]) null;
        field_s = (int[][]) null;
        field_p = (int[][]) null;
        field_k = (int[][]) null;
        field_q = (int[][]) null;
        if (!param0) {
            discarded$0 = no.a((byte) 52, '￐');
        }
    }

    no(qh param0, int param1) {
        super(param0);
        this.field_t = 0;
        try {
            this.field_j = 10;
            this.field_n = param1;
            this.field_l = koa.b(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 107 % ((param2 - 29) / 57);
        return false;
    }

    static {
        field_p = new int[11][];
        field_q = new int[11][];
        field_u = new int[11][];
        field_k = new int[11][];
        field_s = new int[11][];
        field_m = new int[11][];
        field_r = new int[11][];
        field_m[0] = new int[]{-1, -2, -2, -2, -2, -2, -1};
        field_u[0] = new int[]{-1, 0, 1, 2, 3, 3, -1};
        field_m[1] = new int[]{3, 3, 3};
        field_u[1] = new int[]{0, 1, 2};
        field_q[1] = new int[]{1600, 1600, 1600};
        field_r[1] = new int[]{1024, 1024, 1024};
        field_s[1] = new int[]{1900, 1900, 1900};
        field_k[1] = new int[]{25, 20, 35};
        field_m[2] = new int[]{1, 6, 1};
        field_p[1] = new int[]{0, 0, 0};
        field_u[2] = new int[]{28, 4, 80};
        field_q[2] = new int[]{1600, 800, 1600};
        field_r[2] = new int[]{1024, 200, 1024};
        field_s[2] = new int[]{1536, 4000, 1536};
        field_k[2] = new int[]{30, 30, 30};
        field_m[3] = new int[]{1, 1, 1};
        field_p[2] = new int[]{2, 0, 2};
        field_u[3] = new int[]{11, 11, 12};
        field_q[3] = new int[]{3000, 3000, 2500};
        field_r[3] = new int[]{1024, 1024, 1024};
        field_s[3] = new int[]{1900, 1900, 1900};
        field_k[3] = new int[]{40, 30, 30};
        field_m[4] = new int[]{1, 1, 1};
        field_p[3] = new int[]{0, 1, 0};
        field_u[4] = new int[]{22, 56, 54};
        field_q[4] = new int[]{1600, 1600, 1600};
        field_r[4] = new int[]{1024, 1024, 1024};
        field_s[4] = new int[]{1536, 1536, 1536};
        field_k[4] = new int[]{20, 20, 20};
        field_p[4] = new int[]{0, 0, 0};
        field_m[5] = new int[]{1, 1, 2};
        field_u[5] = new int[]{4, 5, 0};
        field_q[5] = new int[]{1600, 1600, 1600};
        field_r[5] = new int[]{1024, 1024, 1024};
        field_s[5] = new int[]{1536, 1536, 1536};
        field_k[5] = new int[]{20, 20, 20};
        field_p[5] = new int[]{0, 0, 0};
        field_m[6] = new int[]{3, 3, 1};
        field_u[6] = new int[]{4, 5, 26};
        field_q[6] = new int[]{1024, 1024, 2048};
        field_r[6] = new int[]{512, 0, 0};
        field_s[6] = new int[]{1900, 1900, 3584};
        field_k[6] = new int[]{40, 70, 35};
        field_m[7] = new int[]{1, 1};
        field_p[6] = new int[]{0, 0, 0};
        field_u[7] = new int[]{16, 15};
        field_q[7] = new int[]{2500, 2500};
        field_r[7] = new int[]{1224, 1224};
        field_s[7] = new int[]{1900, 1900};
        field_k[7] = new int[]{40, 40};
        field_p[7] = new int[]{0, 0};
        field_m[8] = new int[]{1, 1, 1};
        field_u[8] = new int[]{27, 27, 24};
        field_q[8] = new int[]{2400, 2400, 3400};
        field_r[8] = new int[]{1224, 1224, 1224};
        field_s[8] = new int[]{1900, 1900, 1900};
        field_k[8] = new int[]{50, 50, 40};
        field_p[8] = new int[]{0, 1, 0};
        field_m[9] = new int[]{6, 1, 1};
        field_u[9] = new int[]{0, 13, 76};
        field_q[9] = new int[]{1800, 1800, 1800};
        field_r[9] = new int[]{0, 1024, 1024};
        field_s[9] = new int[]{1900, 1900, 1900};
        field_k[9] = new int[]{30, 40, 30};
        field_p[9] = new int[]{0, 0, 0};
        field_m[10] = new int[]{1, 1, 0};
        field_u[10] = new int[]{17, 74, -1};
        field_q[10] = new int[]{2000, 2800, -1};
        field_r[10] = new int[]{1024, 1024, -1};
        field_s[10] = new int[]{1900, 1900, -1};
        field_k[10] = new int[]{10, 40, -1};
        field_p[10] = new int[]{0, 0, 3};
    }
}
