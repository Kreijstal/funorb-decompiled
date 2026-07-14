/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends mc {
    int[] field_r;
    static boolean field_q;
    static int field_n;
    static long field_o;
    static String field_p;

    public static void a(boolean param0) {
        field_p = null;
        if (param0) {
            float discarded$0 = vj.a(-1.4104137420654297f, true);
        }
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        jd var4 = null;
        if (param2 == null) {
            return null;
        }
        if (param2 instanceof byte[]) {
            var3 = (byte[]) param2;
            if (!param0) {
                return var3;
            }
            return ak.a(-14074, var3);
        }
        if (param1 != -28) {
            vj.a(49);
        }
        if (!(!(param2 instanceof jd))) {
            var4 = (jd) param2;
            return var4.a(111);
        }
        throw new IllegalArgumentException();
    }

    final static float a(float param0, boolean param1) {
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        if (null == el.field_Nb) {
            el.field_Nb = new float[8];
            fm.field_b = new float[8];
            var2 = 0.5f;
            for (var3 = 0; 8 > var3; var3++) {
                el.field_Nb[var3] = (float)(Math.random() * (double)var2);
                fm.field_b[var3] = (float)(2.0 * (Math.random() * 3.141592653589793));
                var2 = var2 / 2.0f;
            }
        }
        var2 = 0.0f;
        if (!param1) {
            return 1.0860400199890137f;
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -9) {
            var2 = (float)((double)var2 + (double)el.field_Nb[var5] * Math.sin((double)((float)(1 << var5) * param0 + fm.field_b[var5])));
            var5++;
        }
        return var2;
    }

    final static byte[] a(int param0, String param1) {
        if (param0 > -73) {
            field_o = 126L;
        }
        return bo.field_e.a("", param1, true);
    }

    private vj() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        ei.a(lk.q(13), 60);
        if (param0 != 1) {
            Object var2 = null;
            byte[] discarded$0 = vj.a(false, (byte) 43, (Object) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 > 85) {
          L0: {
            if (-1 == param0) {
              L1: {
                if (ik.field_e != param2) {
                  hg.field_c = true;
                  ik.field_e = param2;
                  nl.a(107, param1);
                  if (-2 == (param0 ^ -1)) {
                    if (param2 != me.field_b) {
                      me.field_b = param2;
                      hg.field_c = true;
                      nl.a(102, param1);
                      break L1;
                    } else {
                      if (param0 != 2) {
                        break L0;
                      } else {
                        if (mc.field_f == param2) {
                          break L0;
                        } else {
                          hg.field_c = true;
                          mc.field_f = param2;
                          nl.a(108, param1);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param0 != 2) {
                      break L0;
                    } else {
                      if (mc.field_f == param2) {
                        break L0;
                      } else {
                        hg.field_c = true;
                        mc.field_f = param2;
                        nl.a(108, param1);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (-2 == (param0 ^ -1)) {
                    if (param2 != me.field_b) {
                      me.field_b = param2;
                      hg.field_c = true;
                      nl.a(102, param1);
                      break L1;
                    } else {
                      if (param0 != 2) {
                        break L0;
                      } else {
                        if (mc.field_f == param2) {
                          break L0;
                        } else {
                          hg.field_c = true;
                          mc.field_f = param2;
                          nl.a(108, param1);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param0 != 2) {
                      break L0;
                    } else {
                      if (mc.field_f == param2) {
                        break L0;
                      } else {
                        hg.field_c = true;
                        mc.field_f = param2;
                        nl.a(108, param1);
                        break L0;
                      }
                    }
                  }
                }
              }
              if (param0 != 2) {
                break L0;
              } else {
                if (mc.field_f == param2) {
                  break L0;
                } else {
                  hg.field_c = true;
                  mc.field_f = param2;
                  nl.a(108, param1);
                  break L0;
                }
              }
            } else {
              if (-2 != param0) {
                if (param0 == 2) {
                  if (mc.field_f == param2) {
                    break L0;
                  } else {
                    hg.field_c = true;
                    mc.field_f = param2;
                    nl.a(108, param1);
                    break L0;
                  }
                } else {
                  if (param0 != 2) {
                    break L0;
                  } else {
                    if (mc.field_f == param2) {
                      break L0;
                    } else {
                      hg.field_c = true;
                      mc.field_f = param2;
                      nl.a(108, param1);
                      break L0;
                    }
                  }
                }
              } else {
                if (param0 != 2) {
                  break L0;
                } else {
                  if (mc.field_f == param2) {
                    break L0;
                  } else {
                    hg.field_c = true;
                    mc.field_f = param2;
                    nl.a(108, param1);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Enter name of player to add to list";
    }
}
