/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ana {
    static long field_v;
    private boolean field_y;
    private fna field_x;
    private ad[] field_z;
    private boolean field_w;

    final boolean c(byte param0) {
        int var2 = 0;
        int var4 = 0;
        ad var5 = null;
        int var6 = 0;
        ad[] var7 = null;
        int var8 = 0;
        ad[] var9 = null;
        ad var10 = null;
        ad var11 = null;
        var6 = BachelorFridge.field_y;
        if (!((om) this).field_m.a((byte) -106)) {
          if (!((om) this).field_y) {
            L0: {
              if (((om) this).field_w) {
                break L0;
              } else {
                ((om) this).field_w = true;
                aba.a((byte) -96, 60);
                break L0;
              }
            }
            var2 = 1;
            var7 = ((om) this).field_z;
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= var7.length) {
                if (var2 == 0) {
                  return false;
                } else {
                  this.e(2147483647);
                  var2 = 108 % ((71 - param0) / 47);
                  return false;
                }
              } else {
                var11 = var7[var8];
                var5 = var11;
                var11.field_p = var11.field_p + 2;
                if (0 <= var11.field_p) {
                  var5.field_p = 0;
                  var8++;
                  continue L1;
                } else {
                  var2 = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L2: {
              if (!((om) this).field_w) {
                ((om) this).field_w = true;
                aba.a((byte) 122, 60);
                break L2;
              } else {
                break L2;
              }
            }
            var2 = 1;
            var9 = ((om) this).field_z;
            var4 = 0;
            L3: while (true) {
              if (var4 >= var9.length) {
                if (var2 == 0) {
                  return false;
                } else {
                  this.d(0);
                  return true;
                }
              } else {
                var10 = var9[var4];
                var10.field_p = var10.field_p + 2;
                if (-257 < (var10.field_p ^ -1)) {
                  var2 = 0;
                  var4++;
                  continue L3;
                } else {
                  var10.field_p = 256;
                  var4++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        ad[] var6 = ((om) this).field_z;
        ad[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_p = 0;
        }
    }

    om(gj param0, fna param1) {
        super(param0, (bca) (Object) param1);
        ((om) this).field_w = false;
        ((om) this).field_x = param1;
        int var3 = ((om) this).field_x.field_o.g(0);
        ((om) this).field_z = new ad[var3];
        cn var4 = (cn) (Object) ((om) this).field_x.field_o.b((byte) 90);
        int var5 = 0;
        int var7 = 0;
        var5 = var7;
        while (var4 != null) {
            ((om) this).field_z[var7] = var4.field_h.a(-27449, ((om) this).field_q);
            ((om) this).field_z[var7].field_p = -256;
            var4 = (cn) (Object) ((om) this).field_x.field_o.c(0);
            var7++;
        }
    }

    final static void a(gs param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        ik var6 = null;
        String var7 = null;
        ik var8 = null;
        String var9 = null;
        ik var10 = null;
        String var11 = null;
        ik var12 = null;
        String var13 = null;
        ik var14 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (1 == param0.field_p) {
            stackOut_2_0 = param0.field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          mna.a(stackIn_3_0, (int[]) null, param0.field_a, param0.field_e, param0.field_g, param0.field_p, -113, (sga) null, param0.field_h);
          if (param0.field_p != 0) {
            break L1;
          } else {
            if (hs.a(-75)) {
              break L1;
            } else {
              if (pw.field_w != null) {
                break L1;
              } else {
                if (rv.field_n == null) {
                  L2: {
                    if (!sea.field_j) {
                      var6 = ms.field_u;
                      var7 = or.field_j;
                      var6.field_a.a(var7, true, 14);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var8 = ms.field_u;
                  var9 = gea.field_f;
                  var8.field_a.a(var9, true, 20);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          if (param0.field_p != 1) {
            break L3;
          } else {
            if (hs.a(125)) {
              break L3;
            } else {
              if (null == pw.field_w) {
                break L3;
              } else {
                if (param0.field_d == pw.field_w.f((byte) -106)) {
                  L4: {
                    if (!sea.field_j) {
                      var10 = ms.field_u;
                      var11 = ama.field_k;
                      var10.field_a.a(var11, true, 14);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var12 = ms.field_u;
                  var13 = ma.field_k;
                  var12.field_a.a(var13, true, 20);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
        }
        L5: {
          ms.field_u.b(true);
          ms.field_u.a(114, false);
          ms.field_u.a(param0.field_o, (byte) -127, param0.field_p);
          ms.field_u.a(21654);
          ms.field_u.a(-120, param0);
          var14 = ms.field_u;
          var3 = nfa.field_a;
          var4 = jc.field_r;
          var14.field_a.a(0, false, var3, 0, var4);
          if (param1 <= -43) {
            break L5;
          } else {
            var5 = null;
            int discarded$1 = om.a(45, (byte) 61, 72, false, 85, (aga) null, 59, (op) null);
            break L5;
          }
        }
    }

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((om) this).field_x.field_l.a(107, ((om) this).field_q.field_h);
        if (var2.i(param0 + -2147483560)) {
            return;
        }
        if (param0 != 2147483647) {
            this.e(-47);
        }
        cn var3 = (cn) (Object) ((om) this).field_x.field_o.b((byte) 90);
        while (var3 != null) {
            var4 = var3.field_h.a(param0 ^ -2147456200, ((om) this).field_q);
            var4.field_s.field_J = var3.field_m;
            var4.field_s.field_x = var3.field_l;
            ((om) this).field_q.b(var4, (ad) null, true);
            var3 = (cn) (Object) ((om) this).field_x.field_o.c(0);
        }
        ((om) this).field_w = false;
        ((om) this).field_y = true;
    }

    final static gha b(boolean param0) {
        if (null == gk.field_e) {
            gk.field_e = new gha(oc.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, oc.field_l.field_u, -1, 2147483647, true);
        }
        if (param0) {
            return null;
        }
        return gk.field_e;
    }

    final static int a(int param0, byte param1, int param2, boolean param3, int param4, aga param5, int param6, op param7) {
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        wia var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        var12 = BachelorFridge.field_y;
        var8 = 0;
        var9 = 1;
        L0: while (true) {
          L1: {
            if (param4 < var9) {
              break L1;
            } else {
              L2: {
                var10 = null;
                var11 = param0;
                if (-3 != (var11 ^ -1)) {
                  if ((var11 ^ -1) == -2) {
                    if ((-var9 + param2 ^ -1) > -1) {
                      break L2;
                    } else {
                      var10_ref = param7.field_a[param6][-var9 + param2];
                      break L2;
                    }
                  } else {
                    if (4 == var11) {
                      if (param7.field_z <= var9 + param6) {
                        break L2;
                      } else {
                        var10_ref = param7.field_a[param6 - -var9][param2];
                        break L2;
                      }
                    } else {
                      if (var11 != 3) {
                        break L2;
                      } else {
                        if (var9 + param2 < param7.field_B) {
                          var10_ref = param7.field_a[param6][var9 + param2];
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  if ((param6 + -var9 ^ -1) <= -1) {
                    var10_ref = param7.field_a[-var9 + param6][param2];
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var10_ref == null) {
                break L1;
              } else {
                if (param5.a(var10_ref.field_n, false)) {
                  if (var10_ref.field_l == null) {
                    var8 = var9;
                    var9++;
                    continue L0;
                  } else {
                    if (param3) {
                      break L1;
                    } else {
                      var9++;
                      continue L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            if (param1 > 11) {
              break L3;
            } else {
              var13 = null;
              om.a((gs) null, (byte) -115);
              break L3;
            }
          }
          return var8;
        }
    }

    static {
    }
}
