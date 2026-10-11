/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends wf {
    static String field_h;
    static String field_g;

    public static void a(byte param0) {
        if (param0 < 12) {
          he.b((byte) 57);
          field_g = null;
          field_h = null;
          return;
        }
        field_g = null;
        field_h = null;
    }

    final static void a(String[] args, byte param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        String[] var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 <= 75) {
            return;
          }
          db.field_a = gd.field_l;
          if (255 == param3) {
            stackIn_12_0 = !(ab.field_j >= 13);
            de.field_a = de.a(stackIn_12_0, (byte) -116);
            var6 = (String[]) null;
            dj.a(false, (String[]) null);
          } else {
            if (param3 < 100) {
              de.field_a = mk.a(242763393, param2, param3);
            } else {
              if (param3 > 105) {
                de.field_a = mk.a(242763393, param2, param3);
              } else {
                var4 = args;
                dj.a(false, var4);
                de.field_a = ve.a(args, (byte) -128);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("he.C(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (ba.field_q == null ||
          !(ba.field_q.length >= param1)) {
          ba.field_q = new int[2 * param1];
        }
        if (null == dk.field_k) {
          dk.field_k = new int[param1 * 2];
          if (null == bh.field_a ||
            !(param1 <= bh.field_a.length)) {
            bh.field_a = new int[param1 * 2];
          }
          if (null == pd.field_a ||
            !(pd.field_a.length >= param1)) {
            pd.field_a = new int[2 * param1];
          }
          if (null != bg.field_j &&
            bg.field_j.length >= param1) {
            if (param2 != 24070) {
              he.b((byte) -97);
              if (tb.field_d == null ||
                !(tb.field_d.length >= param1)) {
                tb.field_d = new int[param1 * 2];
              }
              if (lk.field_d == null ||
                !(lk.field_d.length >= param1 + param0)) {
                lk.field_d = new int[(param1 + param0) * 2];
              }
              if (pa.field_h == null ||
                !(pa.field_h.length >= param1)) {
                pa.field_h = new boolean[2 * param1];
              }
            } else {
              if (tb.field_d == null) {
                tb.field_d = new int[param1 * 2];
                if (lk.field_d == null ||
                  !(lk.field_d.length >= param1 + param0)) {
                  lk.field_d = new int[(param1 + param0) * 2];
                }
                if (pa.field_h == null ||
                  !(pa.field_h.length >= param1)) {
                  pa.field_h = new boolean[2 * param1];
                }
              } else {
                if (tb.field_d.length < param1) {
                  tb.field_d = new int[param1 * 2];
                  if (lk.field_d == null ||
                    !(lk.field_d.length >= param1 + param0)) {
                    lk.field_d = new int[(param1 + param0) * 2];
                  }
                  if (pa.field_h == null ||
                    !(pa.field_h.length >= param1)) {
                    pa.field_h = new boolean[2 * param1];
                  }
                } else {
                  if (lk.field_d == null) {
                    lk.field_d = new int[(param1 + param0) * 2];
                    if (pa.field_h == null ||
                      !(pa.field_h.length >= param1)) {
                      pa.field_h = new boolean[2 * param1];
                    }
                  } else {
                    if (lk.field_d.length >= param1 + param0) {
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    } else {
                      lk.field_d = new int[(param1 + param0) * 2];
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    }
                  }
                }
              }
            }
            rc.field_c = -2147483648;
            ue.field_a = 2147483647;
            ua.field_d = 2147483647;
            cg.field_l = 0;
            vb.field_a = -2147483648;
            return;
          }
          bg.field_j = new int[param1 * 2];
          if (param2 != 24070) {
            he.b((byte) -97);
          }
          if (tb.field_d == null ||
            !(tb.field_d.length >= param1)) {
            tb.field_d = new int[param1 * 2];
          }
          if (lk.field_d == null ||
            !(lk.field_d.length >= param1 + param0)) {
            lk.field_d = new int[(param1 + param0) * 2];
          }
          if (pa.field_h == null ||
            !(pa.field_h.length >= param1)) {
            pa.field_h = new boolean[2 * param1];
          }
        } else {
          if (dk.field_k.length < param1) {
            dk.field_k = new int[param1 * 2];
            if (null == bh.field_a ||
              !(param1 <= bh.field_a.length)) {
              bh.field_a = new int[param1 * 2];
            }
            if (null == pd.field_a ||
              !(pd.field_a.length >= param1)) {
              pd.field_a = new int[2 * param1];
            }
            if (null != bg.field_j &&
              bg.field_j.length >= param1) {
              if (param2 != 24070) {
                he.b((byte) -97);
                if (tb.field_d == null ||
                  !(tb.field_d.length >= param1)) {
                  tb.field_d = new int[param1 * 2];
                }
                if (lk.field_d == null ||
                  !(lk.field_d.length >= param1 + param0)) {
                  lk.field_d = new int[(param1 + param0) * 2];
                }
                if (pa.field_h == null ||
                  !(pa.field_h.length >= param1)) {
                  pa.field_h = new boolean[2 * param1];
                }
              } else {
                if (tb.field_d == null) {
                  tb.field_d = new int[param1 * 2];
                  if (lk.field_d == null ||
                    !(lk.field_d.length >= param1 + param0)) {
                    lk.field_d = new int[(param1 + param0) * 2];
                  }
                  if (pa.field_h == null ||
                    !(pa.field_h.length >= param1)) {
                    pa.field_h = new boolean[2 * param1];
                  }
                } else {
                  if (tb.field_d.length < param1) {
                    tb.field_d = new int[param1 * 2];
                    if (lk.field_d == null ||
                      !(lk.field_d.length >= param1 + param0)) {
                      lk.field_d = new int[(param1 + param0) * 2];
                    }
                    if (pa.field_h == null ||
                      !(pa.field_h.length >= param1)) {
                      pa.field_h = new boolean[2 * param1];
                    }
                  } else {
                    if (lk.field_d == null) {
                      lk.field_d = new int[(param1 + param0) * 2];
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      } else {
                        lk.field_d = new int[(param1 + param0) * 2];
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      }
                    }
                  }
                }
              }
              rc.field_c = -2147483648;
              ue.field_a = 2147483647;
              ua.field_d = 2147483647;
              cg.field_l = 0;
              vb.field_a = -2147483648;
              return;
            }
            bg.field_j = new int[param1 * 2];
            if (param2 != 24070) {
              he.b((byte) -97);
            }
            if (tb.field_d == null ||
              !(tb.field_d.length >= param1)) {
              tb.field_d = new int[param1 * 2];
            }
            if (lk.field_d == null ||
              !(lk.field_d.length >= param1 + param0)) {
              lk.field_d = new int[(param1 + param0) * 2];
            }
            if (pa.field_h == null ||
              !(pa.field_h.length >= param1)) {
              pa.field_h = new boolean[2 * param1];
            }
          } else {
            if (null == bh.field_a ||
              !(param1 <= bh.field_a.length)) {
              bh.field_a = new int[param1 * 2];
            }
            if (null == pd.field_a ||
              !(pd.field_a.length >= param1)) {
              pd.field_a = new int[2 * param1];
            }
            if (null != bg.field_j &&
              bg.field_j.length >= param1) {
              if (param2 != 24070) {
                he.b((byte) -97);
                if (tb.field_d == null ||
                  !(tb.field_d.length >= param1)) {
                  tb.field_d = new int[param1 * 2];
                }
                if (lk.field_d == null) {
                  lk.field_d = new int[(param1 + param0) * 2];
                  if (pa.field_h == null ||
                    !(pa.field_h.length >= param1)) {
                    pa.field_h = new boolean[2 * param1];
                  }
                } else {
                  if (lk.field_d.length >= param1 + param0) {
                    if (pa.field_h == null ||
                      !(pa.field_h.length >= param1)) {
                      pa.field_h = new boolean[2 * param1];
                    }
                  } else {
                    lk.field_d = new int[(param1 + param0) * 2];
                    if (pa.field_h == null ||
                      !(pa.field_h.length >= param1)) {
                      pa.field_h = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                if (tb.field_d == null) {
                  tb.field_d = new int[param1 * 2];
                  if (lk.field_d == null) {
                    lk.field_d = new int[(param1 + param0) * 2];
                    if (pa.field_h == null ||
                      !(pa.field_h.length >= param1)) {
                      pa.field_h = new boolean[2 * param1];
                    }
                  } else {
                    if (lk.field_d.length >= param1 + param0) {
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    } else {
                      lk.field_d = new int[(param1 + param0) * 2];
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    }
                  }
                } else {
                  if (tb.field_d.length >= param1) {
                    if (lk.field_d == null) {
                      lk.field_d = new int[(param1 + param0) * 2];
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      } else {
                        lk.field_d = new int[(param1 + param0) * 2];
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      }
                    }
                  } else {
                    tb.field_d = new int[param1 * 2];
                    if (lk.field_d == null) {
                      lk.field_d = new int[(param1 + param0) * 2];
                      if (pa.field_h == null ||
                        !(pa.field_h.length >= param1)) {
                        pa.field_h = new boolean[2 * param1];
                      }
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      } else {
                        lk.field_d = new int[(param1 + param0) * 2];
                        if (pa.field_h == null ||
                          !(pa.field_h.length >= param1)) {
                          pa.field_h = new boolean[2 * param1];
                        }
                      }
                    }
                  }
                }
              }
              rc.field_c = -2147483648;
              ue.field_a = 2147483647;
              ua.field_d = 2147483647;
              cg.field_l = 0;
              vb.field_a = -2147483648;
              return;
            }
            bg.field_j = new int[param1 * 2];
            if (param2 != 24070) {
              he.b((byte) -97);
            }
            if (tb.field_d == null ||
              !(tb.field_d.length >= param1)) {
              tb.field_d = new int[param1 * 2];
            }
            if (lk.field_d == null ||
              !(lk.field_d.length >= param1 + param0)) {
              lk.field_d = new int[(param1 + param0) * 2];
            }
            if (pa.field_h == null ||
              !(pa.field_h.length >= param1)) {
              pa.field_h = new boolean[2 * param1];
            }
          }
        }
        rc.field_c = -2147483648;
        ue.field_a = 2147483647;
        ua.field_d = 2147483647;
        cg.field_l = 0;
        vb.field_a = -2147483648;
    }

    final static void a(ti param0, int param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ti var12 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        try {
          param2 = param2 + param0.field_u;
          param4 = param4 + param0.field_l;
          var5_int = param2 + sb.field_c * param4;
          var6 = 0;
          var7 = param0.field_m;
          if (param3 <= 55) {
            var12 = (ti) null;
            he.a((ti) null, 10, 5, (byte) -107, 1);
          }
          var8 = param0.field_n;
          var9 = -var8 + sb.field_c;
          var10 = 0;
          if (param4 < sb.field_e) {
            var11 = sb.field_e - param4;
            var5_int = var5_int + sb.field_c * var11;
            var6 = var6 + var11 * var8;
            var7 = var7 - var11;
            param4 = sb.field_e;
          }
          if (param4 + var7 > sb.field_f) {
            var7 = var7 - (param4 + var7 - sb.field_f);
          }
          if (sb.field_d > param2) {
            var11Lifetime1 = sb.field_d - param2;
            var8 = var8 - var11Lifetime1;
            var5_int = var5_int + var11Lifetime1;
            var10 = var10 + var11Lifetime1;
            var6 = var6 + var11Lifetime1;
            var9 = var9 + var11Lifetime1;
            param2 = sb.field_d;
          }
          if (sb.field_b < param2 + var8) {
            var11Lifetime2 = var8 + param2 - sb.field_b;
            var9 = var9 + var11Lifetime2;
            var10 = var10 + var11Lifetime2;
            var8 = var8 - var11Lifetime2;
          }
          if (var8 > 0 &&
            var7 > 0) {
            we.a(var6, param1, var7, param0.field_w, var10, var9, var8, 0, sb.field_h, (byte) -53, var5_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private he() throws Throwable {
        throw new Error();
    }

    final static void b(byte param0) {
        aa.field_g = false;
        lb.field_d = false;
        ba.a(121, -1);
        int var1 = -100 % ((44 - param0) / 47);
        rh.field_v = jh.field_n;
        db.field_a = jh.field_n;
    }

    static {
        field_h = "End Game";
        field_g = "Are you sure you want to skip this round, scoring 0 for it?";
    }
}
