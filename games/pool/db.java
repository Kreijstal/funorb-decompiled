/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vh {
    private vh field_Lb;
    private vh field_Yb;
    private vh field_Xb;
    private vh field_Tb;
    private vh field_Ob;
    static long field_Pb;
    static vh field_Nb;
    private vh field_Rb;
    static nm field_Vb;
    static oh field_Qb;
    static dd field_Wb;
    private int field_Mb;
    static cd field_Ub;
    static nq field_Sb;

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        vh var14;
        vh var15;
        vh var16;
        vh var17;
        vh var18;
        vh var19;
        vh stackIn_9_0 = null;
        vh stackIn_9_1 = null;
        vh stackIn_9_2 = null;
        vh stackIn_10_0 = null;
        vh stackIn_10_1 = null;
        vh stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        vh stackIn_23_0 = null;
        vh stackIn_23_1 = null;
        vh stackIn_23_2 = null;
        vh stackIn_24_0 = null;
        vh stackIn_24_1 = null;
        vh stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        vh stackIn_33_0 = null;
        vh stackIn_33_1 = null;
        vh stackIn_33_2 = null;
        vh stackIn_34_0 = null;
        vh stackIn_34_1 = null;
        vh stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        L0: {
          if (this.field_Db < 2 * this.field_gb) {
            var6 = this.field_Db / 2;
            var5 = this.field_Db / 2;
            break L0;
          } else {
            var6 = -this.field_gb + this.field_Db;
            var5 = this.field_gb;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (-1 > (param0 ^ -1)) {
          L1: {
            var8 = param1 * var8 / param0;
            if (var8 < this.field_gb) {
              var8 = this.field_gb;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 < var8) {
            L2: {
              var8 = var7;
              var9 = -param1 + param0;
              var10 = var7 - var8;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + param3 * var10) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var11 - -(var8 / 2);
              var14 = this.field_Ob;
              var14.field_Db = var5;
              var14.field_qb = 0;
              var14.field_gb = this.field_gb;
              var14.field_eb = 0;
              var15 = this.field_Yb;
              var15.field_qb = 0;
              var15.field_Db = -var6 + this.field_Db;
              var15.field_eb = var6;
              var15.field_gb = this.field_gb;
              var16 = this.field_Tb;
              var16.field_qb = 0;
              var16.field_gb = this.field_gb;
              var16.field_eb = var5;
              var16.field_Db = var7;
              var17 = this.field_Xb;
              var17.field_Db = var12;
              var17.field_qb = 0;
              var17.field_gb = this.field_gb;
              var17.field_eb = 0;
              var18 = this.field_Lb;
              var18.field_Db = -var12 + var7;
              var18.field_eb = var12;
              var18.field_gb = this.field_gb;
              var18.field_qb = 0;
              var19 = this.field_Rb;
              var19.field_qb = 0;
              var19.field_Db = var8;
              var19.field_eb = var11;
              var19.field_gb = this.field_gb;
              stackIn_33_0 = this.field_Ob;

              stackIn_33_1 = this.field_Yb;

              stackIn_33_2 = this.field_Tb;

              if (param1 >= param0) {
                stackIn_34_0 = (vh) ((Object) stackIn_33_0);
                stackIn_34_1 = (vh) ((Object) stackIn_33_1);
                stackIn_34_2 = (vh) ((Object) stackIn_33_2);
                stackIn_34_3 = 0;
                break L3;
              } else {
                stackIn_34_0 = (vh) ((Object) stackIn_33_0);
                stackIn_34_1 = (vh) ((Object) stackIn_33_1);
                stackIn_34_2 = (vh) ((Object) stackIn_33_2);
                stackIn_34_3 = 1;
                break L3;
              }
            }
            stackIn_34_2.field_pb = stackIn_34_3 != 0;
            stackIn_34_1.field_pb = stackIn_34_3 != 0;
            stackIn_34_0.field_pb = stackIn_34_3 != 0;
            if (param2) {
              field_Vb = (nm) null;
              return;
            } else {
              return;
            }
          } else {
            L4: {
              var9 = -param1 + param0;
              var10 = var7 - var8;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + param3 * var10) / var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var12 = var11 - -(var8 / 2);
              var14 = this.field_Ob;
              var14.field_Db = var5;
              var14.field_qb = 0;
              var14.field_gb = this.field_gb;
              var14.field_eb = 0;
              var15 = this.field_Yb;
              var15.field_qb = 0;
              var15.field_Db = -var6 + this.field_Db;
              var15.field_eb = var6;
              var15.field_gb = this.field_gb;
              var16 = this.field_Tb;
              var16.field_qb = 0;
              var16.field_gb = this.field_gb;
              var16.field_eb = var5;
              var16.field_Db = var7;
              var17 = this.field_Xb;
              var17.field_Db = var12;
              var17.field_qb = 0;
              var17.field_gb = this.field_gb;
              var17.field_eb = 0;
              var18 = this.field_Lb;
              var18.field_Db = -var12 + var7;
              var18.field_eb = var12;
              var18.field_gb = this.field_gb;
              var18.field_qb = 0;
              var19 = this.field_Rb;
              var19.field_qb = 0;
              var19.field_Db = var8;
              var19.field_eb = var11;
              var19.field_gb = this.field_gb;
              stackIn_23_0 = this.field_Ob;

              stackIn_23_1 = this.field_Yb;

              stackIn_23_2 = this.field_Tb;

              if (param1 >= param0) {
                stackIn_24_0 = (vh) ((Object) stackIn_23_0);
                stackIn_24_1 = (vh) ((Object) stackIn_23_1);
                stackIn_24_2 = (vh) ((Object) stackIn_23_2);
                stackIn_24_3 = 0;
                break L5;
              } else {
                stackIn_24_0 = (vh) ((Object) stackIn_23_0);
                stackIn_24_1 = (vh) ((Object) stackIn_23_1);
                stackIn_24_2 = (vh) ((Object) stackIn_23_2);
                stackIn_24_3 = 1;
                break L5;
              }
            }
            stackIn_24_2.field_pb = stackIn_24_3 != 0;
            stackIn_24_1.field_pb = stackIn_24_3 != 0;
            stackIn_24_0.field_pb = stackIn_24_3 != 0;
            if (!param2) {
              return;
            } else {
              field_Vb = (nm) null;
              return;
            }
          }
        } else {
          L6: {
            var9 = -param1 + param0;
            var10 = var7 - var8;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var12 = var11 - -(var8 / 2);
            var14 = this.field_Ob;
            var14.field_Db = var5;
            var14.field_qb = 0;
            var14.field_gb = this.field_gb;
            var14.field_eb = 0;
            var15 = this.field_Yb;
            var15.field_qb = 0;
            var15.field_Db = -var6 + this.field_Db;
            var15.field_eb = var6;
            var15.field_gb = this.field_gb;
            var16 = this.field_Tb;
            var16.field_qb = 0;
            var16.field_gb = this.field_gb;
            var16.field_eb = var5;
            var16.field_Db = var7;
            var17 = this.field_Xb;
            var17.field_Db = var12;
            var17.field_qb = 0;
            var17.field_gb = this.field_gb;
            var17.field_eb = 0;
            var18 = this.field_Lb;
            var18.field_Db = -var12 + var7;
            var18.field_eb = var12;
            var18.field_gb = this.field_gb;
            var18.field_qb = 0;
            var19 = this.field_Rb;
            var19.field_qb = 0;
            var19.field_Db = var8;
            var19.field_eb = var11;
            var19.field_gb = this.field_gb;
            stackIn_9_0 = this.field_Ob;

            stackIn_9_1 = this.field_Yb;

            stackIn_9_2 = this.field_Tb;

            if (param1 >= param0) {
              stackIn_10_0 = (vh) ((Object) stackIn_9_0);
              stackIn_10_1 = (vh) ((Object) stackIn_9_1);
              stackIn_10_2 = (vh) ((Object) stackIn_9_2);
              stackIn_10_3 = 0;
              break L7;
            } else {
              stackIn_10_0 = (vh) ((Object) stackIn_9_0);
              stackIn_10_1 = (vh) ((Object) stackIn_9_1);
              stackIn_10_2 = (vh) ((Object) stackIn_9_2);
              stackIn_10_3 = 1;
              break L7;
            }
          }
          stackIn_10_2.field_pb = stackIn_10_3 != 0;
          stackIn_10_1.field_pb = stackIn_10_3 != 0;
          stackIn_10_0.field_pb = stackIn_10_3 != 0;
          if (!param2) {
            return;
          } else {
            field_Vb = (nm) null;
            return;
          }
        }
    }

    public static void h(byte param0) {
        eg var2;
        field_Wb = null;
        field_Sb = null;
        field_Nb = null;
        field_Ub = null;
        if (param0 < 12) {
          var2 = (eg) null;
          db.a(-122, (eg) null);
          field_Qb = null;
          field_Vb = null;
          return;
        } else {
          field_Qb = null;
          field_Vb = null;
          return;
        }
    }

    final int a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        if (param3 >= 6) {
          L0: {
            var5 = 0;
            var6 = -this.field_Rb.field_Db + this.field_Tb.field_Db;
            if (-1 > (var6 ^ -1)) {
              var7 = this.field_Rb.field_eb;
              var8 = -param2 + param1;
              var5 = (var7 * var8 - -(var6 / 2)) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0) {
            L1: {
              if (-1 >= (var5 ^ -1)) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            if (var5 <= -param2 + param1) {
              return var5;
            } else {
              var5 = -param2 + param1;
              return var5;
            }
          } else {
            L2: {
              if (-param2 + param1 < var5) {
                var5 = -param2 + param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 <= var5) {
                break L3;
              } else {
                var5 = 0;
                break L3;
              }
            }
            return var5;
          }
        } else {
          return -68;
        }
    }

    db(long param0, db param1) {
        this(param0, param1.field_Ob, param1.field_Yb, param1.field_Xb, param1.field_Rb);
    }

    final boolean g(byte param0) {
        if (param0 >= 121) {
          if (this.field_Lb.field_R == 0) {
            if (this.field_Lb.field_jb != 0) {
              L0: {
                if ((this.field_Mb ^ -1) < -1) {
                  this.field_Mb = this.field_Mb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Mb == 0) {
                if (gg.field_f < this.field_Rb.field_E + (this.field_Rb.field_ib + this.field_Rb.field_Db) + this.field_Rb.field_Cb) {
                  return false;
                } else {
                  this.field_Mb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            this.field_Mb = 20;
            return true;
          }
        } else {
          return false;
        }
    }

    final static vh f(byte param0) {
        if (param0 != 13) {
            db.h((byte) -72);
            return cp.field_c.field_Mb;
        }
        return cp.field_c.field_Mb;
    }

    final boolean i(byte param0) {
        int var2;
        var2 = 48 % ((param0 - 13) / 61);
        if (-1 == (this.field_Yb.field_R ^ -1)) {
          if (-1 != (this.field_Yb.field_jb ^ -1)) {
            if (-1 <= (this.field_Mb ^ -1)) {
              if (this.field_Mb == 0) {
                this.field_Mb = 3;
                return true;
              } else {
                return false;
              }
            } else {
              this.field_Mb = this.field_Mb - 1;
              if (this.field_Mb == 0) {
                this.field_Mb = 3;
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          this.field_Mb = 20;
          return true;
        }
    }

    final boolean f(int param0) {
        if (this.field_Ob.field_R == 0) {
          if (param0 == -4779) {
            if (this.field_Ob.field_jb != 0) {
              if (0 >= this.field_Mb) {
                if (this.field_Mb != 0) {
                  return false;
                } else {
                  this.field_Mb = 3;
                  return true;
                }
              } else {
                this.field_Mb = this.field_Mb - 1;
                if (this.field_Mb != 0) {
                  return false;
                } else {
                  this.field_Mb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Mb = 20;
          return true;
        }
    }

    db(long param0, vh param1, vh param2, vh param3, vh param4) {
        super(param0, (vh) null);
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
        vh var9 = null;
        vh var10 = null;
        try {
          L0: {
            this.field_Ob = new vh(0L, param1);
            this.field_Yb = new vh(0L, param2);
            this.a(7, this.field_Ob);
            this.a(-114, this.field_Yb);
            this.field_Tb = new vh(0L, (vh) null);
            this.a(126, this.field_Tb);
            this.field_Xb = new vh(0L, param3);
            this.field_Lb = new vh(0L, param3);
            this.field_Lb.field_J = true;
            var9 = this.field_Xb;
            var10 = var9;
            var10.field_J = true;
            this.field_Tb.a(65, this.field_Xb);
            this.field_Tb.a(110, this.field_Lb);
            this.field_Rb = new vh(0L, param4);
            this.field_Rb.field_Jb = true;
            this.field_Tb.a(-126, this.field_Rb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("db.<init>(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        vn stackIn_4_0 = null;
        vn stackIn_8_0 = null;
        if (param0 != 27194) {
          L0: {
            db.f((byte) 19);
            if (param1) {
              stackIn_8_0 = new vn(je.field_b, v.field_j);
              break L0;
            } else {
              stackIn_8_0 = new vn(mm.field_l, cl.field_d);
              break L0;
            }
          }
          na.field_e = stackIn_8_0;
          so.field_k = new vh(0L, (vh) null);
          so.field_k.a(64, na.field_e.field_i);
          so.field_k.a(-96, ok.field_ob);
          de.field_b = new vh(0L, tq.field_m);
          aa.field_b = new vh(0L, (vh) null);
          de.field_b.a(param0 ^ -27208, Pool.field_P);
          de.field_b.a(68, aa.field_b);
          aa.field_b.a(-96, c.field_e);
          aa.field_b.a(90, ba.field_vb);
          al.a(param1, 0);
          return;
        } else {
          L1: {
            if (param1) {
              stackIn_4_0 = new vn(je.field_b, v.field_j);
              break L1;
            } else {
              stackIn_4_0 = new vn(mm.field_l, cl.field_d);
              break L1;
            }
          }
          na.field_e = stackIn_4_0;
          so.field_k = new vh(0L, (vh) null);
          so.field_k.a(64, na.field_e.field_i);
          so.field_k.a(-96, ok.field_ob);
          de.field_b = new vh(0L, tq.field_m);
          aa.field_b = new vh(0L, (vh) null);
          de.field_b.a(param0 ^ -27208, Pool.field_P);
          de.field_b.a(68, aa.field_b);
          aa.field_b.a(-96, c.field_e);
          aa.field_b.a(90, ba.field_vb);
          al.a(param1, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_Db = param2;
        this.field_gb = param3;
        if (param5 != 8414) {
          this.g(-62);
          this.field_eb = param1;
          this.field_qb = param6;
          this.b(param0, param7, false, param4);
          return;
        } else {
          this.field_eb = param1;
          this.field_qb = param6;
          this.b(param0, param7, false, param4);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        ma var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        i var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var4 = (i) ((Object) ue.field_b.c((byte) 96));
            L1: while (true) {
              if (var4 == null) {
                var2 = hb.field_j.c((byte) 87);
                L2: while (true) {
                  if (var2 == null) {
                    if (param0 == 58) {
                      break L0;
                    } else {
                      field_Qb = (oh) null;
                      return;
                    }
                  } else {
                    kp.a(param0 ^ 59, param1);
                    var2 = hb.field_j.f((byte) -5);
                    continue L2;
                  }
                }
              } else {
                gp.a(param1, var4, -6725);
                var4 = (i) ((Object) ue.field_b.f((byte) -5));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "db.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -41) {
          L0: {
            this.field_Lb = (vh) null;
            if (0 == this.field_Rb.field_jb) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == this.field_Rb.field_jb) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void h(int param0) {
        lf.a(4, (byte) 105);
        if (param0 == 15158) {
            return;
        }
        field_Pb = -100L;
    }

    final boolean j(byte param0) {
        if (param0 < -60) {
          if (this.field_Xb.field_R != 0) {
            this.field_Mb = 20;
            return true;
          } else {
            if (this.field_Xb.field_jb != 0) {
              if (0 >= this.field_Mb) {
                if (this.field_Mb == 0) {
                  if (gg.field_f < this.field_Rb.field_E + this.field_Rb.field_ib) {
                    this.field_Mb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Mb = this.field_Mb - 1;
                if (this.field_Mb == 0) {
                  if (gg.field_f < this.field_Rb.field_E + this.field_Rb.field_ib) {
                    this.field_Mb = 3;
                    return true;
                  } else {
                    return false;
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
          this.field_Yb = (vh) null;
          if (this.field_Xb.field_R != 0) {
            this.field_Mb = 20;
            return true;
          } else {
            if (this.field_Xb.field_jb != 0) {
              if (0 < this.field_Mb) {
                this.field_Mb = this.field_Mb - 1;
                if (this.field_Mb == 0) {
                  if (gg.field_f < this.field_Rb.field_E + this.field_Rb.field_ib) {
                    this.field_Mb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (this.field_Mb == 0) {
                  if (gg.field_f >= this.field_Rb.field_E + this.field_Rb.field_ib) {
                    return false;
                  } else {
                    this.field_Mb = 3;
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

    final static void a(int param0, eg param1) {
        int[] var3 = null;
        try {
            var3 = param1.field_Y;
            int[] var2 = var3;
            param1.field_Y = param1.field_q;
            if (param0 != 0) {
                field_Vb = (nm) null;
            }
            param1.field_q = var3;
            jf.a(param1, (byte) 38);
            param1.a();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "db.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Qb = new oh();
        field_Ub = new cd();
    }
}
