/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    float field_f;
    static tf field_b;
    private int field_i;
    private int field_j;
    private int field_d;
    String field_e;
    static boolean field_h;
    private ik[] field_a;
    static String field_c;
    static String[] field_k;
    static String field_g;

    private final void a(byte param0, ik param1, int param2) {
        float var4 = (float)(((re) this).field_j + 1) + (float)param2 / 100.0f;
        int var5 = 2 / ((-35 - param0) / 35);
        ((re) this).field_f = var4 * (float)((re) this).field_d / (float)(((re) this).field_i - -1);
        if (-1 == (param2 ^ -1)) {
            ((re) this).field_e = param1.field_c;
        } else {
            ((re) this).field_e = param1.field_e + " - " + param2 + "%";
            return;
        }
    }

    final static void a(boolean param0, oh param1) {
        kp.field_v = param1;
        if (param0) {
            return;
        }
        Object var3 = null;
        byte[] discarded$0 = re.a(true, (byte[]) null);
    }

    final static im a(String param0, int param1) {
        Object var3 = null;
        im var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        if (vm.field_b != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              if (param1 == -1) {
                var12 = (CharSequence) (Object) param0;
                var8 = dh.a(var12, (byte) 64);
                if (var8 != null) {
                  var3_ref = (im) (Object) vm.field_b.a(-11434, (long)var8.hashCode());
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_Fb;
                      var9 = dh.a(var13, (byte) 41);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (im) (Object) vm.field_b.b((byte) 47);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                re.a(true);
                var10 = (CharSequence) (Object) param0;
                var6 = dh.a(var10, (byte) 64);
                if (var6 != null) {
                  var3_ref = (im) (Object) vm.field_b.a(-11434, (long)var6.hashCode());
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_Fb;
                      var7 = dh.a(var11, (byte) 41);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (im) (Object) vm.field_b.b((byte) 47);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        if (param0 > 105) {
          if (10 <= el.field_b) {
            if ((hf.field_q ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          re.a(true);
          if (10 <= el.field_b) {
            if ((hf.field_q ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void b(int param0) {
        fa.field_b = null;
        if (param0 != 140) {
            return;
        }
        e.field_b = null;
        wo.field_f = null;
        ge.field_c = null;
        gf.field_g = null;
        fl.field_g = null;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          re.a((byte) -52);
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param1.length;
        var3 = new byte[var2];
        qb.a(param1, 0, var3, 0, var2);
        if (!param0) {
          return null;
        } else {
          return var3;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        var1 = (Object) (Object) mc.field_r;
        synchronized (var1) {
          L0: {
            L1: {
              qn.field_p = ln.field_p;
              ia.field_i = ia.field_i + 1;
              if (0 <= ol.field_q) {
                L2: while (true) {
                  if (ol.field_q == wm.field_c) {
                    break L1;
                  } else {
                    var2 = qp.field_Q[wm.field_c];
                    wm.field_c = 127 & 1 + wm.field_c;
                    if (var2 >= 0) {
                      bc.field_m[var2] = true;
                      continue L2;
                    } else {
                      bc.field_m[var2 ^ -1] = false;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if (-113 >= (var2 ^ -1)) {
                    ol.field_q = wm.field_c;
                    break L1;
                  } else {
                    bc.field_m[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            var2 = 37 % ((param0 - -53) / 47);
            ln.field_p = jd.field_s;
            break L0;
          }
        }
    }

    final boolean c(int param0) {
        ik var2 = null;
        int var3 = 0;
        ik var4 = null;
        ik var5 = null;
        ik var6 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 4567) {
          ((re) this).field_f = 0.011294713243842125f;
          L0: while (true) {
            if (((re) this).field_i > ((re) this).field_j) {
              var6 = ((re) this).field_a[((re) this).field_j];
              var4 = var6;
              var2 = var4;
              if (var6.field_d.b(-3)) {
                L1: {
                  if (0 > var6.field_b) {
                    break L1;
                  } else {
                    if (var6.field_d.a(var6.field_b, false)) {
                      break L1;
                    } else {
                      this.a((byte) -96, var2, var6.field_d.a(var6.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var6.field_f == null) {
                    break L2;
                  } else {
                    if (var6.field_d.a(var6.field_f, -1)) {
                      break L2;
                    } else {
                      this.a((byte) -93, var2, var6.field_d.c(108, var6.field_f));
                      return false;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (null != var6.field_f) {
                      break L3;
                    } else {
                      if (var6.field_e == null) {
                        break L3;
                      } else {
                        if (var6.field_d.a((byte) 92)) {
                          break L3;
                        } else {
                          this.a((byte) -102, var2, var6.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((re) this).field_j = ((re) this).field_j + 1;
                continue L0;
              } else {
                this.a((byte) 58, var6, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((re) this).field_i > ((re) this).field_j) {
              var5 = ((re) this).field_a[((re) this).field_j];
              var4 = var5;
              var2 = var4;
              if (var5.field_d.b(-3)) {
                L5: {
                  if (0 > var5.field_b) {
                    break L5;
                  } else {
                    if (var5.field_d.a(var5.field_b, false)) {
                      break L5;
                    } else {
                      this.a((byte) -96, var2, var5.field_d.a(var5.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L6: {
                  if (var5.field_f == null) {
                    break L6;
                  } else {
                    if (var5.field_d.a(var5.field_f, -1)) {
                      break L6;
                    } else {
                      this.a((byte) -93, var2, var5.field_d.c(108, var5.field_f));
                      return false;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_b ^ -1)) {
                    break L7;
                  } else {
                    if (null != var5.field_f) {
                      break L7;
                    } else {
                      if (var5.field_e == null) {
                        break L7;
                      } else {
                        if (var5.field_d.a((byte) 92)) {
                          break L7;
                        } else {
                          this.a((byte) -102, var2, var5.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((re) this).field_j = ((re) this).field_j + 1;
                continue L4;
              } else {
                this.a((byte) 58, var5, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    private re() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_b = new tf(540, 140);
        field_c = "New Game";
        field_g = "Offline";
        field_k = new String[]{"All scores", "My scores", "Best each"};
    }
}
