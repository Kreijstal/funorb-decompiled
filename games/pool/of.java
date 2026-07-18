/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends vh {
    vh field_Rb;
    vh field_Sb;
    db field_Mb;
    static hj field_Tb;
    static String field_Qb;
    static wa field_Nb;
    static int field_Pb;
    static String field_Ub;
    static int field_Ob;
    static byte[] field_Lb;

    private final boolean a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param3) {
            if (((of) this).field_W) {
              if (!param1) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_8_0;
        ((of) this).field_Rb.a(param6, ((of) this).field_Sb.field_Db, var8 != 0, -1);
        this.a(param0, true, param2, false, param5);
        return var8 != 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, byte param3, int param4, int param5) {
        int var7 = 70 % ((param3 - 6) / 49);
        return this.a(param5, param0, ((of) this).field_Sb.field_Db, param1, 0, param4, param2);
    }

    public static void f(int param0) {
        field_Nb = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
        if (param0 != 0) {
            of.a(65, (byte) -5, -15);
        }
        field_Lb = null;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        ((of) this).field_qb = param5;
        ((of) this).field_eb = param6;
        ((of) this).field_gb = param4;
        if (param2 != -112) {
            field_Ob = 6;
        }
        ((of) this).field_Db = param1;
        this.a(param0, param3, false);
    }

    private final void a(int param0, int param1, boolean param2) {
        ((of) this).field_Sb.field_Db = ((of) this).field_Db;
        ((of) this).field_Rb.field_qb = 0;
        ((of) this).field_Sb.field_gb = -param1 + ((of) this).field_gb - param0;
        ((of) this).field_Rb.field_gb = ((of) this).field_gb - (param0 + param1);
        ((of) this).field_Mb.a(((of) this).field_Rb.field_Db, 0, ((of) this).field_Db, param0, -((of) this).field_Rb.field_eb, 8414, -param0 + ((of) this).field_gb, ((of) this).field_Sb.field_Db);
    }

    of(long param0, vh param1, vh param2, db param3) {
        super(param0, (vh) null);
        try {
            ((of) this).field_Sb = new vh(0L, param2);
            ((of) this).field_Mb = new db(0L, param3);
            ((of) this).a(-122, ((of) this).field_Sb);
            ((of) this).a(76, (vh) (Object) ((of) this).field_Mb);
            ((of) this).field_Rb = param1;
            ((of) this).field_Sb.a(-118, param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "of.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 != 0) {
            field_Ob = 7;
        }
        tp.field_h[0] = -140 + param2 * 280 / param0;
    }

    final static void a(byte param0, di param1) {
        int var2_int = 0;
        int var3 = Pool.field_O;
        try {
            for (var2_int = 0; nn.field_b.length > var2_int; var2_int++) {
                nn.field_b[var2_int].b(5, param1);
            }
            pn.field_l = new dd(param1.a(false, "menu-framed-background.jpg", ""), (java.awt.Component) (Object) pa.field_K);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "of.A(" + 27 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.a(param1, true, ((of) this).field_Sb.field_Db, param3, param2);
        if (param0 != -1207) {
            boolean discarded$0 = ((of) this).a(true, true, -121, (byte) -41, -22, -3);
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, int param4) {
        L0: {
          if (!((of) this).field_Mb.f(-4779)) {
            break L0;
          } else {
            ((of) this).field_Rb.field_E = ((of) this).field_Rb.field_E + param4;
            break L0;
          }
        }
        L1: {
          if (((of) this).field_Mb.i((byte) -62)) {
            ((of) this).field_Rb.field_E = ((of) this).field_Rb.field_E - param4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((of) this).field_Mb.j((byte) -63)) {
            ((of) this).field_Rb.field_E = ((of) this).field_Rb.field_E + param2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((of) this).field_Mb.g((byte) 127)) {
            ((of) this).field_Rb.field_E = ((of) this).field_Rb.field_E - param2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!((of) this).field_W) {
            break L4;
          } else {
            ((of) this).field_Rb.field_E = ((of) this).field_Rb.field_E - param0;
            break L4;
          }
        }
        L5: {
          if (!param3) {
            L6: {
              if (-(((of) this).field_Rb.field_E + ((of) this).field_Rb.field_eb) > -((of) this).field_Sb.field_Db + (((of) this).field_Rb.field_Cb + ((of) this).field_Rb.field_Db)) {
                ((of) this).field_Rb.field_E = -((of) this).field_Rb.field_eb + -(-((of) this).field_Sb.field_Db + ((of) this).field_Rb.field_Db + ((of) this).field_Rb.field_Cb);
                break L6;
              } else {
                break L6;
              }
            }
            if (-(((of) this).field_Rb.field_E + ((of) this).field_Rb.field_eb) >= 0) {
              break L5;
            } else {
              ((of) this).field_Rb.field_E = -((of) this).field_Rb.field_eb;
              break L5;
            }
          } else {
            L7: {
              if (-(((of) this).field_Rb.field_eb + ((of) this).field_Rb.field_E) < 0) {
                ((of) this).field_Rb.field_E = -((of) this).field_Rb.field_eb;
                break L7;
              } else {
                break L7;
              }
            }
            if (-(((of) this).field_Rb.field_eb - -((of) this).field_Rb.field_E) > ((of) this).field_Rb.field_Db - -((of) this).field_Rb.field_Cb - ((of) this).field_Sb.field_Db) {
              ((of) this).field_Rb.field_E = -(((of) this).field_Rb.field_Cb + (((of) this).field_Rb.field_Db - ((of) this).field_Sb.field_Db)) - ((of) this).field_Rb.field_eb;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L8: {
          if (((of) this).field_Mb.g(-92)) {
            ((of) this).field_Rb.field_eb = -((of) this).field_Mb.a(param3, ((of) this).field_Rb.field_Db, ((of) this).field_Sb.field_Db, 48);
            ((of) this).field_Rb.field_E = 0;
            break L8;
          } else {
            break L8;
          }
        }
        ((of) this).field_Mb.b(((of) this).field_Rb.field_Db, ((of) this).field_Sb.field_Db, false, -((of) this).field_Rb.field_eb);
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        int var5 = 0;
        aa var6 = null;
        lk var7 = null;
        int var8 = 0;
        dd var9 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ne.field_r.c(0)) {
              return;
            } else {
              var9 = ((lk) (Object) ne.field_r.c((byte) 104)).field_n;
              if (var9 != null) {
                qh.a(kg.field_t);
                var4 = var9.field_A;
                param2 = param2 - (var4 >> 1);
                qh.c(353, param2, 583, var4 + param2);
                var5 = 0;
                var6 = new aa(ne.field_r);
                var7 = (lk) (Object) var6.b((byte) -92);
                L1: while (true) {
                  L2: {
                    if (var7 == null) {
                      break L2;
                    } else {
                      if (null == var7.field_n) {
                        break L2;
                      } else {
                        var5 = (int)((double)var7.field_p + 0.5);
                        var8 = 0;
                        L3: while (true) {
                          L4: {
                            if (var8 >= var7.field_l) {
                              break L4;
                            } else {
                              if (var5 >= 230) {
                                break L4;
                              } else {
                                var7.field_n.c(var5 + 353, param2);
                                var5 = var5 + (4 + var7.field_n.field_z);
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var7 = (lk) (Object) var6.b(-85);
                          continue L1;
                        }
                      }
                    }
                  }
                  qh.b(kg.field_t);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "of.W(" + 353 + ',' + false + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "<%0> and <%1> are <%2>.";
        field_Tb = new hj(9, 0, 4, 1);
        field_Lb = new byte[]{(byte) 2, (byte) 0, (byte) 0, (byte) 0};
        field_Ub = "Rated game";
    }
}
