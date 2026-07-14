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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
        vh var19 = null;
        vh stackIn_8_0 = null;
        vh stackIn_8_1 = null;
        vh stackIn_8_2 = null;
        vh stackIn_9_0 = null;
        vh stackIn_9_1 = null;
        vh stackIn_9_2 = null;
        vh stackIn_10_0 = null;
        vh stackIn_10_1 = null;
        vh stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        vh stackIn_22_0 = null;
        vh stackIn_22_1 = null;
        vh stackIn_22_2 = null;
        vh stackIn_23_0 = null;
        vh stackIn_23_1 = null;
        vh stackIn_23_2 = null;
        vh stackIn_24_0 = null;
        vh stackIn_24_1 = null;
        vh stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        vh stackIn_32_0 = null;
        vh stackIn_32_1 = null;
        vh stackIn_32_2 = null;
        vh stackIn_33_0 = null;
        vh stackIn_33_1 = null;
        vh stackIn_33_2 = null;
        vh stackIn_34_0 = null;
        vh stackIn_34_1 = null;
        vh stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        vh stackOut_31_0 = null;
        vh stackOut_31_1 = null;
        vh stackOut_31_2 = null;
        vh stackOut_33_0 = null;
        vh stackOut_33_1 = null;
        vh stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        vh stackOut_32_0 = null;
        vh stackOut_32_1 = null;
        vh stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        vh stackOut_21_0 = null;
        vh stackOut_21_1 = null;
        vh stackOut_21_2 = null;
        vh stackOut_23_0 = null;
        vh stackOut_23_1 = null;
        vh stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        vh stackOut_22_0 = null;
        vh stackOut_22_1 = null;
        vh stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        vh stackOut_7_0 = null;
        vh stackOut_7_1 = null;
        vh stackOut_7_2 = null;
        vh stackOut_9_0 = null;
        vh stackOut_9_1 = null;
        vh stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        vh stackOut_8_0 = null;
        vh stackOut_8_1 = null;
        vh stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        L0: {
          if (((db) this).field_Db < 2 * ((db) this).field_gb) {
            var6 = ((db) this).field_Db / 2;
            var5 = ((db) this).field_Db / 2;
            break L0;
          } else {
            var6 = -((db) this).field_gb + ((db) this).field_Db;
            var5 = ((db) this).field_gb;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (-1 > (param0 ^ -1)) {
          L1: {
            var8 = param1 * var8 / param0;
            if (var8 < ((db) this).field_gb) {
              var8 = ((db) this).field_gb;
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
              var14 = ((db) this).field_Ob;
              var14.field_Db = var5;
              var14.field_qb = 0;
              var14.field_gb = ((db) this).field_gb;
              var14.field_eb = 0;
              var15 = ((db) this).field_Yb;
              var15.field_qb = 0;
              var15.field_Db = -var6 + ((db) this).field_Db;
              var15.field_eb = var6;
              var15.field_gb = ((db) this).field_gb;
              var16 = ((db) this).field_Tb;
              var16.field_qb = 0;
              var16.field_gb = ((db) this).field_gb;
              var16.field_eb = var5;
              var16.field_Db = var7;
              var17 = ((db) this).field_Xb;
              var17.field_Db = var12;
              var17.field_qb = 0;
              var17.field_gb = ((db) this).field_gb;
              var17.field_eb = 0;
              var18 = ((db) this).field_Lb;
              var18.field_Db = -var12 + var7;
              var18.field_eb = var12;
              var18.field_gb = ((db) this).field_gb;
              var18.field_qb = 0;
              var19 = ((db) this).field_Rb;
              var19.field_qb = 0;
              var19.field_Db = var8;
              var19.field_eb = var11;
              var19.field_gb = ((db) this).field_gb;
              stackOut_31_0 = ((db) this).field_Ob;
              stackOut_31_1 = ((db) this).field_Yb;
              stackOut_31_2 = ((db) this).field_Tb;
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              if (param1 >= param0) {
                stackOut_33_0 = (vh) (Object) stackIn_33_0;
                stackOut_33_1 = (vh) (Object) stackIn_33_1;
                stackOut_33_2 = (vh) (Object) stackIn_33_2;
                stackOut_33_3 = 0;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                break L3;
              } else {
                stackOut_32_0 = (vh) (Object) stackIn_32_0;
                stackOut_32_1 = (vh) (Object) stackIn_32_1;
                stackOut_32_2 = (vh) (Object) stackIn_32_2;
                stackOut_32_3 = 1;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                break L3;
              }
            }
            stackIn_34_2.field_pb = stackIn_34_3 != 0;
            stackIn_34_1.field_pb = stackIn_34_3 != 0;
            stackIn_34_0.field_pb = stackIn_34_3 != 0;
            if (param2) {
              field_Vb = null;
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
              var14 = ((db) this).field_Ob;
              var14.field_Db = var5;
              var14.field_qb = 0;
              var14.field_gb = ((db) this).field_gb;
              var14.field_eb = 0;
              var15 = ((db) this).field_Yb;
              var15.field_qb = 0;
              var15.field_Db = -var6 + ((db) this).field_Db;
              var15.field_eb = var6;
              var15.field_gb = ((db) this).field_gb;
              var16 = ((db) this).field_Tb;
              var16.field_qb = 0;
              var16.field_gb = ((db) this).field_gb;
              var16.field_eb = var5;
              var16.field_Db = var7;
              var17 = ((db) this).field_Xb;
              var17.field_Db = var12;
              var17.field_qb = 0;
              var17.field_gb = ((db) this).field_gb;
              var17.field_eb = 0;
              var18 = ((db) this).field_Lb;
              var18.field_Db = -var12 + var7;
              var18.field_eb = var12;
              var18.field_gb = ((db) this).field_gb;
              var18.field_qb = 0;
              var19 = ((db) this).field_Rb;
              var19.field_qb = 0;
              var19.field_Db = var8;
              var19.field_eb = var11;
              var19.field_gb = ((db) this).field_gb;
              stackOut_21_0 = ((db) this).field_Ob;
              stackOut_21_1 = ((db) this).field_Yb;
              stackOut_21_2 = ((db) this).field_Tb;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              if (param1 >= param0) {
                stackOut_23_0 = (vh) (Object) stackIn_23_0;
                stackOut_23_1 = (vh) (Object) stackIn_23_1;
                stackOut_23_2 = (vh) (Object) stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L5;
              } else {
                stackOut_22_0 = (vh) (Object) stackIn_22_0;
                stackOut_22_1 = (vh) (Object) stackIn_22_1;
                stackOut_22_2 = (vh) (Object) stackIn_22_2;
                stackOut_22_3 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_24_3 = stackOut_22_3;
                break L5;
              }
            }
            stackIn_24_2.field_pb = stackIn_24_3 != 0;
            stackIn_24_1.field_pb = stackIn_24_3 != 0;
            stackIn_24_0.field_pb = stackIn_24_3 != 0;
            if (!param2) {
              return;
            } else {
              field_Vb = null;
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
            var14 = ((db) this).field_Ob;
            var14.field_Db = var5;
            var14.field_qb = 0;
            var14.field_gb = ((db) this).field_gb;
            var14.field_eb = 0;
            var15 = ((db) this).field_Yb;
            var15.field_qb = 0;
            var15.field_Db = -var6 + ((db) this).field_Db;
            var15.field_eb = var6;
            var15.field_gb = ((db) this).field_gb;
            var16 = ((db) this).field_Tb;
            var16.field_qb = 0;
            var16.field_gb = ((db) this).field_gb;
            var16.field_eb = var5;
            var16.field_Db = var7;
            var17 = ((db) this).field_Xb;
            var17.field_Db = var12;
            var17.field_qb = 0;
            var17.field_gb = ((db) this).field_gb;
            var17.field_eb = 0;
            var18 = ((db) this).field_Lb;
            var18.field_Db = -var12 + var7;
            var18.field_eb = var12;
            var18.field_gb = ((db) this).field_gb;
            var18.field_qb = 0;
            var19 = ((db) this).field_Rb;
            var19.field_qb = 0;
            var19.field_Db = var8;
            var19.field_eb = var11;
            var19.field_gb = ((db) this).field_gb;
            stackOut_7_0 = ((db) this).field_Ob;
            stackOut_7_1 = ((db) this).field_Yb;
            stackOut_7_2 = ((db) this).field_Tb;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            if (param1 >= param0) {
              stackOut_9_0 = (vh) (Object) stackIn_9_0;
              stackOut_9_1 = (vh) (Object) stackIn_9_1;
              stackOut_9_2 = (vh) (Object) stackIn_9_2;
              stackOut_9_3 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              break L7;
            } else {
              stackOut_8_0 = (vh) (Object) stackIn_8_0;
              stackOut_8_1 = (vh) (Object) stackIn_8_1;
              stackOut_8_2 = (vh) (Object) stackIn_8_2;
              stackOut_8_3 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              break L7;
            }
          }
          stackIn_10_2.field_pb = stackIn_10_3 != 0;
          stackIn_10_1.field_pb = stackIn_10_3 != 0;
          stackIn_10_0.field_pb = stackIn_10_3 != 0;
          if (!param2) {
            return;
          } else {
            field_Vb = null;
            return;
          }
        }
    }

    public static void h(byte param0) {
        Object var2 = null;
        field_Wb = null;
        field_Sb = null;
        field_Nb = null;
        field_Ub = null;
        if (param0 < 12) {
          var2 = null;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param3 >= 6) {
          L0: {
            var5 = 0;
            var6 = -((db) this).field_Rb.field_Db + ((db) this).field_Tb.field_Db;
            if (-1 > (var6 ^ -1)) {
              var7 = ((db) this).field_Rb.field_eb;
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
          if (((db) this).field_Lb.field_R == 0) {
            if (((db) this).field_Lb.field_jb != 0) {
              L0: {
                if ((((db) this).field_Mb ^ -1) < -1) {
                  ((db) this).field_Mb = ((db) this).field_Mb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((db) this).field_Mb == 0) {
                if (gg.field_f < ((db) this).field_Rb.field_E + (((db) this).field_Rb.field_ib + ((db) this).field_Rb.field_Db) + ((db) this).field_Rb.field_Cb) {
                  return false;
                } else {
                  ((db) this).field_Mb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            ((db) this).field_Mb = 20;
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
        int var2 = 0;
        var2 = 48 % ((param0 - 13) / 61);
        if (-1 == ((db) this).field_Yb.field_R) {
          if (-1 != ((db) this).field_Yb.field_jb) {
            if (-1 <= (((db) this).field_Mb ^ -1)) {
              if (((db) this).field_Mb == 0) {
                ((db) this).field_Mb = 3;
                return true;
              } else {
                return false;
              }
            } else {
              ((db) this).field_Mb = ((db) this).field_Mb - 1;
              if (((db) this).field_Mb == 0) {
                ((db) this).field_Mb = 3;
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          ((db) this).field_Mb = 20;
          return true;
        }
    }

    final boolean f(int param0) {
        if (((db) this).field_Ob.field_R == 0) {
          if (param0 == -4779) {
            if (((db) this).field_Ob.field_jb != 0) {
              if (0 >= ((db) this).field_Mb) {
                if (((db) this).field_Mb != 0) {
                  return false;
                } else {
                  ((db) this).field_Mb = 3;
                  return true;
                }
              } else {
                ((db) this).field_Mb = ((db) this).field_Mb - 1;
                if (((db) this).field_Mb != 0) {
                  return false;
                } else {
                  ((db) this).field_Mb = 3;
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
          ((db) this).field_Mb = 20;
          return true;
        }
    }

    db(long param0, vh param1, vh param2, vh param3, vh param4) {
        super(param0, (vh) null);
        ((db) this).field_Ob = new vh(0L, param1);
        ((db) this).field_Yb = new vh(0L, param2);
        ((db) this).a(7, ((db) this).field_Ob);
        ((db) this).a(-114, ((db) this).field_Yb);
        ((db) this).field_Tb = new vh(0L, (vh) null);
        ((db) this).a(126, ((db) this).field_Tb);
        ((db) this).field_Xb = new vh(0L, param3);
        ((db) this).field_Lb = new vh(0L, param3);
        ((db) this).field_Lb.field_J = true;
        vh var9 = ((db) this).field_Xb;
        vh var10 = var9;
        var10.field_J = true;
        ((db) this).field_Tb.a(65, ((db) this).field_Xb);
        ((db) this).field_Tb.a(110, ((db) this).field_Lb);
        ((db) this).field_Rb = new vh(0L, param4);
        ((db) this).field_Rb.field_Jb = true;
        ((db) this).field_Tb.a(-126, ((db) this).field_Rb);
    }

    final static void a(int param0, boolean param1) {
        vn stackIn_4_0 = null;
        vn stackIn_8_0 = null;
        vn stackOut_7_0 = null;
        vn stackOut_6_0 = null;
        vn stackOut_3_0 = null;
        vn stackOut_2_0 = null;
        if (param0 != 27194) {
          L0: {
            vh discarded$1 = db.f((byte) 19);
            if (param1) {
              stackOut_7_0 = new vn(je.field_b, v.field_j);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = new vn(mm.field_l, cl.field_d);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          na.field_e = stackIn_8_0;
          so.field_k = new vh(0L, (vh) null);
          so.field_k.a(64, (vh) (Object) na.field_e.field_i);
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
              stackOut_3_0 = new vn(je.field_b, v.field_j);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = new vn(mm.field_l, cl.field_d);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          na.field_e = stackIn_4_0;
          so.field_k = new vh(0L, (vh) null);
          so.field_k.a(64, (vh) (Object) na.field_e.field_i);
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
        ((db) this).field_Db = param2;
        ((db) this).field_gb = param3;
        if (param5 != 8414) {
          boolean discarded$2 = ((db) this).g(-62);
          ((db) this).field_eb = param1;
          ((db) this).field_qb = param6;
          ((db) this).b(param0, param7, false, param4);
          return;
        } else {
          ((db) this).field_eb = param1;
          ((db) this).field_qb = param6;
          ((db) this).b(param0, param7, false, param4);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        ma var2 = null;
        int var3 = 0;
        i var4 = null;
        var3 = Pool.field_O;
        var4 = (i) (Object) ue.field_b.c((byte) 96);
        L0: while (true) {
          if (var4 == null) {
            var2 = hb.field_j.c((byte) 87);
            L1: while (true) {
              if (var2 == null) {
                if (param0 == 58) {
                  return;
                } else {
                  field_Qb = null;
                  return;
                }
              } else {
                kp.a(param0 ^ 59, param1);
                var2 = hb.field_j.f((byte) -5);
                continue L1;
              }
            }
          } else {
            gp.a(param1, var4, -6725);
            var4 = (i) (Object) ue.field_b.f((byte) -5);
            continue L0;
          }
        }
    }

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -41) {
          L0: {
            ((db) this).field_Lb = null;
            if (0 == ((db) this).field_Rb.field_jb) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == ((db) this).field_Rb.field_jb) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
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
          if (((db) this).field_Xb.field_R != 0) {
            ((db) this).field_Mb = 20;
            return true;
          } else {
            if (((db) this).field_Xb.field_jb != 0) {
              if (0 >= ((db) this).field_Mb) {
                if (((db) this).field_Mb == 0) {
                  if (gg.field_f < ((db) this).field_Rb.field_E + ((db) this).field_Rb.field_ib) {
                    ((db) this).field_Mb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                ((db) this).field_Mb = ((db) this).field_Mb - 1;
                if (((db) this).field_Mb == 0) {
                  if (gg.field_f < ((db) this).field_Rb.field_E + ((db) this).field_Rb.field_ib) {
                    ((db) this).field_Mb = 3;
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
          ((db) this).field_Yb = null;
          if (((db) this).field_Xb.field_R != 0) {
            ((db) this).field_Mb = 20;
            return true;
          } else {
            if (((db) this).field_Xb.field_jb != 0) {
              if (0 < ((db) this).field_Mb) {
                ((db) this).field_Mb = ((db) this).field_Mb - 1;
                if (((db) this).field_Mb == 0) {
                  if (gg.field_f < ((db) this).field_Rb.field_E + ((db) this).field_Rb.field_ib) {
                    ((db) this).field_Mb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (((db) this).field_Mb == 0) {
                  if (gg.field_f >= ((db) this).field_Rb.field_E + ((db) this).field_Rb.field_ib) {
                    return false;
                  } else {
                    ((db) this).field_Mb = 3;
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
        int[] var2 = null;
        int[] var3 = null;
        var3 = param1.field_Y;
        var2 = var3;
        param1.field_Y = param1.field_q;
        if (param0 != 0) {
          field_Vb = null;
          param1.field_q = var3;
          jf.a(param1, (byte) 38);
          param1.a();
          return;
        } else {
          param1.field_q = var3;
          jf.a(param1, (byte) 38);
          param1.a();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = new oh();
        field_Ub = new cd();
    }
}
