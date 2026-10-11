/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends jb {
    final static void b(int param0, int param1, int param2) {
        if (null == pn.field_p ||
          !(param0 <= pn.field_p.length)) {
          pn.field_p = new int[param0 * 2];
        }
        if (null == lj.field_a) {
          lj.field_a = new int[param0 * 2];
          if (jf.field_f == null) {
            jf.field_f = new int[2 * param0];
            if (ic.field_c == null ||
              !(param0 <= ic.field_c.length)) {
              ic.field_c = new int[2 * param0];
            }
            if (vi.field_z == null ||
              !(param0 <= vi.field_z.length)) {
              vi.field_z = new int[param0 * 2];
            }
            if (uc.field_c == null ||
              !(param0 <= uc.field_c.length)) {
              uc.field_c = new int[2 * param0];
            }
            if (null == pd.field_q ||
              !(param2 + param0 <= pd.field_q.length)) {
              pd.field_q = new int[2 * (param0 + param2)];
            }
            if (kk.field_b == null ||
              !(kk.field_b.length >= param0)) {
              kk.field_b = new boolean[2 * param0];
            }
          } else {
            if (param0 <= jf.field_f.length) {
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[2 * param0];
              }
              if (vi.field_z == null ||
                !(param0 <= vi.field_z.length)) {
                vi.field_z = new int[param0 * 2];
              }
              if (uc.field_c == null ||
                !(param0 <= uc.field_c.length)) {
                uc.field_c = new int[2 * param0];
              }
              if (null == pd.field_q ||
                !(param2 + param0 <= pd.field_q.length)) {
                pd.field_q = new int[2 * (param0 + param2)];
              }
              if (kk.field_b == null ||
                !(kk.field_b.length >= param0)) {
                kk.field_b = new boolean[2 * param0];
              }
            } else {
              jf.field_f = new int[2 * param0];
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[2 * param0];
              }
              if (vi.field_z == null ||
                !(param0 <= vi.field_z.length)) {
                vi.field_z = new int[param0 * 2];
              }
              if (uc.field_c == null ||
                !(param0 <= uc.field_c.length)) {
                uc.field_c = new int[2 * param0];
              }
              if (null == pd.field_q ||
                !(param2 + param0 <= pd.field_q.length)) {
                pd.field_q = new int[2 * (param0 + param2)];
              }
              if (kk.field_b == null ||
                !(kk.field_b.length >= param0)) {
                kk.field_b = new boolean[2 * param0];
              }
            }
          }
        } else {
          if (lj.field_a.length < param0) {
            lj.field_a = new int[param0 * 2];
            if (jf.field_f == null ||
              !(param0 <= jf.field_f.length)) {
              jf.field_f = new int[2 * param0];
            }
            if (ic.field_c == null ||
              !(param0 <= ic.field_c.length)) {
              ic.field_c = new int[2 * param0];
            }
            if (vi.field_z == null ||
              !(param0 <= vi.field_z.length)) {
              vi.field_z = new int[param0 * 2];
            }
            if (uc.field_c == null) {
              uc.field_c = new int[2 * param0];
              if (null == pd.field_q ||
                !(param2 + param0 <= pd.field_q.length)) {
                pd.field_q = new int[2 * (param0 + param2)];
              }
              if (kk.field_b == null ||
                !(kk.field_b.length >= param0)) {
                kk.field_b = new boolean[2 * param0];
              }
            } else {
              if (param0 <= uc.field_c.length) {
                if (null == pd.field_q ||
                  !(param2 + param0 <= pd.field_q.length)) {
                  pd.field_q = new int[2 * (param0 + param2)];
                }
                if (kk.field_b == null ||
                  !(kk.field_b.length >= param0)) {
                  kk.field_b = new boolean[2 * param0];
                }
              } else {
                uc.field_c = new int[2 * param0];
                if (null == pd.field_q ||
                  !(param2 + param0 <= pd.field_q.length)) {
                  pd.field_q = new int[2 * (param0 + param2)];
                }
                if (kk.field_b == null ||
                  !(kk.field_b.length >= param0)) {
                  kk.field_b = new boolean[2 * param0];
                }
              }
            }
          } else {
            if (jf.field_f == null ||
              !(param0 <= jf.field_f.length)) {
              jf.field_f = new int[2 * param0];
            }
            if (ic.field_c == null) {
              ic.field_c = new int[2 * param0];
              if (vi.field_z == null ||
                !(param0 <= vi.field_z.length)) {
                vi.field_z = new int[param0 * 2];
              }
              if (uc.field_c == null) {
                uc.field_c = new int[2 * param0];
                if (null == pd.field_q ||
                  !(param2 + param0 <= pd.field_q.length)) {
                  pd.field_q = new int[2 * (param0 + param2)];
                }
                if (kk.field_b == null ||
                  !(kk.field_b.length >= param0)) {
                  kk.field_b = new boolean[2 * param0];
                }
              } else {
                if (param0 <= uc.field_c.length) {
                  if (null == pd.field_q ||
                    !(param2 + param0 <= pd.field_q.length)) {
                    pd.field_q = new int[2 * (param0 + param2)];
                  }
                  if (kk.field_b == null ||
                    !(kk.field_b.length >= param0)) {
                    kk.field_b = new boolean[2 * param0];
                  }
                } else {
                  uc.field_c = new int[2 * param0];
                  if (null == pd.field_q ||
                    !(param2 + param0 <= pd.field_q.length)) {
                    pd.field_q = new int[2 * (param0 + param2)];
                  }
                  if (kk.field_b == null ||
                    !(kk.field_b.length >= param0)) {
                    kk.field_b = new boolean[2 * param0];
                  }
                }
              }
            } else {
              if (param0 <= ic.field_c.length) {
                if (vi.field_z == null ||
                  !(param0 <= vi.field_z.length)) {
                  vi.field_z = new int[param0 * 2];
                }
                if (uc.field_c == null) {
                  uc.field_c = new int[2 * param0];
                  if (null == pd.field_q ||
                    !(param2 + param0 <= pd.field_q.length)) {
                    pd.field_q = new int[2 * (param0 + param2)];
                  }
                  if (kk.field_b == null ||
                    !(kk.field_b.length >= param0)) {
                    kk.field_b = new boolean[2 * param0];
                  }
                } else {
                  if (param0 <= uc.field_c.length) {
                    if (null == pd.field_q ||
                      !(param2 + param0 <= pd.field_q.length)) {
                      pd.field_q = new int[2 * (param0 + param2)];
                    }
                    if (kk.field_b == null ||
                      !(kk.field_b.length >= param0)) {
                      kk.field_b = new boolean[2 * param0];
                    }
                  } else {
                    uc.field_c = new int[2 * param0];
                    if (null == pd.field_q ||
                      !(param2 + param0 <= pd.field_q.length)) {
                      pd.field_q = new int[2 * (param0 + param2)];
                    }
                    if (kk.field_b == null ||
                      !(kk.field_b.length >= param0)) {
                      kk.field_b = new boolean[2 * param0];
                    }
                  }
                }
              } else {
                ic.field_c = new int[2 * param0];
                if (vi.field_z == null ||
                  !(param0 <= vi.field_z.length)) {
                  vi.field_z = new int[param0 * 2];
                }
                if (uc.field_c == null) {
                  uc.field_c = new int[2 * param0];
                  if (null == pd.field_q ||
                    !(param2 + param0 <= pd.field_q.length)) {
                    pd.field_q = new int[2 * (param0 + param2)];
                  }
                  if (kk.field_b == null ||
                    !(kk.field_b.length >= param0)) {
                    kk.field_b = new boolean[2 * param0];
                  }
                } else {
                  if (param0 <= uc.field_c.length) {
                    if (null == pd.field_q ||
                      !(param2 + param0 <= pd.field_q.length)) {
                      pd.field_q = new int[2 * (param0 + param2)];
                    }
                    if (kk.field_b == null ||
                      !(kk.field_b.length >= param0)) {
                      kk.field_b = new boolean[2 * param0];
                    }
                  } else {
                    uc.field_c = new int[2 * param0];
                    if (null == pd.field_q ||
                      !(param2 + param0 <= pd.field_q.length)) {
                      pd.field_q = new int[2 * (param0 + param2)];
                    }
                    if (kk.field_b == null ||
                      !(kk.field_b.length >= param0)) {
                      kk.field_b = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        }
        kc.field_l = param1;
        ab.field_c = 2147483647;
        oc.field_f = -2147483648;
        qu.field_k = 2147483647;
        se.field_d = 0;
    }

    final static int a(lj param0, int param1, lj param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            tn.b(-2, -71, 69);
          }
          var4 = (String) null;
          stackIn_3_0 = jd.a(param2, 0, param0, 0, false, 72, (String) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tn.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (param0 >= -87) {
          return;
        }
        ks.field_x = fw.c(false);
        pu.field_e = new dg();
        is.a(40);
    }

    final nb a(byte param0) {
        if (param0 < 80) {
          return (nb) null;
        }
        return vs.field_a;
    }

    tn(long param0, String param1) {
        super(param0, param1);
    }

    static {
    }
}
