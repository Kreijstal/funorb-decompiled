/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends cr {
    static String field_Rb;
    static fe field_Hb;
    private cr field_Mb;
    static String field_Sb;
    private cr field_Ib;
    private cr field_Lb;
    static int field_Kb;
    private cr field_Ob;
    static long field_Nb;
    private cr field_Qb;
    private cr field_Pb;
    private int field_Jb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        this.field_Fb = param1;
        this.field_db = param0;
        this.field_N = param2;
        if (param3 < 99) {
          this.field_Lb = (cr) null;
          this.field_wb = param6;
          this.a(param5, param4, (byte) -52, param7);
          return;
        } else {
          this.field_wb = param6;
          this.a(param5, param4, (byte) -52, param7);
          return;
        }
    }

    ie(long param0, ie param1) {
        this(param0, param1.field_Lb, param1.field_Qb, param1.field_Ib, param1.field_Pb);
    }

    public static void o(int param0) {
        field_Hb = null;
        if (param0 > -14) {
            return;
        }
        field_Sb = null;
        field_Rb = null;
    }

    final boolean p(int param0) {
        if (-1 == (this.field_Lb.field_tb ^ -1)) {
          if (0 != this.field_Lb.field_xb) {
            L0: {
              if (0 < this.field_Jb) {
                this.field_Jb = this.field_Jb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 != this.field_Jb) {
              if (param0 >= -42) {
                this.m(13);
                return false;
              } else {
                return false;
              }
            } else {
              this.field_Jb = 3;
              return true;
            }
          } else {
            if (param0 >= -42) {
              this.m(13);
              return false;
            } else {
              return false;
            }
          }
        } else {
          this.field_Jb = 20;
          return true;
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
            return false;
        }
        return (this.field_Pb.field_xb ^ -1) != -1 ? true : false;
    }

    final int a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = -this.field_Pb.field_db + this.field_Mb.field_db;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = this.field_Pb.field_N;
            var8 = -param3 + param0;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        if (param2) {
          L1: {
            if ((var5 ^ -1) > -1) {
              var5 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0 + -param3 >= var5) {
              break L2;
            } else {
              var5 = param0 - param3;
              break L2;
            }
          }
          if (!param1) {
            field_Sb = (String) null;
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (var5 <= param0 + -param3) {
              break L3;
            } else {
              var5 = param0 - param3;
              break L3;
            }
          }
          if ((var5 ^ -1) > -1) {
            var5 = 0;
            if (param1) {
              return var5;
            } else {
              field_Sb = (String) null;
              return var5;
            }
          } else {
            if (!param1) {
              field_Sb = (String) null;
              return var5;
            } else {
              return var5;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cr var14 = null;
        cr var15 = null;
        cr var16 = null;
        cr var17 = null;
        cr var18 = null;
        cr var19 = null;
        if (this.field_db < this.field_Fb * 2) {
            var6 = this.field_db / 2;
            var5 = this.field_db / 2;
        } else {
            var5 = this.field_Fb;
            var6 = this.field_db + -this.field_Fb;
        }
        int var7 = var6 + -var5;
        if (param2 >= -43) {
            this.l(109);
            var8 = var7;
            if (!(0 >= param0)) {
                var8 = var8 * param3 / param0;
                if (var8 < this.field_Fb) {
                    var8 = this.field_Fb;
                }
                if (!(var8 <= var7)) {
                    var8 = var7;
                }
            }
            var9 = param0 - param3;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
                var11 = (param1 * var10 + var9 / 2) / var9;
            }
            var12 = var11 + var8 / 2;
            var14 = this.field_Lb;
            var14.field_N = 0;
            var14.field_wb = 0;
            var14.field_Fb = this.field_Fb;
            var14.field_db = var5;
            var15 = this.field_Qb;
            var15.field_wb = 0;
            var15.field_db = -var6 + this.field_db;
            var15.field_Fb = this.field_Fb;
            var15.field_N = var6;
            var16 = this.field_Mb;
            var16.field_wb = 0;
            var16.field_N = var5;
            var16.field_Fb = this.field_Fb;
            var16.field_db = var7;
            var17 = this.field_Ib;
            var17.field_Fb = this.field_Fb;
            var17.field_wb = 0;
            var17.field_db = var12;
            var17.field_N = 0;
            var18 = this.field_Ob;
            var18.field_N = var12;
            var18.field_Fb = this.field_Fb;
            var18.field_db = var7 + -var12;
            var18.field_wb = 0;
            var19 = this.field_Pb;
            var19.field_db = var8;
            var19.field_Fb = this.field_Fb;
            var19.field_N = var11;
            this.field_Mb.field_lb = param0 > param3 ? true : false;
            this.field_Qb.field_lb = param0 > param3 ? true : false;
            this.field_Lb.field_lb = param0 > param3 ? true : false;
            var19.field_wb = 0;
            return;
        }
        var8 = var7;
        if (0 >= param0) {
            var9 = param0 - param3;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
                var11 = (param1 * var10 + var9 / 2) / var9;
            }
            var12 = var11 + var8 / 2;
            var14 = this.field_Lb;
            var14.field_N = 0;
            var14.field_wb = 0;
            var14.field_Fb = this.field_Fb;
            var14.field_db = var5;
            var15 = this.field_Qb;
            var15.field_wb = 0;
            var15.field_db = -var6 + this.field_db;
            var15.field_Fb = this.field_Fb;
            var15.field_N = var6;
            var16 = this.field_Mb;
            var16.field_wb = 0;
            var16.field_N = var5;
            var16.field_Fb = this.field_Fb;
            var16.field_db = var7;
            var17 = this.field_Ib;
            var17.field_Fb = this.field_Fb;
            var17.field_wb = 0;
            var17.field_db = var12;
            var17.field_N = 0;
            var18 = this.field_Ob;
            var18.field_N = var12;
            var18.field_Fb = this.field_Fb;
            var18.field_db = var7 + -var12;
            var18.field_wb = 0;
            var19 = this.field_Pb;
            var19.field_db = var8;
            var19.field_Fb = this.field_Fb;
            var19.field_N = var11;
            this.field_Mb.field_lb = param0 > param3 ? true : false;
            this.field_Qb.field_lb = param0 > param3 ? true : false;
            this.field_Lb.field_lb = param0 > param3 ? true : false;
            var19.field_wb = 0;
            return;
        }
        var8 = var8 * param3 / param0;
        if (var8 < this.field_Fb) {
            var8 = this.field_Fb;
        }
        if (var8 <= var7) {
            var9 = param0 - param3;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
                var11 = (param1 * var10 + var9 / 2) / var9;
            }
            var12 = var11 + var8 / 2;
            var14 = this.field_Lb;
            var14.field_N = 0;
            var14.field_wb = 0;
            var14.field_Fb = this.field_Fb;
            var14.field_db = var5;
            var15 = this.field_Qb;
            var15.field_wb = 0;
            var15.field_db = -var6 + this.field_db;
            var15.field_Fb = this.field_Fb;
            var15.field_N = var6;
            var16 = this.field_Mb;
            var16.field_wb = 0;
            var16.field_N = var5;
            var16.field_Fb = this.field_Fb;
            var16.field_db = var7;
            var17 = this.field_Ib;
            var17.field_Fb = this.field_Fb;
            var17.field_wb = 0;
            var17.field_db = var12;
            var17.field_N = 0;
            var18 = this.field_Ob;
            var18.field_N = var12;
            var18.field_Fb = this.field_Fb;
            var18.field_db = var7 + -var12;
            var18.field_wb = 0;
            var19 = this.field_Pb;
            var19.field_db = var8;
            var19.field_Fb = this.field_Fb;
            var19.field_N = var11;
            this.field_Mb.field_lb = param0 > param3 ? true : false;
            this.field_Qb.field_lb = param0 > param3 ? true : false;
            this.field_Lb.field_lb = param0 > param3 ? true : false;
            var19.field_wb = 0;
            return;
        }
        var8 = var7;
        var9 = param0 - param3;
        var10 = -var8 + var7;
        var11 = 0;
        if ((var9 ^ -1) < -1) {
            var11 = (param1 * var10 + var9 / 2) / var9;
        }
        var12 = var11 + var8 / 2;
        var14 = this.field_Lb;
        var14.field_N = 0;
        var14.field_wb = 0;
        var14.field_Fb = this.field_Fb;
        var14.field_db = var5;
        var15 = this.field_Qb;
        var15.field_wb = 0;
        var15.field_db = -var6 + this.field_db;
        var15.field_Fb = this.field_Fb;
        var15.field_N = var6;
        var16 = this.field_Mb;
        var16.field_wb = 0;
        var16.field_N = var5;
        var16.field_Fb = this.field_Fb;
        var16.field_db = var7;
        var17 = this.field_Ib;
        var17.field_Fb = this.field_Fb;
        var17.field_wb = 0;
        var17.field_db = var12;
        var17.field_N = 0;
        var18 = this.field_Ob;
        var18.field_N = var12;
        var18.field_Fb = this.field_Fb;
        var18.field_db = var7 + -var12;
        var18.field_wb = 0;
        var19 = this.field_Pb;
        var19.field_db = var8;
        var19.field_Fb = this.field_Fb;
        var19.field_N = var11;
        this.field_Mb.field_lb = param0 > param3 ? true : false;
        this.field_Qb.field_lb = param0 > param3 ? true : false;
        this.field_Lb.field_lb = param0 > param3 ? true : false;
        var19.field_wb = 0;
    }

    final static qj q(int param0) {
        if (param0 != 20) {
          ie.o(-87);
          return new qj(eb.a(-1), ln.c(132199140));
        } else {
          return new qj(eb.a(-1), ln.c(132199140));
        }
    }

    final static void b(int param0, boolean param1) {
        if (param0 != 20983) {
            return;
        }
        e.a(param1, (byte) -128);
        if (!(null == ko.field_S)) {
            oh.a(ko.field_S, false);
        }
    }

    final boolean m(int param0) {
        if (0 != this.field_Qb.field_tb) {
          this.field_Jb = 20;
          return true;
        } else {
          if (this.field_Qb.field_xb == 0) {
            if (param0 < 20) {
              this.l(30);
              return false;
            } else {
              return false;
            }
          } else {
            if (this.field_Jb <= 0) {
              if (-1 != (this.field_Jb ^ -1)) {
                if (param0 >= 20) {
                  return false;
                } else {
                  this.l(30);
                  return false;
                }
              } else {
                this.field_Jb = 3;
                return true;
              }
            } else {
              this.field_Jb = this.field_Jb - 1;
              if (-1 == (this.field_Jb ^ -1)) {
                this.field_Jb = 3;
                return true;
              } else {
                if (param0 >= 20) {
                  return false;
                } else {
                  this.l(30);
                  return false;
                }
              }
            }
          }
        }
    }

    ie(long param0, cr param1, cr param2, cr param3, cr param4) {
        super(param0, (cr) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        cr var9 = null;
        cr var10 = null;
        try {
          L0: {
            this.field_Lb = new cr(0L, param1);
            this.field_Qb = new cr(0L, param2);
            this.b(this.field_Lb, 126);
            this.b(this.field_Qb, 125);
            this.field_Mb = new cr(0L, (cr) null);
            this.b(this.field_Mb, 125);
            this.field_Ib = new cr(0L, param3);
            this.field_Ob = new cr(0L, param3);
            var9 = this.field_Ib;
            var10 = var9;
            this.field_Ob.field_jb = true;
            var10.field_jb = true;
            this.field_Mb.b(this.field_Ib, 123);
            this.field_Mb.b(this.field_Ob, 118);
            this.field_Pb = new cr(0L, param4);
            this.field_Pb.field_X = true;
            this.field_Mb.b(this.field_Pb, 122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("ie.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final boolean n(int param0) {
        if (param0 == -22155) {
          if (-1 != (this.field_Ob.field_tb ^ -1)) {
            this.field_Jb = 20;
            return true;
          } else {
            if (this.field_Ob.field_xb != 0) {
              if (this.field_Jb <= 0) {
                if (0 == this.field_Jb) {
                  if (gb.field_d < this.field_Pb.field_kb + (this.field_Pb.field_db + this.field_Pb.field_L + this.field_Pb.field_C)) {
                    return false;
                  } else {
                    this.field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Jb = this.field_Jb - 1;
                if (0 == this.field_Jb) {
                  if (gb.field_d < this.field_Pb.field_kb + (this.field_Pb.field_db + this.field_Pb.field_L + this.field_Pb.field_C)) {
                    return false;
                  } else {
                    this.field_Jb = 3;
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
        } else {
          ie.q(-71);
          if (-1 != (this.field_Ob.field_tb ^ -1)) {
            this.field_Jb = 20;
            return true;
          } else {
            if (this.field_Ob.field_xb != 0) {
              if (this.field_Jb > 0) {
                this.field_Jb = this.field_Jb - 1;
                if (0 == this.field_Jb) {
                  if (gb.field_d < this.field_Pb.field_kb + (this.field_Pb.field_db + this.field_Pb.field_L + this.field_Pb.field_C)) {
                    return false;
                  } else {
                    this.field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (0 == this.field_Jb) {
                  if (gb.field_d < this.field_Pb.field_kb + (this.field_Pb.field_db + this.field_Pb.field_L + this.field_Pb.field_C)) {
                    return false;
                  } else {
                    this.field_Jb = 3;
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

    final boolean l(int param0) {
        if (this.field_Ib.field_tb == 0) {
          if (param0 < -59) {
            if (this.field_Ib.field_xb != 0) {
              if (this.field_Jb <= 0) {
                if (this.field_Jb == 0) {
                  if (this.field_Pb.field_L + this.field_Pb.field_C <= gb.field_d) {
                    return false;
                  } else {
                    this.field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Jb = this.field_Jb - 1;
                if (this.field_Jb == 0) {
                  if (this.field_Pb.field_L + this.field_Pb.field_C <= gb.field_d) {
                    return false;
                  } else {
                    this.field_Jb = 3;
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
            return false;
          }
        } else {
          this.field_Jb = 20;
          return true;
        }
    }

    static {
        field_Rb = "<%0>'s game";
        field_Sb = "Advertising websites";
        field_Kb = 0;
    }
}
