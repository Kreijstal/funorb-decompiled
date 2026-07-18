/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ui {
    static int field_g;
    static hl field_e;
    static Boolean field_b;
    static je field_d;
    static ok field_f;
    static long[] field_c;
    static String[] field_a;

    final static boolean a(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var1 = k.a(0);
        var3 = var1 - pm.field_g;
        if (var3 <= 30000L) {
          L0: {
            var5 = 3000;
            if (7 <= ib.field_b) {
              var5 = 12000;
              break L0;
            } else {
              if (ib.field_b < 5) {
                if (ib.field_b >= 3) {
                  var5 = 6000;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var5 = 9000;
                break L0;
              }
            }
          }
          if (~(long)var5 <= ~var3) {
            return false;
          } else {
            pm.field_g = var1;
            ib.field_b = ib.field_b + 1;
            return true;
          }
        } else {
          ib.field_b = 0;
          pm.field_g = var1;
          return true;
        }
    }

    final static void a(ob param0, int param1, int param2, ob param3, int param4, int param5, int param6, ob param7, int param8, int param9) {
        RuntimeException var10 = null;
        ob var10_ref = null;
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            tc.field_w = param3.field_M;
            om.field_Yb = param0.field_j;
            nn.field_S = param3.field_V;
            wk.field_b = param3.field_p;
            fj.field_p = param0.field_M;
            hd.field_D = param0.field_A;
            gk.field_c = param0.field_Y;
            nh.field_Mb = param0.field_k;
            cm.field_q = param0.field_gb;
            ve.field_a = param0.field_kb;
            ch.field_s = param3.field_Y;
            ic.field_c = param3.field_t;
            ga.field_b = param0.field_hb;
            gb.field_r = param3.field_I;
            am.field_b = param0.field_t;
            kj.field_d = param0.field_p;
            db.field_f = param3.field_A;
            bg.field_f = param3.field_k;
            gd.field_Zb = param0.field_V;
            li.field_m = param0.field_I;
            ja.field_l = param3.field_kb;
            mc.field_m = param3.field_hb;
            rk.field_b = param3.field_j;
            bd.field_a = param3.field_gb;
            bn.a(param4, param2, param7.field_kb, param8, param9, param7.field_V, (kc) null, param7.field_ob, param7.field_M, param5, param7.field_E, param7.field_gb, param7.field_t, 118, param1, param7.field_Y, param7.field_I, param7.field_j, param7.field_hb, param7.field_k, param7.field_p, param7.field_ib, (byte[]) null, param7.field_A);
            param3.field_V = nn.field_S;
            param3.field_ib = k.field_e;
            param3.field_j = rk.field_b;
            param3.field_A = db.field_f;
            param3.field_I = gb.field_r;
            param3.field_k = bg.field_f;
            param3.field_kb = ja.field_l;
            param3.field_nb = ea.field_e;
            param3.field_t = ic.field_c;
            param3.field_gb = bd.field_a;
            param3.field_ob = fh.field_g;
            param3.field_M = tc.field_w;
            param3.field_Y = ch.field_s;
            param3.field_p = wk.field_b;
            param3.field_E = hb.field_d;
            param3.field_hb = mc.field_m;
            param0.field_A = hd.field_D;
            param0.field_kb = ve.field_a;
            param0.field_Y = gk.field_c;
            param0.field_ib = mf.field_u;
            if (param6 == 100) {
              L1: {
                param0.field_I = li.field_m;
                param0.field_k = nh.field_Mb;
                param0.field_gb = cm.field_q;
                param0.field_ob = le.field_Xb;
                param0.field_t = am.field_b;
                param0.field_E = bm.field_p;
                param0.field_M = fj.field_p;
                param0.field_p = kj.field_d;
                param0.field_j = om.field_Yb;
                param0.field_hb = ga.field_b;
                param0.field_nb = d.field_b;
                param0.field_V = gd.field_Zb;
                if (null == param7.field_U) {
                  param0.field_U = null;
                  var10_ref = param3;
                  var10_ref.field_U = null;
                  byte fieldTemp$1 = param7.field_K;
                  param0.field_K = param7.field_K;
                  param3.field_K = fieldTemp$1;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param3.field_U == null) {
                        break L3;
                      } else {
                        if (param3.field_ob > param3.field_U.length) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    param3.field_U = new byte[100 + param3.field_ob];
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (null == param0.field_U) {
                        break L5;
                      } else {
                        if (param0.field_ob > param0.field_U.length) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param0.field_U = new byte[param0.field_ob - -100];
                    break L4;
                  }
                  var10_int = 0;
                  L6: while (true) {
                    if (param3.field_ob <= var10_int) {
                      var10_int = 0;
                      L7: while (true) {
                        if (param0.field_ob <= var10_int) {
                          break L1;
                        } else {
                          param0.field_U[var10_int] = param7.field_U[gm.field_b[var10_int]];
                          var10_int++;
                          continue L7;
                        }
                      }
                    } else {
                      param3.field_U[var10_int] = param7.field_U[rl.field_c[var10_int]];
                      var10_int++;
                      continue L6;
                    }
                  }
                }
              }
              L8: {
                if (param7.field_eb == null) {
                  var10_ref = param3;
                  param0.field_eb = null;
                  var10_ref.field_eb = null;
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if (param3.field_eb == null) {
                        break L10;
                      } else {
                        if (param3.field_ob > param3.field_eb.length) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    param3.field_eb = new byte[100 + param3.field_ob];
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (null == param0.field_eb) {
                        break L12;
                      } else {
                        if (param0.field_ob > param0.field_eb.length) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param0.field_eb = new byte[100 + param0.field_ob];
                    break L11;
                  }
                  var10_int = 0;
                  L13: while (true) {
                    if (var10_int >= param3.field_ob) {
                      var10_int = 0;
                      L14: while (true) {
                        if (param0.field_ob <= var10_int) {
                          break L8;
                        } else {
                          param0.field_eb[var10_int] = param7.field_eb[gm.field_b[var10_int]];
                          var10_int++;
                          continue L14;
                        }
                      }
                    } else {
                      param3.field_eb[var10_int] = param7.field_eb[rl.field_c[var10_int]];
                      var10_int++;
                      continue L13;
                    }
                  }
                }
              }
              L15: {
                if (null == param7.field_u) {
                  param0.field_u = null;
                  var10_ref = param3;
                  var10_ref.field_u = null;
                  break L15;
                } else {
                  L16: {
                    L17: {
                      if (param3.field_u == null) {
                        break L17;
                      } else {
                        if (param3.field_ob > param3.field_u.length) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    param3.field_u = new byte[100 + param3.field_ob];
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (param0.field_u == null) {
                        break L19;
                      } else {
                        if (param0.field_u.length >= param0.field_ob) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    param0.field_u = new byte[100 + param0.field_ob];
                    break L18;
                  }
                  var10_int = 0;
                  L20: while (true) {
                    if (var10_int >= param3.field_ob) {
                      var10_int = 0;
                      L21: while (true) {
                        if (param0.field_ob <= var10_int) {
                          break L15;
                        } else {
                          param0.field_u[var10_int] = param7.field_u[gm.field_b[var10_int]];
                          var10_int++;
                          continue L21;
                        }
                      }
                    } else {
                      param3.field_u[var10_int] = param7.field_u[rl.field_c[var10_int]];
                      var10_int++;
                      continue L20;
                    }
                  }
                }
              }
              L22: {
                if (param7.field_r != null) {
                  L23: {
                    L24: {
                      if (null == param3.field_r) {
                        break L24;
                      } else {
                        if (param3.field_r.length < param3.field_ob) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    param3.field_r = new short[100 + param3.field_ob];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (param0.field_r == null) {
                        break L26;
                      } else {
                        if (param0.field_r.length < param0.field_ob) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    param0.field_r = new short[100 + param0.field_ob];
                    break L25;
                  }
                  var10_int = 0;
                  L27: while (true) {
                    if (param3.field_ob <= var10_int) {
                      var10_int = 0;
                      L28: while (true) {
                        if (param0.field_ob <= var10_int) {
                          break L22;
                        } else {
                          param0.field_r[var10_int] = param7.field_r[gm.field_b[var10_int]];
                          var10_int++;
                          continue L28;
                        }
                      }
                    } else {
                      param3.field_r[var10_int] = param7.field_r[rl.field_c[var10_int]];
                      var10_int++;
                      continue L27;
                    }
                  }
                } else {
                  param0.field_r = null;
                  var10_ref = param3;
                  var10_ref.field_r = null;
                  break L22;
                }
              }
              L29: {
                if (null == param7.field_J) {
                  var10_ref = param3;
                  param0.field_J = null;
                  var10_ref.field_J = null;
                  break L29;
                } else {
                  L30: {
                    L31: {
                      if (null == param3.field_J) {
                        break L31;
                      } else {
                        if (param3.field_J.length < param3.field_ob) {
                          break L31;
                        } else {
                          break L30;
                        }
                      }
                    }
                    param3.field_J = new short[param3.field_ob - -100];
                    break L30;
                  }
                  L32: {
                    L33: {
                      if (null == param0.field_J) {
                        break L33;
                      } else {
                        if (param0.field_J.length >= param0.field_ob) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    param0.field_J = new short[param0.field_ob - -100];
                    break L32;
                  }
                  var10_int = 0;
                  L34: while (true) {
                    if (var10_int >= param3.field_ob) {
                      var10_int = 0;
                      L35: while (true) {
                        if (param0.field_ob <= var10_int) {
                          break L29;
                        } else {
                          param0.field_J[var10_int] = param7.field_J[gm.field_b[var10_int]];
                          var10_int++;
                          continue L35;
                        }
                      }
                    } else {
                      param3.field_J[var10_int] = param7.field_J[rl.field_c[var10_int]];
                      var10_int++;
                      continue L34;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var10 = decompiledCaughtException;
            stackOut_84_0 = (RuntimeException) var10;
            stackOut_84_1 = new StringBuilder().append("ui.D(");
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param0 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L36;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L36;
            }
          }
          L37: {
            stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
            stackOut_87_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param3 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L37;
            } else {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L37;
            }
          }
          L38: {
            stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
            stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param7 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L38;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L38;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1692) {
            return 27;
        }
        return l.a(rb.field_Mb, (byte) 118, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ok();
        field_c = new long[32];
        field_a = new String[]{"Link Newcomer", "Link Challenger", "Victory on the Grid", "Attunement to the Grid", "Mastery of the Grid", "Link Duality", "PentaLink", "Ghosts in the Machine"};
    }
}
