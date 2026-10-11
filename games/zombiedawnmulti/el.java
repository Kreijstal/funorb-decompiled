/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends rg {
    private String field_J;
    private int field_I;
    private boolean field_K;
    private int field_L;
    private int field_F;
    static int field_M;
    static ri field_E;
    private fm field_G;
    static ja[] field_H;

    final static ja[] a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        ja var13 = null;
        ja var14 = null;
        int[] var16 = oo.field_i;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = oo.field_b;
        int var8 = oo.field_l;
        ja var9 = new ja(16, param0);
        var9.a();
        oo.a(param2, 0, 16, param0, param1, param3);
        Object var10 = null;
        Object var11 = null;
        if (param5) {
          var13 = var9.c();
          var10 = var13;
          var13.a();
          oo.b(0, 0, 5, 0);
          oo.b(0, 1, 3, 0);
          oo.b(0, 2, 2, 0);
          oo.b(0, 3, 1, 0);
          oo.b(0, 4, 1, 0);
        }
        if (param4) {
          var14 = var9.c();
          var11 = var14;
          var14.a();
          oo.b(11, 0, 5, 0);
          oo.b(13, 1, 3, 0);
          oo.b(14, 2, 2, 0);
          oo.b(15, 3, 1, 0);
          oo.b(15, 4, 1, 0);
        }
        oo.a(var16, var7, var8);
        return new ja[]{null, null, null, (ja) (var10), var9, (ja) (var11), null, null, null};
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param9) {
          if (param9) {
            ck.field_a = ho.field_m;
            ui.a((byte) -109, param9);
            if (mh.field_h > 0) {
              ko.a(param4, param7, false, param9);
            }
            eb.field_B.field_R = 1;
            eb.field_B.field_V = qc.field_u.field_V;
            if (sq.field_Q > 0) {
              gg.a(param7, param4, param9, true);
            }
            if (0 < da.field_a) {
              so.a(param3 ^ 48, param4, param9, param1, param7);
            }
            if (io.field_b &&
              mh.field_c.field_mc <= mh.field_c.field_cc) {
              pd.field_b.field_Z = false;
              hf.field_e.field_Jb.field_wb = ka.field_p;
              ob.a(hf.field_e.field_Gb, 97);
            } else {
              hf.field_e.field_Jb.field_wb = null;
              pd.field_b.field_Z = true;
              vi.a(param2, param7, (byte) 45, hf.field_e, param6);
            }
          } else {
            ck.field_a = (-640 + kp.field_l) / 2;
            ui.a((byte) -109, param9);
            if (mh.field_h > 0) {
              ko.a(param4, param7, false, param9);
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q > 0) {
                gg.a(param7, param4, param9, true);
              }
              if (0 < da.field_a) {
                so.a(param3 ^ 48, param4, param9, param1, param7);
              }
              if (io.field_b &&
                mh.field_c.field_mc <= mh.field_c.field_cc) {
                pd.field_b.field_Z = false;
                hf.field_e.field_Jb.field_wb = ka.field_p;
                ob.a(hf.field_e.field_Gb, 97);
              } else {
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
              }
            } else {
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q > 0) {
                gg.a(param7, param4, param9, true);
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                }
                if (io.field_b &&
                  mh.field_c.field_mc <= mh.field_c.field_cc) {
                  pd.field_b.field_Z = false;
                  hf.field_e.field_Jb.field_wb = ka.field_p;
                  ob.a(hf.field_e.field_Gb, 97);
                } else {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                }
              } else {
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                }
                if (!io.field_b) {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                } else {
                  if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                  } else {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  }
                }
              }
            }
          }
        } else {
          if (kp.field_l == oo.field_b) {
            if (oo.field_l != dm.field_Qb &&
              oo.field_l == dl.field_h.field_f &&
              dl.field_h.field_h == oo.field_b) {
              if (null != mh.field_c) {
                ci.a(false, -83);
              } else {
                if (ej.field_n != null) {
                  ci.a(true, -51);
                } else {
                  wn.a((byte) 3);
                }
              }
            }
            if (param9) {
              ck.field_a = ho.field_m;
              ui.a((byte) -109, param9);
              if (mh.field_h > 0) {
                ko.a(param4, param7, false, param9);
              }
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q > 0) {
                gg.a(param7, param4, param9, true);
              }
              if (0 < da.field_a) {
                so.a(param3 ^ 48, param4, param9, param1, param7);
              }
              if (io.field_b &&
                mh.field_c.field_mc <= mh.field_c.field_cc) {
                pd.field_b.field_Z = false;
                hf.field_e.field_Jb.field_wb = ka.field_p;
                ob.a(hf.field_e.field_Gb, 97);
              } else {
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
              }
            } else {
              ck.field_a = (-640 + kp.field_l) / 2;
              ui.a((byte) -109, param9);
              if (mh.field_h > 0) {
                ko.a(param4, param7, false, param9);
              }
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q > 0) {
                gg.a(param7, param4, param9, true);
              }
              if (0 < da.field_a) {
                so.a(param3 ^ 48, param4, param9, param1, param7);
              }
              if (!io.field_b) {
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
              } else {
                if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                  pd.field_b.field_Z = false;
                  hf.field_e.field_Jb.field_wb = ka.field_p;
                  ob.a(hf.field_e.field_Gb, 97);
                } else {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                }
              }
            }
          } else {
            if (oo.field_l == dl.field_h.field_f &&
              dl.field_h.field_h == oo.field_b) {
              if (null != mh.field_c) {
                ci.a(false, -83);
              } else {
                if (ej.field_n != null) {
                  ci.a(true, -51);
                } else {
                  wn.a((byte) 3);
                }
              }
            }
            if (param9) {
              ck.field_a = ho.field_m;
              ui.a((byte) -109, param9);
              if (mh.field_h > 0) {
                ko.a(param4, param7, false, param9);
              }
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q > 0) {
                gg.a(param7, param4, param9, true);
              }
              if (0 < da.field_a) {
                so.a(param3 ^ 48, param4, param9, param1, param7);
              }
              if (io.field_b &&
                mh.field_c.field_mc <= mh.field_c.field_cc) {
                pd.field_b.field_Z = false;
                hf.field_e.field_Jb.field_wb = ka.field_p;
                ob.a(hf.field_e.field_Gb, 97);
              } else {
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
              }
            } else {
              ck.field_a = (-640 + kp.field_l) / 2;
              ui.a((byte) -109, param9);
              if (mh.field_h > 0) {
                ko.a(param4, param7, false, param9);
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q > 0) {
                  gg.a(param7, param4, param9, true);
                }
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                }
                if (io.field_b &&
                  mh.field_c.field_mc <= mh.field_c.field_cc) {
                  pd.field_b.field_Z = false;
                  hf.field_e.field_Jb.field_wb = ka.field_p;
                  ob.a(hf.field_e.field_Gb, 97);
                } else {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                }
              } else {
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q > 0) {
                  gg.a(param7, param4, param9, true);
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                  }
                  if (io.field_b &&
                    mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                  } else {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  }
                } else {
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                  }
                  if (!io.field_b) {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  } else {
                    if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                      pd.field_b.field_Z = false;
                      hf.field_e.field_Jb.field_wb = ka.field_p;
                      ob.a(hf.field_e.field_Gb, 97);
                    } else {
                      hf.field_e.field_Jb.field_wb = null;
                      pd.field_b.field_Z = true;
                      vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    }
                  }
                }
              }
            }
          }
        }
        og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
        vi.a(param2, param7, (byte) 45, bf.field_n, param6);
        if (param3 != 2) {
          return;
        }
        qj.field_i = qj.field_i + 1;
    }

    final String d(byte param0) {
        int var2 = this.field_B.field_l ? 1 : 0;
        this.field_B.field_l = this.field_l;
        String var3 = this.field_B.d((byte) -84);
        this.field_B.field_l = var2 != 0 ? true : false;
        int var4 = -127 % ((53 - param0) / 57);
        return var3;
    }

    public static void h(int param0) {
        field_E = null;
        field_H = null;
        if (param0 != 3) {
          field_H = (ja[]) null;
        }
    }

    final static mf b(boolean param0) {
        try {
          Throwable var1 = null;
          mf stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0) {
              el.b(true);
            }
            stackIn_3_0 = (mf) (Class.forName("ue").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = param3 + this.field_y;
        int var6 = param1 + this.field_i;
        int var7Lifetime1;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        if (param0 == -2) {
          var7 = this.field_K ? -this.field_L + this.field_n - this.field_I * 2 : 0;
          this.field_G.a(this.field_J, this.field_I + (var7 + var5), this.field_I + var6, -this.field_I + this.field_L, -(2 * this.field_I) + this.field_w, this.field_F, -1, this.field_K ? 0 : 2, 1, this.field_G.field_C);
          return;
        }
        this.d((byte) 56);
        var7Lifetime1 = this.field_K ? -this.field_L + this.field_n - this.field_I * 2 : 0;
        this.field_G.a(this.field_J, this.field_I + (var7Lifetime1 + var5), this.field_I + var6, -this.field_I + this.field_L, -(2 * this.field_I) + this.field_w, this.field_F, -1, this.field_K ? 0 : 2, 1, this.field_G.field_C);
    }

    el(int param0, int param1, int param2, int param3, cf param4, boolean param5, int param6, int param7, fm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nl) null, (bj) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_I = param7;
          this.field_B = param4;
          this.field_L = param6;
          this.field_J = param10;
          this.field_G = param8;
          stackIn_4_1 = (param5);
          this.field_K = stackIn_4_1;
          this.field_F = param9;
          var12_int = -this.field_I + this.field_L;
          var13 = this.field_G.a(param10, var12_int, this.field_G.field_C) + 2 * this.field_I;
          if (param3 < var13) {
            this.b(param0, param1, 28972, param2, var13);
          } else {
            var13 = param3;
          }
          if (!this.field_K) {
            stackIn_10_0 = this.field_I * 2 + this.field_L;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_B.b(var14, (-param3 + var13 >> 1) + this.field_I, 28972, param2 - this.field_L - this.field_I * 3, -(this.field_I * 2) + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("el.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_M = 2;
    }
}
