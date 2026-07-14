/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rk {
    static String field_I;
    static String field_H;
    ed field_J;
    byte field_B;
    static String field_E;
    static int field_G;
    int field_F;
    static int field_C;

    final int i(int param0) {
        if (((ia) this).field_J == null) {
            return 0;
        }
        if (param0 <= 100) {
            byte[] discarded$0 = ((ia) this).a((byte) -73);
        }
        return 100 * ((ia) this).field_J.field_u / (-((ia) this).field_B + ((ia) this).field_J.field_p.length);
    }

    final byte[] a(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 == -106) {
            break L0;
          } else {
            var3 = null;
            ia.a((byte) -71, (bs) null);
            break L0;
          }
        }
        L1: {
          if (((ia) this).field_z) {
            break L1;
          } else {
            if (((ia) this).field_J.field_p.length + -((ia) this).field_B <= ((ia) this).field_J.field_u) {
              return ((ia) this).field_J.field_p;
            } else {
              break L1;
            }
          }
        }
        throw new RuntimeException();
    }

    final static String a(int param0, int param1, String param2) {
        CharSequence var6 = (CharSequence) (Object) param2;
        if (!hi.a((byte) 118, var6)) {
            return or.field_a;
        }
        if (!((ba.field_d ^ -1) == -3)) {
            return ce.field_d;
        }
        if (!(!wc.a(param2, true))) {
            return Vertigo2.field_K;
        }
        if (c.a(param2, (byte) -108)) {
            return Vertigo2.a(new String[1], nh.field_n, 4);
        }
        if (-101 >= (sq.field_b ^ -1)) {
            if (0 >= q.field_y) {
                return wh.field_B;
            }
        }
        if (200 <= sq.field_b) {
            return wh.field_B;
        }
        if (!(!iq.b(param2, 101))) {
            return Vertigo2.a(new String[1], p.field_a, 6);
        }
        mi var5 = uh.field_Wb;
        var5.j(param1, 127);
        if (param0 > -38) {
            return null;
        }
        var5.field_u = var5.field_u + 1;
        int var4 = var5.field_u;
        var5.f(0, 127);
        var5.a((byte) 0, param2);
        var5.b((byte) 66, -var4 + var5.field_u);
        return null;
    }

    final static void a(byte param0, bs param1) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 77) {
            field_I = null;
        }
        param1.c(param0 + -75);
        bs var2 = (bs) (Object) mk.field_J.a((byte) 100);
        while (var2 != null) {
            // ifeq L70
            var2 = (bs) (Object) mk.field_J.b(param0 + -34);
        }
        if (var2 != null) {
            jn.a((li) (Object) param1, (li) (Object) var2, 18724);
        } else {
            mk.field_J.a((li) (Object) param1, false);
        }
    }

    final static void a(fc param0, byte param1, fc param2, int param3, int param4, int param5, int param6, int param7, int param8, fc param9) {
        fc var10 = null;
        int var10_int = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        da.field_k = param0.field_E;
        hm.field_C = param0.field_u;
        or.field_e = param0.field_i;
        pd.field_a = param0.field_D;
        kc.field_e = param0.field_X;
        ga.field_hb = param9.field_C;
        qp.field_g = param0.field_N;
        vm.field_a = param0.field_o;
        sa.field_c = param0.field_A;
        hn.field_s = param9.field_X;
        vf.field_y = param9.field_i;
        jr.field_f = param9.field_bb;
        rn.field_z = param9.field_A;
        ln.field_g = param9.field_D;
        al.field_s = param0.field_a;
        vp.field_d = param0.field_bb;
        tf.field_p = param9.field_a;
        kh.field_c = param0.field_k;
        vj.field_f = param9.field_u;
        b.field_m = param9.field_o;
        lf.field_z = param9.field_k;
        hk.field_q = param0.field_C;
        cg.field_e = param9.field_E;
        ga.field_jb = param9.field_N;
        nq.a(param2.field_w, param2.field_C, param6, param2.field_u, param2.field_N, (byte[]) null, param2.field_A, param2.field_bb, param2.field_D, param2.field_i, param2.field_X, param2.field_L, param2.field_E, param4, param2.field_T, param8, param7, param2.field_k, param2.field_o, -92, (lg) null, param5, param3, param2.field_a);
        param0.field_u = hm.field_C;
        param0.field_X = kc.field_e;
        param0.field_E = da.field_k;
        param0.field_L = br.field_T;
        param0.field_N = qp.field_g;
        param0.field_w = eb.field_b;
        param0.field_T = jd.field_d;
        param0.field_C = hk.field_q;
        param0.field_W = wc.field_n;
        param0.field_i = or.field_e;
        param0.field_A = sa.field_c;
        param0.field_bb = vp.field_d;
        param0.field_D = pd.field_a;
        param0.field_a = al.field_s;
        param0.field_o = vm.field_a;
        param0.field_k = kh.field_c;
        if (param1 < -19) {
          L0: {
            param9.field_X = hn.field_s;
            param9.field_C = ga.field_hb;
            param9.field_bb = jr.field_f;
            param9.field_A = rn.field_z;
            param9.field_o = b.field_m;
            param9.field_u = vj.field_f;
            param9.field_D = ln.field_g;
            param9.field_N = ga.field_jb;
            param9.field_k = lf.field_z;
            param9.field_i = vf.field_y;
            param9.field_L = qn.field_u;
            param9.field_T = no.field_b;
            param9.field_W = vo.field_x;
            param9.field_w = rm.field_y;
            param9.field_E = cg.field_e;
            param9.field_a = tf.field_p;
            if (param2.field_H == null) {
              var10 = param0;
              param9.field_H = null;
              param9.field_M = param2.field_M;
              param0.field_M = param2.field_M;
              var10.field_H = null;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0.field_H == null) {
                    break L2;
                  } else {
                    if (param0.field_H.length < param0.field_w) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0.field_H = new byte[param0.field_w + 100];
                break L1;
              }
              L3: {
                L4: {
                  if (null == param9.field_H) {
                    break L4;
                  } else {
                    if (param9.field_H.length >= param9.field_w) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                param9.field_H = new byte[param9.field_w - -100];
                break L3;
              }
              var10_int = 0;
              L5: while (true) {
                if (var10_int >= param0.field_w) {
                  var10_int = 0;
                  L6: while (true) {
                    if (param9.field_w <= var10_int) {
                      break L0;
                    } else {
                      param9.field_H[var10_int] = param2.field_H[la.field_d[var10_int]];
                      var10_int++;
                      continue L6;
                    }
                  }
                } else {
                  param0.field_H[var10_int] = param2.field_H[ba.field_e[var10_int]];
                  var10_int++;
                  continue L5;
                }
              }
            }
          }
          L7: {
            if (null != param2.field_R) {
              L8: {
                L9: {
                  if (param0.field_R == null) {
                    break L9;
                  } else {
                    if (param0.field_R.length >= param0.field_w) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                param0.field_R = new byte[100 + param0.field_w];
                break L8;
              }
              L10: {
                L11: {
                  if (null == param9.field_R) {
                    break L11;
                  } else {
                    if (param9.field_R.length >= param9.field_w) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                param9.field_R = new byte[100 + param9.field_w];
                break L10;
              }
              var10_int = 0;
              L12: while (true) {
                if (param0.field_w <= var10_int) {
                  var10_int = 0;
                  L13: while (true) {
                    if (var10_int >= param9.field_w) {
                      break L7;
                    } else {
                      param9.field_R[var10_int] = param2.field_R[la.field_d[var10_int]];
                      var10_int++;
                      continue L13;
                    }
                  }
                } else {
                  param0.field_R[var10_int] = param2.field_R[ba.field_e[var10_int]];
                  var10_int++;
                  continue L12;
                }
              }
            } else {
              param9.field_R = null;
              var10 = param0;
              var10.field_R = null;
              break L7;
            }
          }
          L14: {
            if (null == param2.field_eb) {
              var10 = param0;
              param9.field_eb = null;
              var10.field_eb = null;
              break L14;
            } else {
              L15: {
                L16: {
                  if (null == param0.field_eb) {
                    break L16;
                  } else {
                    if (param0.field_eb.length >= param0.field_w) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                param0.field_eb = new byte[100 + param0.field_w];
                break L15;
              }
              L17: {
                L18: {
                  if (null == param9.field_eb) {
                    break L18;
                  } else {
                    if (param9.field_w > param9.field_eb.length) {
                      break L18;
                    } else {
                      break L17;
                    }
                  }
                }
                param9.field_eb = new byte[100 + param9.field_w];
                break L17;
              }
              var10_int = 0;
              L19: while (true) {
                if (var10_int >= param0.field_w) {
                  var10_int = 0;
                  L20: while (true) {
                    if (var10_int >= param9.field_w) {
                      break L14;
                    } else {
                      param9.field_eb[var10_int] = param2.field_eb[la.field_d[var10_int]];
                      var10_int++;
                      continue L20;
                    }
                  }
                } else {
                  param0.field_eb[var10_int] = param2.field_eb[ba.field_e[var10_int]];
                  var10_int++;
                  continue L19;
                }
              }
            }
          }
          L21: {
            if (null != param2.field_F) {
              L22: {
                L23: {
                  if (param0.field_F == null) {
                    break L23;
                  } else {
                    if (param0.field_F.length >= param0.field_w) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param0.field_F = new short[100 + param0.field_w];
                break L22;
              }
              L24: {
                L25: {
                  if (null == param9.field_F) {
                    break L25;
                  } else {
                    if (param9.field_w > param9.field_F.length) {
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                param9.field_F = new short[param9.field_w + 100];
                break L24;
              }
              var10_int = 0;
              L26: while (true) {
                if (param0.field_w <= var10_int) {
                  var10_int = 0;
                  L27: while (true) {
                    if (var10_int >= param9.field_w) {
                      break L21;
                    } else {
                      param9.field_F[var10_int] = param2.field_F[la.field_d[var10_int]];
                      var10_int++;
                      continue L27;
                    }
                  }
                } else {
                  param0.field_F[var10_int] = param2.field_F[ba.field_e[var10_int]];
                  var10_int++;
                  continue L26;
                }
              }
            } else {
              param9.field_F = null;
              var10 = param0;
              var10.field_F = null;
              break L21;
            }
          }
          L28: {
            if (param2.field_d == null) {
              var10 = param0;
              param9.field_d = null;
              var10.field_d = null;
              break L28;
            } else {
              L29: {
                L30: {
                  if (param0.field_d == null) {
                    break L30;
                  } else {
                    if (param0.field_w <= param0.field_d.length) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                }
                param0.field_d = new short[param0.field_w + 100];
                break L29;
              }
              L31: {
                L32: {
                  if (param9.field_d == null) {
                    break L32;
                  } else {
                    if (param9.field_d.length < param9.field_w) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                param9.field_d = new short[param9.field_w - -100];
                break L31;
              }
              var10_int = 0;
              L33: while (true) {
                if (var10_int >= param0.field_w) {
                  var10_int = 0;
                  L34: while (true) {
                    if (param9.field_w <= var10_int) {
                      break L28;
                    } else {
                      param9.field_d[var10_int] = param2.field_d[la.field_d[var10_int]];
                      var10_int++;
                      continue L34;
                    }
                  }
                } else {
                  param0.field_d[var10_int] = param2.field_d[ba.field_e[var10_int]];
                  var10_int++;
                  continue L33;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != -20657) {
            field_C = -5;
        }
        field_H = null;
        field_E = null;
    }

    ia() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "You finished the last level! Well done!";
        field_H = "Please select options in the following rows:  ";
        field_E = "You cannot join this game - it is in progress";
        field_C = 53;
    }
}
