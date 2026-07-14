/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends ofa implements tsa {
    private ae field_L;
    private rj field_N;
    static jpa field_O;
    private rj field_M;
    private long field_P;

    final static void a(cn param0, int param1, int[] param2, byte[] param3, cn param4, String[][] param5, int param6, iu[][] param7, boolean param8, int param9, String[][] param10, cn param11, byte[] param12, String[] param13, iu[][] param14) {
        if (param1 != 10) {
            field_O = null;
        }
        Object var17 = null;
        Object var16 = null;
        ta.a(param14, param10, (int[]) null, param6, param0, param9, (hja[]) null, param3, param12, param5, param13, param11, (byte) 116, param2, param7, param4, param8);
    }

    op(jta param0) {
        super(param0, 200, 200);
        ((op) this).field_P = bva.b((byte) -107);
        ae var3 = new ae(rfa.field_B, (qc) null);
        var3.field_m = ((op) this).field_m;
        var3.field_p = 100;
        var3.field_n = 50;
        var3.field_i = 0;
        var3.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((op) this).a(var3, -1);
        ((op) this).field_L = new ae(rfa.field_B, (qc) null);
        ((op) this).field_L.field_i = 0;
        ((op) this).field_L.field_n = 20 + var3.field_n + var3.field_p;
        ((op) this).field_L.field_m = ((op) this).field_m;
        ((op) this).field_L.field_p = 80;
        ((op) this).field_L.field_r = (isa) (Object) new vpa(ft.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((op) this).a(((op) this).field_L, -1);
        ((op) this).field_N = this.a((qc) this, 77, vc.field_s);
        ((op) this).field_M = this.a((qc) this, 71, mha.field_F);
    }

    private final void i(byte param0) {
        if (!(((op) this).field_B)) {
            return;
        }
        ((op) this).field_B = false;
        if (param0 != 109) {
            this.i((byte) 120);
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 > 44) {
          if (param2 != ((op) this).field_N) {
            if (param2 == ((op) this).field_M) {
              og.b(0);
              this.i((byte) 109);
              return;
            } else {
              return;
            }
          } else {
            this.i((byte) 109);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5 = 0;
        if (param3) {
          var5 = param2;
          if ((var5 ^ -1) != -100) {
            if ((var5 ^ -1) == -99) {
              boolean discarded$4 = ((op) this).field_N.a((ae) this, false);
              return true;
            } else {
              return super.a(param0, param1, param2, param3);
            }
          } else {
            boolean discarded$5 = ((op) this).field_M.a((ae) this, false);
            return true;
          }
        } else {
          return false;
        }
    }

    private final rj a(qc param0, int param1, String param2) {
        rj var4 = null;
        int var5 = 0;
        var4 = new rj(param2, param0);
        var4.field_r = (isa) (Object) new td();
        var5 = -6 + ((op) this).field_p;
        ((op) this).field_p = ((op) this).field_p + 38;
        if (param1 <= 34) {
          return null;
        } else {
          var4.a((byte) -31, -30 + ((op) this).field_m, 30, 15, var5);
          ((op) this).a((ae) (Object) var4, -1);
          ((op) this).c((byte) -54);
          return var4;
        }
    }

    final static short[] a(short[] param0, int param1, int param2) {
        short[] var3 = null;
        short[] var4 = null;
        var4 = new short[param2];
        var3 = var4;
        lua.a(param0, 0, var4, 0, param2);
        if (param1 <= 104) {
          op.a((cn) null, 63, (int[]) null, (byte[]) null, (cn) null, (String[][]) null, 112, (iu[][]) null, true, 103, (String[][]) null, (cn) null, (byte[]) null, (String[]) null, (iu[][]) null);
          return var4;
        } else {
          return var4;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        long var5 = 0L;
        int var7 = 0;
        super.a(param0, param1, param2, param3);
        if (!qma.field_c) {
          var5 = -((op) this).field_P + bva.b((byte) -107);
          var7 = (int)((-var5 + 10999L) / 1000L);
          if (0 >= var7) {
            L0: {
              og.b(0);
              this.i((byte) 109);
              ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, uq.field_b), 120);
              if (!((op) this).field_B) {
                break L0;
              } else {
                if (null != dq.field_f) {
                  break L0;
                } else {
                  this.i((byte) 109);
                  ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 102);
                  if (null != dq.field_f) {
                    if (!dq.field_f.field_b) {
                      return;
                    } else {
                      this.i((byte) 109);
                      ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (null != dq.field_f) {
              if (dq.field_f.field_b) {
                this.i((byte) 109);
                ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              ((op) this).field_L.field_o = "" + var7;
              if (!((op) this).field_B) {
                break L1;
              } else {
                if (null != dq.field_f) {
                  break L1;
                } else {
                  this.i((byte) 109);
                  ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 102);
                  if (null != dq.field_f) {
                    if (dq.field_f.field_b) {
                      this.i((byte) 109);
                      ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
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
            if (null != dq.field_f) {
              if (!dq.field_f.field_b) {
                return;
              } else {
                this.i((byte) 109);
                ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: {
            param2.f((byte) 64);
            var5 = -((op) this).field_P + bva.b((byte) -107);
            var7 = (int)((-var5 + 10999L) / 1000L);
            if (0 >= var7) {
              og.b(0);
              this.i((byte) 109);
              ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, uq.field_b), 120);
              break L2;
            } else {
              ((op) this).field_L.field_o = "" + var7;
              break L2;
            }
          }
          if (((op) this).field_B) {
            if (null == dq.field_f) {
              this.i((byte) 109);
              ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 102);
              if (null != dq.field_f) {
                if (!dq.field_f.field_b) {
                  return;
                } else {
                  this.i((byte) 109);
                  ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (null != dq.field_f) {
                if (dq.field_f.field_b) {
                  this.i((byte) 109);
                  ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null != dq.field_f) {
              if (dq.field_f.field_b) {
                this.i((byte) 109);
                ((op) this).field_z.c((ae) (Object) new gga(((op) this).field_z, or.field_j), 85);
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

    public static void f(int param0) {
        int var1 = 16 % ((param0 - 7) / 48);
        field_O = null;
    }

    static {
    }
}
