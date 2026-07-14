/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends ida {
    static cw field_y;
    static String field_w;
    static int field_v;
    private int field_C;
    static String[] field_A;
    static be[] field_x;
    private cq field_u;
    private int field_z;
    private boolean field_B;
    private int field_t;

    private final void a(int param0, aga param1, int param2, boolean param3, int param4) {
        ad var6 = null;
        var6 = ((qf) this).field_s.b(param1, -23990);
        var6.field_s.field_s = param2;
        this.a(param2, param4, 27230);
        ((qf) this).field_n = -50;
        if (param0 != 0) {
          boolean discarded$2 = ((qf) this).c((byte) -81);
          this.a(param1, param3, -3670);
          return;
        } else {
          this.a(param1, param3, -3670);
          return;
        }
    }

    private final void a(aga param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = 10;
          if ((param0.field_y ^ -1) == -18) {
            var4 = 15;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (28 != param0.field_y) {
            break L1;
          } else {
            var4 = 20;
            break L1;
          }
        }
        ((qf) this).field_q = wka.a(57, ((qf) this).field_C, var4, ((qf) this).field_r);
        ((qf) this).field_z = ((qf) this).field_q;
        if (param2 == -3670) {
          if (param1) {
            L2: {
              ((qf) this).field_q = ((qf) this).field_q + wka.a(57, ((qf) this).field_C, var4, 1);
              if (((qf) this).field_z == 0) {
                ((qf) this).field_z = 10;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              if (((qf) this).field_z == 0) {
                ((qf) this).field_z = 10;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          field_A = null;
          if (!param1) {
            L4: {
              if (((qf) this).field_z == 0) {
                ((qf) this).field_z = 10;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            L5: {
              ((qf) this).field_q = ((qf) this).field_q + wka.a(57, ((qf) this).field_C, var4, 1);
              if (((qf) this).field_z == 0) {
                ((qf) this).field_z = 10;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final boolean c(byte param0) {
        ad var2 = null;
        int var3 = 0;
        je var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ad var7 = null;
        var6 = BachelorFridge.field_y;
        var7 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
        var3 = -27 % ((71 - param0) / 47);
        ((qf) this).field_n = ((qf) this).field_n + 1;
        if (((qf) this).field_n + 1 < 0) {
          return false;
        } else {
          L0: {
            if (null != ((qf) this).field_u) {
              break L0;
            } else {
              if ((var7.field_s.field_y ^ -1) != -33) {
                break L0;
              } else {
                var4_ref = je.a(rt.field_a[32], 256, 256);
                var4_ref.d(-1);
                ((qf) this).field_u = tw.a(var4_ref, (byte) -36);
                break L0;
              }
            }
          }
          if (0 == ((qf) this).field_n) {
            if (!((qf) this).field_B) {
              L1: {
                if (32 == var7.field_s.field_y) {
                  break L1;
                } else {
                  var7.b(-1, ((qf) this).field_t);
                  break L1;
                }
              }
              ((qf) this).field_s.field_s.a(var7, 107);
              if (((qf) this).field_q >= ((qf) this).field_n) {
                if (((qf) this).field_z >= ((qf) this).field_n) {
                  var4 = ((qf) this).field_n + -((qf) this).field_m;
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var2.field_o = (((qf) this).field_l << -781104688) * var4 / ((qf) this).field_z;
                  var2.field_r = var4 * (((qf) this).field_j << -82866704) / ((qf) this).field_z;
                  return false;
                } else {
                  L2: {
                    var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                    var4 = ((qf) this).field_q - ((qf) this).field_z >> 1995928513;
                    var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                    if (0 <= var5) {
                      break L2;
                    } else {
                      var5 = -var5;
                      break L2;
                    }
                  }
                  var5 = ((qf) this).field_q + (-var4 - var5);
                  var2.field_r = (((qf) this).field_j << -1546837168) * var5 / ((qf) this).field_z;
                  var2.field_o = (((qf) this).field_l << -692659344) * var5 / ((qf) this).field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            } else {
              ((qf) this).field_s.field_s.a(var7, 107);
              if (((qf) this).field_q >= ((qf) this).field_n) {
                if (((qf) this).field_z >= ((qf) this).field_n) {
                  var4 = ((qf) this).field_n + -((qf) this).field_m;
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var2.field_o = (((qf) this).field_l << -781104688) * var4 / ((qf) this).field_z;
                  var2.field_r = var4 * (((qf) this).field_j << -82866704) / ((qf) this).field_z;
                  return false;
                } else {
                  L3: {
                    var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                    var4 = ((qf) this).field_q - ((qf) this).field_z >> 1995928513;
                    var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                    if (0 <= var5) {
                      break L3;
                    } else {
                      var5 = -var5;
                      break L3;
                    }
                  }
                  var5 = ((qf) this).field_q + (-var4 - var5);
                  var2.field_r = (((qf) this).field_j << -1546837168) * var5 / ((qf) this).field_z;
                  var2.field_o = (((qf) this).field_l << -692659344) * var5 / ((qf) this).field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            }
          } else {
            ((qf) this).field_s.field_s.a(var7, 107);
            if (((qf) this).field_q >= ((qf) this).field_n) {
              if (((qf) this).field_z >= ((qf) this).field_n) {
                var4 = ((qf) this).field_n + -((qf) this).field_m;
                var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                var2.field_o = (((qf) this).field_l << -781104688) * var4 / ((qf) this).field_z;
                var2.field_r = var4 * (((qf) this).field_j << -82866704) / ((qf) this).field_z;
                return false;
              } else {
                L4: {
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var4 = ((qf) this).field_q - ((qf) this).field_z >> 1995928513;
                  var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                  if (0 <= var5) {
                    break L4;
                  } else {
                    var5 = -var5;
                    break L4;
                  }
                }
                var5 = ((qf) this).field_q + (-var4 - var5);
                var2.field_r = (((qf) this).field_j << -1546837168) * var5 / ((qf) this).field_z;
                var2.field_o = (((qf) this).field_l << -692659344) * var5 / ((qf) this).field_z;
                return false;
              }
            } else {
              this.c(true);
              return true;
            }
          }
        }
    }

    private final void c(boolean param0) {
        ad var2 = null;
        ad var3 = null;
        L0: {
          var3 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
          var2 = var3;
          var3.b(false);
          var3.field_r = 0;
          var3.field_o = 0;
          var3.field_k = 0;
          if (null != ((qf) this).field_u) {
            id.a(72, ((qf) this).field_u);
            break L0;
          } else {
            break L0;
          }
        }
        if (123 == ((qf) this).field_C) {
          ((qf) this).field_s.b(var3, (ad) null, param0);
          if (param0) {
            var3.field_s.field_s = ((qf) this).field_k;
            if (hl.a((byte) -124, ((qf) this).field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y == 31) {
                    return;
                  } else {
                    ((qf) this).field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((qf) this).field_B = false;
            var3.field_s.field_s = ((qf) this).field_k;
            if (hl.a((byte) -124, ((qf) this).field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y == 31) {
                    return;
                  } else {
                    ((qf) this).field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((qf) this).field_s.a(-119, ((qf) this).field_r, var3, ((qf) this).field_k);
          if (!param0) {
            ((qf) this).field_B = false;
            var3.field_s.field_s = ((qf) this).field_k;
            if (hl.a((byte) -124, ((qf) this).field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y != 31) {
                    ((qf) this).field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var3.field_s.field_s = ((qf) this).field_k;
            if (hl.a((byte) -124, ((qf) this).field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y != 31) {
                    ((qf) this).field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    qf(gj param0, df param1) {
        this(param0, param1.field_l, param1.field_k, param1.field_p, param1.field_n, param1.field_t);
        ad var3 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
        var3.field_s.d(param1.field_k, (byte) -115);
    }

    qf(gj param0, nq param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param3, param4);
        aga var10 = ((qf) this).field_p.a(114, ((qf) this).field_s.field_h);
        ad var8 = ((qf) this).field_s.b(var10, -23990);
        ((qf) this).field_C = param2;
        if (((qf) this).field_C != 0) {
            if (!hl.a((byte) -49, ((qf) this).field_C)) {
                ((qf) this).field_B = true;
                ((qf) this).field_t = 8;
                ((qf) this).a(27799, (at) (Object) new taa(((qf) this).field_s, var8));
                this.a(0, var10, ((qf) this).field_k, param5, ((qf) this).field_r);
            }
            ((qf) this).field_t = 3;
            ((qf) this).a(27799, (at) (Object) new taa(((qf) this).field_s, var8));
            this.a(0, var10, ((qf) this).field_k, param5, ((qf) this).field_r);
        }
        ((qf) this).field_t = 1;
        ((qf) this).a(27799, (at) (Object) new taa(((qf) this).field_s, var8));
        this.a(0, var10, ((qf) this).field_k, param5, ((qf) this).field_r);
    }

    public static void d(int param0) {
        field_A = null;
        field_w = null;
        field_x = null;
        field_y = null;
        if (param0 != 28766) {
            qf.e(-13);
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        kr var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (qg.field_b.field_z == null) {
          return;
        } else {
          var1 = 0;
          if (param0 == 20434) {
            var2 = (kr) (Object) qg.field_b.field_z.b((byte) 90);
            L0: while (true) {
              if (var2 == null) {
                return;
              } else {
                L1: {
                  if (null == qg.field_b.field_z) {
                    break L1;
                  } else {
                    var2.field_kb = var1 % 4 * 39;
                    var2.field_rb = var1 / 4 * 39;
                    break L1;
                  }
                }
                var2 = (kr) (Object) qg.field_b.field_z.c(param0 ^ 20434);
                var1++;
                continue L0;
              }
            }
          } else {
            field_x = null;
            var2 = (kr) (Object) qg.field_b.field_z.b((byte) 90);
            L2: while (true) {
              if (var2 == null) {
                return;
              } else {
                L3: {
                  if (null == qg.field_b.field_z) {
                    break L3;
                  } else {
                    var2.field_kb = var1 % 4 * 39;
                    var2.field_rb = var1 / 4 * 39;
                    break L3;
                  }
                }
                var2 = (kr) (Object) qg.field_b.field_z.c(param0 ^ 20434);
                var1++;
                continue L2;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Your email address is used to identify this account";
        field_A = new String[]{"Walk", "Jump", "Sprint"};
        field_x = new be[10];
    }
}
