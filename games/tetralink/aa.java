/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hl {
    private int field_Mb;
    private oh[] field_Zb;
    static ei field_bc;
    private int field_Yb;
    static int field_Pb;
    private int[] field_Sb;
    static String field_Kb;
    private int field_Rb;
    private int field_Qb;
    private int field_Tb;
    private hl field_Ob;
    static int field_Nb;
    static int field_Vb;
    private nh[] field_Lb;
    private int field_ac;
    static ve field_Wb;
    private int field_Xb;
    private hl field_Ub;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        if (((aa) this).field_Rb != 0) {
          var6 = 0;
          var7 = 0;
          L0: while (true) {
            if (((aa) this).field_Rb <= var7) {
              var6 = var6 + 2 * ((aa) this).field_Tb;
              var7 = ((aa) this).field_Yb + ((aa) this).field_Yb + ((aa) this).field_Rb * ((aa) this).field_Xb;
              var8 = eo.a(var6, (byte) 123, param4, param0);
              var9 = mh.a(param3, param1, var7, -8748);
              ((aa) this).a((byte) -80, var6, var9, var7, var8);
              var10 = 0;
              if (param2 < -13) {
                L1: while (true) {
                  if (((aa) this).field_Rb > var10) {
                    ((aa) this).field_Lb[var10].b(0, var6 - 2 * ((aa) this).field_Tb, ((aa) this).field_Yb + var10 * ((aa) this).field_Xb, ((aa) this).field_Qb, ((aa) this).field_Tb, ((aa) this).field_Mb, ((aa) this).field_Xb);
                    var10++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              var8 = ((aa) this).field_Lb[var7].b(-26606, ((aa) this).field_Qb, ((aa) this).field_Mb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          L2: {
            ((aa) this).field_Lb[((aa) this).field_Rb] = new nh(0L, (hl) null, (hl) null, ((aa) this).field_Ob, (oh) null, field_Kb);
            ((aa) this).field_Lb[((aa) this).field_Rb].field_J = 1;
            ((aa) this).a((byte) -95, (hl) (Object) ((aa) this).field_Lb[((aa) this).field_Rb]);
            ((aa) this).field_Sb[((aa) this).field_Rb] = -1;
            ((aa) this).field_Rb = ((aa) this).field_Rb + 1;
            var6 = 0;
            var7 = 0;
            if (((aa) this).field_Rb <= var7) {
              break L2;
            } else {
              L3: {
                var8 = ((aa) this).field_Lb[var7].b(-26606, ((aa) this).field_Qb, ((aa) this).field_Mb);
                if (var6 >= var8) {
                  var7++;
                  break L3;
                } else {
                  var6 = var8;
                  break L3;
                }
              }
              var7++;
              var7++;
              var7++;
              break L2;
            }
          }
          var6 = var6 + 2 * ((aa) this).field_Tb;
          var7 = ((aa) this).field_Yb + ((aa) this).field_Yb + ((aa) this).field_Rb * ((aa) this).field_Xb;
          var8 = eo.a(var6, (byte) 123, param4, param0);
          var9 = mh.a(param3, param1, var7, -8748);
          ((aa) this).a((byte) -80, var6, var9, var7, var8);
          var10 = 0;
          if (param2 < -13) {
            L4: while (true) {
              if (((aa) this).field_Rb > var10) {
                ((aa) this).field_Lb[var10].b(0, var6 - 2 * ((aa) this).field_Tb, ((aa) this).field_Yb + var10 * ((aa) this).field_Xb, ((aa) this).field_Qb, ((aa) this).field_Tb, ((aa) this).field_Mb, ((aa) this).field_Xb);
                var10++;
                continue L4;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, oh param1, int param2, String param3) {
        ((aa) this).field_Lb[((aa) this).field_Rb] = new nh((long)param2, (hl) null, (hl) null, ((aa) this).field_Ub, param1, param3);
        ((aa) this).field_Lb[((aa) this).field_Rb].field_kb = ((aa) this).field_Zb;
        ((aa) this).field_Lb[((aa) this).field_Rb].field_Cb = true;
        ((aa) this).field_Lb[((aa) this).field_Rb].field_J = 1;
        ((aa) this).a((byte) 92, (hl) (Object) ((aa) this).field_Lb[((aa) this).field_Rb]);
        ((aa) this).field_Sb[((aa) this).field_Rb] = param0;
        ((aa) this).field_Rb = ((aa) this).field_Rb + 1;
    }

    final void a(String param0, int param1, int param2) {
        ((aa) this).field_Lb[((aa) this).field_Rb] = new nh(0L, (hl) null, (hl) null, ((aa) this).field_Ub, (oh) null, param0);
        ((aa) this).field_Lb[((aa) this).field_Rb].field_kb = ((aa) this).field_Zb;
        ((aa) this).field_Lb[((aa) this).field_Rb].field_Cb = true;
        ((aa) this).field_Lb[((aa) this).field_Rb].field_J = param1;
        ((aa) this).a((byte) -93, (hl) (Object) ((aa) this).field_Lb[((aa) this).field_Rb]);
        ((aa) this).field_Sb[((aa) this).field_Rb] = param2;
        ((aa) this).field_Rb = ((aa) this).field_Rb + 1;
    }

    public static void h(int param0) {
        if (param0 != -2) {
          field_Pb = 25;
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        } else {
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        }
    }

    final static void d(byte param0) {
        Object var2 = null;
        Object var3 = null;
        var3 = null;
        ve.a(-1, (String) null, pl.field_e);
        if (param0 >= 36) {
          return;
        } else {
          var2 = null;
          String discarded$2 = aa.a((String) null, -21, -48, (String) null);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TetraLink.field_J;
        if (param3 <= param0) {
          if (param5 <= param0) {
            if (param3 >= param5) {
              qi.a(param2, param1, (byte) 98, param4, param3, param0, ra.field_b, param5, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            } else {
              qi.a(param2, param4, (byte) 98, param1, param5, param0, ra.field_b, param3, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            }
          } else {
            qi.a(param1, param4, (byte) 98, param2, param0, param5, ra.field_b, param3, param6);
            if (param7 > 88) {
              return;
            } else {
              field_Vb = -56;
              return;
            }
          }
        } else {
          if (param5 <= param3) {
            if (param5 <= param0) {
              qi.a(param4, param1, (byte) 98, param2, param0, param3, ra.field_b, param5, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            } else {
              qi.a(param4, param2, (byte) 98, param1, param5, param3, ra.field_b, param0, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            }
          } else {
            qi.a(param1, param2, (byte) 98, param4, param3, param5, ra.field_b, param0, param6);
            if (param7 > 88) {
              return;
            } else {
              field_Vb = -56;
              return;
            }
          }
        }
    }

    aa(hl param0, oh[] param1, hl param2, hl param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((aa) this).field_Sb = new int[256];
        ((aa) this).field_Lb = new nh[256];
        ((aa) this).field_ac = -2;
        ((aa) this).field_Qb = param6;
        ((aa) this).field_Tb = param4;
        ((aa) this).field_Mb = param5;
        ((aa) this).field_Xb = param8;
        ((aa) this).field_Ub = param3;
        ((aa) this).field_Yb = param7;
        ((aa) this).field_Ob = param2;
        ((aa) this).field_Zb = param1;
    }

    final boolean e(byte param0) {
        if (((aa) this).field_ac != -2) {
          return false;
        } else {
          if (dg.field_e != 13) {
            if (param0 != -87) {
              return false;
            } else {
              return true;
            }
          } else {
            ((aa) this).field_ac = -1;
            if (param0 != -87) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final static String a(String param0, int param1, int param2, String param3) {
        CharSequence var8 = (CharSequence) (Object) param0;
        if (!(gi.a(false, var8))) {
            return uk.field_u;
        }
        if (ji.field_Tb != param2) {
            return uf.field_a;
        }
        ud var7 = fh.a(param2 ^ -32053, param3);
        if (var7 == null) {
            return sk.a(new String[1], am.field_e, 121);
        }
        var7.b(false);
        var7.e(0);
        ca.field_c = ca.field_c - 1;
        bc var5 = nd.field_Lb;
        var5.f(param1, (byte) -92);
        var5.field_t = var5.field_t + 1;
        int var6 = var5.field_t;
        var5.a(3, false);
        var5.a(param0, 0);
        var5.b(-var6 + var5.field_t, param2 + -4);
        return null;
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        ((aa) this).a(0, param0);
        if (!param0) {
          return -2;
        } else {
          if (param1 <= -90) {
            var3 = 0;
            L0: while (true) {
              if (((aa) this).field_Rb <= var3) {
                if (-1 != tm.field_t) {
                  return -1;
                } else {
                  return ((aa) this).field_ac;
                }
              } else {
                if (-1 == ((aa) this).field_Lb[var3].field_F) {
                  var3++;
                  continue L0;
                } else {
                  return ((aa) this).field_Sb[var3];
                }
              }
            }
          } else {
            field_Kb = null;
            var3 = 0;
            L1: while (true) {
              if (((aa) this).field_Rb <= var3) {
                if (-1 != tm.field_t) {
                  return -1;
                } else {
                  return ((aa) this).field_ac;
                }
              } else {
                if (-1 == ((aa) this).field_Lb[var3].field_F) {
                  var3++;
                  continue L1;
                } else {
                  return ((aa) this).field_Sb[var3];
                }
              }
            }
          }
        }
    }

    aa(aa param0) {
        this((hl) (Object) param0, param0.field_Zb, param0.field_Ob, param0.field_Ub, param0.field_Tb, param0.field_Mb, param0.field_Qb, param0.field_Yb, param0.field_Xb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "No options available";
        field_Nb = 0;
    }
}
