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
        if (this.field_J == null) {
            return 0;
        }
        if (param0 <= 100) {
            this.a((byte) -73);
        }
        return 100 * this.field_J.field_u / (-this.field_B + this.field_J.field_p.length);
    }

    final byte[] a(byte param0) {
        if (param0 != -106) {
            bs var3 = (bs) null;
            ia.a((byte) -71, (bs) null);
        }
        if (this.field_z || this.field_J.field_p.length + -this.field_B > this.field_J.field_u) {
            throw new RuntimeException();
        }
        return this.field_J.field_p;
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        mi var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (hi.a((byte) 118, var6)) {
              if ((ba.field_d ^ -1) != -3) {
                stackIn_6_0 = ce.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (wc.a(param2, true)) {
                  stackIn_10_0 = Vertigo2.field_K;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!c.a(param2, (byte) -108)) {
                    L1: {
                      if (-101 < (sq.field_b ^ -1)) {
                        break L1;
                      } else {
                        if (0 < q.field_y) {
                          break L1;
                        } else {
                          stackIn_17_0 = wh.field_B;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (200 > sq.field_b) {
                      if (iq.b(param2, 101)) {
                        stackIn_24_0 = Vertigo2.a(new String[]{param2}, p.field_a, 6);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var5 = uh.field_Wb;
                        var5.j(param1, 127);
                        if (param0 <= -38) {
                          var5.field_u = var5.field_u + 1;
                          var4 = var5.field_u;
                          var5.f(0, 127);
                          var5.a((byte) 0, param2);
                          var5.b((byte) 66, -var4 + var5.field_u);
                          stackIn_29_0 = null;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          stackIn_27_0 = (String) null;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_20_0 = wh.field_B;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Vertigo2.a(new String[]{param2}, nh.field_n, 4);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = or.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("ia.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L2;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        return (String) ((Object) stackIn_29_0);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, bs param1) {
        bs var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 77) {
                break L1;
              } else {
                field_I = (String) null;
                break L1;
              }
            }
            param1.c(param0 + -75);
            var2 = (bs) ((Object) mk.field_J.a((byte) 100));
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(param1, false)) {
                    break L3;
                  } else {
                    var2 = (bs) ((Object) mk.field_J.b(param0 + -34));
                    continue L2;
                  }
                }
              }
              L4: {
                if (var2 == null) {
                  mk.field_J.a(param1, false);
                  break L4;
                } else {
                  jn.a(param1, var2, 18724);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("ia.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static void a(fc param0, byte param1, fc param2, int param3, int param4, int param5, int param6, int param7, int param8, fc param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fc var10 = null;
        int var10_int = 0;
        RuntimeException var10_ref = null;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
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
              L1: {
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
                  fieldTemp$0 = param2.field_M;
                  param9.field_M = param2.field_M;
                  param0.field_M = fieldTemp$0;
                  var10.field_H = null;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0.field_H == null) {
                        break L3;
                      } else {
                        if (param0.field_H.length < param0.field_w) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    param0.field_H = new byte[param0.field_w + 100];
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (null == param9.field_H) {
                        break L5;
                      } else {
                        if (param9.field_H.length >= param9.field_w) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    param9.field_H = new byte[param9.field_w - -100];
                    break L4;
                  }
                  var10_int = 0;
                  L6: while (true) {
                    if (var10_int >= param0.field_w) {
                      var10_int = 0;
                      L7: while (true) {
                        if (param9.field_w <= var10_int) {
                          break L1;
                        } else {
                          param9.field_H[var10_int] = param2.field_H[la.field_d[var10_int]];
                          var10_int++;
                          continue L7;
                        }
                      }
                    } else {
                      param0.field_H[var10_int] = param2.field_H[ba.field_e[var10_int]];
                      var10_int++;
                      continue L6;
                    }
                  }
                }
              }
              L8: {
                if (null != param2.field_R) {
                  L9: {
                    L10: {
                      if (param0.field_R == null) {
                        break L10;
                      } else {
                        if (param0.field_R.length >= param0.field_w) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param0.field_R = new byte[100 + param0.field_w];
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (null == param9.field_R) {
                        break L12;
                      } else {
                        if (param9.field_R.length >= param9.field_w) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    param9.field_R = new byte[100 + param9.field_w];
                    break L11;
                  }
                  var10_int = 0;
                  L13: while (true) {
                    if (param0.field_w <= var10_int) {
                      var10_int = 0;
                      L14: while (true) {
                        if (var10_int >= param9.field_w) {
                          break L8;
                        } else {
                          param9.field_R[var10_int] = param2.field_R[la.field_d[var10_int]];
                          var10_int++;
                          continue L14;
                        }
                      }
                    } else {
                      param0.field_R[var10_int] = param2.field_R[ba.field_e[var10_int]];
                      var10_int++;
                      continue L13;
                    }
                  }
                } else {
                  param9.field_R = null;
                  var10 = param0;
                  var10.field_R = null;
                  break L8;
                }
              }
              L15: {
                if (null == param2.field_eb) {
                  var10 = param0;
                  param9.field_eb = null;
                  var10.field_eb = null;
                  break L15;
                } else {
                  L16: {
                    L17: {
                      if (null == param0.field_eb) {
                        break L17;
                      } else {
                        if (param0.field_eb.length >= param0.field_w) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    param0.field_eb = new byte[100 + param0.field_w];
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (null == param9.field_eb) {
                        break L19;
                      } else {
                        if (param9.field_w > param9.field_eb.length) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    param9.field_eb = new byte[100 + param9.field_w];
                    break L18;
                  }
                  var10_int = 0;
                  L20: while (true) {
                    if (var10_int >= param0.field_w) {
                      var10_int = 0;
                      L21: while (true) {
                        if (var10_int >= param9.field_w) {
                          break L15;
                        } else {
                          param9.field_eb[var10_int] = param2.field_eb[la.field_d[var10_int]];
                          var10_int++;
                          continue L21;
                        }
                      }
                    } else {
                      param0.field_eb[var10_int] = param2.field_eb[ba.field_e[var10_int]];
                      var10_int++;
                      continue L20;
                    }
                  }
                }
              }
              L22: {
                if (null != param2.field_F) {
                  L23: {
                    L24: {
                      if (param0.field_F == null) {
                        break L24;
                      } else {
                        if (param0.field_F.length >= param0.field_w) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    param0.field_F = new short[100 + param0.field_w];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (null == param9.field_F) {
                        break L26;
                      } else {
                        if (param9.field_w > param9.field_F.length) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    param9.field_F = new short[param9.field_w + 100];
                    break L25;
                  }
                  var10_int = 0;
                  L27: while (true) {
                    if (param0.field_w <= var10_int) {
                      var10_int = 0;
                      L28: while (true) {
                        if (var10_int >= param9.field_w) {
                          break L22;
                        } else {
                          param9.field_F[var10_int] = param2.field_F[la.field_d[var10_int]];
                          var10_int++;
                          continue L28;
                        }
                      }
                    } else {
                      param0.field_F[var10_int] = param2.field_F[ba.field_e[var10_int]];
                      var10_int++;
                      continue L27;
                    }
                  }
                } else {
                  param9.field_F = null;
                  var10 = param0;
                  var10.field_F = null;
                  break L22;
                }
              }
              L29: {
                if (param2.field_d == null) {
                  var10 = param0;
                  param9.field_d = null;
                  var10.field_d = null;
                  break L29;
                } else {
                  L30: {
                    L31: {
                      if (param0.field_d == null) {
                        break L31;
                      } else {
                        if (param0.field_w <= param0.field_d.length) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    param0.field_d = new short[param0.field_w + 100];
                    break L30;
                  }
                  L32: {
                    L33: {
                      if (param9.field_d == null) {
                        break L33;
                      } else {
                        if (param9.field_d.length < param9.field_w) {
                          break L33;
                        } else {
                          break L32;
                        }
                      }
                    }
                    param9.field_d = new short[param9.field_w - -100];
                    break L32;
                  }
                  var10_int = 0;
                  L34: while (true) {
                    if (var10_int >= param0.field_w) {
                      var10_int = 0;
                      L35: while (true) {
                        if (param9.field_w <= var10_int) {
                          break L29;
                        } else {
                          param9.field_d[var10_int] = param2.field_d[la.field_d[var10_int]];
                          var10_int++;
                          continue L35;
                        }
                      }
                    } else {
                      param0.field_d[var10_int] = param2.field_d[ba.field_e[var10_int]];
                      var10_int++;
                      continue L34;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var10_ref = decompiledCaughtException;
            stackIn_86_0 = (RuntimeException) (var10_ref);

            stackIn_86_1 = new StringBuilder().append("ia.C(");

            if (param0 == null) {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L36;
            } else {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L36;
            }
          }
          L37: {


            stackIn_89_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L37;
            } else {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L37;
            }
          }
          L38: {


            stackIn_92_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L38;
            } else {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L38;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_87_0), stackIn_93_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
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
        field_I = "You finished the last level! Well done!";
        field_H = "Please select options in the following rows:  ";
        field_E = "You cannot join this game - it is in progress";
        field_C = 53;
    }
}
