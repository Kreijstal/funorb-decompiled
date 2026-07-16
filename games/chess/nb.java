/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ci {
    static String field_Gb;
    ci field_Jb;
    static ci field_Ib;
    ci field_Kb;
    static String field_Hb;
    pd field_Eb;
    static wg field_Fb;

    public static void f(byte param0) {
        field_Ib = null;
        if (param0 != -33) {
          nb.a(false);
          field_Gb = null;
          field_Fb = null;
          field_Hb = null;
          return;
        } else {
          field_Gb = null;
          field_Fb = null;
          field_Hb = null;
          return;
        }
    }

    nb(long param0, ci param1, ci param2, pd param3) {
        super(param0, (ci) null);
        ((nb) this).field_Jb = new ci(0L, param2);
        ((nb) this).field_Eb = new pd(0L, param3);
        ((nb) this).a((byte) 124, ((nb) this).field_Jb);
        ((nb) this).a((byte) 123, (ci) (Object) ((nb) this).field_Eb);
        ((nb) this).field_Kb = param1;
        ((nb) this).field_Jb.a((byte) 127, param1);
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        if (param3 == -1) {
          if (!param5) {
            if (((nb) this).field_F) {
              if (param1) {
                var8 = 0;
                ((nb) this).field_Kb.a(param0, ((nb) this).field_Jb.field_pb, var8 != 0, -99);
                this.a(false, 50, param4, param2, param6);
                return var8 != 0;
              } else {
                var8 = 1;
                ((nb) this).field_Kb.a(param0, ((nb) this).field_Jb.field_pb, var8 != 0, -99);
                this.a(false, 50, param4, param2, param6);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              ((nb) this).field_Kb.a(param0, ((nb) this).field_Jb.field_pb, var8 != 0, -99);
              this.a(false, 50, param4, param2, param6);
              return var8 != 0;
            }
          } else {
            var8 = 1;
            ((nb) this).field_Kb.a(param0, ((nb) this).field_Jb.field_pb, var8 != 0, -99);
            this.a(false, 50, param4, param2, param6);
            return var8 != 0;
          }
        } else {
          return false;
        }
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param5 != 0) {
          ((nb) this).a((byte) -56, 102, false, -69);
          return this.a(param2, param1, param3, param5 ^ -1, param4, param0, ((nb) this).field_Jb.field_pb);
        } else {
          return this.a(param2, param1, param3, param5 ^ -1, param4, param0, ((nb) this).field_Jb.field_pb);
        }
    }

    final static void b(int param0, int param1) {
        Object var3 = null;
        qe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        var7 = Chess.field_G;
        if (null != uh.i(23156)) {
          L0: {
            var3 = null;
            uh.i(23156).field_t.f(field_Fb.field_y, -1);
            var4 = uh.i(param0 ^ 23156).field_t.field_K;
            if (var4 == null) {
              var5 = -1;
              break L0;
            } else {
              if (!((uk) (Object) var4).a((byte) 61, 4096)) {
                if (((uk) (Object) var4).a((byte) 61, 0)) {
                  var5 = 1;
                  break L0;
                } else {
                  if (!uh.i(param0 ^ 23156).field_B.field_d) {
                    var5 = -1;
                    break L0;
                  } else {
                    var5 = eg.a(uh.i(param0 + 23156).field_B.field_l, param0 + 0, uh.i(23156).field_B.field_k);
                    break L0;
                  }
                }
              } else {
                var5 = 0;
                break L0;
              }
            }
          }
          var6 = var5;
          if (-1 != (var6 ^ -1)) {
            if (-2 != (var6 ^ -1)) {
              if (0 == (var6 ^ -1)) {
                var10 = pe.field_d;
                wb.a(21, param1 + -3, 198, 96, 6, 1, 170);
                var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
                v.field_j.b(var10, 120, var6, 16777215, -1);
                if (var3 == null) {
                  if (param0 == 0) {
                    return;
                  } else {
                    field_Fb = null;
                    return;
                  }
                } else {
                  jj.field_b.b((String) var3, 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
                  if (param0 != 0) {
                    field_Fb = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if ((var6 ^ -1) != 2) {
                  var12 = pe.field_d;
                  wb.a(21, param1 + -3, 198, 96, 6, 1, 170);
                  var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
                  v.field_j.b(var12, 120, var6, 16777215, -1);
                  if (var3 == null) {
                    if (param0 == 0) {
                      return;
                    } else {
                      field_Fb = null;
                      return;
                    }
                  } else {
                    jj.field_b.b((String) var3, 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
                    if (param0 == 0) {
                      return;
                    } else {
                      field_Fb = null;
                      return;
                    }
                  }
                } else {
                  var11 = ok.field_Nb;
                  wb.a(21, param1 + -3, 198, 96, 6, 1, 170);
                  var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
                  v.field_j.b(var11, 120, var6, 16777215, -1);
                  if (var3 == null) {
                    if (param0 == 0) {
                      return;
                    } else {
                      field_Fb = null;
                      return;
                    }
                  } else {
                    jj.field_b.b((String) var3, 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
                    if (param0 == 0) {
                      return;
                    } else {
                      field_Fb = null;
                      return;
                    }
                  }
                }
              }
            } else {
              L1: {
                var9 = he.field_Eb;
                wb.a(21, param1 + -3, 198, 96, 6, 1, 170);
                var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
                v.field_j.b(var9, 120, var6, 16777215, -1);
                if (var3 == null) {
                  break L1;
                } else {
                  jj.field_b.b((String) var3, 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
                  break L1;
                }
              }
              if (param0 == 0) {
                return;
              } else {
                field_Fb = null;
                return;
              }
            }
          } else {
            var8 = kl.field_l;
            wb.a(21, param1 + -3, 198, 96, 6, 1, 170);
            var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
            v.field_j.b(var8, 120, var6, 16777215, -1);
            if (var3 != null) {
              L2: {
                jj.field_b.b((String) var3, 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
                if (param0 == 0) {
                  break L2;
                } else {
                  field_Fb = null;
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  field_Fb = null;
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          if (param0 == 0) {
            return;
          } else {
            field_Fb = null;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((nb) this).field_V = param2;
        ((nb) this).field_mb = param5;
        ((nb) this).field_pb = param1;
        ((nb) this).field_M = param6;
        this.a(param4, (byte) -20, param0);
        if (param3 != -3) {
            nb.f((byte) 26);
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        nk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ac var11 = null;
        nk var12 = null;
        bk var13 = null;
        int[] var14 = null;
        bk var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var8 = Chess.field_G;
        var12 = tk.field_h;
        var2 = var12.i(-86);
        if (param0) {
          if (var2 == 0) {
            var10 = in.a((byte) 20);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((p) (Object) var5).i(-107);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var15 = (bk) (Object) bh.field_D.g(-18110);
                if (var15 == null) {
                  si.d(65280);
                  return;
                } else {
                  var15.field_j = var18[0];
                  var15.field_o = var3;
                  var15.field_m = true;
                  var15.c(-2193);
                  return;
                }
              } else {
                var9[var7] = ((p) (Object) var5).e((byte) -99);
                var7++;
                continue L0;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              if (-3 == (var2 ^ -1)) {
                var13 = (bk) (Object) bh.field_D.g(-18110);
                if (var13 == null) {
                  si.d(65280);
                  return;
                } else {
                  var13.field_o = in.a((byte) 20);
                  var13.field_j = var13.field_o[0];
                  var13.field_m = true;
                  var13.c(-2193);
                  return;
                }
              } else {
                fg.a((Throwable) null, (byte) -77, "A1: " + tm.b((byte) -122));
                si.d(65280);
                return;
              }
            } else {
              var11 = (ac) (Object) vn.field_vb.g(-18110);
              if (var11 == null) {
                si.d(65280);
                return;
              } else {
                var11.c(-2193);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        ((nb) this).field_Kb.field_mb = 0;
        if (param1 != -20) {
          return;
        } else {
          ((nb) this).field_Jb.field_pb = ((nb) this).field_pb;
          ((nb) this).field_Jb.field_M = ((nb) this).field_M + -param0 + -param2;
          ((nb) this).field_Kb.field_M = ((nb) this).field_M - (param0 + param2);
          ((nb) this).field_Eb.a(((nb) this).field_pb, ((nb) this).field_Kb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Jb.field_pb, -param0 + ((nb) this).field_M, 0, (byte) -65, param0);
          return;
        }
    }

    final void a(byte param0, int param1, boolean param2, int param3) {
        this.a(param2, 114, param1, param3, ((nb) this).field_Jb.field_pb);
        if (param0 > -71) {
            field_Fb = null;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          if (((nb) this).field_Eb.k(3384)) {
            ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb + param2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((nb) this).field_Eb.f((byte) -38)) {
            ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb - param2;
            break L1;
          } else {
            break L1;
          }
        }
        if (!((nb) this).field_Eb.o(25708)) {
          L2: {
            if (((nb) this).field_Eb.l(0)) {
              ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb - param4;
              break L2;
            } else {
              break L2;
            }
          }
          var6 = -78 / ((param1 - -45) / 38);
          if (!((nb) this).field_F) {
            L3: {
              if (param0) {
                if (-1 >= (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                  if (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb >= -(((nb) this).field_Kb.field_V + ((nb) this).field_Kb.field_vb)) {
                    break L3;
                  } else {
                    ((nb) this).field_Kb.field_vb = -(((nb) this).field_Kb.field_N + (((nb) this).field_Kb.field_pb - ((nb) this).field_Jb.field_pb)) - ((nb) this).field_Kb.field_V;
                    if (((nb) this).field_Eb.m(2)) {
                      ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                      ((nb) this).field_Kb.field_vb = 0;
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    } else {
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    }
                  }
                } else {
                  ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                  if (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb >= -(((nb) this).field_Kb.field_V + ((nb) this).field_Kb.field_vb)) {
                    if (((nb) this).field_Eb.m(2)) {
                      ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                      ((nb) this).field_Kb.field_vb = 0;
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    } else {
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    }
                  } else {
                    ((nb) this).field_Kb.field_vb = -(((nb) this).field_Kb.field_N + (((nb) this).field_Kb.field_pb - ((nb) this).field_Jb.field_pb)) - ((nb) this).field_Kb.field_V;
                    if (((nb) this).field_Eb.m(2)) {
                      ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                      ((nb) this).field_Kb.field_vb = 0;
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    } else {
                      ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  if (-(((nb) this).field_Kb.field_V - -((nb) this).field_Kb.field_vb) > ((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb) {
                    ((nb) this).field_Kb.field_vb = -(-((nb) this).field_Jb.field_pb + (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb)) - ((nb) this).field_Kb.field_V;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (-1 >= (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                  break L3;
                } else {
                  ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                  if (((nb) this).field_Eb.m(2)) {
                    ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                    ((nb) this).field_Kb.field_vb = 0;
                    ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                    return;
                  } else {
                    ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                    return;
                  }
                }
              }
            }
            if (((nb) this).field_Eb.m(2)) {
              ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
              ((nb) this).field_Kb.field_vb = 0;
              ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
              return;
            } else {
              ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
              return;
            }
          } else {
            L5: {
              ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb - param3;
              if (param0) {
                if (-1 < (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                  ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                  if (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb >= -(((nb) this).field_Kb.field_V + ((nb) this).field_Kb.field_vb)) {
                    break L5;
                  } else {
                    L6: {
                      ((nb) this).field_Kb.field_vb = -(((nb) this).field_Kb.field_N + (((nb) this).field_Kb.field_pb - ((nb) this).field_Jb.field_pb)) - ((nb) this).field_Kb.field_V;
                      if (!((nb) this).field_Eb.m(2)) {
                        break L6;
                      } else {
                        ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                        ((nb) this).field_Kb.field_vb = 0;
                        break L6;
                      }
                    }
                    ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                    return;
                  }
                } else {
                  L7: {
                    if (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb >= -(((nb) this).field_Kb.field_V + ((nb) this).field_Kb.field_vb)) {
                      break L7;
                    } else {
                      ((nb) this).field_Kb.field_vb = -(((nb) this).field_Kb.field_N + (((nb) this).field_Kb.field_pb - ((nb) this).field_Jb.field_pb)) - ((nb) this).field_Kb.field_V;
                      break L7;
                    }
                  }
                  L8: {
                    if (!((nb) this).field_Eb.m(2)) {
                      break L8;
                    } else {
                      ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                      ((nb) this).field_Kb.field_vb = 0;
                      break L8;
                    }
                  }
                  ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                  return;
                }
              } else {
                L9: {
                  if (-(((nb) this).field_Kb.field_V - -((nb) this).field_Kb.field_vb) > ((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb) {
                    ((nb) this).field_Kb.field_vb = -(-((nb) this).field_Jb.field_pb + (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb)) - ((nb) this).field_Kb.field_V;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 < (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                  ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                  break L5;
                } else {
                  L10: {
                    if (!((nb) this).field_Eb.m(2)) {
                      break L10;
                    } else {
                      ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
                      ((nb) this).field_Kb.field_vb = 0;
                      break L10;
                    }
                  }
                  ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
                  return;
                }
              }
            }
            if (((nb) this).field_Eb.m(2)) {
              ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
              ((nb) this).field_Kb.field_vb = 0;
              ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
              return;
            } else {
              ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
              return;
            }
          }
        } else {
          L11: {
            ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb + param4;
            if (((nb) this).field_Eb.l(0)) {
              ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb - param4;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            var6 = -78 / ((param1 - -45) / 38);
            if (!((nb) this).field_F) {
              break L12;
            } else {
              ((nb) this).field_Kb.field_vb = ((nb) this).field_Kb.field_vb - param3;
              break L12;
            }
          }
          L13: {
            if (param0) {
              L14: {
                if (-1 >= (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                  break L14;
                } else {
                  ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                  break L14;
                }
              }
              if (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb >= -(((nb) this).field_Kb.field_V + ((nb) this).field_Kb.field_vb)) {
                break L13;
              } else {
                ((nb) this).field_Kb.field_vb = -(((nb) this).field_Kb.field_N + (((nb) this).field_Kb.field_pb - ((nb) this).field_Jb.field_pb)) - ((nb) this).field_Kb.field_V;
                break L13;
              }
            } else {
              L15: {
                if (-(((nb) this).field_Kb.field_V - -((nb) this).field_Kb.field_vb) > ((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb + -((nb) this).field_Jb.field_pb) {
                  ((nb) this).field_Kb.field_vb = -(-((nb) this).field_Jb.field_pb + (((nb) this).field_Kb.field_N + ((nb) this).field_Kb.field_pb)) - ((nb) this).field_Kb.field_V;
                  break L15;
                } else {
                  break L15;
                }
              }
              if (-1 >= (-(((nb) this).field_Kb.field_vb + ((nb) this).field_Kb.field_V) ^ -1)) {
                break L13;
              } else {
                ((nb) this).field_Kb.field_vb = -((nb) this).field_Kb.field_V;
                break L13;
              }
            }
          }
          L16: {
            if (!((nb) this).field_Eb.m(2)) {
              break L16;
            } else {
              ((nb) this).field_Kb.field_V = -((nb) this).field_Eb.b(-1, ((nb) this).field_Kb.field_pb, param0, ((nb) this).field_Jb.field_pb);
              ((nb) this).field_Kb.field_vb = 0;
              break L16;
            }
          }
          ((nb) this).field_Eb.a(true, ((nb) this).field_Jb.field_pb, -((nb) this).field_Kb.field_V, ((nb) this).field_Kb.field_pb);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "Respect";
        field_Hb = "Your ignore list is full. Max of 100 hit.";
    }
}
